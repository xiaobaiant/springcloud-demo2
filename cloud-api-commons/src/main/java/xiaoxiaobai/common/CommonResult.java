package xiaoxiaobai.common;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: hys
 * @Date: 2023/05/16/19:16
 * @Description:
 */
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult()
    {
    }

    public CommonResult(Integer code, String message, T data)
    {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public CommonResult( Integer code,String message) {
        this( code, message,null);
    }

    public CommonResult(T data) {
        this(200, "操作成功", data);
    }

    //setter--getter
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
