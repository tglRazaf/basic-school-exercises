const user1 = {
    name: 'stephano',
    print: function () {
        console.log(this.name)
    }
}

user1.print()

class User{
    
    name
    prenom

    constructor(name, prenom){
        this.name= name
        this.prenom= prenom
    }

    printFullName(){
        console.log(this.name + ' ' + this.prenom)
    }

    formatName(){

        return this.name 
    }
}

const user2 = new User('tangala', 'mena')

user2.printFullName()

const text = 'hello  wolrd'

const formatText = (text, symbol)=>{
    const textSplited = text.split(symbol)
    let formatedText = ''
    for (let i = 0; i < textSplited.length; i++) {
        formatedText += textSplited[i].concat(' ')
    }
    return formatedText
}

console.log(formatText(text, ' '));

