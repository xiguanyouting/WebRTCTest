package com.rd.webrtctest;

import com.google.gson.annotations.SerializedName;

/**
 * @author haimian on 2021/4/22 0022
 */
public class SdpBean {
    /**
     * code : 0
     * server : vid-4416-674
     * sdp : v=0
     o=SRS/4.0.89(Leo) 54934496 2 IN IP4 0.0.0.0
     s=SRSPlaySession
     t=0 0
     a=ice-lite
     a=group:BUNDLE 0 1
     a=msid-semantic: WMS live/36147_1010
     m=audio 9 UDP/TLS/RTP/SAVPF 111
     c=IN IP4 0.0.0.0
     a=ice-ufrag:85beu046
     a=ice-pwd:7cc955e059om1u6g089764598h0e96d2
     a=fingerprint:sha-256 8F:C4:D7:B1:CA:3E:62:57:A1:14:8C:B3:5F:EA:46:2D:32:B0:BB:B7:70:45:F1:3C:0E:AA:AF:17:CD:9F:37:56
     a=setup:passive
     a=mid:0
     a=sendonly
     a=rtcp-mux
     a=rtcp-rsize
     a=rtpmap:111 opus/48000/2
     a=ssrc:44606871 cname:56l22i98346r576j
     a=ssrc:44606871 label:audio-6v46lg11
     a=candidate:0 1 udp 2130706431 47.105.215.67 40500 typ host generation 0
     m=video 9 UDP/TLS/RTP/SAVPF 125
     c=IN IP4 0.0.0.0
     a=ice-ufrag:85beu046
     a=ice-pwd:7cc955e059om1u6g089764598h0e96d2
     a=fingerprint:sha-256 8F:C4:D7:B1:CA:3E:62:57:A1:14:8C:B3:5F:EA:46:2D:32:B0:BB:B7:70:45:F1:3C:0E:AA:AF:17:CD:9F:37:56
     a=setup:passive
     a=mid:1
     a=sendonly
     a=rtcp-mux
     a=rtcp-rsize
     a=rtpmap:125 H264/90000
     a=fmtp:125 level-asymmetry-allowed=1;packetization-mode=1;profile-level-id=42e01f
     a=ssrc:44606872 cname:56l22i98346r576j
     a=ssrc:44606872 label:video-6179ht01
     a=candidate:0 1 udp 2130706431 47.105.215.67 40500 typ host generation 0
     * sessionid : 85beu046:Rlqi
     */

    private int code;
    private String server;
    private String sdp;
    private String sessionid;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getSdp() {
        return sdp;
    }

    public void setSdp(String sdp) {
        this.sdp = sdp;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }
}
