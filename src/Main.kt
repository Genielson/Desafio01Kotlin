fun main(){

    var digitalHouse = DigitalHouseManager()

    digitalHouse.registrarCurso("Sistemas Operacionais", 1, 50)
    digitalHouse.registrarCurso("Estrutura de Dados", 2, 60)
    digitalHouse.registrarCurso("Calculo I", 3, 70)
    digitalHouse.registrarCurso("Calculo II", 4, 40)
    digitalHouse.registrarCurso("Calculo III", 5, 60)
    digitalHouse.registrarCurso("Engenharia de Software", 5, 100)


    digitalHouse.registrarProfessorTitular("Genielson", "Leal", 1,"Engenharia de Software")
    digitalHouse.registrarProfessorTitular("Roberto", "Sousa", 2,"Sistemas Operacionais")
    digitalHouse.registrarProfessorTitular("Pedro", "Henrique", 3,"Estrutura de Dados")
    digitalHouse.registrarProfessorTitular("Gabriel", "Barbosa", 4,"Android")

    digitalHouse.registrarProfessorAdjunto("Lucas", "Gabriel", 5,25)
    digitalHouse.registrarProfessorAdjunto("Felipe", "Medeiros", 6,40)
    digitalHouse.registrarProfessorAdjunto("Larissa", "Silva", 7,60)
    digitalHouse.registrarProfessorAdjunto("Monica", "Alencar", 8,80)

    digitalHouse.matricularAluno("Linus", "Torvalds",1)
    digitalHouse.matricularAluno("Bill", "Gates", 2)
    digitalHouse.matricularAluno("Steve", "Jobs", 3)
    digitalHouse.matricularAluno("Mark", "Zuckerberg", 4)


    digitalHouse.matricularAlunoCurso(1,3)
    digitalHouse.matricularAlunoCurso(2,1)
    digitalHouse.matricularAlunoCurso(4,3)
    digitalHouse.matricularAlunoCurso(5,5)

    digitalHouse.excluirProfessor(1)
    digitalHouse.excluirProfessor(2)
    digitalHouse.excluirProfessor(3)

    digitalHouse.alocarProfessores(1,2,3)
    digitalHouse.alocarProfessores(2,2,2)
    digitalHouse.alocarProfessores(3,3,3)

    println(digitalHouse.listaCursos)
    println()
    println(digitalHouse.listaProfessores)
    println()
    println(digitalHouse.listaMatriculas)

    
}