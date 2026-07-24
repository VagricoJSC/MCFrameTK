package mcframe.serverMSBE.MSBEL0170;

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
import mcframe.serverMSBE.MSBEL0170.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5070.*;
import static mcframe.serverMSBE.MSBEL0170.Query.*;
import mcframe.serverMSBC.MSBCL5010.*;
import mcframe.commonCore.param.MCParam;
import java.util.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_OPStkRpl"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_OPStkRpl_MC extends MSBEL_OPStkRpl_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBEL_OPStkRpl_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srchStkRpl();
			if (isNull(_downL)) {
				return;
			}
			callSrchSvc();
			getMtdTyp();
		}
		
		@Override
		protected boolean isDelFlgCtl() {
			return true;
		}

		@Override
		protected boolean isReleaseFlgCtl() {
			return true;
		}

		/**
		 * 下り電文コンテナ
		 */
		protected MCList<Srch01_RsltR> _downL = MCList.create(Srch01_RsltR.class);

		/**
		 * 在庫補充マスタ検索
		 */
		protected void srchStkRpl() {
			MCQueryPlan sql = MSBEL0170_MAM_STK_RPL_S01();
			executeQuery(_downL, sql, up0());
		}

		/**
		 * 発注点在庫補充サービス呼出（検索）
		 */
		protected void callSrchSvc() {
			MSBEL_OPStkRplService.OPRqst_Srch01 svc = MSBEL_OPStkRplService.crtOPRqst_Srch01();
			addAll(svc.up0(), _downL, createMap_OPRqst_Srch01_CndR_Srch01_RsltR());
			svc.up0().setDate(OPRqst_Srch01_CndR.$master_dt, up0().master_dt());
			svc.up0().setDate(OPRqst_Srch01_CndR.$gr_schd_dt_to, up0().gr_schd_dt_to());
			svc.up0().setDate(OPRqst_Srch01_CndR.$gi_schd_dt_to, up0().gi_schd_dt_to());
			svc.exec();
			String[] destCols = new String[] {Srch01_RsltR.$itm_cd,
					Srch01_RsltR.$itm_sub1,
					Srch01_RsltR.$itm_sub2,
					Srch01_RsltR.$itm_sub3,
					Srch01_RsltR.$strg_loc_cd};
			String[] srcCols = new String[] {OPRqst_Srch01_RsltR.$itm_cd,
					OPRqst_Srch01_RsltR.$itm_sub1,
					OPRqst_Srch01_RsltR.$itm_sub2,
					OPRqst_Srch01_RsltR.$itm_sub3,
					OPRqst_Srch01_RsltR.$strg_loc_cd};
			MCJoinKey<MCList<OPRqst_Srch01_RsltR>> jk = _downL.join(destCols, svc.down0(),srcCols);
			join(_downL, jk, createMap_Srch01_RsltR_OPRqst_Srch01_RsltR());
			if (up0().shortage_flg()) {
				_downL.setAll(_downL.subList(r -> r.shortage_flg()));
			}
		}

		/**
		 * 発注点在庫補充サービス呼出（補充方法決定）
		 */
		protected void getMtdTyp() {
			MSBEL_OPStkRplService.OPRqst_Srch02 svc = MSBEL_OPStkRplService.crtOPRqst_Srch02();
			addAll(svc.up0(), _downL, createMap_OPRqst_Srch02_RsltR_Srch01_RsltR());
			svc.up0().setDate(OPRqst_Srch02_RsltR.$master_dt, up0().master_dt());
			svc.exec();
			editDown(svc.down0());
		}

		/**
		 * 下り電文編集
		 */
		protected void editDown (MCList<OPRqst_Srch02_RsltR> srcL) {
			String[] joinKeys = new String[]{
					OPRqst_Srch02_RsltR.$itm_cd,
					OPRqst_Srch02_RsltR.$itm_sub1,
					OPRqst_Srch02_RsltR.$itm_sub2,
					OPRqst_Srch02_RsltR.$itm_sub3,
					OPRqst_Srch02_RsltR.$strg_loc_cd};
			for (Srch01_RsltR r: _downL) {
				MCList<OPRqst_Srch02_RsltR> subL = srcL.subList(joinKeys, getVals(joinKeys, r));
				if (!isNull(subL)) {
					for (OPRqst_Srch02_RsltR subR: subL){
						Srch01_RsltR downR = r.clone();
						copy(downR, subR , createMap_Srch01_RsltR_OPRqst_Srch02_RsltR());
						setStrLnCd(downR);
						down0().add(downR);
					}
				}
				else {
					down0().add(r);
				}
			}
		}

		protected void setStrLnCd(Srch01_RsltR downR) {
			if (isNullOrNullVal(downR.rqst_loc_cd()) || isNull(downR.rqst_str_ln_cd())) {
				downR.rqst_str_ln_cd(MAC_STR.NULL_VAL.value());
			}
		}

		protected Map_OPRqst_Srch01_CndR_Srch01_RsltR<OPRqst_Srch01_CndR,Srch01_RsltR> createMap_OPRqst_Srch01_CndR_Srch01_RsltR() {
			return new Map_OPRqst_Srch01_CndR_Srch01_RsltR<OPRqst_Srch01_CndR, Srch01_RsltR>();
		}
		public class Map_OPRqst_Srch01_CndR_Srch01_RsltR<D extends OPRqst_Srch01_CndR, S extends Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(OPRqst_Srch01_CndR.$itm_cd, Srch01_RsltR.$itm_cd);
				addColumnPathMap(OPRqst_Srch01_CndR.$itm_sub1, Srch01_RsltR.$itm_sub1);
				addColumnPathMap(OPRqst_Srch01_CndR.$itm_sub2, Srch01_RsltR.$itm_sub2);
				addColumnPathMap(OPRqst_Srch01_CndR.$itm_sub3, Srch01_RsltR.$itm_sub3);
				addColumnPathMap(OPRqst_Srch01_CndR.$strg_loc_cd, Srch01_RsltR.$strg_loc_cd);
				addColumnPathMap(OPRqst_Srch01_CndR.$rord_stk_qty, Srch01_RsltR.$rord_stk_qty);
				addColumnPathMap(OPRqst_Srch01_CndR.$rord_rqst_qty, Srch01_RsltR.$rord_rqst_qty);
				addColumnPathMap(OPRqst_Srch01_CndR.$gi_schd_flg, Srch01_RsltR.$gi_schd_flg);
				addColumnPathMap(OPRqst_Srch01_CndR.$gi_loc_cd, Srch01_RsltR.$gi_loc_cd);
			}
		}

		protected Map_Srch01_RsltR_OPRqst_Srch01_RsltR<Srch01_RsltR,OPRqst_Srch01_RsltR> createMap_Srch01_RsltR_OPRqst_Srch01_RsltR() {
			return new Map_Srch01_RsltR_OPRqst_Srch01_RsltR<Srch01_RsltR, OPRqst_Srch01_RsltR>();
		}
		public class Map_Srch01_RsltR_OPRqst_Srch01_RsltR<D extends Srch01_RsltR, S extends OPRqst_Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Srch01_RsltR.$rqst_qty, OPRqst_Srch01_RsltR.$rqst_qty);
				addColumnPathMap(Srch01_RsltR.$gr_schd_qty, OPRqst_Srch01_RsltR.$gr_schd_qty);
				addColumnPathMap(Srch01_RsltR.$stk_qty, OPRqst_Srch01_RsltR.$stk_qty);
				addColumnPathMap(Srch01_RsltR.$gi_schd_qty, OPRqst_Srch01_RsltR.$gi_schd_qty);
				addColumnPathMap(Srch01_RsltR.$shortage_qty, OPRqst_Srch01_RsltR.$shortage_qty);
				addColumnPathMap(Srch01_RsltR.$gr_schd_cont_qty, OPRqst_Srch01_RsltR.$gr_schd_cont_qty);
				addColumnPathMap(Srch01_RsltR.$stk_cont_qty, OPRqst_Srch01_RsltR.$stk_cont_qty);
				addColumnPathMap(Srch01_RsltR.$gi_schd_cont_qty, OPRqst_Srch01_RsltR.$gi_schd_cont_qty);
				addColumnPathMap(Srch01_RsltR.$shortage_cont_qty, OPRqst_Srch01_RsltR.$shortage_cont_qty);
				addColumnPathMap(Srch01_RsltR.$shortage_flg, OPRqst_Srch01_RsltR.$shortage_flg);
			}
		}

		protected Map_OPRqst_Srch02_RsltR_Srch01_RsltR<OPRqst_Srch02_RsltR,Srch01_RsltR> createMap_OPRqst_Srch02_RsltR_Srch01_RsltR() {
			return new Map_OPRqst_Srch02_RsltR_Srch01_RsltR<OPRqst_Srch02_RsltR, Srch01_RsltR>();
		}
		public class Map_OPRqst_Srch02_RsltR_Srch01_RsltR<D extends OPRqst_Srch02_RsltR, S extends Srch01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(OPRqst_Srch02_RsltR.$itm_cd, Srch01_RsltR.$itm_cd);
				addColumnPathMap(OPRqst_Srch02_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub1);
				addColumnPathMap(OPRqst_Srch02_RsltR.$itm_sub2, Srch01_RsltR.$itm_sub2);
				addColumnPathMap(OPRqst_Srch02_RsltR.$itm_sub3, Srch01_RsltR.$itm_sub3);
				addColumnPathMap(OPRqst_Srch02_RsltR.$strg_loc_cd, Srch01_RsltR.$strg_loc_cd);
				addColumnPathMap(OPRqst_Srch02_RsltR.$rqst_qty, Srch01_RsltR.$rqst_qty);
				addColumnPathMap(OPRqst_Srch02_RsltR.$dec_place, Srch01_RsltR.$dec_place);
				addColumnPathMap(OPRqst_Srch02_RsltR.$rqst_loc_cd, Srch01_RsltR.$rqst_loc_cd);
				addColumnPathMap(OPRqst_Srch02_RsltR.$rqst_loc_nm, Srch01_RsltR.$rqst_loc_nm);
				addColumnPathMap(OPRqst_Srch02_RsltR.$rqst_wg_cd, Srch01_RsltR.$rqst_wg_cd);
				addColumnPathMap(OPRqst_Srch02_RsltR.$rqst_wg_nm, Srch01_RsltR.$rqst_wg_nm);
				addColumnPathMap(OPRqst_Srch02_RsltR.$rqst_str_ln_tgt_flg, Srch01_RsltR.$rqst_str_ln_tgt_flg);
				addColumnPathMap(OPRqst_Srch02_RsltR.$rqst_str_ln_cd, Srch01_RsltR.$rqst_str_ln_cd);
				addColumnPathMap(OPRqst_Srch02_RsltR.$rqst_str_ln_nm, Srch01_RsltR.$rqst_str_ln_nm);
			}
		}

		protected Map_Srch01_RsltR_OPRqst_Srch02_RsltR<Srch01_RsltR,OPRqst_Srch02_RsltR> createMap_Srch01_RsltR_OPRqst_Srch02_RsltR() {
			return new Map_Srch01_RsltR_OPRqst_Srch02_RsltR<Srch01_RsltR, OPRqst_Srch02_RsltR>();
		}
		public class Map_Srch01_RsltR_OPRqst_Srch02_RsltR<D extends Srch01_RsltR, S extends OPRqst_Srch02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {

				addColumnPathMap(Srch01_RsltR.$op_rpl_mtd_typ, OPRqst_Srch02_RsltR.$op_rpl_mtd_typ);
				addColumnPathMap(Srch01_RsltR.$mfg_loc_cd, OPRqst_Srch02_RsltR.$mfg_loc_cd);
				addColumnPathMap(Srch01_RsltR.$mfg_loc_nm, OPRqst_Srch02_RsltR.$mfg_loc_nm);
				addColumnPathMap(Srch01_RsltR.$mfg_loc_sppl_cd, OPRqst_Srch02_RsltR.$mfg_loc_sppl_cd);
				addColumnPathMap(Srch01_RsltR.$bom_ptn, OPRqst_Srch02_RsltR.$bom_ptn);
				addColumnPathMap(Srch01_RsltR.$sppl_cd, OPRqst_Srch02_RsltR.$sppl_cd);
				addColumnPathMap(Srch01_RsltR.$sppl_nm, OPRqst_Srch02_RsltR.$sppl_nm);
				addColumnPathMap(Srch01_RsltR.$maker_cd, OPRqst_Srch02_RsltR.$maker_cd);
				addColumnPathMap(Srch01_RsltR.$maker_nm, OPRqst_Srch02_RsltR.$maker_nm);
				addColumnPathMap(Srch01_RsltR.$rqst_loc_cd, OPRqst_Srch02_RsltR.$rqst_loc_cd);
				addColumnPathMap(Srch01_RsltR.$rqst_loc_nm, OPRqst_Srch02_RsltR.$rqst_loc_nm);
				addColumnPathMap(Srch01_RsltR.$rqst_qty, OPRqst_Srch02_RsltR.$rqst_qty);
				addColumnPathMap(Srch01_RsltR.$rqst_wg_cd, OPRqst_Srch02_RsltR.$rqst_wg_cd);
				addColumnPathMap(Srch01_RsltR.$rqst_wg_nm, OPRqst_Srch02_RsltR.$rqst_wg_nm);
				addColumnPathMap(Srch01_RsltR.$rqst_str_ln_tgt_flg, OPRqst_Srch02_RsltR.$rqst_str_ln_tgt_flg);
				addColumnPathMap(Srch01_RsltR.$rqst_str_ln_cd, OPRqst_Srch02_RsltR.$rqst_str_ln_cd);
				addColumnPathMap(Srch01_RsltR.$rqst_str_ln_nm, OPRqst_Srch02_RsltR.$rqst_str_ln_nm);
			}
		}
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 */
	public class Sprt01 extends MSBEL_OPStkRpl_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			editUp();
			callOrdRegSvcSprt3();
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			setPegNo(Sprt01_RsltR.$peg_no, up0());
		}

		/**
		 * 予定日計算
		 * オーダ更新サービスの予定日補完処理を呼び出す
		 */
		protected void callOrdRegSvcSprt3(){
			// 上り電文編集
			MCList<Sprt01_RsltR> upL = MCList.create(Sprt01_RsltR.class);
			for (Sprt01_RsltR upR: up0()) {
				if (isNullOr(upR.master_dt(), upR.op_rpl_mtd_typ(), upR.strg_loc_cd())){
					continue;
				}
				if ((isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.MFG.value()) ||
					 isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.OUTSRC.value())) && isNull(upR.mfg_loc_cd()) ||
					isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.PURC.value()) && isNull(upR.sppl_cd()) ||
					isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.XFR.value()) && isNull(upR.rqst_loc_cd())) {
					continue;
				}
				if (isNull(upR.mfg_loc_cd())) {
					upR.mfg_loc_cd(MAC_STR.NULL_VAL.value());
				}
				if (isNull(upR.bom_ptn())) {
					upR.bom_ptn(MAC_STR.NULL_VAL.value());
				}
				if (isNull(upR.sppl_cd())) {
					upR.sppl_cd(MAC_STR.NULL_VAL.value());
				}
				if (isNull(upR.maker_cd())) {
					upR.maker_cd(MAC_STR.NULL_VAL.value());
				}
				if (isNull(upR.rqst_loc_cd())) {
					upR.rqst_loc_cd(MAC_STR.NULL_VAL.value());
				}
				if (isNullAnd(upR.st_schd_dt(), upR.end_schd_dt())) {
					upR.st_schd_dt(getToday());
				}
				else if (!isNullOr(upR.st_schd_dt(), upR.end_schd_dt())) {
					upR.end_schd_dt(null);
				}
				upL.add(upR);
			}
			// 予定日計算サービスを呼び出す
			MSBCL_OrdRegService.Ord_Sprt03 svc = MSBCL_OrdRegService.crtOrd_Sprt03();
			addAll(svc.up0(), upL, createMap_Ord_Sprt03_DtlR_Sprt01_RsltR());
			svc.exec();
			// 下り電文編集
			down0().setAll(up0());
			MCJoinKey<MCList<Ord_Sprt03_RsltR>> jk = down0().join(Sprt01_RsltR.$peg_no , svc.down0() , Ord_Sprt03_RsltR.$peg_no);
			join(down0(), jk, createMap_Sprt01_RsltR_Ord_Sprt03_RsltR());
		}

		/**
		 * オーダ区分判断
		 */
		protected String getOrdTyp(Sprt01_RsltR upR){
			if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.MFG.value())) {
				return MSC_ITM_ORD_TYP.MFG.value();
			}
			if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.PURC.value())) {
				return MSC_ITM_ORD_TYP.PURC.value();
			}
			if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.OUTSRC.value())) {
				return MSC_ITM_ORD_TYP.OUTSRC.value();
			}
			if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.XFR.value())) {
				return MSC_ITM_ORD_TYP.XFR.value();
			}
			return null;
		}

		/**
		 * 発注予定日
		 */
		protected MCDate getPoSchdDt(Sprt01_RsltR upR) {
			if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.PURC.value()) ||
					isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.OUTSRC.value())) {
				return upR.st_schd_dt();
			}
			return null;
		}

		/**
		 * 出庫予定日
		 */
		protected MCDate getGiSchdDt(Sprt01_RsltR upR){
			if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.XFR.value())) {
				return upR.st_schd_dt();
			}
			return null;
		}

		/**
		 * 製造着手予定日
		 */
		protected MCDate getMfgStSchdDt(Sprt01_RsltR upR){
			if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.MFG.value())) {
				return upR.st_schd_dt();
			}
			return null;
		}

		/**
		 * 製造終了予定日
		 */
		protected MCDate getMfgEndSchdDt(Sprt01_RsltR upR){
			return null;
		}

		/**
		 * 格納完了予定日
		 */
		protected MCDate getStrgSchdDt(Sprt01_RsltR upR){
			if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.XFR.value())) {
						return upR.end_schd_dt();
			}
			return null;
		}

		/**
		 * 検収予定日
		 */
		protected MCDate getAccptSchdDt(Sprt01_RsltR upR){
			if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.PURC.value()) ||
					isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.OUTSRC.value())) {
				return upR.end_schd_dt();
			}
			return null;
		}

		/**
		 * 検査着手予定日
		 */
		protected MCDate getInspStSchdDt(Sprt01_RsltR upR){
			return null;
		}

		/**
		 * 検査終了予定日
		 */
		protected MCDate getInspEndSchdDt(Sprt01_RsltR upR){
			return null;
		}

		/**
		 * 使用可能予定日
		 */
		protected MCDate getAvlSchdDt(Sprt01_RsltR upR){
			if (isSame(upR.op_rpl_mtd_typ(), MSC_OP_RPL_MTD_TYP.MFG.value())) {
				return upR.end_schd_dt();
			}
			return null;
		}

		protected Map_Ord_Sprt03_DtlR_Sprt01_RsltR<Ord_Sprt03_DtlR,Sprt01_RsltR> createMap_Ord_Sprt03_DtlR_Sprt01_RsltR() {
			return new Map_Ord_Sprt03_DtlR_Sprt01_RsltR<Ord_Sprt03_DtlR, Sprt01_RsltR>();
		}

		public class Map_Ord_Sprt03_DtlR_Sprt01_RsltR<D extends Ord_Sprt03_DtlR, S extends Sprt01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Ord_Sprt03_DtlR.$peg_no, Sprt01_RsltR.$peg_no);
				addColumnPathMap(Ord_Sprt03_DtlR.$master_dt, Sprt01_RsltR.$master_dt);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_cd, Sprt01_RsltR.$itm_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub1, Sprt01_RsltR.$itm_sub1);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub2, Sprt01_RsltR.$itm_sub2);
				addColumnPathMap(Ord_Sprt03_DtlR.$itm_sub3, Sprt01_RsltR.$itm_sub3);
				addColumnPathMap(Ord_Sprt03_DtlR.$mfg_loc_cd, Sprt01_RsltR.$mfg_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$sppl_cd, Sprt01_RsltR.$sppl_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$maker_cd, Sprt01_RsltR.$maker_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$rqst_loc_cd, Sprt01_RsltR.$rqst_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$bom_ptn, Sprt01_RsltR.$bom_ptn);
				addColumnPathMap(Ord_Sprt03_DtlR.$strg_loc_cd, Sprt01_RsltR.$strg_loc_cd);
				addColumnPathMap(Ord_Sprt03_DtlR.$inst_qty, Sprt01_RsltR.$rqst_qty);

			}
			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.itm_ord_typ(getOrdTyp(src));
				dest.po_schd_dt(getPoSchdDt(src));
				dest.gi_schd_dt(getGiSchdDt(src));
				dest.mfg_st_schd_dt(getMfgStSchdDt(src));
				dest.mfg_end_schd_dt(getMfgEndSchdDt(src));
				dest.strg_schd_dt(getStrgSchdDt(src));
				dest.accpt_schd_dt(getAccptSchdDt(src));
				dest.insp_st_schd_dt(getInspStSchdDt(src));
				dest.insp_end_schd_dt(getInspEndSchdDt(src));
				dest.avl_schd_dt(getAvlSchdDt(src));
			}
		}

		protected void setStSchdDt(Sprt01_RsltR dest, Ord_Sprt03_RsltR src) {
			if (!isNull(dest.st_schd_dt())) {
				return;
			}
			dest.st_schd_dt(nvl(src.po_schd_dt(),
					nvl(src.gi_schd_dt(),
							src.mfg_st_schd_dt())));
		}
		protected void setEndSchdDt(Sprt01_RsltR dest, Ord_Sprt03_RsltR src) {
			if (!isNull(dest.end_schd_dt())) {
				return;
			}
			dest.end_schd_dt(nvl(src.avl_schd_dt(),
					nvl(src.insp_end_schd_dt(),
							nvl(src.accpt_schd_dt(),
									nvl(src.strg_schd_dt(),
											src.mfg_end_schd_dt())))));
		}

		protected Map_Sprt01_RsltR_Ord_Sprt03_RsltR<Sprt01_RsltR,Ord_Sprt03_RsltR> createMap_Sprt01_RsltR_Ord_Sprt03_RsltR() {
			return new Map_Sprt01_RsltR_Ord_Sprt03_RsltR<Sprt01_RsltR, Ord_Sprt03_RsltR>();
		}
		public class Map_Sprt01_RsltR_Ord_Sprt03_RsltR<D extends Sprt01_RsltR, S extends Ord_Sprt03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void valueCopy(D dest, S src) {
				setStSchdDt(dest, src);
				setEndSchdDt(dest, src);
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 */
	public class Chk01 extends MSBEL_OPStkRpl_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();
			setErrToRtnStsTyp();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(checkWgLoc());
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			
			callOPStkRplSvc();
			
			return msgL;
		}

		/**
		 * DACチェック
		 */
		protected MCMessageList checkWgLoc() {
			MCMessageList msgL = new MCMessageList();

			for (Chk01_RsltR chkR: up0()) {
				msgL.addAll(checkWritableLocCdDac(chkR, Chk01_RsltR.$strg_loc_cd));
			}
			return msgL;
		}

		/**
		 * 発注点在庫補充サービス（更新前チェック）
		 */
		protected void callOPStkRplSvc() {
			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if(notErrL.isEmpty()) {
				return;
			}
			
			MSBEL_OPStkRplService.OPRqst_Chk01 svc = MSBEL_OPStkRplService.crtOPRqst_Chk01();
			addAll( svc.up0(), notErrL, createMap_OPRqst_Chk01_RsltR_Chk01_RsltR());
			svc.exec();
			String[] destCols = new String[] {
					Chk01_RsltR.$asset_mng_typ, Chk01_RsltR.$unit_cd,
					Chk01_RsltR.$ver_flg, Chk01_RsltR.$strg_wg_cd,
					Chk01_RsltR.$strg_site_cd, Chk01_RsltR.$rqst_wg_cd,
					Chk01_RsltR.$bom_ptn, Chk01_RsltR.$mfg_loc_cd, Chk01_RsltR.$sppl_cd,
					Chk01_RsltR.$maker_cd, Chk01_RsltR.$rqst_loc_cd, Chk01_RsltR.$sno1,
					Chk01_RsltR.$sno2, Chk01_RsltR.$sno3, Chk01_RsltR.$sno4,
					Chk01_RsltR.$err_flg
			};
			String[] srcCols = new String[] {
					OPRqst_Chk01_RsltR.$asset_mng_typ, OPRqst_Chk01_RsltR.$unit_cd,
					OPRqst_Chk01_RsltR.$ver_flg, OPRqst_Chk01_RsltR.$strg_wg_cd,
					OPRqst_Chk01_RsltR.$strg_site_cd, OPRqst_Chk01_RsltR.$rqst_wg_cd,
					OPRqst_Chk01_RsltR.$bom_ptn, OPRqst_Chk01_RsltR.$mfg_loc_cd,
					OPRqst_Chk01_RsltR.$sppl_cd, OPRqst_Chk01_RsltR.$maker_cd,
					OPRqst_Chk01_RsltR.$rqst_loc_cd, OPRqst_Chk01_RsltR.$sno1,
					OPRqst_Chk01_RsltR.$sno2, OPRqst_Chk01_RsltR.$sno3,
					OPRqst_Chk01_RsltR.$sno4, OPRqst_Chk01_RsltR.$err_flg
			};
			copyByPegNo(up0(), destCols, svc.down0(), srcCols);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 */
	public class Ins01 extends MSBEL_OPStkRpl_MC_A.Ins01 {
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0());
			}
			catch (Exception e) {
				handleEx(e, up0());
			}
			finally {
				setDown();
			}
		}
		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callRegSvc(notErrL);
			}
		}

		/**
		 * 前処理
		 */
		protected void editUp(){
			setPegNo(Chk01_RsltR.$peg_no, up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 更新前チェック
		 */
		protected void callThisChk01() {
			MSBEL_OPStkRpl.Chk01 ope = MSBEL_OPStkRpl.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 登録処理
		 *
		 * @param notErrL
		 */
		protected void callRegSvc(MCList<Chk01_RsltR> notErrL) {
			MSBEL_OPStkRplService.OPRqst_Ins01 svc = MSBEL_OPStkRplService.crtOPRqst_Ins01();
			addAll( svc.up0(), notErrL, createMap_OPRqst_Chk01_RsltR_Chk01_RsltR());
			svc.exec();
			copyErrFlg(up0(), svc.down0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@SuppressWarnings("unchecked")
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();

			List<MCList<Chk01_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_RsltR> up0L = ((MCList<Chk01_RsltR>)ope.up(0));
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 上り電文分割
		 */
		protected List<MCList<Chk01_RsltR>> splitUp(MCList<Chk01_RsltR> list, int max) {
			List<MCList<Chk01_RsltR>> ret = new ArrayList<>();

			MCList<Chk01_RsltR>[] grpL = list.groupList(Chk01_RsltR.$itm_cd,
					Chk01_RsltR.$itm_sub1,
					Chk01_RsltR.$itm_sub2,
					Chk01_RsltR.$itm_sub3,
					Chk01_RsltR.$strg_loc_cd);
			MCList<Chk01_RsltR> tmp = MCList.create(Chk01_RsltR.class);
			for (MCList<Chk01_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk01_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}
	}

	//-----------------------共通メソッド--------------------------
	protected void handleSuccess(MCList<Chk01_RsltR> l) {
		dbTran().commit();
		for (Chk01_RsltR r : l) {
			if (r.err_flg()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
			else {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
	}

	protected <R extends MCRow> void handleEx(Exception e, MCList<R> l) {
		dbTran().rollback();
		MCException mcex;
		if (e instanceof MCException) {
			mcex = (MCException)e;
		}
		else {
			mcex = new MCException(e);
		}
		MCLog.write(mcex);
		MCMessage msg = mcex.getMCMessage();
		MCMessagePool.add(msg);
		MCMessagePool.addAll(mcex.getCauseMessageList());
		for (MCRow r : l) {
			r.setString(Chk01_RsltR.$rtn_sts_typ, MAC_RTN_STS_TYP.ERR.value());
		}
	}

	protected Map_OPRqst_Chk01_RsltR_Chk01_RsltR<OPRqst_Chk01_RsltR,Chk01_RsltR> createMap_OPRqst_Chk01_RsltR_Chk01_RsltR() {
		return new Map_OPRqst_Chk01_RsltR_Chk01_RsltR<OPRqst_Chk01_RsltR, Chk01_RsltR>();
	}
	public class Map_OPRqst_Chk01_RsltR_Chk01_RsltR<D extends OPRqst_Chk01_RsltR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(OPRqst_Chk01_RsltR.$peg_no, Chk01_RsltR.$peg_no);
			addColumnPathMap(OPRqst_Chk01_RsltR.$master_dt, Chk01_RsltR.$master_dt);
			addColumnPathMap(OPRqst_Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_cd);
			addColumnPathMap(OPRqst_Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub1);
			addColumnPathMap(OPRqst_Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub2);
			addColumnPathMap(OPRqst_Chk01_RsltR.$itm_sub3, Chk01_RsltR.$itm_sub3);
			addColumnPathMap(OPRqst_Chk01_RsltR.$asset_mng_typ, Chk01_RsltR.$asset_mng_typ);
			addColumnPathMap(OPRqst_Chk01_RsltR.$unit_cd, Chk01_RsltR.$unit_cd);
			addColumnPathMap(OPRqst_Chk01_RsltR.$ver_flg, Chk01_RsltR.$ver_flg);
			addColumnPathMap(OPRqst_Chk01_RsltR.$bom_ptn, Chk01_RsltR.$bom_ptn);
			addColumnPathMap(OPRqst_Chk01_RsltR.$strg_loc_cd, Chk01_RsltR.$strg_loc_cd);
			addColumnPathMap(OPRqst_Chk01_RsltR.$strg_wg_cd, Chk01_RsltR.$strg_wg_cd);
			addColumnPathMap(OPRqst_Chk01_RsltR.$strg_site_cd, Chk01_RsltR.$strg_site_cd);
			addColumnPathMap(OPRqst_Chk01_RsltR.$op_rpl_mtd_typ, Chk01_RsltR.$op_rpl_mtd_typ);
			addColumnPathMap(OPRqst_Chk01_RsltR.$mfg_loc_cd, Chk01_RsltR.$mfg_loc_cd);
			addColumnPathMap(OPRqst_Chk01_RsltR.$sppl_cd, Chk01_RsltR.$sppl_cd);
			addColumnPathMap(OPRqst_Chk01_RsltR.$maker_cd, Chk01_RsltR.$maker_cd);
			addColumnPathMap(OPRqst_Chk01_RsltR.$rqst_loc_cd, Chk01_RsltR.$rqst_loc_cd);
			addColumnPathMap(OPRqst_Chk01_RsltR.$rqst_str_ln_cd , Chk01_RsltR.$rqst_str_ln_cd);
			addColumnPathMap(OPRqst_Chk01_RsltR.$rqst_wg_cd, Chk01_RsltR.$rqst_wg_cd);
			addColumnPathMap(OPRqst_Chk01_RsltR.$rqst_qty, Chk01_RsltR.$rqst_qty);
			addColumnPathMap(OPRqst_Chk01_RsltR.$st_schd_dt, Chk01_RsltR.$st_schd_dt);
			addColumnPathMap(OPRqst_Chk01_RsltR.$end_schd_dt, Chk01_RsltR.$end_schd_dt);
			addColumnPathMap(OPRqst_Chk01_RsltR.$ver_no, Chk01_RsltR.$ver_no);
			addColumnPathMap(OPRqst_Chk01_RsltR.$sno1, Chk01_RsltR.$sno1);
			addColumnPathMap(OPRqst_Chk01_RsltR.$sno2, Chk01_RsltR.$sno2);
			addColumnPathMap(OPRqst_Chk01_RsltR.$sno3, Chk01_RsltR.$sno3);
			addColumnPathMap(OPRqst_Chk01_RsltR.$sno4, Chk01_RsltR.$sno4);
			addColumnPathMap(OPRqst_Chk01_RsltR.$inst_po_cnt_rmrks, Chk01_RsltR.$inst_po_cnt_rmrks);
			addColumnPathMap(OPRqst_Chk01_RsltR.$err_flg, Chk01_RsltR.$err_flg);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			dest.screen_crct_flg(true);
		}
	}

	protected Comparable[] getVals(String[] keys, MCRow cndR) {
		Comparable[] vals = new Comparable[keys.length];
		for (int i = 0; i < vals.length; i++) {
			vals[i] = cndR.getValueNE(keys[i]);
		}
		return vals;
	}

	//FMCB CUSTOM END
}