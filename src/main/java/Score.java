import lombok.Data;

import java.io.Serializable;

@Data
public class Score implements Serializable {

    private static final long serialVersionUID = 1L;
    private String FID;
    private String SERIAL_NUM;
    private String MEMBER_CODE;
    private String ACCT_TYPE;
    private String OPENED_DT;
    private String ACCT_RTE_CDE;
    private String REPORTING_DT;
    private String CREDIT_LIMIT;
    @Override
    public String toString()
    {
        return "id=" + FID + ", Serial=" + SERIAL_NUM;
    }


}
