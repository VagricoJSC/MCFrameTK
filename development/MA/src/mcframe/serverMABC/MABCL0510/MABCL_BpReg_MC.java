package mcframe.serverMABC.MABCL0510;

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
import mcframe.serverMABC.MABCL0420.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABC.MABCL0500.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABC.MABCL0520.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMABC.MABCL0510.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMAUD.MAUDL6010.*;
import java.util.List;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_BpReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_BpReg_MC extends MABCL_BpReg_MC_A{
	//FMCB CUSTOM START
	protected String _mstSetTyp;

	protected String getMstSetTyp() {
		if (_mstSetTyp == null) {
			MAUDL_RLUtil.Srch01 o = MAUDL_RLUtil.crtSrch01();
			o.up0().mst_nm(MAC_MST_NM.MAM_BP.value());
			o.exec();
			_mstSetTyp = o.down0().mst_set_typ();
		}
		return _mstSetTyp;
	}

	protected boolean isAllComCom() {
		return MAC_MST_SET_TYP.isALL_COM_COM(getMstSetTyp());
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 取引先マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_BpReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void up() {
			editUp();
			super.up();
		}
		protected void editUp() {
			up0().cst_flg(true);
			up0().acst_flg(true);
			up0().bcst_flg(true);
			up0().rcst_flg(true);
			up0().dlv_flg(true);
			up0().dest_flg(true);
			up0().cred_flg(true);
			up0().sppl_flg(true);
			up0().asppl_flg(true);
			up0().bsppl_flg(true);
			up0().psppl_flg(true);
			up0().maker_flg(true);
			up0().reg_flg(true);
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 取引先マスタの登録を行います。<br>
	 */
	public class Upd01 extends MABCL_BpReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Bp_DelChk01オペレーション.<p>
	 *
	 * 取引先マスタの削除を行います。<br>
	 */
	public class Bp_DelChk01 extends MABCL_BpReg_MC_A.Bp_DelChk01 {
		@Override
		protected void call() {
			super.call();
		}
	}
	/**
	 * Bp_Del01オペレーション.<p>
	 *
	 * 取引先マスタの削除を行います。<br>
	 */
	public class Bp_Del01 extends MABCL_BpReg_MC_A.Bp_Del01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected <R extends MCDBContainer> void dbLockDelUpdInsByStatusCheck(
				MCQueryApiBuilder builder, MCList<R> list, boolean updChk) {
			if (isSame(builder.getBaseDbc().tableName(),"MAM_BP_SUB")) {
				MAM_BP_SUB_R S0T = MAM_BP_SUB_R.create("T");

				MCDelete q = sql("MABCL0510_MAM_BP_SUB_D01")
					.delete(S0T)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0T.bp_cd.eq(bind("bp_cd")))
						.cutoff$and(S0T.st_dt.eq(bind("st_dt")))
						.cutoff$and(S0T.end_dt.eq(bind("end_dt")))
						.cutoff$and(S0T.zip_cd.eq(bind("zip_cd")))
						.cutoff$and(S0T.addr1.eq(bind("addr1")))
						.cutoff$and(S0T.addr2.eq(bind("addr2")))
						.cutoff$and(S0T.addr3.eq(bind("addr3")))
						.cutoff$and(S0T.addr4.eq(bind("addr4")))
						.cutoff$and(S0T.tel.eq(bind("tel")))
						.cutoff$and(S0T.fax.eq(bind("fax")))
						.cutoff$and(S0T.ar_dpt_cd.eq(bind("ar_dpt_cd")))
						.cutoff$and(S0T.cst_cntct_dpt.eq(bind("cst_cntct_dpt")))
						.cutoff$and(S0T.cst_cntct_psn.eq(bind("cst_cntct_psn")))
						.cutoff$and(S0T.cst_cntct_psn_title.eq(bind("cst_cntct_psn_title")))
						.cutoff$and(S0T.sls_tax_cd.eq(bind("sls_tax_cd")))
						.cutoff$and(S0T.sls_anly_cd1.eq(bind("sls_anly_cd1")))
						.cutoff$and(S0T.sls_anly_cd2.eq(bind("sls_anly_cd2")))
						.cutoff$and(S0T.sls_anly_cd3.eq(bind("sls_anly_cd3")))
						.cutoff$and(S0T.bcst_dpt_cd.eq(bind("bcst_dpt_cd")))
						.cutoff$and(S0T.bill_zip_cd.eq(bind("bill_zip_cd")))
						.cutoff$and(S0T.bill_addr1.eq(bind("bill_addr1")))
						.cutoff$and(S0T.bill_addr2.eq(bind("bill_addr2")))
						.cutoff$and(S0T.bill_addr3.eq(bind("bill_addr3")))
						.cutoff$and(S0T.bill_addr4.eq(bind("bill_addr4")))
						.cutoff$and(S0T.bill_tel.eq(bind("bill_tel")))
						.cutoff$and(S0T.bill_bcst_nm.eq(bind("bill_bcst_nm")))
						.cutoff$and(S0T.bill_bcst_dpt.eq(bind("bill_bcst_dpt")))
						.cutoff$and(S0T.bill_bcst_psn.eq(bind("bill_bcst_psn")))
						.cutoff$and(S0T.bill_bcst_psn_title.eq(bind("bill_bcst_psn_title")))
						.cutoff$and(S0T.vmi_purc_dpt_cd.eq(bind("vmi_purc_dpt_cd")))
						.cutoff$and(S0T.sppl_cntct_dpt.eq(bind("sppl_cntct_dpt")))
						.cutoff$and(S0T.sppl_cntct_psn.eq(bind("sppl_cntct_psn")))
						.cutoff$and(S0T.sppl_cntct_psn_title.eq(bind("sppl_cntct_psn_title")))
						.cutoff$and(S0T.purc_tax_cd.eq(bind("purc_tax_cd")))
						.cutoff$and(S0T.prov_tax_cd.eq(bind("prov_tax_cd")))
						.cutoff$and(S0T.ap_dpt_cd.eq(bind("ap_dpt_cd")))
						.cutoff$and(S0T.bsppl_dpt_cd.eq(bind("bsppl_dpt_cd")))
						.cutoff$and(S0T.pay_dpt_cd.eq(bind("pay_dpt_cd")))
						.cutoff$and(S0T.dlv_cntct_dpt.eq(bind("dlv_cntct_dpt")))
						.cutoff$and(S0T.dlv_cntct_psn.eq(bind("dlv_cntct_psn")))
						.cutoff$and(S0T.dlv_cntct_psn_title.eq(bind("dlv_cntct_psn_title")))
						.cutoff$and(S0T.memo1.eq(bind("memo1")))
						.cutoff$and(S0T.memo2.eq(bind("memo2")))
						.cutoff$and(S0T.memo3.eq(bind("memo3")))
						.cutoff$and(S0T.memo4.eq(bind("memo4")))
						.cutoff$and(S0T.memo5.eq(bind("memo5")))
						.cutoff$and(S0T.memo6.eq(bind("memo6")))
						.cutoff$and(S0T.memo7.eq(bind("memo7")))
						.cutoff$and(S0T.memo8.eq(bind("memo8")))
						.cutoff$and(S0T.memo9.eq(bind("memo9")))
						.cutoff$and(S0T.memo10.eq(bind("memo10")))
						.cutoff$and(S0T.memo11.eq(bind("memo11")))
						.cutoff$and(S0T.memo12.eq(bind("memo12")))
						.cutoff$and(S0T.memo13.eq(bind("memo13")))
						.cutoff$and(S0T.memo14.eq(bind("memo14")))
						.cutoff$and(S0T.memo15.eq(bind("memo15")))
						.cutoff$and(S0T.memo16.eq(bind("memo16")))
						.cutoff$and(S0T.memo17.eq(bind("memo17")))
						.cutoff$and(S0T.memo18.eq(bind("memo18")))
						.cutoff$and(S0T.memo19.eq(bind("memo19")))
						.cutoff$and(S0T.memo20.eq(bind("memo20")))
						.cutoff$and(S0T.del_usr_id.eq(bind("del_usr_id")))
						.cutoff$and(S0T.del_usr_nm.eq(bind("del_usr_nm")))
						.cutoff$and(S0T.del_ts.eq(bind("del_ts")))
						.cutoff$and(S0T.ins_usr_id.eq(bind("ins_usr_id")))
						.cutoff$and(S0T.ins_usr_nm.eq(bind("ins_usr_nm")))
						.cutoff$and(S0T.ins_ts.eq(bind("ins_ts")))
						.cutoff$and(S0T.ins_func_id.eq(bind("ins_func_id")))
						.cutoff$and(S0T.upd_cntr.eq(bind("upd_cntr")))
						.cutoff$and(S0T.upd_usr_id.eq(bind("upd_usr_id")))
						.cutoff$and(S0T.upd_usr_nm.eq(bind("upd_usr_nm")))
						.cutoff$and(S0T.upd_ts.eq(bind("upd_ts")))
						.cutoff$and(S0T.upd_func_id.eq(bind("upd_func_id")))
						.cutoff$and(S0T.upd_srv_req_no.eq(bind("upd_srv_req_no")))
					);
				q.executeBatchUpdate(list);
			}
			else {
				super.dbLockDelUpdInsByStatusCheck(builder, list, updChk);
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 取引先マスタの削除を行います。<br>
	 */
	public class Del01 extends MABCL_BpReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected List<String> getSortedCallOpeGrpNms() {
			List<String> opeL = super.getSortedCallOpeGrpNms();
			if(isAllComCom()) {
				opeL.remove("CALL_OPE01");
			} else {
				opeL.remove("CALL_OPE02");
			}
			return opeL;
		}
	}
	/**
	 * Bp_DelChk02オペレーション.<p>
	 *
	 * 取引先マスタ(共通・全社)の削除チェックを行います。<br>
	 */
	public class Bp_DelChk02 extends MABCL_BpReg_MC_A.Bp_DelChk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected mcframe.commonCore.notice.MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();
			chkUpdCntr(msgList);
			
			return msgList;
		}
		
		/**
		 * マスタ制御が「共通＆会社別」の場合は、プロシージャ経由でマスタを削除するので
		 * 更新カウンタチェックは個別に実装する。
		 */
		protected void chkUpdCntr(MCMessageList msgL) {
			MCMessageList updCntrMsgL = new MCMessageList();
			MCList<MAM_BP_CMN_R> lockCmnL = getLockBpCmn();
			MCList<MAM_BP_R> locAllL = getLockBp();
			MCIndexKey cmnIdxkey = lockCmnL.createIndex(MAM_BP_CMN_R.$bp_cd);
			MCIndexKey allIdxkey = locAllL.createIndex(MAM_BP_R.$bp_cd);
			
			// 更新カウンタチェック
			for(Bp_DelChk01_DtlR r : up0()) {
				// 取引先マスタ(共通)
				MAM_BP_CMN_R cmnLockR = lockCmnL.getFirst(cmnIdxkey, r.bp_cd());
				updCntrMsgL.addAll(checkUpdCntrNE(r, Bp_DelChk01_DtlR.$upd_cntr_c, cmnLockR));
				if (!updCntrMsgL.isEmpty()) {
					break;
				}
				// 取引先マスタ(全社)
				MAM_BP_R allLockR = locAllL.getFirst(allIdxkey, r.bp_cd());
				if(!isNull(r.upd_cntr()) || !isNull(allLockR)) {
					updCntrMsgL.addAll(checkUpdCntrNE(r, BpLst_DelChk01_DtlR.$upd_cntr, allLockR));
				}
			}
			msgL.addAll(updCntrMsgL);
		}
		
		/**
		 * 取引先マスタ（共通）のロックを取得する
		 * @return
		 */
		protected MCList<MAM_BP_CMN_R> getLockBpCmn() {
			MCList<MAM_BP_CMN_R> lockL = MCList.create(MAM_BP_CMN_R.class);
			MAM_BP_CMN_R t = MAM_BP_CMN_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.addSelect(t.upd_cntr.as("upd_cntr_c"));
			
			dbSelectKeyForUpdateNoWait("MABCL0510_MAM_BP_CMN_S01", lockL, bldr, up0());
			
			return lockL;
		}
		
		/**
		 * 取引先マスタ（全社）のロックを取得する
		 * @return
		 */
		protected MCList<MAM_BP_R> getLockBp() {
			MCList<Bp_DelChk01_DtlR> bindL = up0().clone();
			MCList<MAM_BP_R> lockL = MCList.create(MAM_BP_R.class);
			MAM_BP_R t = MAM_BP_R.create("T");
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
			bldr.setSelect(t.bp_cd, t.upd_cntr);
			
			dbSelectKeyForUpdateNoWait("MABCL0510_MAM_BP_S01", lockL, bldr, bindL);
			
			return lockL;
		}
	}
	/**
	 * Bp_Del02オペレーション.<p>
	 *
	 * 取引先マスタ(共通、全社)の削除を行います。<br>
	 */
	public class Bp_Del02 extends MABCL_BpReg_MC_A.Bp_Del02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			doDeleteBp();
		}
		protected void doDeleteBp() {
			// ワーク作成
			insBpWk(up0());
			
			// プロシージャで削除
			String procId = "MAPA_BP$P_DEL_BP";
			execProc(createSqlId(LOGIC_ID, procId, "01"), procId, null, null, null);
		}
		/**
		 * 取引先マスタの主キーワークテーブル作成
		 */
		protected void insBpWk(MCList<Bp_DelChk01_DtlR> dtlL) {
			MAW_BP_KEY_R S0T = MAW_BP_KEY_R.create("T");

			dbWkDelete("MABCL0510_MAW_BP_KEY_D01", MAM_BP_R.create());

			MCInsert q1 = sql("MABCL0510_MAW_BP_KEY_I01")
				.insert(S0T)
				.columns(
					S0T.bp_cd
				)
				.values(
					bind("bp_cd")
				);
			q1.executeBatchUpdate(dtlL);
		}
	}

	//FMCB CUSTOM END
}