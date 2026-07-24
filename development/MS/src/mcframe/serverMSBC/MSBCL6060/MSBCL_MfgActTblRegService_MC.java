package mcframe.serverMSBC.MSBCL6060;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0030.FXUCL_MCDbcCache;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
import mcframe.serverMSBC.MSBCL6040.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBE.MSBEL5040.*;
import mcframe.serverMSBD.MSBDL5190.*;
import mcframe.serverMSBE.MSBEL5270.*;
import mcframe.serverMSBI.MSBIL5010.*;
import mcframe.serverMAUC.MAUCL1060.*;
import mcframe.serverMAUC.MAUCL0100.MAUCL_AmtUtil;
import static mcframe.serverMSUC.MSUCL0030.MSUCL_ProdUtil.*;
import mcframe.serverFXUC.FXUCL0030.FXUCL_Cache;
import mcframe.commonCore.resource.MCLocaleConst;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MfgActTblRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MfgActTblRegService_MC extends MSBCL_MfgActTblRegService_MC_A{
	//FMCB CUSTOM START

	/**
	 * MfgActTblReg_Chk05オペレーション.<p>
	 *
	 * 工数実績を更新するために共通的なチェックを行う<br>
	 */
	public class MfgActTblReg_Chk05 extends MSBCL_MfgActTblRegService_MC_A.MfgActTblReg_Chk05 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			MCMessageList msgL = new MCMessageList();

			msgL.addAll(chkWkCost());
			MCMessagePool.addAll(msgL);

			setDown();
		}
		
		protected MCMessageList chkWkCost() {
			MCMessageList msgL = new MCMessageList();
			
			MSBIL_ClService.Cl_Chk03 acDtChk = MSBIL_ClService.crtCl_Chk03();
			MSBIL_ClService.Cl_Chk03 oldAcDtChk = MSBIL_ClService.crtCl_Chk03();
			
			for (MfgActTblReg_Chk05_DtlR r : up0()) {
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					msgL.addAll(check(r, MfgActTblReg_Chk05_DtlR.$act_wk_cost, new FXUCL_RequiredValidater()));
	
					// 有効桁数チェック
					msgL.addAll(checkDecPlace(r, MfgActTblReg_Chk05_DtlR.$wk_cost_dec_place, MfgActTblReg_Chk05_DtlR.$act_wk_cost));
					if (r.wk_cost_calc_ctl_flg() && !isNullOr(r.ac_dt(), r.st_tm(), r.end_tm())) {
						MCNumber switchTime = nvl(getCo().dt_switch_time(), MCNumber.ZERO);
						MCDate endDtSwitchTm = r.ac_dt().startTimeOfDay();
						MCDate endTm = r.end_tm();
						if (switchTime.isNegative()) {
							endDtSwitchTm = endDtSwitchTm.addDay(1);
						}
						endDtSwitchTm = endDtSwitchTm.addHour(switchTime);
						
						if (r.st_tm().gte(endDtSwitchTm)) {
							endDtSwitchTm = endDtSwitchTm.addDay(1);
						}
						if (r.st_tm().gt(endTm)) {
							endTm = endTm.addDay(1);
						}
						if (r.st_tm().gt(endTm) || endTm.gt(endDtSwitchTm)) {
							String tmFormat = MCLocaleConst.format(getUsrLocale())
									.getString("date.HM.output.pattern", "HH:mm");
							msgL.add(new MCMessage(r, null, MSBCL1138,
									r.st_tm().toString(tmFormat),
									endDtSwitchTm.toString(tmFormat),
									toDispGUIIndex(r)));
							r.err_flg(true);
						}
					}
				}
				
				// 計上日
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					Cl_Chk03_CndR oUpR = Cl_Chk03_CndR.create();
					copy(oUpR, r, createMap_Cl_Chk03_CndR_MfgActTblReg_Chk05_DtlR());
					oUpR.ac_dt(r.ac_dt());
					acDtChk.up0().add(oUpR);
				}
				
				// 更新前計上日
				if (isChkOldAcDt(r)) {
					Cl_Chk03_CndR oUpR = Cl_Chk03_CndR.create();
					copy(oUpR, r, createMap_Cl_Chk03_CndR_MfgActTblReg_Chk05_DtlR());
					oUpR.ac_dt(r.old_ac_dt());
					oldAcDtChk.up0().add(oUpR);
					oldAcDtChk.up1().no_msg_flg(true);
				}
			}
			
			if (!acDtChk.up0().isEmpty()) {
				acDtChk.exec();
				copyErrFlg(up0(), acDtChk.down0());
			}
			
			
			if (!oldAcDtChk.up0().isEmpty()) {
				oldAcDtChk.exec();
				MCIndexKey idxkey = oldAcDtChk.down0().createIndex(Cl_Chk03_CndR.$peg_no);
				for (MfgActTblReg_Chk05_DtlR r : up0()) {
					Cl_Chk03_CndR oldStR  = oldAcDtChk.down0().getFirst(idxkey, r.peg_no());
					if (!isNull(oldStR) && oldStR.err_flg()) {
						msgL.add(new MCMessage(r, null, MSBCL1075, toYMDString(r.old_ac_dt()), toDispGUIIndex(r)));
					}
				}
			}
			for (MfgActTblReg_Chk05_DtlR r : up0()) {
				setErrFlgCmm(r, msgL);
			}
			
			return msgL;
		}
		
		protected boolean isChkOldAcDt(MfgActTblReg_Chk05_DtlR r) {
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				return true;
			}
			if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
				if (!isSame(r.ac_dt(), r.old_ac_dt())) {
					return true;
				}
			}
			return false;
		}
		
		protected Map_Cl_Chk03_CndR_MfgActTblReg_Chk05_DtlR<Cl_Chk03_CndR,MfgActTblReg_Chk05_DtlR> createMap_Cl_Chk03_CndR_MfgActTblReg_Chk05_DtlR() {
			return new Map_Cl_Chk03_CndR_MfgActTblReg_Chk05_DtlR<Cl_Chk03_CndR, MfgActTblReg_Chk05_DtlR>();
		}

		public class Map_Cl_Chk03_CndR_MfgActTblReg_Chk05_DtlR<D extends Cl_Chk03_CndR, S extends MfgActTblReg_Chk05_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Cl_Chk03_CndR.$peg_no, MfgActTblReg_Chk05_DtlR.$peg_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.stk_cls_chk_flg(true);
				dest.io_lmt_skip_flg(true);
			}
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * MfgActTblReg_Upd05オペレーション.<p>
	 *
	 * 工数実績を更新する<br>
	 */
	public class MfgActTblReg_Upd05 extends MSBCL_MfgActTblRegService_MC_A.MfgActTblReg_Upd05 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if (up0().isEmpty()) {
				return;
			}
			editUp();
			updWkAct();
			setDown();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			int cacheSize = up0().subList(MfgActTblReg_Upd05_DtlR.$data_crud_typ,
					MAC_DATA_CRUD_TYP.CRT.value()).size();
			doSeqCache(MSC_NUM_SYS_TYP.WKACT, cacheSize);

			MCList<MfgActTblReg_Upd05_DtlR> asstDptL = MCList.create(MfgActTblReg_Upd05_DtlR.class);
			MCList<MfgActTblReg_Upd05_DtlR> locL = MCList.create(MfgActTblReg_Upd05_DtlR.class);

			for (MfgActTblReg_Upd05_DtlR r : up0()) {
				if (!MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()) && !isNull(r.mfg_act_no())) {
					// 指図工数実績のリスト
					asstDptL.add(r);
				}
				if (!isNull(r.loc_cd())) {
					locL.add(r);
				}
			}

			// 場所の資産管理部門の取得
			if (!asstDptL.isEmpty()) {
				execDbFuncBatch(createSqlId(LOGIC_ID, "MAPA_LOC$F_GET_ASST_DPT_CD", "01"), MABSFunction.getFunctionExecuter("MAPA_LOC$F_GET_ASST_DPT_CD"), MfgActTblReg_Upd05_DtlR.$dpt_cd, asstDptL, MfgActTblReg_Upd05_DtlR.$loc_cd, MfgActTblReg_Upd05_DtlR.$ac_dt);

			}

			// 場所のＷＧＣＤを取得
			if (!locL.isEmpty()) {
				MAM_LOC_R t = MAM_LOC_R.create("T");
				MCQueryApiBuilder locDbcL_bldr = MCQueryApiBuilder.create(t);
				locDbcL_bldr.setSelect(t.wg_cd);
				FXUCL_MCDbcCache<MAM_LOC_R> locCache = new FXUCL_MCDbcCache<MAM_LOC_R>(locDbcL_bldr,
						locL, MfgActTblReg_Upd05_DtlR.$dpt_cd);

				for (MfgActTblReg_Upd05_DtlR r : locL) {
					r.loc_wg_cd(locCache.getEx(r.loc_cd()).wg_cd());
				}
			}
		}
		
		/**
		 * 工数実績を更新する
		 */
		protected void updWkAct() {
			MCList<MST_WK_ACT_R> insL = MCList.create(MST_WK_ACT_R.class);
			MCList<MST_WK_ACT_R> updL = MCList.create(MST_WK_ACT_R.class);
			MCList<MST_WK_ACT_R> delL = MCList.create(MST_WK_ACT_R.class);
			

			for (MfgActTblReg_Upd05_DtlR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(r.wk_act());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updL.add(r.wk_act());
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delL.add(r.wk_act());
				}
			}
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_WK_ACT_R.create("T"));
				dbInsertEx("MSBCL6060_MST_WK_ACT_I01", insL, insL_bldr);
			}
			if (!updL.isEmpty()) {
				MST_WK_ACT_R t = MST_WK_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				editUpdSetStmt(updL, updL_bldr, t);
				dbUpdateKey("MSBCL6060_MST_WK_ACT_U01", updL, updL_bldr);
			}
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_WK_ACT_R.create("T"));
				dbDeleteKey("MSBCL6060_MST_WK_ACT_D01", delL, delL_bldr);
			}
		}

		/**
		 * 更新時のset句の編集
		 */
		protected void editUpdSetStmt(MCList<MST_WK_ACT_R> updL,MCQueryApiBuilder updL_bldr,MST_WK_ACT_R t) {
			updL_bldr.setSet(t.wk_act_no, t.wk_cost_cd, t.wk_cost, t.st_tm, t.end_tm, t.brk_pd, t.ac_dt, t.wk_rsn_cd, t.wk_cost_calc_ctl_flg, t.wk_day_cd, t.dpt_cd, t.loc_cd, t.str_ln_cd, t.wk_usr_dpt_cd, t.wk_usr_cd, t.fclty, t.oper_cd, t.sno1, t.sno2, t.sno3, t.sno4, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.lot_no, t.sublot_no, t.dpt_wg_cd, t.loc_wg_cd, t.intr_rmrks, t.oper_act_no, t.sub_char1, t.sub_char2, t.sub_char3);
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * MfgActTblReg_Upd01オペレーション.<p>
	 *
	 * 製造実績を更新する<br>
	 */
	public class MfgActTblReg_Upd01 extends MSBCL_MfgActTblRegService_MC_A.MfgActTblReg_Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			MCList<MST_MFG_ACT_R> insL = MCList.create(MST_MFG_ACT_R.class);
			MCList<MST_MFG_ACT_R> updL = MCList.create(MST_MFG_ACT_R.class);
			MCList<MST_MFG_ACT_R> delL = MCList.create(MST_MFG_ACT_R.class);

			for (MfgActTblReg_Upd01_DtlR r :up0()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(r.mfg_act());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updL.add(r.mfg_act());
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delL.add(r.mfg_act());
				}
			}
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_MFG_ACT_R.create("T"));
				dbInsertEx("MSBCL6060_MST_MFG_ACT_I01", insL, insL_bldr);
			}
			if (!updL.isEmpty()) {
				MST_MFG_ACT_R t = MST_MFG_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				editUpdSetSt(updL, updL_bldr, t);
				dbUpdateKey("MSBCL6060_MST_MFG_ACT_U01", updL, updL_bldr);
			}
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_MFG_ACT_R.create("T"));
				dbDeleteKey("MSBCL6060_MST_MFG_ACT_D01", delL, delL_bldr);
			}
		}

		/**
		 * 更新時のset句の編集
		 */
		protected void editUpdSetSt(MCList<MST_MFG_ACT_R> updL, MCQueryApiBuilder updL_bldr, MST_MFG_ACT_R t) {
			updL_bldr.setSet(t.trd_cd, t.st_act_tm, t.end_act_tm, t.base_unit_yield_qty, t.base_unit_dfct_qty, t.base_unit_cd, t.st_ac_dt, t.end_ac_dt, t.itm_yield, t.mfg_aprv_sts_typ, t.aprv_dt, t.aprv_dpt_cd, t.aprv_usr_cd, t.aprv_tm, t.aprv_rsn, t.act_prnt_flg, t.act_prnt_tm, t.seq, t.act_dpt_cd, t.act_usr_cd, t.intr_rmrks, t.act_rpt_rmrks, t.sub_char1, t.sub_char2, t.sub_char3);
		}
	}

	/**
	 * MfgActTblReg_Upd02オペレーション.<p>
	 *
	 * 工程実績を更新する<br>
	 */
	public class MfgActTblReg_Upd02 extends MSBCL_MfgActTblRegService_MC_A.MfgActTblReg_Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();

			updOperAct();

			callLotSrvUpd07();
		}
		
		protected void editUp() {
			for (MfgActTblReg_Upd02_DtlR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
						|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					r.base_unit_qty(convQtyOperToBase(r.oper_unit_qty(),
							r.oper_conv_qty(), r.oper_std_qty(), r.base_unit_dec_place(),
							r.base_unit_conv_rnd_typ(), r.base_unit_cd(),
							r.oper_unit_cd()));
				}
			}
		}

		/**
		 * 工程実績を更新する
		 */
		protected void updOperAct() {
			MCList<MST_OPER_ACT_R> insL = MCList.create(MST_OPER_ACT_R.class);
			MCList<MST_OPER_ACT_R> updL = MCList.create(MST_OPER_ACT_R.class);
			MCList<MST_OPER_ACT_R> delL = MCList.create(MST_OPER_ACT_R.class);

			for (MfgActTblReg_Upd02_DtlR r :up0()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(r.oper_act());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updL.add(r.oper_act());
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delL.add(r.oper_act());
				}
			}
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_OPER_ACT_R.create("T"));
				dbInsertEx("MSBCL6060_MST_OPER_ACT_I01", insL, insL_bldr);
			}
			if (!updL.isEmpty()) {
				MST_OPER_ACT_R t = MST_OPER_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				editUpdSetSt(updL, updL_bldr, t);
				dbUpdateKey("MSBCL6060_MST_OPER_ACT_U01", updL, updL_bldr);
			}
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_OPER_ACT_R.create("T"));
				dbDeleteKey("MSBCL6060_MST_OPER_ACT_D01", delL, delL_bldr);
			}
		}

		/**
		 * 更新時のset句の編集
		 */
		protected void editUpdSetSt(MCList<MST_OPER_ACT_R> updL, MCQueryApiBuilder updL_bldr, MST_OPER_ACT_R t) {
			updL_bldr.setSet(t.disp_seq, t.st_act_tm, t.end_act_tm, t.base_unit_cd, t.base_unit_qty, t.oper_unit_qty, t.oper_unit_cd, t.bkf_ctl_flg, t.wk_cost_calc_ctl_flg, t.oper_yield, t.bkf_not_ref_flg, t.ext_sys_cd, t.ext_oper_act_no, t.if_auto_reg_flg, t.intr_rmrks, t.act_rpt_rmrks, t.sub_char1, t.sub_char2, t.sub_char3);
		}

		/**
		 * ロットの期限更新処理を呼び出す
		 */
		protected void callLotSrvUpd07() {
			MSBFL_LotService.Lot_Upd07 ope = MSBFL_LotService.crtLot_Upd07();
			addAll(ope.up0(), up0(), createMap_Lot_Upd07_CndR_MfgActTblReg_Upd02_DtlR());
			ope.exec();
		}

		protected Map_Lot_Upd07_CndR_MfgActTblReg_Upd02_DtlR<Lot_Upd07_CndR,MfgActTblReg_Upd02_DtlR> createMap_Lot_Upd07_CndR_MfgActTblReg_Upd02_DtlR() {
			return new Map_Lot_Upd07_CndR_MfgActTblReg_Upd02_DtlR<Lot_Upd07_CndR, MfgActTblReg_Upd02_DtlR>();
		}

		public class Map_Lot_Upd07_CndR_MfgActTblReg_Upd02_DtlR<D extends Lot_Upd07_CndR, S extends MfgActTblReg_Upd02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd07_CndR.$data_crud_typ, MfgActTblReg_Upd02_DtlR.$data_crud_typ);
				addColumnPathMap(Lot_Upd07_CndR.$mfg_act_no, MfgActTblReg_Upd02_DtlR.$mfg_act_no);
				addColumnPathMap(Lot_Upd07_CndR.$oper_inst_no, MfgActTblReg_Upd02_DtlR.$oper_inst_no);
			}
		}
	}

	/**
	 * MfgActTblReg_Upd03オペレーション.<p>
	 *
	 * 出来高実績を更新する<br>
	 */
	public class MfgActTblReg_Upd03 extends MSBCL_MfgActTblRegService_MC_A.MfgActTblReg_Upd03 {
		/** 
		 * 品目マスタ・キャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if (up0().isEmpty()) {
				return;
			}
			
			editUp();

			callInspSchdSrvSrch02();

			updYieldAct();

			MCList<MfgActTblReg_Upd03_DtlR> intnlL = up0().subList(
					MfgActTblReg_Upd03_DtlR.$mfg_mtd_typ, MSC_MFG_MTD_TYP.INTNL.value());

			if (!intnlL.isEmpty()) {
				callInspSchdSrvUpd01(intnlL);
	
				callIoActSrvIns01(intnlL);
	
				callLotSrvLotUpd08(intnlL);
			}
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			for (MfgActTblReg_Upd03_DtlR r : up0()) {
				if (r.pack_flg()) {
					r.pack_unit_qty(r.trd_unit_qty());
					r.pack_unit_cd(r.trd_unit_cd());
				}
				else {
					r.pack_unit_qty(r.base_unit_qty());
					r.pack_unit_cd(r.base_unit_cd());
				}
			}
		}

		/**
		 * 出来高実績を更新する
		 */
		protected void updYieldAct() {

			MCList<MST_YIELD_ACT_R> insL = MCList.create(MST_YIELD_ACT_R.class);
			MCList<MST_YIELD_ACT_R> updL = MCList.create(MST_YIELD_ACT_R.class);
			MCList<MST_YIELD_ACT_R> delL = MCList.create(MST_YIELD_ACT_R.class);

			for (MfgActTblReg_Upd03_DtlR r :up0()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(r.yield_act());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updL.add(r.yield_act());
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delL.add(r.yield_act());
				}
			}
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_YIELD_ACT_R.create("T"));
				dbInsertEx("MSBCL6060_MST_YIELD_ACT_I01", insL, insL_bldr);
			}
			if (!updL.isEmpty()) {
				MST_YIELD_ACT_R t = MST_YIELD_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				editUpdSetSt(updL, updL_bldr, t);
				dbUpdateKey("MSBCL6060_MST_YIELD_ACT_U01", updL, updL_bldr);
			}
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_YIELD_ACT_R.create("T"));
				dbDeleteKey("MSBCL6060_MST_YIELD_ACT_D01", delL, delL_bldr);
			}
		}

		/**
		 * 更新時のset句の編集
		 */
		protected void editUpdSetSt(MCList<MST_YIELD_ACT_R> updL, MCQueryApiBuilder updL_bldr, MST_YIELD_ACT_R t) {
			updL_bldr.setSet(t.trd_unit_qty, t.trd_unit_cd, t.base_unit_qty, t.base_unit_cd, t.yield_typ, t.yield_rate, t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4, t.quality_typ, t.stk_insp_typ, t.gd_cd, t.yield_rsn_cd, t.yield_loc_cd, t.yield_str_ln_cd, t.strg_loc_cd, t.strg_str_ln_cd, t.act_tm, t.ac_dt, t.bkf_ctl_flg, t.lot_ctl_flg, t.sublot_ctl_flg, t.ext_sys_cd, t.ext_yield_act_no, t.intr_rmrks, t.act_rpt_rmrks, t.insp_cnt_rmrks, t.trd_rmrks, t.sub_char1, t.sub_char2, t.sub_char3);
		}

		/**
		 * 検査区分を設定する
		 * @param intnlL 
		 */
		protected void callInspSchdSrvSrch02() {

			//データ更新区分が「削除」以外
			MCList<MfgActTblReg_Upd03_DtlR> srchL = up0().subList(
					r -> (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP
							.isUPD(r.data_crud_typ())));

			//生産方法区分が内製
			MCList<MfgActTblReg_Upd03_DtlR> intnlL = srchL.subList(
					MfgActTblReg_Upd03_DtlR.$mfg_mtd_typ, MSC_MFG_MTD_TYP.INTNL.value());

			//検査予定サービスから在庫検査区分を取得
			MSBFL_InspSchdService.InspSchd_Srch02 ope = MSBFL_InspSchdService.crtInspSchd_Srch02();
			addAll(ope.up0(), intnlL, createMap_InspSchd_Srch02_CndR_MfgActTblReg_Upd03_DtlR());

			if(!ope.up0().isEmpty()) {
				ope.exec();

				String[] destCols = new String[] {MfgActTblReg_Upd03_DtlR.$stk_insp_typ};
				String[] srcCols = new String[] {InspSchd_Srch02_CndR.$stk_insp_typ};
				copyByPegNo(up0(), destCols, ope.down0(), srcCols);
			}

			//生産方法区分が外注
			MCList<MfgActTblReg_Upd03_DtlR> exnlL = srchL.subList(
					MfgActTblReg_Upd03_DtlR.$mfg_mtd_typ, MSC_MFG_MTD_TYP.EXTNL.value());

			for (MfgActTblReg_Upd03_DtlR r :exnlL) {
				r.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
			}

		}

		/**
		 * 検査関連データを登録する
		 * @param intnlL 
		 */
		protected void callInspSchdSrvUpd01(MCList<MfgActTblReg_Upd03_DtlR> intnlL) {
			MSBFL_InspSchdService.InspSchd_Upd01 ope = MSBFL_InspSchdService.crtInspSchd_Upd01();

			addAll(ope.up0(), up0(), createMap_InspSchd_Upd01_CndR_MfgActTblReg_Upd03_DtlR());

			ope.exec();
		}

		/** 
		 * 受払実績ワークを作成する
		 * @param intnlL 
		 */
		protected void callIoActSrvIns01(MCList<MfgActTblReg_Upd03_DtlR> intnlL) {
			MCList<MfgActTblReg_Upd03_DtlR> ioL = intnlL.subList(
					MfgActTblReg_Upd03_DtlR.$not_stk_flg, false);

			MCList<MfgActTblReg_Upd03_DtlR> insUpdL = ioL.subList(r -> (MAC_DATA_CRUD_TYP
					.isCRT(r.data_crud_typ()) || MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())));

			if (!insUpdL.isEmpty()) {
				crtItmCache(insUpdL);
			}

			MSBEL_IoActService.IoAct_Ins01 ope = MSBEL_IoActService.crtIoAct_Ins01();
			addAll(ope.up0(), ioL, createMap_IoAct_Ins01_DtlR_MfgActTblReg_Upd03_DtlR());

			ope.exec();
		}

		/**
		 * 品目マスタ・キャッシュの作成
		 * @param insUpdL 
		 */
		protected void crtItmCache(MCList<MfgActTblReg_Upd03_DtlR> insUpdL) {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
			itmL_bldr.setSelect(t.stk_mng_typ, t.sundry_itm_flg);
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(itmL_bldr, insUpdL,
					MfgActTblReg_Upd03_DtlR.$itm_cd,
					MfgActTblReg_Upd03_DtlR.$itm_sub1,
					MfgActTblReg_Upd03_DtlR.$itm_sub2,
					MfgActTblReg_Upd03_DtlR.$itm_sub3);
		}

		/** 
		 * ロット情報サービスを呼び出す
		 * @param intnlL 
		 */
		protected void callLotSrvLotUpd08(MCList<MfgActTblReg_Upd03_DtlR> intnlL) {
			MSBFL_LotService.Lot_Upd08 ope = MSBFL_LotService.crtLot_Upd08();
			addAll(ope.up0(), intnlL, createMap_Lot_Upd08_CndR_MfgActTblReg_Upd03_DtlR());

			ope.exec();
		}

		protected Map_InspSchd_Srch02_CndR_MfgActTblReg_Upd03_DtlR<InspSchd_Srch02_CndR,MfgActTblReg_Upd03_DtlR> createMap_InspSchd_Srch02_CndR_MfgActTblReg_Upd03_DtlR() {
			return new Map_InspSchd_Srch02_CndR_MfgActTblReg_Upd03_DtlR<InspSchd_Srch02_CndR, MfgActTblReg_Upd03_DtlR>();
		}

		public class Map_InspSchd_Srch02_CndR_MfgActTblReg_Upd03_DtlR<D extends InspSchd_Srch02_CndR, S extends MfgActTblReg_Upd03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch02_CndR.$peg_no, MfgActTblReg_Upd03_DtlR.$peg_no);
				addColumnPathMap(InspSchd_Srch02_CndR.$src_no1, MfgActTblReg_Upd03_DtlR.$mfg_inst_no);
				addColumnPathMap(InspSchd_Srch02_CndR.$src_no2, MfgActTblReg_Upd03_DtlR.$itm_mfg_inst_no);
				addColumnPathMap(InspSchd_Srch02_CndR.$src_no3, MfgActTblReg_Upd03_DtlR.$yield_schd_no);
				addColumnPathMap(InspSchd_Srch02_CndR.$src_no4, MfgActTblReg_Upd03_DtlR.$yield_act_no);
				addColumnPathMap(InspSchd_Srch02_CndR.$itm_cd, MfgActTblReg_Upd03_DtlR.$itm_cd);
				addColumnPathMap(InspSchd_Srch02_CndR.$itm_sub1, MfgActTblReg_Upd03_DtlR.$itm_sub1);
				addColumnPathMap(InspSchd_Srch02_CndR.$itm_sub2, MfgActTblReg_Upd03_DtlR.$itm_sub2);
				addColumnPathMap(InspSchd_Srch02_CndR.$itm_sub3, MfgActTblReg_Upd03_DtlR.$itm_sub3);
				addColumnPathMap(InspSchd_Srch02_CndR.$quality_typ, MfgActTblReg_Upd03_DtlR.$quality_typ);
				addColumnPathMap(InspSchd_Srch02_CndR.$gr_dt, MfgActTblReg_Upd03_DtlR.$act_tm);
				addColumnPathMap(InspSchd_Srch02_CndR.$base_unit_qty, MfgActTblReg_Upd03_DtlR.$base_unit_qty);
				addColumnPathMap(InspSchd_Srch02_CndR.$mfg_loc_cd, MfgActTblReg_Upd03_DtlR.$yield_loc_cd);
				addColumnPathMap(InspSchd_Srch02_CndR.$loc_cd, MfgActTblReg_Upd03_DtlR.$strg_loc_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.insp_typ(MSC_INSP_TYP.PRDCT.value());
				dest.sppl_cd(null);
				dest.maker_cd(null);
				dest.from_loc_cd(null);
			}
		}
		protected Map_InspSchd_Upd01_CndR_MfgActTblReg_Upd03_DtlR<InspSchd_Upd01_CndR,MfgActTblReg_Upd03_DtlR> createMap_InspSchd_Upd01_CndR_MfgActTblReg_Upd03_DtlR() {
			return new Map_InspSchd_Upd01_CndR_MfgActTblReg_Upd03_DtlR<InspSchd_Upd01_CndR, MfgActTblReg_Upd03_DtlR>();
		}

		public class Map_InspSchd_Upd01_CndR_MfgActTblReg_Upd03_DtlR<D extends InspSchd_Upd01_CndR, S extends MfgActTblReg_Upd03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Upd01_CndR.$data_crud_typ, MfgActTblReg_Upd03_DtlR.$data_crud_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$src_no1, MfgActTblReg_Upd03_DtlR.$mfg_inst_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$src_no2, MfgActTblReg_Upd03_DtlR.$itm_mfg_inst_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$src_no3, MfgActTblReg_Upd03_DtlR.$yield_schd_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$src_no4, MfgActTblReg_Upd03_DtlR.$yield_act_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_cd, MfgActTblReg_Upd03_DtlR.$itm_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_sub1, MfgActTblReg_Upd03_DtlR.$itm_sub1);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_sub2, MfgActTblReg_Upd03_DtlR.$itm_sub2);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_sub3, MfgActTblReg_Upd03_DtlR.$itm_sub3);
				addColumnPathMap(InspSchd_Upd01_CndR.$loc_cd, MfgActTblReg_Upd03_DtlR.$strg_loc_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$str_ln_cd, MfgActTblReg_Upd03_DtlR.$strg_str_ln_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$quality_typ, MfgActTblReg_Upd03_DtlR.$quality_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$stk_insp_typ, MfgActTblReg_Upd03_DtlR.$stk_insp_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$gd_cd, MfgActTblReg_Upd03_DtlR.$gd_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$lot_no, MfgActTblReg_Upd03_DtlR.$lot_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$sublot_no, MfgActTblReg_Upd03_DtlR.$sublot_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno1, MfgActTblReg_Upd03_DtlR.$sno1);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno2, MfgActTblReg_Upd03_DtlR.$sno2);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno3, MfgActTblReg_Upd03_DtlR.$sno3);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno4, MfgActTblReg_Upd03_DtlR.$sno4);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno1_mng_typ, MfgActTblReg_Upd03_DtlR.$sno1_mng_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno2_mng_typ, MfgActTblReg_Upd03_DtlR.$sno2_mng_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno3_mng_typ, MfgActTblReg_Upd03_DtlR.$sno3_mng_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$sno4_mng_typ, MfgActTblReg_Upd03_DtlR.$sno4_mng_typ);
				addColumnPathMap(InspSchd_Upd01_CndR.$mfg_loc_cd, MfgActTblReg_Upd03_DtlR.$yield_loc_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$gr_tm, MfgActTblReg_Upd03_DtlR.$act_tm);
				addColumnPathMap(InspSchd_Upd01_CndR.$ac_dt, MfgActTblReg_Upd03_DtlR.$ac_dt);
				addColumnPathMap(InspSchd_Upd01_CndR.$can_ac_dt, MfgActTblReg_Upd03_DtlR.$can_ac_dt);
				addColumnPathMap(InspSchd_Upd01_CndR.$pack_unit_qty, MfgActTblReg_Upd03_DtlR.$pack_unit_qty);
				addColumnPathMap(InspSchd_Upd01_CndR.$pack_unit_cd, MfgActTblReg_Upd03_DtlR.$pack_unit_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$base_unit_qty, MfgActTblReg_Upd03_DtlR.$base_unit_qty);
				addColumnPathMap(InspSchd_Upd01_CndR.$base_unit_cd, MfgActTblReg_Upd03_DtlR.$base_unit_cd);
				addColumnPathMap(InspSchd_Upd01_CndR.$itm_ord_no, MfgActTblReg_Upd03_DtlR.$itm_ord_no);
				addColumnPathMap(InspSchd_Upd01_CndR.$insp_cnt_rmrks, MfgActTblReg_Upd03_DtlR.$insp_cnt_rmrks);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.act_flg(true);
				dest.insp_typ(MSC_INSP_TYP.PRDCT.value());
				dest.asst_typ(MAC_ASST_TYP.CO_PROD.value());
				dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				dest.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				dest.bp_cd(MAC_STR.NULL_VAL.value());
				dest.sppl_cd(MAC_STR.NULL_VAL.value());
				dest.maker_cd(MAC_STR.NULL_VAL.value());
			}
		}

		protected Map_IoAct_Ins01_DtlR_MfgActTblReg_Upd03_DtlR<IoAct_Ins01_DtlR,MfgActTblReg_Upd03_DtlR> createMap_IoAct_Ins01_DtlR_MfgActTblReg_Upd03_DtlR() {
			return new Map_IoAct_Ins01_DtlR_MfgActTblReg_Upd03_DtlR<IoAct_Ins01_DtlR, MfgActTblReg_Upd03_DtlR>();
		}

		public class Map_IoAct_Ins01_DtlR_MfgActTblReg_Upd03_DtlR<D extends IoAct_Ins01_DtlR, S extends MfgActTblReg_Upd03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IoAct_Ins01_DtlR.$data_crud_typ, MfgActTblReg_Upd03_DtlR.$data_crud_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$ac_dt, MfgActTblReg_Upd03_DtlR.$ac_dt);
				addColumnPathMap(IoAct_Ins01_DtlR.$can_ac_dt, MfgActTblReg_Upd03_DtlR.$can_ac_dt);
				addColumnPathMap(IoAct_Ins01_DtlR.$act_tm, MfgActTblReg_Upd03_DtlR.$act_tm);
				addColumnPathMap(IoAct_Ins01_DtlR.$act_no, MfgActTblReg_Upd03_DtlR.$mfg_act_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$act_d_no, MfgActTblReg_Upd03_DtlR.$yield_act_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_cd, MfgActTblReg_Upd03_DtlR.$trd_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$rsn_cd, MfgActTblReg_Upd03_DtlR.$yield_rsn_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$gr_wg_cd, MfgActTblReg_Upd03_DtlR.$wg_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$act_dpt_cd, MfgActTblReg_Upd03_DtlR.$act_dpt_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$mfg_usr_cd, MfgActTblReg_Upd03_DtlR.$act_usr_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_cd, MfgActTblReg_Upd03_DtlR.$itm_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub1, MfgActTblReg_Upd03_DtlR.$itm_sub1);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub2, MfgActTblReg_Upd03_DtlR.$itm_sub2);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub3, MfgActTblReg_Upd03_DtlR.$itm_sub3);
				addColumnPathMap(IoAct_Ins01_DtlR.$gr_loc_cd, MfgActTblReg_Upd03_DtlR.$yield_loc_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$gr_str_ln_cd, MfgActTblReg_Upd03_DtlR.$yield_str_ln_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$lot_no, MfgActTblReg_Upd03_DtlR.$lot_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$sublot_no, MfgActTblReg_Upd03_DtlR.$sublot_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno1, MfgActTblReg_Upd03_DtlR.$sno1);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno2, MfgActTblReg_Upd03_DtlR.$sno2);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno3, MfgActTblReg_Upd03_DtlR.$sno3);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno4, MfgActTblReg_Upd03_DtlR.$sno4);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno1_mng_typ, MfgActTblReg_Upd03_DtlR.$sno1_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno2_mng_typ, MfgActTblReg_Upd03_DtlR.$sno2_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno3_mng_typ, MfgActTblReg_Upd03_DtlR.$sno3_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno4_mng_typ, MfgActTblReg_Upd03_DtlR.$sno4_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$gr_gd_cd, MfgActTblReg_Upd03_DtlR.$gd_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$quality_typ, MfgActTblReg_Upd03_DtlR.$quality_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$stk_insp_typ, MfgActTblReg_Upd03_DtlR.$stk_insp_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_qty, MfgActTblReg_Upd03_DtlR.$trd_unit_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_cd, MfgActTblReg_Upd03_DtlR.$trd_unit_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$pack_unit_qty, MfgActTblReg_Upd03_DtlR.$pack_unit_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$pack_unit_cd, MfgActTblReg_Upd03_DtlR.$pack_unit_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_qty, MfgActTblReg_Upd03_DtlR.$base_unit_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_cd, MfgActTblReg_Upd03_DtlR.$base_unit_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_mfg_inst_no, MfgActTblReg_Upd03_DtlR.$itm_mfg_inst_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_inst_qty, MfgActTblReg_Upd03_DtlR.$itm_mfg_inst_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$mfg_inst_no, MfgActTblReg_Upd03_DtlR.$mfg_inst_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$mfg_act_no, MfgActTblReg_Upd03_DtlR.$mfg_act_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$mfg_st_qty, MfgActTblReg_Upd03_DtlR.$mfg_st_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$oper_act_no, MfgActTblReg_Upd03_DtlR.$oper_act_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$yield_rate, MfgActTblReg_Upd03_DtlR.$yield_rate);
				addColumnPathMap(IoAct_Ins01_DtlR.$disp_seq, MfgActTblReg_Upd03_DtlR.$disp_seq);
				addColumnPathMap(IoAct_Ins01_DtlR.$oper_cd, MfgActTblReg_Upd03_DtlR.$oper_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$strg_loc_cd, MfgActTblReg_Upd03_DtlR.$strg_loc_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$strg_str_ln_cd, MfgActTblReg_Upd03_DtlR.$strg_str_ln_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_lot_no, MfgActTblReg_Upd03_DtlR.$mfg_inst_lot_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_sublot_no, MfgActTblReg_Upd03_DtlR.$mfg_inst_sublot_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$mfg_inst_unit_typ, MfgActTblReg_Upd03_DtlR.$mfg_inst_unit_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$yield_typ, MfgActTblReg_Upd03_DtlR.$yield_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_rmrks, MfgActTblReg_Upd03_DtlR.$trd_rmrks);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.MFG.value());
				dest.trn_typ(MSC_TRN_TYP.YIELD.value());

				if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					return;
				}

				dest.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				dest.stk_bp_cd(MAC_STR.NULL_VAL.value());

				if (MSC_STK_INSP_TYP.isYET(src.stk_insp_typ())) {
					dest.fix_no_typ(MSC_FIX_NO_TYP.YIELD_ACT_NO.value());
					dest.fix_no(src.yield_act_no());
				}

				if (!(_cacheItm == null)) {
					MAM_ITM_R itmR = _cacheItm.getEx(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3());
					dest.stk_mng_typ(itmR.stk_mng_typ());
					dest.sundry_itm_flg(itmR.sundry_itm_flg());
				}
			}
		}
		protected Map_Lot_Upd08_CndR_MfgActTblReg_Upd03_DtlR<Lot_Upd08_CndR,MfgActTblReg_Upd03_DtlR> createMap_Lot_Upd08_CndR_MfgActTblReg_Upd03_DtlR() {
			return new Map_Lot_Upd08_CndR_MfgActTblReg_Upd03_DtlR<Lot_Upd08_CndR, MfgActTblReg_Upd03_DtlR>();
		}

		public class Map_Lot_Upd08_CndR_MfgActTblReg_Upd03_DtlR<D extends Lot_Upd08_CndR, S extends MfgActTblReg_Upd03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd08_CndR.$data_crud_typ, MfgActTblReg_Upd03_DtlR.$data_crud_typ);
				addColumnPathMap(Lot_Upd08_CndR.$itm_cd, MfgActTblReg_Upd03_DtlR.$itm_cd);
				addColumnPathMap(Lot_Upd08_CndR.$itm_sub1, MfgActTblReg_Upd03_DtlR.$itm_sub1);
				addColumnPathMap(Lot_Upd08_CndR.$itm_sub2, MfgActTblReg_Upd03_DtlR.$itm_sub2);
				addColumnPathMap(Lot_Upd08_CndR.$itm_sub3, MfgActTblReg_Upd03_DtlR.$itm_sub3);
				addColumnPathMap(Lot_Upd08_CndR.$lot_no, MfgActTblReg_Upd03_DtlR.$lot_no);
				addColumnPathMap(Lot_Upd08_CndR.$sublot_no, MfgActTblReg_Upd03_DtlR.$sublot_no);
				addColumnPathMap(Lot_Upd08_CndR.$mfg_loc_cd, MfgActTblReg_Upd03_DtlR.$yield_loc_cd);
				addColumnPathMap(Lot_Upd08_CndR.$loc_cd, MfgActTblReg_Upd03_DtlR.$strg_loc_cd);
				addColumnPathMap(Lot_Upd08_CndR.$src_no1, MfgActTblReg_Upd03_DtlR.$mfg_inst_no);
				addColumnPathMap(Lot_Upd08_CndR.$src_no2, MfgActTblReg_Upd03_DtlR.$itm_mfg_inst_no);
				addColumnPathMap(Lot_Upd08_CndR.$src_no3, MfgActTblReg_Upd03_DtlR.$yield_schd_no);
				addColumnPathMap(Lot_Upd08_CndR.$src_no4, MfgActTblReg_Upd03_DtlR.$yield_act_no);
				addColumnPathMap(Lot_Upd08_CndR.$base_dt, MfgActTblReg_Upd03_DtlR.$act_tm);
				addColumnPathMap(Lot_Upd08_CndR.$site_cd, MfgActTblReg_Upd03_DtlR.$site_cd);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.insp_typ(MSC_INSP_TYP.PRDCT.value());
			}
		}
	}

	/**
	 * MfgActTblReg_Upd06オペレーション.<p>
	 *
	 * 副産品実績を更新する<br>
	 */
	public class MfgActTblReg_Upd06 extends MSBCL_MfgActTblRegService_MC_A.MfgActTblReg_Upd06 {

		/** 
		 * 品目マスタ・キャッシュ
		 */
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if (up0().isEmpty()) {
				return;
			}

			editUp();

			updYieldAct();

			callIoActSrvIns01();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			for (MfgActTblReg_Upd06_DtlR r :up0()) {
				if (r.pack_flg()) {
					r.pack_unit_qty(r.trd_unit_qty());
					r.pack_unit_cd(r.trd_unit_cd());
				}
				else {
					r.pack_unit_qty(r.base_unit_qty());
					r.pack_unit_cd(r.base_unit_cd());
				}
			}
		}

		/**
		 * 出来高実績（副産品）を更新する
		 */
		protected void updYieldAct() {
			MCList<MST_YIELD_ACT_R> insL = MCList.create(MST_YIELD_ACT_R.class);
			
			MCList<MST_YIELD_ACT_R> updL = MCList.create(MST_YIELD_ACT_R.class);

			MCList<MST_YIELD_ACT_R> delL = MCList.create(MST_YIELD_ACT_R.class);
			

			for (MfgActTblReg_Upd06_DtlR r :up0()) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(r.by_prod());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updL.add(r.by_prod());
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delL.add(r.by_prod());
				}
			}
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_YIELD_ACT_R.create("T"));
				dbInsertEx("MSBCL6060_MST_YIELD_ACT_I02", insL, insL_bldr);
			}
			if (!updL.isEmpty()) {
				MST_YIELD_ACT_R t = MST_YIELD_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				editUpdSetSt(updL, updL_bldr, t);
				dbUpdateKey("MSBCL6060_MST_YIELD_ACT_U02", updL, updL_bldr);
			}
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_YIELD_ACT_R.create("T"));
				dbDeleteKey("MSBCL6060_MST_YIELD_ACT_D02", delL, delL_bldr);
			}
		}

		/**
		 * 更新時のset句の編集
		 */
		protected void editUpdSetSt(MCList<MST_YIELD_ACT_R> updL, MCQueryApiBuilder updL_bldr, MST_YIELD_ACT_R t) {
			updL_bldr.setSet(t.trd_unit_qty, t.trd_unit_cd, t.base_unit_qty, t.base_unit_cd, t.yield_typ, t.yield_rate, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3, t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4, t.quality_typ, t.stk_insp_typ, t.gd_cd, t.yield_rsn_cd, t.yield_loc_cd, t.yield_str_ln_cd, t.strg_loc_cd, t.strg_str_ln_cd, t.act_tm, t.ac_dt, t.bkf_ctl_flg, t.lot_ctl_flg, t.sublot_ctl_flg, t.ext_sys_cd, t.ext_yield_act_no, t.intr_rmrks, t.act_rpt_rmrks, t.insp_cnt_rmrks, t.trd_rmrks, t.sub_char1, t.sub_char2, t.sub_char3);
		}

		/** 
		 * 受払実績ワークを作成する
		 */
		protected void callIoActSrvIns01() {

			MCList<MfgActTblReg_Upd06_DtlR> insUpdL = MCList.create(MfgActTblReg_Upd06_DtlR.class);
			MCIndexKey idxkey = up0().createIndex(MfgActTblReg_Upd06_DtlR.$data_crud_typ);
			insUpdL = up0().subList(idxkey, MAC_DATA_CRUD_TYP.CRT.value());
			insUpdL.addAll(up0().subList(idxkey, MAC_DATA_CRUD_TYP.UPD.value()));

			if (!insUpdL.isEmpty()) {
				crtItmCache(insUpdL);
			}

			MSBEL_IoActService.IoAct_Ins01 ope = MSBEL_IoActService.crtIoAct_Ins01();
			addAll(ope.up0(), up0(), createMap_IoAct_Ins01_DtlR_MfgActTblReg_Upd06_DtlR());

			ope.exec();
		}

		/**
		 * 品目マスタ・キャッシュの作成
		 * @param insUpdL 
		 */
		protected void crtItmCache(MCList<MfgActTblReg_Upd06_DtlR> insUpdL) {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t);
			itmL_bldr.setSelect(t.stk_mng_typ, t.sundry_itm_flg);
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(itmL_bldr, insUpdL,
					MfgActTblReg_Upd06_DtlR.$itm_cd,
					MfgActTblReg_Upd06_DtlR.$itm_sub1,
					MfgActTblReg_Upd06_DtlR.$itm_sub2,
					MfgActTblReg_Upd06_DtlR.$itm_sub3);
		}

		protected Map_IoAct_Ins01_DtlR_MfgActTblReg_Upd06_DtlR<IoAct_Ins01_DtlR,MfgActTblReg_Upd06_DtlR> createMap_IoAct_Ins01_DtlR_MfgActTblReg_Upd06_DtlR() {
			return new Map_IoAct_Ins01_DtlR_MfgActTblReg_Upd06_DtlR<IoAct_Ins01_DtlR, MfgActTblReg_Upd06_DtlR>();
		}

		public class Map_IoAct_Ins01_DtlR_MfgActTblReg_Upd06_DtlR<D extends IoAct_Ins01_DtlR, S extends MfgActTblReg_Upd06_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IoAct_Ins01_DtlR.$data_crud_typ, MfgActTblReg_Upd06_DtlR.$data_crud_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$ac_dt, MfgActTblReg_Upd06_DtlR.$ac_dt);
				addColumnPathMap(IoAct_Ins01_DtlR.$can_ac_dt, MfgActTblReg_Upd06_DtlR.$can_ac_dt);
				addColumnPathMap(IoAct_Ins01_DtlR.$act_tm, MfgActTblReg_Upd06_DtlR.$act_tm);
				addColumnPathMap(IoAct_Ins01_DtlR.$act_no, MfgActTblReg_Upd06_DtlR.$mfg_act_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$act_d_no, MfgActTblReg_Upd06_DtlR.$yield_act_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_cd, MfgActTblReg_Upd06_DtlR.$trd_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$rsn_cd, MfgActTblReg_Upd06_DtlR.$yield_rsn_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$gr_wg_cd, MfgActTblReg_Upd06_DtlR.$wg_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$act_dpt_cd, MfgActTblReg_Upd06_DtlR.$act_dpt_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$mfg_usr_cd, MfgActTblReg_Upd06_DtlR.$act_usr_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_cd, MfgActTblReg_Upd06_DtlR.$itm_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub1, MfgActTblReg_Upd06_DtlR.$itm_sub1);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub2, MfgActTblReg_Upd06_DtlR.$itm_sub2);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub3, MfgActTblReg_Upd06_DtlR.$itm_sub3);
				addColumnPathMap(IoAct_Ins01_DtlR.$gr_loc_cd, MfgActTblReg_Upd06_DtlR.$yield_loc_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$gr_str_ln_cd, MfgActTblReg_Upd06_DtlR.$yield_str_ln_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$lot_no, MfgActTblReg_Upd06_DtlR.$lot_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$sublot_no, MfgActTblReg_Upd06_DtlR.$sublot_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno1, MfgActTblReg_Upd06_DtlR.$sno1);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno2, MfgActTblReg_Upd06_DtlR.$sno2);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno3, MfgActTblReg_Upd06_DtlR.$sno3);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno4, MfgActTblReg_Upd06_DtlR.$sno4);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno1_mng_typ, MfgActTblReg_Upd06_DtlR.$sno1_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno2_mng_typ, MfgActTblReg_Upd06_DtlR.$sno2_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno3_mng_typ, MfgActTblReg_Upd06_DtlR.$sno3_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno4_mng_typ, MfgActTblReg_Upd06_DtlR.$sno4_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$gr_gd_cd, MfgActTblReg_Upd06_DtlR.$gd_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$quality_typ, MfgActTblReg_Upd06_DtlR.$quality_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_qty, MfgActTblReg_Upd06_DtlR.$trd_unit_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_cd, MfgActTblReg_Upd06_DtlR.$trd_unit_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$pack_unit_qty, MfgActTblReg_Upd06_DtlR.$pack_unit_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$pack_unit_cd, MfgActTblReg_Upd06_DtlR.$pack_unit_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_qty, MfgActTblReg_Upd06_DtlR.$base_unit_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_cd, MfgActTblReg_Upd06_DtlR.$base_unit_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_itm_cd, MfgActTblReg_Upd06_DtlR.$par_itm_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_itm_sub1, MfgActTblReg_Upd06_DtlR.$par_itm_sub1);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_itm_sub2, MfgActTblReg_Upd06_DtlR.$par_itm_sub2);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_itm_sub3, MfgActTblReg_Upd06_DtlR.$par_itm_sub3);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_itm_nm, MfgActTblReg_Upd06_DtlR.$par_itm_nm);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_mfg_inst_no, MfgActTblReg_Upd06_DtlR.$itm_mfg_inst_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_inst_qty, MfgActTblReg_Upd06_DtlR.$itm_mfg_inst_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$mfg_inst_no, MfgActTblReg_Upd06_DtlR.$mfg_inst_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$mfg_act_no, MfgActTblReg_Upd06_DtlR.$mfg_act_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$mfg_st_qty, MfgActTblReg_Upd06_DtlR.$mfg_st_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$oper_act_no, MfgActTblReg_Upd06_DtlR.$oper_act_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$yield_rate, MfgActTblReg_Upd06_DtlR.$yield_rate);
				addColumnPathMap(IoAct_Ins01_DtlR.$disp_seq, MfgActTblReg_Upd06_DtlR.$disp_seq);
				addColumnPathMap(IoAct_Ins01_DtlR.$oper_cd, MfgActTblReg_Upd06_DtlR.$oper_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$strg_loc_cd, MfgActTblReg_Upd06_DtlR.$strg_loc_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$strg_str_ln_cd, MfgActTblReg_Upd06_DtlR.$strg_str_ln_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_lot_no, MfgActTblReg_Upd06_DtlR.$mfg_inst_lot_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_sublot_no, MfgActTblReg_Upd06_DtlR.$mfg_inst_sublot_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$mfg_inst_unit_typ, MfgActTblReg_Upd06_DtlR.$mfg_inst_unit_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$yield_typ, MfgActTblReg_Upd06_DtlR.$yield_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_rmrks, MfgActTblReg_Upd06_DtlR.$trd_rmrks);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.MFG.value());
				dest.trn_typ(MSC_TRN_TYP.YIELD.value());
				dest.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				dest.stk_insp_typ(MSC_STK_INSP_TYP.FIN.value());
				dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				dest.stk_bp_cd(MAC_STR.NULL_VAL.value());
				dest.par_sno1(getParSno(src.mfg_inst_sno1(), src.mfg_inst_sno1_mng_typ()));
				dest.par_sno2(getParSno(src.mfg_inst_sno2(), src.mfg_inst_sno2_mng_typ()));
				dest.par_sno3(getParSno(src.mfg_inst_sno3(), src.mfg_inst_sno3_mng_typ()));
				dest.par_sno4(getParSno(src.mfg_inst_sno4(), src.mfg_inst_sno4_mng_typ()));
				if (!(_cacheItm == null)) {
					MAM_ITM_R itmR = _cacheItm.getEx(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3());
					dest.stk_mng_typ(itmR.stk_mng_typ());
					dest.sundry_itm_flg(itmR.sundry_itm_flg());
				}
			}
		}
	}
	
	/**
	 * MfgActTblReg_Upd04オペレーション.<p>
	 *
	 * 投入実績を更新する<br>
	 */
	public class MfgActTblReg_Upd04 extends MSBCL_MfgActTblRegService_MC_A.MfgActTblReg_Upd04 {

		// マスタ・キャッシュ
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItm;
		protected FXUCL_MCDbcCache<MAM_BP_R> _cacheBp;
		protected FXUCL_MCDbcCache<MAM_CUR_R> _cacheCur;
		protected FXUCL_MCDbcCache<MAM_TAX_R> _cacheTax;
		protected FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R> _cacheSundryItm;

		protected FXUCL_Cache<MfgActTblReg_Upd04_HdrR> _hdrCache; // ヘッダ単位の下り電文を編集するためのキャッシュ

		protected FXUCL_Cache<MfgActTblReg_Upd04_DtlOperR> _operCache; // 工程単位の下り電文を編集するためのキャッシュ
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			if (up0().isEmpty()) {
				return;
			}

			setHdrAndOperCache();
			
			editUp();
			
			crtMsterCache();

			copyMstvalue();

			// editUpForProvAndVmi内で在庫識別区分を元にした分岐があるため、ロット提案を先に行う必要がある
			callLotPropSrvSprt01();

			// ロット提案の結果、登録対象外となったリストを除いたリストを作成する
			MCList<MfgActTblReg_Upd04_DtlInptR> regInptL = getRegInptL(); 
			MCList<MfgActTblReg_Upd04_DtlLossR> regLossL = getRegLossL();
			
			if (!regInptL.isEmpty()) {
				// ロット提案の後の投入のチェック
				chkInptAfterLotProp(regInptL);
				
				editUpForProvAndVmi(regInptL);
				
				updInptAct(regInptL);
	
				updLossAct(regLossL);
				
				callVmiSrvUpd01(regInptL);
	
				callProvActSrvUpd01(regInptL);
				
				MCList<MfgActTblReg_Upd04_DtlInptR> ioRegInptL = getIoRegInptL(regInptL); 
				MCList<MfgActTblReg_Upd04_DtlLossR> ioRegLossL = getIoRegLossL(regInptL,regLossL);
				
				if(!ioRegInptL.isEmpty()) {
					callIoActSrvIns01(ioRegInptL, ioRegLossL);
				}
			}
			
			setDown();
		}
		
		/**
		 * 下り電文用のヘッダ・工程コンテナのキャッシュを作成
		 */
		protected void setHdrAndOperCache() {
			_hdrCache = new FXUCL_Cache<MfgActTblReg_Upd04_HdrR>();
			_hdrCache.setFixMaxCacheSize(-1);

			_operCache = new FXUCL_Cache<MfgActTblReg_Upd04_DtlOperR>();
			_operCache.setFixMaxCacheSize(-1);

			for (MfgActTblReg_Upd04_HdrR hdrUpR : up4()) {
				_hdrCache.putCache(new MCNumber[]{hdrUpR.hdr_peg_no()}, hdrUpR);
			}
			
			for (MfgActTblReg_Upd04_DtlOperR operUpR : up5()) {
				_operCache.putCache(new MCNumber[]{operUpR.oper_peg_no()}, operUpR);
			}
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			MCList<MfgActTblReg_Upd04_DtlLossR> lossInsUpdL = up1()
					.subList(r -> (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())));

			MCList<MfgActTblReg_Upd04_DtlInptR> inptInsUpdL = up0()
					.subList(r -> (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())));

			MCIndexKey inptActIdxkey = lossInsUpdL.createIndex(MfgActTblReg_Upd04_DtlLossR.$inpt_act_no);

			// ロス実績数量の設定
			for (MfgActTblReg_Upd04_DtlInptR inptR :inptInsUpdL) {
				MCList<MfgActTblReg_Upd04_DtlLossR> lossL = lossInsUpdL.subList(inptActIdxkey, inptR.inpt_act_no());
				MCNumber fxdLossQty = MCNumber.ZERO;
				MCNumber lossQty = MCNumber.ZERO;
				MCNumber fxdContQty = MCNumber.ZERO;
				MCNumber contQty = MCNumber.ZERO;
				
				for (MfgActTblReg_Upd04_DtlLossR lossR :lossL) {
					if (lossR.fxd_loss_flg()) {
						fxdLossQty = fxdLossQty.add(lossR.base_unit_qty());
						fxdContQty = fxdContQty.add(nvl(lossR.cont_qty(), MCNumber.ZERO));
					}
					else {
						lossQty = lossQty.add(lossR.base_unit_qty());
						contQty = contQty.add(nvl(lossR.cont_qty(), MCNumber.ZERO));
					}
				}
				
				inptR.base_unit_fxd_loss_qty(fxdLossQty);
				inptR.base_unit_loss_qty(lossQty);
				inptR.base_unit_sum_inpt_loss_qty(MCNumber.sum(inptR.base_unit_inpt_qty(),
						inptR.base_unit_fxd_loss_qty(), inptR.base_unit_loss_qty()));

				// 有効成分換算
				if (inptR.cont_fctr_flg()) {
					inptR.cont_loss_qty(contQty);
					inptR.cont_fxd_loss_qty(fxdContQty);
					inptR.cont_sum_qty(sum(inptR.cont_qty(), inptR.cont_loss_qty(),
							inptR.cont_fxd_loss_qty()));
				}
			}
			
			
			MCList<MfgActTblReg_Upd04_DtlInptR> mfgMtdTypInptInsUpdL = inptInsUpdL
					.subList(MfgActTblReg_Upd04_DtlInptR.$mfg_mtd_typ,
							MSC_MFG_MTD_TYP.EXTNL.value());

			MST_PO_D_R t1 = MST_PO_D_R.create("T1");
			MST_ITM_MFG_INST_R t2 = MST_ITM_MFG_INST_R.create("T2");
			MCList<MST_PO_D_R> poL = MCList.create(MST_PO_D_R.class);
			MCQueryApiBuilder poL_bldr = MCQueryApiBuilder.create(t1);
			poL_bldr.setSelect(t1.po_no, t1.slo_no);
			poL_bldr.addSelect(t2.itm_mfg_inst_no);
			poL_bldr.addInnerJoin(t2, bracket( t2.itm_ord_no.eq(t1.outsrc_itm_ord_no)));
			poL_bldr.setWhere(t2.itm_mfg_inst_no.eq(bind("itm_mfg_inst_no")));
			poL_bldr.addWhereWithAnd(t1.can_flg.eq(value(false)));
			dbSelect("MSBCL6060_MST_PO_D_S01", poL, poL_bldr, mfgMtdTypInptInsUpdL.groupBy(MfgActTblReg_Upd04_DtlInptR.$itm_mfg_inst_no));

			MCIndexKey poIdxkey = poL.createIndex("ITM_MFG_INST_NO");
			for (MfgActTblReg_Upd04_DtlInptR inptR : mfgMtdTypInptInsUpdL) {
				MST_PO_D_R poR = poL.getFirst(poIdxkey, inptR.itm_mfg_inst_no());
				if (!isNull(poR)) {
					inptR.po_no(poR.po_no());
					inptR.slo_no(poR.slo_no());
				}
			}
		}

		/**
		 * 引数の投入情報がロット提案対象かどうか判定します。
		 * @param r
		 * @return
		 */
		protected boolean isLotPropTgt(MfgActTblReg_Upd04_DtlInptR r) {
			// 削除行は対象外
			if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
				return false;
			}
			// ■単票画面からの実行の場合、
			// ・在庫識別区分・在庫取引先・在庫着荷先が指定されているか？
			// ・マイナス在庫を許容するか否か？
			// でロット提案を実施するかどうかが異なる
			
			// １．在庫識別区分・在庫取引先・在庫着荷先が指定されていない場合
			// ロット提案処理で補完するため、ロット提案を実施する
			// ２．在庫識別区分・在庫取引先・在庫着荷先が指定されている場合
			// ・マイナス在庫を許容しない場合
			//  仮に在庫が不足している場合は、受払実績サービス内で在庫不足のエラーとなるため、ロット提案を実行しない
			// ・マイナス在庫を許容する場合
			//  入庫予定を加味して投入可能か否かを判断する必要があるため、ロット提案を実行する
			
			// ■一覧登録処理からの実行の場合
			// ・受払実績サービスではなく本処理で在庫不足のエラーを検知したいので、
			// ロット提案サービスを実行する（受払実績サービスで在庫不足の例外が発生すると、一括登録した全ての行が登録されないことになってしまうため）
			// 不足している場合は投入実績は登録対象外とするが、製造実績は登録する仕様とする
			// ・また、画面上で在庫識別区分・在庫取引先・在庫着荷先を入力することができないため、
			// 補完をする目的としてもロット提案を実行する必要がある
			
			// ■製造実績受信ＩＦ（MES Link）からの実行の場合
			// ・投入実績を受信した場合、「■単票画面からの実行の場合」と同様の処理となる
			// ・工程実績または出来高実績受信により投入実績をバックフラッシュで登録する場合、「■一覧登録処理からの実行の場合」と同様の処理となる
			if (!r.lst_reg_flg() && (!r.is_src_batch_flg() || _cacheItm.get(r.itm_cd(), r.itm_sub1(),r.itm_sub2(), r.itm_sub3()).pack_alloc_flg())) {
				// 在庫識別区分・在庫取引先・在庫着荷先が指定だけでなく、ロット・サブロットの指定も追加。
				// 管理対象かつ入力済の場合、または、管理対象外かつ未入力（ヌル文字含む）の場合。
				if (!isNull(r.stk_id_typ()) && !isNull(r.stk_bp_cd())
						&& !isNull(r.stk_arrv_bp_cd())
						&& chkLotMng(r.lot_no(), r.lot_mng_typ())
						&& chkSubLotMng(r.sublot_no(), r.sublot_mng_typ())) {
					if (!_cacheItm.get(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()).minus_stk_flg()) {
						return false;
					}
				}
			}

			// ロット提案する数量（投入数量＋ロス数量＋固定ロス数量）がゼロの場合は対象外
			MCNumber qty = MCNumber.ZERO;
			if (r.cont_fctr_flg()) {
				qty = sum(nvl(r.cont_qty(), 0), nvl(r.cont_loss_qty(), 0), nvl(r.cont_fxd_loss_qty(), 0));
			}
			else {
				qty = sum(nvl(r.base_unit_inpt_qty(), 0), nvl(r.base_unit_loss_qty(), 0), nvl(r.base_unit_fxd_loss_qty(), 0));
			}
			if (qty.isZero()) {
				return false;
			}
			
			// 在庫識別区分が自給の場合は対象外
			if (MSC_STK_ID_TYP.isSLF_SUPPRT(r.stk_id_typ())) {
				if (r.lst_reg_flg() || r.is_src_batch_flg()) {
					// 在庫の有無によらないため、バックフラッシュの成功件数をカウントアップ
					MfgActTblReg_Upd04_HdrR hdrDownR = _hdrCache.getCache(r.hdr_peg_no());
					MfgActTblReg_Upd04_DtlOperR operDownR = _operCache.getCache(r.oper_peg_no());
					hdrDownR.bkf_success_cnt(nvl(hdrDownR.bkf_success_cnt(), MCNumber.ZERO).add(MCNumber.ONE));
					operDownR.bkf_success_cnt(nvl(operDownR.bkf_success_cnt(), MCNumber.ZERO).add(MCNumber.ONE));
				}
				return false;
			}

			// 在庫管理区分が在庫管理対象以外の場合は対象外
			if (!MAC_STK_MNG_TYP.isMNG(r.stk_mng_typ())) {
				if (r.lst_reg_flg() || r.is_src_batch_flg()) {
					// 在庫の有無によらないため、バックフラッシュの成功件数をカウントアップ
					MfgActTblReg_Upd04_HdrR hdrDownR = _hdrCache.getCache(r.hdr_peg_no());
					MfgActTblReg_Upd04_DtlOperR operDownR = _operCache.getCache(r.oper_peg_no());
					hdrDownR.bkf_success_cnt(nvl(hdrDownR.bkf_success_cnt(), MCNumber.ZERO).add(MCNumber.ONE));
					operDownR.bkf_success_cnt(nvl(operDownR.bkf_success_cnt(), MCNumber.ZERO).add(MCNumber.ONE));
				}
				return false;
			}

			return true;
		}
		
		/**
		 * ロット管理チェック
		 * @param lot_no
		 * @param lot_mng_typ
		 * @return
		 */
		protected boolean chkLotMng(String lot_no, String lot_mng_typ) {
			if (!MAC_LOT_MNG_TYP.isNOT_MNG(lot_mng_typ)) {
				if (isNullOrNullVal(lot_no)) {
					return false;
				}
			}
			return true;
		}
		
		/**
		 * サブロット管理チェック
		 * @param sublot_no
		 * @param sublot_mng_typ
		 * @return
		 */
		protected boolean chkSubLotMng(String sublot_no, String sublot_mng_typ) {
			if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(sublot_mng_typ)) {
				if (isNullOrNullVal(sublot_no)) {
					return false;
				}
			}
			return true;
		}
		
		/**
		 * ロット提案サービスの呼出（ロット提案の結果、登録対象外となった行を除いたリストを返す）
		 */
		protected void callLotPropSrvSprt01() {
			// 処理対象データの抽出
			MCList<MfgActTblReg_Upd04_DtlInptR> lotPropL = up0()
					.subList(r -> isLotPropTgt(r));			

			// ロット提案対象が存在しない場合は何もしない
			if (lotPropL.isEmpty()) {
				return;
			}

			// 引当ロックに渡すため、品目、枝番、投入場所でグループ化
			String[] lockKeys = new String[] {
					MfgActTblReg_Upd04_DtlInptR.$itm_cd,
					MfgActTblReg_Upd04_DtlInptR.$itm_sub1,
					MfgActTblReg_Upd04_DtlInptR.$itm_sub2,
					MfgActTblReg_Upd04_DtlInptR.$itm_sub3,
					MfgActTblReg_Upd04_DtlInptR.$inpt_loc_cd
			};
			MCList<MfgActTblReg_Upd04_DtlInptR> lockL = lotPropL.groupBy(lockKeys);

			// lockLを上り電文に設定し、引当ロックサービスを実行
			MSBEL_AllocMngService.Alloc_Lock_Upd01 lock = MSBEL_AllocMngService.crtAlloc_Lock_Upd01();
			addAll(lock.up0(), lockL, createMap_MSW_ALLOC_LOC_MAP_R_MfgActTblReg_Upd04_DtlInptR());
			lock.exec();

			// ロット提案サービスのヘッダ上り電文を設定
			MSBCL_LotPropService.LotProp_Sprt01 lotPropOpe = MSBCL_LotPropService.crtLotProp_Sprt01();

			// ヘッダ、投入、ロスコンテナの作成
			MCIndexKey lossIdxKey = up1().createIndex(MfgActTblReg_Upd04_DtlLossR.$inpt_peg_no);
			for (MCList<MfgActTblReg_Upd04_DtlInptR> inptL : lotPropL
					.groupList(MfgActTblReg_Upd04_DtlInptR.$hdr_peg_no)) {
				// ヘッダ
				lotPropOpe.up0().act_flg(true); //実績時フラグはオン
				lotPropOpe.up0().exec_prop_btn_flg(false); //ロット提案ボタンから実行フラグはオフ

				// 投入
				addAll(lotPropOpe.up1(), inptL, createMap_LotProp_Sprt01_Dtl1R_MfgActTblReg_Upd04_DtlInptR());
				
				for (MfgActTblReg_Upd04_DtlInptR inptR : inptL) {
					// ロス
					addAll(lotPropOpe.up3(), up1().subList(lossIdxKey, inptR.peg_no()),
							createMap_LotProp_Sprt01_Dtl4R_MfgActTblReg_Upd04_DtlLossR());
				}
			}
						
			// 出来高実績・副産品実績から在庫情報を生成
			lotPropOpe.up2().addAll(getStk());
			
			// 削除する投入実績から在庫情報を生成
			lotPropOpe.up2().addAll(getDelInptStkL());
			
			// ロット提案サービス実行
			lotPropOpe.exec();

			// 実行結果のチェック
			chkLotPropRslt(lotPropL, lotPropOpe.down0());
			
			// 投入の提案結果を取得し、上り電文に設定
			setInptLotPropRslt(lotPropOpe.down0());
			
			// ロスの提案結果を取得し、上り電文に設定
			setLossLotPropRslt(lotPropOpe.down2());
			
			return;
		}

		/**
		 * 上り電文の投入情報から引当管理サービスのロック情報へのマッピング
		 * @return
		 */
		protected Map_MSW_ALLOC_LOC_MAP_R_MfgActTblReg_Upd04_DtlInptR<MSW_ALLOC_LOC_MAP_R,MfgActTblReg_Upd04_DtlInptR> createMap_MSW_ALLOC_LOC_MAP_R_MfgActTblReg_Upd04_DtlInptR() {
			return new Map_MSW_ALLOC_LOC_MAP_R_MfgActTblReg_Upd04_DtlInptR<MSW_ALLOC_LOC_MAP_R, MfgActTblReg_Upd04_DtlInptR>();
		}

		public class Map_MSW_ALLOC_LOC_MAP_R_MfgActTblReg_Upd04_DtlInptR<D extends MSW_ALLOC_LOC_MAP_R, S extends MfgActTblReg_Upd04_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_cd, MfgActTblReg_Upd04_DtlInptR.$itm_cd);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub1, MfgActTblReg_Upd04_DtlInptR.$itm_sub1);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub2, MfgActTblReg_Upd04_DtlInptR.$itm_sub2);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$itm_sub3, MfgActTblReg_Upd04_DtlInptR.$itm_sub3);
				addColumnPathMap(MSW_ALLOC_LOC_MAP_R.$inpt_loc_cd, MfgActTblReg_Upd04_DtlInptR.$inpt_loc_cd);
			}
		}

		/**
		 * 上り電文の投入情報からロット提案サービスの投入情報へのマッピング
		 * @return
		 */
		protected Map_LotProp_Sprt01_Dtl1R_MfgActTblReg_Upd04_DtlInptR<LotProp_Sprt01_Dtl1R,MfgActTblReg_Upd04_DtlInptR> createMap_LotProp_Sprt01_Dtl1R_MfgActTblReg_Upd04_DtlInptR() {
			return new Map_LotProp_Sprt01_Dtl1R_MfgActTblReg_Upd04_DtlInptR<LotProp_Sprt01_Dtl1R, MfgActTblReg_Upd04_DtlInptR>();
		}

		public class Map_LotProp_Sprt01_Dtl1R_MfgActTblReg_Upd04_DtlInptR<D extends LotProp_Sprt01_Dtl1R, S extends MfgActTblReg_Upd04_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$hdr_peg_no, MfgActTblReg_Upd04_DtlInptR.$hdr_peg_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$oper_peg_no, MfgActTblReg_Upd04_DtlInptR.$oper_peg_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$peg_no, MfgActTblReg_Upd04_DtlInptR.$peg_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$oper_inst_no, MfgActTblReg_Upd04_DtlInptR.$oper_inst_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_schd_no, MfgActTblReg_Upd04_DtlInptR.$inpt_schd_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$div_seq, MfgActTblReg_Upd04_DtlInptR.$div_seq);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_act_no, MfgActTblReg_Upd04_DtlInptR.$inpt_act_no);
				// mfg_sts_typ製造状況区分は設定不要。これはロット提案ボタンから実行した際に一時的に受払予定を削除するために使用するものであるため
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_dt, MfgActTblReg_Upd04_DtlInptR.$act_tm);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_cd, MfgActTblReg_Upd04_DtlInptR.$itm_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_sub1, MfgActTblReg_Upd04_DtlInptR.$itm_sub1);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_sub2, MfgActTblReg_Upd04_DtlInptR.$itm_sub2);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$itm_sub3, MfgActTblReg_Upd04_DtlInptR.$itm_sub3);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$ver_no, MfgActTblReg_Upd04_DtlInptR.$ver_no);
				// 代替元数は不使用項目のため設定しない
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_grp_cd, MfgActTblReg_Upd04_DtlInptR.$alt_grp_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_grp_seq, MfgActTblReg_Upd04_DtlInptR.$alt_grp_seq);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_itm_fix_flg, MfgActTblReg_Upd04_DtlInptR.$alt_itm_fix_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_itm_typ, MfgActTblReg_Upd04_DtlInptR.$alt_itm_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alt_alloc_prio, MfgActTblReg_Upd04_DtlInptR.$alt_alloc_prio);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_loc_cd, MfgActTblReg_Upd04_DtlInptR.$inpt_loc_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_str_ln_cd, MfgActTblReg_Upd04_DtlInptR.$inpt_str_ln_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$gd_cd, MfgActTblReg_Upd04_DtlInptR.$gd_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$lot_no, MfgActTblReg_Upd04_DtlInptR.$lot_no);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sublot_no, MfgActTblReg_Upd04_DtlInptR.$sublot_no);
				// rqst_sno1～4を設定
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$rqst_sno1, MfgActTblReg_Upd04_DtlInptR.$sno1);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$rqst_sno2, MfgActTblReg_Upd04_DtlInptR.$sno2);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$rqst_sno3, MfgActTblReg_Upd04_DtlInptR.$sno3);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$rqst_sno4, MfgActTblReg_Upd04_DtlInptR.$sno4);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno1_null_flg, MfgActTblReg_Upd04_DtlInptR.$sno1_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno2_null_flg, MfgActTblReg_Upd04_DtlInptR.$sno2_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno3_null_flg, MfgActTblReg_Upd04_DtlInptR.$sno3_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sno4_null_flg, MfgActTblReg_Upd04_DtlInptR.$sno4_null_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$base_unit_qty, MfgActTblReg_Upd04_DtlInptR.$base_unit_sum_inpt_loss_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$inpt_qty, MfgActTblReg_Upd04_DtlInptR.$base_unit_inpt_qty);
				// 実績のためrqmt_qty,fxd_rqmt_qtyは設定不要
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$loss_qty, MfgActTblReg_Upd04_DtlInptR.$base_unit_loss_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$fxd_loss_qty, MfgActTblReg_Upd04_DtlInptR.$base_unit_fxd_loss_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$acxfr_qty, MfgActTblReg_Upd04_DtlInptR.$acxfr_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$acxfr_rsn_cd, MfgActTblReg_Upd04_DtlInptR.$acxfr_rsn_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$base_unit_cd, MfgActTblReg_Upd04_DtlInptR.$base_unit_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$base_unit_dec_place, MfgActTblReg_Upd04_DtlInptR.$base_unit_dec_place);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$base_unit_rnd_typ, MfgActTblReg_Upd04_DtlInptR.$base_unit_conv_rnd_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_inpt_qty, MfgActTblReg_Upd04_DtlInptR.$cont_qty);
				// 実績のためcont_rqmt_qty,cont_fxd_rqmt_qtyは設定不要
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_loss_qty, MfgActTblReg_Upd04_DtlInptR.$cont_loss_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fxd_loss_qty, MfgActTblReg_Upd04_DtlInptR.$cont_fxd_loss_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fctr_unit_cd, MfgActTblReg_Upd04_DtlInptR.$cont_fctr_unit_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fctr_flg, MfgActTblReg_Upd04_DtlInptR.$cont_fctr_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fctr_rnd_typ, MfgActTblReg_Upd04_DtlInptR.$cont_fctr_rnd_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$cont_fctr_dec_place, MfgActTblReg_Upd04_DtlInptR.$cont_fctr_dec_place);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$std_cont_fctr, MfgActTblReg_Upd04_DtlInptR.$std_cont_fctr);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$stk_arrv_bp_cd, MfgActTblReg_Upd04_DtlInptR.$stk_arrv_bp_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$stk_id_typ, MfgActTblReg_Upd04_DtlInptR.$stk_id_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$stk_bp_cd, MfgActTblReg_Upd04_DtlInptR.$stk_bp_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$lot_mix_flg, MfgActTblReg_Upd04_DtlInptR.$lot_mix_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$sublot_mix_flg, MfgActTblReg_Upd04_DtlInptR.$sublot_mix_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alloc_flg, MfgActTblReg_Upd04_DtlInptR.$alloc_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$alloc_ctl_typ, MfgActTblReg_Upd04_DtlInptR.$alloc_ctl_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$stk_id_typ, MfgActTblReg_Upd04_DtlInptR.$stk_id_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$stk_bp_cd, MfgActTblReg_Upd04_DtlInptR.$stk_bp_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$stk_arrv_bp_cd, MfgActTblReg_Upd04_DtlInptR.$stk_arrv_bp_cd);
				// ソートに使用するため有効期限、最古入庫日、ロットシーケンスを渡す
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$vld_dt, MfgActTblReg_Upd04_DtlInptR.$vld_dt);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$first_gr_dt, MfgActTblReg_Upd04_DtlInptR.$first_gr_dt);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$lot_seq, MfgActTblReg_Upd04_DtlInptR.$lot_seq);
				addColumnPathMap(LotProp_Sprt01_Dtl1R.$not_pd_chk_flg, MfgActTblReg_Upd04_DtlInptR.$not_pd_chk_flg);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.not_lot_fix_flg(false); //実績のためロット指定あり
			}
		}

		/**
		 * 上り電文のロス実績情報からロット提案サービスのロス実績情報へのマッピング
		 * @return
		 */
		protected Map_LotProp_Sprt01_Dtl4R_MfgActTblReg_Upd04_DtlLossR<LotProp_Sprt01_Dtl4R,MfgActTblReg_Upd04_DtlLossR> createMap_LotProp_Sprt01_Dtl4R_MfgActTblReg_Upd04_DtlLossR() {
			return new Map_LotProp_Sprt01_Dtl4R_MfgActTblReg_Upd04_DtlLossR<LotProp_Sprt01_Dtl4R, MfgActTblReg_Upd04_DtlLossR>();
		}

		public class Map_LotProp_Sprt01_Dtl4R_MfgActTblReg_Upd04_DtlLossR<D extends LotProp_Sprt01_Dtl4R, S extends MfgActTblReg_Upd04_DtlLossR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(LotProp_Sprt01_Dtl4R.$inpt_peg_no, MfgActTblReg_Upd04_DtlLossR.$inpt_peg_no);
				addColumnPathMap(LotProp_Sprt01_Dtl4R.$fxd_loss_flg, MfgActTblReg_Upd04_DtlLossR.$fxd_loss_flg);
				addColumnPathMap(LotProp_Sprt01_Dtl4R.$loss_rsn_cd, MfgActTblReg_Upd04_DtlLossR.$loss_rsn_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl4R.$loss_qty, MfgActTblReg_Upd04_DtlLossR.$base_unit_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl4R.$cont_loss_qty, MfgActTblReg_Upd04_DtlLossR.$cont_qty);
			}
		}

		/**
		 * 出来高・副産品実績から在庫情報を生成する
		 * @return
		 */
		protected MCList<LotProp_Sprt01_Dtl3R> getStk() {
			MCList<LotProp_Sprt01_Dtl3R> stkL = MCList.create(LotProp_Sprt01_Dtl3R.class);

			// 上り電文に出来高実績が設定されていない場合は何もしない
			if (up2().isEmpty() && up3().isEmpty()) {
				return stkL;
			}

			// 出来高実績の在庫情報を取得
			MCList<MfgActTblReg_Upd04_DtlYieldR> yieldL = up2().subList(
					r -> !MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ()) && !r.not_stk_flg()
							&& !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			addAll(stkL, yieldL, createMap_LotProp_Sprt01_Dtl3R_MfgActTblReg_Upd04_DtlYieldR());

			// 副産品実績の在庫情報を取得
			MCList<MfgActTblReg_Upd04_DtlByProdR> byProdL = up3()
					.subList(r -> !MSC_MFG_MTD_TYP.isEXTNL(r.mfg_mtd_typ())
							&& !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));
			addAll(stkL, byProdL, createMap_LotProp_Sprt01_Dtl3R_MfgActTblReg_Upd04_DtlByProdR());
			
			if (stkL.isEmpty()) {
				return stkL;
			}
			
			// 在庫識別区分、在庫取引先ＣＤ、在庫着荷先ＣＤには固定値を設定
			stkL.setString(LotProp_Sprt01_Dtl3R.$stk_id_typ, MSC_STK_ID_TYP.COSTK.value());
			stkL.setString(LotProp_Sprt01_Dtl3R.$stk_bp_cd, MAC_STR.NULL_VAL.value());
			stkL.setString(LotProp_Sprt01_Dtl3R.$stk_arrv_bp_cd, MAC_STR.NULL_VAL.value());
			
			// 取得した出来高、副産品の黒伝、赤伝を在庫のキーに従いグループ化
			MCGroupByPolicy gbp = new MCGroupByPolicy(
					LotProp_Sprt01_Dtl3R.$itm_cd,
					LotProp_Sprt01_Dtl3R.$itm_sub1,
					LotProp_Sprt01_Dtl3R.$itm_sub2,
					LotProp_Sprt01_Dtl3R.$itm_sub3,
					LotProp_Sprt01_Dtl3R.$loc_cd,
					LotProp_Sprt01_Dtl3R.$str_ln_cd,
					LotProp_Sprt01_Dtl3R.$stk_arrv_bp_cd,
					LotProp_Sprt01_Dtl3R.$lot_no,
					LotProp_Sprt01_Dtl3R.$sublot_no,
					LotProp_Sprt01_Dtl3R.$sno1,
					LotProp_Sprt01_Dtl3R.$sno2,
					LotProp_Sprt01_Dtl3R.$sno3,
					LotProp_Sprt01_Dtl3R.$sno4,
					LotProp_Sprt01_Dtl3R.$quality_typ,
					LotProp_Sprt01_Dtl3R.$stk_id_typ,
					LotProp_Sprt01_Dtl3R.$stk_bp_cd,
					LotProp_Sprt01_Dtl3R.$gd_cd,
					LotProp_Sprt01_Dtl3R.$pack_flg,
					LotProp_Sprt01_Dtl3R.$trd_unit_cd,
					LotProp_Sprt01_Dtl3R.$base_unit_cd
			);

			// 数量を集計
			gbp.sum(LotProp_Sprt01_Dtl3R.$base_unit_qty, LotProp_Sprt01_Dtl3R.$trd_unit_qty);

			return stkL.groupBy(gbp);
		}
		
		/**
		 * 上り電文の出来高実績情報からロット提案サービスの在庫情報へのマッピング
		 * @return
		 */
		protected Map_LotProp_Sprt01_Dtl3R_MfgActTblReg_Upd04_DtlYieldR<LotProp_Sprt01_Dtl3R,MfgActTblReg_Upd04_DtlYieldR> createMap_LotProp_Sprt01_Dtl3R_MfgActTblReg_Upd04_DtlYieldR() {
			return new Map_LotProp_Sprt01_Dtl3R_MfgActTblReg_Upd04_DtlYieldR<LotProp_Sprt01_Dtl3R, MfgActTblReg_Upd04_DtlYieldR>();
		}

		public class Map_LotProp_Sprt01_Dtl3R_MfgActTblReg_Upd04_DtlYieldR<D extends LotProp_Sprt01_Dtl3R, S extends MfgActTblReg_Upd04_DtlYieldR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$itm_cd, MfgActTblReg_Upd04_DtlYieldR.$itm_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$itm_sub1, MfgActTblReg_Upd04_DtlYieldR.$itm_sub1);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$itm_sub2, MfgActTblReg_Upd04_DtlYieldR.$itm_sub2);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$itm_sub3, MfgActTblReg_Upd04_DtlYieldR.$itm_sub3);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$loc_cd, MfgActTblReg_Upd04_DtlYieldR.$loc_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$str_ln_cd, MfgActTblReg_Upd04_DtlYieldR.$str_ln_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$lot_no, MfgActTblReg_Upd04_DtlYieldR.$lot_no);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$sublot_no, MfgActTblReg_Upd04_DtlYieldR.$sublot_no);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$sno1, MfgActTblReg_Upd04_DtlYieldR.$sno1);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$sno2, MfgActTblReg_Upd04_DtlYieldR.$sno2);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$sno3, MfgActTblReg_Upd04_DtlYieldR.$sno3);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$sno4, MfgActTblReg_Upd04_DtlYieldR.$sno4);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$quality_typ, MfgActTblReg_Upd04_DtlYieldR.$quality_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$gd_cd, MfgActTblReg_Upd04_DtlYieldR.$gd_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$trd_unit_cd, MfgActTblReg_Upd04_DtlYieldR.$trd_unit_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$trd_unit_qty, MfgActTblReg_Upd04_DtlYieldR.$trd_unit_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$base_unit_cd, MfgActTblReg_Upd04_DtlYieldR.$base_unit_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$base_unit_qty, MfgActTblReg_Upd04_DtlYieldR.$base_unit_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$pack_flg, MfgActTblReg_Upd04_DtlYieldR.$pack_flg);
			}
		}

		/**
		 * 上り電文の副産品実績情報からロット提案サービスの在庫情報へのマッピング
		 * @return
		 */
		protected Map_LotProp_Sprt01_Dtl3R_MfgActTblReg_Upd04_DtlByProdR<LotProp_Sprt01_Dtl3R,MfgActTblReg_Upd04_DtlByProdR> createMap_LotProp_Sprt01_Dtl3R_MfgActTblReg_Upd04_DtlByProdR() {
			return new Map_LotProp_Sprt01_Dtl3R_MfgActTblReg_Upd04_DtlByProdR<LotProp_Sprt01_Dtl3R, MfgActTblReg_Upd04_DtlByProdR>();
		}

		public class Map_LotProp_Sprt01_Dtl3R_MfgActTblReg_Upd04_DtlByProdR<D extends LotProp_Sprt01_Dtl3R, S extends MfgActTblReg_Upd04_DtlByProdR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$itm_cd, MfgActTblReg_Upd04_DtlByProdR.$itm_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$itm_sub1, MfgActTblReg_Upd04_DtlByProdR.$itm_sub1);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$itm_sub2, MfgActTblReg_Upd04_DtlByProdR.$itm_sub2);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$itm_sub3, MfgActTblReg_Upd04_DtlByProdR.$itm_sub3);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$loc_cd, MfgActTblReg_Upd04_DtlByProdR.$loc_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$str_ln_cd, MfgActTblReg_Upd04_DtlByProdR.$str_ln_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$lot_no, MfgActTblReg_Upd04_DtlByProdR.$lot_no);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$sublot_no, MfgActTblReg_Upd04_DtlByProdR.$sublot_no);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$sno1, MfgActTblReg_Upd04_DtlByProdR.$sno1);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$sno2, MfgActTblReg_Upd04_DtlByProdR.$sno2);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$sno3, MfgActTblReg_Upd04_DtlByProdR.$sno3);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$sno4, MfgActTblReg_Upd04_DtlByProdR.$sno4);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$quality_typ, MfgActTblReg_Upd04_DtlByProdR.$quality_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$gd_cd, MfgActTblReg_Upd04_DtlByProdR.$gd_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$trd_unit_cd, MfgActTblReg_Upd04_DtlByProdR.$trd_unit_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$trd_unit_qty, MfgActTblReg_Upd04_DtlByProdR.$trd_unit_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$base_unit_cd, MfgActTblReg_Upd04_DtlByProdR.$base_unit_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$base_unit_qty, MfgActTblReg_Upd04_DtlByProdR.$base_unit_qty);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$pack_flg, MfgActTblReg_Upd04_DtlByProdR.$pack_flg);
			}
		}
		
		/**
		 * 削除対象の投入実績から在庫情報を生成する
		 * @return 在庫情報
		 */
		protected MCList<LotProp_Sprt01_Dtl3R> getDelInptStkL() {
			MCList<LotProp_Sprt01_Dtl3R> stkL = MCList.create(LotProp_Sprt01_Dtl3R.class);
			MCList<MfgActTblReg_Upd04_DtlInptR> delInptL = up0()
					.subList(MfgActTblReg_Upd04_DtlInptR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());

			// 削除する投入実績がない場合は何もしない
			if (delInptL.isEmpty()) {
				return stkL;
			}
			
			MCList<MST_INPT_ACT_R> dbL = MCList.create(MST_INPT_ACT_R.class);
			dbSelectKey("MSBCL6060_MST_INPT_ACT_S02", dbL, MCQueryApiBuilder.create(MST_INPT_ACT_R.create("T")), delInptL.groupBy(MfgActTblReg_Upd04_DtlInptR.$inpt_act_no));

			addAll(stkL, dbL, createMap_LotProp_Sprt01_Dtl3R_MST_INPT_ACT_R());

			// 取得した投入実績を在庫のキーに従いグループ化
			MCGroupByPolicy gbp = new MCGroupByPolicy(
					LotProp_Sprt01_Dtl3R.$itm_cd,
					LotProp_Sprt01_Dtl3R.$itm_sub1,
					LotProp_Sprt01_Dtl3R.$itm_sub2,
					LotProp_Sprt01_Dtl3R.$itm_sub3,
					LotProp_Sprt01_Dtl3R.$loc_cd,
					LotProp_Sprt01_Dtl3R.$str_ln_cd,
					LotProp_Sprt01_Dtl3R.$stk_arrv_bp_cd,
					LotProp_Sprt01_Dtl3R.$lot_no,
					LotProp_Sprt01_Dtl3R.$sublot_no,
					LotProp_Sprt01_Dtl3R.$sno1,
					LotProp_Sprt01_Dtl3R.$sno2,
					LotProp_Sprt01_Dtl3R.$sno3,
					LotProp_Sprt01_Dtl3R.$sno4,
					LotProp_Sprt01_Dtl3R.$quality_typ,
					LotProp_Sprt01_Dtl3R.$stk_id_typ,
					LotProp_Sprt01_Dtl3R.$stk_bp_cd,
					LotProp_Sprt01_Dtl3R.$gd_cd,
					LotProp_Sprt01_Dtl3R.$pack_flg,
					LotProp_Sprt01_Dtl3R.$base_unit_cd
			);

			// 数量を集計
			gbp.sum(LotProp_Sprt01_Dtl3R.$base_unit_qty);

			return stkL.groupBy(gbp);
		}

		protected Map_LotProp_Sprt01_Dtl3R_MST_INPT_ACT_R<LotProp_Sprt01_Dtl3R,MST_INPT_ACT_R> createMap_LotProp_Sprt01_Dtl3R_MST_INPT_ACT_R() {
			return new Map_LotProp_Sprt01_Dtl3R_MST_INPT_ACT_R<LotProp_Sprt01_Dtl3R, MST_INPT_ACT_R>();
		}

		public class Map_LotProp_Sprt01_Dtl3R_MST_INPT_ACT_R<D extends LotProp_Sprt01_Dtl3R, S extends MST_INPT_ACT_R> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$itm_cd, MST_INPT_ACT_R.$itm_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$itm_sub1, MST_INPT_ACT_R.$itm_sub1);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$itm_sub2, MST_INPT_ACT_R.$itm_sub2);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$itm_sub3, MST_INPT_ACT_R.$itm_sub3);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$loc_cd, MST_INPT_ACT_R.$inpt_loc_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$str_ln_cd, MST_INPT_ACT_R.$inpt_str_ln_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$stk_arrv_bp_cd, MST_INPT_ACT_R.$stk_arrv_bp_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$lot_no, MST_INPT_ACT_R.$lot_no);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$sublot_no, MST_INPT_ACT_R.$sublot_no);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$sno1, MST_INPT_ACT_R.$sno1);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$sno2, MST_INPT_ACT_R.$sno2);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$sno3, MST_INPT_ACT_R.$sno3);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$sno4, MST_INPT_ACT_R.$sno4);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$quality_typ, MST_INPT_ACT_R.$quality_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$stk_id_typ, MST_INPT_ACT_R.$stk_id_typ);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$stk_bp_cd, MST_INPT_ACT_R.$stk_bp_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$gd_cd, MST_INPT_ACT_R.$gd_cd);
				addColumnPathMap(LotProp_Sprt01_Dtl3R.$base_unit_cd, MST_INPT_ACT_R.$base_unit_cd);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.pack_flg(false);
				dest.base_unit_qty(sum(src.base_unit_inpt_qty(), src.base_unit_loss_qty(), src.base_unit_fxd_loss_qty()));
			}
		}
		
		/**
		 * ロット提案結果のチェック
		 * @param rsltL
		 */
		protected void chkLotPropRslt(MCList<MfgActTblReg_Upd04_DtlInptR> inptL, MCList<LotProp_Sprt01_Dtl1R> rsltL) {
			MCMessageList msgList = new MCMessageList();
			
			MCIndexKey idxKey = rsltL.createIndex(LotProp_Sprt01_Dtl1R.$peg_no, LotProp_Sprt01_Dtl1R.$err_flg);
			boolean addMessagePoolFlg = false;

			boolean hasErr = false;
			for (MfgActTblReg_Upd04_DtlInptR inptR : inptL) {
				MfgActTblReg_Upd04_HdrR hdrDownR = _hdrCache.getCache(inptR.hdr_peg_no());
				MfgActTblReg_Upd04_DtlOperR operDownR = _operCache.getCache(inptR.oper_peg_no());

				if (!isNull(rsltL.getFirst(idxKey, inptR.peg_no(), true))) {
					// 失敗件数をカウントアップ
					if (inptR.lst_reg_flg() || inptR.is_src_batch_flg()) {
						hdrDownR.bkf_failure_cnt(nvl(hdrDownR.bkf_failure_cnt(), MCNumber.ZERO).add(MCNumber.ONE));
						operDownR.bkf_failure_cnt(nvl(operDownR.bkf_failure_cnt(), MCNumber.ZERO).add(MCNumber.ONE));
					}
					boolean minusStkFlg = _cacheItm.getEx(inptR.itm_cd(), inptR.itm_sub1(),
							inptR.itm_sub2(), inptR.itm_sub3()).minus_stk_flg();
					
					if (inptR.lst_reg_flg() || inptR.is_src_batch_flg() || inptR.is_src_md_mfg_srv_flg()) {
						// バッチからの実行（バックフラッシュバッチ・MES-Link)またはMDからの実行の場合、メッセージプールに追加する
						if (inptR.is_src_batch_flg() || inptR.is_src_md_mfg_srv_flg()) {
							addMessagePoolFlg = true;
						}
						// 一括登録画面・バッチからの実行（バックフラッシュバッチ・MES-Link)またはMDからの実行の場合、登録スキップFLGをtrueにするだけで例外にはしない
						inptR.inpt_act_reg_skip_flg(true);
						if (minusStkFlg) {
							if ((inptR.is_src_batch_flg()  || inptR.is_src_md_mfg_srv_flg()) && !inptR.lst_reg_flg()) {
								// MES-LinkまたはMDからの実行の場合
								msgList.add(new MCMessage(inptR, null, MSBCL1100,
										toDispItm(inptR.itm_cd(), inptR.itm_sub1(),
												inptR.itm_sub2(), inptR.itm_sub3()),
										inptR.mfg_inst_no(),
										null,
										toDispGUIIndex(inptR)));
							}
							else {
								// MES-Linkでない場合
								msgList.add(new MCMessage(inptR, null, MSBCL1100,
										toDispItm(inptR.itm_cd(), inptR.itm_sub1(),
												inptR.itm_sub2(), inptR.itm_sub3()),
										inptR.mfg_inst_no(),
										inptR.mfg_act_no(),
										toDispGUIIndex(inptR)));
							}
						}
						else {
							if ((inptR.is_src_batch_flg()  || inptR.is_src_md_mfg_srv_flg()) && !inptR.lst_reg_flg()) {
								// MES-LinkまたはMDからの実行の場合
								msgList.add(new MCMessage(inptR, null, MSBCL1099,
										toDispItm(inptR.itm_cd(), inptR.itm_sub1(),
												inptR.itm_sub2(), inptR.itm_sub3()),
										inptR.mfg_inst_no(),
										null,
										toDispGUIIndex(inptR)));
							}
							else {
								// MES-Linkでない場合
								msgList.add(new MCMessage(inptR, null, MSBCL1099,
										toDispItm(inptR.itm_cd(), inptR.itm_sub1(),
												inptR.itm_sub2(), inptR.itm_sub3()),
										inptR.mfg_inst_no(),
										inptR.mfg_act_no(),
										toDispGUIIndex(inptR)));
							}
						}
					}
					else {
						// 単票画面の場合、未引当エラーが存在する場合は例外をthrowする
						hasErr = true;
						if (minusStkFlg) {
							msgList.add(new MCMessage(inptR, null, MSBCL1133,
									toDispItm(inptR.itm_cd(), inptR.itm_sub1(),
											inptR.itm_sub2(), inptR.itm_sub3()),
									toDispGUIIndex(inptR)));
						}
						else {
							msgList.add(new MCMessage(inptR, null, MSBCL1077,
									toDispItm(inptR.itm_cd(), inptR.itm_sub1(),
											inptR.itm_sub2(), inptR.itm_sub3()),
									toDispGUIIndex(inptR)));
						}
					}
				}
				else {
					if (inptR.lst_reg_flg() || inptR.is_src_batch_flg()) {
						// 成功件数をカウントアップ
						hdrDownR.bkf_success_cnt(nvl(hdrDownR.bkf_success_cnt(), MCNumber.ZERO).add(MCNumber.ONE));
						operDownR.bkf_success_cnt(nvl(operDownR.bkf_success_cnt(), MCNumber.ZERO).add(MCNumber.ONE));
					}
				}
				
				// ロット、サブロット混在チェックはchkInptAfterLotPropで実施している
			}
			
			if (hasErr) {
				MCAppException e = new MCAppException(msgOpeErr());
				e.addCauseMessageList(msgList);
				throw e;
			}
			if (addMessagePoolFlg) {
				MCMessagePool.addAll(msgList);
			}
		}

		/**
		 * 投入のロット提案結果を上り電文に設定する
		 * @param rsltL
		 */
		protected void setInptLotPropRslt(MCList<LotProp_Sprt01_Dtl1R> rsltL) {
			MCIndexKey idxKey = up0().createIndex(MfgActTblReg_Upd04_DtlInptR.$peg_no);
			MCNumber maxPegNoNum = (MCNumber) up0().max(MfgActTblReg_Upd04_DtlInptR.$peg_no);
			int maxPegNo = maxPegNoNum.intValue();
			
			MCList<MfgActTblReg_Upd04_DtlInptR> addL = MCList.create(MfgActTblReg_Upd04_DtlInptR.class);
			MCIndexKey lossIdxKey = up1().createIndex(MfgActTblReg_Upd04_DtlLossR.$inpt_peg_no);
			
			for (LotProp_Sprt01_Dtl1R rsltR : rsltL) {
				MfgActTblReg_Upd04_DtlInptR inptR = up0().getFirst(idxKey, rsltR.peg_no());
				
				if (inptR.inpt_act_reg_skip_flg()) {
					// 追加行の場合、continueせず、cloneして投入予定に追加する処理を実施することにより
					// setLossLotPropRsltにて、紐づき対象レコードなしでNullPointerExceptionとなることを回避する
					if (!rsltR.add_flg()) {
						// 投入実績とロス実績を紐付けるためのＮＯを設定
						inptR.loss_peg_no(rsltR.loss_peg_no());
						continue;
					} else {
						MfgActTblReg_Upd04_DtlInptR addR = inptR.clone();
						addR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
						addR.inpt_act_no(getStrSeq(MSC_NUM_SYS_TYP.INPTACT));
						addR.acxfr_rsn_cd(null);
						addR.acxfr_bd_dpt_cd(null);
						addR.acxfr_qty(null);
						addR.peg_no(++maxPegNo);
						addR.loss_peg_no(rsltR.loss_peg_no());
						
						setInptLotPropRsltSub(rsltR, addR);
						addL.add(addR);
						continue;
					}
				}
				
				// 代替グループの場合は、ロット提案結果の代替品目指定FLGの値に依存して、登録対象とするか否かが変わる
				if (!isNull(inptR.alt_grp_cd())) {
					if (!rsltR.alt_itm_fix_flg()) {
						MCList<MfgActTblReg_Upd04_DtlLossR> lossL = up1()
								.subList(lossIdxKey, inptR.peg_no());
						// 代替品目指定がfalseということはロット提案で提案されなかった品目であるため、登録対象外とする
						if (MAC_DATA_CRUD_TYP.isCRT(inptR.data_crud_typ())) {
							inptR.loss_peg_no(rsltR.loss_peg_no());
							inptR.inpt_act_reg_skip_flg(true);
							// 後続のsetLossLotPropRslt内でも、loss_act_reg_skip_flgをtrueにする処理があるが、
							// ロスとしてのロット提案結果が返ってこない場合があるため、ここでもloss_act_reg_skip_flgをtrueにしている
							for (MfgActTblReg_Upd04_DtlLossR lossR : lossL) {
								lossR.loss_act_reg_skip_flg(true);
							}
							continue;
						}
						else {
							// 既に登録済みの行が提案されなかった場合、データ更新区分を削除にする
							inptR.loss_peg_no(rsltR.loss_peg_no());
							inptR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
							for (MfgActTblReg_Upd04_DtlLossR lossR : lossL) {
								if (isNull(lossR.loss_act_no())) {
									lossR.loss_act_reg_skip_flg(true);
								}
								else {
									lossR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
								}
							}
							continue;
						}
					}
				}

				// 紐付けＮＯで提案結果に対する投入実績を取得。追加行の場合はcloneして投入予定に追加
				if (rsltR.add_flg()) {
					MfgActTblReg_Upd04_DtlInptR addR = inptR.clone();
					addR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					addR.inpt_act_no(getStrSeq(MSC_NUM_SYS_TYP.INPTACT));
					addR.acxfr_rsn_cd(null);
					addR.acxfr_bd_dpt_cd(null);
					addR.acxfr_qty(null);
					addR.peg_no(++maxPegNo);
					addR.loss_peg_no(rsltR.loss_peg_no());
					
					setInptLotPropRsltSub(rsltR, addR);
					addL.add(addR);
				}
				else {
					inptR.loss_peg_no(rsltR.loss_peg_no());
					setInptLotPropRsltSub(rsltR, inptR);
				}
			}
			up0().addAll(addL);
		}
		
		protected void setInptLotPropRsltSub(LotProp_Sprt01_Dtl1R rsltR, MfgActTblReg_Upd04_DtlInptR inptR) {
			// ロット提案結果の設定
			inptR.gd_cd(rsltR.gd_cd());
			inptR.lot_no(rsltR.lot_no());
			inptR.sublot_no(rsltR.sublot_no());
			inptR.sno1(rsltR.sno1());
			inptR.sno2(rsltR.sno2());
			inptR.sno3(rsltR.sno3());
			inptR.sno4(rsltR.sno4());
			inptR.alt_itm_fix_flg(rsltR.alt_itm_fix_flg());

			inptR.base_unit_cd(rsltR.base_unit_cd());
			inptR.ver_no(rsltR.ver_no());
			
			inptR.stk_id_typ(rsltR.stk_id_typ());
			inptR.stk_bp_cd(rsltR.stk_bp_cd());
			inptR.stk_arrv_bp_cd(rsltR.stk_arrv_bp_cd());

			// 提案結果の数量から投入数量、ロス数量、固定ロス数量を算出
			inptR.base_unit_inpt_qty(rsltR.inpt_qty());
			inptR.base_unit_loss_qty(rsltR.loss_qty());
			inptR.base_unit_fxd_loss_qty(rsltR.fxd_loss_qty());
			
			// 投入・ロス合計数量を算出（VMI・支給のサービスに渡す）
			inptR.base_unit_sum_inpt_loss_qty(MCNumber.sum(inptR.base_unit_inpt_qty(),
					inptR.base_unit_fxd_loss_qty(), inptR.base_unit_loss_qty()));

			// 有効成分対象の場合
			if (inptR.cont_fctr_flg()) {
				inptR.cont_qty(rsltR.cont_inpt_qty());
				inptR.act_cont_fctr(rsltR.act_cont_fctr());
			}
			else {
				// 有効成分の数量はnull
				inptR.cont_qty(null);
				inptR.act_cont_fctr(null);
			}
		}
		
		/**
		 * ロスのロット提案結果を上り電文に設定する
		 * @param rsltL
		 */
		protected void setLossLotPropRslt(MCList<LotProp_Sprt01_Dtl4R> lossRsltL) {
			MCIndexKey up0Key = up0().createIndex(MfgActTblReg_Upd04_DtlInptR.$loss_peg_no);
			MCIndexKey up1Key = up1().createIndex(
					MfgActTblReg_Upd04_DtlLossR.$inpt_peg_no,
					MfgActTblReg_Upd04_DtlLossR.$loss_rsn_cd);
			
			MCList<MfgActTblReg_Upd04_DtlLossR> addL = MCList
					.create(MfgActTblReg_Upd04_DtlLossR.class);

			for (LotProp_Sprt01_Dtl4R lossRsltR : lossRsltL) {
				MfgActTblReg_Upd04_DtlLossR lossR = up1().getFirst(up1Key, lossRsltR.inpt_peg_no(), lossRsltR.loss_rsn_cd());
				
				// 投入実績ＮＯ等を取得するため、ロス実績用紐付けＮＯから投入実績を参照
				MfgActTblReg_Upd04_DtlInptR inptR = up0().getFirst(up0Key, lossRsltR.loss_peg_no());
				
				if (inptR.inpt_act_reg_skip_flg()) {
					lossR.loss_act_reg_skip_flg(true);
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isDEL(inptR.data_crud_typ())) {
					// setInptLotPropRslt内で、代替の場合にデータ更新区分をDELにする場合があるため、
					//　投入がDELとなっている場合は、ロスもDELにする
					lossR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
					continue;
				}

				// 投入実績ＮＯで提案結果に対するロス実績を取得。追加行の場合はcloneして追加
				if (lossRsltR.add_flg()) {
					lossR = lossR.clone();
					lossR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					lossR.loss_act_no(getStrSeq(MSC_NUM_SYS_TYP.LOSSACT));
					lossR.inpt_act_no(inptR.inpt_act_no());
					setLossLotPropRsltSub(lossRsltR, lossR);
					addL.add(lossR);
				}
				else {
					setLossLotPropRsltSub(lossRsltR, lossR);
				}
			}
			up1().addAll(addL);
		}
		
		protected void setLossLotPropRsltSub(LotProp_Sprt01_Dtl4R lossRsltR, MfgActTblReg_Upd04_DtlLossR lossR) {
			lossR.base_unit_qty(lossRsltR.loss_qty());
		}
		
		protected MCList<MfgActTblReg_Upd04_DtlInptR> getRegInptL() {
			MCList<MfgActTblReg_Upd04_DtlInptR> ret = MCList.create(MfgActTblReg_Upd04_DtlInptR.class);
			for (MfgActTblReg_Upd04_DtlInptR r : up0()) {
				if (!r.lst_reg_flg() && r.is_src_batch_flg()) {
					MfgActTblReg_Upd04_HdrR hdrDownR = _hdrCache.getCache(r.hdr_peg_no());
					if (!isNull(hdrDownR.bkf_failure_cnt()) && !hdrDownR.bkf_failure_cnt().isZero()) {
						continue;
					}
				}
				if (!r.inpt_act_reg_skip_flg()) {
					ret.add(r);
				}
			}
			return ret;
		}
		
		protected MCList<MfgActTblReg_Upd04_DtlInptR> getIoRegInptL(MCList<MfgActTblReg_Upd04_DtlInptR> regInptL) {
			return regInptL.subList(MfgActTblReg_Upd04_DtlInptR.$is_only_abort_flg, false);
		}
		
		protected MCList<MfgActTblReg_Upd04_DtlLossR> getIoRegLossL(MCList<MfgActTblReg_Upd04_DtlInptR> regInptL,MCList<MfgActTblReg_Upd04_DtlLossR> regLossL) {
			MCList<MfgActTblReg_Upd04_DtlLossR> ioRegLossL = MCList.create(MfgActTblReg_Upd04_DtlLossR.class);
			MCIndexKey idxKey = regInptL.createIndex(MfgActTblReg_Upd04_DtlInptR.$peg_no);
			for (MCList<MfgActTblReg_Upd04_DtlLossR> lossL : regLossL.groupList(MfgActTblReg_Upd04_DtlLossR.$inpt_peg_no)) {
				MfgActTblReg_Upd04_DtlInptR inptR = regInptL.getFirst(idxKey,lossL.get(0).inpt_peg_no());
				if (!inptR.is_only_abort_flg()) {
					ioRegLossL.addAll(lossL);
				}
			}
			return ioRegLossL;
		}
		
		protected MCList<MfgActTblReg_Upd04_DtlLossR> getRegLossL() {
			MCList<MfgActTblReg_Upd04_DtlLossR> ret = MCList.create(MfgActTblReg_Upd04_DtlLossR.class);
			MCIndexKey idxKey = up0().createIndex(MfgActTblReg_Upd04_DtlInptR.$peg_no);

			for (MfgActTblReg_Upd04_DtlLossR r : up1()) {
				MfgActTblReg_Upd04_DtlInptR inptR = up0().getFirst(idxKey, r.inpt_peg_no());
				if (!inptR.lst_reg_flg() && inptR.is_src_batch_flg()) {
					MfgActTblReg_Upd04_HdrR hdrDownR = _hdrCache.getCache(inptR.hdr_peg_no());
					if (!isNull(hdrDownR.bkf_failure_cnt()) && !hdrDownR.bkf_failure_cnt().isZero()) {
						continue;
					}
				}
				if (r.loss_act_reg_skip_flg()) {
					continue;
				}
				// 新規登録でロス実績数が０の場合は処理対象外とする
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					if (inptR.cont_fctr_flg()) {
						if (isNull(r.cont_qty()) || r.cont_qty().isZero()) {
							continue;
						}
					}
					else {
						if (isNull(r.base_unit_qty()) || r.base_unit_qty().isZero()) {
							continue;
						}
					}
				}
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					//引当管理サービス、ロス実績のロット提案結果取得処理にて、ロス実績数量＜0以上を対象としているため、ロス実績数量=0への更新を許容してしまうとデータの不整合が発生する。
					if (inptR.cont_fctr_flg()) {
						if (isNull(r.cont_qty()) || r.cont_qty().isZero()) {
							r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						}
					}
					else {
						if (isNull(r.base_unit_qty()) || r.base_unit_qty().isZero()) {
							r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
						}
					}
				}
				ret.add(r);
			}
			return ret;
		}



		protected void editUpForProvAndVmi(MCList<MfgActTblReg_Upd04_DtlInptR> regInptL) {
			MCList<MfgActTblReg_Upd04_DtlInptR> inptInsUpdL = regInptL
					.subList(r -> (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())));
			MCList<MfgActTblReg_Upd04_DtlInptR> stkIdTypInsUpdL = inptInsUpdL
					.subList(r -> !MSC_STK_ID_TYP.isSLF_SUPPRT(r.stk_id_typ()));
			
			// 一行の投入から、支給と支給返品の２行を作成することがあるため、pegNo支給サービス用のpegNoを別途保持している
			MCNumber provSrvPegNo = MCNumber.ZERO;
			for (MfgActTblReg_Upd04_DtlInptR inptR :stkIdTypInsUpdL) {
				// ＶＭＩ
				if (MSC_STK_ID_TYP.isRNT_RCV(inptR.stk_id_typ())) {
					inptR.vmi_purc_flg(true);
				}
				
				// 支給
				if (MSC_MFG_MTD_TYP.isEXTNL(inptR.mfg_mtd_typ())
						&& isNull(inptR.inpt_loc_sppl_cd())) {
					// 外注において社内場所から投入する場合⇒支給
					inptR.prov_flg(true);
					inptR.prov_peg_no(provSrvPegNo);
					provSrvPegNo = provSrvPegNo.add(MCNumber.ONE);
					inptR.prov_rtn_flg(false);
					inptR.prov_basis_typ(MAC_PROV_BASIS_TYP.GI.value());
				} 
				else if (MSC_MFG_MTD_TYP.isINTNL(inptR.mfg_mtd_typ())
						&& !isNull(inptR.inpt_loc_sppl_cd())) {
					// 内製において社外場所から投入する場合⇒使用基準の在庫（着荷先がNULL文字）でなければ、支給返品
					if (!MAC_STR.isNULL_VAL(inptR.stk_arrv_bp_cd())) {
						inptR.prov_flg(false);
						inptR.prov_rtn_flg(true);
						inptR.prov_rtn_peg_no(provSrvPegNo);
						provSrvPegNo = provSrvPegNo.add(MCNumber.ONE);
						inptR.prov_basis_typ(MAC_PROV_BASIS_TYP.GI.value());
					}
				} 
				else if (MSC_MFG_MTD_TYP.isEXTNL(inptR.mfg_mtd_typ()) 
						&& !isNull(inptR.inpt_loc_sppl_cd()) 
						&& !isSame(inptR.sppl_cd(), inptR.inpt_loc_sppl_cd())) {
					// 外注においてほかの外注場所から投入する場合⇒使用基準の在庫（着荷先がNULL文字）でなければ、支給返品。その後に支給
					inptR.prov_flg(true);
					inptR.prov_peg_no(provSrvPegNo);
					provSrvPegNo = provSrvPegNo.add(MCNumber.ONE);
					if (!MAC_STR.isNULL_VAL(inptR.stk_arrv_bp_cd())) {
						inptR.prov_rtn_flg(true);
						inptR.prov_rtn_peg_no(provSrvPegNo);
						provSrvPegNo = provSrvPegNo.add(MCNumber.ONE);
					}
					inptR.prov_basis_typ(MAC_PROV_BASIS_TYP.GI.value());
				}
				else if (MSC_MFG_MTD_TYP.isEXTNL(inptR.mfg_mtd_typ()) 
						&& MSC_STK_ID_TYP.isCOSTK(inptR.stk_id_typ())
						&& MAC_STR.isNULL_VAL(inptR.stk_arrv_bp_cd())
						&& !isNull(inptR.inpt_loc_sppl_cd())) {
					// 外注において、その外注場所から投入する場合⇒使用基準（着荷先がNULL文字）であれば支給
					inptR.prov_flg(true);
					inptR.prov_peg_no(provSrvPegNo);
					provSrvPegNo = provSrvPegNo.add(MCNumber.ONE);
					inptR.prov_rtn_flg(false);
					inptR.prov_basis_typ(MAC_PROV_BASIS_TYP.INPT.value());
				}
			}

			MCList<MfgActTblReg_Upd04_DtlInptR> inptUpdDelL = regInptL
					.subList(r -> (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())
							|| MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())));

			MCList<MST_PURC_ACT_D_R> purcActL = MCList.create(MST_PURC_ACT_D_R.class);
			MST_PURC_ACT_D_R t1 = MST_PURC_ACT_D_R.create("T1");
			MST_PURC_ACT_R t2 = MST_PURC_ACT_R.create("T2");
			MCQueryApiBuilder purcActL_bldr = MCQueryApiBuilder.create(t1);
			purcActL_bldr.setSelect(t1.purc_src_no);
			purcActL_bldr.addInnerJoin(t2, bracket( t2.purc_act_no.eq(t1.purc_act_no) .and(t2.purc_act_seq.eq(t1.purc_act_seq))));
			purcActL_bldr.setWhere(t1.purc_src_no.eq(bind("inpt_act_no")));
			purcActL_bldr.addWhereWithAnd(t1.purc_src_typ.eq(value(MSC_PURC_SRC_TYP.INPT.value())));
			purcActL_bldr.addWhereWithAnd(t2.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbSelect("MSBCL6060_MST_PURC_ACT_D_S01", purcActL, purcActL_bldr, inptUpdDelL);

			MCList<MST_PROV_ACT_R> provActL = MCList.create(MST_PROV_ACT_R.class);
			MST_PROV_ACT_R t3 = MST_PROV_ACT_R.create("T3");
			MCQueryApiBuilder provActL_bldr = MCQueryApiBuilder.create(t3);
			provActL_bldr.setSelect(t3.prov_src_act_no, t3.trd_ptn_typ);
			provActL_bldr.setWhere(t3.prov_src_act_no.eq(bind("inpt_act_no")));
			provActL_bldr.addWhereWithAnd(t3.prov_src_act_typ.eq(value(MSC_PROV_SRC_ACT_TYP.INPT.value())));
			provActL_bldr.addWhereWithAnd(t3.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())));
			dbSelect("MSBCL6060_MST_PROV_ACT_S01", provActL, provActL_bldr, inptUpdDelL);

			MCIndexKey purcActDIdxkey = purcActL.createIndex(MST_PURC_ACT_D_R.$purc_src_no);
			MCIndexKey provActIdxkey = provActL.createIndex(MST_PROV_ACT_R.$prov_src_act_no);

			for (MfgActTblReg_Upd04_DtlInptR inptR :inptUpdDelL) {
				MST_PURC_ACT_D_R purcActR = purcActL.getFirst(purcActDIdxkey, inptR.inpt_act_no());
				if (!isNull(purcActR)) {
					inptR.old_vmi_purc_flg(true);
				}

				MCList<MST_PROV_ACT_R>  provActSubL = provActL.subList(provActIdxkey, inptR.inpt_act_no());
				if (!provActSubL.isEmpty()) {

					boolean isOldProv = !isNull(provActSubL.getFirst(MST_PROV_ACT_R.$trd_ptn_typ, MAC_TRD_PTN_TYP.PROV.value()));
					boolean isOldProvRtn = !isNull(provActSubL.getFirst(MST_PROV_ACT_R.$trd_ptn_typ, MAC_TRD_PTN_TYP.PROV_RTN.value()));
					if (isOldProv) {
						inptR.old_prov_flg(true);
					}
					if (isOldProvRtn) {
						inptR.old_prov_rtn_flg(true);
					}
				}
			}
		}

		/**
		 * マスタのキャッシュを作成する
		 */
		protected void crtMsterCache() {
			MAM_ITM_R t1 = MAM_ITM_R.create("T1");
			MCQueryApiBuilder itmL_bldr = MCQueryApiBuilder.create(t1);
			itmL_bldr.setSelect(t1.itm_nm, t1.stk_mng_typ, t1.minus_stk_flg, t1.sundry_itm_flg, t1.pack_alloc_flg);
			_cacheItm = new FXUCL_MCDbcCache<MAM_ITM_R>(itmL_bldr, up0(),
					MfgActTblReg_Upd04_DtlInptR.$itm_cd,
					MfgActTblReg_Upd04_DtlInptR.$itm_sub1,
					MfgActTblReg_Upd04_DtlInptR.$itm_sub2,
					MfgActTblReg_Upd04_DtlInptR.$itm_sub3);

			MAM_BP_R t2 = MAM_BP_R.create("T2");
			MCQueryApiBuilder bpL_bldr = MCQueryApiBuilder.create(t2);
			bpL_bldr.setSelect(t2.prov_amt_rnd_typ, t2.prov_tax_rnd_typ);
			_cacheBp = new FXUCL_MCDbcCache<MAM_BP_R>(bpL_bldr, up0(),
					MfgActTblReg_Upd04_DtlInptR.$sppl_cd);

			MAM_CUR_R t3 = MAM_CUR_R.create("T3");
			MCQueryApiBuilder curL_bldr = MCQueryApiBuilder.create(t3);
			curL_bldr.setSelect(t3.amt_dec_place);
			_cacheCur = new FXUCL_MCDbcCache<MAM_CUR_R>(curL_bldr, up0(),
					MfgActTblReg_Upd04_DtlInptR.$slf_support_cur_cd);

			MAM_TAX_R t4 = MAM_TAX_R.create("T4");
			MCQueryApiBuilder taxL_bldr = MCQueryApiBuilder.create(t4);
			taxL_bldr.setSelect(t4.tax_rate, t4.inc_tax_flg);
			_cacheTax = new FXUCL_MCDbcCache<MAM_TAX_R>(taxL_bldr, up0(),
					MfgActTblReg_Upd04_DtlInptR.$slf_support_tax_cd);
		}

		/**
		 * ロット提案後の投入のチェックを行う
		 * @param inptR
		 */
		protected void chkInptAfterLotProp(MCList<MfgActTblReg_Upd04_DtlInptR> inptL) {
			
			// 上り電文から削除行を除外
			MCList<MfgActTblReg_Upd04_DtlInptR> crtUpdL = inptL.subList(r -> !MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ()));

			// ロット・サブロット混在チェック対象（ロット対象外ではなくロット混在不可、またはサブロット対象ではなくサブロット混在不可）の抽出
			MCList<MfgActTblReg_Upd04_DtlInptR> lotTgtL = crtUpdL.subList(
					r -> (!MAC_LOT_MNG_TYP.isNOT_MNG(r.lot_mng_typ()) && !r.lot_mix_flg())
							|| (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(r.sublot_mng_typ())
									&& !r.sublot_mix_flg()));
			
			// 代替品目混在チェック対象（代替品目区分が混在不可（最古入庫日優先または引当優先順）かつ代替品目指定がオン）の抽出
			MCList<MfgActTblReg_Upd04_DtlInptR> altItmTgtL = crtUpdL
					.subList(r -> (MAC_ALT_ITM_TYP.isMONO_FIFO(r.alt_itm_typ())
							|| MAC_ALT_ITM_TYP.isMONO_PRIO(r.alt_itm_typ())));

			// ロット・サブロット混在チェック対象、代替品目混在チェック対象がいずれも存在しない場合、何もしない
			if (lotTgtL.isEmpty() && altItmTgtL.isEmpty()) {
				return;
			}
			
			MCMessageList msgList = new MCMessageList();
			boolean hasErr = false;

			// 処理対象の投入実績ＮＯを投入実績のワークテーブルに格納
			MCList<MST_INPT_ACT_R> insL = MCList.create(MST_INPT_ACT_R.class);
			// 新規行はテーブルに存在しないので不要
			for(MfgActTblReg_Upd04_DtlInptR r : inptL.subList(i -> !MAC_DATA_CRUD_TYP.isCRT(i.data_crud_typ()))) {
				MST_INPT_ACT_R dbcR = MST_INPT_ACT_R.create();
				dbcR.inpt_act_no(r.inpt_act_no());
				insL.add(dbcR);
			}
			if(!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_INPT_ACT_R.create("T"));
				dbWkDelete("MSBCL6060_MSW_INPT_ACT_D01", insL_bldr.getBaseDbc());
				dbWkInsert("MSBCL6060_MSW_INPT_ACT_I01", insL, insL_bldr.getBaseDbc());
			}

			// チェック対象の投入と同じ製造指図に紐付く投入実績を抽出（上り電文対象は除く）
			MCList<MST_INPT_ACT_R> dbcL = MCList.create(MST_INPT_ACT_R.class);
			MST_INPT_ACT_R t2 = MST_INPT_ACT_R.create("T2");
			MST_INPT_SCHD_R t3 = MST_INPT_SCHD_R.create("T3");
			MSW_INPT_ACT_KEY_R S1T4 = MSW_INPT_ACT_KEY_R.create("T4");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t2);
			dbcL_bldr.setSelect(t2.div_seq, t2.itm_cd, t2.itm_sub1, t2.itm_sub2, t2.itm_sub3, t2.lot_no, t2.sublot_no, t2.base_unit_inpt_qty, t2.base_unit_loss_qty, t2.base_unit_fxd_loss_qty);
			dbcL_bldr.addSelect(t3.oper_inst_no, t3.alt_grp_cd, t3.alt_grp_seq);
			dbcL_bldr.addInnerJoin(t3, bracket( t3.inpt_schd_no.eq(t2.inpt_schd_no)));
			dbcL_bldr.addWhereWithAnd(notExists( subQuery() 
					.select(S1T4.inpt_act_no) 
					.from(S1T4) 
					.where( S1T4.inpt_act_no.eq(t2.inpt_act_no) )));
			dbcL_bldr.addWhereWithAnd(t3.mfg_inst_no.eq(bind("mfg_inst_no")));
			dbSelect("MSBCL6060_MST_INPT_ACT_S01", dbcL, dbcL_bldr, inptL.groupBy(MfgActTblReg_Upd04_DtlInptR.$mfg_inst_no));
			
			// ロット・サブロット混在チェック
			if (!lotTgtL.isEmpty() && !chkLotMix(crtUpdL, dbcL, lotTgtL, msgList)) {
				hasErr = true;
			}

			// 代替品目混在チェック
			if (!altItmTgtL.isEmpty() && !chkAltItmMix(crtUpdL, dbcL, altItmTgtL, msgList)) {
				hasErr = true;
			}
			
			MCMessagePool.addAll(msgList);
			if (hasErr) {
				MCAppException e = new MCAppException(msgOpeErr());
				e.addCauseMessageList(msgList);
				throw e;
			}
		}

		/**
		 * ロット・サブロット混在チェック
		 */
		protected boolean chkLotMix(MCList<MfgActTblReg_Upd04_DtlInptR> crtUpdL,
				MCList<MST_INPT_ACT_R> dbcL,
				MCList<MfgActTblReg_Upd04_DtlInptR> tgtL, MCMessageList msgList) {
			
			boolean rtnFlg = true;

			// 同一工程指図ＮＯ、分割連番内の同一品目で上り電文のロット・サブロットの混在をチェックするためのindexKey
			MCIndexKey inptKey = crtUpdL.createIndex(
					MfgActTblReg_Upd04_DtlInptR.$oper_inst_no,
					MfgActTblReg_Upd04_DtlInptR.$div_seq,
					MfgActTblReg_Upd04_DtlInptR.$itm_cd,
					MfgActTblReg_Upd04_DtlInptR.$itm_sub1,
					MfgActTblReg_Upd04_DtlInptR.$itm_sub2,
					MfgActTblReg_Upd04_DtlInptR.$itm_sub3);

			// 同一工程指図ＮＯ、分割連番内の同一品目でテーブルのロット・サブロットの混在をチェックするためのindexKey
			MCIndexKey dbcKey = dbcL.createIndex(
					"oper_inst_no",
					MST_INPT_ACT_R.$div_seq,
					MST_INPT_ACT_R.$itm_cd,
					MST_INPT_ACT_R.$itm_sub1,
					MST_INPT_ACT_R.$itm_sub2,
					MST_INPT_ACT_R.$itm_sub3);

			// 上り電文に対するチェック
			for (MfgActTblReg_Upd04_DtlInptR r : tgtL) {
				if (r.base_unit_inpt_qty().isZero() && r.base_unit_loss_qty().isZero() && r.base_unit_fxd_loss_qty().isZero()) {
					continue;
				}
				String dispItm = toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				String dispGUIIndex = toDispGUIIndex(r);
				
				// 上り電文から同一工程指図内の同一品目を抽出
				MCList<MfgActTblReg_Upd04_DtlInptR> crtUpdSubL = crtUpdL.subList(inptKey,
						r.oper_inst_no(), r.div_seq(), r.itm_cd(), r.itm_sub1(),
						r.itm_sub2(), r.itm_sub3());

				// テーブルから同一工程指図内の同一品目を抽出
				MCList<MST_INPT_ACT_R> dbcSubL = dbcL.subList(dbcKey,
						r.oper_inst_no(), r.div_seq(), r.itm_cd(), r.itm_sub1(),
						r.itm_sub2(), r.itm_sub3());

				// ロット混在チェック
				if (!r.lot_mix_flg()) {
					for (MfgActTblReg_Upd04_DtlInptR subR : crtUpdSubL) {
						if (subR.base_unit_inpt_qty().isZero() && subR.base_unit_loss_qty().isZero() && subR.base_unit_fxd_loss_qty().isZero()) {
							continue;
						}
						
						if (!isSame(r.peg_no(), subR.peg_no())
								&& !isSame(r.lot_no(), subR.lot_no())) {
							msgList.add(new MCMessage(r, null, MSBCL1318, r.mfg_act_no(),
									r.inpt_schd_no(), dispItm, dispGUIIndex));
							rtnFlg = false;
							break;
						}
					}
					for (MST_INPT_ACT_R subR : dbcSubL) {
						if (subR.base_unit_inpt_qty().isZero() && subR.base_unit_loss_qty().isZero() && subR.base_unit_fxd_loss_qty().isZero()) {
							continue;
						}
						
						if (!isSame(r.lot_no(), subR.lot_no())) {
							msgList.add(new MCMessage(r, null, MSBCL1318, r.mfg_act_no(),
									r.inpt_schd_no(), dispItm, dispGUIIndex));
							rtnFlg = false;
							break;
						}
					}
				}

				// サブロット混在チェック
				if (!r.sublot_mix_flg()) {
					for (MfgActTblReg_Upd04_DtlInptR subR : crtUpdSubL) {
						if (subR.base_unit_inpt_qty().isZero() && subR.base_unit_loss_qty().isZero() && subR.base_unit_fxd_loss_qty().isZero()) {
							continue;
						}
						
						if (!isSame(r.peg_no(), subR.peg_no())
								&& isSame(r.lot_no(), subR.lot_no())
								&& !isSame(r.sublot_no(), subR.sublot_no())) {
							msgList.add(new MCMessage(r, null, MSBCL1319, r.mfg_act_no(),
									r.inpt_schd_no(), dispItm, dispGUIIndex));
							rtnFlg = false;
							break;
						}
					}
					for (MST_INPT_ACT_R subR : dbcSubL) {
						if (subR.base_unit_inpt_qty().isZero() && subR.base_unit_loss_qty().isZero() && subR.base_unit_fxd_loss_qty().isZero()) {
							continue;
						}
						
						if (isSame(r.lot_no(), subR.lot_no())
								&& !isSame(r.sublot_no(), subR.sublot_no())) {
							msgList.add(new MCMessage(r, null, MSBCL1319, r.mfg_act_no(),
									r.inpt_schd_no(), dispItm, dispGUIIndex));
							rtnFlg = false;
							break;
						}
					}
				}
			}
			return rtnFlg;
		}
		
		/**
		 * 代替品目混在チェック
		 */
		protected boolean chkAltItmMix(MCList<MfgActTblReg_Upd04_DtlInptR> crtUpdL,
				MCList<MST_INPT_ACT_R> dbcL, MCList<MfgActTblReg_Upd04_DtlInptR> tgtL, MCMessageList msgList) {
			
			boolean rtnFlg = true;

			// 同一工程指図内の代替Ｇで上り電文の品目の混在をチェックするためのindexKey
			MCIndexKey inptKey = crtUpdL.createIndex(
					MfgActTblReg_Upd04_DtlInptR.$oper_inst_no,
					MfgActTblReg_Upd04_DtlInptR.$div_seq,
					MfgActTblReg_Upd04_DtlInptR.$alt_grp_cd,
					MfgActTblReg_Upd04_DtlInptR.$alt_grp_seq);

			// 同一工程指図内の代替Ｇでテーブルの品目の混在をチェックするためのindexKey
			MCIndexKey dbcKey = dbcL.createIndex(
					"oper_inst_no",
					MST_INPT_ACT_R.$div_seq,
					"alt_grp_cd",
					"alt_grp_seq");

			// 上り電文に対するチェック
			for (MfgActTblReg_Upd04_DtlInptR r : tgtL) {
				if (r.base_unit_inpt_qty().isZero() && r.base_unit_loss_qty().isZero() && r.base_unit_fxd_loss_qty().isZero()) {
					continue;
				}
				String dispItm = toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				String dispGUIIndex = toDispGUIIndex(r);
				
				// 上り電文から同一代替Ｇの品目を抽出
				MCList<MfgActTblReg_Upd04_DtlInptR> crtUpdSubL = crtUpdL.subList(inptKey,
						r.oper_inst_no(), r.div_seq(), r.alt_grp_cd(), r.alt_grp_seq());

				// テーブルから同一代替Ｇの品目を抽出
				MCList<MST_INPT_ACT_R> dbcSubL = dbcL.subList(dbcKey,
						r.oper_inst_no(), r.div_seq(), r.alt_grp_cd(), r.alt_grp_seq());

				// 代替Ｇ内の品目混在チェック
				for (MfgActTblReg_Upd04_DtlInptR subR : crtUpdSubL) {
					if (subR.base_unit_inpt_qty().isZero() && subR.base_unit_loss_qty().isZero() && subR.base_unit_fxd_loss_qty().isZero()) {
						continue;
					}
					if (!isSame(r.inpt_schd_no(), subR.inpt_schd_no())
							&& (!isSame(r.itm_cd(), subR.itm_cd())
									|| !isSame(r.itm_sub1(), subR.itm_sub1())
									|| !isSame(r.itm_sub2(), subR.itm_sub2())
									|| !isSame(r.itm_sub3(), subR.itm_sub3()))) {
						msgList.add(
								new MCMessage(r, null, MSBCL1032, dispItm, dispGUIIndex));
						rtnFlg = false;
						break;
					}
				}
				for (MST_INPT_ACT_R subR : dbcSubL) {
					if (subR.base_unit_inpt_qty().isZero() && subR.base_unit_loss_qty().isZero() && subR.base_unit_fxd_loss_qty().isZero()) {
						continue;
					}
					if (!isSame(r.inpt_schd_no(), subR.inpt_schd_no())
							&& (!isSame(r.itm_cd(), subR.itm_cd())
									|| !isSame(r.itm_sub1(), subR.itm_sub1())
									|| !isSame(r.itm_sub2(), subR.itm_sub2())
									|| !isSame(r.itm_sub3(), subR.itm_sub3()))) {
						msgList.add(
								new MCMessage(r, null, MSBCL1320, r.mfg_act_no(), r.inpt_schd_no(), dispItm, dispGUIIndex));
						rtnFlg = false;
						break;
					}
				}
			}
			return rtnFlg;
		}
		
		/**
		 * 投入実績を更新する
		 */
		protected void updInptAct(MCList<MfgActTblReg_Upd04_DtlInptR> regInptL) {
			MCList<MST_INPT_ACT_R> insL = MCList.create(MST_INPT_ACT_R.class);
			MCList<MST_INPT_ACT_R> updL = MCList.create(MST_INPT_ACT_R.class);
			MCList<MST_INPT_ACT_R> delL = MCList.create(MST_INPT_ACT_R.class);

			for (MfgActTblReg_Upd04_DtlInptR r : regInptL) {
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(r.inpt_act());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updL.add(r.inpt_act());
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delL.add(r.inpt_act());
				}
			}
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_INPT_ACT_R.create("T"));
				dbInsertEx("MSBCL6060_MST_INPT_ACT_I02", insL, insL_bldr);
			}
			if (!updL.isEmpty()) {
				MST_INPT_ACT_R t = MST_INPT_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				editUpdSetStInpt(updL, updL_bldr, t);
				dbUpdateKey("MSBCL6060_MST_INPT_ACT_U01", updL, updL_bldr);
			}
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_INPT_ACT_R.create("T"));
				dbDeleteKey("MSBCL6060_MST_INPT_ACT_D02", delL, delL_bldr);
			}
		}
		/**
		 * 更新時のset句の編集
		 */
		protected void editUpdSetStInpt(MCList<MST_INPT_ACT_R> updL, MCQueryApiBuilder updL_bldr, MST_INPT_ACT_R t) {
			updL_bldr.setSet(t.ver_no, t.inpt_loc_cd, t.inpt_str_ln_cd, t.quality_typ, t.stk_insp_typ, t.stk_id_typ, t.stk_bp_cd, t.stk_arrv_bp_cd, t.gd_cd, t.inpt_rsn_cd, t.lot_no, t.sublot_no, t.sno1, t.sno2, t.sno3, t.sno4, t.base_unit_inpt_qty, t.base_unit_loss_qty, t.base_unit_fxd_loss_qty, t.base_unit_cd, t.act_tm, t.ac_dt, t.bkf_ctl_flg, t.base_unit_std_qty, t.cont_qty, t.cont_loss_qty, t.cont_fxd_loss_qty, t.cont_fctr_unit_cd, t.act_cont_fctr, t.acxfr_qty, t.acxfr_rsn_cd, t.acxfr_bd_dpt_cd, t.ext_sys_cd, t.ext_inpt_act_no, t.if_auto_reg_flg, t.intr_rmrks, t.act_rpt_rmrks, t.trd_rmrks, t.sub_char1, t.sub_char2, t.sub_char3);
		}

		/**
		 * ロス実績を更新する
		 */
		protected void updLossAct(MCList<MfgActTblReg_Upd04_DtlLossR> regLossL) {
			MCList<MST_LOSS_ACT_R> insL = MCList.create(MST_LOSS_ACT_R.class);
			MCList<MST_LOSS_ACT_R> updL = MCList.create(MST_LOSS_ACT_R.class);
			MCList<MST_LOSS_ACT_R> delL = MCList.create(MST_LOSS_ACT_R.class);

			for (MfgActTblReg_Upd04_DtlLossR r : regLossL) {
				if (r.loss_act_reg_skip_flg()) {
					continue;
				}
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					insL.add(r.loss_act());
				}
				else if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					updL.add(r.loss_act());
				}
				else if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					delL.add(r.loss_act());
				}
			}
			if (!insL.isEmpty()) {
				MCQueryApiBuilder insL_bldr = MCQueryApiBuilder.create(MST_LOSS_ACT_R.create("T"));
				dbInsertEx("MSBCL6060_MST_LOSS_ACT_I01", insL, insL_bldr);
			}
			if (!updL.isEmpty()) {
				MST_LOSS_ACT_R t = MST_LOSS_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				editUpdSetStLoss(updL, updL_bldr, t);
				dbUpdateKey("MSBCL6060_MST_LOSS_ACT_U01", updL, updL_bldr);
			}
			if (!delL.isEmpty()) {
				MCQueryApiBuilder delL_bldr = MCQueryApiBuilder.create(MST_LOSS_ACT_R.create("T"));
				dbDeleteKey("MSBCL6060_MST_LOSS_ACT_D01", delL, delL_bldr);
			}
		}

		/**
		 * 更新時のset句の編集
		 */
		protected void editUpdSetStLoss(MCList<MST_LOSS_ACT_R> updL, MCQueryApiBuilder updL_bldr, MST_LOSS_ACT_R t) {
			updL_bldr.setSet(t.loss_rsn_cd, t.base_unit_qty, t.cont_qty, t.intr_rmrks, t.trd_rmrks, t.sub_char1, t.sub_char2, t.sub_char3);
		}
		
		/**
		 * 品目マスタの値をコピーする
		 */
		protected void copyMstvalue() {
			for (MfgActTblReg_Upd04_DtlInptR r :up0()) {
				if (MAC_DATA_CRUD_TYP.isDEL(r.data_crud_typ())) {
					continue;
				}
				MAM_ITM_R itmR = _cacheItm.getEx(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				r.sundry_itm_flg(itmR.sundry_itm_flg());
				r.stk_mng_typ(itmR.stk_mng_typ());
				if (!itmR.sundry_itm_flg()) {
					r.itm_nm(itmR.itm_nm());
				}
			}
		}

		/**
		 * VMI計上サービスの呼び出し
		 */
		protected void callVmiSrvUpd01(MCList<MfgActTblReg_Upd04_DtlInptR> regInptL) {
			MCList<MfgActTblReg_Upd04_DtlInptR> sundryL = MCList.create(MfgActTblReg_Upd04_DtlInptR.class); 
			MCList<MfgActTblReg_Upd04_DtlInptR> vmiCrtL = MCList.create(MfgActTblReg_Upd04_DtlInptR.class);
			MCList<MfgActTblReg_Upd04_DtlInptR> vmiUpdOrDelL = MCList.create(MfgActTblReg_Upd04_DtlInptR.class);

			for (MfgActTblReg_Upd04_DtlInptR r : regInptL) {
				if (r.sundry_itm_flg() && r.vmi_purc_flg()) {
					sundryL.add(r);
				}
				if (r.vmi_purc_flg() && !r.old_vmi_purc_flg()) {
					vmiCrtL.add(r);
				}
				else if (r.old_vmi_purc_flg()) {
					vmiUpdOrDelL.add(r);
				}
			}
			
			MAM_SUNDRY_ITM_R t = MAM_SUNDRY_ITM_R.create("T");
			MCQueryApiBuilder sundryItmL_bldr = MCQueryApiBuilder.create(t);
			sundryItmL_bldr.setSelect(t.itm_nm);
			_cacheSundryItm = new FXUCL_MCDbcCache<MAM_SUNDRY_ITM_R>(sundryItmL_bldr, sundryL,
					MfgActTblReg_Upd04_DtlInptR.$itm_cd,
					MfgActTblReg_Upd04_DtlInptR.$itm_sub1,
					MfgActTblReg_Upd04_DtlInptR.$itm_sub2,
					MfgActTblReg_Upd04_DtlInptR.$itm_sub3,
					MfgActTblReg_Upd04_DtlInptR.$sno1,
					MfgActTblReg_Upd04_DtlInptR.$sno2,
					MfgActTblReg_Upd04_DtlInptR.$sno3,
					MfgActTblReg_Upd04_DtlInptR.$sno4);

			for (MfgActTblReg_Upd04_DtlInptR r :sundryL) {
				r.itm_nm(_cacheSundryItm.getEx(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), 
						r.sno1(), r.sno2(), r.sno3(), r.sno4()).itm_nm());
			}
			
			// 更新・削除分のUpd01を先に実行（チェックは、事前にChkオペレーションで行われている）
			if (!vmiUpdOrDelL.isEmpty()) {
				MSBDL_VmiService.Vmi_Upd01 vmiUpdOrDelOpe = MSBDL_VmiService.crtVmi_Upd01();
				addAll(vmiUpdOrDelOpe.up0(), vmiUpdOrDelL, createMap_Vmi_Chk01_DtlR_MfgActTblReg_Upd04_DtlInptR());
				vmiUpdOrDelOpe.exec();
			}
			
			if (!vmiCrtL.isEmpty()) {
				// 新規の場合、本処理のロット提案の結果ＶＭＩとなることがあり、この場合は、事前のチェック処理で
				// VMIのチェック処理が呼ばれていないため、ここでチェック処理を実行する
				MSBDL_VmiService.Vmi_Chk01 vmiChkOpe = MSBDL_VmiService.crtVmi_Chk01();
				addAll(vmiChkOpe.up0(), vmiCrtL, createMap_Vmi_Chk01_DtlR_MfgActTblReg_Upd04_DtlInptR());
				MCMessageList bfrMsgL = (MCMessageList)MCMessagePool.getMessageList().clone();
				MCMessagePool.clear();
				vmiChkOpe.exec();
				for (Vmi_Chk01_DtlR vmiDownR : vmiChkOpe.down0()) {
					// 1件でもエラーがあったら終了
					if (vmiDownR.err_flg()) {
						MCAppException e = new MCAppException(msgOpeErr());
						e.addCauseMessageList(MCMessagePool.getMessageList());
						throw e;
					}
				}
				// 元に戻す
				MCMessagePool.addAll(bfrMsgL);
				
				// チェック処理から仮単価ＦＬＧと単価を受け取る
				String[] destCols = new String[]{MfgActTblReg_Upd04_DtlInptR.$vmi_interim_flg, MfgActTblReg_Upd04_DtlInptR.$vmi_upri};
				String[] srcCols = new String[]{Vmi_Chk01_DtlR.$interim_flg, Vmi_Chk01_DtlR.$trd_cur_upri};
				
				copyByPegNo(vmiCrtL, destCols, vmiChkOpe.down0(), srcCols);
				
				MSBDL_VmiService.Vmi_Upd01 vmiCrtOpe = MSBDL_VmiService.crtVmi_Upd01();
				addAll(vmiCrtOpe.up0(), vmiCrtL, createMap_Vmi_Chk01_DtlR_MfgActTblReg_Upd04_DtlInptR());
				vmiCrtOpe.exec();
			}
		}
		
		protected Map_Vmi_Chk01_DtlR_MfgActTblReg_Upd04_DtlInptR<Vmi_Chk01_DtlR,MfgActTblReg_Upd04_DtlInptR> createMap_Vmi_Chk01_DtlR_MfgActTblReg_Upd04_DtlInptR() {
			return new Map_Vmi_Chk01_DtlR_MfgActTblReg_Upd04_DtlInptR<Vmi_Chk01_DtlR, MfgActTblReg_Upd04_DtlInptR>();
		}

		public class Map_Vmi_Chk01_DtlR_MfgActTblReg_Upd04_DtlInptR<D extends Vmi_Chk01_DtlR, S extends MfgActTblReg_Upd04_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Vmi_Chk01_DtlR.$peg_no, MfgActTblReg_Upd04_DtlInptR.$peg_no);
				addColumnPathMap(Vmi_Chk01_DtlR.$purc_src_no, MfgActTblReg_Upd04_DtlInptR.$inpt_act_no);
				addColumnPathMap(Vmi_Chk01_DtlR.$purc_dt, MfgActTblReg_Upd04_DtlInptR.$act_tm);
				addColumnPathMap(Vmi_Chk01_DtlR.$ac_dt, MfgActTblReg_Upd04_DtlInptR.$ac_dt);
				addColumnPathMap(Vmi_Chk01_DtlR.$can_ac_dt, MfgActTblReg_Upd04_DtlInptR.$can_ac_dt);
				addColumnPathMap(Vmi_Chk01_DtlR.$stk_bp_cd, MfgActTblReg_Upd04_DtlInptR.$stk_bp_cd);
				addColumnPathMap(Vmi_Chk01_DtlR.$itm_cd, MfgActTblReg_Upd04_DtlInptR.$itm_cd);
				addColumnPathMap(Vmi_Chk01_DtlR.$itm_sub1, MfgActTblReg_Upd04_DtlInptR.$itm_sub1);
				addColumnPathMap(Vmi_Chk01_DtlR.$itm_sub2, MfgActTblReg_Upd04_DtlInptR.$itm_sub2);
				addColumnPathMap(Vmi_Chk01_DtlR.$itm_sub3, MfgActTblReg_Upd04_DtlInptR.$itm_sub3);
				addColumnPathMap(Vmi_Chk01_DtlR.$itm_nm, MfgActTblReg_Upd04_DtlInptR.$itm_nm);
				addColumnPathMap(Vmi_Chk01_DtlR.$trd_unit_cd, MfgActTblReg_Upd04_DtlInptR.$base_unit_cd);
				addColumnPathMap(Vmi_Chk01_DtlR.$base_unit_cd, MfgActTblReg_Upd04_DtlInptR.$base_unit_cd);
				addColumnPathMap(Vmi_Chk01_DtlR.$gd_cd, MfgActTblReg_Upd04_DtlInptR.$gd_cd);
				addColumnPathMap(Vmi_Chk01_DtlR.$sno1, MfgActTblReg_Upd04_DtlInptR.$sno1);
				addColumnPathMap(Vmi_Chk01_DtlR.$sno2, MfgActTblReg_Upd04_DtlInptR.$sno2);
				addColumnPathMap(Vmi_Chk01_DtlR.$sno3, MfgActTblReg_Upd04_DtlInptR.$sno3);
				addColumnPathMap(Vmi_Chk01_DtlR.$sno4, MfgActTblReg_Upd04_DtlInptR.$sno4);
				addColumnPathMap(Vmi_Chk01_DtlR.$loc_cd, MfgActTblReg_Upd04_DtlInptR.$inpt_loc_cd);
				addColumnPathMap(Vmi_Chk01_DtlR.$str_ln_cd, MfgActTblReg_Upd04_DtlInptR.$inpt_str_ln_cd);
				addColumnPathMap(Vmi_Chk01_DtlR.$lot_no, MfgActTblReg_Upd04_DtlInptR.$lot_no);
				addColumnPathMap(Vmi_Chk01_DtlR.$sublot_no, MfgActTblReg_Upd04_DtlInptR.$sublot_no);
				addColumnPathMap(Vmi_Chk01_DtlR.$quality_typ, MfgActTblReg_Upd04_DtlInptR.$quality_typ);
				addColumnPathMap(Vmi_Chk01_DtlR.$stk_insp_typ, MfgActTblReg_Upd04_DtlInptR.$stk_insp_typ);
				addColumnPathMap(Vmi_Chk01_DtlR.$interim_flg, MfgActTblReg_Upd04_DtlInptR.$vmi_interim_flg);
				addColumnPathMap(Vmi_Chk01_DtlR.$trd_cur_upri, MfgActTblReg_Upd04_DtlInptR.$vmi_upri);
				addColumnPathMap(Vmi_Chk01_DtlR.$trd_unit_qty, MfgActTblReg_Upd04_DtlInptR.$base_unit_sum_inpt_loss_qty);
				addColumnPathMap(Vmi_Chk01_DtlR.$base_unit_qty, MfgActTblReg_Upd04_DtlInptR.$base_unit_sum_inpt_loss_qty);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				if (src.vmi_purc_flg() && !src.old_vmi_purc_flg()) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (src.vmi_purc_flg() && src.old_vmi_purc_flg()) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				dest.purc_src_typ(MSC_PURC_SRC_TYP.INPT.value());
			}
		}

		/**
		 * 支給実績サービスの呼び出し
		 */
		protected void callProvActSrvUpd01(MCList<MfgActTblReg_Upd04_DtlInptR> regInptL) {
			MCList<MfgActTblReg_Upd04_DtlInptR> provCrtL = MCList.create(MfgActTblReg_Upd04_DtlInptR.class);
			MCList<MfgActTblReg_Upd04_DtlInptR> provUpdOrDelL = MCList.create(MfgActTblReg_Upd04_DtlInptR.class);
			MCList<MfgActTblReg_Upd04_DtlInptR> provRtnCrtL = MCList.create(MfgActTblReg_Upd04_DtlInptR.class);
			MCList<MfgActTblReg_Upd04_DtlInptR> provRtnUpdOrDelL = MCList.create(MfgActTblReg_Upd04_DtlInptR.class);
			
			for (MfgActTblReg_Upd04_DtlInptR r : regInptL) {
				if (r.prov_flg() || r.old_prov_flg()) {
					if (isProvCrt(r)) {
						provCrtL.add(r);
					}
					else {
						provUpdOrDelL.add(r);
					}
				}
				
				if (r.prov_rtn_flg() || r.old_prov_rtn_flg()) {
					if (isProvRtnCrt(r)) {
						provRtnCrtL.add(r);
					}
					else {
						provRtnUpdOrDelL.add(r);
					}
				}
			}
			
			String[] srcCols = new String[] {ProvActUpd01_DtlR.$stk_arrv_bp_cd, 
					ProvActUpd01_DtlR.$stk_id_typ, 
					ProvActUpd01_DtlR.$stk_bp_cd};
			String[] provDestCols = new String[] {MfgActTblReg_Upd04_DtlInptR.$prov_stk_arrv_bp_cd,
					MfgActTblReg_Upd04_DtlInptR.$prov_stk_id_typ, 
					MfgActTblReg_Upd04_DtlInptR.$prov_stk_bp_cd};
			String[] provRtnDestCols = new String[] {MfgActTblReg_Upd04_DtlInptR.$prov_rtn_stk_arrv_bp_cd,
					MfgActTblReg_Upd04_DtlInptR.$prov_rtn_stk_id_typ, 
					MfgActTblReg_Upd04_DtlInptR.$prov_rtn_stk_bp_cd};
			// 更新・削除分のUpd01を先に実行（チェックは、事前にChkオペレーションで行われている）
			if (!provUpdOrDelL.isEmpty() || !provRtnUpdOrDelL.isEmpty()) {
				MSBEL_ProvActService.ProvAct_Upd01 updOrDelOpe = MSBEL_ProvActService.crtProvAct_Upd01();
				addAll(updOrDelOpe.up0(), provUpdOrDelL, createMap_ProvAct());
				for (ProvActUpd01_DtlR provUpdOrDelR : updOrDelOpe.up0()) {
					if (MAC_DATA_CRUD_TYP.isUPD(provUpdOrDelR.data_crud_typ())
							&& MSC_STK_ID_TYP.isONR_PROV(provUpdOrDelR.stk_id_typ())) {
						// 有償支給在庫の場合は、自社資産を固定で返す（有償支給在庫を支給するということは、支給と支給返品が同時に発生する場合しかありえない）
						provUpdOrDelR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					}
				}
				addAll(updOrDelOpe.up0(), provRtnUpdOrDelL, createMap_ProvRtnAct());
				updOrDelOpe.exec();
				// 支給の下り電文を取得
				copyByPegNo(provUpdOrDelL, updOrDelOpe.down0(),
						MfgActTblReg_Upd04_DtlInptR.$prov_peg_no, provDestCols,
						ProvActUpd01_DtlR.$peg_no, srcCols);
				
				// 支給返品の下り電文を取得
				copyByPegNo(provRtnUpdOrDelL, updOrDelOpe.down0(),
						MfgActTblReg_Upd04_DtlInptR.$prov_rtn_peg_no, provRtnDestCols,
						ProvActUpd01_DtlR.$peg_no, srcCols);
			}
			
			// 新規分のChkを実行
			// 新規の場合、本処理のロット提案の結果、支給・支給返品となることがあり、この場合は、事前のチェック処理で
			// 支給実績のチェック処理が呼ばれていないため、ここでチェック処理を実行する
			if (!provCrtL.isEmpty() || !provRtnCrtL.isEmpty()) {
				// 支給実績のチェック処理
				MSBEL_ProvActService.ProvAct_Chk01 chkOpe = MSBEL_ProvActService.crtProvAct_Chk01();
				for (MfgActTblReg_Upd04_DtlInptR upR : provCrtL) {
					ProvActChk01_DtlR chkOpeR = ProvActChk01_DtlR.create();
					copy(chkOpeR, upR, createMap_ProvActChk01_DtlR_MfgActTblReg_Upd04_DtlInptR());
					if (MSC_STK_ID_TYP.isONR_PROV(chkOpeR.stk_id_typ())) {
						// 有償支給在庫の場合は、自社資産を固定で返す（有償支給在庫を支給するということは、支給と支給返品が同時に発生する場合しかありえない）
						chkOpeR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					}
					chkOpeR.prsppl_cd(upR.sppl_cd());
					chkOpeR.prov_typ(getProvTypForProv(upR));
					chkOpe.up0().add(chkOpeR);
				}
				for (MfgActTblReg_Upd04_DtlInptR upR : provRtnCrtL) {
					ProvActChk01_DtlR chkOpeR = ProvActChk01_DtlR.create();
					copy(chkOpeR, upR, createMap_ProvActChk01_DtlR_MfgActTblReg_Upd04_DtlInptR());
					chkOpeR.prsppl_cd(upR.inpt_loc_sppl_cd());
					chkOpeR.prov_typ(getProvTypForProvRtn(upR));
					chkOpe.up0().add(chkOpeR);
				}
				
				// サービス実行前のメッセージリストを保持しておく（支給実績サービスがaddするメッセージのみを例外に設定するため）
				MCMessageList bfrMsgL = (MCMessageList)MCMessagePool.getMessageList().clone();
				MCMessagePool.clear();
				chkOpe.exec();
				for (ProvActChk01_DtlR provDownR : chkOpe.down0()) {
					// 1件でもエラーがあったら終了
					if (provDownR.err_flg()) {
						MCAppException e = new MCAppException(msgOpeErr());
						e.addCauseMessageList(MCMessagePool.getMessageList());
						throw e;
					}
				}
				// 元に戻す
				MCMessagePool.addAll(bfrMsgL);
				
				// 新規分のUpdを実行
				MSBEL_ProvActService.ProvAct_Upd01 crtOpe = MSBEL_ProvActService.crtProvAct_Upd01();
				addAll(crtOpe.up0(), provCrtL, createMap_ProvAct());
				for (ProvActUpd01_DtlR provCrtR : crtOpe.up0()) {
					if (MSC_STK_ID_TYP.isONR_PROV(provCrtR.stk_id_typ())) {
						// 有償支給在庫の場合は、自社資産を固定で返す（有償支給在庫を支給するということは、支給と支給返品が同時に発生する場合しかありえない）
						provCrtR.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
					}
				}
				addAll(crtOpe.up0(), provRtnCrtL, createMap_ProvRtnAct());
				crtOpe.exec();

				// 支給の下り電文を取得
				copyByPegNo(provCrtL, crtOpe.down0(),
						MfgActTblReg_Upd04_DtlInptR.$prov_peg_no, provDestCols,
						ProvActUpd01_DtlR.$peg_no, srcCols);
				
				// 支給返品の下り電文を取得
				copyByPegNo(provRtnCrtL, crtOpe.down0(),
						MfgActTblReg_Upd04_DtlInptR.$prov_rtn_peg_no, provRtnDestCols,
						ProvActUpd01_DtlR.$peg_no, srcCols);
			}
		}
		
		protected boolean isProvCrt(MfgActTblReg_Upd04_DtlInptR r) {
			if (r.prov_flg() && !r.old_prov_flg()) {
				// 新規で支給実績を登録する場合
				return true;
			}
			return false;
		}
		
		protected boolean isProvRtnCrt(MfgActTblReg_Upd04_DtlInptR r) {
			if (r.prov_rtn_flg() && !r.old_prov_rtn_flg()) {
				// 新規で支給実績を登録する場合
				return true;
			}
			return false;
		}
		
		protected String getProvTypForProv(MfgActTblReg_Upd04_DtlInptR r) {
			if (MAC_PROV_BASIS_TYP.isINPT(r.prov_basis_typ())) {
				return MAC_PROV_TYP.ONR_PROV.value();
			}
			return null;
		}
		
		protected String getProvTypForProvRtn(MfgActTblReg_Upd04_DtlInptR r) {
			if (MAC_PROV_BASIS_TYP.isINPT(r.prov_basis_typ())) {
				return MAC_PROV_TYP.ONR_PROV.value();
			}
			else if (MSC_STK_ID_TYP.isONR_PROV(r.stk_id_typ())) {
				return MAC_PROV_TYP.ONR_PROV.value();
			}
			else {
				return MAC_PROV_TYP.FFR_PROV.value();
			}
		}
		
		// 支給・支給戻し（chk）
		protected Map_ProvActChk01_DtlR_MfgActTblReg_Upd04_DtlInptR<ProvActChk01_DtlR,MfgActTblReg_Upd04_DtlInptR> createMap_ProvActChk01_DtlR_MfgActTblReg_Upd04_DtlInptR() {
			return new Map_ProvActChk01_DtlR_MfgActTblReg_Upd04_DtlInptR<ProvActChk01_DtlR, MfgActTblReg_Upd04_DtlInptR>();
		}

		public class Map_ProvActChk01_DtlR_MfgActTblReg_Upd04_DtlInptR<D extends ProvActChk01_DtlR, S extends MfgActTblReg_Upd04_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvActChk01_DtlR.$data_crud_typ, MfgActTblReg_Upd04_DtlInptR.$data_crud_typ);
				addColumnPathMap(ProvActChk01_DtlR.$accpt_dt, MfgActTblReg_Upd04_DtlInptR.$act_tm);
				addColumnPathMap(ProvActChk01_DtlR.$ac_dt, MfgActTblReg_Upd04_DtlInptR.$ac_dt);
				addColumnPathMap(ProvActChk01_DtlR.$itm_cd, MfgActTblReg_Upd04_DtlInptR.$itm_cd);
				addColumnPathMap(ProvActChk01_DtlR.$itm_sub1, MfgActTblReg_Upd04_DtlInptR.$itm_sub1);
				addColumnPathMap(ProvActChk01_DtlR.$itm_sub2, MfgActTblReg_Upd04_DtlInptR.$itm_sub2);
				addColumnPathMap(ProvActChk01_DtlR.$itm_sub3, MfgActTblReg_Upd04_DtlInptR.$itm_sub3);
				addColumnPathMap(ProvActChk01_DtlR.$wg_cd, MfgActTblReg_Upd04_DtlInptR.$wg_cd);
				addColumnPathMap(ProvActChk01_DtlR.$prov_basis_typ, MfgActTblReg_Upd04_DtlInptR.$prov_basis_typ);
				addColumnPathMap(ProvActChk01_DtlR.$stk_id_typ, MfgActTblReg_Upd04_DtlInptR.$stk_id_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (src.prov_flg()) {
					dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV.value());
					dest.peg_no(src.prov_peg_no());
				}
				else {
					dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV_RTN.value());
					dest.peg_no(src.prov_rtn_peg_no());
				}
				dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.INPT.value());
				
			}
		}
		
		/**
		 * 支給の場合に支給実績サービスに渡す在庫識別区分を取得する
		 * @param dest
		 * @param src
		 * @return
		 */
		protected String getProvStkIdTyp(ProvActChk01_DtlR dest, MfgActTblReg_Upd04_DtlInptR src) {
			if (MSC_STK_ID_TYP.isONR_PROV(src.stk_id_typ())) {
				// 有償支給在庫の場合は、自社資産を固定で返す（有償支給在庫を支給するということは、支給と支給返品が同時に発生する場合しかありえない）
				return MSC_STK_ID_TYP.COSTK.value();
			}
			return src.stk_id_typ();
		}
		
		// 支給（upd）
		protected Map_ProvActUpd01_DtlR_MfgActTblReg_Upd04_DtlInptR<ProvActUpd01_DtlR,MfgActTblReg_Upd04_DtlInptR> createMap_ProvAct() {
			return new Map_ProvActUpd01_DtlR_MfgActTblReg_Upd04_DtlInptR<ProvActUpd01_DtlR, MfgActTblReg_Upd04_DtlInptR>();
		}

		public class Map_ProvActUpd01_DtlR_MfgActTblReg_Upd04_DtlInptR<D extends ProvActUpd01_DtlR, S extends MfgActTblReg_Upd04_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvActUpd01_DtlR.$peg_no, MfgActTblReg_Upd04_DtlInptR.$prov_peg_no);
				addColumnPathMap(ProvActUpd01_DtlR.$prov_src_act_no, MfgActTblReg_Upd04_DtlInptR.$inpt_act_no);
				addColumnPathMap(ProvActUpd01_DtlR.$trd_unit_cd, MfgActTblReg_Upd04_DtlInptR.$base_unit_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$base_unit_cd, MfgActTblReg_Upd04_DtlInptR.$base_unit_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$accpt_dt, MfgActTblReg_Upd04_DtlInptR.$act_tm);
				addColumnPathMap(ProvActUpd01_DtlR.$ac_dt, MfgActTblReg_Upd04_DtlInptR.$ac_dt);
				addColumnPathMap(ProvActUpd01_DtlR.$can_ac_dt, MfgActTblReg_Upd04_DtlInptR.$can_ac_dt);
				addColumnPathMap(ProvActUpd01_DtlR.$wg_cd, MfgActTblReg_Upd04_DtlInptR.$wg_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$prsppl_cd, MfgActTblReg_Upd04_DtlInptR.$sppl_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$itm_cd, MfgActTblReg_Upd04_DtlInptR.$itm_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$itm_sub1, MfgActTblReg_Upd04_DtlInptR.$itm_sub1);
				addColumnPathMap(ProvActUpd01_DtlR.$itm_sub2, MfgActTblReg_Upd04_DtlInptR.$itm_sub2);
				addColumnPathMap(ProvActUpd01_DtlR.$itm_sub3, MfgActTblReg_Upd04_DtlInptR.$itm_sub3);
				addColumnPathMap(ProvActUpd01_DtlR.$loc_cd, MfgActTblReg_Upd04_DtlInptR.$mfg_loc_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$str_ln_cd, MfgActTblReg_Upd04_DtlInptR.$mfg_str_ln_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$lot_no, MfgActTblReg_Upd04_DtlInptR.$lot_no);
				addColumnPathMap(ProvActUpd01_DtlR.$sublot_no, MfgActTblReg_Upd04_DtlInptR.$sublot_no);
				addColumnPathMap(ProvActUpd01_DtlR.$sno1, MfgActTblReg_Upd04_DtlInptR.$sno1);
				addColumnPathMap(ProvActUpd01_DtlR.$sno2, MfgActTblReg_Upd04_DtlInptR.$sno2);
				addColumnPathMap(ProvActUpd01_DtlR.$sno3, MfgActTblReg_Upd04_DtlInptR.$sno3);
				addColumnPathMap(ProvActUpd01_DtlR.$sno4, MfgActTblReg_Upd04_DtlInptR.$sno4);
				addColumnPathMap(ProvActUpd01_DtlR.$sno1_mng_typ, MfgActTblReg_Upd04_DtlInptR.$sno1_mng_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$sno2_mng_typ, MfgActTblReg_Upd04_DtlInptR.$sno2_mng_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$sno3_mng_typ, MfgActTblReg_Upd04_DtlInptR.$sno3_mng_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$sno4_mng_typ, MfgActTblReg_Upd04_DtlInptR.$sno4_mng_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$gd_cd, MfgActTblReg_Upd04_DtlInptR.$gd_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$quality_typ, MfgActTblReg_Upd04_DtlInptR.$quality_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$stk_insp_typ, MfgActTblReg_Upd04_DtlInptR.$stk_insp_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$trd_unit_qty, MfgActTblReg_Upd04_DtlInptR.$base_unit_sum_inpt_loss_qty);
				addColumnPathMap(ProvActUpd01_DtlR.$base_unit_qty, MfgActTblReg_Upd04_DtlInptR.$base_unit_sum_inpt_loss_qty);
				addColumnPathMap(ProvActUpd01_DtlR.$prov_basis_typ, MfgActTblReg_Upd04_DtlInptR.$prov_basis_typ);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				if (isProvCrt(src)) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (src.prov_flg() && src.old_prov_flg()) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}

				dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.INPT.value());
				dest.trd_cd(MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.PROV.value()));
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV.value());
				
				dest.prov_typ(getProvTypForProv(src));
				dest.stk_arrv_bp_cd(MAC_STR.NULL_VAL.value());
				if (MSC_STK_ID_TYP.isRNT_RCV(src.stk_id_typ())) {
					dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				}
				else {
					dest.stk_id_typ(src.stk_id_typ());
				}
				if (MSC_STK_ID_TYP.isNCV_RCV(src.stk_id_typ())) {
					dest.stk_bp_cd(src.stk_bp_cd());
				}
				else {
					dest.stk_bp_cd(MAC_STR.NULL_VAL.value());
				}
				dest.addBooleanColumn("alloc_flg", src.alloc_flg());
			}
		}
		// 支給戻し（upd）
		protected Map_ProvActUpd01_DtlR_MfgActTblReg_Upd04_DtlInptR2<ProvActUpd01_DtlR,MfgActTblReg_Upd04_DtlInptR> createMap_ProvRtnAct() {
			return new Map_ProvActUpd01_DtlR_MfgActTblReg_Upd04_DtlInptR2<ProvActUpd01_DtlR, MfgActTblReg_Upd04_DtlInptR>();
		}

		public class Map_ProvActUpd01_DtlR_MfgActTblReg_Upd04_DtlInptR2<D extends ProvActUpd01_DtlR, S extends MfgActTblReg_Upd04_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(ProvActUpd01_DtlR.$peg_no, MfgActTblReg_Upd04_DtlInptR.$prov_rtn_peg_no);
				addColumnPathMap(ProvActUpd01_DtlR.$prov_src_act_no, MfgActTblReg_Upd04_DtlInptR.$inpt_act_no);
				addColumnPathMap(ProvActUpd01_DtlR.$trd_unit_cd, MfgActTblReg_Upd04_DtlInptR.$base_unit_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$base_unit_cd, MfgActTblReg_Upd04_DtlInptR.$base_unit_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$accpt_dt, MfgActTblReg_Upd04_DtlInptR.$act_tm);
				addColumnPathMap(ProvActUpd01_DtlR.$ac_dt, MfgActTblReg_Upd04_DtlInptR.$ac_dt);
				addColumnPathMap(ProvActUpd01_DtlR.$can_ac_dt, MfgActTblReg_Upd04_DtlInptR.$can_ac_dt);
				addColumnPathMap(ProvActUpd01_DtlR.$wg_cd, MfgActTblReg_Upd04_DtlInptR.$wg_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$prsppl_cd, MfgActTblReg_Upd04_DtlInptR.$inpt_loc_sppl_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$itm_cd, MfgActTblReg_Upd04_DtlInptR.$itm_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$itm_sub1, MfgActTblReg_Upd04_DtlInptR.$itm_sub1);
				addColumnPathMap(ProvActUpd01_DtlR.$itm_sub2, MfgActTblReg_Upd04_DtlInptR.$itm_sub2);
				addColumnPathMap(ProvActUpd01_DtlR.$itm_sub3, MfgActTblReg_Upd04_DtlInptR.$itm_sub3);
				addColumnPathMap(ProvActUpd01_DtlR.$loc_cd, MfgActTblReg_Upd04_DtlInptR.$inpt_loc_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$str_ln_cd, MfgActTblReg_Upd04_DtlInptR.$inpt_str_ln_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$stk_arrv_bp_cd, MfgActTblReg_Upd04_DtlInptR.$stk_arrv_bp_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$lot_no, MfgActTblReg_Upd04_DtlInptR.$lot_no);
				addColumnPathMap(ProvActUpd01_DtlR.$sublot_no, MfgActTblReg_Upd04_DtlInptR.$sublot_no);
				addColumnPathMap(ProvActUpd01_DtlR.$sno1, MfgActTblReg_Upd04_DtlInptR.$sno1);
				addColumnPathMap(ProvActUpd01_DtlR.$sno2, MfgActTblReg_Upd04_DtlInptR.$sno2);
				addColumnPathMap(ProvActUpd01_DtlR.$sno3, MfgActTblReg_Upd04_DtlInptR.$sno3);
				addColumnPathMap(ProvActUpd01_DtlR.$sno4, MfgActTblReg_Upd04_DtlInptR.$sno4);
				addColumnPathMap(ProvActUpd01_DtlR.$sno1_mng_typ, MfgActTblReg_Upd04_DtlInptR.$sno1_mng_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$sno2_mng_typ, MfgActTblReg_Upd04_DtlInptR.$sno2_mng_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$sno3_mng_typ, MfgActTblReg_Upd04_DtlInptR.$sno3_mng_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$sno4_mng_typ, MfgActTblReg_Upd04_DtlInptR.$sno4_mng_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$gd_cd, MfgActTblReg_Upd04_DtlInptR.$gd_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$quality_typ, MfgActTblReg_Upd04_DtlInptR.$quality_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$stk_insp_typ, MfgActTblReg_Upd04_DtlInptR.$stk_insp_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$stk_id_typ, MfgActTblReg_Upd04_DtlInptR.$stk_id_typ);
				addColumnPathMap(ProvActUpd01_DtlR.$stk_bp_cd, MfgActTblReg_Upd04_DtlInptR.$stk_bp_cd);
				addColumnPathMap(ProvActUpd01_DtlR.$trd_unit_qty, MfgActTblReg_Upd04_DtlInptR.$base_unit_sum_inpt_loss_qty);
				addColumnPathMap(ProvActUpd01_DtlR.$base_unit_qty, MfgActTblReg_Upd04_DtlInptR.$base_unit_sum_inpt_loss_qty);
				addColumnPathMap(ProvActUpd01_DtlR.$prov_basis_typ, MfgActTblReg_Upd04_DtlInptR.$prov_basis_typ);
			}
			
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				if (isProvRtnCrt(src)) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else if (src.prov_rtn_flg() && src.old_prov_rtn_flg()) {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else {
					dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				
				dest.prov_src_act_typ(MSC_PROV_SRC_ACT_TYP.INPT.value());
				dest.trd_cd(MAUCL_TrdUtil.getDefaultTrdCd(MAC_TRD_PTN_TYP.PROV_RTN.value()));
				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.PROV_RTN.value());
				dest.prov_typ(getProvTypForProvRtn(src));
				dest.addBooleanColumn("alloc_flg", src.alloc_flg());
			}
		}
		
		/** 
		 * 受払実績ワークを作成する
		 */
		protected void callIoActSrvIns01(MCList<MfgActTblReg_Upd04_DtlInptR> regInptL,
				MCList<MfgActTblReg_Upd04_DtlLossR> regLossL) {

			MSBEL_IoActService.IoAct_Ins01 ope = MSBEL_IoActService.crtIoAct_Ins01();
			addAll(ope.up0(), regInptL, createMap_IoAct_Ins01_DtlR_MfgActTblReg_Upd04_DtlInptR());

			MCList<IoAct_Ins01_DtlR> InptIoOpeL = MCList.create(IoAct_Ins01_DtlR.class);
			InptIoOpeL.addAll(ope.up0());

			MCIndexKey ioIdxkey = InptIoOpeL.createIndex(IoAct_Ins01_DtlR.$act_d_no);
			MCIndexKey inptIdxkey = regInptL.createIndex(MfgActTblReg_Upd04_DtlInptR.$inpt_act_no);

			for (MCList<MfgActTblReg_Upd04_DtlLossR> lossGL : regLossL.groupList(
					MfgActTblReg_Upd04_DtlLossR.$inpt_act_no)) {
				IoAct_Ins01_DtlR inptRIoR = InptIoOpeL.getFirst(ioIdxkey,
						lossGL.get(0).inpt_act_no());
				MfgActTblReg_Upd04_DtlInptR inptR = regInptL.getFirst(inptIdxkey, inptRIoR.act_d_no());

				for (MfgActTblReg_Upd04_DtlLossR lossR : lossGL) {
					IoAct_Ins01_DtlR lossIoActUpR = inptRIoR.clone();

					lossIoActUpR.data_crud_typ(lossR.data_crud_typ());
					lossIoActUpR.act_d_no(lossR.loss_act_no());
					lossIoActUpR.trn_typ(MSC_TRN_TYP.LOSS.value());
					lossIoActUpR.rsn_cd(lossR.loss_rsn_cd());
					lossIoActUpR.bd_dpt_cd(null);
					lossIoActUpR.trd_unit_qty(lossR.base_unit_qty());
					lossIoActUpR.pack_unit_qty(lossR.base_unit_qty());
					lossIoActUpR.base_unit_qty(lossR.base_unit_qty());
					//在庫識別区分が自給の場合
					if (MSC_STK_ID_TYP.isSLF_SUPPRT(lossIoActUpR.stk_id_typ())) {
						MAM_TAX_R taxR =  _cacheTax.getEx(inptR.slf_support_tax_cd());
						MAM_CUR_R curR = _cacheCur.getEx(inptR.slf_support_cur_cd());
						MAM_BP_R bpR =  _cacheBp.getEx(inptR.sppl_cd());

						MCRow amtTax = MAUCL_AmtUtil.getAmtAndTax(lossIoActUpR.base_cur_upri(),
								lossR.base_unit_qty(),
								taxR.tax_rate(),
								taxR.inc_tax_flg(),
								curR.amt_dec_place(),
								bpR.prov_amt_rnd_typ(),
								bpR.prov_tax_rnd_typ());

						lossIoActUpR.trd_cur_amt(amtTax.getNumberNE("amt"));
						lossIoActUpR.trd_cur_tax_amt(amtTax.getNumberNE("tax_amt"));
						lossIoActUpR.base_cur_amt(convToBaseCur(lossIoActUpR.trd_cur_amt(), 
								inptR.slf_support_xrate(),
								getBaseCur().upri_dec_place(), 
								getCo().xrate_rnd_typ()));
						lossIoActUpR.base_cur_tax_amt(convToBaseCur(lossIoActUpR.trd_cur_tax_amt(), 
								inptR.slf_support_xrate(),
								getBaseCur().upri_dec_place(), 
								getCo().xrate_rnd_typ()));
					}

					lossIoActUpR.stktk_diff_qty(null);
					lossIoActUpR.trd_rmrks(lossR.trd_rmrks());
					ope.up0().add(lossIoActUpR);
				}
			}
			ope.exec();
		}

		protected Map_IoAct_Ins01_DtlR_MfgActTblReg_Upd04_DtlInptR<IoAct_Ins01_DtlR,MfgActTblReg_Upd04_DtlInptR> createMap_IoAct_Ins01_DtlR_MfgActTblReg_Upd04_DtlInptR() {
			return new Map_IoAct_Ins01_DtlR_MfgActTblReg_Upd04_DtlInptR<IoAct_Ins01_DtlR, MfgActTblReg_Upd04_DtlInptR>();
		}

		public class Map_IoAct_Ins01_DtlR_MfgActTblReg_Upd04_DtlInptR<D extends IoAct_Ins01_DtlR, S extends MfgActTblReg_Upd04_DtlInptR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(IoAct_Ins01_DtlR.$data_crud_typ, MfgActTblReg_Upd04_DtlInptR.$data_crud_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$ac_dt, MfgActTblReg_Upd04_DtlInptR.$ac_dt);
				addColumnPathMap(IoAct_Ins01_DtlR.$can_ac_dt, MfgActTblReg_Upd04_DtlInptR.$can_ac_dt);
				addColumnPathMap(IoAct_Ins01_DtlR.$act_tm, MfgActTblReg_Upd04_DtlInptR.$act_tm);
				addColumnPathMap(IoAct_Ins01_DtlR.$act_no, MfgActTblReg_Upd04_DtlInptR.$mfg_act_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$act_d_no, MfgActTblReg_Upd04_DtlInptR.$inpt_act_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_cd, MfgActTblReg_Upd04_DtlInptR.$trd_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$rsn_cd, MfgActTblReg_Upd04_DtlInptR.$acxfr_rsn_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$gi_wg_cd, MfgActTblReg_Upd04_DtlInptR.$wg_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$act_dpt_cd, MfgActTblReg_Upd04_DtlInptR.$act_dpt_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$bd_dpt_cd, MfgActTblReg_Upd04_DtlInptR.$acxfr_bd_dpt_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$mfg_usr_cd, MfgActTblReg_Upd04_DtlInptR.$act_usr_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_cd, MfgActTblReg_Upd04_DtlInptR.$itm_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub1, MfgActTblReg_Upd04_DtlInptR.$itm_sub1);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub2, MfgActTblReg_Upd04_DtlInptR.$itm_sub2);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_sub3, MfgActTblReg_Upd04_DtlInptR.$itm_sub3);
				addColumnPathMap(IoAct_Ins01_DtlR.$gi_loc_cd, MfgActTblReg_Upd04_DtlInptR.$mfg_loc_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$gi_str_ln_cd, MfgActTblReg_Upd04_DtlInptR.$mfg_str_ln_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$lot_no, MfgActTblReg_Upd04_DtlInptR.$lot_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$sublot_no, MfgActTblReg_Upd04_DtlInptR.$sublot_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno1, MfgActTblReg_Upd04_DtlInptR.$sno1);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno2, MfgActTblReg_Upd04_DtlInptR.$sno2);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno3, MfgActTblReg_Upd04_DtlInptR.$sno3);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno4, MfgActTblReg_Upd04_DtlInptR.$sno4);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno1_mng_typ, MfgActTblReg_Upd04_DtlInptR.$sno1_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno2_mng_typ, MfgActTblReg_Upd04_DtlInptR.$sno2_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno3_mng_typ, MfgActTblReg_Upd04_DtlInptR.$sno3_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sno4_mng_typ, MfgActTblReg_Upd04_DtlInptR.$sno4_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$gi_gd_cd, MfgActTblReg_Upd04_DtlInptR.$gd_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$rsn_cd2, MfgActTblReg_Upd04_DtlInptR.$inpt_rsn_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$quality_typ, MfgActTblReg_Upd04_DtlInptR.$quality_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$stk_insp_typ, MfgActTblReg_Upd04_DtlInptR.$stk_insp_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_qty, MfgActTblReg_Upd04_DtlInptR.$base_unit_inpt_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_unit_cd, MfgActTblReg_Upd04_DtlInptR.$base_unit_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$pack_unit_qty, MfgActTblReg_Upd04_DtlInptR.$base_unit_inpt_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$pack_unit_cd, MfgActTblReg_Upd04_DtlInptR.$base_unit_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_qty, MfgActTblReg_Upd04_DtlInptR.$base_unit_inpt_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$base_unit_cd, MfgActTblReg_Upd04_DtlInptR.$base_unit_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_cur_cd, MfgActTblReg_Upd04_DtlInptR.$slf_support_cur_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_cur_upri, MfgActTblReg_Upd04_DtlInptR.$slf_support_upri);
				addColumnPathMap(IoAct_Ins01_DtlR.$sppl_cd, MfgActTblReg_Upd04_DtlInptR.$sppl_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_mfg_inst_no, MfgActTblReg_Upd04_DtlInptR.$itm_mfg_inst_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$itm_inst_qty, MfgActTblReg_Upd04_DtlInptR.$itm_mfg_inst_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$mfg_inst_no, MfgActTblReg_Upd04_DtlInptR.$mfg_inst_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$mfg_act_no, MfgActTblReg_Upd04_DtlInptR.$mfg_act_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$mfg_st_qty, MfgActTblReg_Upd04_DtlInptR.$mfg_st_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$oper_act_no, MfgActTblReg_Upd04_DtlInptR.$oper_act_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$disp_seq, MfgActTblReg_Upd04_DtlInptR.$disp_seq);
				addColumnPathMap(IoAct_Ins01_DtlR.$oper_cd, MfgActTblReg_Upd04_DtlInptR.$oper_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$inpt_loc_cd, MfgActTblReg_Upd04_DtlInptR.$inpt_loc_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$inpt_str_ln_cd, MfgActTblReg_Upd04_DtlInptR.$inpt_str_ln_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_itm_cd, MfgActTblReg_Upd04_DtlInptR.$par_itm_cd);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_itm_sub1, MfgActTblReg_Upd04_DtlInptR.$par_itm_sub1);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_itm_sub2, MfgActTblReg_Upd04_DtlInptR.$par_itm_sub2);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_itm_sub3, MfgActTblReg_Upd04_DtlInptR.$par_itm_sub3);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_itm_nm, MfgActTblReg_Upd04_DtlInptR.$par_itm_nm);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_lot_no, MfgActTblReg_Upd04_DtlInptR.$mfg_inst_lot_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_sublot_no, MfgActTblReg_Upd04_DtlInptR.$mfg_inst_sublot_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_sno1, MfgActTblReg_Upd04_DtlInptR.$mfg_inst_sno1);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_sno2, MfgActTblReg_Upd04_DtlInptR.$mfg_inst_sno2);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_sno3, MfgActTblReg_Upd04_DtlInptR.$mfg_inst_sno3);
				addColumnPathMap(IoAct_Ins01_DtlR.$par_sno4, MfgActTblReg_Upd04_DtlInptR.$mfg_inst_sno4);
				addColumnPathMap(IoAct_Ins01_DtlR.$stktk_diff_qty, MfgActTblReg_Upd04_DtlInptR.$acxfr_qty);
				addColumnPathMap(IoAct_Ins01_DtlR.$mfg_inst_unit_typ, MfgActTblReg_Upd04_DtlInptR.$mfg_inst_unit_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$trd_rmrks, MfgActTblReg_Upd04_DtlInptR.$trd_rmrks);
				addColumnPathMap(IoAct_Ins01_DtlR.$stk_mng_typ, MfgActTblReg_Upd04_DtlInptR.$stk_mng_typ);
				addColumnPathMap(IoAct_Ins01_DtlR.$sundry_itm_flg, MfgActTblReg_Upd04_DtlInptR.$sundry_itm_flg);
				addColumnPathMap(IoAct_Ins01_DtlR.$po_no, MfgActTblReg_Upd04_DtlInptR.$po_no);
				addColumnPathMap(IoAct_Ins01_DtlR.$slo_no, MfgActTblReg_Upd04_DtlInptR.$slo_no);
			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.trd_ptn_typ(MAC_TRD_PTN_TYP.MFG.value());
				dest.trn_typ(MSC_TRN_TYP.INPT.value());
				if (MAC_DATA_CRUD_TYP.isDEL(src.data_crud_typ())) {
					return;
				}

				// 他勘定振替の場合、設定する
				dest.acxfr_stk_id_typ(src.stk_id_typ());
				dest.acxfr_stk_bp_cd(src.stk_bp_cd());
				dest.acxfr_stk_arrv_bp_cd(src.stk_arrv_bp_cd());
				
				// 支給と支給返品が同時に起きる場合、支給の在庫識別区分を優先する必要があるため、prov_flgがtrueか否かを先に判定する
				if (src.prov_flg()) {
					dest.stk_arrv_bp_cd(src.prov_stk_arrv_bp_cd());
				}
				else if (src.prov_rtn_flg()) {
					dest.stk_arrv_bp_cd(src.prov_rtn_stk_arrv_bp_cd());
				}
				else {
					dest.stk_arrv_bp_cd(src.stk_arrv_bp_cd());
				}

				dest.in_xfr_typ(MSC_IN_XFR_TYP.IN_LOC.value());
				if (src.prov_flg()) {
					dest.stk_id_typ(src.prov_stk_id_typ());
				}
				else if (src.prov_rtn_flg()) {
					dest.stk_id_typ(src.prov_rtn_stk_id_typ());
				}
				else if (src.vmi_purc_flg()) {
					dest.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
				}
				else {
					dest.stk_id_typ(src.stk_id_typ());
				}

				if (src.prov_flg()) {
					dest.stk_bp_cd(src.prov_stk_bp_cd());
				}
				else if (src.prov_rtn_flg()) {
					dest.stk_bp_cd(src.prov_rtn_stk_bp_cd());
				}
				else if (src.vmi_purc_flg()) {
					dest.stk_bp_cd(MAC_STR.NULL_VAL.value());
				}
				else {
					dest.stk_bp_cd(src.stk_bp_cd());
				}
				
				dest.par_sno1(getParSno(src.mfg_inst_sno1(), src.mfg_inst_sno1_mng_typ()));
				dest.par_sno2(getParSno(src.mfg_inst_sno2(), src.mfg_inst_sno2_mng_typ()));
				dest.par_sno3(getParSno(src.mfg_inst_sno3(), src.mfg_inst_sno3_mng_typ()));
				dest.par_sno4(getParSno(src.mfg_inst_sno4(), src.mfg_inst_sno4_mng_typ()));

				//在庫識別区分が自給の場合
				if (MSC_STK_ID_TYP.isSLF_SUPPRT(dest.stk_id_typ())) {

					MAM_TAX_R taxR =  _cacheTax.getEx(src.slf_support_tax_cd());
					MAM_CUR_R curR = _cacheCur.getEx(src.slf_support_cur_cd());
					MAM_BP_R bpR =  _cacheBp.getEx(src.sppl_cd());

					MCRow amtTax = MAUCL_AmtUtil.getAmtAndTax(src.slf_support_upri(),
							src.base_unit_inpt_qty(),
							taxR.tax_rate(),
							taxR.inc_tax_flg(),
							curR.amt_dec_place(),
							bpR.prov_amt_rnd_typ(),
							bpR.prov_tax_rnd_typ());

					dest.trd_cur_amt(amtTax.getNumberNE("amt"));
					dest.trd_cur_tax_amt(amtTax.getNumberNE("tax_amt"));
					dest.base_cur_cd(getBaseCur().cur_cd());
					dest.base_cur_upri(convToBaseCur(src.slf_support_upri(), 
							src.slf_support_xrate(),
							getBaseCur().upri_dec_place(), 
							getCo().xrate_rnd_typ()));
					dest.base_cur_amt(convToBaseCur(dest.trd_cur_amt(), 
							src.slf_support_xrate(),
							getBaseCur().upri_dec_place(), 
							getCo().xrate_rnd_typ()));
					dest.base_cur_tax_amt(convToBaseCur(dest.trd_cur_tax_amt(), 
							src.slf_support_xrate(),
							getBaseCur().upri_dec_place(), 
							getCo().xrate_rnd_typ()));
					dest.xrate_cd(src.slf_support_xrate_cd());
					dest.xrate(src.slf_support_xrate());
				}
				
				// 指図時に引当済の場合は出庫引当確認対象外ＦＬＧをオン
				dest.no_gi_alloc_flg(src.alloc_flg());
			}
		}
		
		protected void setDown() {
			down0().addAll(up0());
			down1().addAll(up4());
			down2().addAll(up5());
		}
	}
	
	protected String getParSno(String sno, String snoMngTyp) {
		if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(sno)) {
			return MAC_STR.NULL_VAL.value();
		}
		else {
			return sno;
		}
	}

	//FMCB CUSTOM END
}