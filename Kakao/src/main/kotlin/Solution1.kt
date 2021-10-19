class Solution1 {
    var dotFlag = false
    fun solution(new_id: String): String {
        var answer: String = ""
        answer = step1(new_id)
        answer = step2(answer)
        answer = step3(answer)
        answer = step4(answer)
        answer = step5(answer)
        answer = step6(answer)
        answer = step7(answer)
        answer = step4(answer)
        return answer
    }

    fun step1(id : String) : String{
        var result = ""
        result = id.toLowerCase()
        println("step 1 : " + result)
        return result
    }
    fun step2(id : String) : String{
        var result = ""
        // _ - .
        for(c in id){
            if((c in '0'..'9' || c in 'a'..'z' || c == '_' || c == '-' || c == '.')){
                result += c
            }
        }
        println("step 2 : " + result)
        return result
    }
    fun step3(id : String) : String{
        var result = id
        while(result.contains("..")){
            result = result.replace("..", ".")
        }
        println("step 3 : " + result)
        return result
    }
    fun step4(id : String) : String{
        var result = id
        result = result.removePrefix(".")

        result = result.removeSuffix(".")

        println("step 4 : " + result)
        return result
    }
    fun step5(id : String) : String{
        var result = id
        if(id == ""){
            result = "a"
        }
        println("step 5 : " + result)
        return result
    }
    fun step6(id : String) : String{
        var result = id
        if(id.length >= 16){
            result = id.substring(0, 15)
        }
        println("step 6 : " + result)
        return result
    }
    fun step7(id : String) : String{
        var result = id
        while(result.length < 3){
            result += result[id.length-1]
            println("length : " + result.length)
            println("result : " + result)
        }
        println("step 7 : " + result)
        return result
    }
}