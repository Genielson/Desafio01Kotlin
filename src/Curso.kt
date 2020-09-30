data class Curso( var nomeCurso:String,
             var numeroCurso:Int,
             var qtdMaxAlunos:Int
            ) {

     lateinit var professorAdjunto: ProfessorAdjunto
     var listaAlunos: MutableList<Aluno> = mutableListOf()
     lateinit var professorTitular: ProfessorTitular

    constructor(nomeCurso:String,
                numeroCurso:Int,
                qtdMaxAlunos:Int,
                professorAdjunto: ProfessorAdjunto,
                professorTitular: ProfessorTitular,
                listaAlunos: MutableList<Aluno>
                ):this(nomeCurso,numeroCurso,qtdMaxAlunos){

        this.professorAdjunto = professorAdjunto
        this.professorTitular = professorTitular
        this.listaAlunos = listaAlunos

    }

    /*
    constructor(numeroCurso: Int,professorTitular: ProfessorTitular,professorAdjunto: ProfessorAdjunto){

        this.numeroCurso = numeroCurso
        this.professorTitular = professorTitular
        this.professorAdjunto = professorAdjunto

    }


     */


    fun adicionarUmAluno(aluno: Aluno):Boolean{

        if(this.listaAlunos.size <= qtdMaxAlunos) {
            this.listaAlunos.add(aluno)
            println("ALUNO ADICIONADO COM SUCESSO! ")
            return true
        }else{
            println("TURMA CHEIA, TENTE OUTRA")
            return false
        }

    }

    fun excluirAluno(aluno: Aluno){

        try {
            this.listaAlunos.remove(aluno)
        }catch (ex:Exception){

            println(ex.message)

        }

    }



}