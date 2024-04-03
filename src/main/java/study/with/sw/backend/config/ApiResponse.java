package study.with.sw.backend.config;

import jdk.jfr.Description;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@Builder // 택배 포장을 한다
@Description("API 응답 공통 모듈")
public class ApiResponse {
    private int status; // 응답 상태(배송상태)
    private  String message; //  응답 메시지(배송 메시지)
    private Object data; // Object: 어떠힌 것이든 될 수 있을때  / 실제 들어가는 데이터들 (배송물)

    @Description("API 성공 응답(데이터 필요없음)")
    public  static ApiResponse ok(){
        return ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .message(HttpStatus.OK.getReasonPhrase())
                .build();
    }

    @Description("API 성공 응답(데이터가 있음)")
    public  static ApiResponse success(Object data){
        return ApiResponse.builder()
                .status(HttpStatus.OK.value())
                .message(HttpStatus.OK.getReasonPhrase())
                .data(data)
                .build();
    }

    @Description("API 실패 응답(데이터가 필요없음)")
    public  static ApiResponse error(HttpStatus status, String message){
        return ApiResponse.builder()
                .status(status.value())
                .message(message)
                .build();
    }
}
