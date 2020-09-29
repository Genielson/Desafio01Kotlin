class ProfessorTitular( nome:String,
                        sobrenome:String,
                        tempoCasa: Int,
                        codigoProfessor:Int
                        ) : Professor(nome,sobrenome,tempoCasa,codigoProfessor) {

    private var especialidade:String = ""

    constructor(nome: String,sobrenome:String,
                tempoCasa:Int,
                codigoProfessor: Int,
                especialidade:String):this(nome,sobrenome,tempoCasa,codigoProfessor){

        this.especialidade = especialidade

    }




}