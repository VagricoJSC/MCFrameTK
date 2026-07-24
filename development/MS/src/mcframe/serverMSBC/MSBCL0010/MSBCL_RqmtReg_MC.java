package mcframe.serverMSBC.MSBCL0010;

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
import mcframe.serverMSBC.MSBCL0010.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBC.MSBCL5020.*;
import static mcframe.serverMSBC.MSBCL0010.Query.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_RqmtReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_RqmtReg_MC extends MSBCL_RqmtReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBCL_RqmtReg_MC_A.Srch01 {
		
		protected String _RQMT_TYP_MRP = "1";

		protected String _RQMT_TYP_PRCD = "2";
		
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			editUp();
			if (isMRP(up0().mrp_typ_r())) {
				MCQueryPlan sql = MSBCL0010_MST_RQMT_S01();
				searchForDL(sql, up0(), down0());
			}
			else if (isPRCD(up0().mrp_typ_r())) {
				MCQueryPlan sql = MSBCL0010_MST_PRCD_RQMT_S01();
				searchForDL(sql, up0(), down0());
			}
		}
		protected void editUp() {
			if (!up0().fix_flg()) {
				up0().addStringColumn("fix_flg_str", "0");
			}
		}
		
		protected boolean isMRP(String val) {
			return isSame(val, _RQMT_TYP_MRP);
		}
		
		protected boolean isPRCD(String val) {
			return isSame(val, _RQMT_TYP_PRCD);
		}
		
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 */
	public class Chk01 extends MSBCL_RqmtReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				callRqmtChkSrv();
			}
			setErrToRtnStsTyp();
			setDown();
		}
		
		protected void callRqmtChkSrv() {
			MSBCL_RqmtRegService.Rqmt_Chk01 ope = MSBCL_RqmtRegService.crtRqmt_Chk01();
			MCList<Rqmt_Chk01_RsltR> destL = MCList.create(Rqmt_Chk01_RsltR.class);
			addAll(destL, up0(), createMap_Rqmt_Chk01_RsltR_Chk01_RsltR());
			ope.up0().addAll(destL);
			ope.up1().file_imp_flg(up1().file_imp_flg());
			ope.exec();
			
			MCIndexKey idxkey = ope.down0().createIndex(Rqmt_Chk01_RsltR.$peg_no);
			MCJoinKey<MCList<Rqmt_Chk01_RsltR>> joinkey = up0().join(
					Chk01_RsltR.$peg_no, ope.down0(), idxkey);
			join(up0(), joinkey, createMap_Chk01_RsltR_Rqmt_Chk01_RsltR());
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected Map_Rqmt_Chk01_RsltR_Chk01_RsltR<Rqmt_Chk01_RsltR,Chk01_RsltR> createMap_Rqmt_Chk01_RsltR_Chk01_RsltR() {
			return new Map_Rqmt_Chk01_RsltR_Chk01_RsltR<Rqmt_Chk01_RsltR, Chk01_RsltR>();
		}

		public class Map_Rqmt_Chk01_RsltR_Chk01_RsltR<D extends Rqmt_Chk01_RsltR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Rqmt_Chk01_RsltR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(Rqmt_Chk01_RsltR.$data_crud_typ, Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(Rqmt_Chk01_RsltR.$mrp_typ, Chk01_RsltR.$mrp_typ);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqmt_no, Chk01_RsltR.$rqmt_no);
				addColumnPathMap(Rqmt_Chk01_RsltR.$due_dt, Chk01_RsltR.$due_dt);
				addColumnPathMap(Rqmt_Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(Rqmt_Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(Rqmt_Chk01_RsltR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(Rqmt_Chk01_RsltR.$strg_loc_cd, Chk01_RsltR.$strg_loc_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqmt_qty, Chk01_RsltR.$rqmt_qty);
				addColumnPathMap(Rqmt_Chk01_RsltR.$mfg_loc_cd, Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sppl_cd, Chk01_RsltR.$sppl_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqst_loc_cd, Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sno1, Chk01_RsltR.$sno1);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sno2, Chk01_RsltR.$sno2);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sno3, Chk01_RsltR.$sno3);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sno4, Chk01_RsltR.$sno4);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqmt_gnrt_typ, Chk01_RsltR.$rqmt_gnrt_typ);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqmt_typ, Chk01_RsltR.$rqmt_typ);
				addColumnPathMap(Rqmt_Chk01_RsltR.$intr_rmrks, Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sub_char1, Chk01_RsltR.$sub_char1);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sub_char2, Chk01_RsltR.$sub_char2);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sub_char3, Chk01_RsltR.$sub_char3);
				addColumnPathMap(Rqmt_Chk01_RsltR.$upd_cntr, Chk01_RsltR.$upd_cntr);

			}
		}
		
		protected Map_Chk01_RsltR_Rqmt_Chk01_RsltR<Chk01_RsltR,Rqmt_Chk01_RsltR> createMap_Chk01_RsltR_Rqmt_Chk01_RsltR() {
			return new Map_Chk01_RsltR_Rqmt_Chk01_RsltR<Chk01_RsltR, Rqmt_Chk01_RsltR>();
		}

		public class Map_Chk01_RsltR_Rqmt_Chk01_RsltR<D extends Chk01_RsltR, S extends Rqmt_Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk01_RsltR.$err_flg, Rqmt_Chk01_RsltR.$err_flg);
				addColumnPathMap(Chk01_RsltR.$data_crud_typ, Rqmt_Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(Chk01_RsltR.$mrp_typ, Rqmt_Chk01_RsltR.$mrp_typ);
				addColumnPathMap(Chk01_RsltR.$rqmt_no, Rqmt_Chk01_RsltR.$rqmt_no);
				addColumnPathMap(Chk01_RsltR.$due_dt, Rqmt_Chk01_RsltR.$due_dt);
				addColumnPathMap(Chk01_RsltR.$itm_cd, Rqmt_Chk01_RsltR.$itm_cd);
				addColumnPathMap(Chk01_RsltR.$itm_sub1, Rqmt_Chk01_RsltR.$itm_sub1);
				addColumnPathMap(Chk01_RsltR.$itm_sub2, Rqmt_Chk01_RsltR.$itm_sub2);
				addColumnPathMap(Chk01_RsltR.$itm_sub3, Rqmt_Chk01_RsltR.$itm_sub3);
				addColumnPathMap(Chk01_RsltR.$itm_nm, Rqmt_Chk01_RsltR.$itm_nm);
				addColumnPathMap(Chk01_RsltR.$strg_loc_cd, Rqmt_Chk01_RsltR.$strg_loc_cd);
				addColumnPathMap(Chk01_RsltR.$strg_loc_nm, Rqmt_Chk01_RsltR.$strg_loc_nm);
				addColumnPathMap(Chk01_RsltR.$site_cd, Rqmt_Chk01_RsltR.$site_cd);
				addColumnPathMap(Chk01_RsltR.$site_nm, Rqmt_Chk01_RsltR.$site_nm);
				addColumnPathMap(Chk01_RsltR.$wg_cd, Rqmt_Chk01_RsltR.$wg_cd);
				addColumnPathMap(Chk01_RsltR.$wg_nm, Rqmt_Chk01_RsltR.$wg_nm);
				addColumnPathMap(Chk01_RsltR.$strg_loc_grp_cd, Rqmt_Chk01_RsltR.$strg_loc_grp_cd);
				addColumnPathMap(Chk01_RsltR.$strg_loc_grp_nm, Rqmt_Chk01_RsltR.$strg_loc_grp_nm);
				addColumnPathMap(Chk01_RsltR.$rqmt_qty, Rqmt_Chk01_RsltR.$rqmt_qty);
				addColumnPathMap(Chk01_RsltR.$unit_cd, Rqmt_Chk01_RsltR.$unit_cd);
				addColumnPathMap(Chk01_RsltR.$unit_nm, Rqmt_Chk01_RsltR.$unit_nm);
				addColumnPathMap(Chk01_RsltR.$dec_place, Rqmt_Chk01_RsltR.$dec_place);
				addColumnPathMap(Chk01_RsltR.$mfg_loc_cd, Rqmt_Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(Chk01_RsltR.$mfg_loc_nm, Rqmt_Chk01_RsltR.$mfg_loc_nm);
				addColumnPathMap(Chk01_RsltR.$sppl_cd, Rqmt_Chk01_RsltR.$sppl_cd);
				addColumnPathMap(Chk01_RsltR.$sppl_nm, Rqmt_Chk01_RsltR.$sppl_nm);
				addColumnPathMap(Chk01_RsltR.$rqst_loc_cd, Rqmt_Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(Chk01_RsltR.$rqst_loc_nm, Rqmt_Chk01_RsltR.$rqst_loc_nm);
				addColumnPathMap(Chk01_RsltR.$rqst_wg_cd, Rqmt_Chk01_RsltR.$rqst_wg_cd);
				addColumnPathMap(Chk01_RsltR.$rqst_wg_nm, Rqmt_Chk01_RsltR.$rqst_wg_nm);
				addColumnPathMap(Chk01_RsltR.$sno1, Rqmt_Chk01_RsltR.$sno1);
				addColumnPathMap(Chk01_RsltR.$sno2, Rqmt_Chk01_RsltR.$sno2);
				addColumnPathMap(Chk01_RsltR.$sno3, Rqmt_Chk01_RsltR.$sno3);
				addColumnPathMap(Chk01_RsltR.$sno4, Rqmt_Chk01_RsltR.$sno4);
				addColumnPathMap(Chk01_RsltR.$sno1_mng_typ, Rqmt_Chk01_RsltR.$sno1_mng_typ);
				addColumnPathMap(Chk01_RsltR.$rqmt_sno1_flg, Rqmt_Chk01_RsltR.$rqmt_sno1_flg);
				addColumnPathMap(Chk01_RsltR.$sno1_num_typ, Rqmt_Chk01_RsltR.$sno1_num_typ);
				addColumnPathMap(Chk01_RsltR.$sno2_mng_typ, Rqmt_Chk01_RsltR.$sno2_mng_typ);
				addColumnPathMap(Chk01_RsltR.$rqmt_sno2_flg, Rqmt_Chk01_RsltR.$rqmt_sno2_flg);
				addColumnPathMap(Chk01_RsltR.$sno2_num_typ, Rqmt_Chk01_RsltR.$sno2_num_typ);
				addColumnPathMap(Chk01_RsltR.$sno3_mng_typ, Rqmt_Chk01_RsltR.$sno3_mng_typ);
				addColumnPathMap(Chk01_RsltR.$rqmt_sno3_flg, Rqmt_Chk01_RsltR.$rqmt_sno3_flg);
				addColumnPathMap(Chk01_RsltR.$sno3_num_typ, Rqmt_Chk01_RsltR.$sno3_num_typ);
				addColumnPathMap(Chk01_RsltR.$sno4_mng_typ, Rqmt_Chk01_RsltR.$sno4_mng_typ);
				addColumnPathMap(Chk01_RsltR.$rqmt_sno4_flg, Rqmt_Chk01_RsltR.$rqmt_sno4_flg);
				addColumnPathMap(Chk01_RsltR.$sno4_num_typ, Rqmt_Chk01_RsltR.$sno4_num_typ);
				addColumnPathMap(Chk01_RsltR.$fix_flg, Rqmt_Chk01_RsltR.$fix_flg);
				addColumnPathMap(Chk01_RsltR.$rqmt_gnrt_typ, Rqmt_Chk01_RsltR.$rqmt_gnrt_typ);
				addColumnPathMap(Chk01_RsltR.$rqmt_gnrt_typ_nm, Rqmt_Chk01_RsltR.$rqmt_gnrt_typ_nm);
				addColumnPathMap(Chk01_RsltR.$rqmt_typ, Rqmt_Chk01_RsltR.$rqmt_typ);
				addColumnPathMap(Chk01_RsltR.$rqmt_typ_nm, Rqmt_Chk01_RsltR.$rqmt_typ_nm);
				addColumnPathMap(Chk01_RsltR.$intr_rmrks, Rqmt_Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(Chk01_RsltR.$sub_char1, Rqmt_Chk01_RsltR.$sub_char1);
				addColumnPathMap(Chk01_RsltR.$sub_char2, Rqmt_Chk01_RsltR.$sub_char2);
				addColumnPathMap(Chk01_RsltR.$sub_char3, Rqmt_Chk01_RsltR.$sub_char3);
				addColumnPathMap(Chk01_RsltR.$upd_cntr, Rqmt_Chk01_RsltR.$upd_cntr);
			}
		}

	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 */
	public class Chk02 extends MSBCL_RqmtReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				callRqmtChkSrv();
			}
			setErrToRtnStsTyp();
			setDown();
		}
		
		protected void callRqmtChkSrv() {
			MSBCL_RqmtRegService.Rqmt_Chk01 ope = MSBCL_RqmtRegService.crtRqmt_Chk01();
			MCList<Rqmt_Chk01_RsltR> destL = MCList.create(Rqmt_Chk01_RsltR.class);
			addAll(destL, up0(), createMap_Rqmt_Chk01_RsltR_Chk02_RsltR());
			ope.up0().addAll(destL);
			ope.exec();
			
			copyErrFlg(up0(), ope.down0());
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected Map_Rqmt_Chk01_RsltR_Chk02_RsltR<Rqmt_Chk01_RsltR,Chk02_RsltR> createMap_Rqmt_Chk01_RsltR_Chk02_RsltR() {
			return new Map_Rqmt_Chk01_RsltR_Chk02_RsltR<Rqmt_Chk01_RsltR, Chk02_RsltR>();
		}

		public class Map_Rqmt_Chk01_RsltR_Chk02_RsltR<D extends Rqmt_Chk01_RsltR, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Rqmt_Chk01_RsltR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(Rqmt_Chk01_RsltR.$data_crud_typ, Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(Rqmt_Chk01_RsltR.$mrp_typ, Chk01_RsltR.$mrp_typ);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqmt_no, Chk01_RsltR.$rqmt_no);
				addColumnPathMap(Rqmt_Chk01_RsltR.$upd_cntr, Chk01_RsltR.$upd_cntr);
			}
		}
	}

	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 手配ＮＯ発番<br>
	 */
	public class Sprt01 extends MSBCL_RqmtReg_MC_A.Sprt01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doIt() {
			editUp();
			callSnoSrv();
			setDown();
		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());
		}

		/**
		 * 手配ＮＯ発番サービスを実行する
		 */
		protected void callSnoSrv() {
			MSBCL_RqmtRegService.Rqmt_Sprt01 ope = MSBCL_RqmtRegService.crtRqmt_Sprt01();
			MCList<Rqmt_Sprt01_RsltR> destL = MCList.create(Rqmt_Sprt01_RsltR.class);
			addAll(destL, up0(), createMap_Rqmt_Sprt01_RsltR_Sprt01_RsltR());
			ope.up0().addAll(destL);
			ope.up1().screen_flg(true);
			ope.exec();
			String[] destCols = {
					Sprt01_RsltR.$sno1, Sprt01_RsltR.$sno2, Sprt01_RsltR.$sno3,
					Sprt01_RsltR.$sno4, Sprt01_RsltR.$wrk_no, Sprt01_RsltR.$wrk_nm
			};
			String[] srcCols = {
					Rqmt_Sprt01_RsltR.$sno1, Rqmt_Sprt01_RsltR.$sno2,
					Rqmt_Sprt01_RsltR.$sno3, Rqmt_Sprt01_RsltR.$sno4,
					Rqmt_Sprt01_RsltR.$wrk_no, Rqmt_Sprt01_RsltR.$wrk_nm
			};
			copyByPegNo(up0(), destCols, ope.down0(), srcCols);
		}

		/**
		 * 下り電文を編集する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		protected Map_Rqmt_Sprt01_RsltR_Sprt01_RsltR<Rqmt_Sprt01_RsltR,Sprt01_RsltR> createMap_Rqmt_Sprt01_RsltR_Sprt01_RsltR() {
			return new Map_Rqmt_Sprt01_RsltR_Sprt01_RsltR<Rqmt_Sprt01_RsltR, Sprt01_RsltR>();
		}

		public class Map_Rqmt_Sprt01_RsltR_Sprt01_RsltR<D extends Rqmt_Sprt01_RsltR, S extends Sprt01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Rqmt_Sprt01_RsltR.$peg_no, Sprt01_RsltR.$peg_no);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$itm_cd, Sprt01_RsltR.$itm_cd);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$itm_sub1, Sprt01_RsltR.$itm_sub1);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$itm_sub2, Sprt01_RsltR.$itm_sub2);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$itm_sub3, Sprt01_RsltR.$itm_sub3);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$strg_loc_cd, Sprt01_RsltR.$strg_loc_cd);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$site_cd, Sprt01_RsltR.$site_cd);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$wg_cd, Sprt01_RsltR.$wg_cd);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$due_dt, Sprt01_RsltR.$due_dt);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$sno1, Sprt01_RsltR.$sno1);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$sno2, Sprt01_RsltR.$sno2);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$sno3, Sprt01_RsltR.$sno3);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$sno4, Sprt01_RsltR.$sno4);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$wrk_no, Sprt01_RsltR.$wrk_no);
				addColumnPathMap(Rqmt_Sprt01_RsltR.$wrk_nm, Sprt01_RsltR.$wrk_nm);

			}
		}
	}

	/**
	 * Imp01オペレーション.<p>
	 *
	 */
	public class Imp01 extends MSBCL_RqmtReg_MC_A.Imp01 {
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
			for (Chk01_RsltR r : up0()) {
				if (r.isStatusCreate()) {
					r.rqmt_gnrt_typ(MSC_RQMT_GNRT_TYP.MNL.value());
				}
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBCL_RqmtReg.Chk01 ope = MSBCL_RqmtReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().file_imp_flg(true);
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().addAll(up0());
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	public class Upd01 extends MSBCL_RqmtReg_MC_A.Upd01 {
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
				callRqmtRegSrv(notErrL);
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
					r.rqmt_gnrt_typ(MSC_RQMT_GNRT_TYP.MNL.value());
				}
				else if (r.isStatusModify()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else {
					r.setStatus(MCRow.NONE);
				}
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBCL_RqmtReg.Chk01 ope = MSBCL_RqmtReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		/**
		 * 日次生産依頼登録サービスを実行する
		 * 
		 * @param notErrL
		 */
		protected void callRqmtRegSrv(MCList<Chk01_RsltR> notErrL) {
			MSBCL_RqmtRegService.Rqmt_Upd01 ope = MSBCL_RqmtRegService.crtRqmt_Upd01();
			MCList<Rqmt_Chk01_RsltR> destL = MCList.create(Rqmt_Chk01_RsltR.class);
			addAll(destL, notErrL, createMap_Rqmt_Chk01_RsltR_Chk01_RsltR());
			ope.up0().addAll(destL);
			ope.exec();
			
			String[] srcCols = {Rqmt_Chk01_RsltR.$rqmt_no};
			String[] destCols = {Chk01_RsltR.$rqmt_no};
			
			copyByPegNo(notErrL, destCols, ope.down0(), srcCols);
		}

		protected void handleSuccess(MCList<Chk01_RsltR> l) {
			dbTran().commit();
			for (Chk01_RsltR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e,
				MCList<Chk01_RsltR> l) {
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
			for (Chk01_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		protected Map_Rqmt_Chk01_RsltR_Chk01_RsltR<Rqmt_Chk01_RsltR,Chk01_RsltR> createMap_Rqmt_Chk01_RsltR_Chk01_RsltR() {
			return new Map_Rqmt_Chk01_RsltR_Chk01_RsltR<Rqmt_Chk01_RsltR, Chk01_RsltR>();
		}

		public class Map_Rqmt_Chk01_RsltR_Chk01_RsltR<D extends Rqmt_Chk01_RsltR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Rqmt_Chk01_RsltR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(Rqmt_Chk01_RsltR.$data_crud_typ, Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(Rqmt_Chk01_RsltR.$mrp_typ, Chk01_RsltR.$mrp_typ);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqmt_no, Chk01_RsltR.$rqmt_no);
				addColumnPathMap(Rqmt_Chk01_RsltR.$due_dt, Chk01_RsltR.$due_dt);
				addColumnPathMap(Rqmt_Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(Rqmt_Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(Rqmt_Chk01_RsltR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(Rqmt_Chk01_RsltR.$strg_loc_cd, Chk01_RsltR.$strg_loc_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$wg_cd, Chk01_RsltR.$wg_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqmt_qty, Chk01_RsltR.$rqmt_qty);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sno1, Chk01_RsltR.$sno1);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sno2, Chk01_RsltR.$sno2);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sno3, Chk01_RsltR.$sno3);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sno4, Chk01_RsltR.$sno4);
				addColumnPathMap(Rqmt_Chk01_RsltR.$mfg_loc_cd, Chk01_RsltR.$mfg_loc_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sppl_cd, Chk01_RsltR.$sppl_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqst_loc_cd, Chk01_RsltR.$rqst_loc_cd);
				addColumnPathMap(Rqmt_Chk01_RsltR.$fix_flg, Chk01_RsltR.$fix_flg);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqmt_gnrt_typ, Chk01_RsltR.$rqmt_gnrt_typ);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqmt_typ, Chk01_RsltR.$rqmt_typ);
				addColumnPathMap(Rqmt_Chk01_RsltR.$intr_rmrks, Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sub_char1, Chk01_RsltR.$sub_char1);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sub_char2, Chk01_RsltR.$sub_char2);
				addColumnPathMap(Rqmt_Chk01_RsltR.$sub_char3, Chk01_RsltR.$sub_char3);

			}
		}

	}

	/**
	 * Del01オペレーション.<p>
	 *
	 */
	public class Del01 extends MSBCL_RqmtReg_MC_A.Del01 {
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
			callThisChk02();
			MCList<Chk02_RsltR> notErrL = up0().subList(Chk02_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callRqmtDelSrv(notErrL);
			}
		}
		
		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());
			
			for (Chk02_RsltR r : up0()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBCL_RqmtReg.Chk02 ope = MSBCL_RqmtReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		/**
		 * 日次生産依頼登録サービスを実行する
		 * 
		 * @param notErrL
		 */
		protected void callRqmtDelSrv(MCList<Chk02_RsltR> notErrL) {
			MSBCL_RqmtRegService.Rqmt_Upd01 ope = MSBCL_RqmtRegService.crtRqmt_Upd01();
			MCList<Rqmt_Chk01_RsltR> destL = MCList.create(Rqmt_Chk01_RsltR.class);
			addAll(destL, notErrL, createMap_Rqmt_Chk01_RsltR_Chk02_RsltR());
			ope.up0().addAll(destL);
			ope.exec();
		}

		protected void handleSuccess(MCList<Chk02_RsltR> l) {
			dbTran().commit();
			for (Chk02_RsltR r : l) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e,
				MCList<Chk02_RsltR> l) {
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
			for (Chk02_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}
		

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
		protected Map_Rqmt_Chk01_RsltR_Chk02_RsltR<Rqmt_Chk01_RsltR, Chk02_RsltR> createMap_Rqmt_Chk01_RsltR_Chk02_RsltR() {
			return new Map_Rqmt_Chk01_RsltR_Chk02_RsltR<Rqmt_Chk01_RsltR, Chk02_RsltR>();
		}

		public class Map_Rqmt_Chk01_RsltR_Chk02_RsltR<D extends Rqmt_Chk01_RsltR, S extends Chk02_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Rqmt_Chk01_RsltR.$peg_no, Chk02_RsltR.$peg_no);
				addColumnPathMap(Rqmt_Chk01_RsltR.$data_crud_typ, Chk02_RsltR.$data_crud_typ);
				addColumnPathMap(Rqmt_Chk01_RsltR.$mrp_typ, Chk02_RsltR.$mrp_typ);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqmt_no, Chk02_RsltR.$rqmt_no);
			}
			
		}

	}

	//FMCB CUSTOM END
}