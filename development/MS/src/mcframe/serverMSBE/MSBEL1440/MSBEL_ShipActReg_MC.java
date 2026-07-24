package mcframe.serverMSBE.MSBEL1440;

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
import mcframe.serverMB.dbc.*;
import mcframe.serverMS.dbc.*;
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import mcframe.commonMS.constant.*;
import static mcframe.commonMS.notice.MS_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMS.dbc.MSFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMS.dbc.MSBAFunction.*;
import static mcframe.serverMS.dbc.MSBBFunction.*;
import static mcframe.serverMS.dbc.MSBCFunction.*;
import static mcframe.serverMS.dbc.MSBDFunction.*;
import static mcframe.serverMS.dbc.MSBEFunction.*;
import static mcframe.serverMS.dbc.MSBFFunction.*;
import static mcframe.serverMS.dbc.MSBGFunction.*;
import static mcframe.serverMS.dbc.MSBHFunction.*;
import static mcframe.serverMS.dbc.MSBIFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMSBE.MSBEL1440.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL1440.Query.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMSBE.MSBEL5540.*;
import mcframe.serverMSBE.MSBEL5550.*;
import mcframe.serverMSUC.MSUCL0090.*;
import mcframe.serverMAUC.MAUCL5020.*;
import java.util.Map;
import java.util.HashMap;
import java.util.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_ShipActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_ShipActReg_MC extends MSBEL_ShipActReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 出荷実績の登録前チェックをする。<br>
	 */
	public class Chk01 extends MSBEL_ShipActReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				// 出荷実績チェック処理
				callShipActChkSrv();
			}
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック
			msgL.addAll(chkUpdCntrShipPr());
			msgL.addAll(chkUpdCntrShipAct());

			// DACチェック
			msgL.addAll(chkLgGrpDac());

			return msgL;
		}

		@Override
		protected MCMessageList updCntChkReq() {
			MCMessageList msgL = super.updCntChkReq();
			if (MAC_DATA_CRUD_TYP.isUPD(up0().data_crud_typ())) {
				msgL.addAll(check(up0(), Chk01_HdrR.$ship_act_no, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up0(), Chk01_HdrR.$ship_act_upd_cntr, new FXUCL_RequiredValidater()));
			}
			if (!up0().uplnd_flg()) {
				msgL.addAll(check(up2(), Chk01_CntrR.$ship_alloc_sts_no, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up2(), Chk01_CntrR.$ship_pr_no, new FXUCL_RequiredValidater()));
				msgL.addAll(check(up2(), Chk01_CntrR.$ship_pr_upd_cntr, new FXUCL_RequiredValidater()));
			}
			return msgL;
		}

		/**
		 * 出荷進捗に対する更新カウンタチェック
		 * 
		 * @param shipPrL	出荷進捗
		 */
		protected MCMessageList chkUpdCntrShipPr() {
			MCMessageList msgL = new MCMessageList();

			// 計画外以外
			if (!up0().uplnd_flg()) {
				up2().sort(Chk01_CntrR.$ship_pr_no);
				MCList<MST_SHIP_PR_R> l = MCList.create(MST_SHIP_PR_R.class);
				MST_SHIP_PR_R t = MST_SHIP_PR_R.create("T");
				MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
				l_bldr.setSelect(t.ship_pr_no, t.upd_cntr);
				l_bldr.setOrderByAsc(l_bldr.getBaseDbc().getKeyColumn$());
				dbSelectKeyForUpdateNoWait("MSBEL1440_MST_SHIP_PR_S01", l, l_bldr, up2());
				MCIndexKey idx = l.createIndex(MST_SHIP_PR_R.$ship_pr_no);

				MCIndexKey idx2 = up2().createIndex(Chk01_CntrR.$ship_alloc_sts_no);
				for (Chk01_DtlR r : up1()) {
					MCList<Chk01_CntrR> cntrL = up2().subList(idx2, r.ship_alloc_sts_no());
					for (Chk01_CntrR cntrR : cntrL) {
						Chk01_CntrR tmpR = cntrR.clone();
						tmpR.setAttributes(r);

						MST_SHIP_PR_R lockR = l.getFirst(idx, tmpR.ship_pr_no());
						msgL.addAll(
							checkUpdCntrNE(
								tmpR, Chk01_CntrR.$ship_pr_upd_cntr, lockR));
					}
					setErrFlg(r, msgL);
				}
			}
			return msgL;
		}

		/**
		 * 出荷実績に対する更新カウンタチェック
		 * 
		 * @param shipActR	出荷実績
		 */
		protected MCMessageList chkUpdCntrShipAct() {
			MCMessageList msgL = new MCMessageList();

			if (hasErrFlgOn(up1())) {
				return msgL;
			}
			// 更新のみ
			if (MAC_DATA_CRUD_TYP.isUPD(up0().data_crud_typ())) {
				MST_SHIP_ACT_R r = MST_SHIP_ACT_R.create();
				MST_SHIP_ACT_R t = MST_SHIP_ACT_R.create("T");
				MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
				r_bldr.setSelect(t.ship_act_no, t.upd_cntr);
				r_bldr.setWhere(t.ship_act_no.eq(bind("ship_act_no")));
				r_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
				dbSelectForUpdateNoWait("MSBEL1440_MST_SHIP_ACT_S01", r, r_bldr, up0());

				msgL.addAll(
					checkUpdCntrNE(
						up0(), Chk01_HdrR.$ship_act_upd_cntr, r));
			}
			return msgL;
		}

		/**
		 * 出荷実績SV 更新前チェック処理を実行する
		 */
		protected void callShipActChkSrv() {
			MSBEL_ShipActService.ShipAct_InptChk01 o = MSBEL_ShipActService.crtShipAct_InptChk01();
			copy(o.up0().add(), up0(), createMap_ShipAct_InptChk01_HdrR_Chk01_HdrR());
			setAll(o.up1(), up1(), createMap_ShipAct_InptChk01_DtlR_Chk01_DtlR());
			setAll(o.up2(), up2(), createMap_ShipAct_InptChk01_CntrR_Chk01_CntrR());
			o.exec();

			copy(up0(), o.down0().get(0), createMap_Chk01_HdrR_ShipAct_InptChk01_HdrR());
			setAll(up1(), o.down1(), createMap_Chk01_DtlR_ShipAct_InptChk01_DtlR());
		}

		/**
		 * 出荷元物流Ｇに対するDACチェック
		 */
		protected MCMessageList chkLgGrpDac() {
			return checkWritableLgGrpCdDac(up0(), Chk01_HdrR.$ship_fr_lg_grp_cd);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}

		protected Map_ShipAct_InptChk01_HdrR_Chk01_HdrR<ShipAct_InptChk01_HdrR, Chk01_HdrR> createMap_ShipAct_InptChk01_HdrR_Chk01_HdrR() {
			return new Map_ShipAct_InptChk01_HdrR_Chk01_HdrR<ShipAct_InptChk01_HdrR, Chk01_HdrR>();
		}
		public class Map_ShipAct_InptChk01_HdrR_Chk01_HdrR<D extends ShipAct_InptChk01_HdrR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipAct_InptChk01_HdrR.$data_crud_typ, Chk01_HdrR.$data_crud_typ);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_act_no, Chk01_HdrR.$ship_act_no);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_inst_no, Chk01_HdrR.$ship_inst_no);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ac_dt, Chk01_HdrR.$ac_dt);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$can_ac_dt, Chk01_HdrR.$can_ac_dt);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_tm, Chk01_HdrR.$ship_tm);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$dlv_tm, Chk01_HdrR.$dlv_tm);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$rqst_usr_cd, Chk01_HdrR.$rqst_usr_cd);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$rqst_dpt_cd, Chk01_HdrR.$rqst_dpt_cd);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_fr_lg_grp_cd, Chk01_HdrR.$ship_fr_lg_grp_cd);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_usr_cd, Chk01_HdrR.$ship_usr_cd);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_dpt_cd, Chk01_HdrR.$ship_dpt_cd);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$cst_cd, Chk01_HdrR.$cst_cd);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_to_id_typ, Chk01_HdrR.$ship_to_id_typ);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_to_id_cd, Chk01_HdrR.$ship_to_id_cd);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_to_id_nm, Chk01_HdrR.$ship_to_id_nm);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_to_zip_cd, Chk01_HdrR.$ship_to_zip_cd);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_to_addr1, Chk01_HdrR.$ship_to_addr1);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_to_addr2, Chk01_HdrR.$ship_to_addr2);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_to_addr3, Chk01_HdrR.$ship_to_addr3);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_to_addr4, Chk01_HdrR.$ship_to_addr4);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_to_cntct_dpt, Chk01_HdrR.$ship_to_cntct_dpt);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_to_cntct_psn, Chk01_HdrR.$ship_to_cntct_psn);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_to_tel, Chk01_HdrR.$ship_to_tel);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_to_fax, Chk01_HdrR.$ship_to_fax);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$via_dlv_typ, Chk01_HdrR.$via_dlv_typ);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$iv_no, Chk01_HdrR.$iv_no);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$dlv_slip_no, Chk01_HdrR.$dlv_slip_no);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$uplnd_flg, Chk01_HdrR.$uplnd_flg);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$dlv_slip_prnt_flg, Chk01_HdrR.$dlv_slip_prnt_flg);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$ship_adv_prnt_flg, Chk01_HdrR.$ship_adv_prnt_flg);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$lot_chk_off_flg, Chk01_HdrR.$lot_chk_off_flg);
				addColumnPathMap(ShipAct_InptChk01_HdrR.$peg_no, Chk01_HdrR.$peg_no);
			}
		}
		protected Map_ShipAct_InptChk01_DtlR_Chk01_DtlR<ShipAct_InptChk01_DtlR, Chk01_DtlR> createMap_ShipAct_InptChk01_DtlR_Chk01_DtlR() {
			return new Map_ShipAct_InptChk01_DtlR_Chk01_DtlR<ShipAct_InptChk01_DtlR, Chk01_DtlR>();
		}
		public class Map_ShipAct_InptChk01_DtlR_Chk01_DtlR<D extends ShipAct_InptChk01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipAct_InptChk01_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$ship_act_d_no, Chk01_DtlR.$ship_act_d_no);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$ship_alloc_sts_no, Chk01_DtlR.$ship_alloc_sts_no);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$trd_cd, Chk01_DtlR.$trd_cd);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$ship_loc_cd, Chk01_DtlR.$ship_loc_cd);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$ship_str_ln_cd, Chk01_DtlR.$ship_str_ln_cd);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$dlv_id_typ, Chk01_DtlR.$dlv_id_typ);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$dlv_id_cd, Chk01_DtlR.$dlv_id_cd);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$dlv_id_nm, Chk01_DtlR.$dlv_id_nm);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$dlv_zip_cd, Chk01_DtlR.$dlv_zip_cd);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$dlv_addr1, Chk01_DtlR.$dlv_addr1);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$dlv_addr2, Chk01_DtlR.$dlv_addr2);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$dlv_addr3, Chk01_DtlR.$dlv_addr3);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$dlv_addr4, Chk01_DtlR.$dlv_addr4);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$dlv_cntct_dpt, Chk01_DtlR.$dlv_cntct_dpt);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$dlv_cntct_psn, Chk01_DtlR.$dlv_cntct_psn);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$dlv_tel, Chk01_DtlR.$dlv_tel);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$dlv_fax, Chk01_DtlR.$dlv_fax);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$dlv_str_ln_cd, Chk01_DtlR.$dlv_str_ln_cd);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$pri_prnt_flg, Chk01_DtlR.$pri_prnt_flg);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$iv_itm_nm, Chk01_DtlR.$iv_itm_nm);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$sno1, Chk01_DtlR.$sno1);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$sno2, Chk01_DtlR.$sno2);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$sno3, Chk01_DtlR.$sno3);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$sno4, Chk01_DtlR.$sno4);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$lot_no, Chk01_DtlR.$lot_no);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$sublot_no, Chk01_DtlR.$sublot_no);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$ver_no, Chk01_DtlR.$ver_no);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$stk_arrv_bp_cd, Chk01_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$gd_cd, Chk01_DtlR.$gd_cd);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$quality_typ, Chk01_DtlR.$quality_typ);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$stk_id_typ, Chk01_DtlR.$stk_id_typ);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$stk_bp_cd, Chk01_DtlR.$stk_bp_cd);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$rsn_cd, Chk01_DtlR.$rsn_cd);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$cst_po_no, Chk01_DtlR.$cst_po_no);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$cst_po_d_no, Chk01_DtlR.$cst_po_d_no);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$cst_dlv_inst_no, Chk01_DtlR.$cst_dlv_inst_no);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$cst_dlv_inst_d_no, Chk01_DtlR.$cst_dlv_inst_d_no);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$cst_itm_cd, Chk01_DtlR.$cst_itm_cd);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$cst_itm_nm, Chk01_DtlR.$cst_itm_nm);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$base_dlv_slip_no, Chk01_DtlR.$base_dlv_slip_no);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$base_prov_act_no, Chk01_DtlR.$base_prov_act_no);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$base_ac_dt, Chk01_DtlR.$base_ac_dt);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$arr_cnt_rmrks, Chk01_DtlR.$arr_cnt_rmrks);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$trd_rmrks, Chk01_DtlR.$trd_rmrks);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$trd_d_rmrks, Chk01_DtlR.$trd_d_rmrks);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$intr_d_rmrks, Chk01_DtlR.$intr_d_rmrks);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$dlv_slip_d_no, Chk01_DtlR.$dlv_slip_d_no);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$dlv_slip_no, Chk01_DtlR.$dlv_slip_no);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$abort_flg, Chk01_DtlR.$abort_flg);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$skip_chk_ship_flg, Chk01_DtlR.$skip_chk_ship_flg);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$iv_no, Chk01_DtlR.$iv_no);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$iv_d_no, Chk01_DtlR.$iv_d_no);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$hdr_peg_no, Chk01_DtlR.$hdr_peg_no);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$not_lot_mix_flg, Chk01_DtlR.$not_lot_mix_flg);
				addColumnPathMap(ShipAct_InptChk01_DtlR.$not_sublot_mix_flg, Chk01_DtlR.$not_sublot_mix_flg);
			}
		}
		protected Map_ShipAct_InptChk01_CntrR_Chk01_CntrR<ShipAct_InptChk01_CntrR, Chk01_CntrR> createMap_ShipAct_InptChk01_CntrR_Chk01_CntrR() {
			return new Map_ShipAct_InptChk01_CntrR_Chk01_CntrR<ShipAct_InptChk01_CntrR, Chk01_CntrR>();
		}
		public class Map_ShipAct_InptChk01_CntrR_Chk01_CntrR<D extends ShipAct_InptChk01_CntrR, S extends Chk01_CntrR> extends MCRowMapper<D,S>{
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipAct_InptChk01_CntrR.$ship_alloc_sts_no, Chk01_CntrR.$ship_alloc_sts_no);
				addColumnPathMap(ShipAct_InptChk01_CntrR.$ship_pr_no, Chk01_CntrR.$ship_pr_no);
			}
		}

		protected Map_Chk01_HdrR_ShipAct_InptChk01_HdrR<Chk01_HdrR, ShipAct_InptChk01_HdrR> createMap_Chk01_HdrR_ShipAct_InptChk01_HdrR() {
			return new Map_Chk01_HdrR_ShipAct_InptChk01_HdrR<Chk01_HdrR, ShipAct_InptChk01_HdrR>();
		}
		public class Map_Chk01_HdrR_ShipAct_InptChk01_HdrR<D extends Chk01_HdrR, S extends ShipAct_InptChk01_HdrR> extends MCRowMapper<D,S>{
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_HdrR.$data_crud_typ, ShipAct_InptChk01_HdrR.$data_crud_typ);
				addColumnPathMap(Chk01_HdrR.$ship_act_no, ShipAct_InptChk01_HdrR.$ship_act_no);
				addColumnPathMap(Chk01_HdrR.$ship_inst_no, ShipAct_InptChk01_HdrR.$ship_inst_no);
				addColumnPathMap(Chk01_HdrR.$ac_dt, ShipAct_InptChk01_HdrR.$ac_dt);
				addColumnPathMap(Chk01_HdrR.$can_ac_dt, ShipAct_InptChk01_HdrR.$can_ac_dt);
				addColumnPathMap(Chk01_HdrR.$ship_tm, ShipAct_InptChk01_HdrR.$ship_tm);
				addColumnPathMap(Chk01_HdrR.$dlv_tm, ShipAct_InptChk01_HdrR.$dlv_tm);
				addColumnPathMap(Chk01_HdrR.$rqst_usr_cd, ShipAct_InptChk01_HdrR.$rqst_usr_cd);
				addColumnPathMap(Chk01_HdrR.$rqst_dpt_cd, ShipAct_InptChk01_HdrR.$rqst_dpt_cd);
				addColumnPathMap(Chk01_HdrR.$ship_fr_lg_grp_cd, ShipAct_InptChk01_HdrR.$ship_fr_lg_grp_cd);
				addColumnPathMap(Chk01_HdrR.$wg_cd, ShipAct_InptChk01_HdrR.$wg_cd);
				addColumnPathMap(Chk01_HdrR.$ship_term_cd, ShipAct_InptChk01_HdrR.$ship_term_cd);
				addColumnPathMap(Chk01_HdrR.$ship_usr_cd, ShipAct_InptChk01_HdrR.$ship_usr_cd);
				addColumnPathMap(Chk01_HdrR.$ship_dpt_cd, ShipAct_InptChk01_HdrR.$ship_dpt_cd);
				addColumnPathMap(Chk01_HdrR.$cst_cd, ShipAct_InptChk01_HdrR.$cst_cd);
				addColumnPathMap(Chk01_HdrR.$ship_to_id_typ, ShipAct_InptChk01_HdrR.$ship_to_id_typ);
				addColumnPathMap(Chk01_HdrR.$ship_to_id_cd, ShipAct_InptChk01_HdrR.$ship_to_id_cd);
				addColumnPathMap(Chk01_HdrR.$ship_to_id_nm, ShipAct_InptChk01_HdrR.$ship_to_id_nm);
				addColumnPathMap(Chk01_HdrR.$ship_to_zip_cd, ShipAct_InptChk01_HdrR.$ship_to_zip_cd);
				addColumnPathMap(Chk01_HdrR.$ship_to_addr1, ShipAct_InptChk01_HdrR.$ship_to_addr1);
				addColumnPathMap(Chk01_HdrR.$ship_to_addr2, ShipAct_InptChk01_HdrR.$ship_to_addr2);
				addColumnPathMap(Chk01_HdrR.$ship_to_addr3, ShipAct_InptChk01_HdrR.$ship_to_addr3);
				addColumnPathMap(Chk01_HdrR.$ship_to_addr4, ShipAct_InptChk01_HdrR.$ship_to_addr4);
				addColumnPathMap(Chk01_HdrR.$ship_to_cntct_dpt, ShipAct_InptChk01_HdrR.$ship_to_cntct_dpt);
				addColumnPathMap(Chk01_HdrR.$ship_to_cntct_psn, ShipAct_InptChk01_HdrR.$ship_to_cntct_psn);
				addColumnPathMap(Chk01_HdrR.$ship_to_tel, ShipAct_InptChk01_HdrR.$ship_to_tel);
				addColumnPathMap(Chk01_HdrR.$ship_to_fax, ShipAct_InptChk01_HdrR.$ship_to_fax);
				addColumnPathMap(Chk01_HdrR.$ship_to_sundry_flg, ShipAct_InptChk01_HdrR.$ship_to_sundry_flg);
				addColumnPathMap(Chk01_HdrR.$via_dlv_typ, ShipAct_InptChk01_HdrR.$via_dlv_typ);
				addColumnPathMap(Chk01_HdrR.$ship_to_lg_grp_cd, ShipAct_InptChk01_HdrR.$ship_to_lg_grp_cd);
				addColumnPathMap(Chk01_HdrR.$iv_no, ShipAct_InptChk01_HdrR.$iv_no);
				addColumnPathMap(Chk01_HdrR.$dlv_slip_no, ShipAct_InptChk01_HdrR.$dlv_slip_no);
				addColumnPathMap(Chk01_HdrR.$uplnd_flg, ShipAct_InptChk01_HdrR.$uplnd_flg);
				addColumnPathMap(Chk01_HdrR.$intr_rmrks, ShipAct_InptChk01_HdrR.$intr_rmrks);
				addColumnPathMap(Chk01_HdrR.$sub_char1, ShipAct_InptChk01_HdrR.$sub_char1);
				addColumnPathMap(Chk01_HdrR.$sub_char2, ShipAct_InptChk01_HdrR.$sub_char2);
				addColumnPathMap(Chk01_HdrR.$sub_char3, ShipAct_InptChk01_HdrR.$sub_char3);
				addColumnPathMap(Chk01_HdrR.$dlv_slip_prnt_flg, ShipAct_InptChk01_HdrR.$dlv_slip_prnt_flg);
				addColumnPathMap(Chk01_HdrR.$ship_adv_prnt_flg, ShipAct_InptChk01_HdrR.$ship_adv_prnt_flg);
				addColumnPathMap(Chk01_HdrR.$lot_chk_off_flg, ShipAct_InptChk01_HdrR.$lot_chk_off_flg);
				addColumnPathMap(Chk01_HdrR.$peg_no, ShipAct_InptChk01_HdrR.$peg_no);
				addColumnPathMap(Chk01_HdrR.$err_flg, ShipAct_InptChk01_HdrR.$err_flg);
			}
		}
		protected Map_Chk01_DtlR_ShipAct_InptChk01_DtlR<Chk01_DtlR, ShipAct_InptChk01_DtlR> createMap_Chk01_DtlR_ShipAct_InptChk01_DtlR() {
			return new Map_Chk01_DtlR_ShipAct_InptChk01_DtlR<Chk01_DtlR, ShipAct_InptChk01_DtlR>();
		}
		public class Map_Chk01_DtlR_ShipAct_InptChk01_DtlR<D extends Chk01_DtlR, S extends ShipAct_InptChk01_DtlR> extends MCRowMapper<D,S>{
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_DtlR.$data_crud_typ, ShipAct_InptChk01_DtlR.$data_crud_typ);
				addColumnPathMap(Chk01_DtlR.$ship_act_d_no, ShipAct_InptChk01_DtlR.$ship_act_d_no);
				addColumnPathMap(Chk01_DtlR.$disp_seq, ShipAct_InptChk01_DtlR.$disp_seq);
				addColumnPathMap(Chk01_DtlR.$ship_alloc_sts_no, ShipAct_InptChk01_DtlR.$ship_alloc_sts_no);
				addColumnPathMap(Chk01_DtlR.$trd_cd, ShipAct_InptChk01_DtlR.$trd_cd);
				addColumnPathMap(Chk01_DtlR.$trd_ptn_typ, ShipAct_InptChk01_DtlR.$trd_ptn_typ);
				addColumnPathMap(Chk01_DtlR.$ship_loc_cd, ShipAct_InptChk01_DtlR.$ship_loc_cd);
				addColumnPathMap(Chk01_DtlR.$ship_str_ln_cd, ShipAct_InptChk01_DtlR.$ship_str_ln_cd);
				addColumnPathMap(Chk01_DtlR.$dlv_id_typ, ShipAct_InptChk01_DtlR.$dlv_id_typ);
				addColumnPathMap(Chk01_DtlR.$dlv_id_cd, ShipAct_InptChk01_DtlR.$dlv_id_cd);
				addColumnPathMap(Chk01_DtlR.$dlv_id_nm, ShipAct_InptChk01_DtlR.$dlv_id_nm);
				addColumnPathMap(Chk01_DtlR.$dlv_zip_cd, ShipAct_InptChk01_DtlR.$dlv_zip_cd);
				addColumnPathMap(Chk01_DtlR.$dlv_addr1, ShipAct_InptChk01_DtlR.$dlv_addr1);
				addColumnPathMap(Chk01_DtlR.$dlv_addr2, ShipAct_InptChk01_DtlR.$dlv_addr2);
				addColumnPathMap(Chk01_DtlR.$dlv_addr3, ShipAct_InptChk01_DtlR.$dlv_addr3);
				addColumnPathMap(Chk01_DtlR.$dlv_addr4, ShipAct_InptChk01_DtlR.$dlv_addr4);
				addColumnPathMap(Chk01_DtlR.$dlv_cntct_dpt, ShipAct_InptChk01_DtlR.$dlv_cntct_dpt);
				addColumnPathMap(Chk01_DtlR.$dlv_cntct_psn, ShipAct_InptChk01_DtlR.$dlv_cntct_psn);
				addColumnPathMap(Chk01_DtlR.$dlv_tel, ShipAct_InptChk01_DtlR.$dlv_tel);
				addColumnPathMap(Chk01_DtlR.$dlv_fax, ShipAct_InptChk01_DtlR.$dlv_fax);
				addColumnPathMap(Chk01_DtlR.$dlv_sundry_flg, ShipAct_InptChk01_DtlR.$dlv_sundry_flg);
				addColumnPathMap(Chk01_DtlR.$dlv_str_ln_cd, ShipAct_InptChk01_DtlR.$dlv_str_ln_cd);
				addColumnPathMap(Chk01_DtlR.$pri_prnt_flg, ShipAct_InptChk01_DtlR.$pri_prnt_flg);
				addColumnPathMap(Chk01_DtlR.$itm_cd, ShipAct_InptChk01_DtlR.$itm_cd);
				addColumnPathMap(Chk01_DtlR.$itm_sub1, ShipAct_InptChk01_DtlR.$itm_sub1);
				addColumnPathMap(Chk01_DtlR.$itm_sub2, ShipAct_InptChk01_DtlR.$itm_sub2);
				addColumnPathMap(Chk01_DtlR.$itm_sub3, ShipAct_InptChk01_DtlR.$itm_sub3);
				addColumnPathMap(Chk01_DtlR.$itm_nm, ShipAct_InptChk01_DtlR.$itm_nm);
				addColumnPathMap(Chk01_DtlR.$iv_itm_nm, ShipAct_InptChk01_DtlR.$iv_itm_nm);
				addColumnPathMap(Chk01_DtlR.$sundry_itm_flg, ShipAct_InptChk01_DtlR.$sundry_itm_flg);
				addColumnPathMap(Chk01_DtlR.$stk_mng_typ, ShipAct_InptChk01_DtlR.$stk_mng_typ);
				addColumnPathMap(Chk01_DtlR.$sno1_mng_typ, ShipAct_InptChk01_DtlR.$sno1_mng_typ);
				addColumnPathMap(Chk01_DtlR.$sno2_mng_typ, ShipAct_InptChk01_DtlR.$sno2_mng_typ);
				addColumnPathMap(Chk01_DtlR.$sno3_mng_typ, ShipAct_InptChk01_DtlR.$sno3_mng_typ);
				addColumnPathMap(Chk01_DtlR.$sno4_mng_typ, ShipAct_InptChk01_DtlR.$sno4_mng_typ);
				addColumnPathMap(Chk01_DtlR.$sno1, ShipAct_InptChk01_DtlR.$sno1);
				addColumnPathMap(Chk01_DtlR.$sno2, ShipAct_InptChk01_DtlR.$sno2);
				addColumnPathMap(Chk01_DtlR.$sno3, ShipAct_InptChk01_DtlR.$sno3);
				addColumnPathMap(Chk01_DtlR.$sno4, ShipAct_InptChk01_DtlR.$sno4);
				addColumnPathMap(Chk01_DtlR.$lot_no, ShipAct_InptChk01_DtlR.$lot_no);
				addColumnPathMap(Chk01_DtlR.$sublot_no, ShipAct_InptChk01_DtlR.$sublot_no);
				addColumnPathMap(Chk01_DtlR.$ver_no, ShipAct_InptChk01_DtlR.$ver_no);
				addColumnPathMap(Chk01_DtlR.$stk_arrv_bp_cd, ShipAct_InptChk01_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(Chk01_DtlR.$gd_cd, ShipAct_InptChk01_DtlR.$gd_cd);
				addColumnPathMap(Chk01_DtlR.$quality_typ, ShipAct_InptChk01_DtlR.$quality_typ);
				addColumnPathMap(Chk01_DtlR.$stk_id_typ, ShipAct_InptChk01_DtlR.$stk_id_typ);
				addColumnPathMap(Chk01_DtlR.$stk_bp_cd, ShipAct_InptChk01_DtlR.$stk_bp_cd);
				addColumnPathMap(Chk01_DtlR.$trd_unit_qty, ShipAct_InptChk01_DtlR.$trd_unit_qty);
				addColumnPathMap(Chk01_DtlR.$trd_unit_cd, ShipAct_InptChk01_DtlR.$trd_unit_cd);
				addColumnPathMap(Chk01_DtlR.$base_unit_qty, ShipAct_InptChk01_DtlR.$base_unit_qty);
				addColumnPathMap(Chk01_DtlR.$base_unit_cd, ShipAct_InptChk01_DtlR.$base_unit_cd);
				addColumnPathMap(Chk01_DtlR.$rsn_cd, ShipAct_InptChk01_DtlR.$rsn_cd);
				addColumnPathMap(Chk01_DtlR.$bd_dpt_cd, ShipAct_InptChk01_DtlR.$bd_dpt_cd);
				addColumnPathMap(Chk01_DtlR.$bd_dpt_nm, ShipAct_InptChk01_DtlR.$bd_dpt_nm);
				addColumnPathMap(Chk01_DtlR.$cst_po_no, ShipAct_InptChk01_DtlR.$cst_po_no);
				addColumnPathMap(Chk01_DtlR.$cst_po_d_no, ShipAct_InptChk01_DtlR.$cst_po_d_no);
				addColumnPathMap(Chk01_DtlR.$cst_dlv_inst_no, ShipAct_InptChk01_DtlR.$cst_dlv_inst_no);
				addColumnPathMap(Chk01_DtlR.$cst_dlv_inst_d_no, ShipAct_InptChk01_DtlR.$cst_dlv_inst_d_no);
				addColumnPathMap(Chk01_DtlR.$cst_itm_cd, ShipAct_InptChk01_DtlR.$cst_itm_cd);
				addColumnPathMap(Chk01_DtlR.$cst_itm_nm, ShipAct_InptChk01_DtlR.$cst_itm_nm);
				addColumnPathMap(Chk01_DtlR.$base_dlv_slip_no, ShipAct_InptChk01_DtlR.$base_dlv_slip_no);
				addColumnPathMap(Chk01_DtlR.$base_prov_act_no, ShipAct_InptChk01_DtlR.$base_prov_act_no);
				addColumnPathMap(Chk01_DtlR.$base_ac_dt, ShipAct_InptChk01_DtlR.$base_ac_dt);
				addColumnPathMap(Chk01_DtlR.$arr_cnt_rmrks, ShipAct_InptChk01_DtlR.$arr_cnt_rmrks);
				addColumnPathMap(Chk01_DtlR.$trd_rmrks, ShipAct_InptChk01_DtlR.$trd_rmrks);
				addColumnPathMap(Chk01_DtlR.$trd_d_rmrks, ShipAct_InptChk01_DtlR.$trd_d_rmrks);
				addColumnPathMap(Chk01_DtlR.$intr_d_rmrks, ShipAct_InptChk01_DtlR.$intr_d_rmrks);
				addColumnPathMap(Chk01_DtlR.$io_schd_pr_no, ShipAct_InptChk01_DtlR.$io_schd_pr_no);
				addColumnPathMap(Chk01_DtlR.$sub_char1, ShipAct_InptChk01_DtlR.$sub_char1);
				addColumnPathMap(Chk01_DtlR.$sub_char2, ShipAct_InptChk01_DtlR.$sub_char2);
				addColumnPathMap(Chk01_DtlR.$sub_char3, ShipAct_InptChk01_DtlR.$sub_char3);
				addColumnPathMap(Chk01_DtlR.$dlv_slip_d_no, ShipAct_InptChk01_DtlR.$dlv_slip_d_no);
				addColumnPathMap(Chk01_DtlR.$dlv_slip_no, ShipAct_InptChk01_DtlR.$dlv_slip_no);
				addColumnPathMap(Chk01_DtlR.$abort_flg, ShipAct_InptChk01_DtlR.$abort_flg);
				addColumnPathMap(Chk01_DtlR.$skip_chk_ship_flg, ShipAct_InptChk01_DtlR.$skip_chk_ship_flg);
				addColumnPathMap(Chk01_DtlR.$non_upd_flg, ShipAct_InptChk01_DtlR.$non_upd_flg);
				addColumnPathMap(Chk01_DtlR.$prov_typ, ShipAct_InptChk01_DtlR.$prov_typ);
				addColumnPathMap(Chk01_DtlR.$prov_basis_typ, ShipAct_InptChk01_DtlR.$prov_basis_typ);
				addColumnPathMap(Chk01_DtlR.$hdr_peg_no, ShipAct_InptChk01_DtlR.$hdr_peg_no);
				addColumnPathMap(Chk01_DtlR.$iv_d_no, ShipAct_InptChk01_DtlR.$iv_d_no);
				addColumnPathMap(Chk01_DtlR.$iv_no, ShipAct_InptChk01_DtlR.$iv_no);
				addColumnPathMap(Chk01_DtlR.$peg_no, ShipAct_InptChk01_DtlR.$peg_no);
				addColumnPathMap(Chk01_DtlR.$err_flg, ShipAct_InptChk01_DtlR.$err_flg);
			}
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 出荷実績の削除前チェックをする。<br>
	 */
	public class Chk02 extends MSBEL_ShipActReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				// 出荷実績チェック処理
				callShipActChkSrv();
			}
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック
			msgL.addAll(chkUpdCntrShipPr());
			msgL.addAll(chkUpdCntrShipAct());

			// DACチェック
			msgL.addAll(chkLgGrpDac());

			return msgL;
		}

		/**
		 * 出荷進捗に対する更新カウンタチェック
		 * 
		 * @param shipPrL	出荷進捗
		 */
		protected MCMessageList chkUpdCntrShipPr() {
			MCMessageList msgL = new MCMessageList();

			// 計画外以外
			if (!up0().uplnd_flg()) {
				up1().sort(Chk01_CntrR.$ship_pr_no);
				MCList<MST_SHIP_PR_R> l = MCList.create(MST_SHIP_PR_R.class);
				MST_SHIP_PR_R t = MST_SHIP_PR_R.create("T");
				MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
				l_bldr.setSelect(t.ship_pr_no, t.upd_cntr);
				dbSelectKeyForUpdateNoWait("MSBEL1440_MST_SHIP_PR_S02", l, l_bldr, up1());
				MCIndexKey idx = l.createIndex(MST_SHIP_PR_R.$ship_pr_no);

				for (Chk01_CntrR r : up1()) {
					MST_SHIP_PR_R lockR = l.getFirst(idx, r.ship_pr_no());
					msgL.addAll(
						checkUpdCntrNE(
							r, Chk01_CntrR.$ship_pr_upd_cntr, lockR));
				}
				if (!msgL.isEmpty()) {
					up0().err_flg(true);
				}
			}
			return msgL;
		}

		/**
		 * 出荷実績に対する更新カウンタチェック
		 * 
		 * @param shipActR	出荷実績
		 */
		protected MCMessageList chkUpdCntrShipAct() {
			MCMessageList msgL = new MCMessageList();

			MST_SHIP_ACT_R r = MST_SHIP_ACT_R.create();
			MST_SHIP_ACT_R t = MST_SHIP_ACT_R.create("T");
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
			r_bldr.setSelect(t.ship_act_no, t.ship_fr_lg_grp_cd, t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBEL1440_MST_SHIP_ACT_S02", r, r_bldr, up0());

			if (!hasErrFlgOn(up0())) {
				msgL.addAll(
					checkUpdCntrNE(
						up0(), Chk01_HdrR.$ship_act_upd_cntr, r));
			}

			up0().ship_fr_lg_grp_cd(r.ship_fr_lg_grp_cd());
			return msgL;
		}

		/**
		 * 出荷元物流Ｇに対するDACチェック
		 */
		protected MCMessageList chkLgGrpDac() {
			// 出荷元物流Ｇは更新カウンタ取得時に設定
			return checkWritableLgGrpCdDac(up0(), ShipAct_InptChk02_HdrR.$ship_fr_lg_grp_cd);
		}

		/**
		 * 出荷実績SV 更新前チェック処理を実行する
		 */
		protected void callShipActChkSrv() {
			MSBEL_ShipActService.ShipAct_InptChk02 o = MSBEL_ShipActService.crtShipAct_InptChk02();
			copy(o.up0().add(), up0(), createMap_ShipAct_InptChk02_HdrR_Chk02_HdrR());
			setAll(o.up1(), up1(), createMap_ShipAct_InptChk02_CntrR_Chk02_CntrR());
			o.exec();

			copy(up0(), o.down0().get(0), createMap_Chk02_HdrR_ShipAct_InptChk02_HdrR());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		protected Map_ShipAct_InptChk02_HdrR_Chk02_HdrR<ShipAct_InptChk02_HdrR, Chk02_HdrR> createMap_ShipAct_InptChk02_HdrR_Chk02_HdrR() {
			return new Map_ShipAct_InptChk02_HdrR_Chk02_HdrR<ShipAct_InptChk02_HdrR, Chk02_HdrR>();
		}
		public class Map_ShipAct_InptChk02_HdrR_Chk02_HdrR<D extends ShipAct_InptChk02_HdrR, S extends Chk02_HdrR> extends MCRowMapper<D,S>{
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipAct_InptChk02_HdrR.$data_crud_typ, Chk02_HdrR.$data_crud_typ);
				addColumnPathMap(ShipAct_InptChk02_HdrR.$ship_act_no, Chk02_HdrR.$ship_act_no);
				addColumnPathMap(ShipAct_InptChk02_HdrR.$can_ac_dt, Chk02_HdrR.$can_ac_dt);
				addColumnPathMap(ShipAct_InptChk02_HdrR.$dlv_slip_prnt_flg, Chk02_HdrR.$dlv_slip_prnt_flg);
				addColumnPathMap(ShipAct_InptChk02_HdrR.$peg_no, Chk02_HdrR.$peg_no);
			}
		}
		protected Map_ShipAct_InptChk02_CntrR_Chk02_CntrR<ShipAct_InptChk01_CntrR, Chk01_CntrR> createMap_ShipAct_InptChk02_CntrR_Chk02_CntrR() {
			return new Map_ShipAct_InptChk02_CntrR_Chk02_CntrR<ShipAct_InptChk01_CntrR, Chk01_CntrR>();
		}
		public class Map_ShipAct_InptChk02_CntrR_Chk02_CntrR<D extends ShipAct_InptChk01_CntrR, S extends Chk01_CntrR> extends MCRowMapper<D,S>{
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipAct_InptChk01_CntrR.$ship_alloc_sts_no, Chk01_CntrR.$ship_alloc_sts_no);
				addColumnPathMap(ShipAct_InptChk01_CntrR.$ship_pr_no, Chk01_CntrR.$ship_pr_no);
			}
		}
	
		protected Map_Chk02_HdrR_ShipAct_InptChk02_HdrR<Chk02_HdrR, ShipAct_InptChk02_HdrR> createMap_Chk02_HdrR_ShipAct_InptChk02_HdrR() {
			return new Map_Chk02_HdrR_ShipAct_InptChk02_HdrR<Chk02_HdrR, ShipAct_InptChk02_HdrR>();
		}
		public class Map_Chk02_HdrR_ShipAct_InptChk02_HdrR<D extends Chk02_HdrR, S extends ShipAct_InptChk02_HdrR> extends MCRowMapper<D,S>{
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_HdrR.$data_crud_typ, ShipAct_InptChk02_HdrR.$data_crud_typ);
				addColumnPathMap(Chk02_HdrR.$ship_act_no, ShipAct_InptChk02_HdrR.$ship_act_no);
				addColumnPathMap(Chk02_HdrR.$can_ac_dt, ShipAct_InptChk02_HdrR.$can_ac_dt);
				addColumnPathMap(Chk02_HdrR.$dlv_slip_prnt_flg, ShipAct_InptChk02_HdrR.$dlv_slip_prnt_flg);
				addColumnPathMap(Chk02_HdrR.$peg_no, ShipAct_InptChk02_HdrR.$peg_no);
				addColumnPathMap(Chk02_HdrR.$err_flg, ShipAct_InptChk02_HdrR.$err_flg);
			}
		}
	}

	/**
	 * Chk04オペレーション.<p>
	 *
	 * 納品書、出荷案内書の発行前チェックをする。<br>
	 */
	public class Chk04 extends MSBEL_ShipActReg_MC_A.Chk04 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				// 特に無し
			}
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 更新カウンタチェック
			msgL.addAll(chkUpdCntrShipAct());
			msgL.addAll(chkShipActD());

			return msgL;
		}

		/**
		 * 出荷実績に対する更新カウンタチェック
		 */
		protected MCMessageList chkUpdCntrShipAct() {
			MCMessageList msgL = new MCMessageList();

			MST_SHIP_ACT_R r = MST_SHIP_ACT_R.create();
			MST_SHIP_ACT_R t = MST_SHIP_ACT_R.create("T");
			MCQueryApiBuilder r_bldr = MCQueryApiBuilder.create(t);
			r_bldr.setSelect(t.ship_act_no, t.can_flg, t.upd_cntr);
			dbSelectKeyForUpdateNoWait("MSBEL1440_MST_SHIP_ACT_S03", r, r_bldr, up0());
			up0().can_flg(r.can_flg());
			
			msgL.addAll(
				checkUpdCntrNE(
					up0(), Chk01_HdrR.$ship_act_upd_cntr, r));

			return msgL;
		}
		protected MCMessageList chkShipActD() {
			MCMessageList msgL = new MCMessageList();

			for (Chk04_DtlR r : up1()) {
				if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					if (isNull(r.base_ac_dt())) {
						msgL.add(new MCMessage(r, Chk04_DtlR.$base_ac_dt, MSBEL1105 ,toDispGUIIndex(r)));
					}
				}
			}

			return msgL;
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 出荷指図済み、指図対象外、および計画外の出荷実績を登録する。<br>
	 */
	public class Ins01 extends MSBEL_ShipActReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 初期処理
			editUp();

			// チェック処理
			callThisChk01();
			throwUpdErr();

			// メイン処理
			callShipActSrv();

			// 下り電文設定
			setDown();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(up0());
			setPegNo(up1());
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			up1().forEach(r -> {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				r.hdr_peg_no(up0().peg_no());
			});
		}

		/**
		 * 登録前チェック処理を実行する
		 */
		protected void callThisChk01() {

			MSBEL_ShipActReg.Chk01 o = MSBEL_ShipActReg.crtChk01();
			MCRow.copyall(o.up0(), up0());
			o.up1().setAll(up1());
			o.up2().setAll(up2());
			o.exec();

			MCRow.copyall(up0(), o.down0());
			up1().setAll(o.down1());
		}

		/**
		 * 出荷実績SVを呼び出す
		 */
		protected void callShipActSrv() {
			MSBEL_ShipActService.ShipAct_Upd01 o = MSBEL_ShipActService.crtShipAct_Upd01();
			copy(o.up0().add(), up0(), createMap_ShipAct_HdrR_Chk01_HdrR());
			setAll(o.up1(), up1(), createMap_ShipAct_DtlR_Chk01_DtlR());
			o.up2().bndl_prnt_flg(!up3().indiv_prnt_flg());
			o.exec();

			copy(up0(), o.down0().get(0), createMap_Chk01_HdrR_ShipAct_HdrR());
			setAll(up1(), o.down1(), createMap_Chk01_DtlR_ShipAct_DtlR());
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}

		protected Map_ShipAct_HdrR_Chk01_HdrR<ShipAct_HdrR, Chk01_HdrR> createMap_ShipAct_HdrR_Chk01_HdrR() {
			return new Map_ShipAct_HdrR_Chk01_HdrR<ShipAct_HdrR, Chk01_HdrR>();
		}
		public class Map_ShipAct_HdrR_Chk01_HdrR<D extends ShipAct_HdrR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipAct_HdrR.$data_crud_typ, Chk01_HdrR.$data_crud_typ);
				addColumnPathMap(ShipAct_HdrR.$ship_inst_no, Chk01_HdrR.$ship_inst_no);
				addColumnPathMap(ShipAct_HdrR.$ac_dt, Chk01_HdrR.$ac_dt);
				addColumnPathMap(ShipAct_HdrR.$ship_tm, Chk01_HdrR.$ship_tm);
				addColumnPathMap(ShipAct_HdrR.$dlv_tm, Chk01_HdrR.$dlv_tm);
				addColumnPathMap(ShipAct_HdrR.$rqst_dpt_cd, Chk01_HdrR.$rqst_dpt_cd);
				addColumnPathMap(ShipAct_HdrR.$rqst_usr_cd, Chk01_HdrR.$rqst_usr_cd);
				addColumnPathMap(ShipAct_HdrR.$ship_fr_lg_grp_cd, Chk01_HdrR.$ship_fr_lg_grp_cd);
				addColumnPathMap(ShipAct_HdrR.$wg_cd, Chk01_HdrR.$wg_cd);
				addColumnPathMap(ShipAct_HdrR.$ship_term_cd, Chk01_HdrR.$ship_term_cd);
				addColumnPathMap(ShipAct_HdrR.$ship_dpt_cd, Chk01_HdrR.$ship_dpt_cd);
				addColumnPathMap(ShipAct_HdrR.$ship_usr_cd, Chk01_HdrR.$ship_usr_cd);
				addColumnPathMap(ShipAct_HdrR.$ship_to_lg_grp_cd, Chk01_HdrR.$ship_to_lg_grp_cd);
				addColumnPathMap(ShipAct_HdrR.$cst_cd, Chk01_HdrR.$cst_cd);
				addColumnPathMap(ShipAct_HdrR.$ship_to_id_typ, Chk01_HdrR.$ship_to_id_typ);
				addColumnPathMap(ShipAct_HdrR.$ship_to_id_cd, Chk01_HdrR.$ship_to_id_cd);
				addColumnPathMap(ShipAct_HdrR.$ship_to_id_nm, Chk01_HdrR.$ship_to_id_nm);
				addColumnPathMap(ShipAct_HdrR.$ship_to_zip_cd, Chk01_HdrR.$ship_to_zip_cd);
				addColumnPathMap(ShipAct_HdrR.$ship_to_addr1, Chk01_HdrR.$ship_to_addr1);
				addColumnPathMap(ShipAct_HdrR.$ship_to_addr2, Chk01_HdrR.$ship_to_addr2);
				addColumnPathMap(ShipAct_HdrR.$ship_to_addr3, Chk01_HdrR.$ship_to_addr3);
				addColumnPathMap(ShipAct_HdrR.$ship_to_addr4, Chk01_HdrR.$ship_to_addr4);
				addColumnPathMap(ShipAct_HdrR.$ship_to_cntct_dpt, Chk01_HdrR.$ship_to_cntct_dpt);
				addColumnPathMap(ShipAct_HdrR.$ship_to_cntct_psn, Chk01_HdrR.$ship_to_cntct_psn);
				addColumnPathMap(ShipAct_HdrR.$ship_to_tel, Chk01_HdrR.$ship_to_tel);
				addColumnPathMap(ShipAct_HdrR.$ship_to_fax, Chk01_HdrR.$ship_to_fax);
				addColumnPathMap(ShipAct_HdrR.$ship_to_sundry_flg, Chk01_HdrR.$ship_to_sundry_flg);
				addColumnPathMap(ShipAct_HdrR.$via_dlv_typ, Chk01_HdrR.$via_dlv_typ);
				addColumnPathMap(ShipAct_HdrR.$iv_no, Chk01_HdrR.$iv_no);
				addColumnPathMap(ShipAct_HdrR.$uplnd_flg, Chk01_HdrR.$uplnd_flg);
				addColumnPathMap(ShipAct_HdrR.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
				addColumnPathMap(ShipAct_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
				addColumnPathMap(ShipAct_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
				addColumnPathMap(ShipAct_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);
				addColumnPathMap(ShipAct_HdrR.$dlv_slip_prnt_flg, Chk01_HdrR.$dlv_slip_prnt_flg);
				addColumnPathMap(ShipAct_HdrR.$ship_adv_prnt_flg, Chk01_HdrR.$ship_adv_prnt_flg);
				addColumnPathMap(ShipAct_HdrR.$lot_chk_off_flg, Chk01_HdrR.$lot_chk_off_flg);
				addColumnPathMap(ShipAct_HdrR.$peg_no, Chk01_HdrR.$peg_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.dlv_slip_flg(true);
				dest.io_act_flg(true);
				dest.sls_act_flg(true);
			}
		}
		protected Map_ShipAct_DtlR_Chk01_DtlR<ShipAct_DtlR, Chk01_DtlR> createMap_ShipAct_DtlR_Chk01_DtlR() {
			return new Map_ShipAct_DtlR_Chk01_DtlR<ShipAct_DtlR, Chk01_DtlR>();
		}
		public class Map_ShipAct_DtlR_Chk01_DtlR<D extends ShipAct_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipAct_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(ShipAct_DtlR.$disp_seq, Chk01_DtlR.$disp_seq);
				addColumnPathMap(ShipAct_DtlR.$ship_alloc_sts_no, Chk01_DtlR.$ship_alloc_sts_no);
				addColumnPathMap(ShipAct_DtlR.$trd_cd, Chk01_DtlR.$trd_cd);
				addColumnPathMap(ShipAct_DtlR.$trd_ptn_typ, Chk01_DtlR.$trd_ptn_typ);
				addColumnPathMap(ShipAct_DtlR.$ship_loc_cd, Chk01_DtlR.$ship_loc_cd);
				addColumnPathMap(ShipAct_DtlR.$ship_str_ln_cd, Chk01_DtlR.$ship_str_ln_cd);
				addColumnPathMap(ShipAct_DtlR.$dlv_id_typ, Chk01_DtlR.$dlv_id_typ);
				addColumnPathMap(ShipAct_DtlR.$dlv_id_cd, Chk01_DtlR.$dlv_id_cd);
				addColumnPathMap(ShipAct_DtlR.$dlv_id_nm, Chk01_DtlR.$dlv_id_nm);
				addColumnPathMap(ShipAct_DtlR.$dlv_zip_cd, Chk01_DtlR.$dlv_zip_cd);
				addColumnPathMap(ShipAct_DtlR.$dlv_addr1, Chk01_DtlR.$dlv_addr1);
				addColumnPathMap(ShipAct_DtlR.$dlv_addr2, Chk01_DtlR.$dlv_addr2);
				addColumnPathMap(ShipAct_DtlR.$dlv_addr3, Chk01_DtlR.$dlv_addr3);
				addColumnPathMap(ShipAct_DtlR.$dlv_addr4, Chk01_DtlR.$dlv_addr4);
				addColumnPathMap(ShipAct_DtlR.$dlv_cntct_dpt, Chk01_DtlR.$dlv_cntct_dpt);
				addColumnPathMap(ShipAct_DtlR.$dlv_cntct_psn, Chk01_DtlR.$dlv_cntct_psn);
				addColumnPathMap(ShipAct_DtlR.$dlv_tel, Chk01_DtlR.$dlv_tel);
				addColumnPathMap(ShipAct_DtlR.$dlv_fax, Chk01_DtlR.$dlv_fax);
				addColumnPathMap(ShipAct_DtlR.$dlv_sundry_flg, Chk01_DtlR.$dlv_sundry_flg);
				addColumnPathMap(ShipAct_DtlR.$dlv_str_ln_cd, Chk01_DtlR.$dlv_str_ln_cd);
				addColumnPathMap(ShipAct_DtlR.$pri_prnt_flg, Chk01_DtlR.$pri_prnt_flg);
				addColumnPathMap(ShipAct_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(ShipAct_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(ShipAct_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(ShipAct_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(ShipAct_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);
				addColumnPathMap(ShipAct_DtlR.$iv_itm_nm, Chk01_DtlR.$iv_itm_nm);
				addColumnPathMap(ShipAct_DtlR.$sundry_itm_flg, Chk01_DtlR.$sundry_itm_flg);
				addColumnPathMap(ShipAct_DtlR.$stk_mng_typ, Chk01_DtlR.$stk_mng_typ);
				addColumnPathMap(ShipAct_DtlR.$sno1_mng_typ, Chk01_DtlR.$sno1_mng_typ);
				addColumnPathMap(ShipAct_DtlR.$sno2_mng_typ, Chk01_DtlR.$sno2_mng_typ);
				addColumnPathMap(ShipAct_DtlR.$sno3_mng_typ, Chk01_DtlR.$sno3_mng_typ);
				addColumnPathMap(ShipAct_DtlR.$sno4_mng_typ, Chk01_DtlR.$sno4_mng_typ);
				addColumnPathMap(ShipAct_DtlR.$sno1, Chk01_DtlR.$sno1);
				addColumnPathMap(ShipAct_DtlR.$sno2, Chk01_DtlR.$sno2);
				addColumnPathMap(ShipAct_DtlR.$sno3, Chk01_DtlR.$sno3);
				addColumnPathMap(ShipAct_DtlR.$sno4, Chk01_DtlR.$sno4);
				addColumnPathMap(ShipAct_DtlR.$lot_no, Chk01_DtlR.$lot_no);
				addColumnPathMap(ShipAct_DtlR.$sublot_no, Chk01_DtlR.$sublot_no);
				addColumnPathMap(ShipAct_DtlR.$ver_no, Chk01_DtlR.$ver_no);
				addColumnPathMap(ShipAct_DtlR.$stk_arrv_bp_cd, Chk01_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(ShipAct_DtlR.$gd_cd, Chk01_DtlR.$gd_cd);
				addColumnPathMap(ShipAct_DtlR.$quality_typ, Chk01_DtlR.$quality_typ);
				addColumnPathMap(ShipAct_DtlR.$stk_id_typ, Chk01_DtlR.$stk_id_typ);
				addColumnPathMap(ShipAct_DtlR.$stk_bp_cd, Chk01_DtlR.$stk_bp_cd);
				addColumnPathMap(ShipAct_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(ShipAct_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(ShipAct_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(ShipAct_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
				addColumnPathMap(ShipAct_DtlR.$rsn_cd, Chk01_DtlR.$rsn_cd);
				addColumnPathMap(ShipAct_DtlR.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
				addColumnPathMap(ShipAct_DtlR.$bd_dpt_nm, Chk01_DtlR.$bd_dpt_nm);
				addColumnPathMap(ShipAct_DtlR.$cst_po_no, Chk01_DtlR.$cst_po_no);
				addColumnPathMap(ShipAct_DtlR.$cst_po_d_no, Chk01_DtlR.$cst_po_d_no);
				addColumnPathMap(ShipAct_DtlR.$cst_dlv_inst_no, Chk01_DtlR.$cst_dlv_inst_no);
				addColumnPathMap(ShipAct_DtlR.$cst_dlv_inst_d_no, Chk01_DtlR.$cst_dlv_inst_d_no);
				addColumnPathMap(ShipAct_DtlR.$cst_itm_cd, Chk01_DtlR.$cst_itm_cd);
				addColumnPathMap(ShipAct_DtlR.$cst_itm_nm, Chk01_DtlR.$cst_itm_nm);
				addColumnPathMap(ShipAct_DtlR.$base_dlv_slip_no, Chk01_DtlR.$base_dlv_slip_no);
				addColumnPathMap(ShipAct_DtlR.$base_prov_act_no, Chk01_DtlR.$base_prov_act_no);
				addColumnPathMap(ShipAct_DtlR.$base_ac_dt, Chk01_DtlR.$base_ac_dt);
				addColumnPathMap(ShipAct_DtlR.$arr_cnt_rmrks, Chk01_DtlR.$arr_cnt_rmrks);
				addColumnPathMap(ShipAct_DtlR.$trd_rmrks, Chk01_DtlR.$trd_rmrks);
				addColumnPathMap(ShipAct_DtlR.$trd_d_rmrks, Chk01_DtlR.$trd_d_rmrks);
				addColumnPathMap(ShipAct_DtlR.$intr_d_rmrks, Chk01_DtlR.$intr_d_rmrks);
				addColumnPathMap(ShipAct_DtlR.$io_schd_pr_no, Chk01_DtlR.$io_schd_pr_no);
				addColumnPathMap(ShipAct_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
				addColumnPathMap(ShipAct_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
				addColumnPathMap(ShipAct_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
				addColumnPathMap(ShipAct_DtlR.$abort_flg, Chk01_DtlR.$abort_flg);
				addColumnPathMap(ShipAct_DtlR.$skip_chk_ship_flg, Chk01_DtlR.$skip_chk_ship_flg);
				addColumnPathMap(ShipAct_DtlR.$prov_typ, Chk01_DtlR.$prov_typ);
				addColumnPathMap(ShipAct_DtlR.$prov_basis_typ, Chk01_DtlR.$prov_basis_typ);
				addColumnPathMap(ShipAct_DtlR.$iv_no, Chk01_DtlR.$iv_no);
				addColumnPathMap(ShipAct_DtlR.$iv_d_no, Chk01_DtlR.$iv_d_no);
				addColumnPathMap(ShipAct_DtlR.$hdr_peg_no, Chk01_DtlR.$hdr_peg_no);
				addColumnPathMap(ShipAct_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			}
		}

		protected Map_Chk01_HdrR_ShipAct_HdrR<Chk01_HdrR, ShipAct_HdrR> createMap_Chk01_HdrR_ShipAct_HdrR() {
			return new Map_Chk01_HdrR_ShipAct_HdrR<Chk01_HdrR, ShipAct_HdrR>();
		}
		public class Map_Chk01_HdrR_ShipAct_HdrR<D extends Chk01_HdrR, S extends ShipAct_HdrR> extends MCRowMapper<D,S>{
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_HdrR.$ship_act_no, ShipAct_HdrR.$ship_act_no);
				addColumnPathMap(Chk01_HdrR.$ship_act_rev, ShipAct_HdrR.$ship_act_rev);
				addColumnPathMap(Chk01_HdrR.$dlv_slip_prnted_flg, ShipAct_HdrR.$dlv_slip_prnted_flg);
				addColumnPathMap(Chk01_HdrR.$ship_adv_prnted_flg, ShipAct_HdrR.$ship_adv_prnted_flg);
			}
		}
		protected Map_Chk01_DtlR_ShipAct_DtlR<Chk01_DtlR, ShipAct_DtlR> createMap_Chk01_DtlR_ShipAct_DtlR() {
			return new Map_Chk01_DtlR_ShipAct_DtlR<Chk01_DtlR, ShipAct_DtlR>();
		}
		public class Map_Chk01_DtlR_ShipAct_DtlR<D extends Chk01_DtlR, S extends ShipAct_DtlR> extends MCRowMapper<D,S>{
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_DtlR.$ship_act_d_no, ShipAct_DtlR.$ship_act_d_no);
				addColumnPathMap(Chk01_DtlR.$ship_act_no, ShipAct_DtlR.$ship_act_no);
				addColumnPathMap(Chk01_DtlR.$dlv_slip_d_no, ShipAct_DtlR.$dlv_slip_d_no);
				addColumnPathMap(Chk01_DtlR.$dlv_slip_no, ShipAct_DtlR.$dlv_slip_no);
				addColumnPathMap(Chk01_DtlR.$pr_sts_typ, ShipAct_DtlR.$pr_sts_typ);
				addColumnPathMap(Chk01_DtlR.$pr_sts_typ_nm, ShipAct_DtlR.$pr_sts_typ_nm);
				addColumnPathMap(Chk01_DtlR.$peg_no, ShipAct_DtlR.$peg_no);
				addColumnPathMap(Chk01_DtlR.$bd_dpt_cd, ShipAct_DtlR.$bd_dpt_cd);
				addColumnPathMap(Chk01_DtlR.$bd_dpt_nm, ShipAct_DtlR.$bd_dpt_nm);
			}
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 出荷実績を更新する。<br>
	 */
	public class Upd01 extends MSBEL_ShipActReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {

			// 初期処理
			editUp();
			
			// チェック処理
			callThisChk01();
			throwUpdErr();
			
			// メイン処理
			callShipActSrv();

			// 下り電文設定
			setDown();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(up0());
			setPegNo(up1());
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
			up1().forEach(r -> {
				if (r.isStatusDelete()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else if (r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				r.hdr_peg_no(up0().peg_no());
			});
		}

		/**
		 * 登録前チェック処理を実行する
		 */
		protected void callThisChk01() {

			MSBEL_ShipActReg.Chk01 o = MSBEL_ShipActReg.crtChk01();
			MCRow.copyall(o.up0(), up0());
			o.up1().setAll(up1());
			o.up2().setAll(up2());
			o.exec();
			
			MCRow.copyall(up0(), o.down0());
			up1().setAll(o.down1());
		}

		/**
		 * 出荷実績SVを呼び出す
		 */
		protected void callShipActSrv() {
			MSBEL_ShipActService.ShipAct_Upd01 o = MSBEL_ShipActService.crtShipAct_Upd01();
			copy(o.up0().add(), up0(), createMap_ShipAct_HdrR_Chk01_HdrR());
			setAll(o.up1(), up1(), createMap_ShipAct_DtlR_Chk01_DtlR());
			o.up2().bndl_prnt_flg(!up3().indiv_prnt_flg());
			o.exec();

			copy(up0(), o.down0().get(0), createMap_Chk01_HdrR_ShipAct_HdrR());
			setAll(up1(), o.down1(), createMap_Chk01_DtlR_ShipAct_DtlR());
		}

		/**
		 * 下り電文を設定する
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
		}

		protected Map_ShipAct_HdrR_Chk01_HdrR<ShipAct_HdrR, Chk01_HdrR> createMap_ShipAct_HdrR_Chk01_HdrR() {
			return new Map_ShipAct_HdrR_Chk01_HdrR<ShipAct_HdrR, Chk01_HdrR>();
		}
		public class Map_ShipAct_HdrR_Chk01_HdrR<D extends ShipAct_HdrR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipAct_HdrR.$data_crud_typ, Chk01_HdrR.$data_crud_typ);
				addColumnPathMap(ShipAct_HdrR.$ship_act_no, Chk01_HdrR.$ship_act_no);
				addColumnPathMap(ShipAct_HdrR.$ship_inst_no, Chk01_HdrR.$ship_inst_no);
				addColumnPathMap(ShipAct_HdrR.$ac_dt, Chk01_HdrR.$ac_dt);
				addColumnPathMap(ShipAct_HdrR.$can_ac_dt, Chk01_HdrR.$can_ac_dt);
				addColumnPathMap(ShipAct_HdrR.$ship_tm, Chk01_HdrR.$ship_tm);
				addColumnPathMap(ShipAct_HdrR.$dlv_tm, Chk01_HdrR.$dlv_tm);
				addColumnPathMap(ShipAct_HdrR.$rqst_dpt_cd, Chk01_HdrR.$rqst_dpt_cd);
				addColumnPathMap(ShipAct_HdrR.$rqst_usr_cd, Chk01_HdrR.$rqst_usr_cd);
				addColumnPathMap(ShipAct_HdrR.$ship_fr_lg_grp_cd, Chk01_HdrR.$ship_fr_lg_grp_cd);
				addColumnPathMap(ShipAct_HdrR.$wg_cd, Chk01_HdrR.$wg_cd);
				addColumnPathMap(ShipAct_HdrR.$ship_term_cd, Chk01_HdrR.$ship_term_cd);
				addColumnPathMap(ShipAct_HdrR.$ship_dpt_cd, Chk01_HdrR.$ship_dpt_cd);
				addColumnPathMap(ShipAct_HdrR.$ship_usr_cd, Chk01_HdrR.$ship_usr_cd);
				addColumnPathMap(ShipAct_HdrR.$ship_to_lg_grp_cd, Chk01_HdrR.$ship_to_lg_grp_cd);
				addColumnPathMap(ShipAct_HdrR.$cst_cd, Chk01_HdrR.$cst_cd);
				addColumnPathMap(ShipAct_HdrR.$ship_to_id_typ, Chk01_HdrR.$ship_to_id_typ);
				addColumnPathMap(ShipAct_HdrR.$ship_to_id_cd, Chk01_HdrR.$ship_to_id_cd);
				addColumnPathMap(ShipAct_HdrR.$ship_to_id_nm, Chk01_HdrR.$ship_to_id_nm);
				addColumnPathMap(ShipAct_HdrR.$ship_to_zip_cd, Chk01_HdrR.$ship_to_zip_cd);
				addColumnPathMap(ShipAct_HdrR.$ship_to_addr1, Chk01_HdrR.$ship_to_addr1);
				addColumnPathMap(ShipAct_HdrR.$ship_to_addr2, Chk01_HdrR.$ship_to_addr2);
				addColumnPathMap(ShipAct_HdrR.$ship_to_addr3, Chk01_HdrR.$ship_to_addr3);
				addColumnPathMap(ShipAct_HdrR.$ship_to_addr4, Chk01_HdrR.$ship_to_addr4);
				addColumnPathMap(ShipAct_HdrR.$ship_to_cntct_dpt, Chk01_HdrR.$ship_to_cntct_dpt);
				addColumnPathMap(ShipAct_HdrR.$ship_to_cntct_psn, Chk01_HdrR.$ship_to_cntct_psn);
				addColumnPathMap(ShipAct_HdrR.$ship_to_tel, Chk01_HdrR.$ship_to_tel);
				addColumnPathMap(ShipAct_HdrR.$ship_to_fax, Chk01_HdrR.$ship_to_fax);
				addColumnPathMap(ShipAct_HdrR.$ship_to_sundry_flg, Chk01_HdrR.$ship_to_sundry_flg);
				addColumnPathMap(ShipAct_HdrR.$via_dlv_typ, Chk01_HdrR.$via_dlv_typ);
				addColumnPathMap(ShipAct_HdrR.$iv_no, Chk01_HdrR.$iv_no);
				addColumnPathMap(ShipAct_HdrR.$uplnd_flg, Chk01_HdrR.$uplnd_flg);
				addColumnPathMap(ShipAct_HdrR.$intr_rmrks, Chk01_HdrR.$intr_rmrks);
				addColumnPathMap(ShipAct_HdrR.$sub_char1, Chk01_HdrR.$sub_char1);
				addColumnPathMap(ShipAct_HdrR.$sub_char2, Chk01_HdrR.$sub_char2);
				addColumnPathMap(ShipAct_HdrR.$sub_char3, Chk01_HdrR.$sub_char3);
				addColumnPathMap(ShipAct_HdrR.$dlv_slip_prnt_flg, Chk01_HdrR.$dlv_slip_prnt_flg);
				addColumnPathMap(ShipAct_HdrR.$ship_adv_prnt_flg, Chk01_HdrR.$ship_adv_prnt_flg);
				addColumnPathMap(ShipAct_HdrR.$lot_chk_off_flg, Chk01_HdrR.$lot_chk_off_flg);
				addColumnPathMap(ShipAct_HdrR.$peg_no, Chk01_HdrR.$peg_no);
				addColumnPathMap(ShipAct_HdrR.$dlv_slip_no, Chk01_HdrR.$dlv_slip_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.dlv_slip_flg(true);
				dest.io_act_flg(true);
				dest.sls_act_flg(true);
			}
		}
		protected Map_ShipAct_DtlR_Chk01_DtlR<ShipAct_DtlR, Chk01_DtlR> createMap_ShipAct_DtlR_Chk01_DtlR() {
			return new Map_ShipAct_DtlR_Chk01_DtlR<ShipAct_DtlR, Chk01_DtlR>();
		}
		public class Map_ShipAct_DtlR_Chk01_DtlR<D extends ShipAct_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipAct_DtlR.$data_crud_typ, Chk01_DtlR.$data_crud_typ);
				addColumnPathMap(ShipAct_DtlR.$ship_act_d_no, Chk01_DtlR.$ship_act_d_no);
				addColumnPathMap(ShipAct_DtlR.$disp_seq, Chk01_DtlR.$disp_seq);
				addColumnPathMap(ShipAct_DtlR.$ship_alloc_sts_no, Chk01_DtlR.$ship_alloc_sts_no);
				addColumnPathMap(ShipAct_DtlR.$trd_cd, Chk01_DtlR.$trd_cd);
				addColumnPathMap(ShipAct_DtlR.$trd_ptn_typ, Chk01_DtlR.$trd_ptn_typ);
				addColumnPathMap(ShipAct_DtlR.$ship_loc_cd, Chk01_DtlR.$ship_loc_cd);
				addColumnPathMap(ShipAct_DtlR.$ship_str_ln_cd, Chk01_DtlR.$ship_str_ln_cd);
				addColumnPathMap(ShipAct_DtlR.$dlv_id_typ, Chk01_DtlR.$dlv_id_typ);
				addColumnPathMap(ShipAct_DtlR.$dlv_id_cd, Chk01_DtlR.$dlv_id_cd);
				addColumnPathMap(ShipAct_DtlR.$dlv_id_nm, Chk01_DtlR.$dlv_id_nm);
				addColumnPathMap(ShipAct_DtlR.$dlv_zip_cd, Chk01_DtlR.$dlv_zip_cd);
				addColumnPathMap(ShipAct_DtlR.$dlv_addr1, Chk01_DtlR.$dlv_addr1);
				addColumnPathMap(ShipAct_DtlR.$dlv_addr2, Chk01_DtlR.$dlv_addr2);
				addColumnPathMap(ShipAct_DtlR.$dlv_addr3, Chk01_DtlR.$dlv_addr3);
				addColumnPathMap(ShipAct_DtlR.$dlv_addr4, Chk01_DtlR.$dlv_addr4);
				addColumnPathMap(ShipAct_DtlR.$dlv_cntct_dpt, Chk01_DtlR.$dlv_cntct_dpt);
				addColumnPathMap(ShipAct_DtlR.$dlv_cntct_psn, Chk01_DtlR.$dlv_cntct_psn);
				addColumnPathMap(ShipAct_DtlR.$dlv_tel, Chk01_DtlR.$dlv_tel);
				addColumnPathMap(ShipAct_DtlR.$dlv_fax, Chk01_DtlR.$dlv_fax);
				addColumnPathMap(ShipAct_DtlR.$dlv_sundry_flg, Chk01_DtlR.$dlv_sundry_flg);
				addColumnPathMap(ShipAct_DtlR.$dlv_str_ln_cd, Chk01_DtlR.$dlv_str_ln_cd);
				addColumnPathMap(ShipAct_DtlR.$pri_prnt_flg, Chk01_DtlR.$pri_prnt_flg);
				addColumnPathMap(ShipAct_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
				addColumnPathMap(ShipAct_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
				addColumnPathMap(ShipAct_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
				addColumnPathMap(ShipAct_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
				addColumnPathMap(ShipAct_DtlR.$itm_nm, Chk01_DtlR.$itm_nm);
				addColumnPathMap(ShipAct_DtlR.$iv_itm_nm, Chk01_DtlR.$iv_itm_nm);
				addColumnPathMap(ShipAct_DtlR.$sundry_itm_flg, Chk01_DtlR.$sundry_itm_flg);
				addColumnPathMap(ShipAct_DtlR.$stk_mng_typ, Chk01_DtlR.$stk_mng_typ);
				addColumnPathMap(ShipAct_DtlR.$sno1_mng_typ, Chk01_DtlR.$sno1_mng_typ);
				addColumnPathMap(ShipAct_DtlR.$sno2_mng_typ, Chk01_DtlR.$sno2_mng_typ);
				addColumnPathMap(ShipAct_DtlR.$sno3_mng_typ, Chk01_DtlR.$sno3_mng_typ);
				addColumnPathMap(ShipAct_DtlR.$sno4_mng_typ, Chk01_DtlR.$sno4_mng_typ);
				addColumnPathMap(ShipAct_DtlR.$sno1, Chk01_DtlR.$sno1);
				addColumnPathMap(ShipAct_DtlR.$sno2, Chk01_DtlR.$sno2);
				addColumnPathMap(ShipAct_DtlR.$sno3, Chk01_DtlR.$sno3);
				addColumnPathMap(ShipAct_DtlR.$sno4, Chk01_DtlR.$sno4);
				addColumnPathMap(ShipAct_DtlR.$lot_no, Chk01_DtlR.$lot_no);
				addColumnPathMap(ShipAct_DtlR.$sublot_no, Chk01_DtlR.$sublot_no);
				addColumnPathMap(ShipAct_DtlR.$ver_no, Chk01_DtlR.$ver_no);
				addColumnPathMap(ShipAct_DtlR.$stk_arrv_bp_cd, Chk01_DtlR.$stk_arrv_bp_cd);
				addColumnPathMap(ShipAct_DtlR.$gd_cd, Chk01_DtlR.$gd_cd);
				addColumnPathMap(ShipAct_DtlR.$quality_typ, Chk01_DtlR.$quality_typ);
				addColumnPathMap(ShipAct_DtlR.$stk_id_typ, Chk01_DtlR.$stk_id_typ);
				addColumnPathMap(ShipAct_DtlR.$stk_bp_cd, Chk01_DtlR.$stk_bp_cd);
				addColumnPathMap(ShipAct_DtlR.$trd_unit_qty, Chk01_DtlR.$trd_unit_qty);
				addColumnPathMap(ShipAct_DtlR.$trd_unit_cd, Chk01_DtlR.$trd_unit_cd);
				addColumnPathMap(ShipAct_DtlR.$base_unit_qty, Chk01_DtlR.$base_unit_qty);
				addColumnPathMap(ShipAct_DtlR.$base_unit_cd, Chk01_DtlR.$base_unit_cd);
				addColumnPathMap(ShipAct_DtlR.$rsn_cd, Chk01_DtlR.$rsn_cd);
				addColumnPathMap(ShipAct_DtlR.$bd_dpt_cd, Chk01_DtlR.$bd_dpt_cd);
				addColumnPathMap(ShipAct_DtlR.$bd_dpt_nm, Chk01_DtlR.$bd_dpt_nm);
				addColumnPathMap(ShipAct_DtlR.$cst_po_no, Chk01_DtlR.$cst_po_no);
				addColumnPathMap(ShipAct_DtlR.$cst_po_d_no, Chk01_DtlR.$cst_po_d_no);
				addColumnPathMap(ShipAct_DtlR.$cst_dlv_inst_no, Chk01_DtlR.$cst_dlv_inst_no);
				addColumnPathMap(ShipAct_DtlR.$cst_dlv_inst_d_no, Chk01_DtlR.$cst_dlv_inst_d_no);
				addColumnPathMap(ShipAct_DtlR.$cst_itm_cd, Chk01_DtlR.$cst_itm_cd);
				addColumnPathMap(ShipAct_DtlR.$cst_itm_nm, Chk01_DtlR.$cst_itm_nm);
				addColumnPathMap(ShipAct_DtlR.$base_dlv_slip_no, Chk01_DtlR.$base_dlv_slip_no);
				addColumnPathMap(ShipAct_DtlR.$base_prov_act_no, Chk01_DtlR.$base_prov_act_no);
				addColumnPathMap(ShipAct_DtlR.$base_ac_dt, Chk01_DtlR.$base_ac_dt);
				addColumnPathMap(ShipAct_DtlR.$arr_cnt_rmrks, Chk01_DtlR.$arr_cnt_rmrks);
				addColumnPathMap(ShipAct_DtlR.$trd_rmrks, Chk01_DtlR.$trd_rmrks);
				addColumnPathMap(ShipAct_DtlR.$trd_d_rmrks, Chk01_DtlR.$trd_d_rmrks);
				addColumnPathMap(ShipAct_DtlR.$intr_d_rmrks, Chk01_DtlR.$intr_d_rmrks);
				addColumnPathMap(ShipAct_DtlR.$io_schd_pr_no, Chk01_DtlR.$io_schd_pr_no);
				addColumnPathMap(ShipAct_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
				addColumnPathMap(ShipAct_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
				addColumnPathMap(ShipAct_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
				addColumnPathMap(ShipAct_DtlR.$dlv_slip_d_no, Chk01_DtlR.$dlv_slip_d_no);
				addColumnPathMap(ShipAct_DtlR.$dlv_slip_no, Chk01_DtlR.$dlv_slip_no);
				addColumnPathMap(ShipAct_DtlR.$abort_flg, Chk01_DtlR.$abort_flg);
				addColumnPathMap(ShipAct_DtlR.$skip_chk_ship_flg, Chk01_DtlR.$skip_chk_ship_flg);
				addColumnPathMap(ShipAct_DtlR.$non_upd_flg, Chk01_DtlR.$non_upd_flg);
				addColumnPathMap(ShipAct_DtlR.$prov_typ, Chk01_DtlR.$prov_typ);
				addColumnPathMap(ShipAct_DtlR.$prov_basis_typ, Chk01_DtlR.$prov_basis_typ);
				addColumnPathMap(ShipAct_DtlR.$iv_no, Chk01_DtlR.$iv_no);
				addColumnPathMap(ShipAct_DtlR.$iv_d_no, Chk01_DtlR.$iv_d_no);
				addColumnPathMap(ShipAct_DtlR.$hdr_peg_no, Chk01_DtlR.$hdr_peg_no);
				addColumnPathMap(ShipAct_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			}
		}

		protected Map_Chk01_HdrR_ShipAct_HdrR<Chk01_HdrR, ShipAct_HdrR> createMap_Chk01_HdrR_ShipAct_HdrR() {
			return new Map_Chk01_HdrR_ShipAct_HdrR<Chk01_HdrR, ShipAct_HdrR>();
		}
		public class Map_Chk01_HdrR_ShipAct_HdrR<D extends Chk01_HdrR, S extends ShipAct_HdrR> extends MCRowMapper<D,S>{
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_HdrR.$ship_act_no, ShipAct_HdrR.$ship_act_no);
				addColumnPathMap(Chk01_HdrR.$ship_act_rev, ShipAct_HdrR.$ship_act_rev);
				addColumnPathMap(Chk01_HdrR.$dlv_slip_prnted_flg, ShipAct_HdrR.$dlv_slip_prnted_flg);
				addColumnPathMap(Chk01_HdrR.$ship_adv_prnted_flg, ShipAct_HdrR.$ship_adv_prnted_flg);
			}
		}
		protected Map_Chk01_DtlR_ShipAct_DtlR<Chk01_DtlR, ShipAct_DtlR> createMap_Chk01_DtlR_ShipAct_DtlR() {
			return new Map_Chk01_DtlR_ShipAct_DtlR<Chk01_DtlR, ShipAct_DtlR>();
		}
		public class Map_Chk01_DtlR_ShipAct_DtlR<D extends Chk01_DtlR, S extends ShipAct_DtlR> extends MCRowMapper<D,S>{
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_DtlR.$ship_act_d_no, ShipAct_DtlR.$ship_act_d_no);
				addColumnPathMap(Chk01_DtlR.$ship_act_no, ShipAct_DtlR.$ship_act_no);
				addColumnPathMap(Chk01_DtlR.$dlv_slip_d_no, ShipAct_DtlR.$dlv_slip_d_no);
				addColumnPathMap(Chk01_DtlR.$dlv_slip_no, ShipAct_DtlR.$dlv_slip_no);
				addColumnPathMap(Chk01_DtlR.$pr_sts_typ, ShipAct_DtlR.$pr_sts_typ);
				addColumnPathMap(Chk01_DtlR.$pr_sts_typ_nm, ShipAct_DtlR.$pr_sts_typ_nm);
				addColumnPathMap(Chk01_DtlR.$peg_no, ShipAct_DtlR.$peg_no);
				addColumnPathMap(Chk01_DtlR.$bd_dpt_cd, ShipAct_DtlR.$bd_dpt_cd);
				addColumnPathMap(Chk01_DtlR.$bd_dpt_nm, ShipAct_DtlR.$bd_dpt_nm);
			}
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 出荷実績を削除する。<br>
	 */
	public class Del01 extends MSBEL_ShipActReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {

			// 初期処理
			editUp();
			
			// チェック処理
			callThisChk02();
			throwCanErr();
			
			// メイン処理
			callShipActSrv();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(up0());
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
		}

		/**
		 * 登録前チェック処理を実行する
		 */
		protected void callThisChk02() {

			MSBEL_ShipActReg.Chk02 o = MSBEL_ShipActReg.crtChk02();
			MCRow.copyall(o.up0(), up0());
			o.up1().setAll(up1());
			o.exec();

			MCRow.copyall(up0(), o.down0());
		}

		/**
		 * 出荷実績SVを呼び出す
		 */
		protected void callShipActSrv() {
			MSBEL_ShipActService.ShipAct_Upd01 o = MSBEL_ShipActService.crtShipAct_Upd01();
			copy(o.up0().add(), up0(), createMap_ShipAct_HdrR_Chk02_HdrR());
			o.up2().bndl_prnt_flg(!up2().indiv_prnt_flg());
			o.exec();
		}

		protected Map_ShipAct_HdrR_Chk02_HdrR<ShipAct_HdrR, Chk02_HdrR> createMap_ShipAct_HdrR_Chk02_HdrR() {
			return new Map_ShipAct_HdrR_Chk02_HdrR<ShipAct_HdrR, Chk02_HdrR>();
		}
		public class Map_ShipAct_HdrR_Chk02_HdrR<D extends ShipAct_HdrR, S extends Chk02_HdrR> extends MCRowMapper<D,S>{
			protected void setupColumnPathMap() {
				addColumnPathMap(ShipAct_HdrR.$data_crud_typ, Chk02_HdrR.$data_crud_typ);
				addColumnPathMap(ShipAct_HdrR.$ship_act_no, Chk02_HdrR.$ship_act_no);
				addColumnPathMap(ShipAct_HdrR.$can_ac_dt, Chk02_HdrR.$can_ac_dt);
				addColumnPathMap(ShipAct_HdrR.$dlv_slip_prnt_flg, Chk02_HdrR.$dlv_slip_prnt_flg);
				addColumnPathMap(ShipAct_HdrR.$peg_no, Chk02_HdrR.$peg_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.dlv_slip_flg(true);
				dest.io_act_flg(true);
				dest.sls_act_flg(true);
			}
		}
	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 納品書、出荷案内書を発行する。<br>
	 */
	public class Prnt01 extends MSBEL_ShipActReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			callThisChk04();
			throwUpdErr();
			callShipRprtPrntServicePrnt01();
			updPrntFlg();
			setDown();
		}

		protected void callThisChk04() {
			MSBEL_ShipActReg.Chk04 ope = MSBEL_ShipActReg.crtChk04();
			MCRow.copyall(ope.up0(), up0());
			setAll(ope.up1(), up2(), createMap_Chk04_DtlR_Prnt01_DtlR());
			ope.exec();
			up0().can_flg(ope.down0().can_flg());
			up0().err_flg(ope.down0().err_flg());
		}

		/**
		 * 出荷帳票発行サービスを実行して、納品書及び出荷案内書を発行する
		 */
		protected void callShipRprtPrntServicePrnt01() {
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 ope = MSBEL_ShipRprtPrntService.crtShipRprt_Prnt01();
			ope.up0().setAll(crtShipRprtPrnt01());
			ope.up1().bndl_prnt_flg(!up1().indiv_prnt_flg());
			ope.exec();
		}
		
		protected MCList<ShipRprt_Prnt01_HdrR> crtShipRprtPrnt01() {
			MCList<MST_SHIP_ACT_D_P_R> rsltL = getPrntTgtL();
			MCList<ShipRprt_Prnt01_HdrR> prntL = MCList.create(ShipRprt_Prnt01_HdrR.class);
			for (MST_SHIP_ACT_D_P_R actDR : rsltL) {
				if (MAC_SLIP_STS_TYP.isCAN(actDR.getStringNE("slip_sts_typ"))
					&& !up0().dlv_slip_prnt_flg()) {
					// 取消伝票は納品書のみ発行
					continue;
				}
				ShipRprt_Prnt01_HdrR prntR = prntL.add();
				prntR.dlv_slip_no(actDR.dlv_slip_no());
				prntR.dlv_slip_seq(actDR.dlv_slip_seq());
				prntR.dlv_slip_prnt_flg(up0().dlv_slip_prnt_flg());
				prntR.ship_adv_prnt_flg(up0().ship_adv_prnt_flg());
				if (up0().dlv_slip_prnt_flg()
					&& actDR.pri_prnt_flg()
					&& MAC_TRD_PTN_TYP.isSLS(actDR.trd_ptn_typ())
					&& actDR.getBoolean(MST_DLV_SLIP_R.$sync_flg)) {
					// 売上伝票発行済ＦＬＧを更新するため
					prntR.sls_prnt_flg(true);
				}
				prntR.inc_can_flg(true);
				prntR.setAttributes(up0());
				
				// 未発行がある場合、出荷実績ヘッダのフラグを更新する
				if (actDR.getBoolean("latest_flg")) {
					if (up0().dlv_slip_prnt_flg() && !actDR.getBoolean(MST_SHIP_ACT_R.$dlv_prnt_flg)) {
						up0().dlv_slip_prnted_flg(true);
					}
					if (up0().ship_adv_prnt_flg() && !actDR.getBoolean(MST_SHIP_ACT_R.$ship_adv_prnt_flg)) {
						up0().ship_adv_prnted_flg(true);
					}
				}
			}
			return prntL;
		}
		protected MCList<MST_SHIP_ACT_D_P_R> getPrntTgtL() {
			shipActWkDel();
			shipActWkIns();
			
			// 上り電文の出荷実績ＮＯ、改訂番号に対応する納品書ＮＯ、連番を取得する
			MST_SHIP_ACT_P_R t1 = MST_SHIP_ACT_P_R.create("T1");
			MST_DLV_SLIP_R t2 = MST_DLV_SLIP_R.create("T2");
			MST_SHIP_ACT_R t3 = MST_SHIP_ACT_R.create("T3");
			
			MCTempView w = createTempView("W");
			MSW_SHIP_ACT_P_KEY_R w1 = MSW_SHIP_ACT_P_KEY_R.create("W1");
			MST_SHIP_ACT_P_R w2 = MST_SHIP_ACT_P_R.create("W2");
			MST_SHIP_ACT_D_P_R w3 = MST_SHIP_ACT_D_P_R.create("W3");
			MST_SHIP_ACT_D_P_R w4 = MST_SHIP_ACT_D_P_R.create("W4");
			MST_SHIP_ACT_D_P_R w5 = MST_SHIP_ACT_D_P_R.create("W5");
			MST_DLV_SLIP_R w6 = MST_DLV_SLIP_R.create("W6");
			
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.setDistinct();
			bldr.setSelect(
				t1.ship_act_no,
				w.pr("dlv_slip_no").as("dlv_slip_no"),
				w.pr("dlv_slip_seq").as("dlv_slip_seq"),
				w.pr("trd_ptn_typ"),
				w.pr("pri_prnt_flg"),
				t2.slip_sts_typ, t2.sync_flg,
				t3.dlv_prnt_flg, t3.ship_adv_prnt_flg,
				decode(t1.ship_act_rev, t3.ship_act_rev, value(true), value(false)).as("latest_flg")
			);
			bldr.addInnerJoin(w1,
				w1.ship_act_no.eq(t1.ship_act_no)
				.and(w1.ship_act_rev.eq(t1.ship_act_rev))
			);
			bldr.addInnerJoin(
				subQuery()
				.select(
					w3.ship_act_no,
					w3.dlv_slip_no,
					w3.dlv_slip_seq.add(
							decode(w2.can_flg, value(false), value(0), value(1))
					).as("dlv_slip_seq"),
					w3.trd_ptn_typ,
					w3.pri_prnt_flg
				)
				.from(w1
					.innerJoin(w2).on(
						w2.ship_act_no.eq(w1.ship_act_no)
						.and(w2.ship_act_rev.eq(w1.ship_act_rev)))
					.innerJoin(w3).on(
						w3.ship_act_no.eq(w1.ship_act_no)
						.and(w3.ship_act_rev.eq(w1.ship_act_rev)))
				)
				.where(
					bracket(w2.can_flg.eq(value(true))
						.or(w2.can_flg.eq(value(false))).and(w3.can_flg.eq(value(false))))
				)
				.unionAll(
					// 最新の改訂番号で行削除された分の納品書ＮＯを取得する
					// ただし指図が取り消されている場合は不要（なのでcan_flgを条件に追加している）
					subQuery()
					.select(
						w4.ship_act_no,
						w4.dlv_slip_no,
						subQuery()
							.select(max(w6.dlv_slip_seq))
							.from(w6)
							.where(w6.dlv_slip_no.eq(w4.dlv_slip_no)
							.and(w6.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CAN.value())))
						).as("dlv_slip_seq"),
						w4.trd_ptn_typ,
						w4.pri_prnt_flg
					)
					.from(w1
						.innerJoin(w2).on(
							w2.ship_act_no.eq(w1.ship_act_no)
							.and(w2.ship_act_rev.eq(w1.ship_act_rev)))
						.innerJoin(w4).on(
							w4.ship_act_no.eq(w1.ship_act_no)
							.and(w4.ship_act_rev.eq(w1.ship_act_rev.subtract(value(1))))
							.and(w4.can_flg.eq(value(false))))
					)
					.where(
						notExists(
							subQuery()
							.select(value("x"))
							.from(w5)
							.where(
								w5.ship_act_no.eq(w1.ship_act_no)
								.and(w5.ship_act_rev.eq(w1.ship_act_rev))
								.and(w5.can_flg.eq(value(false)))
								.and(w5.dlv_slip_no.eq(w4.dlv_slip_no)))
						)
						.and(w2.can_flg.eq(value(false)))
					)
				).view(w), w.pr("ship_act_no").eq(t1.ship_act_no)
			);
			bldr.addInnerJoin(t2,
				t2.dlv_slip_no.eq(w.pr("dlv_slip_no"))
				.and(t2.dlv_slip_seq.eq(w.pr("dlv_slip_seq")))
			);
			bldr.addLeftOuterJoin(t3, t3.ship_act_no.eq(t1.ship_act_no));
			
			MCList<MST_SHIP_ACT_D_P_R> rsltL = MCList.create(MST_SHIP_ACT_D_P_R.class);
			rsltL.addBooleanColumn(MST_DLV_SLIP_R.$sync_flg);
			rsltL.addBooleanColumn(MST_SHIP_ACT_R.$dlv_prnt_flg);
			rsltL.addBooleanColumn(MST_SHIP_ACT_R.$ship_adv_prnt_flg);
			rsltL.addBooleanColumn("latest_flg");
			dbSelect("MSBEL1440_MST_SHIP_ACT_D_P_S01", rsltL, bldr);
			
			shipActWkDel();
			return rsltL;
		}
		
		protected void shipActWkDel() {
			dbWkDelete("MSBEL1440_MSW_SHIP_ACT_P_KEY_D01", MST_SHIP_ACT_P_R.create());
		}
		
		protected void shipActWkIns() {
			dbWkInsert("MSBEL1440_MSW_SHIP_ACT_P_KEY_I01", up0(), MST_SHIP_ACT_P_R.create());
		}
		
		protected void updPrntFlg() {
			if (!up0().dlv_slip_prnted_flg() && !up0().ship_adv_prnted_flg()) {
				return;
			}

			MST_SHIP_ACT_R actR = MST_SHIP_ACT_R.create();
			MST_SHIP_ACT_R t = MST_SHIP_ACT_R.create("T");
			MCQueryApiBuilder actR_bldr = MCQueryApiBuilder.create(t);
			actR.ship_act_no(up0().ship_act_no());
			MCDate sysnow = MCDate.sysnow();
			actR_bldr.setSet();
			if (up0().dlv_slip_prnted_flg()) {
				actR.dlv_prnt_flg(true);
				actR.dlv_prnt_tm(sysnow);
				actR_bldr.addSet(t.dlv_prnt_flg, t.dlv_prnt_tm);
			}
			if (up0().ship_adv_prnted_flg()) {
				actR.ship_adv_prnt_flg(true);
				actR.ship_adv_prnt_tm(sysnow);
				actR_bldr.addSet(t.ship_adv_prnt_flg, t.ship_adv_prnt_tm);
			}
			
			MST_SHIP_ACT_R oldActR = MST_SHIP_ACT_R.create();
			if (up0().can_flg()) {
				MST_SHIP_ACT_R t2 = MST_SHIP_ACT_R.create("T2");
				MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t2);
				bldr.setSelect(t2.upd_srv_req_no);

				dbSelectKey("MSBEL1440_MST_SHIP_ACT_S08", oldActR, bldr, actR);
			}
			
			dbUpdateKey("MSBEL1440_MST_SHIP_ACT_U01", actR, actR_bldr);
			
			if (up0().can_flg()) {
				MST_SHIP_ACT_D_R t1 = MST_SHIP_ACT_D_R.create("T1");
				MCQueryApiBuilder bldrDtl = MCQueryApiBuilder.create(t1);
				MCList<MST_SHIP_ACT_D_R> actDL = MCList.create(MST_SHIP_ACT_D_R.class);
				bldrDtl.setSelect(t1.ship_act_no, t1.ship_act_d_no,t1.upd_srv_req_no);
				bldrDtl.setWhere(t1.ship_act_no.eq(bind("ship_act_no")));
				bldrDtl.addConstWhereWithAnd(t1.can_flg.eq(value(true)));
				dbSelect("MSBEL1440_MST_SHIP_ACT_D_S01", actDL, bldrDtl, actR);
				
				MCList<MST_SHIP_ACT_D_R> canActDL = MCList.create(MST_SHIP_ACT_D_R.class);
				if (!actDL.isEmpty()) {
					MCIndexKey idx1 = actDL.createIndex(MST_SHIP_ACT_D_R.$ship_act_no,
							MST_SHIP_ACT_D_R.$upd_srv_req_no);
					canActDL.addAll(actDL.subList(idx1, actR.ship_act_no(),
							oldActR.upd_srv_req_no()));
					bldrDtl.setSet(t1.ship_act_no, t1.ship_act_d_no);
					dbUpdateKey("MSBEL1440_MST_SHIP_ACT_D_U01", canActDL, bldrDtl);
				}
			}
			callRevDataIns01(actR);
		}
		
		/**
		 * 「改訂履歴データ更新リスト」テーブルにデータを登録サービス呼び出し
		 */
		protected void callRevDataIns01(MST_SHIP_ACT_R argR) {
			
			MST_SHIP_ACT_R hdrR = MST_SHIP_ACT_R.create();
			MST_SHIP_ACT_R t = MST_SHIP_ACT_R.create("T");
			MCQueryApiBuilder hdrR_bldr = MCQueryApiBuilder.create(t);
			hdrR.ship_act_no(argR.ship_act_no());
			hdrR_bldr.setSelect(t.ship_act_no, t.ship_act_rev);
			dbSelectKey("MSBEL1440_MST_SHIP_ACT_S04", hdrR, hdrR_bldr, hdrR);
			
			MAUCL_RevDataService.RevData_Ins01 ope = MAUCL_RevDataService.crtRevData_Ins01();
			RevData_Ins01_DtlR opeR = RevData_Ins01_DtlR.create();
			opeR.rev_data_src_no(hdrR.ship_act_no());
			opeR.rev_no(hdrR.ship_act_rev());
			opeR.rev_data_typ(MAC_REV_DATA_TYP.MST_SHIP_ACT.value());
			ope.up0().add(opeR);
			ope.exec();
		}

		protected Map_Chk04_DtlR_Prnt01_DtlR<Chk04_DtlR,Prnt01_DtlR> createMap_Chk04_DtlR_Prnt01_DtlR() {
			return new Map_Chk04_DtlR_Prnt01_DtlR<Chk04_DtlR,Prnt01_DtlR>();
		}

		public class Map_Chk04_DtlR_Prnt01_DtlR<D extends Chk04_DtlR, S extends Prnt01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk04_DtlR.$base_ac_dt, Prnt01_DtlR.$base_ac_dt);
				addColumnPathMap(Chk04_DtlR.$trd_ptn_typ, Prnt01_DtlR.$trd_ptn_typ);
			}
		}

		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}
	}

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 出荷指図を検索する。<br>
	 */
	public class Srch01 extends MSBEL_ShipActReg_MC_A.Srch01 {
		/**
		 * インボイス出荷実績マップリスト
		 */
		protected MCList<MST_IV_SHIP_ACT_MAP_R> _ivShipActMapL = null;
		
		/**
		 * インボイス出荷実績マップリストのインデックス
		 */
		protected MCIndexKey _ivShipActMapIdxkey = null;
		
		/**
		 * インボイス出荷指図マップリスト
		 */
		protected MCList<MST_IV_SHIP_INST_MAP_R> _ivShipInstMapL = null;
		
		/**
		 * インボイス出荷指図マップリストのインデックス
		 */
		protected MCIndexKey _ivShipInstMapIdxkey = null;
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			doSrchShipInst();
		}
		@Override
		protected void doEditDown() {
			super.doEditDown();
			doEditDownForIv();
			doEditDownForSrch(down0(), down1());
			doEditDownForAssort(down0(), down1());
		}

		/**
		 * 出荷指図、出荷指図明細を検索する
		 */
		protected void doSrchShipInst() {
			doSrch(up0(), down0(), down1(), down2(),
				MSBEL1440_MST_SHIP_INST_S01(), "ship_alloc_sts_no");
			getIvShipInstMapL();
			getIvShipActMapL();
		}
		/**
		 * インボイス出荷指図マップを取得する。
		 */
		protected void getIvShipInstMapL() {
			
			_ivShipInstMapL = MCList.create(MST_IV_SHIP_INST_MAP_R.class);
			_ivShipInstMapL.addStringColumn(MST_IV_R.$iv_no);
			
			MST_IV_SHIP_INST_MAP_R ivShipInstMap = MST_IV_SHIP_INST_MAP_R.create("IVSHIPINSTMAP");
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv = MST_IV_R.create("IV");
			MCQueryApiBuilder ivShipInstMap_bldr = MCQueryApiBuilder.create(ivShipInstMap);
			ivShipInstMap_bldr.addSelect(iv.iv_no);
			ivShipInstMap_bldr.addInnerJoin(ivD, ivShipInstMap.iv_d_no.eq(ivD.iv_d_no));
			ivShipInstMap_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
			ivShipInstMap_bldr.setWhere(ivShipInstMap.ship_inst_d_no.eq(bind(MST_IV_SHIP_INST_MAP_R.$ship_inst_d_no)));
			ivShipInstMap_bldr.addWhereWithAnd(iv.iv_ship_flg.eq(value(false)));
			ivShipInstMap_bldr.addWhereWithAnd(iv.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value())));
			
			dbSelect("MSBEL1440_MST_IV_SHIP_INST_MAP_S01", _ivShipInstMapL, ivShipInstMap_bldr, down1());
			
			_ivShipInstMapIdxkey = _ivShipInstMapL.createIndex(MST_IV_SHIP_INST_MAP_R.$ship_inst_d_no, MST_IV_SHIP_ACT_MAP_R.$ship_alloc_sts_no);
		}
		
		/**
		 * インボイス出荷実績マップを取得する。
		 */
		protected void getIvShipActMapL() {
			
			_ivShipActMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
			_ivShipActMapL.addStringColumn(MST_IV_R.$iv_no);
			
			MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv = MST_IV_R.create("IV");
			MCQueryApiBuilder ivShipActMap_bldr = MCQueryApiBuilder.create(ivShipActMap);
			ivShipActMap_bldr.addSelect(iv.iv_no);
			ivShipActMap_bldr.addInnerJoin(ivD, ivShipActMap.iv_d_no.eq(ivD.iv_d_no));
			ivShipActMap_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
			ivShipActMap_bldr.setWhere(ivShipActMap.iv_d_no.eq(bind(MST_IV_SHIP_INST_MAP_R.$iv_d_no)));
			
			dbSelect("MSBEL1440_MST_IV_SHIP_ACT_MAP_S01", _ivShipActMapL, ivShipActMap_bldr, _ivShipInstMapL);
			
			_ivShipActMapIdxkey = _ivShipActMapL.createIndex(MST_IV_SHIP_ACT_MAP_R.$iv_d_no, MST_IV_SHIP_ACT_MAP_R.$ship_alloc_sts_no);
		}
		
		/**
		 * インボイス取引（配送先経由しない＆インボイス単位出荷ではない）の場合、インボイス出荷指図マップの情報を反映する。
		 */
		protected void doEditDownForIv() {
			
			if (_ivShipInstMapL.isEmpty()) {
				return;
			}
			
			MCList<Srch01_DtlR> dtlL = MCList.create(Srch01_DtlR.class);
			
			int dispSeq = 1;
			
			for (Srch01_DtlR downR : down1()) {
				MCList<MST_IV_SHIP_INST_MAP_R> ivShipInstMapL = _ivShipInstMapL.subList(_ivShipInstMapIdxkey, downR.ship_inst_d_no(), downR.ship_alloc_sts_no());
				
				if (ivShipInstMapL.isEmpty()) {
					
					Srch01_DtlR dtlR = downR.clone();
					dtlR.disp_seq(dispSeq);
					dtlL.add(dtlR);
					
					dispSeq++;
				}
				else {
					
					MCNumber unIvQty = downR.base_unit_qty().subtract(nvl(downR.getNumber("alloc_act_qty"), MCNumber.ZERO));
					
					for (MST_IV_SHIP_INST_MAP_R ivShipInstMapR: ivShipInstMapL) {

						MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL = _ivShipActMapL.subList(_ivShipActMapIdxkey, ivShipInstMapR.iv_d_no(), ivShipInstMapR.ship_alloc_sts_no());
						MCNumber shipQty = MCNumber.ZERO;
						if (!ivShipActMapL.isEmpty()) {
							shipQty = ivShipActMapL.sum(MST_IV_SHIP_ACT_MAP_R.$base_unit_qty);
						}
						
						MCNumber unShipQty =  ivShipInstMapR.base_unit_qty().subtract(shipQty);
						
						if (!unShipQty.isPositive()) {
							continue;
						}
						
						Srch01_DtlR dtlR = downR.clone();
						dtlR.dtl_iv_no(ivShipInstMapR.getStringNE(MST_IV_R.$iv_no));
						dtlR.iv_d_no(ivShipInstMapR.iv_d_no());
						dtlR.base_unit_qty(unShipQty);
						setTrdUnitQty(dtlR);
						dtlR.disp_seq(dispSeq);
						dtlL.add(dtlR);
						
						dispSeq++;
						unIvQty = unIvQty.subtract(dtlR.base_unit_qty());
					}
					
					if (unIvQty.isPositive()) {
						Srch01_DtlR dtlR = downR.clone();
						dtlR.base_unit_qty(unIvQty);
						setTrdUnitQty(dtlR);
						dtlR.disp_seq(dispSeq);
						dtlL.add(dtlR);
						
						dispSeq++;
					}
				}
			}
			
			dtlL.sort(Srch01_DtlR.$disp_seq, Srch01_DtlR.$dtl_iv_no);
			down1().setAll(dtlL);
		}
		
		/**
		 * 取引単位数量を設定する。
		 * @param dtlR 検索結果の明細行
		 */
		protected void setTrdUnitQty(Srch01_DtlR dtlR) {
			
			if (isSame(dtlR.trd_unit_cd(), dtlR.base_unit_cd())) {
				dtlR.trd_unit_qty(dtlR.base_unit_qty());
			}
			else {
				MCNumber trdUnitQty = rvrsBaseUnitConv(
						dtlR.base_unit_qty(), dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(), dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ(), true);
				
				if (!isNull(trdUnitQty)) {
					dtlR.trd_unit_qty(trdUnitQty);
				}
				else {
					dtlR.trd_unit_qty(dtlR.base_unit_qty());
					dtlR.trd_unit_cd(dtlR.base_unit_cd());
					dtlR.trd_unit_nm(dtlR.base_unit_nm());
				}
			}
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * 出荷指図対象外の出荷予定を検索する。<br>
	 */
	public class Srch02 extends MSBEL_ShipActReg_MC_A.Srch02 {
		/**
		 * インボイス出荷実績マップリスト
		 */
		protected MCList<MST_IV_SHIP_ACT_MAP_R> _ivShipActMapL = null;
		
		/**
		 * インボイス出荷実績マップリストのインデックス
		 */
		protected MCIndexKey _ivShipActMapIdxkey = null;
		
		/**
		 * インボイスマップリスト
		 */
		protected MCList<MST_IV_MAP_R> _ivMapL = null;
		
		/**
		 * インボイスマップリストのインデックス
		 */
		protected MCIndexKey _ivMapIdxkey = null;
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			doSrchInstTypNon();
		}
		@Override
		protected void doEditDown() {
			super.doEditDown();
			doEditDownForIv();
			doEditDownForSrch(down0(), down1());
		}

		/**
		 * インボイス、インボイス明細を検索する
		 */
		protected void doSrchIv() {
			doSrch(up0(), down0(), down1(), down2(),
				MSBEL1440_MST_IV_S01(), "ship_alloc_sts_no");
		}

		/**
		 * 出荷予定を検索する
		 */
		protected void doSrchSchd() {
			doSrch(up0(), down0(), down1(), down2(),
				MSBEL1440_MST_SHIP_SCHD_S01(), "ship_alloc_sts_no");
		}
		
		/**
		 * 指図対象外の出荷予定を検索する
		 */
		protected void doSrchInstTypNon() {
			if (!isNull(up0().ship_schd_no())) {
				insSSWk();
				setCndIvNo();
			}
			if (!isNull(up0().iv_no())) {
				doSrchIv();
			}
			else {
				setCndSSNo();
				doSrchSchd();
				getIvMapL();
				getIvShipActMapL();
			}
		}
		
		/**
		 * インボイスマップを取得する。
		 */
		protected void getIvMapL() {
			
			_ivMapL = MCList.create(MST_IV_MAP_R.class);
			_ivMapL.addStringColumn(MST_IV_R.$iv_no);
			
			MST_IV_MAP_R ivMap = MST_IV_MAP_R.create("IVMAP");
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv = MST_IV_R.create("IV");
			MCQueryApiBuilder ivMap_bldr = MCQueryApiBuilder.create(ivMap);
			ivMap_bldr.addSelect(iv.iv_no);
			ivMap_bldr.addInnerJoin(ivD, ivMap.iv_d_no.eq(ivD.iv_d_no));
			ivMap_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
			ivMap_bldr.setWhere(ivMap.ship_schd_no.eq(bind(MST_IV_MAP_R.$ship_schd_no)));
			ivMap_bldr.addWhereWithAnd(iv.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value())));
			
			dbSelect("MSBEL1440_MST_IV_MAP_S01", _ivMapL, ivMap_bldr, down1());
			
			_ivMapIdxkey = _ivMapL.createIndex(MST_IV_MAP_R.$ship_schd_no);
		}
		
		/**
		 * インボイス出荷実績マップを取得する。
		 */
		protected void getIvShipActMapL() {
			
			_ivShipActMapL = MCList.create(MST_IV_SHIP_ACT_MAP_R.class);
			_ivShipActMapL.addStringColumn(MST_IV_R.$iv_no);
			
			MST_IV_SHIP_ACT_MAP_R ivShipActMap = MST_IV_SHIP_ACT_MAP_R.create("IVSHIPACTMAP");
			MST_IV_D_R ivD = MST_IV_D_R.create("IVD");
			MST_IV_R iv = MST_IV_R.create("IV");
			MCQueryApiBuilder ivShipActMap_bldr = MCQueryApiBuilder.create(ivShipActMap);
			ivShipActMap_bldr.addSelect(iv.iv_no);
			ivShipActMap_bldr.addInnerJoin(ivD, ivShipActMap.iv_d_no.eq(ivD.iv_d_no));
			ivShipActMap_bldr.addInnerJoin(iv, ivD.iv_mng_no.eq(iv.iv_mng_no));
			ivShipActMap_bldr.setWhere(ivShipActMap.iv_d_no.eq(bind(MST_IV_MAP_R.$iv_d_no)));
			
			dbSelect("MSBEL1440_MST_IV_SHIP_ACT_MAP_S02", _ivShipActMapL, ivShipActMap_bldr, _ivMapL);
			
			_ivShipActMapIdxkey = _ivShipActMapL.createIndex(MST_IV_SHIP_ACT_MAP_R.$iv_d_no, MST_IV_SHIP_ACT_MAP_R.$ship_schd_no);
		}
		
		/**
		 * インボイス取引かつインボイス単位出荷ではない明細に対して下り電文を編集する。
		 */
		protected void doEditDownForIv() {
			
			if (isNull(_ivMapL)) {
				return;
			}
			
			MCList<Srch01_DtlR> dtlL = MCList.create(Srch01_DtlR.class);
			
			for (Srch01_DtlR downR : down1()) {
				
				MCNumber baseUnitQty = downR.base_unit_qty();
				
				MCList<MST_IV_MAP_R> ivMapL = _ivMapL.subList(_ivMapIdxkey, downR.ship_schd_no());
				
				if (ivMapL.isEmpty()) {
					Srch01_DtlR dtlR = downR.clone();
					dtlL.add(dtlR);
				}
				else {
					for (MST_IV_MAP_R ivMapR: ivMapL) {
						
						if (!baseUnitQty.isPositive()) {
							break;
						}
						
						MCList<MST_IV_SHIP_ACT_MAP_R> ivShipActMapL = _ivShipActMapL.subList(_ivShipActMapIdxkey, ivMapR.iv_d_no(), ivMapR.ship_schd_no());
						MCNumber shipQty = MCNumber.ZERO;
						if (!ivShipActMapL.isEmpty()) {
							shipQty = ivShipActMapL.sum(MST_IV_SHIP_ACT_MAP_R.$base_unit_qty);
						}
						
						MCNumber unShipIvQty =  ivMapR.base_unit_qty().subtract(shipQty);
						
						if (!unShipIvQty.isPositive()) {
							continue;
						}
						
						Srch01_DtlR dtlR = downR.clone();
						dtlR.dtl_iv_no(ivMapR.getStringNE(MST_IV_R.$iv_no));
						dtlR.iv_d_no(ivMapR.iv_d_no());
						
						if (baseUnitQty.gt(unShipIvQty)) {
							dtlR.base_unit_qty(unShipIvQty);
							baseUnitQty = baseUnitQty.subtract(unShipIvQty);
							ivMapR.base_unit_qty(ivMapR.base_unit_qty().subtract(unShipIvQty));
						}
						else {
							dtlR.base_unit_qty(baseUnitQty);
							ivMapR.base_unit_qty(ivMapR.base_unit_qty().subtract(baseUnitQty));
							baseUnitQty = MCNumber.ZERO;
						}
						
						if (isSame(dtlR.trd_unit_cd(), dtlR.base_unit_cd())) {
							dtlR.trd_unit_qty(dtlR.base_unit_qty());
						}
						else {
							MCNumber trdUnitQty = rvrsBaseUnitConv(
									dtlR.base_unit_qty(), dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(), dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ(), true);
							
							if (!isNull(trdUnitQty)) {
								dtlR.trd_unit_qty(trdUnitQty);
							}
							else {
								dtlR.trd_unit_qty(dtlR.base_unit_qty());
								dtlR.trd_unit_cd(dtlR.base_unit_cd());
								dtlR.trd_unit_nm(dtlR.base_unit_nm());
							}
						}
						
						dtlL.add(dtlR);
					}
					
					MCNumber noIvQty = baseUnitQty.subtract(nvl(downR.getNumber("alloc_act_qty"), MCNumber.ZERO));
					if (noIvQty.isPositive()) {
						Srch01_DtlR dtlR = downR.clone();
						dtlR.base_unit_qty(baseUnitQty);
						
						if (isSame(dtlR.trd_unit_cd(), dtlR.base_unit_cd())) {
							dtlR.trd_unit_qty(dtlR.base_unit_qty());
						}
						else {
							MCNumber trdUnitQty = rvrsBaseUnitConv(
									dtlR.base_unit_qty(), dtlR.trd_unit_conv_base_qty(), dtlR.trd_unit_conv_qty(), dtlR.trd_unit_dec_place(), dtlR.trd_unit_rnd_typ(), true);
							
							if (!isNull(trdUnitQty)) {
								dtlR.trd_unit_qty(trdUnitQty);
							}
							else {
								dtlR.trd_unit_qty(dtlR.base_unit_qty());
								dtlR.trd_unit_cd(dtlR.base_unit_cd());
								dtlR.trd_unit_nm(dtlR.base_unit_nm());
							}
						}
						
						dtlL.add(dtlR);
					}
				}
			}
			
			dtlL.sort(Srch01_DtlR.$disp_seq, Srch01_DtlR.$dtl_iv_no);
			setDispSeq(dtlL);
			down1().setAll(dtlL);
		}

		/**
		 * 検索条件をワークに登録する
		 */
		protected void insSSWk() {
			MCList<MST_SHIP_SCHD_R>
			schdL = MCList.create(MST_SHIP_SCHD_R.class);
		for (String s : MCStringUtil.arrayValueSplit(up0().ship_schd_no())) {
			schdL.add().ship_schd_no(s);
		}
		MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
		dbWkDelete("MSBEL1440_MSW_SHIP_SCHD_D01", schdL_bldr.getBaseDbc());
		MCList<MST_SHIP_SCHD_R> schdL2 = schdL.groupBy(MST_SHIP_SCHD_R.$ship_schd_no);
		dbWkInsert("MSBEL1440_MSW_SHIP_SCHD_I01", schdL2, schdL_bldr.getBaseDbc());
		}

		/**
		 * インボイス単位出荷かを判定し、インボイスNOを設定する
		 */
		protected void setCndIvNo() {
			MAM_LG_CTL_R S1W = MAM_LG_CTL_R.create("W");
			MSW_SHIP_SCHD_KEY_R w1 = MSW_SHIP_SCHD_KEY_R.create("W1");
			MST_SHIP_PR_R t2 = MST_SHIP_PR_R.create("T2");
			MST_IV_MAP_R t3 = MST_IV_MAP_R.create("T3");
			MST_IV_D_R t4 = MST_IV_D_R.create("T4");
			MST_IV_R t5 = MST_IV_R.create("T5");
			MST_SLO_D_R t6 = MST_SLO_D_R.create("T6");
			MST_SLO_R t7 = MST_SLO_R.create("T7");
			MAM_BP_R m1 = MAM_BP_R.create("M1");
			MAM_LOC_R m2 = MAM_LOC_R.create("M2");

			MCList<MST_SHIP_SCHD_R> schdL = MCList.create(MST_SHIP_SCHD_R.class);
			MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
			schdL_bldr.setDistinct();
			schdL.addStringColumn("iv_no");
			schdL.addBooleanColumn("iv_ship_flg");
			schdL.addStringColumn("slo_iv_no");
			schdL.addStringColumn(MST_SHIP_PR_R.$trd_ptn_typ);
			schdL.addStringColumn(MST_SLO_R.$sls_basis_typ);
			schdL.addBooleanColumn("cst_iv_flg");
			schdL.addBooleanColumn("iv_trd_flg");
			schdL_bldr.setSelect(nvl(t.via_dlv_typ, t2.via_dlv_typ).as("via_dlv_typ"),
					t5.iv_no, t5.iv_ship_flg, t7.iv_no.as("slo_iv_no"), m1.cst_iv_flg,
					t2.trd_ptn_typ, t7.sls_basis_typ,
					cases().when(
							t2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
							.then(value(false))
							.otherwise(subQuery().select(max(S1W.iv_trd_flg)).from(S1W)
									.where(S1W.fr_lg_grp_cd.eq(t.ship_fr_lg_grp_cd)
											.and(S1W.to_lg_grp_cd.eq(m2.lg_grp_cd))))
							.as("iv_trd_flg"));
			schdL_bldr.addInnerJoin(w1, bracket( w1.ship_schd_no.eq(t.ship_schd_no)));
			schdL_bldr.addInnerJoin(t2, bracket( t2.ship_pr_no.eq(t.ship_pr_no)));
			schdL_bldr.addLeftOuterJoin(t3, bracket( t3.ship_schd_no.eq(t.ship_schd_no)));
			schdL_bldr.addLeftOuterJoin(t4, bracket( t4.iv_d_no.eq(t3.iv_d_no)));
			schdL_bldr.addLeftOuterJoin(t5, bracket( t5.iv_mng_no.eq(t4.iv_mng_no)));
			schdL_bldr.addLeftOuterJoin(t6, bracket( t6.slo_d_no.eq(t2.slo_d_no)));
			schdL_bldr.addLeftOuterJoin(t7, bracket( t7.slo_no.eq(t6.slo_no)));
			schdL_bldr.addLeftOuterJoin(m1, bracket( m1.bp_cd.eq(t2.cst_cd)));
			schdL_bldr.addLeftOuterJoin(m2, bracket( m2.loc_cd.eq(t2.dlv_id_cd)));
			schdL_bldr.addWhereWithAnd(t2.ship_inst_typ.eq(value(MAC_SHIP_INST_TYP.NON.value())));
			dbSelect("MSBEL1440_MST_SHIP_SCHD_S01", schdL, schdL_bldr);

			if (schdL.isEmpty()) {
				// 上り電文の出荷予定NOが不正
				throw new MCAppException(MSBEL0203, up0().ship_schd_no());
			}
			else {
				MST_SHIP_SCHD_R schdR = schdL.get(0);

				// インボイス取引かつ配送先経由しない場合は、インボイス単位出荷であること
				if (schdR.getBoolean("cst_iv_flg") || schdR.getBoolean("iv_trd_flg")) {
					if (!MAC_VIA_DLV_TYP.isVIA(schdR.getString("via_dlv_typ"))) {
						if (MAC_TRD_PTN_TYP.isSLS(schdR.getStringNE(MST_SHIP_PR_R.$trd_ptn_typ))) {
							if (MAC_SLS_BASIS_TYP.isSHIP_BASIS(schdR.getStringNE(MST_SLO_R.$sls_basis_typ)) && isNull(schdR.getString("iv_no"))) {
								throw new MCAppException(MSBEL1124);
							}
						}
						else if (MAC_TRD_PTN_TYP.isSHIP(schdR.getStringNE(MST_SHIP_PR_R.$trd_ptn_typ))) {
							// 何もしない
						}
						else {
							if (isNull(schdR.getString("iv_no"))) {
								throw new MCAppException(MSBEL0266);
							}
							else if (!schdR.getBoolean("iv_ship_flg")) {
								throw new MCAppException(MSBEL0267);
							}
						}
					}
					if (schdL.size() > 1) {
						List<String> ivShipIvNoL = new ArrayList<String>();
						for (MST_SHIP_SCHD_R r : schdL) {
							if (r.getBoolean("iv_ship_flg")) {
								// インボイスNOが混在(インボイス単位出荷が含まれる場合)
								ivShipIvNoL.add(r.getStringNE(MST_IV_R.$iv_no));
							}
						}
						if (ivShipIvNoL.size() > 0) {
							throw new MCAppException(MSBEL0204, String.join(",",ivShipIvNoL));
						}
					}
				}
				// インボイス取引対象（得意先）
				if (schdR.getBoolean("cst_iv_flg")) {
					if (isNull(schdR.getString("slo_iv_no"))) {
						// 受注インボイスNOなし、インボイス登録あり、かつインボイス単位出荷
						if (!isNull(schdR.getString("iv_no")) && schdR.getBoolean("iv_ship_flg")) {
							up0().iv_no(schdR.getString("iv_no"));
						}
					}
					else if (isNull(schdR.getString("iv_no"))) {
						// 受注インボイスNOあり、かつインボイスが登録されていない
						throw new MCAppException(MSBEL0205, schdR.getString("slo_iv_no"));
					}
					else if (isSame(schdR.getString("slo_iv_no"), schdR.getString("iv_no"))) {
						up0().iv_no(schdR.getString("iv_no"));
					}
				}
				// インボイス取引対象（移送・支給）
				else if (schdR.getBoolean("iv_trd_flg")) {
					// インボイス登録あり、かつインボイス単位出荷
					if (!isNull(schdR.getString("iv_no")) && schdR.getBoolean("iv_ship_flg")) {
						up0().iv_no(schdR.getString("iv_no"));
					}
				}
			}
		}
		
		/**
		 * 品揃え対象の出荷予定も含めて、検索対象の出荷予定をワークに登録する
		 */
		protected void setCndSSNo() {
			MCList<MST_SHIP_SCHD_R> schdL = getAssortSchdL();

			// SQLでは品揃え対象のみなので、品揃え以外の出荷予定を追加する
			for (String s : MCStringUtil.arrayValueSplit(up0().ship_schd_no())) {
				schdL.add().ship_schd_no(s);
			}
			MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
			dbWkDelete("MSBEL1440_MSW_SHIP_SCHD_D02", schdL_bldr.getBaseDbc());
			MCList<MST_SHIP_SCHD_R> schdL2 = schdL.groupBy(MST_SHIP_SCHD_R.$ship_schd_no);
			dbWkInsert("MSBEL1440_MSW_SHIP_SCHD_I02", schdL2, schdL_bldr.getBaseDbc());
		}
	}

	/**
	 * Srch03オペレーション.<p>
	 *
	 * 出荷実績を検索する。<br>
	 */
	public class Srch03 extends MSBEL_ShipActReg_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setCnd();
			doSrchShipAct();
		}
		@Override
		protected void doSearchSub() {
			super.doSearchSub();

			if (!isNull(up0().dlv_slip_no())) {
				if (down1().size() > 0) {
					Srch01_DtlR r = down1().getFirst(Srch01_DtlR.$dlv_slip_no, up0().dlv_slip_no());
					if (isNull(r)) {
						// 検索条件の納品書が存在しない場合はすべてをクリアする
						down0().clear();
						down1().clear();
						down2().clear();
					}
				}
			}
			setNonDlvPrntFlg();
		}
		@Override
		protected void doEditDown() {
			super.doEditDown();
			doEditDownForSrch(down0(), down1());
			doEditDownForAssort(down0(), down1());
		}

		/**
		 * 出荷実績、出荷実績明細を検索する
		 */
		protected void doSrchShipAct() {
			doSrch(up0(), down0(), down1(), down2(),
				MSBEL1440_MST_SHIP_ACT_S01(), "ship_act_d_no");
		}

		/**
		 * 最新の改訂番号を取得する
		 */
		protected void setCnd() {

			MST_SHIP_ACT_R t = MST_SHIP_ACT_R.create("T");
			MST_SHIP_ACT_D_R t1 = MST_SHIP_ACT_D_R.create("T1");
			MST_SHIP_ACT_R actR = MST_SHIP_ACT_R.create();
			MCQueryApiBuilder actR_bldr = MCQueryApiBuilder.create(t);
			actR_bldr.setSelect(t.ship_act_no, t.ship_act_rev, t.can_flg);
			if (!isNull(up0().dlv_slip_no())) {
				// 納品書NO指定の場合、出荷実績NOを特定する
				actR_bldr.setDistinct();
				actR_bldr.addInnerJoin(t1, bracket( t1.ship_act_no.eq(t.ship_act_no)));
				actR_bldr.setWhere(t1.dlv_slip_no.eq(bind("1")), up0().dlv_slip_no());
				actR_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
				dbSelect("MSBEL1440_MST_SHIP_ACT_S05", actR, actR_bldr);
				up0().ship_act_no(actR.ship_act_no());
				up0().ship_act_rev(actR.ship_act_rev());
			}
			else if (isNull(up0().ship_act_rev())) {
				// 改訂番号指定なしの場合、最新の改訂番号を取得する
				dbSelectKey("MSBEL1440_MST_SHIP_ACT_S06", actR, actR_bldr, up0());
				up0().ship_act_rev(actR.ship_act_rev());
			}
			else {
				// 上り電文の情報で出荷実績を取得する
			}
			// 参照モード
			if (isSame(up0().ope(), "3")) {
				boolean canFlg = false;
				if (!actR.isEmpty()) {
					canFlg = actR.can_flg();
				}
				else {
					
					if (!isNull(up0().ship_act_rev())) {
						
						MST_SHIP_ACT_P_R actP_t = MST_SHIP_ACT_P_R.create("T");
						MCQueryApiBuilder actPR_bldr = MCQueryApiBuilder.create(actP_t);
						actPR_bldr.setSelect(t.can_flg);
						
						MST_SHIP_ACT_P_R actPR = MST_SHIP_ACT_P_R.create();
						dbSelectKey("MSBEL1440_MST_SHIP_ACT_P_S01", actPR, actPR_bldr, up0());
						
						canFlg = actPR.can_flg();
					}
				}
				
				if (canFlg) {
					up0().addStringColumn("ref_mode_flg", MCBooleanUtil.booleanToDBString(true));
				}
				else {
					up0().addStringColumn("edit_mode_flg", MCBooleanUtil.booleanToDBString(true));
				}
			}
			else {
				up0().addStringColumn("edit_mode_flg", MCBooleanUtil.booleanToDBString(true));
			}
		}
		/**
		 * 発行不可フラグを設定する
		 */
		protected void setNonDlvPrntFlg() {
			// 計画外売上など、「出荷」のトランザクション区分を持たない納品伝票は発行不可
			if (down0().disable_prnt_flg()) {
				down0().non_dlv_prnt_flg(true);
				down0().non_adv_prnt_flg(true);
				return;
			}
			
			// 以下の条件を満たす場合、納品書は発行不可（出荷案内書は売上で発行しないので不要）
			// ・出荷で発行していない
			// ・売上済み
			for (MST_SHIP_ACT_R actR : checkSlsAct()) {
				if (!actR.dlv_prnt_flg() && !isNull(actR.getStringNE("sls_act_no"))) {
					down0().non_dlv_prnt_flg(true);
					break;
				}
			}
		}
		protected MCList<MST_SHIP_ACT_R> checkSlsAct() {
			MST_SHIP_ACT_D_R t1 = MST_SHIP_ACT_D_R.create("T1");
			MST_DLV_SLIP_R t2 = MST_DLV_SLIP_R.create("T2");
			MST_SLS_ACT_R t3 = MST_SLS_ACT_R.create("T3");
			
			MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t1);
			bldr.addLeftOuterJoin(t2,
				t2.dlv_slip_no.eq(t1.dlv_slip_no)
				.and(t2.dlv_slip_seq.eq(t1.dlv_slip_seq))
			);
			bldr.addLeftOuterJoin(t3,
				t3.ship_act_no.eq(t1.ship_act_no)
				.and(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
				.and(t3.ship_act_sync_flg.eq(value(false)))
			);
			bldr.setGroupBy(t1.ship_act_no, t1.dlv_slip_no);
			bldr.addMin(t2.slip_prnt_flg, "dlv_prnt_flg");
			bldr.addMin(t3.sls_act_no, "sls_act_no");
			bldr.setWhere(t1.ship_act_no.eq(bind("1")), down0().ship_act_no());
			bldr.addWhereWithAnd(t1.can_flg.eq(value(false)));
			
			MCList<MST_SHIP_ACT_R> rsltL = MCList.create(MST_SHIP_ACT_R.class);
			rsltL.addStringColumn(MST_DLV_SLIP_R.$dlv_slip_no);
			rsltL.addStringColumn(MST_SLS_ACT_R.$sls_act_no);
			dbSelect("MSBEL1440_MST_SHIP_ACT_S07", rsltL, bldr);
			
			return rsltL;
		}
	}

	/**
	 * 検索処理を実行する
	 */
	protected void doSrch(
		Srch01_CndR u0,
		Srch01_HdrR d0, MCList<Srch01_DtlR> d1, MCList<Srch01_CntrR> d2,
		MCQueryPlan sqlId, String grpKey) {

		u0.setDateNE("TODAY", getToday());
		MCList<Srch01_DtlR> dtlL = crtSrchDtl();
		executeQuery(dtlL, sqlId, u0);
		if (dtlL.isEmpty()) {
			return;
		}
		if (isNull(u0.ship_act_no())) {
			setDispSeq(dtlL);		// SQLの並び順を保持する
		}
		
		dtlL.setStatus(MCRow.NONE);
		if (!isNull(u0.iv_no())) {
			for (MCList<Srch01_DtlR> l : dtlL.groupList(Srch01_DtlR.$ship_schd_no)) {
				l.sort(SortType.DESC, Srch01_DtlR.$ship_alloc_sts_no);
				Srch01_DtlR schdR = l.get(0);

				// 引当状況ごとの未出荷数を算出
				l.forEach(r -> r.base_unit_qty(r.base_unit_qty().subtract(r.getNumber("alloc_act_qty"))));

				// 未出荷数に対してIV出荷予定数との差数(＝検索対象外のインボイス明細に対する出荷予定分)を減算する
				MCNumber qty = l.sum(Srch01_DtlR.$base_unit_qty).subtract(schdR.getNumber("schd_qty"));
				for (Srch01_DtlR r : l) {
					if (r.base_unit_qty().gt(qty)) {
						r.base_unit_qty(r.base_unit_qty().subtract(qty));

						MCNumber trdUnitQty
							= rvrsBaseUnitConv(
								r.base_unit_qty(), r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
								r.trd_unit_dec_place(), r.trd_unit_rnd_typ());
								
						MCNumber baseUnitQty 
							= convToBaseUnit(
								trdUnitQty, r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
								r.base_unit_dec_place(), r.base_unit_rnd_typ());
						if(isSame(baseUnitQty, r.base_unit_qty())) {
							r.trd_unit_qty(trdUnitQty);
						}
						else {
							r.trd_unit_qty(r.base_unit_qty());
							r.trd_unit_cd(r.base_unit_cd());
							r.trd_unit_nm(r.base_unit_nm());
						}
					}
					else {
						r.setStatus(MCRow.DELETE);
					}
					qty = qty.subtract(r.base_unit_qty());
					if (!qty.isPositive()) {
						break;
					}
				}
			}
		}
		dtlL.removeAll(dtlL.subList(MCRow.DELETE));
		if (dtlL.isEmpty())	return;

		// 出荷実績明細
		for (MCList<Srch01_DtlR> l : dtlL.groupList(grpKey)) {
			Srch01_DtlR r = l.get(0);
			if (l.size() > 1) {
				// 指図まとめの場合に複数になる
				// ただし、「売上」「出荷」やWG間依頼経由の移送は指図まとめの対象外
				r.ship_schd_no(null);
				r.xfr_schd_no(null);
				r.schd_qty(l.sum("schd_qty"));
				r.inst_qty(l.sum("inst_qty"));
				r.ship_qty(l.sum("ship_qty"));
				r.ret_qty(l.sum("ret_qty"));
				if (l.groupBy("pr_sts_typ").size() > 1) {
					// 状況が複数になる場合は「一部出荷」
					r.pr_sts_typ(MSC_PR_STS_TYP.PART_SHIP.value());
				}
			}
			d1.add(r);
		}
		setWmsFlg(d1, d0, u0);
		d1.sort("disp_seq");
		if (isNull(u0.ship_act_no())) {
			// 指図まとめにより上で設定した連番が飛び番になることがあるので再設定する
			setDispSeq(dtlL);	
		}

		// 出荷実績ヘッダ
		Srch01_DtlR hdrR = d1.get(0);
		// 出荷予定日時、納品予定日時は最も遅い日を採用する
		// ※指図対象外の出荷予定を検索する場合に、異なることがある
		hdrR.setDateNE("ship_schd_tm", (MCDate)d1.max("ship_schd_tm"));
		hdrR.setDateNE("dlv_schd_tm", (MCDate)d1.max("dlv_schd_tm"));
		hdrR.setBooleanNE("dlv_slip_prnted_flg", (boolean)d1.max("dlv_slip_prnted_flg"));
		hdrR.setBooleanNE("ship_adv_prnted_flg", (boolean)d1.max("ship_adv_prnted_flg"));
		copy(d0, d1.get(0), createMap_Srch01_HdrR_Srch01_DtlR());

		// 出荷進捗（更新カウンタ取得）
		if (!d0.uplnd_flg()) {
			setAll(d2, dtlL, createMap_Srch01_CntrR_Srch01_DtlR());
		}
	}

	/**
	 * WMS対象フラグを取得・設定する
	 */
	protected void setWmsFlg(MCList<Srch01_DtlR> dtlRL, Srch01_HdrR hdrR, Srch01_CndR srchCndR ) {

		MSUCL_SCMLinkUtil.SCMLinkUtil_Srch01 o = MSUCL_SCMLinkUtil.crtSCMLinkUtil_Srch01();

		Map<MCNumber, Srch01_DtlR> map = new HashMap<>();
		MCNumber peg = MCNumber.ZERO;
		if (!isNull(srchCndR.ship_inst_no())) {
			// 出荷指図ありの場合のみＷＭＳＦＬＧを設定する
			for (Srch01_DtlR dtlR : dtlRL) {
				
				SCMLinkUtil_Srch01_CndR r = o.up0().add();
				r.peg_no(peg);
				r.if_proc_typ(MAC_IF_PROC_TYP.WMS_SHIP_ACT_RECV.value());
				r.loc_cd(dtlR.ship_loc_cd());
				r.lg_grp_cd(hdrR.ship_fr_lg_grp_cd());
				r.master_dt(getToday());

				map.put(peg, dtlR);
				peg = peg.add(1);
			}
			if (!o.up0().isEmpty()) {
				o.exec();

				for (SCMLinkUtil_Srch01_CndR r : o.down0()) {
					if (map.containsKey(r.peg_no())) {
						Srch01_DtlR dtlR = map.get(r.peg_no());
						dtlR.wms_flg(!isNull(r.ext_sys_cd()));
					}
				}
			}
		}
	}
	/**
	 * 検索結果格納用コンテナを生成する
	 */
	protected MCList<Srch01_DtlR> crtSrchDtl() {
		MCList<Srch01_DtlR> dtlL = MCList.create(Srch01_DtlR.class);
		dtlL.addBooleanColumn("latest_flg");
		dtlL.addBooleanColumn("can_flg");
		dtlL.addBooleanColumn("ship_to_sundry_flg");
		dtlL.addBooleanColumn("inst_dlv_prnted_flg");
		dtlL.addBooleanColumn("dlv_slip_prnt_flg");
		dtlL.addBooleanColumn("ship_adv_prnt_flg");
		dtlL.addBooleanColumn("dlv_slip_prnted_flg");
		dtlL.addBooleanColumn("ship_adv_prnted_flg");
		dtlL.addBooleanColumn("uplnd_flg");
		dtlL.addNumberColumn("alloc_act_qty");
		dtlL.addNumberColumn("ship_act_upd_cntr");
		dtlL.addBooleanColumn("ship_loc_prio_flg");
		dtlL.addBooleanColumn("def_str_ln_tgt_flg");
		return dtlL;
	}

	/**
	 * 検索処理の下り電文を編集する
	 */
	protected void doEditDownForSrch(Srch01_HdrR d0, MCList<Srch01_DtlR> d1) {

		for (Srch01_DtlR  r : d1) {
			// 預りフラグ、貸出フラグ
			if (MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
				r.cststk_flg(MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ()));
				r.loan_flg(!r.cststk_flg());
			}
			else if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())) {
				r.cststk_flg(MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ()));
			}
			// Ｉ／Ｖ表記品名
			if (MAC_TRD_PTN_TYP.isSLS(r.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isSHIP(r.trd_ptn_typ())) {
				if (!r.cst_iv_flg()) {
					r.iv_itm_nm(null);
				}
			}
			else {
				if (!r.iv_trd_flg()) {
					r.iv_itm_nm(null);
				}
			}
			if (isNull(d0.ship_act_no())) {
				if (r.getBoolean("ship_loc_prio_flg")
						&& MAC_ALLOC_SCOPE_TYP.isALLOC_GRP(r.getString("alloc_scope_typ"))) {
					r.ship_loc_cd(r.getString("def_loc_cd"));
					r.ship_loc_nm(r.getString("def_loc_nm"));
					r.ship_str_ln_tgt_flg(r.getBoolean("def_str_ln_tgt_flg"));
					r.ship_str_ln_cd(null);
					r.ship_str_ln_nm(null);
				}
			}
			// 未出荷残数
			// インボイス出荷に一部出荷はないので対象外
			if (isNull(r.iv_d_no())) {
				if (isNull(r.ship_act_d_no())
					&& nvl(r.getNumber("alloc_act_qty"), MCNumber.ZERO).isPositive()) {
					r.base_unit_qty(r.base_unit_qty().subtract(r.getNumber("alloc_act_qty")));
					MCNumber trdUnitQty
						= rvrsBaseUnitConv(
							r.base_unit_qty(), r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
							r.trd_unit_dec_place(), r.trd_unit_rnd_typ());
							
					MCNumber baseUnitQty 
						= convToBaseUnit(
							trdUnitQty, r.trd_unit_conv_base_qty(), r.trd_unit_conv_qty(),
							r.base_unit_dec_place(), r.base_unit_rnd_typ());
					if(isSame(baseUnitQty, r.base_unit_qty())) {
						r.trd_unit_qty(trdUnitQty);
					}
					else {
						r.trd_unit_qty(r.base_unit_qty());
						r.trd_unit_cd(r.base_unit_cd());
						r.trd_unit_nm(r.base_unit_nm());
					}
				}
			}
			if (r.cont_fctr_flg()) {
				// 標準有効成分
				r.std_cont_qty(
					convToContFctrUnit(
						r.base_unit_qty(), r.std_cont_fctr(), r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ())
				);
				// 実際有効成分
				r.act_cont_qty(
					convToContFctrUnit(
						r.base_unit_qty(), r.act_cont_fctr(), r.cont_fctr_dec_place(), r.cont_fctr_rnd_typ())
				);
			}
			// 重量、容積
			if (!isNull(r.unit_wt())) {
				r.ship_wt(r.trd_unit_qty().multiply(r.unit_wt()));
				d0.ship_wt(nvl(d0.ship_wt(), MCNumber.ZERO).add(r.ship_wt()));
			}
			if (!isNull(r.unit_dim())) {
				r.ship_dim(r.trd_unit_qty().multiply(r.unit_dim()));
				d0.ship_dim(nvl(d0.ship_dim(), MCNumber.ZERO).add(r.ship_dim()));
			}
		}
		if (!isNull(d0.ship_wt())) {
			d0.ship_wt().setScale(Srch01_HdrR.ship_wt_META.scale(), MCNumber.MODE_DOWN);
		}
		if (!isNull(d0.ship_dim())) {
			d0.ship_dim().setScale(Srch01_HdrR.ship_dim_META.scale(), MCNumber.MODE_DOWN);
		}
	}

	protected Map_Srch01_HdrR_Srch01_DtlR<Srch01_HdrR, Srch01_DtlR> createMap_Srch01_HdrR_Srch01_DtlR() {
		return new Map_Srch01_HdrR_Srch01_DtlR<Srch01_HdrR, Srch01_DtlR>();
	}
	public class Map_Srch01_HdrR_Srch01_DtlR<D extends Srch01_HdrR, S extends Srch01_DtlR> extends MCRowMapper<D,S>{
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_HdrR.$trd_cd, "trd_cd");
			addColumnPathMap(Srch01_HdrR.$trd_nm, "trd_nm");
			addColumnPathMap(Srch01_HdrR.$trd_ptn_typ, "trd_ptn_typ");
			addColumnPathMap(Srch01_HdrR.$ship_act_no, "ship_act_no");
			addColumnPathMap(Srch01_HdrR.$ship_act_rev, "ship_act_rev");
			addColumnPathMap(Srch01_HdrR.$latest_flg, "latest_flg");
			addColumnPathMap(Srch01_HdrR.$can_flg, "can_flg");
			addColumnPathMap(Srch01_HdrR.$ship_inst_no, "ship_inst_no");
			addColumnPathMap(Srch01_HdrR.$iv_no, "iv_no");
			addColumnPathMap(Srch01_HdrR.$ship_dt, "ship_tm");
			addColumnPathMap(Srch01_HdrR.$ship_hm, "ship_tm");
			addColumnPathMap(Srch01_HdrR.$dlv_dt, "dlv_tm");
			addColumnPathMap(Srch01_HdrR.$dlv_hm, "dlv_tm");
			addColumnPathMap(Srch01_HdrR.$ship_schd_dt, "ship_schd_tm");
			addColumnPathMap(Srch01_HdrR.$ship_schd_hm, "ship_schd_tm");
			addColumnPathMap(Srch01_HdrR.$dlv_schd_dt, "dlv_schd_tm");
			addColumnPathMap(Srch01_HdrR.$dlv_schd_hm, "dlv_schd_tm");
			addColumnPathMap(Srch01_HdrR.$ship_inst_dt, "ship_inst_tm");
			addColumnPathMap(Srch01_HdrR.$ship_inst_hm, "ship_inst_tm");
			addColumnPathMap(Srch01_HdrR.$ship_to_id_typ, "ship_to_id_typ");
			addColumnPathMap(Srch01_HdrR.$ship_to_id_typ_nm, "ship_to_id_typ_nm");
			addColumnPathMap(Srch01_HdrR.$ship_to_id_cd, "ship_to_id_cd");
			addColumnPathMap(Srch01_HdrR.$ship_to_id_nm, "ship_to_id_nm");
			addColumnPathMap(Srch01_HdrR.$ship_to_cntry_cd, "ship_to_cntry_cd");
			addColumnPathMap(Srch01_HdrR.$ship_to_cntry_nm, "ship_to_cntry_nm");
			addColumnPathMap(Srch01_HdrR.$ship_to_zip_cd, "ship_to_zip_cd");
			addColumnPathMap(Srch01_HdrR.$ship_to_addr1, "ship_to_addr1");
			addColumnPathMap(Srch01_HdrR.$ship_to_addr2, "ship_to_addr2");
			addColumnPathMap(Srch01_HdrR.$ship_to_addr3, "ship_to_addr3");
			addColumnPathMap(Srch01_HdrR.$ship_to_addr4, "ship_to_addr4");
			addColumnPathMap(Srch01_HdrR.$ship_to_cntct_dpt, "ship_to_cntct_dpt");
			addColumnPathMap(Srch01_HdrR.$ship_to_cntct_psn, "ship_to_cntct_psn");
			addColumnPathMap(Srch01_HdrR.$ship_to_tel, "ship_to_tel");
			addColumnPathMap(Srch01_HdrR.$ship_to_fax, "ship_to_fax");
			addColumnPathMap(Srch01_HdrR.$ship_to_sundry_flg, "ship_to_sundry_flg");
			addColumnPathMap(Srch01_HdrR.$ship_to_lg_grp_cd, "ship_to_lg_grp_cd");
			addColumnPathMap(Srch01_HdrR.$ship_to_lg_grp_nm, "ship_to_lg_grp_nm");
			addColumnPathMap(Srch01_HdrR.$via_dlv_typ, "via_dlv_typ");
			addColumnPathMap(Srch01_HdrR.$via_dlv_typ_nm, "via_dlv_typ_nm");
			addColumnPathMap(Srch01_HdrR.$ship_usr_cd, "ship_usr_cd");
			addColumnPathMap(Srch01_HdrR.$ship_usr_nm, "ship_usr_nm");
			addColumnPathMap(Srch01_HdrR.$ship_dpt_cd, "ship_dpt_cd");
			addColumnPathMap(Srch01_HdrR.$ship_dpt_nm, "ship_dpt_nm");
			addColumnPathMap(Srch01_HdrR.$ship_fr_lg_grp_cd, "ship_fr_lg_grp_cd");
			addColumnPathMap(Srch01_HdrR.$ship_fr_lg_grp_nm, "ship_fr_lg_grp_nm");
			addColumnPathMap(Srch01_HdrR.$ship_term_cd, "ship_term_cd");
			addColumnPathMap(Srch01_HdrR.$ship_term_nm, "ship_term_nm");
			addColumnPathMap(Srch01_HdrR.$ship_wt, "ship_wt");
			addColumnPathMap(Srch01_HdrR.$ship_dim, "ship_dim");
			addColumnPathMap(Srch01_HdrR.$inst_dlv_prnted_flg, "inst_dlv_prnted_flg");
			addColumnPathMap(Srch01_HdrR.$dlv_slip_prnt_flg, "dlv_slip_prnt_flg");
			addColumnPathMap(Srch01_HdrR.$ship_adv_prnt_flg, "ship_adv_prnt_flg");
			addColumnPathMap(Srch01_HdrR.$dlv_slip_prnted_flg, "dlv_slip_prnted_flg");
			addColumnPathMap(Srch01_HdrR.$ship_adv_prnted_flg, "ship_adv_prnted_flg");
			addColumnPathMap(Srch01_HdrR.$uplnd_flg, "uplnd_flg");
			addColumnPathMap(Srch01_HdrR.$intr_rmrks, "intr_rmrks");
			addColumnPathMap(Srch01_HdrR.$sub_char1, "h_sub_char1");
			addColumnPathMap(Srch01_HdrR.$sub_char2, "h_sub_char2");
			addColumnPathMap(Srch01_HdrR.$sub_char3, "h_sub_char3");
			addColumnPathMap(Srch01_HdrR.$ship_act_upd_cntr, "ship_act_upd_cntr");
			addColumnPathMap(Srch01_HdrR.$ins_usr_id, "ins_usr_id");
			addColumnPathMap(Srch01_HdrR.$ins_usr_nm, "ins_usr_nm");
			addColumnPathMap(Srch01_HdrR.$ins_func_id, "ins_func_id");
			addColumnPathMap(Srch01_HdrR.$ins_ts, "ins_ts");
			addColumnPathMap(Srch01_HdrR.$upd_usr_id, "upd_usr_id");
			addColumnPathMap(Srch01_HdrR.$upd_usr_nm, "upd_usr_nm");
			addColumnPathMap(Srch01_HdrR.$upd_func_id, "upd_func_id");
			addColumnPathMap(Srch01_HdrR.$upd_ts, "upd_ts");
			addColumnPathMap(Srch01_HdrR.$upd_srv_req_no, "upd_srv_req_no");
			addColumnPathMap(Srch01_HdrR.$disable_prnt_flg, "disable_prnt_flg");
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.ac_dt(src.getDateNE("ac_dt"));
			dest.ac_ym(getAcYm(dest.ac_dt()));
			if (dest.uplnd_flg()) {
				dest.rqst_usr_cd(src.getStringNE("rqst_usr_cd"));
				dest.rqst_usr_nm(src.getStringNE("rqst_usr_nm"));
				dest.rqst_dpt_cd(src.getStringNE("rqst_dpt_cd"));
				dest.rqst_dpt_nm(src.getStringNE("rqst_dpt_nm"));
				dest.cst_iv_flg(src.cst_iv_flg());
				dest.prnt_lcl_cd(src.getStringNE("prnt_lcl_cd"));
			}
		}
	}
	protected Map_Srch01_CntrR_Srch01_DtlR<Srch01_CntrR, Srch01_DtlR> createMap_Srch01_CntrR_Srch01_DtlR() {
		return new Map_Srch01_CntrR_Srch01_DtlR<Srch01_CntrR, Srch01_DtlR>();
	}
	public class Map_Srch01_CntrR_Srch01_DtlR<D extends Srch01_CntrR, S extends Srch01_DtlR> extends MCRowMapper<D,S>{
		protected void setupColumnPathMap() {
			addColumnPathMap(Srch01_CntrR.$ship_alloc_sts_no, "ship_alloc_sts_no");
			addColumnPathMap(Srch01_CntrR.$ship_pr_no, "ship_pr_no");
			addColumnPathMap(Srch01_CntrR.$ship_pr_upd_cntr, "upd_cntr");
		}
	}

	/**
	 * 出荷予定ワークの出荷予定から品揃え対象のリストを取得する
	 */
	protected MCList<MST_SHIP_SCHD_R> getAssortSchdL() {
		MSW_SHIP_SCHD_KEY_R w1 = MSW_SHIP_SCHD_KEY_R.create("W1");
		MST_SHIP_PR_R t1 = MST_SHIP_PR_R.create("T1");
		MST_SLO_D_R t2 = MST_SLO_D_R.create("T2");
		MST_SLO_R t3 = MST_SLO_R.create("T3");
		MST_SLO_D_R t4 = MST_SLO_D_R.create("T4");
		MST_SHIP_PR_R t5 = MST_SHIP_PR_R.create("T5");
		MST_SHIP_SCHD_R t6 = MST_SHIP_SCHD_R.create("T6");

		MCList<MST_SHIP_SCHD_R> schdL = MCList.create(MST_SHIP_SCHD_R.class);
		MST_SHIP_SCHD_R t = MST_SHIP_SCHD_R.create("T");
		MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
		schdL.addStringColumn("org_ship_schd_no");
		schdL.addStringColumn("org_slo_d_no");
		schdL.addStringColumn("slo_no");
		schdL.addStringColumn("assort_typ");
		schdL.addStringColumn("set_itm_grp_no");
		schdL_bldr.setSelect(w1.ship_schd_no.as("org_ship_schd_no"),
				t2.slo_d_no.as("org_slo_d_no"), t3.slo_no, t3.assort_typ,
				t4.set_itm_grp_no, t4.slo_d_no, t4.base_unit_qty, t6.ship_schd_no);
		schdL_bldr.addInnerJoin(w1, bracket( w1.ship_schd_no.eq(t.ship_schd_no)));
		schdL_bldr.addInnerJoin(t1, bracket( t1.ship_pr_no.eq(t.ship_pr_no)));
		schdL_bldr.addInnerJoin(t2, bracket( t2.slo_d_no.eq(t1.slo_d_no)));
		schdL_bldr.addInnerJoin(t3, bracket( t3.slo_no.eq(t2.slo_no)));
		schdL_bldr.addInnerJoin(t4, bracket( t4.slo_no.eq(t3.slo_no)));
		schdL_bldr.addInnerJoin(t5, bracket(t5.slo_d_no.eq(t4.slo_d_no)
				.and(t5.ship_to_id_typ.eq(t1.ship_to_id_typ))
				.and(t5.ship_to_id_cd.eq(t1.ship_to_id_cd))
				.and(t5.ship_to_id_nm.eq(t1.ship_to_id_nm).or(t5.ship_to_id_nm.isNull())
						.and(t1.ship_to_id_nm.isNull()))
				.and(t5.ship_to_zip_cd.eq(t1.ship_to_zip_cd)
						.or(t5.ship_to_zip_cd.isNull()).and(t1.ship_to_zip_cd.isNull()))
				.and(t5.ship_to_addr1.eq(t1.ship_to_addr1).or(t5.ship_to_addr1.isNull())
						.and(t1.ship_to_addr1.isNull()))
				.and(t5.ship_to_addr2.eq(t1.ship_to_addr2).or(t5.ship_to_addr2.isNull())
						.and(t1.ship_to_addr2.isNull()))
				.and(t5.ship_to_addr3.eq(t1.ship_to_addr3).or(t5.ship_to_addr3.isNull())
						.and(t1.ship_to_addr3.isNull()))
				.and(t5.ship_to_addr4.eq(t1.ship_to_addr4).or(t5.ship_to_addr4.isNull())
						.and(t1.ship_to_addr4.isNull()))
				.and(t5.ship_to_cntct_dpt.eq(t1.ship_to_cntct_dpt)
						.or(t5.ship_to_cntct_dpt.isNull())
						.and(t1.ship_to_cntct_dpt.isNull()))
				.and(t5.ship_to_cntct_psn.eq(t1.ship_to_cntct_psn)
						.or(t5.ship_to_cntct_psn.isNull())
						.and(t1.ship_to_cntct_psn.isNull()))
				.and(t5.ship_to_tel.eq(t1.ship_to_tel).or(t5.ship_to_tel.isNull())
						.and(t1.ship_to_tel.isNull()))
				.and(t5.ship_to_fax.eq(t1.ship_to_fax).or(t5.ship_to_fax.isNull())
						.and(t1.ship_to_fax.isNull()))
				.and(t5.via_dlv_typ.eq(t1.via_dlv_typ).or(t5.via_dlv_typ.isNull())
						.and(t1.via_dlv_typ.isNull()))
				.and(t5.ship_to_lg_grp_cd.eq(t1.ship_to_lg_grp_cd)
						.or(t5.ship_to_lg_grp_cd.isNull())
						.and(t1.ship_to_lg_grp_cd.isNull()))));
		schdL_bldr.addInnerJoin(t6, bracket( t6.ship_pr_no.eq(t5.ship_pr_no)));
		schdL_bldr.setWhere(bracket(
				t2.set_itm_grp_no.isNotNull().and(t2.set_itm_grp_no.eq(t4.set_itm_grp_no))
						.or(t3.assort_typ.eq(value(MSC_SHIP_ASSORT_TYP.AST.value())))));
		schdL_bldr.addWhereWithAnd(t4.can_flg.eq(value(false)));
		schdL_bldr.addWhereWithAnd(t5.ship_inst_typ.eq(value(MAC_SHIP_INST_TYP.NON.value())));
		schdL_bldr.addWhereWithAnd(t6.abort_flg.eq(value(false)));
		dbSelect("MSBEL1440_MST_SHIP_SCHD_S02", schdL, schdL_bldr);

		return schdL;
	}

	/**
	 * 品揃え対象とするか調整する
	 */
	protected void doEditDownForAssort(Srch01_HdrR d0, MCList<Srch01_DtlR> d1) {
		// 品揃え対象の明細は、出荷時に全て揃っているかを画面側でチェックするが、
		// 一部出荷されている場合はチェックを行わないので、品揃えとして扱わないようすることでチェックしないようにする

		if (isNull(d0.ship_inst_no())) {
			// 指図対象以外はチェックしないので、後続処理を行わない
			return;
		}
		// 出荷対象の出荷予定
		MCList<MST_SHIP_SCHD_R> dbc = MCList.create(MST_SHIP_SCHD_R.class);
		d1.forEach(r -> {
			dbc.add().ship_schd_no(r.ship_schd_no());
		});
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_SHIP_SCHD_R.create("T"));
		dbWkDelete("MSBEL1440_MSW_SHIP_SCHD_D03", dbc_bldr.getBaseDbc());
		MCList<MST_SHIP_SCHD_R> dbc2 = dbc.groupBy(MST_SHIP_SCHD_R.$ship_schd_no);
		dbWkInsert("MSBEL1440_MSW_SHIP_SCHD_I03", dbc2, dbc_bldr.getBaseDbc());
		
		// 品揃え対象のリスト
		MCList<MST_SHIP_SCHD_R> schdL = getAssortSchdL();

		MCIndexKey
			sloIdx = d1.createIndex(Srch01_DtlR.$slo_no),
			sloDIdx = d1.createIndex(Srch01_DtlR.$slo_no, Srch01_DtlR.$slo_d_no);
		for (MCList<MST_SHIP_SCHD_R> sloL : schdL.groupList("slo_no")) {
			MST_SHIP_SCHD_R sloR = sloL.get(0);
			if (isNull(sloR.getString("slo_no"))) {
				continue;
			}
			if (MSC_SHIP_ASSORT_TYP.isAST(sloR.getString("assort_typ"))) {
				for (MCList<MST_SHIP_SCHD_R> sloDL : sloL.groupList("slo_d_no")) {
					// 受注明細ごとに予定数(schdQty)と出荷数(actQty)を比較
					MCNumber
						schdQty = sloDL.get(0).base_unit_qty(),
						actQty =	d1
								.subList(sloDIdx, sloR.getString("slo_no"), sloDL.get(0).getString("slo_d_no"))
								.sum(Srch01_DtlR.$base_unit_qty);

					if (!schdQty.eq(actQty)) {
						// 比較結果が異なる(一部出荷されている)場合、品揃えとして扱わない（＝画面側のチェックを無効にする）
						d1.subList(sloIdx, sloR.getString("slo_no")).forEach(r -> {
							r.assort_typ(null);
							r.set_itm_grp_no(null);
						});
						break;
					}
				}
			}
			else {
				for (MCList<MST_SHIP_SCHD_R> grpL : sloL.groupList("set_itm_grp_no")) {
					MST_SHIP_SCHD_R grpR = grpL.get(0);
					if (isNull(grpR.getString("set_itm_grp_no"))) {
						continue;
					}
					MCList<MST_SHIP_SCHD_R>[] gl = grpL.groupList("slo_d_no");
					for (MCList<MST_SHIP_SCHD_R> sloDL : gl) {
						// 受注明細ごとに予定数(schdQty)と出荷数(actQty)を比較
						MCNumber
							schdQty = sloDL.get(0).base_unit_qty(),
							actQty =	d1
									.subList(sloDIdx, sloR.getString("slo_no"), sloDL.get(0).getString("slo_d_no"))
									.sum(Srch01_DtlR.$base_unit_qty);

						if (!schdQty.eq(actQty)) {
							for (MCList<MST_SHIP_SCHD_R> l : gl) {
								// 比較結果が異なる(一部出荷されている)場合、品揃えとして扱わない（＝画面側のチェックを無効にする）
								d1.subList(sloDIdx, sloR.getString("slo_no"), l.get(0).getString("slo_d_no")).forEach(r -> {
									r.assort_typ(null);
									r.set_itm_grp_no(null);
								});
							}
							break;
						}
					}
				}
			}
		}
	}
	
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 支給元の支給計上日を取得する。<br>
	 */
	public class Sprt01 extends MSBEL_ShipActReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MCList<Sprt01_DtlR> dlvSlipNoL = MCList.create(Sprt01_DtlR.class);
			MCList<Sprt01_DtlR> provActNoL = MCList.create(Sprt01_DtlR.class);
			MCList<Sprt01_DtlR> retL = MCList.create(Sprt01_DtlR.class);

			for (Sprt01_DtlR r : up0()) {
				if (MAC_TRD_PTN_TYP.isPROV_RTN(r.trd_ptn_typ())) {
					if (isNull(r.base_ac_dt())) {
						if (!isNull(r.base_dlv_slip_no())) {
							dlvSlipNoL.add(r);
						}
						else if (!isNull(r.base_prov_act_no())) {
							provActNoL.add(r);
						}
					}
				}
			}
			retL.addAll(getDlvSlipNo(dlvSlipNoL));
			retL.addAll(getProvActNo(provActNoL));

			for (Sprt01_DtlR r : up0()) {
				if (!isNull(r.base_ac_dt())) {
					continue;
				}
				Sprt01_DtlR retR = null;
				if (!isNull(r.base_dlv_slip_no())) {
					retR = retL.getFirst(Sprt01_DtlR.$base_dlv_slip_no, r.base_dlv_slip_no());
				}
				else if (!isNull(r.base_prov_act_no())) {
					retR = retL.getFirst(Sprt01_DtlR.$base_prov_act_no, r.base_prov_act_no());
				}
				if (!isNull(retR)) {
					r.base_ac_dt(retR.base_ac_dt());
				}
				else {
					MCMessagePool.add(new MCMessage(r, Sprt01_DtlR.$base_ac_dt, MSBEL1104
					, r.base_dlv_slip_no()
					, r.base_prov_act_no()
					, toDispGUIIndex(r)));
				}
			}

			setDown();
		}

		protected MCList<Sprt01_DtlR> getDlvSlipNo(MCList<Sprt01_DtlR> dlvSlipNoL) {

			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
			MST_XFR_ACT_D_R t1 = MST_XFR_ACT_D_R.create("T1");
			MST_ARR_ACT_R t2 = MST_ARR_ACT_R.create("T2");
			MST_ARR_SCHD_R t3 = MST_ARR_SCHD_R.create("T3");
			MST_SHIP_ACT_D_R t4 = MST_SHIP_ACT_D_R.create("T4");

			MCQueryApiBuilder provActR_bldr = MCQueryApiBuilder.create(t);
			provActR_bldr.setSelect(t.ac_dt.as("base_ac_dt"));
			provActR_bldr.addSelect(
				cases().when(t.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.XFR.value())))
					.then(t1.dlv_slip_no)
					.when(t.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.SHIP.value())))
					.then(t3.dlv_slip_no)
					.when(t.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.RET_SHIP.value())))
					.then(t4.dlv_slip_no)
					.otherwise(t.dlv_slip_no)
					.as("base_dlv_slip_no"));
			provActR_bldr.addLeftOuterJoin(t1, t.prov_src_act_no.eq(t1.xfr_act_d_no));
			provActR_bldr.addLeftOuterJoin(t2, t.prov_src_act_no.eq(t2.arr_act_no));
			provActR_bldr.addLeftOuterJoin(t3, t2.arr_schd_no.eq(t3.arr_schd_no));
			provActR_bldr.addLeftOuterJoin(t4, t.prov_src_act_no.eq(t4.ship_act_d_no));
			provActR_bldr.setWhere(t.slip_sts_typ.eq(bind("slip_sts_typ")));
			provActR_bldr.addWhereWithAnd(bracket(
				t.dlv_slip_no.eq(bind("base_dlv_slip_no"))
				.or(t1.dlv_slip_no.eq(bind("base_dlv_slip_no")))
				.or(t3.dlv_slip_no.eq(bind("base_dlv_slip_no")))
				.or(t4.dlv_slip_no.eq(bind("base_dlv_slip_no")))
			));
			dlvSlipNoL.addStringColumn("slip_sts_typ", MAC_SLIP_STS_TYP.CRT.value());
			dbSelect("MSBEL1440_MST_PROV_ACT_S01", dlvSlipNoL, provActR_bldr, dlvSlipNoL);

			return dlvSlipNoL;

		}

		protected MCList<Sprt01_DtlR> getProvActNo(MCList<Sprt01_DtlR> provActNoL) {

			MST_PROV_ACT_R t = MST_PROV_ACT_R.create("T");
			MCQueryApiBuilder provActR_bldr = MCQueryApiBuilder.create(t);
			provActR_bldr.setSelect(t.ac_dt.as("base_ac_dt"));
			provActR_bldr.addSelect(t.prov_act_no.as("base_prov_act_no"));
			provActR_bldr.setWhere(t.slip_sts_typ.eq(bind("slip_sts_typ")));
			provActR_bldr.addWhereWithAnd(t.prov_act_no.eq(bind("base_prov_act_no")));
			provActNoL.addStringColumn("slip_sts_typ", MAC_SLIP_STS_TYP.CRT.value());
			dbSelect("MSBEL1440_MST_PROV_ACT_S02", provActNoL, provActR_bldr, provActNoL);

			return provActNoL;

		}

		protected void setDown() {
			down0().setAll(up0());
		}

	}

	//FMCB CUSTOM END
}