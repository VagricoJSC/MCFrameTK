package mcframe.serverMABC.MABCL1500;

import mcframe.commonCore.lang.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.container.MCList.SortType;
import mcframe.commonCore.notice.*;
import mcframe.serverCore.logic.*;
import mcframe.serverCore.notice.MCMessagePool;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCQueryApiBuilder;
import static mcframe.serverCore.queryapi.IFMCSQL.*;
import mcframe.commonMA.constant.*;
import mcframe.commonMAUC.MAUCC2010.MAUCC_RowMapperWith;
import mcframe.serverMA.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMABC.MABCL1500.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil;
import java.util.ArrayList;
import java.util.List;
import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.*;
import static mcframe.serverMA.dbc.MAFunction.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_ExtSysReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_ExtSysReg_MC extends MABCL_ExtSysReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * ExtSys_UpdChk01オペレーション.<p>
	 *
	 * 外部システムマスタを登録する前のチェックを行う<br>
	 */
	public class ExtSys_UpdChk01 extends MABCL_ExtSysReg_MC_A.ExtSys_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			for(ExtSys_UpdChk01_DtlR r : up0()){
				if (isNotCd(r.ext_sys_cd())){
					msgList.add(new MCMessage(r, ExtSys_UpdChk01_DtlR.$ext_sys_cd, MABCL0306, 
									getLabel(r, ExtSys_UpdChk01_DtlR.$ext_sys_cd), r.ext_sys_cd(), toDispGUIIndex(r)));
					continue;
				}
				if (r.del_flg()) {
					continue ;
				}
				if (r.getBooleanNE("err_flg")) {
					continue;
				}
				// 個別チェック
				if (!MAC_EXT_SYS_TYP.isSCM(r.ext_sys_typ())
				 && !MAC_EXT_SYS_TYP.isSCM_MD(r.ext_sys_typ())) {
					if (r.not_send_upd_flg()) {
						msgList.add(getMsg(r, ExtSys_UpdChk01_DtlR.$not_send_upd_flg, MABCL0515));
					}
					if (r.not_dup_imp_flg()) {
						msgList.add(getMsg(r, ExtSys_UpdChk01_DtlR.$not_dup_imp_flg, MABCL0515));
					}
					if (r.dlv_slip_split_flg()) {
						msgList.add(getMsg(r, ExtSys_UpdChk01_DtlR.$dlv_slip_split_flg, MABCL0515));
					}
					if (!isNull(r.if_upd_typ())) {
						msgList.add(getMsg(r, ExtSys_UpdChk01_DtlR.$if_upd_typ, MABCL0516));
					}
					if (!MAC_EXT_SYS_TYP.isEDI(r.ext_sys_typ())
					 && !MAC_EXT_SYS_TYP.isEDI_MCF(r.ext_sys_typ())) {
						if (r.null_val_if_flg()) {
							msgList.add(getMsg(r, ExtSys_UpdChk01_DtlR.$null_val_if_flg,
									MABCL0517));
						}
					}
				}
				if (!MAC_EXT_SYS_TYP.isEDI(r.ext_sys_typ())
						&& !MAC_EXT_SYS_TYP.isEDI_MCF(r.ext_sys_typ())) {
					if (r.upri_not_chk_flg()) {
						msgList.add(getMsg(r, ExtSys_UpdChk01_DtlR.$upri_not_chk_flg,
								MABCL0531));
					}
					if (r.amt_not_chk_flg()) {
						msgList.add(getMsg(r, ExtSys_UpdChk01_DtlR.$amt_not_chk_flg,
								MABCL0531));
					}
					if (r.tax_not_chk_flg()) {
						msgList.add(getMsg(r, ExtSys_UpdChk01_DtlR.$tax_not_chk_flg,
								MABCL0531));
					}
				}
				if (MAC_EXT_SYS_TYP.isSCM_MD(r.ext_sys_typ())) {
					if (!r.null_val_if_flg()) {
						msgList.add(getMsg(r, ExtSys_UpdChk01_DtlR.$null_val_if_flg,
							MABCL0520));
					}
					if (!r.not_send_upd_flg()) {
						msgList.add(getMsg(r, ExtSys_UpdChk01_DtlR.$not_send_upd_flg,
								MABCL0520));
					}
				}
				if(r.web_api_flg() && r.cmd_exec_flg()) {
					msgList.add(new MCMessage(MABCL0541, toDispGUIIndex(r)));
				}
			}
			checkExtSysTypChange(msgList);
			return msgList;
		}
		@Override
		protected IfValidater getConstExistValidater(String col, MCAppConst[] constArr) {
			// ＩＦ更新区分
			if (isSame(col, ExtSys_UpdChk01_DtlR.$if_upd_typ)) {
				ArrayList<MAC_IF_UPD_TYP> list = new ArrayList<MAC_IF_UPD_TYP>();
				for (MAC_IF_UPD_TYP typ : MAC_IF_UPD_TYP.array()) {
					if (!MAC_IF_UPD_TYP.isALL_ERROR(typ)) {
						list.add(typ);
					}
				}
				return new FXUCL_ConstValidater(list.toArray(new MCAppConst[0]));
			}
			return super.getConstExistValidater(col, constArr);
		}
		/** 項目名、行番号を引数に持つメッセージ */
		protected MCMessage getMsg(ExtSys_UpdChk01_DtlR r, String col, String id) {
			return new MCMessage(r, col, id, getLabel(r, col), toDispGUIIndex(r));
		}

		protected void checkExtSysTypChange(MCMessageList msgList) {
			MCList<ExtSys_UpdChk01_DtlR> l = up0().subList(MCRow.MODIFY);
			if (l.isEmpty()) {
				return ;
			}

			// 外部システムマスタのキャッシュ取得
			initExtSysCache(l);

			MCTempView t = createTempView("T");

			for (ExtSys_UpdChk01_DtlR r : l) {
				MAM_EXT_SYS_R extSysR = getExtSysR(r.ext_sys_cd());
				if (!isSame(r.ext_sys_typ(), extSysR.ext_sys_typ())) {
					if (MAC_EXT_SYS_TYP.isEDI(extSysR.ext_sys_typ()) || MAC_EXT_SYS_TYP.isEDI_MCF(extSysR.ext_sys_typ())) {

						checkExistIfProcTyp(1, r, MABCL0274, msgList, MAC_IF_PROC_TYP$IS_EDI(t.pr("if_proc_typ")).eq(value(true)));
					}
					else if(MAC_EXT_SYS_TYP.isPLM(extSysR.ext_sys_typ())) {

						checkExistIfProcTyp(2, r, MABCL0275, msgList, MAC_IF_PROC_TYP$IS_PLM(t.pr("if_proc_typ")).eq(value(true)));
					}
					else if(MAC_EXT_SYS_TYP.isAC(extSysR.ext_sys_typ())) {

						checkExistIfProcTyp(3, r, MABCL0605, msgList, MAC_IF_PROC_TYP$IS_AC(t.pr("if_proc_typ")).eq(value(true)));
					}
					else if(MAC_EXT_SYS_TYP.isSCM(extSysR.ext_sys_typ()) || MAC_EXT_SYS_TYP.isSCM_MD(extSysR.ext_sys_typ())) {

						checkExistIfProcTyp(4, r, MABCL0606, msgList, MAC_IF_PROC_TYP$IS_SCM(t.pr("if_proc_typ")).eq(value(true)));
					}
					else if(MAC_EXT_SYS_TYP.isFB(extSysR.ext_sys_typ())) {

						checkExistIfProcTyp(5, r, MABCL0607, msgList, MAC_IF_PROC_TYP$IS_FB(t.pr("if_proc_typ")).eq(value(true)));
					}
					else if(MAC_EXT_SYS_TYP.isBI(extSysR.ext_sys_typ())) {

						checkExistIfProcTyp(6, r, MABCL0608, msgList, MAC_IF_PROC_TYP$IS_BI(t.pr("if_proc_typ")).eq(value(true)));
					}
					else if (MAC_EXT_SYS_TYP.isAC_SAP(extSysR.ext_sys_typ())) {

						checkExistIfProcTyp(7, r, MABCL0701, msgList, MAC_IF_PROC_TYP$IS_SAP(t.pr("if_proc_typ")).eq(value(true)));
					}
					else if (MAC_EXT_SYS_TYP.isSCM_PCM(extSysR.ext_sys_typ())) {

						checkExistIfProcTyp(7, r, MABCL0704, msgList, MAC_IF_PROC_TYP$IS_PCM(t.pr("if_proc_typ")).eq(value(true)));
					}
				}
			}
		}
		protected void checkExistIfProcTyp(int no, ExtSys_UpdChk01_DtlR r, String msgId, MCMessageList msgList, MCPredicate predicate) {
			MAM_IF_PROTOCOL_R protcolR = MAM_IF_PROTOCOL_R.create("T");
			MAM_IF_ADAPTER_R adapterR = MAM_IF_ADAPTER_R.create("T");
			MAM_HTTP_HEADER_R httpR = MAM_HTTP_HEADER_R.create("T");

			int i = execDbCount("MABCL1500_MAM_IF_PROTOCOL_S0"+no, protcolR,
					protcolR.ext_sys_cd.eq(bind("ext_sys_cd"))
					.and(protcolR.del_flg.eq(value(false)))
					.and(predicate), r);
			if (i > 0) {
				msgList.add(new MCMessage(r, ExtSys_UpdChk01_DtlR.$ext_sys_typ, msgId, r.ext_sys_cd(), r.ext_sys_typ()));
				return;
			}
			i = execDbCount("MABCL1500_MAM_IF_ADAPTER_S0"+no, adapterR,
					adapterR.ext_sys_cd.eq(bind("ext_sys_cd"))
					.and(adapterR.del_flg.eq(value(false)))
					.and(predicate), r);
			if (i > 0) {
				msgList.add(new MCMessage(r, ExtSys_UpdChk01_DtlR.$ext_sys_typ, msgId, r.ext_sys_cd(), r.ext_sys_typ()));
				return;
			}
			i = execDbCount("MABCL1500_MAM_HTTP_HEADER_S0"+no, httpR,
					httpR.ext_sys_cd.eq(bind("ext_sys_cd"))
					.and(httpR.del_flg.eq(value(false)))
					.and(predicate), r);
			if (i > 0) {
				msgList.add(new MCMessage(r, ExtSys_UpdChk01_DtlR.$ext_sys_typ, msgId, r.ext_sys_cd(), r.ext_sys_typ()));
			}
		}
	}
	/**
	 * ExtSys_Upd01オペレーション.<p>
	 *
	 * 外部システムマスタを登録する<br>
	 */
	public class ExtSys_Upd01 extends MABCL_ExtSysReg_MC_A.ExtSys_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected <R extends MCDBContainer> void afterUpdate(MCList<R> dbc) {

			super.afterUpdate(dbc);

			for (R r : dbc) {
				if (r instanceof MAM_EXT_SYS_R) {
					// 一件チェック（外部システム区分＝6（ＥＤＩ（ＭＣＦ）））
					checkExtSysTyp((MAM_EXT_SYS_R) r);
					// 一件チェック（外部システム区分＝7（ＳＣＭ（ＭＤ）））
					checkExtSysTyp2((MAM_EXT_SYS_R) r);
				}
			}
		}

		/**
		 * 外部システム区分＝6（ＥＤＩ（ＭＣＦ））が重複していないかチェックします。
		 */
		protected void checkExtSysTyp(MAM_EXT_SYS_R r) {

			if (r.del_flg() || !MAC_EXT_SYS_TYP.isEDI_MCF(r.ext_sys_typ())) {
				return;
			}
			MAM_EXT_SYS_R t = MAM_EXT_SYS_R.create("T");
			int i = execDbCount("MABCL1500_MAM_EXT_SYS_S01", t,
					t.ext_sys_cd.neq(bind("ext_sys_cd"))
					.and(t.ext_sys_typ.eq(bind("ext_sys_typ")))
					.and(t.del_flg.eq(value(false))), r);
			if (i > 0) {
				getMsgList().add(new MCMessage(r, MAM_EXT_SYS_R.$ext_sys_typ, MABCL0317, toDispGUIIndex(r)));
			}
		}
		/**
		 * 外部システム区分＝7（ＳＣＭ（ＭＤ））が重複していないかチェックします。
		 */
		protected void checkExtSysTyp2(MAM_EXT_SYS_R r) {

			if (r.del_flg() || !MAC_EXT_SYS_TYP.isSCM_MD(r.ext_sys_typ())) {
				return;
			}
			MAM_EXT_SYS_R t = MAM_EXT_SYS_R.create("T");
			int i = execDbCount("MABCL1500_MAM_EXT_SYS_S02", t,
					t.ext_sys_cd.neq(bind("ext_sys_cd"))
					.and(t.ext_sys_typ.eq(bind("ext_sys_typ")))
					.and(t.del_flg.eq(value(false))), r);
			if (i > 0) {
				getMsgList().add(new MCMessage(r, MAM_EXT_SYS_R.$ext_sys_typ, MABCL0519, toDispGUIIndex(r)));
			}
		}
	}
	/**
	 * IfProtocol_UpdChk01オペレーション.<p>
	 *
	 * ＩＦ通信ルールマスタを登録する前のチェックを行う<br>
	 */
	public class IfProtocol_UpdChk01 extends MABCL_ExtSysReg_MC_A.IfProtocol_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			checkIfProcTyp(up0(), msgList);

			return msgList;
		}
	}

	/**
	 * IfProtocol_Upd01オペレーション.<p>
	 *
	 * ＩＦ通信ルールマスタを登録する<br>
	 */
	public class IfProtocol_Upd01 extends MABCL_ExtSysReg_MC_A.IfProtocol_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * IfAdapter_UpdChk01オペレーション.<p>
	 *
	 * ＩＦアダプタマスタを登録する前のチェックを行う<br>
	 */
	public class IfAdapter_UpdChk01 extends MABCL_ExtSysReg_MC_A.IfAdapter_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			checkIfProcTyp(up0(), msgList);

			return msgList;
		}
	}
	/**
	 * IfAdapter_Upd01オペレーション.<p>
	 *
	 * ＩＦアダプタマスタを登録する<br>
	 */
	public class IfAdapter_Upd01 extends MABCL_ExtSysReg_MC_A.IfAdapter_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * HttpHeader_UpdChk01オペレーション.<p>
	 *
	 * ＨＴＴＰヘッダマスタを登録する前のチェックを行う<br>
	 */
	public class HttpHeader_UpdChk01 extends MABCL_ExtSysReg_MC_A.HttpHeader_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			checkIfProcTyp(up0(), msgList);

			return msgList;
		}
	}
	/**
	 * HttpHeader_Upd01オペレーション.<p>
	 *
	 * ＨＴＴＰヘッダマスタを登録する<br>
	 */
	public class HttpHeader_Upd01 extends MABCL_ExtSysReg_MC_A.HttpHeader_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ExtSysUsr_UpdChk01オペレーション.<p>
	 *
	 * 外部システムユーザマスタを登録する前のチェックを行う<br>
	 */
	public class ExtSysUsr_UpdChk01 extends MABCL_ExtSysReg_MC_A.ExtSysUsr_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ExtSysUsr_Upd01オペレーション.<p>
	 *
	 * 外部システムユーザマスタを登録する<br>
	 */
	public class ExtSysUsr_Upd01 extends MABCL_ExtSysReg_MC_A.ExtSysUsr_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ExtSysLcl_UpdChk01オペレーション.<p>
	 *
	 * 外部システムマスタ(ロケール別情報)を登録する前のチェックを行う<br>
	 */
	public class ExtSysLcl_UpdChk01 extends MABCL_ExtSysReg_MC_A.ExtSysLcl_UpdChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ExtSysLcl_Upd01オペレーション.<p>
	 *
	 * 外部システムマスタ(ロケール別情報)を登録する<br>
	 */
	public class ExtSysLcl_Upd01 extends MABCL_ExtSysReg_MC_A.ExtSysLcl_Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ExtSys_DelChk01オペレーション.<p>
	 *
	 * 外部システムマスタ、ＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタ、外部システムユーザマスタ、外部システムマスタ(ロケール別情報)を削除する前のチェックを行う<br>
	 */
	public class ExtSys_DelChk01 extends MABCL_ExtSysReg_MC_A.ExtSys_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * ExtSys_Del01オペレーション.<p>
	 *
	 * 外部システムマスタ、ＩＦ通信ルールマスタ、ＩＦアダプタマスタ、ＨＴＴＰヘッダマスタ、外部システムユーザマスタ、外部システムマスタ(ロケール別情報)を削除する<br>
	 */
	public class ExtSys_Del01 extends MABCL_ExtSysReg_MC_A.ExtSys_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbLockDelUpdInsByStatusCheck(
				MCQueryApiBuilder builder, MCList<R> dbc, boolean updChk) {
			
			if ((dbc.createRow() instanceof MAM_IF_PROTOCOL_R) || (dbc.createRow() instanceof MAM_IF_ADAPTER_R) || (dbc.createRow() instanceof MAM_HTTP_HEADER_R) || (dbc.createRow() instanceof MAM_EXT_SYS_USR_R)) {
				dbDelLcl(builder, dbc);
			}
			else {
				super.dbLockDelUpdInsByStatusCheck(builder, dbc, updChk);
			}
		}

	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	public class Srch01 extends MABCL_ExtSysReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doItLcl() {
			super.doItLcl();
		}
		
		@Override
		protected java.util.List<java.lang.String> getSelectLclGrpNames() {
			List<String> l = new ArrayList<String>();
			l.add("SELECT_SUB1");
			l.add("SELECT_SUB2");
			l.add("SELECT_SUB3");
			l.add("SELECT_SUB4");
			l.addAll(super.getSelectLclGrpNames());

			return l;
		}

		@Override
		protected java.util.List<java.lang.String> getOtherSelectGrpNames() {
			return new ArrayList<String>();
		}
		
		@Override
		protected <R extends MCDBContainer> void dbcCustomizeLcl(MCQueryApiBuilder builder, MCList<R> rslt) {
			super.dbcCustomizeLcl(builder, rslt);
			if(builder.getBaseDbc() instanceof MAM_EXT_SYS_USR_R) {
				dbcCustomizeLclExtSysUsr(builder);
			}
		}

		protected <R extends MCDBContainer> void dbcCustomizeLclExtSysUsr(MCQueryApiBuilder builder) {
			MAM_USR_R usr1 = MAM_USR_R.create(MAM_EXT_SYS_USR_R.$USR1);
			MAM_EXT_SYS_R sys1 = MAM_EXT_SYS_R.create(MAM_EXT_SYS_USR_R.$EXT_SYS1);
			MAM_EXT_SYS_USR_R t = MAM_EXT_SYS_USR_R.create(builder.getBaseDbcAlias());
			
			//Select
			builder.addSelect(sys1.ext_sys_nm);
			builder.addSelect(usr1.usr_nm);
			//Join
			builder.addLeftOuterJoin(sys1,t.ext_sys_cd.eq(sys1.ext_sys_cd));
			builder.addLeftOuterJoin(usr1, t.usr_cd.eq(usr1.usr_cd));
		}

		@Override
		protected void down_SELECT_SUB1_c1_0(MCList<Srch01_Rslt2R> dest,
				MCList<MAM_IF_PROTOCOL_R> src) {
			
			super.down_SELECT_SUB1_c1_0(dest, src);
			// 定数．ＩＦ制御区分名
			MAUCL_MCDataUtil.setConstNm(dest);
			// 機能名の設定
			MAUCL_MCDataUtil.setFuncNm(dest);
		}

		@Override
		protected void down_SELECT_SUB2_c2_0(MCList<Srch01_Rslt3R> dest,
				MCList<MAM_IF_ADAPTER_R> src) {

			super.down_SELECT_SUB2_c2_0(dest, src);
			// 定数．ＩＦ処理区分名
			MAUCL_MCDataUtil.setConstNm(dest);
			// 機能名の設定
			MAUCL_MCDataUtil.setFuncNm(dest);
		}
		
		@Override
		protected void down_SELECT_SUB3_c3_0(MCList<Srch01_Rslt4R> dest,
				MCList<MAM_HTTP_HEADER_R> src) {

			super.down_SELECT_SUB3_c3_0(dest, src);
			// 定数．ＩＦ処理区分名
			MAUCL_MCDataUtil.setConstNm(dest);
			// 機能名の設定
			MAUCL_MCDataUtil.setFuncNm(dest);
		}
		
		@Override
		protected void down_SELECT_SUB4_c4_0(MCList<Srch01_Rslt5R> dest,
				MCList<MAM_EXT_SYS_USR_R> src) {
			super.down_SELECT_SUB4_c4_0(dest, src);
			
			// 機能名の設定
			MAUCL_MCDataUtil.setFuncNm(dest);
		}
		
	}
	
	
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	public class Upd01 extends MABCL_ExtSysReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理を行う<br>
	 */
	public class Del01 extends MABCL_ExtSysReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
	}

	// 以降、共通処理

	/**
	 * ＩＦ処理区分のチェック
	 */
	protected void checkIfProcTyp(MCList<? extends MCRow> list, MCMessageList msgList) {
		// 外部システムマスタのキャッシュ取得
		initExtSysCache(list);

		for(MCRow row : list){
			if (row.getBooleanNE("del_flg")) {
				continue;
			}

			String ifProcTyp = row.getString(MAM_IF_PROTOCOL_R.$if_proc_typ);
			if (!isNull(row.getString(MAM_IF_PROTOCOL_R.$if_proc_typ))) {
				String extSysCd = row.getString(MAM_IF_PROTOCOL_R.$ext_sys_cd);
				MAM_EXT_SYS_R extSysR = getExtSysR(extSysCd);
				if (MAC_EXT_SYS_TYP.isEDI(extSysR.ext_sys_typ()) || MAC_EXT_SYS_TYP.isEDI_MCF(extSysR.ext_sys_typ())) {
					if (!MAC_IF_PROC_TYP.get(ifProcTyp).is_edi() && !MAC_IF_PROC_TYP.get(ifProcTyp).is_all()) {
						msgList.add(new MCMessage(row, IfProtocol_UpdChk01_DtlR.$if_proc_typ, MABCL0272, extSysCd, extSysR.ext_sys_typ(), ifProcTyp));
					}
				}
				else if(MAC_EXT_SYS_TYP.isPLM(extSysR.ext_sys_typ())) {
					if (!MAC_IF_PROC_TYP.get(ifProcTyp).is_plm() && !MAC_IF_PROC_TYP.get(ifProcTyp).is_all()) {
						msgList.add(new MCMessage(row, IfProtocol_UpdChk01_DtlR.$if_proc_typ, MABCL0273, extSysCd, extSysR.ext_sys_typ(), ifProcTyp));
					}
				}
				else if(MAC_EXT_SYS_TYP.isBI(extSysR.ext_sys_typ())) {
					if (!MAC_IF_PROC_TYP.get(ifProcTyp).is_bi() && !MAC_IF_PROC_TYP.get(ifProcTyp).is_all()) {
						msgList.add(new MCMessage(row, IfProtocol_UpdChk01_DtlR.$if_proc_typ, MABCL0540, extSysCd, extSysR.ext_sys_typ(), ifProcTyp));
					}
				}
				else if(MAC_EXT_SYS_TYP.isAC(extSysR.ext_sys_typ())) {
					if (!MAC_IF_PROC_TYP.get(ifProcTyp).is_ac() && !MAC_IF_PROC_TYP.get(ifProcTyp).is_all()) {
						msgList.add(new MCMessage(row, IfProtocol_UpdChk01_DtlR.$if_proc_typ, MABCL0528, extSysCd, extSysR.ext_sys_typ(), ifProcTyp));
					}
				}
				else if (MAC_EXT_SYS_TYP.isSCM(extSysR.ext_sys_typ()) || MAC_EXT_SYS_TYP.isSCM_MD(extSysR.ext_sys_typ())) {
					if (!MAC_IF_PROC_TYP.get(ifProcTyp).is_scm() && !MAC_IF_PROC_TYP.get(ifProcTyp).is_all()) {
						msgList.add(new MCMessage(row, IfProtocol_UpdChk01_DtlR.$if_proc_typ, MABCL0529, extSysCd, extSysR.ext_sys_typ(), ifProcTyp));
					}
				}
				else if(MAC_EXT_SYS_TYP.isFB(extSysR.ext_sys_typ())) {
					if (!MAC_IF_PROC_TYP.get(ifProcTyp).is_fb() && !MAC_IF_PROC_TYP.get(ifProcTyp).is_all()) {
						msgList.add(new MCMessage(row, IfProtocol_UpdChk01_DtlR.$if_proc_typ, MABCL0530, extSysCd, extSysR.ext_sys_typ(), ifProcTyp));
					}
				}
				else if (MAC_EXT_SYS_TYP.isAC_SAP(extSysR.ext_sys_typ())) {
					if (!MAC_IF_PROC_TYP.get(ifProcTyp).is_sap() && !MAC_IF_PROC_TYP.get(ifProcTyp).is_all()) {
						msgList.add(new MCMessage(row, IfProtocol_UpdChk01_DtlR.$if_proc_typ, MABCL0702, extSysCd, extSysR.ext_sys_typ(), ifProcTyp));
					}
				}
				else if (MAC_EXT_SYS_TYP.isSCM_PCM(extSysR.ext_sys_typ())) {
					if (!MAC_IF_PROC_TYP.get(ifProcTyp).is_pcm() && !MAC_IF_PROC_TYP.get(ifProcTyp).is_all()) {
						msgList.add(new MCMessage(row, IfProtocol_UpdChk01_DtlR.$if_proc_typ, MABCL0705, extSysCd, extSysR.ext_sys_typ(), ifProcTyp));
					}
				}
				if ((row instanceof IfAdapter_UpdChk01_DtlR)) {
					if (extSysR.web_api_flg() || extSysR.cmd_exec_flg()) {
						if (!isNull(row.getString(MAM_IF_ADAPTER_R.$file_io_ope))) {
							msgList.add(new MCMessage(row, IfAdapter_UpdChk01_DtlR.$file_io_ope, MABCL0526, toDispGUIIndex(row)));
						}
					}
					if(!extSysR.web_api_flg()){
						if (!isNull(row.getString(MAM_IF_ADAPTER_R.$web_api_ope))) {
							msgList.add(new MCMessage(row, IfAdapter_UpdChk01_DtlR.$web_api_ope, MABCL0527, toDispGUIIndex(row)));
						}
					}
					if(!extSysR.cmd_exec_flg()) {
						if (!isNull(row.getString(MAM_IF_ADAPTER_R.$cmd_exec_ope))) {
							msgList.add(new MCMessage(row, IfAdapter_UpdChk01_DtlR.$cmd_exec_ope, MABCL0542, toDispGUIIndex(row)));
						}
					}
				}
			}
		}
	}

	protected static final Class<MABCL_ExtSysReg> CLAZZ = MABCL_ExtSysReg.class;

	/**
	 * MAM_EXT_SYS_キャッシュ
	 */
	protected static void initExtSysCache(MCList<?> list) {
		object(CLAZZ)._initExtSysCache(list);
	}
	protected FXUCL_MCDbcCache<MAM_EXT_SYS_R> _extSysCache = null;
	protected void _initExtSysCache(MCList<?> list) {
		_extSysCache = new FXUCL_MCDbcCache<MAM_EXT_SYS_R>(
				MCQueryApiBuilder.create(MAM_EXT_SYS_R.create("T")), list,
				MAM_EXT_SYS_R.$ext_sys_cd);
	}
	protected static FXUCL_MCDbcCache<MAM_EXT_SYS_R> getExtSysCache() {
		if (object(CLAZZ)._extSysCache == null) {
			object(CLAZZ)._initExtSysCache(MCList.create(MCRow.class));
		}
		return object(CLAZZ)._extSysCache;
	}
	protected static MAM_EXT_SYS_R getExtSysR(String extSysCd) {
		return getExtSysCache().get(extSysCd);
	}

	//FMCB CUSTOM END
}