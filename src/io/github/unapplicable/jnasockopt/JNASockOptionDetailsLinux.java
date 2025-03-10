package io.github.unapplicable.jnasockopt;

public class JNASockOptionDetailsLinux extends JNASockOptionDetails {

	public JNASockOptionDetailsLinux() {
		super ();
		putOption (JNASockOption.IP_ADD_MEMBERSHIP, 0x23);
		putOption (JNASockOption.IP_ADD_SOURCE_MEMBERSHIP, 0x27);
		putOption (JNASockOption.IP_BLOCK_SOURCE, 0x26);
		putOption (JNASockOption.IP_DROP_MEMBERSHIP, 0x24);
		putOption (JNASockOption.IP_DROP_SOURCE_MEMBERSHIP, 0x28);
		putOption (JNASockOption.IP_HDRINCL, 0x3);
		putOption (JNASockOption.IP_IPSEC_POLICY, 0x10);
		putOption (JNASockOption.IP_MSFILTER, 0x29);
		putOption (JNASockOption.IP_MULTICAST_IF, 0x20);
		putOption (JNASockOption.IP_MULTICAST_LOOP, 0x22);
		putOption (JNASockOption.IP_MULTICAST_TTL, 0x21);
		putOption (JNASockOption.IP_OPTIONS, 0x4);
		putOption (JNASockOption.IP_PKTINFO, 0x8);
		putOption (JNASockOption.IP_RECVOPTS, 0x6);
		putOption (JNASockOption.IP_RECVRETOPTS, 0x7);
		putOption (JNASockOption.IP_RECVTTL, 0xc);
		putOption (JNASockOption.IP_RETOPTS, 0x7);
		putOption (JNASockOption.IP_TOS, 0x1);
		putOption (JNASockOption.IP_TTL, 0x2);
		putOption (JNASockOption.IP_UNBLOCK_SOURCE, 0x25);
		putOption (JNASockOption.MCAST_BLOCK_SOURCE, 0x2b);
		putOption (JNASockOption.MCAST_JOIN_GROUP, 0x2a);
		putOption (JNASockOption.MCAST_JOIN_SOURCE_GROUP, 0x2e);
		putOption (JNASockOption.MCAST_LEAVE_GROUP, 0x2d);
		putOption (JNASockOption.MCAST_LEAVE_SOURCE_GROUP, 0x2f);
		putOption (JNASockOption.MCAST_UNBLOCK_SOURCE, 0x2c);
		putOption (JNASockOption.PACKET_ADD_MEMBERSHIP, 0x1);
		putOption (JNASockOption.PACKET_DROP_MEMBERSHIP, 0x2);
		putOption (JNASockOption.PACKET_RECV_OUTPUT, 0x3);
		putOption (JNASockOption.PACKET_RX_RING, 0x5);
		putOption (JNASockOption.PACKET_STATISTICS, 0x6);
		putOption (JNASockOption.SCM_TIMESTAMP, 0x1d);
		putOption (JNASockOption.SCM_TIMESTAMPING, 0x25);
		putOption (JNASockOption.SCM_TIMESTAMPNS, 0x23);
		putOption (JNASockOption.SCM_WIFI_STATUS, 0x29);
		putOption (JNASockOption.SCTP_ADAPTATION_LAYER, 0x7);
		putOption (JNASockOption.SCTP_ASSOCINFO, 0x1);
		putOption (JNASockOption.SCTP_AUTH_ACTIVE_KEY, 0x18);
		putOption (JNASockOption.SCTP_AUTH_CHUNK, 0x15);
		putOption (JNASockOption.SCTP_AUTH_DELETE_KEY, 0x19);
		putOption (JNASockOption.SCTP_AUTH_KEY, 0x17);
		putOption (JNASockOption.SCTP_AUTOCLOSE, 0x4);
		putOption (JNASockOption.SCTP_CONTEXT, 0x11);
		putOption (JNASockOption.SCTP_DEFAULT_SEND_PARAM, 0xa);
		putOption (JNASockOption.SCTP_DELAYED_ACK, 0x10);
		putOption (JNASockOption.SCTP_DELAYED_ACK_TIME, 0x10);
		putOption (JNASockOption.SCTP_DELAYED_SACK, 0x10);
		putOption (JNASockOption.SCTP_DISABLE_FRAGMENTS, 0x8);
		putOption (JNASockOption.SCTP_EVENTS, 0xb);
		putOption (JNASockOption.SCTP_FRAGMENT_INTERLEAVE, 0x12);
		putOption (JNASockOption.SCTP_GET_ASSOC_NUMBER, 0x1c);
		putOption (JNASockOption.SCTP_GET_ASSOC_STATS, 0x70);
		putOption (JNASockOption.SCTP_GET_LOCAL_ADDRS, 0x6d);
		putOption (JNASockOption.SCTP_GET_PEER_ADDRS, 0x6c);
		putOption (JNASockOption.SCTP_GET_PEER_ADDR_INFO, 0xf);
		putOption (JNASockOption.SCTP_HMAC_IDENT, 0x16);
		putOption (JNASockOption.SCTP_INITMSG, 0x2);
		putOption (JNASockOption.SCTP_LOCAL_AUTH_CHUNKS, 0x1b);
		putOption (JNASockOption.SCTP_MAXSEG, 0xd);
		putOption (JNASockOption.SCTP_MAX_BURST, 0x14);
		putOption (JNASockOption.SCTP_NODELAY, 0x3);
		putOption (JNASockOption.SCTP_PARTIAL_DELIVERY_POINT, 0x13);
		putOption (JNASockOption.SCTP_PEER_ADDR_PARAMS, 0x9);
		putOption (JNASockOption.SCTP_PEER_AUTH_CHUNKS, 0x1a);
		putOption (JNASockOption.SCTP_PRIMARY_ADDR, 0x6);
		putOption (JNASockOption.SCTP_RTOINFO, 0x0);
		putOption (JNASockOption.SCTP_SET_PEER_PRIMARY_ADDR, 0x5);
		putOption (JNASockOption.SCTP_SOCKOPT_BINDX_ADD, 0x64);
		putOption (JNASockOption.SCTP_SOCKOPT_BINDX_REM, 0x65);
		putOption (JNASockOption.SCTP_SOCKOPT_CONNECTX, 0x6e);
		putOption (JNASockOption.SCTP_SOCKOPT_CONNECTX_OLD, 0x6b);
		putOption (JNASockOption.SCTP_SOCKOPT_PEELOFF, 0x66);
		putOption (JNASockOption.SCTP_STATUS, 0xe);
		putOption (JNASockOption.SOL_SOCKET, 0x1);
		putOption (JNASockOption.SO_ACCEPTCONN, 0x1e);
		putOption (JNASockOption.SO_ATTACH_FILTER, 0x1a);
		putOption (JNASockOption.SO_BINDTODEVICE, 0x19);
		putOption (JNASockOption.SO_BROADCAST, 0x6);
		putOption (JNASockOption.SO_BSDCOMPAT, 0xe);
		putOption (JNASockOption.SO_BUSY_POLL, 0x2e);
		putOption (JNASockOption.SO_DEBUG, 0x1);
		putOption (JNASockOption.SO_DETACH_FILTER, 0x1b);
		putOption (JNASockOption.SO_DOMAIN, 0x27);
		putOption (JNASockOption.SO_DONTROUTE, 0x5);
		putOption (JNASockOption.SO_ERROR, 0x4);
		putOption (JNASockOption.SO_GET_FILTER, 0x1a);
		putOption (JNASockOption.SO_KEEPALIVE, 0x9);
		putOption (JNASockOption.SO_LINGER, 0xd);
		putOption (JNASockOption.SO_LOCK_FILTER, 0x2c);
		putOption (JNASockOption.SO_MARK, 0x24);
		putOption (JNASockOption.SO_MAX_PACING_RATE, 0x2f);
		putOption (JNASockOption.SO_NOFCS, 0x2b);
		putOption (JNASockOption.SO_NO_CHECK, 0xb);
		putOption (JNASockOption.SO_OOBINLINE, 0xa);
		putOption (JNASockOption.SO_PASSCRED, 0x10);
		putOption (JNASockOption.SO_PASSSEC, 0x22);
		putOption (JNASockOption.SO_PEEK_OFF, 0x2a);
		putOption (JNASockOption.SO_PEERCRED, 0x11);
		putOption (JNASockOption.SO_PEERNAME, 0x1c);
		putOption (JNASockOption.SO_PEERSEC, 0x1f);
		putOption (JNASockOption.SO_PRIORITY, 0xc);
		putOption (JNASockOption.SO_PROTOCOL, 0x26);
		putOption (JNASockOption.SO_RCVBUF, 0x8);
		putOption (JNASockOption.SO_RCVBUFFORCE, 0x21);
		putOption (JNASockOption.SO_RCVLOWAT, 0x12);
		putOption (JNASockOption.SO_RCVTIMEO, 0x14);
		putOption (JNASockOption.SO_REUSEADDR, 0x2);
		putOption (JNASockOption.SO_REUSEPORT, 0xf);
		putOption (JNASockOption.SO_RXQ_OVFL, 0x28);
		putOption (JNASockOption.SO_SECURITY_AUTHENTICATION, 0x16);
		putOption (JNASockOption.SO_SECURITY_ENCRYPTION_NETWORK, 0x18);
		putOption (JNASockOption.SO_SECURITY_ENCRYPTION_TRANSPORT, 0x17);
		putOption (JNASockOption.SO_SELECT_ERR_QUEUE, 0x2d);
		putOption (JNASockOption.SO_SNDBUF, 0x7);
		putOption (JNASockOption.SO_SNDBUFFORCE, 0x20);
		putOption (JNASockOption.SO_SNDLOWAT, 0x13);
		putOption (JNASockOption.SO_SNDTIMEO, 0x15);
		putOption (JNASockOption.SO_TIMESTAMP, 0x1d);
		putOption (JNASockOption.SO_TIMESTAMPING, 0x25);
		putOption (JNASockOption.SO_TIMESTAMPNS, 0x23);
		putOption (JNASockOption.SO_TYPE, 0x3);
		putOption (JNASockOption.SO_WIFI_STATUS, 0x29);
		putOption (JNASockOption.TCP_CONGESTION, 0xd);
		putOption (JNASockOption.TCP_CORK, 0x3);
		putOption (JNASockOption.TCP_DEFER_ACCEPT, 0x9);
		putOption (JNASockOption.TCP_FASTOPEN, 0x17);
		putOption (JNASockOption.TCP_INFO, 0xb);
		putOption (JNASockOption.TCP_KEEPCNT, 0x6);
		putOption (JNASockOption.TCP_KEEPIDLE, 0x4);
		putOption (JNASockOption.TCP_KEEPINTVL, 0x5);
		putOption (JNASockOption.TCP_MAXSEG, 0x2);
		putOption (JNASockOption.TCP_NODELAY, 0x1);
		putOption (JNASockOption.TCP_QUEUE_SEQ, 0x15);
		putOption (JNASockOption.TCP_QUICKACK, 0xc);
		putOption (JNASockOption.TCP_REPAIR, 0x13);
		putOption (JNASockOption.TCP_REPAIR_OPTIONS, 0x16);
		putOption (JNASockOption.TCP_REPAIR_QUEUE, 0x14);
		putOption (JNASockOption.TCP_SYNCNT, 0x7);
		putOption (JNASockOption.TCP_THIN_DUPACK, 0x11);
		putOption (JNASockOption.TCP_THIN_LINEAR_TIMEOUTS, 0x10);
		putOption (JNASockOption.TCP_TIMESTAMP, 0x18);
		putOption (JNASockOption.TCP_USER_TIMEOUT, 0x12);
		putOption (JNASockOption.TCP_WINDOW_CLAMP, 0xa);
		putOption (JNASockOption.UDP_CORK, 0x1);
		putOption (JNASockOption.UDP_ENCAP, 0x64);
		putLevel (JNASockOptionLevel.SOL_SOCKET, 0x1);
		putLevel (JNASockOptionLevel.SOL_AAL, 0x109);
		putLevel (JNASockOptionLevel.SOL_ATM, 0x108);
		putLevel (JNASockOptionLevel.SOL_DECNET, 0x105);
		putLevel (JNASockOptionLevel.SOL_IP, 0x0);
		putLevel (JNASockOptionLevel.SOL_IRDA, 0x10a);
		putLevel (JNASockOptionLevel.SOL_PACKET, 0x107);
		putLevel (JNASockOptionLevel.SOL_RAW, 0xff);
		putLevel (JNASockOptionLevel.SOL_SCTP, 0x84);
		putLevel (JNASockOptionLevel.SOL_TCP, 0x6);
		putLevel (JNASockOptionLevel.SOL_UDP, 0x11);
	}
}
