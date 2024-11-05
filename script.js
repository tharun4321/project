function startGame() {
    let score1 = 0;
    let score2 = 0;
    const target = 100;
    const resultDiv = document.getElementById("result");
    resultDiv.innerHTML = "";

    while (score1 < target && score2 < target) {
        let roll1 = Math.floor(Math.random() * 6) + 1;
        score1 += roll1;
        let roll2 = Math.floor(Math.random() * 6) + 1;
        score2 += roll2;

        if (score1 >= target) {
            resultDiv.innerHTML = "Player 1 wins with a score of " + score1;
            break;
        } else if (score2 >= target) {
            resultDiv.innerHTML = "Player 2 wins with a score of " + score2;
            break;
        }
    }

    document.getElementById("player1-score").innerText = score1;
    document.getElementById("player2-score").innerText = score2;
}
