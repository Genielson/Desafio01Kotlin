import java.time.LocalDateTime

 class DigitalHouseManager
{
     var listaAlunos:MutableList<Aluno> = mutableListOf()
     var listaProfessores:MutableList<Professor> = mutableListOf()
     var listaMatriculas:MutableList<Matricula> = mutableListOf()
     var listaCursos:MutableList<Curso> = mutableListOf()

    constructor( listaAlunos:MutableList<Aluno>,
                 listaProfessores:MutableList<Professor>,
                 listaMatriculas:MutableList<Matricula>,
                 listaCursos:MutableList<Curso>){

        this.listaAlunos = listaAlunos
        this.listaProfessores =  listaProfessores
        this.listaMatriculas = listaMatriculas
        this.listaCursos = listaCursos


    }

    constructor()


    fun registrarCurso(nome:String,codigo:Int,quantidadeMaximaAlunos:Int){

        try{

            this.listaCursos.add(Curso(nome,codigo,quantidadeMaximaAlunos))
            println("CURSO REGISTRADO COM SUCESSO! ")

        }catch (ex:Exception){

            println(ex.message)

        }
    }

    fun excluirCurso(codigoCurso:Int){


          try {

              this.listaCursos.forEach {

                  if (it.numeroCurso == codigoCurso) {

                          this.listaCursos.remove(this.listaCursos[codigoCurso])
                          println("CURSO REMOVIDO COM SUCESSO! ")

                  }
              }

          }catch (ex:UninitializedPropertyAccessException){

              throw UninitializedPropertyAccessException("NENHUM CURSO FOI CADASTRADO")

          }


    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String,codigoProfessor: Int, quantidadeDeHoras: Int){

        try {
            this.listaProfessores.add(ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras))
        }catch (ex:Exception){
            throw Exception("Não foi possivel adicionar o professor adjunto ")
        }

    }

    fun registrarProfessorTitular(nome: String, sobrenome: String ,codigoProfessor: Int, especialidade: String){

        try {
            this.listaProfessores.add(ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade))
        }catch (ex:Exception){
            throw Exception(" Não foi possivel adicionar o professor titular ")
        }
    }

    fun excluirProfessor(codigoProfessor: Int){

        try {

            this.listaProfessores.forEach {

                if (it.codigoProfessor == codigoProfessor) {
                    listaProfessores.remove(listaProfessores[codigoProfessor])
                    println("PROFESSOR REMOVIDO COM SUCESSO! ")
                }
            }

        }catch (ex:IndexOutOfBoundsException){
            throw IndexOutOfBoundsException("ESSE INDICE NAO EXISTE, TENTE OUTRO")
        }catch (ex:UninitializedPropertyAccessException){
            throw UninitializedPropertyAccessException("NAO FOI REGISTRADO NENHUM PROFESSOR")
        }

    }

    fun matricularAluno(nome: String , sobrenome: String , codigoAluno: Int){

        try {
            this.listaAlunos.add(Aluno(nome, sobrenome, codigoAluno))
        }catch (ex:Exception){
            throw Exception("NÃO FOI POSSIVEL MATRICULAR O ALUNO")
        }

    }

    fun matricularAlunoCurso(codigoAluno: Int,  codigoCurso: Int){

        var indiceNaoEncontrado = -1

        if(buscarAluno(codigoAluno) != indiceNaoEncontrado){
            if(buscarCurso(codigoCurso) != indiceNaoEncontrado){

                   var indiceEncontradoAluno = buscarAluno(codigoAluno)
                   var indiceEncontradoCurso = buscarCurso(codigoCurso)

                    this.listaMatriculas.add(Matricula(this.listaAlunos[indiceEncontradoAluno],
                            this.listaCursos[indiceEncontradoCurso], LocalDateTime.now()))

                    println("ALUNO MATRICULADO NO CURSO COM SUCESSO! ")

            }else{
                println("CURSO NAO ENCONTRADO! ")
            }
        }else{
            println("ALUNO NÃO ENCONTRADO!")
        }

    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int,codigoProfessorAdjunto: Int){

        if(buscarCurso(codigoCurso) != -1){
            if(buscarProfessor(codigoProfessorTitular) != 1 && buscarProfessor(codigoProfessorAdjunto) != 1){

                var indiceProfessorTitular = buscarProfessor(codigoProfessorTitular)
                var indiceProfessorAdjunto = buscarProfessor(codigoProfessorAdjunto)
                var indiceCurso = buscarCurso(codigoCurso)

                this.listaCursos[indiceCurso].professorTitular = this.listaProfessores[indiceProfessorTitular] as ProfessorTitular
                this.listaCursos[indiceCurso].professorAdjunto = this.listaProfessores[indiceProfessorAdjunto] as ProfessorAdjunto

                println("PROFESSORES ALOCADOS COM SUCESSO! ")

            }else{
                println("PROFESSOR NAO ENCONTRADO")
            }
        }else{
            println("CURSO NAO ENCONTRADO! ")
        }

    }

    fun buscarProfessor(codigoProfessor: Int):Int{

        for(i in 0.. (this.listaProfessores.size - 1)){
            if(this.listaProfessores[i].codigoProfessor == codigoProfessor){
                return i
            }
        }

        return -1

    }

    fun buscarCurso(codigoCurso: Int):Int{

        for(i in 0.. (this.listaCursos.size - 1)){
            if(this.listaCursos[i].numeroCurso == codigoCurso){
                return i
            }
        }

        return -1

    }

    fun buscarAluno(codigoAluno: Int):Int{

        for(i in 0.. (this.listaAlunos.size - 1)){
            if(this.listaAlunos[i].codigo == codigoAluno){
                return i
            }
        }

        return -1
    }








}