class ProfessorAdjunto( nome:String,
                        sobrenome:String,
                        tempoCasa: Int,
                        codigoProfessor:Int
                         ): Professor(nome,sobrenome,tempoCasa,codigoProfessor) {

    private var qtdHorasMonitoria:Int = 0

    constructor(nome:String,sobrenome: String,tempoCasa: Int, codigoProfessor: Int,qtdHorasMonitoria:Int):this(nome,sobrenome,tempoCasa,codigoProfessor){

        this.qtdHorasMonitoria = qtdHorasMonitoria

    }

}