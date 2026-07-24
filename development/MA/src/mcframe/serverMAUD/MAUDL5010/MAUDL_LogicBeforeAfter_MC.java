package mcframe.serverMAUD.MAUDL5010;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.param.MCParam;
import mcframe.commonCore.push.MCPushMessage;
import mcframe.commonMA.constant.*;
import mcframe.serverCore.phase.MCLogicBeforeAfter;
import mcframe.serverCore.push.MCServerPushManager;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL5010.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;


public class MAUDL_LogicBeforeAfter_MC implements MCLogicBeforeAfter {
	
	@Override
	public void invoke(MCParam param) {

	}

	@Override
	public void destroy(MCParam param) {
		execPN(param);
		clearContextInfo(param);
	}

	@Override
	public Throwable destroy(MCParam param, Throwable t) {
		clearContextInfo(param);
		return t;
	}

	// **********************************************************************

	/**
	 * プッシュ通知対象の処理かを設定する<br>
	 */
	public static void setPushTar(boolean pushTar) {
		_pushTar.put(MCSys.request.serverRequestNo(), pushTar);
	}

	protected static Map<String, Boolean> _pushTar = new java.util.concurrent.ConcurrentHashMap<String, Boolean>();

	/**
	 * プッシュ通知対象の処理かを取得する<br>
	 * @return プッシュ通知対象の処理かどうか
	 */
	static Boolean getPushTar() {
		return _pushTar.get(MCSys.request.serverRequestNo());
	}

	/**
	 * プッシュ通知対象の処理かを削除する<br>
	 */
	static void remPushTar() {
		_pushTar.remove(MCSys.request.serverRequestNo());
	}
	/**
	 * ヘッダ
	 */
	protected MCList<MAT_PUSH_NTC_H_R>
			_pnHdrL = MCList.create(MAT_PUSH_NTC_H_R.class);

	/**
	 * メッセージ明細
	 */
	protected Map<Comparable<?>, MCList<MAT_PUSH_NTC_MSG_R>>
			_pnMsgMap = new HashMap<>();

	/**
	 * 遷移情報明細
	 */
	protected Map<Comparable<?>, MCList<MAT_PUSH_NTC_TRANS_R>>
			_pnTransMap = new HashMap<>();

	/**
	 * ユーザ明細
	 */
	protected Map<Comparable<?>, MCList<MAT_PUSH_NTC_USR_R>>
			_pnUsrMap = new HashMap<>();

	/**
	 * クライアント明細（ワーク）
	 */
	protected Map<Comparable<?>, MCList<PushNtc_Upd01_Wk1R>>
			_pnCltWkMap = new HashMap<>();

	/**
	 * 遷移情報明細（ワーク）
	 */
	protected Map<Comparable<?>, MCList<PushNtc_Upd01_Wk2R>>
			_pnTransWkMap = new HashMap<>();

	/**
	 * プッシュメッセージ
	 */
	protected Map<String, List<MCPushMessage>>
			_pnPushMsgMap = new HashMap<>();
	/**
	 * ユーザ・受信方式ごとの送信履歴。メッセージの重複排除に使用する
	 */
	protected Map<List<Comparable<?>>, List<MCPushMessage>>
			_pnSendMap = new HashMap<>();

	/**
	 * プッシュ通知（Push Notification）を実行します。
	 */
	protected void execPN(MCParam param) {
		// プッシュ通知対象の処理でなければ何もしない
		Boolean boo = getPushTar();
		if (boo == null) {
			return;
		}
		remPushTar();
		if (!boo) {
			return;
		}
		
		initPN(param);
		for (MAT_PUSH_NTC_H_R hdrR : _pnHdrL) {
			setMsg(hdrR);
			setClt(hdrR);
			setTrans(hdrR);
		}
		execPN();
	}

	/**
	 * プッシュ通知の初期化処理を行います。
	 */
	protected void initPN(MCParam param) {
		crtPNHdrL(param);
		if (_pnHdrL.isEmpty()) {
			return;
		}
		crtPNMsgMap(param);
		crtPNTransMap(param);
		crtPNUsrMap(param);
		crtPNCltWkMap(param);
		crtPNTransWkMap(param);
	}

	/**
	 * ヘッダのリストを作成します。
	 */
	protected void crtPNHdrL(MCParam param) {
		_pnHdrL.addAll(getPNHdrL(param));
	}

	/**
	 * プッシュ通知ヘッダを取得します。
	 */
	protected MCList<MAT_PUSH_NTC_H_R> getPNHdrL(MCParam param) {
		MCList<MAT_PUSH_NTC_H_R> ret = MCList.create(MAT_PUSH_NTC_H_R.class);
		MAT_PUSH_NTC_H_R t = MAT_PUSH_NTC_H_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.addWhereWithAnd(t.upd_srv_req_no.eq(bind("1")), param.getServerRequestNo());
		dbSelect(createSqlId("MAUDL5010", t, "MAUDL_LogicBeforeAfter_S01"), ret, builder);
		return ret;
	}

	/**
	 * ユーザ明細を取得するマップを作成します。
	 */
	protected void crtPNUsrMap(MCParam param) {
		String pushNtcNo = MAT_PUSH_NTC_USR_R.$push_ntc_no;
		_pnUsrMap.putAll(crtPegListMap(getPNUsrL(param), pushNtcNo));
	}

	/**
	 * プッシュ通知ユーザ明細を取得します。
	 */
	protected MCList<MAT_PUSH_NTC_USR_R> getPNUsrL(MCParam param) {
		MCList<MAT_PUSH_NTC_USR_R> ret = MCList.create(MAT_PUSH_NTC_USR_R.class);
		MAT_PUSH_NTC_USR_R t = MAT_PUSH_NTC_USR_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.addWhereWithAnd(t.upd_srv_req_no.eq(bind("1")), param.getServerRequestNo());
		dbSelect(createSqlId("MAUDL5010", t, "MAUDL_LogicBeforeAfter_S02"), ret, builder);
		return ret;
	}

	/**
	 * メッセージ明細を取得するマップを作成します。
	 */
	protected void crtPNMsgMap(MCParam param) {
		String pushNtcNo = MAT_PUSH_NTC_MSG_R.$push_ntc_no;
		_pnMsgMap.putAll(crtPegListMap(getPNMsgL(param), pushNtcNo));
	}

	/**
	 * プッシュ通知メッセージ明細を取得します。
	 */
	protected MCList<MAT_PUSH_NTC_MSG_R> getPNMsgL(MCParam param) {
		MCList<MAT_PUSH_NTC_MSG_R> ret = MCList.create(MAT_PUSH_NTC_MSG_R.class);
		MAT_PUSH_NTC_MSG_R t = MAT_PUSH_NTC_MSG_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.addWhereWithAnd(t.upd_srv_req_no.eq(bind("1")), param.getServerRequestNo());
		dbSelect(createSqlId("MAUDL5010", t, "MAUDL_LogicBeforeAfter_S03"), ret, builder);
		return ret;
	}

	/**
	 * プッシュ通知遷移情報明細を取得するマップを作成します。
	 */
	protected void crtPNTransMap(MCParam param) {
		String pushNtcNo = MAT_PUSH_NTC_TRANS_R.$push_ntc_no;
		_pnTransMap.putAll(crtPegListMap(getPNTransL(param), pushNtcNo));
	}

	/**
	 * プッシュ通知遷移情報明細を取得します。
	 */
	protected MCList<MAT_PUSH_NTC_TRANS_R> getPNTransL(MCParam param) {
		MCList<MAT_PUSH_NTC_TRANS_R> ret = MCList.create(MAT_PUSH_NTC_TRANS_R.class);
		MAT_PUSH_NTC_TRANS_R t = MAT_PUSH_NTC_TRANS_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t);
		builder.addWhereWithAnd(t.upd_srv_req_no.eq(bind("1")), param.getServerRequestNo());
		dbSelect(createSqlId("MAUDL5010", t, "MAUDL_LogicBeforeAfter_S04"), ret, builder);
		return ret;
	}

	/**
	 * クライアント明細を取得するマップを作成します。
	 */
	protected void crtPNCltWkMap(MCParam param) {
		MCList<PushNtc_Upd01_Wk1R> wkL = MCList.create(PushNtc_Upd01_Wk1R.class);
		MAC_PUSH_NTC_CLT_R c = MAC_PUSH_NTC_CLT_R.create("C");
		MAT_PUSH_NTC_H_R t = MAT_PUSH_NTC_H_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(c);
		builder.setSelect(c.client_typ, c.trans_module_id, c.trans_screen_id, c.trans_btn_path, t.push_ntc_no);
		builder.addInnerJoin(t, t.push_ntc_typ.eq(c.push_ntc_typ));
		builder.addWhereWithAnd(t.upd_srv_req_no.eq(bind("1")), param.getServerRequestNo());
		dbSelect(createSqlId("MAUDL5010", c, "MAUDL_LogicBeforeAfter_S05"), wkL, builder);
		String pushNtcNo = PushNtc_Upd01_Wk1R.$push_ntc_no;
		_pnCltWkMap.putAll(crtPegListMap(wkL, pushNtcNo));
	}

	/**
	 * 遷移情報明細を取得するマップを作成します。
	 */
	protected void crtPNTransWkMap(MCParam param) {
		MCList<PushNtc_Upd01_Wk2R> wkL = MCList.create(PushNtc_Upd01_Wk2R.class);
		MAC_PUSH_NTC_TRANS_R c = MAC_PUSH_NTC_TRANS_R.create("C");
		MAT_PUSH_NTC_H_R t = MAT_PUSH_NTC_H_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(c);
		builder.setSelect(c.column_seq, c.client_typ, c.column_path, t.push_ntc_no);
		builder.addInnerJoin(t, t.push_ntc_typ.eq(c.push_ntc_typ));
		builder.addWhereWithAnd(t.upd_srv_req_no.eq(bind("1")), param.getServerRequestNo());
		dbSelect(createSqlId("MAUDL5010", c, "MAUDL_LogicBeforeAfter_S06"), wkL, builder);
		String pushNtcNo = PushNtc_Upd01_Wk2R.$push_ntc_no;
		_pnTransWkMap.putAll(crtPegListMap(wkL, pushNtcNo));
	}

	/**
	 * メッセージ明細を設定します。
	 */
	protected void setMsg(MAT_PUSH_NTC_H_R hdrR) {
		if (hdrR == null) {
			return;
		}
		String pushNtcNo = hdrR.push_ntc_no();
		MCList<MAT_PUSH_NTC_USR_R> usrL = _pnUsrMap.get(pushNtcNo);
		if (usrL == null) {
			return;
		}
		MCList<MAT_PUSH_NTC_MSG_R> msgL = _pnMsgMap.get(pushNtcNo);
		Object[] binds = new Object[0];
		if (msgL != null) {
			msgL.sort(MAT_PUSH_NTC_MSG_R.$bind_seq);
			binds = msgL.getString(MAT_PUSH_NTC_MSG_R.$bind_val).toArray();
		}
		MCMessage msg = new MCMessage(hdrR.msg_id(), binds);
		String pushNtcNoCol = MAT_PUSH_NTC_USR_R.$push_ntc_no;
		String msgImpTypCol = MAT_PUSH_NTC_USR_R.$msg_imp_typ;
		List<String> msgImpTypL = usrL.subList(pushNtcNoCol,
				pushNtcNo).groupBy(msgImpTypCol).getString(msgImpTypCol);
		List<MCPushMessage> pushMsgL = new ArrayList<>();
		for (String msgImpTyp : msgImpTypL) {
			if (MAC_MSG_IMP_TYP.isHIGH(msgImpTyp)) {
				MCPushMessage pushMsg = new MCPushMessage(msg, true);
				pushMsgL.add(pushMsg);
				continue;
			}
			if (MAC_MSG_IMP_TYP.isLOW(msgImpTyp)) {
				MCPushMessage pushMsg = new MCPushMessage(msg, false);
				pushMsgL.add(pushMsg);
				continue;
			}
		}
		_pnPushMsgMap.put(pushNtcNo, pushMsgL);
	}

	/**
	 * クライアント明細を設定します。
	 */
	protected void setClt(MAT_PUSH_NTC_H_R hdrR) {
		if (hdrR == null) {
			return;
		}
		String pushNtcNo = hdrR.push_ntc_no();
		List<MCPushMessage> pushMsgL = _pnPushMsgMap.get(pushNtcNo);
		if (pushMsgL == null) {
			return;
		}
		MCList<MAT_PUSH_NTC_TRANS_R> transL = _pnTransMap.get(pushNtcNo);
		if (transL == null) {
			return;
		}
		MCList<PushNtc_Upd01_Wk1R> cltWkL = _pnCltWkMap.get(pushNtcNo);
		if (cltWkL == null) {
			return;
		}
		MCList<PushNtc_Upd01_Wk2R> transWkL = _pnTransWkMap.get(pushNtcNo);
		if (transWkL == null) {
			return;
		}
		String cltTypCol = PushNtc_Upd01_Wk2R.$client_typ;
		List<String> cltTypL =
				transWkL.groupBy(cltTypCol).getString(cltTypCol);
		for (PushNtc_Upd01_Wk1R cltWkR : cltWkL) {
			if (!cltTypL.contains(cltWkR.client_typ())) {
				continue;
			}
			String cltTyp = cltWkR.client_typ();
			String mdl = cltWkR.trans_module_id();
			String scr = cltWkR.trans_screen_id();
			String btn = cltWkR.trans_btn_path();
			if (MAC_CLIENT_TYP.isPC(cltTyp)) {
				for (MCPushMessage pushMsg : pushMsgL) {
					pushMsg.setScreenPC(mdl, scr);
					pushMsg.setScreenActionPC(btn);
				}
				continue;
			}
			if (MAC_CLIENT_TYP.isMD(cltTyp)) {
				for (MCPushMessage pushMsg : pushMsgL) {
					pushMsg.setScreenMD(mdl, scr);
					pushMsg.setScreenActionMD(btn);
				}
				continue;
			}
		}
	}

	/**
	 * 遷移情報明細を設定します。
	 */
	protected void setTrans(MAT_PUSH_NTC_H_R hdrR) {
		if (hdrR == null) {
			return;
		}
		String pushNtcNo = hdrR.push_ntc_no();
		List<MCPushMessage> pushMsgL = _pnPushMsgMap.get(pushNtcNo);
		if (pushMsgL == null) {
			return;
		}
		MCList<MAT_PUSH_NTC_TRANS_R> transL = _pnTransMap.get(pushNtcNo);
		if (transL == null) {
			return;
		}
		MCList<PushNtc_Upd01_Wk2R> transWkL = _pnTransWkMap.get(pushNtcNo);
		if (transWkL == null) {
			return;
		}
		transL.sort(MAT_PUSH_NTC_TRANS_R.$column_seq);
		MCList<PushNtc_Upd01_Wk2R>[] transWkGLArr =
				transWkL.groupList(PushNtc_Upd01_Wk2R.$column_seq);
		int num = Math.min(transL.size(), transWkGLArr.length);
		for (int i = 0; i < num; i++) {
			String val = transL.get(i).data_val();
			MCList<PushNtc_Upd01_Wk2R> transWkGL = transWkGLArr[i];
			for (PushNtc_Upd01_Wk2R transWkGR : transWkGL) {
				String cltTyp = transWkGR.client_typ();
				String col = transWkGR.column_path();
				if (MAC_CLIENT_TYP.isPC(cltTyp)) {
					for (MCPushMessage pushMsg : pushMsgL) {
						pushMsg.addScreenParamPC(col, val);
					}
					continue;
				}
				if (MAC_CLIENT_TYP.isMD(cltTyp)) {
					for (MCPushMessage pushMsg : pushMsgL) {
						pushMsg.addScreenParamMD(col, val);
					}
					continue;
				}
			}
		}
	}

	/**
	 * 処理中のプッシュ通知区分
	 */
	protected String _pushNtcTyp = null;

	/**
	 * プッシュ通知（Push Notification）を実行します。
	 */
	protected void execPN() {
		MCServerPushManager pushMgr = MCServerPushManager.getManager();
		for (MAT_PUSH_NTC_H_R hdrR : _pnHdrL) {
			String pushNtcNo = hdrR.push_ntc_no();
			_pushNtcTyp = hdrR.push_ntc_typ();
			List<MCPushMessage> pushMsgL = _pnPushMsgMap.get(pushNtcNo);
			if (pushMsgL == null) {
				continue;
			}
			MCList<MAT_PUSH_NTC_USR_R> usrL = _pnUsrMap.get(pushNtcNo);
			if (usrL == null) {
				continue;
			}
			String mdl = hdrR.src_module_id();
			String lgc = hdrR.src_logic_id();
			String ope = hdrR.src_operation_id();
			String[] cols = new String[] {
				  MAT_PUSH_NTC_USR_R.$msg_imp_typ
				, MAT_PUSH_NTC_USR_R.$push_typ
			};
			MCList<MAT_PUSH_NTC_USR_R>[] usrGLArr = usrL.groupList(cols);
			for (MCList<MAT_PUSH_NTC_USR_R> usrGL : usrGLArr) {
				String msgImpTyp = usrGL.get(0).msg_imp_typ();
				String pushTyp = usrGL.get(0).push_typ();
				for (MCPushMessage pushMsg : pushMsgL) {
					boolean msgImp = pushMsg.isImportance();
					boolean exec =
							MAC_MSG_IMP_TYP.isHIGH(msgImpTyp) && msgImp ||
							MAC_MSG_IMP_TYP.isLOW(msgImpTyp) && !msgImp;
					if (!exec) {
						continue;
					}
					String[] usrs = getPNSendUsrs(usrGL, pushTyp, pushMsg);
					if (usrs == null || usrs.length == 0) {
						continue;
					}
					updPNSendMap(usrs, pushTyp, pushMsg);
					if (MAC_PUSH_TYP.isNON(pushTyp)) {
						pushMgr.storeMessage(pushMsg, mdl, lgc, ope, usrs);
						continue;
					}
					if (MAC_PUSH_TYP.isSCREEN(pushTyp)) {
						pushMgr.pushMessage(pushMsg, mdl, lgc, ope, usrs);
						continue;
					}
					if (MAC_PUSH_TYP.isMAIL(pushTyp)) {
						pushMgr.mailMessage(pushMsg, mdl, lgc, ope, usrs);
						continue;
					}
					if (MAC_PUSH_TYP.isSCREEN_MAIL(pushTyp)) {
						pushMgr.sendMessage(pushMsg, mdl, lgc, ope, usrs);
						continue;
					}
				}
			}
		}
	}
	/**
	 * プッシュ通知のメッセージの送信履歴を更新する。
	 */
	protected void updPNSendMap(String[] usrCds, String pushTyp, MCPushMessage pushMsg) {
		for (String usrCd : usrCds) {
			List<Comparable<?>> keys = toKey(usrCd, pushTyp);
			List<MCPushMessage> msgL = _pnSendMap.get(keys);
			if (msgL == null) {
				msgL = new ArrayList<MCPushMessage>();
				_pnSendMap.put(keys, msgL);
			}
			msgL.add(pushMsg);
		}
	}
	
	/**
	 * メッセージの送信対象となるユーザのリストを返す。既に送信済のユーザは除く。
	 */
	protected String[] getPNSendUsrs(MCList<MAT_PUSH_NTC_USR_R> usrGL, String pushTyp, MCPushMessage pushMsg) {
		ArrayList<String> yetSendUsrs = new ArrayList<>();
		for (MAT_PUSH_NTC_USR_R r : usrGL) {
			if (!isAlreadyPNSend(r.usr_cd(), pushTyp, pushMsg)) {
				yetSendUsrs.add(r.usr_cd());
			}
		}
		return yetSendUsrs.toArray(new String[0]);
	}
	
	/**
	 * プッシュ通知のメッセージを既にユーザに送信したか否か
	 */
	protected boolean isAlreadyPNSend(String usrCd, String pushTyp, MCPushMessage pushMsg) {
		List<MCPushMessage> msgL = _pnSendMap.get(toKey(usrCd, pushTyp));
		if (msgL == null) {
			return false;
		}
		
		for (MCPushMessage msg : msgL) {
			if (isSamePNMessage(pushMsg, msg)) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * 画面遷移パラメータ同一確認を行うプッシュ通知区分
	 */
	protected String[] _scrMapCheckNtcTyps = {
			MAC_PUSH_NTC_TYP.APRV_RQST_MAIN.value(),
			MAC_PUSH_NTC_TYP.APRV_RQST_SUB.value()
	};
	
	/**
	 * メッセージの内容が同じか否か
	 */
	protected boolean isSamePNMessage(MCPushMessage pushMsg1, MCPushMessage pushMsg2) {
		if (pushMsg1 == pushMsg2) {
			return true;
		}
		if (isSameMessage(pushMsg1.getMessage(), pushMsg2.getMessage())) {
			if (Arrays.asList(_scrMapCheckNtcTyps).contains(_pushNtcTyp)) {
				Map<String, String> scrMap1 = pushMsg1.getScreenParamMap(MCServerPushManager.SCR_TYPE_PC);
				Map<String, String> scrMap2 = pushMsg2.getScreenParamMap(MCServerPushManager.SCR_TYPE_PC);
				if (scrMap1 != null && scrMap2 != null) {
					if (scrMap1.equals(scrMap2)) {
						return true;
					}
				}
			} else {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * メッセージの内容が同じか否か
	 */
	protected boolean isSameMessage(MCMessage msg1, MCMessage msg2) {
		if (msg1 == msg2) {
			return true;
		}
		
		if (!isSame(msg1.getID(), msg2.getID())) {
			return false;
		}
		
		String[] bind1 = msg1.getBindArray();
		String[] bind2 = msg2.getBindArray();
		
		if (bind1 == null) {
			return bind2 == null;
		}
		if (bind2 == null) {
			return false;
		}
		if (bind1.length != bind2.length) {
			return false;
		}
		
		for (int i = 0; i < bind1.length; i++) {
			if (!isSame(bind1[i], bind2[i])) {
				return false;
			}
		}
		
		return true;
	}
	
	protected List<Comparable<?>> toKey(Comparable<?>... in) {
		List<Comparable<?>> ret = new ArrayList<Comparable<?>>();
		if (in == null) {
			return ret;
		}
		for (Comparable<?> c : in) {
			ret.add(c);
		}
		return ret;
	}

	// **********************************************************************

	/**
	 * セッションコンテキストの情報をクリアします。
	 * 以下の情報をクリアします。
	 * <p>
	 * <ul>
	 * <li>MAPA_CONTEXT.DEL_FLG_CTL</li>
	 * </ul>
	 */
	protected void clearContextInfo(MCParam param) {
		String procIdDel = "MAPA_CONTEXT$SET_DEL_FLG_CTL";
		String procIdRel = "MAPA_CONTEXT$SET_RELEASE_FLG_CTL";
		
		MCRow nullBind = MCRow.create();
		nullBind.setStringNE("flg", null);
		execProc(
				createSqlId(
						"MAUDL5010",
						procIdDel,
						"MAUDL_LogicBeforeAfter_clearContextInfo"),
				procIdDel, nullBind, null, ":flg");
		execProc(
				createSqlId(
						"MAUDL5010",
						procIdRel,
						"MAUDL_LogicBeforeAfter_clearContextInfo"),
				procIdRel, nullBind, null, ":flg");
		
	}

	// **********************************************************************

	/**
	 * 紐付け用のマップを作成します。
	 */
	protected <T extends MCRow> Map<Comparable<?>, MCList<T>>
			crtPegListMap(MCList<T> tgtL, String col) {
		Map<Comparable<?>, MCList<T>> ret = new HashMap<>();
		if (tgtL == null) {
			return ret;
		}
		MCList<T>[] tgtGLArr = tgtL.groupList(col);
		for (MCList<T> tgtGL : tgtGLArr) {
			Comparable<?> val = tgtGL.get(0).toArray(col)[0];
			ret.put(val, tgtGL);
		}
		return ret;
	}

}
