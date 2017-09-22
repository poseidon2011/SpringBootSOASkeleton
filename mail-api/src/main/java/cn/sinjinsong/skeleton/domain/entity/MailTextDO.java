package cn.sinjinsong.skeleton.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailTextDO implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_text.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_text.send_time
     *
     * @mbggenerated
     */
    private LocalDateTime sendTime;
    
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_text.mail_text
     *
     * @mbggenerated
     */
    private String mailText;

}