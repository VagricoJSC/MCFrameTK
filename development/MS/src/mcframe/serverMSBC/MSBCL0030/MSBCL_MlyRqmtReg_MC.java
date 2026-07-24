package mcframe.serverMSBC.MSBCL0030;

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
import mcframe.serverMSBC.MSBCL0030.*; // このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBC.MSBCL0030.Query.*;
import mcframe.serverMSBC.MSBCL5070.*;
import mcframe.serverMSBC.MSBCL5080.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MlyRqmtReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MlyRqmtReg_MC extends MSBCL_MlyRqmtReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 * 
	 * 月次生産依頼を検索する。
	 */
	public class Srch01 extends MSBCL_MlyRqmtReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			MCQueryPlan sql = MSBCL0030_MST_MLY_RQMT_S01();
			searchForDL(sql, up0(), down0());
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 月次生産依頼を登録・訂正するためのチェックを行う。
	 */
	public class Chk01 extends MSBCL_MlyRqmtReg_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			MCList<Chk01_RsltR> notErrL = getChkList(up0());
			if (!notErrL.isEmpty()) {
				callMlyRqmtChkSrv(notErrL);
			}
			
			setErrToRtnStsTyp();
			
			setDown();
		}

		/** 月次生産依頼登録前チェックサービスを実行する */
		protected void callMlyRqmtChkSrv(MCList<Chk01_RsltR> noErrL) {
			MSBCL_MlyRqmtRegService.MlyRqmtReg_Chk01 ope = MSBCL_MlyRqmtRegService.crtMlyRqmtReg_Chk01();
			addAll(ope.up0(), noErrL, createMap_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR());
			ope.up1().file_imp_flg(up1().file_imp_flg());

			ope.exec();
			
			MCIndexKey idxkey = ope.down0().createIndex(MlyRqmtReg_Chk01_RsltR.$peg_no);
			MCJoinKey<MCList<MlyRqmtReg_Chk01_RsltR>> joinkey = 
					noErrL.join(Chk01_RsltR.$peg_no, ope.down0(), idxkey);
			join(noErrL, joinkey, createMap_Chk01_RsltR_MlyRqmtReg_Chk01_RsltR());
			
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/** Chk01_RsltR → MlyRqmtReg_Chk01_RsltR (Chk01 → MlyRqmtReg_Chk01) */
		protected Map_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR<MlyRqmtReg_Chk01_RsltR, Chk01_RsltR> createMap_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR() {
			return new Map_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR<MlyRqmtReg_Chk01_RsltR, Chk01_RsltR>();
		}

		/** Chk01_RsltR → MlyRqmtReg_Chk01_RsltR (Chk01 → MlyRqmtReg_Chk01) */
		public class Map_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR<D extends MlyRqmtReg_Chk01_RsltR, S extends Chk01_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$data_crud_typ, Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$err_flg, Chk01_RsltR.$err_flg);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$ym, Chk01_RsltR.$ym);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$prod_ym, Chk01_RsltR.$prod_ym);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$mps_grp_cd, Chk01_RsltR.$mps_grp_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$strg_loc_cd, Chk01_RsltR.$strg_loc_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$mfg_loc_cd, Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$sppl_cd, Chk01_RsltR.$sppl_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$rqst_loc_cd, Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$wg_cd, Chk01_RsltR.$wg_cd);
				
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$qty, Chk01_RsltR.$qty);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$intr_rmrks, Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$sub_char1, Chk01_RsltR.$sub_char1);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$sub_char2, Chk01_RsltR.$sub_char2);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$sub_char3, Chk01_RsltR.$sub_char3);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$upd_cntr, Chk01_RsltR.$upd_cntr);
				
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$ym_key, Chk01_RsltR.$ym_key);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$prod_ym_key, Chk01_RsltR.$prod_ym_key);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$mps_grp_cd_key, Chk01_RsltR.$mps_grp_cd_key);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_cd_key, Chk01_RsltR.$itm_cd_key);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub1_key, Chk01_RsltR.$itm_sub1_key);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub2_key, Chk01_RsltR.$itm_sub2_key);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub3_key, Chk01_RsltR.$itm_sub3_key);
			}
		}
				
		/** MlyRqmtReg_Chk01_RsltR → Chk01_RsltR (MlyRqmtReg_Chk01 → Chk01) */
		protected Map_Chk01_RsltR_MlyRqmtReg_Chk01_RsltR<Chk01_RsltR, MlyRqmtReg_Chk01_RsltR> createMap_Chk01_RsltR_MlyRqmtReg_Chk01_RsltR() {
			return new Map_Chk01_RsltR_MlyRqmtReg_Chk01_RsltR<Chk01_RsltR, MlyRqmtReg_Chk01_RsltR>();
		}

		/** MlyRqmtReg_Chk01_RsltR → Chk01_RsltR (MlyRqmtReg_Chk01 → Chk01) */
		public class Map_Chk01_RsltR_MlyRqmtReg_Chk01_RsltR<D extends Chk01_RsltR, S extends MlyRqmtReg_Chk01_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_RsltR.$peg_no, MlyRqmtReg_Chk01_RsltR.$peg_no);
				addColumnPathMap(Chk01_RsltR.$err_flg, MlyRqmtReg_Chk01_RsltR.$err_flg);
				addColumnPathMap(Chk01_RsltR.$rtn_sts_typ, MlyRqmtReg_Chk01_RsltR.$rtn_sts_typ);
				addColumnPathMap(Chk01_RsltR.$data_crud_typ, MlyRqmtReg_Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(Chk01_RsltR.$ym, MlyRqmtReg_Chk01_RsltR.$ym);
				addColumnPathMap(Chk01_RsltR.$itm_cd, MlyRqmtReg_Chk01_RsltR.$itm_cd);
				addColumnPathMap(Chk01_RsltR.$itm_sub1, MlyRqmtReg_Chk01_RsltR.$itm_sub1);
				addColumnPathMap(Chk01_RsltR.$itm_sub2, MlyRqmtReg_Chk01_RsltR.$itm_sub2);
				addColumnPathMap(Chk01_RsltR.$itm_sub3, MlyRqmtReg_Chk01_RsltR.$itm_sub3);
				addColumnPathMap(Chk01_RsltR.$mps_grp_cd, MlyRqmtReg_Chk01_RsltR.$mps_grp_cd);
				addColumnPathMap(Chk01_RsltR.$strg_loc_cd, MlyRqmtReg_Chk01_RsltR.$strg_loc_cd);
				addColumnPathMap(Chk01_RsltR.$mfg_loc_cd, MlyRqmtReg_Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(Chk01_RsltR.$sppl_cd, MlyRqmtReg_Chk01_RsltR.$sppl_cd);
				addColumnPathMap(Chk01_RsltR.$rqst_loc_cd, MlyRqmtReg_Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(Chk01_RsltR.$prod_ym, MlyRqmtReg_Chk01_RsltR.$prod_ym);
				addColumnPathMap(Chk01_RsltR.$qty, MlyRqmtReg_Chk01_RsltR.$qty);
				addColumnPathMap(Chk01_RsltR.$unit_cd, MlyRqmtReg_Chk01_RsltR.$unit_cd);
				addColumnPathMap(Chk01_RsltR.$dec_place, MlyRqmtReg_Chk01_RsltR.$dec_place);
				addColumnPathMap(Chk01_RsltR.$wg_cd, MlyRqmtReg_Chk01_RsltR.$wg_cd);
				addColumnPathMap(Chk01_RsltR.$intr_rmrks, MlyRqmtReg_Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(Chk01_RsltR.$sub_char1, MlyRqmtReg_Chk01_RsltR.$sub_char1);
				addColumnPathMap(Chk01_RsltR.$sub_char2, MlyRqmtReg_Chk01_RsltR.$sub_char2);
				addColumnPathMap(Chk01_RsltR.$sub_char3, MlyRqmtReg_Chk01_RsltR.$sub_char3);
				addColumnPathMap(Chk01_RsltR.$upd_cntr, MlyRqmtReg_Chk01_RsltR.$upd_cntr);
				
				addColumnPathMap(Chk01_RsltR.$itm_nm, MlyRqmtReg_Chk01_RsltR.$itm_nm);
				addColumnPathMap(Chk01_RsltR.$unit_nm, MlyRqmtReg_Chk01_RsltR.$unit_nm);
				addColumnPathMap(Chk01_RsltR.$wg_nm, MlyRqmtReg_Chk01_RsltR.$wg_nm);
				addColumnPathMap(Chk01_RsltR.$mps_grp_nm, MlyRqmtReg_Chk01_RsltR.$mps_grp_nm);
				addColumnPathMap(Chk01_RsltR.$strg_loc_nm, MlyRqmtReg_Chk01_RsltR.$strg_loc_nm);
				addColumnPathMap(Chk01_RsltR.$mfg_loc_nm, MlyRqmtReg_Chk01_RsltR.$mfg_loc_nm);
				addColumnPathMap(Chk01_RsltR.$sppl_nm, MlyRqmtReg_Chk01_RsltR.$sppl_nm);
				addColumnPathMap(Chk01_RsltR.$rqst_loc_nm, MlyRqmtReg_Chk01_RsltR.$rqst_loc_nm);
				addColumnPathMap(Chk01_RsltR.$site_cd, MlyRqmtReg_Chk01_RsltR.$site_cd);
				addColumnPathMap(Chk01_RsltR.$site_nm, MlyRqmtReg_Chk01_RsltR.$site_nm);
				addColumnPathMap(Chk01_RsltR.$strg_loc_grp_cd, MlyRqmtReg_Chk01_RsltR.$strg_loc_grp_cd);
				addColumnPathMap(Chk01_RsltR.$strg_loc_grp_nm, MlyRqmtReg_Chk01_RsltR.$strg_loc_grp_nm);
			}
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 月次生産依頼を取り消すためのチェックを行う。
	 */
	public class Chk02 extends MSBCL_MlyRqmtReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			
			MCList<Chk02_RsltR> notErrL = getChkList(up0());
			if (notErrL.size() != 0) {
				callMlyRqmtChkSrv(notErrL);
			}
			setDown();
		}

		protected void callMlyRqmtChkSrv(MCList<Chk02_RsltR> noErrL) {
			MSBCL_MlyRqmtRegService.MlyRqmtReg_Chk01 ope = MSBCL_MlyRqmtRegService.crtMlyRqmtReg_Chk01();
			addAll(ope.up0(), noErrL, createMap_MlyRqmtReg_Chk01_RsltR_Chk02_RsltR());
			ope.exec();
			
			MCIndexKey idxkey = ope.down0().createIndex(MlyRqmtReg_Chk01_RsltR.$peg_no);
			MCJoinKey<MCList<MlyRqmtReg_Chk01_RsltR>> joinkey = 
					noErrL.join(Chk02_RsltR.$peg_no, ope.down0(), idxkey);
			join(noErrL, joinkey, createMap_Chk02_RsltR_MlyRqmtReg_Chk01_RsltR());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		protected Map_MlyRqmtReg_Chk01_RsltR_Chk02_RsltR<MlyRqmtReg_Chk01_RsltR, Chk02_RsltR> createMap_MlyRqmtReg_Chk01_RsltR_Chk02_RsltR() {
			return new Map_MlyRqmtReg_Chk01_RsltR_Chk02_RsltR<MlyRqmtReg_Chk01_RsltR, Chk02_RsltR>();
		}

		public class Map_MlyRqmtReg_Chk01_RsltR_Chk02_RsltR<D extends MlyRqmtReg_Chk01_RsltR, S extends Chk02_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$peg_no, Chk02_RsltR.$peg_no);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$data_crud_typ, Chk02_RsltR.$data_crud_typ);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$ym, Chk02_RsltR.$ym);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$prod_ym, Chk02_RsltR.$prod_ym);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$mps_grp_cd, Chk02_RsltR.$mps_grp_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_cd, Chk02_RsltR.$itm_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub1, Chk02_RsltR.$itm_sub1);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub2, Chk02_RsltR.$itm_sub2);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub3, Chk02_RsltR.$itm_sub3);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$upd_cntr, Chk02_RsltR.$upd_cntr);
				
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$ym_key, Chk02_RsltR.$ym);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$prod_ym_key, Chk02_RsltR.$prod_ym);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$mps_grp_cd_key, Chk02_RsltR.$mps_grp_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_cd_key, Chk02_RsltR.$itm_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub1_key, Chk02_RsltR.$itm_sub1);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub2_key, Chk02_RsltR.$itm_sub2);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub3_key, Chk02_RsltR.$itm_sub3);
			}
		}
				
		protected Map_Chk02_RsltR_MlyRqmtReg_Chk01_RsltR<Chk02_RsltR,MlyRqmtReg_Chk01_RsltR> createMap_Chk02_RsltR_MlyRqmtReg_Chk01_RsltR() {
			return new Map_Chk02_RsltR_MlyRqmtReg_Chk01_RsltR<Chk02_RsltR, MlyRqmtReg_Chk01_RsltR>();
		}

		public class Map_Chk02_RsltR_MlyRqmtReg_Chk01_RsltR<D extends Chk02_RsltR, S extends MlyRqmtReg_Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_RsltR.$peg_no, MlyRqmtReg_Chk01_RsltR.$peg_no);
				addColumnPathMap(Chk02_RsltR.$err_flg, MlyRqmtReg_Chk01_RsltR.$err_flg);
				addColumnPathMap(Chk02_RsltR.$data_crud_typ, MlyRqmtReg_Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(Chk02_RsltR.$rtn_sts_typ, MlyRqmtReg_Chk01_RsltR.$rtn_sts_typ);
				addColumnPathMap(Chk02_RsltR.$ym, MlyRqmtReg_Chk01_RsltR.$ym);
				addColumnPathMap(Chk02_RsltR.$itm_cd, MlyRqmtReg_Chk01_RsltR.$itm_cd);
				addColumnPathMap(Chk02_RsltR.$itm_sub1, MlyRqmtReg_Chk01_RsltR.$itm_sub1);
				addColumnPathMap(Chk02_RsltR.$itm_sub2, MlyRqmtReg_Chk01_RsltR.$itm_sub2);
				addColumnPathMap(Chk02_RsltR.$itm_sub3, MlyRqmtReg_Chk01_RsltR.$itm_sub3);
				addColumnPathMap(Chk02_RsltR.$mps_grp_cd, MlyRqmtReg_Chk01_RsltR.$mps_grp_cd);
				addColumnPathMap(Chk02_RsltR.$prod_ym, MlyRqmtReg_Chk01_RsltR.$prod_ym);
				addColumnPathMap(Chk02_RsltR.$upd_cntr, MlyRqmtReg_Chk01_RsltR.$upd_cntr);
			}
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 月次生産依頼を登録、更新する。
	 */
	public class Upd01 extends MSBCL_MlyRqmtReg_MC_A.Upd01 {

		
		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess();
			}
			catch (Exception e) {
				handleEx(e);
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {

			// 上り電文編集
			editUp();

			// チェック処理
			callThisChk01();

			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				
				// 月次生産依頼登録サービス実行
				callMlyRqmtRegSrv(notErrL);
			}
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());

			for (Chk01_RsltR r : up0()) {
				if (r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				else {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBCL_MlyRqmtReg.Chk01 ope = MSBCL_MlyRqmtReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();

			up0().setAll(ope.down0());
		}

		/**
		 * 月次生産依頼登録サービスを実行する
		 * 
		 * @param notErrL
		 */
		protected void callMlyRqmtRegSrv(MCList<Chk01_RsltR> notErrL) {
			MSBCL_MlyRqmtRegService.MlyRqmtReg_Upd01 ope = MSBCL_MlyRqmtRegService.crtMlyRqmtReg_Upd01();
			addAll(ope.up0(), notErrL, createMap_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR());

			ope.exec();

//			String[] srcCols = {
//					MlyRqmtReg_Chk01_RsltR.$ym, MlyRqmtReg_Chk01_RsltR.$prod_ym,
//					MlyRqmtReg_Chk01_RsltR.$itm_cd, MlyRqmtReg_Chk01_RsltR.$itm_sub1,
//					MlyRqmtReg_Chk01_RsltR.$itm_sub2, MlyRqmtReg_Chk01_RsltR.$itm_sub3
//			};
//			String[] destCols = {
//					Chk01_RsltR.$ym, Chk01_RsltR.$prod_ym, Chk01_RsltR.$itm_cd,
//					Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub3
//			};
//
//			copyByPegNo(notErrL, destCols, ope.down0(), srcCols);
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 正常終了したスレッドの後処理
		 * @param l
		 */
		protected void handleSuccess() {
			dbTran().commit();
			for (Chk01_RsltR r : up0()) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/** 例外が発生したスレッドのエラー処理 */
		protected void handleEx(Exception e) {

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
			for (Chk01_RsltR r : up0()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		
		@Override
		protected int getSplitRowCount() {
			// 自動マルチスレッド分割サイズ
			return getThreadBatchSize(up0().size());
		}

		/** Chk01_RsltR → MlyRqmtReg_Chk01_RsltR (Upd01 → MlyRqmtReg_Upd01) */
		protected Map_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR<MlyRqmtReg_Chk01_RsltR, Chk01_RsltR> createMap_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR() {
			return new Map_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR<MlyRqmtReg_Chk01_RsltR, Chk01_RsltR>();
		}

		/** Chk01_RsltR → MlyRqmtReg_Chk01_RsltR (Upd01 → MlyRqmtReg_Upd01) */
		public class Map_MlyRqmtReg_Chk01_RsltR_Chk01_RsltR<D extends MlyRqmtReg_Chk01_RsltR, S extends Chk01_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$data_crud_typ, Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$ym, Chk01_RsltR.$ym);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$prod_ym, Chk01_RsltR.$prod_ym);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$mps_grp_cd, Chk01_RsltR.$mps_grp_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$strg_loc_cd, Chk01_RsltR.$strg_loc_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$mfg_loc_cd, Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$sppl_cd, Chk01_RsltR.$sppl_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$rqst_loc_cd, Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$qty, Chk01_RsltR.$qty);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$wg_cd, Chk01_RsltR.$wg_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$intr_rmrks, Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$sub_char1, Chk01_RsltR.$sub_char1);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$sub_char2, Chk01_RsltR.$sub_char2);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$sub_char3, Chk01_RsltR.$sub_char3);
			}
			
			@Override
			protected void valueCopy(D dest, S src){
				if (MAC_DATA_CRUD_TYP.isUPD(src.data_crud_typ())){
					dest.ym_key(src.ym_key());
					dest.prod_ym_key(src.prod_ym_key());
					dest.mps_grp_cd_key(src.mps_grp_cd_key());
					dest.itm_cd_key(src.itm_cd_key());
					dest.itm_sub1_key(src.itm_sub1_key());
					dest.itm_sub2_key(src.itm_sub2_key());
					dest.itm_sub3_key(src.itm_sub3_key());
				}
			}
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 月次生産依頼を取り消す。
	 */
	public class Del01 extends MSBCL_MlyRqmtReg_MC_A.Del01 {

		@Override
		protected int getSplitRowCount() {
			// 自動マルチスレッド分割サイズ
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess();
			}
			catch (Exception e) {
				handleEx(e);
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk02();

			MCList<Chk02_RsltR> notErrL = up0().subList(Chk02_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callMlyRqmtDelSrv(notErrL);
			}
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(Chk02_RsltR.$peg_no, up0());

			for (Chk02_RsltR r : up0()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBCL_MlyRqmtReg.Chk02 ope = MSBCL_MlyRqmtReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();

			up0().setAll(ope.down0());
		}

		/**
		 * 月次生産依頼登録サービスを実行する
		 * 
		 * @param notErrL
		 */
		protected void callMlyRqmtDelSrv(MCList<Chk02_RsltR> notErrL) {
			MSBCL_MlyRqmtRegService.MlyRqmtReg_Upd01 ope = MSBCL_MlyRqmtRegService
					.crtMlyRqmtReg_Upd01();
			MCList<MlyRqmtReg_Chk01_RsltR> destL = MCList
					.create(MlyRqmtReg_Chk01_RsltR.class);
			addAll(destL, notErrL, createMap_MlyRqmtReg_Chk01_RsltR_Chk02_RsltR());
			ope.up0().addAll(destL);
			ope.exec();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 正常終了したスレッドの後処理
		 * @param l
		 */
		protected void handleSuccess() {
			dbTran().commit();
			for (Chk02_RsltR r : up0()) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/** 例外が発生したスレッドのエラー処理 */
		protected void handleEx(Exception e) {

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
			for (Chk02_RsltR r : up0()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		
		protected Map_MlyRqmtReg_Chk01_RsltR_Chk02_RsltR<MlyRqmtReg_Chk01_RsltR, Chk02_RsltR> createMap_MlyRqmtReg_Chk01_RsltR_Chk02_RsltR() {
			return new Map_MlyRqmtReg_Chk01_RsltR_Chk02_RsltR<MlyRqmtReg_Chk01_RsltR, Chk02_RsltR>();
		}

		public class Map_MlyRqmtReg_Chk01_RsltR_Chk02_RsltR<D extends MlyRqmtReg_Chk01_RsltR, S extends Chk02_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$peg_no, Chk02_RsltR.$peg_no);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$data_crud_typ,
						Chk02_RsltR.$data_crud_typ);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$ym, Chk02_RsltR.$ym);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$prod_ym, Chk02_RsltR.$prod_ym);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$mps_grp_cd,
						Chk02_RsltR.$mps_grp_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_cd, Chk02_RsltR.$itm_cd);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub1, Chk02_RsltR.$itm_sub1);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub2, Chk02_RsltR.$itm_sub2);
				addColumnPathMap(MlyRqmtReg_Chk01_RsltR.$itm_sub3, Chk02_RsltR.$itm_sub3);
			}
		}
	}

	/**
	 * Imp01オペレーション.<p>
	 * 
	 * ファイルから取り込んだ月次生産依頼のチェック処理を行う<br>
	 */
	public class Imp01 extends MSBCL_MlyRqmtReg_MC_A.Imp01 {

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();
			setDown();
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());
			for (Chk01_RsltR r : up0()){
				r.ym_key(r.ym());
				r.prod_ym_key(r.prod_ym());
				r.mps_grp_cd_key(r.mps_grp_cd());
				r.itm_cd_key(r.itm_cd());
				r.itm_sub1_key(r.itm_sub1());
				r.itm_sub2_key(r.itm_sub2());
				r.itm_sub3_key(r.itm_sub3());
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBCL_MlyRqmtReg.Chk01 ope = MSBCL_MlyRqmtReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(true);
			ope.exec();			
			up0().setAll(ope.down0());
			for (Chk01_RsltR upRow : up0()){
				if (MAC_DATA_CRUD_TYP.isUPD(upRow.data_crud_typ())){
					upRow.setStatus(MCRow.MODIFY);
				}
			}
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().addAll(up0());
			
			// サービスのチェック処理でデータ更新区分が新規と判定された場合は、key項目をクリアする
			for (Chk01_RsltR r : down0()){
				if (MAC_DATA_CRUD_TYP.isCRT(r.data_crud_typ())) {
					r.ym_key(null);
					r.prod_ym_key(null);
					r.mps_grp_cd_key(null);
					r.itm_cd_key(null);
					r.itm_sub1_key(null);
					r.itm_sub2_key(null);
					r.itm_sub3_key(null);
				}
				else {
					if (isNull(r.itm_sub1_key())) {
						r.itm_sub1_key(r.itm_sub1());
					}
					if (isNull(r.itm_sub2_key())) {
						r.itm_sub2_key(r.itm_sub2());
					}
					if (isNull(r.itm_sub3_key())) {
						r.itm_sub3_key(r.itm_sub3());
					}
				}
			}
		}
	}

	/**
	 * Upd02オペレーション.<p>
	 *
	 * 月次生産依頼から日次生産依頼を作成する日ばらし処理を実行する。<br>
	 */
	public class Upd02 extends MSBCL_MlyRqmtReg_MC_A.Upd02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// チェック処理
			callThisChk03();
			throwUpdErr();
			// 日ばらしサービス実行
			callRqmtCrtSrv();
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MSBCL_MlyRqmtReg.Chk03 ope = MSBCL_MlyRqmtReg.crtChk03();
			MCRow.copyall(ope.up0(), up0());
			ope.exec();
			MCRow.copyall(up0(), ope.down0());
		}

		/**
		 * 生産日ばらしサービスを実行する
		 */
		protected void callRqmtCrtSrv(){
			MSBCL_RqmtCrtService.RqmtCrt_Upd01 ope = MSBCL_RqmtCrtService.crtRqmtCrt_Upd01();
			copy(ope.up0(), up0(), createMap_RqmtCrt_Upd01_CndR_Chk03_CndR());
			ope.exec();
		}

		/** Chk03_CndR → RqmtCrt_Upd01_CndR (Upd02 → RqmtCrt_Upd01) */
		protected Map_RqmtCrt_Upd01_CndR_Chk03_CndR<RqmtCrt_Upd01_CndR,Chk03_CndR> createMap_RqmtCrt_Upd01_CndR_Chk03_CndR() {
			return new Map_RqmtCrt_Upd01_CndR_Chk03_CndR<RqmtCrt_Upd01_CndR, Chk03_CndR>();
		}

		/** Chk03_CndR → RqmtCrt_Upd01_CndR (Upd02 → RqmtCrt_Upd01) */
		public class Map_RqmtCrt_Upd01_CndR_Chk03_CndR<D extends RqmtCrt_Upd01_CndR, S extends Chk03_CndR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(RqmtCrt_Upd01_CndR.$mps_grp_cd, Chk03_CndR.$mps_grp_cd);
				addColumnPathMap(RqmtCrt_Upd01_CndR.$wg_cd, Chk03_CndR.$wg_cd);
				addColumnPathMap(RqmtCrt_Upd01_CndR.$ym, Chk03_CndR.$ym);
			}
		}
	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 月次生産依頼から日次生産依頼を作成する日ばらし処理を実行するために、チェックを行う。<br>
	 */
	public class Chk03 extends MSBCL_MlyRqmtReg_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (!isNull(up0().mps_grp_cd()) && isNull(up0().wg_cd())) {
				MCList<MAM_MPS_ITM_R> mpsItmL = MCList.create(MAM_MPS_ITM_R.class);
				MAM_MPS_ITM_R t = MAM_MPS_ITM_R.create("T");
				MCQueryApiBuilder mpsItmL_bldr = MCQueryApiBuilder.create(t);
				mpsItmL_bldr.setSelect(t.wg_cd);
				mpsItmL_bldr.addWhereWithAnd(t.mps_grp_cd.eq(bind("1")), up0().mps_grp_cd());
				mpsItmL_bldr.setOrderByAsc(t.wg_cd);
				mpsItmL_bldr.setGroupBy(t.wg_cd);
				dbSelect("MSBCL0030_MAM_MPS_ITM_S01", mpsItmL, mpsItmL_bldr);
				if (!isNull(mpsItmL)) {
					up0().wg_cd(mpsItmL.get(0).wg_cd());
				}
			}
			if (!isNull(up0().wg_cd())) {
				msgL.addAll(checkWritableWgCdDac(up0(), Chk03_CndR.$wg_cd));
			}
			return msgL;
		}
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}


		@Override
		protected MCMessageList doServerCheck() {
			String defWgCd = getSysParm("DEF_WG_CD");
			if (!isNull(defWgCd)) {
				up0().wg_cd(defWgCd);
			}
			return super.doServerCheck();
		}
	}

	//FMCB CUSTOM END
}