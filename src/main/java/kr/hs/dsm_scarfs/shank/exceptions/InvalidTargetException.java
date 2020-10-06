package kr.hs.dsm_scarfs.shank.exceptions;

import kr.hs.dsm_scarfs.shank.error.exception.BusinessException;
import kr.hs.dsm_scarfs.shank.error.exception.ErrorCode;

public class InvalidTargetException extends BusinessException {
    public InvalidTargetException() {
        super(ErrorCode.INVALID_TARGET);
    }
}
