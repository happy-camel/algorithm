class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0, 0};
//         int temp = 0;

//         //분모, 분자 sort
//         if(denom1 >= denom2){
//         } else{
//             temp = denom1;
//             denom1 = denom2;
//             denom2 = temp;
            
//             temp = numer1;
//             numer1 = numer2;
//             numer2 = temp;
//         }
        
//         int LCM = denom1;
//         int gcd = 1;
        
//         //유클리드호제법으로 최대공약수, 최소공배수 찾기
//         //나누어 떨어지면 바로 answer에 답 넣기
//         if(denom1%denom2 == 0){
//             answer[1] = denom1;
//             answer[0] = numer1 + numer2*denom1/denom2;
//             return answer;
//         }else{
//             for(int i = 1; i <= denom2; i++){
//                 if(denom1 %i == 0 && denom2 % i == 0 ){
//                     gcd = i;
//                     LCM = i * denom1 * denom2;
//                 }
//             }
//         }
//         // 분모, 분자 맞춰주고 답 출력
//         answer[1] = denom1*denom2/gcd;
//         answer[0] = numer1*denom2+numer2*denom1/gcd;
        
        // 분수의 합 계산
        answer[1] = denom1*denom2;
        answer[0] = numer1*denom2+numer2*denom1;
        
//         최대공약수 계산
        int min = Math.min(answer[0], answer[1]);
        int max = 1;
        
        for (int i = 1; i <= min; i++){
            if(answer[0] % i == 0 && answer[1] % i == 0){
                max = i;
            }
        }
        answer[0] /= max;
        answer[1] /= max;
            
        return answer;
    }
}