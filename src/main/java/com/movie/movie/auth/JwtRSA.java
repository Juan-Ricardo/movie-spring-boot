package com.movie.movie.auth;

public class JwtRSA {
    public static final String KEY_PRIVATE="-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEpQIBAAKCAQEAwqdGFSLvKFGzI/vSPLo/jXmtBFpPejI/8WIGNHc7FPDoriNL\n" +
            "I+CJJM/yOg8Yp3dg4cOOd8G+wtuhtwJRW3RPc9f6rPcQoZ6zPdpzB7kiArjgO4KE\n" +
            "CQhUQ1Wn+VeNgulbXVKXzZisy/e02wpLMlIkvP1DgtI1sQDbHIrduf65MA6g/mH8\n" +
            "kYBg2pVl5/drhFH3P/Iqg+yU+ljQeNTlhBUB4a2Un5me9Z9ct/j6K06SbOknu1mc\n" +
            "1zeEpSoK8bTWFpVUgK4Chkbk6vHI97RmniawMF4G9kGEdF9w/MAxAjvjDFXWDtdO\n" +
            "lX2unhvq7i+LeB8LG+RUFHc2dpnBspIU7z3JWQIDAQABAoIBAQCWkJboIIaHVHLR\n" +
            "4aakbJheEYEgPc7+QUIur1kHWjasIxCIKiqkDLlobST7fdPfLbsVxpM71PR+ey7i\n" +
            "hXty10vh2m0/PzhxG3Wf4Yparfw9yM1BmtoQto2fK/FrMCr42RJf5FQhpvf6KZeO\n" +
            "Wq8BtIJQYULIPVtkl7nkoRGTHhIWtc6XkTPg10mU22GeGf5b3GW3ak+s/9tVFODg\n" +
            "P1lKQFxF9ogaGTYZASaRRHh638jJ/RthGLz+l+9wEJeFOoZlqoFcUQcK8lD6E5i5\n" +
            "9OPdLViFZptTxs9S+M5K0Ma7irIa4D0ERfDKBexOo3X+pR3eiQXHrJ+zMg3UxgzD\n" +
            "Qv30YQQFAoGBAPmiLdjw8gtzvIrlw5pBqQ6Tr+WIkJM7Pum+k7/JzEU7asIwXGws\n" +
            "Dd9u6YN/+bpFTIY/MUztwKNnRPSM59ryAua68haZUQDKob4nTR5aAi9Eo7HDd9sB\n" +
            "ZsX6X3gYncklmruLb6Y4giKW5chrz+kavIoqJ/WfegMbi9lvovnzs9vXAoGBAMee\n" +
            "Izl1SBnchxAtfOyOcQHnVri2GIrHW1wUOB7LyL80ACQyLYb4S3aOggY0MLkt2/YJ\n" +
            "RjZ5MWbVrDTPk+xCcC8/ySVPGbyIPSlIdEL/qdcn8D41dWB1GMUCNfijEmZKNETY\n" +
            "TQDf91GGq3Vapk/A5AJwJo23QvTKwYsczXnvnF5PAoGAFskk4i5sCXuQ9CSwy/2+\n" +
            "TqRQY+UpPSclQPSyS8lBqfgYcI01gnIq+gAHtIcT5lq493ABMgJpmQCuHJxX9XYt\n" +
            "qZ3axxFLgYT9anvv4BtbI7FiN7Gd2RGxrdSCrlWg4WFbVE8P694wkrOvWbHtklts\n" +
            "Zjge2Z6q5mm3RCuadrI18pUCgYEAxDi423RkSbeztL1iPY7Pm1Vys+OcQF8zeVIO\n" +
            "0Ib1cK6HLQ1+H1zXoVT4j2yiMIXZ4QLA2C9N1o5X1xntiKLOcEO9UEVvQRqTNI+a\n" +
            "aXmz1GHYEO6v0P+KN66yqxRxs8dhlgMhvqhqDuPYi2VucptkBtmDrG7nDIZ6tmq7\n" +
            "uQ9GoJUCgYEAiCIVAjC93hR9o518WGqudUIq0mEOsckCHohklNZ86280+lMAvxf8\n" +
            "sCNYasirvaanThx5hdEQF1H70yL4HNUPQbYIwtmJn3DuFLhvuyOXRXqGujYy7oKg\n" +
            "69JKGakT4byA0D3WbdK07/whFILdvjMMd325EmXKBDcULZpQ5wD5L6k=\n" +
            "-----END RSA PRIVATE KEY-----";
    public static final String KEY_PUBLIC="-----BEGIN PUBLIC KEY-----\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAwqdGFSLvKFGzI/vSPLo/\n" +
            "jXmtBFpPejI/8WIGNHc7FPDoriNLI+CJJM/yOg8Yp3dg4cOOd8G+wtuhtwJRW3RP\n" +
            "c9f6rPcQoZ6zPdpzB7kiArjgO4KECQhUQ1Wn+VeNgulbXVKXzZisy/e02wpLMlIk\n" +
            "vP1DgtI1sQDbHIrduf65MA6g/mH8kYBg2pVl5/drhFH3P/Iqg+yU+ljQeNTlhBUB\n" +
            "4a2Un5me9Z9ct/j6K06SbOknu1mc1zeEpSoK8bTWFpVUgK4Chkbk6vHI97Rmniaw\n" +
            "MF4G9kGEdF9w/MAxAjvjDFXWDtdOlX2unhvq7i+LeB8LG+RUFHc2dpnBspIU7z3J\n" +
            "WQIDAQAB\n" +
            "-----END PUBLIC KEY-----";
}
