package mcframe.serverMSBC.MSBCL0020;

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
import mcframe.serverMSBC.MSBCL0020.*; // このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBC.MSBCL0020.Query.*;
import mcframe.serverMSBC.MSBCL5020.*;
import mcframe.commonCore.param.MCParam;
import java.util.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBCL_MstrPlnReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBCL_MstrPlnReg_MC extends MSBCL_MstrPlnReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Sprt01オペレーション.<p>
	 *
	 */
	public class Sprt01 extends MSBCL_MstrPlnReg_MC_A.Sprt01 {

		@Override
		protected void call() {
			super.call();
		}

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
			addAll(ope.up0(), up0(), createMap_Rqmt_Sprt01_RsltR_Sprt01_RsltR());
			ope.up1().screen_flg(true);

			ope.exec();

			String[] destCols = {Sprt01_RsltR.$sno1, Sprt01_RsltR.$sno2,
				Sprt01_RsltR.$sno3, Sprt01_RsltR.$sno4,
				Sprt01_RsltR.$wrk_no, Sprt01_RsltR.$wrk_nm};
			String[] srcCols = {Rqmt_Sprt01_RsltR.$sno1, Rqmt_Sprt01_RsltR.$sno2,
				Rqmt_Sprt01_RsltR.$sno3, Rqmt_Sprt01_RsltR.$sno4,
				Rqmt_Sprt01_RsltR.$wrk_no, Rqmt_Sprt01_RsltR.$wrk_nm};
			copyByPegNo(up0(), destCols, ope.down0(), srcCols);
		}

		/**
		 * 下り電文を編集する
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/** Sprt01_RsltR → Rqmt_Sprt01_RsltR (Sprt01 → Rqmt_Sprt01) */
		protected Map_Rqmt_Sprt01_RsltR_Sprt01_RsltR<Rqmt_Sprt01_RsltR, Sprt01_RsltR> createMap_Rqmt_Sprt01_RsltR_Sprt01_RsltR() {
			return new Map_Rqmt_Sprt01_RsltR_Sprt01_RsltR<Rqmt_Sprt01_RsltR, Sprt01_RsltR>();
		}

		/** Sprt01_RsltR → Rqmt_Sprt01_RsltR (Sprt01 → Rqmt_Sprt01) */
		public class Map_Rqmt_Sprt01_RsltR_Sprt01_RsltR<D extends Rqmt_Sprt01_RsltR, S extends Sprt01_RsltR>
				extends MCRowMapper<D, S> {
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
	 * Chk01オペレーション.<p>
	 *
	 */
	public class Chk01 extends MSBCL_MstrPlnReg_MC_A.Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCList<Chk01_RsltR> notErrL = getChkList(up1());
			if (!notErrL.isEmpty()) {
				callRqmtChkSrv(notErrL);
			}
			setGrpErrFlg();
			setErrToRtnStsTyp();
			setDown();
		}

		/**
		 * 同一ヘッダ内に1つでもerr_flgがオンの行があれば、全てオンにする
		 * また、ヘッダ行のerr_flgもオンにする
		 */
		protected void setGrpErrFlg() {
			MCList<Chk01_RsltR>[] grpL = up1().groupList(Chk01_RsltR.$hdr_peg_no);
			for (MCList<Chk01_RsltR> grp : grpL) {
				boolean err_flg = false;
				for (Chk01_RsltR r :grp) {
					if (r.err_flg()) {
						err_flg = true;
						break;
					}
				}

				if (err_flg) {
					grp.setBoolean(Chk01_RsltR.$err_flg, true);
					MCList<Chk01_HdrR> hdrL = up0().subList(Chk01_HdrR.$peg_no, grp.get(0).hdr_peg_no());
					hdrL.setBoolean(Chk01_HdrR.$err_flg, true);
				}
			}
		}

		protected void callRqmtChkSrv(MCList<Chk01_RsltR> notErrL) {
			MSBCL_RqmtRegService.Rqmt_Chk01 ope = MSBCL_RqmtRegService.crtRqmt_Chk01();
			addAll(ope.up0(), notErrL, createMap_Rqmt_Chk01_RsltR_Chk01_RsltR());
			ope.up1().file_imp_flg(false);

			ope.exec();

			MCIndexKey idxkey = ope.down0().createIndex(Rqmt_Chk01_RsltR.$peg_no);
			MCJoinKey<MCList<Rqmt_Chk01_RsltR>> joinkey = notErrL.join(Chk01_RsltR.$peg_no, ope.down0(), idxkey);
			join(notErrL, joinkey, createMap_Chk01_RsltR_Rqmt_Chk01_RsltR());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}

		/** Chk01_RsltR → Rqmt_Chk01_RsltR (Chk01 → Rqmt_Chk01) */
		protected Map_Rqmt_Chk01_RsltR_Chk01_RsltR<Rqmt_Chk01_RsltR, Chk01_RsltR> createMap_Rqmt_Chk01_RsltR_Chk01_RsltR() {
			return new Map_Rqmt_Chk01_RsltR_Chk01_RsltR<Rqmt_Chk01_RsltR, Chk01_RsltR>();
		}

		/** Chk01_RsltR → Rqmt_Chk01_RsltR (Chk01 → Rqmt_Chk01) */
		public class Map_Rqmt_Chk01_RsltR_Chk01_RsltR<D extends Rqmt_Chk01_RsltR, S extends Chk01_RsltR>
				extends MCRowMapper<D, S> {
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

		/** Rqmt_Chk01_RsltR → Chk01_RsltR (Rqmt_Chk01 → Chk01) */
		protected Map_Chk01_RsltR_Rqmt_Chk01_RsltR<Chk01_RsltR, Rqmt_Chk01_RsltR> createMap_Chk01_RsltR_Rqmt_Chk01_RsltR() {
			return new Map_Chk01_RsltR_Rqmt_Chk01_RsltR<Chk01_RsltR, Rqmt_Chk01_RsltR>();
		}

		/** Rqmt_Chk01_RsltR → Chk01_RsltR (Rqmt_Chk01 → Chk01) */
		public class Map_Chk01_RsltR_Rqmt_Chk01_RsltR<D extends Chk01_RsltR, S extends Rqmt_Chk01_RsltR>
				extends MCRowMapper<D, S> {
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
	public class Chk02 extends MSBCL_MstrPlnReg_MC_A.Chk02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			MCList<Chk02_RsltR> notErrL = getChkList(up1());
			if (!notErrL.isEmpty()) {
				callRqmtChkSrv(notErrL);
			}
			setGrpErrFlg();
			setErrToRtnStsTyp();
			setDown();
		}

		/**
		 * 同一ヘッダ内に1つでもerr_flgがオンの行があれば、全てオンにする
		 * また、ヘッダ行のerr_flgもオンにする
		 */
		protected void setGrpErrFlg() {
			MCList<Chk02_RsltR>[] grpL = up1().groupList(Chk02_RsltR.$hdr_peg_no);
			for (MCList<Chk02_RsltR> grp : grpL) {
				boolean err_flg = false;
				for (Chk02_RsltR r :grp) {
					if (r.err_flg()) {
						err_flg = true;
						break;
					}
				}

				if (err_flg) {
					grp.setBoolean(Chk02_RsltR.$err_flg, true);
					MCList<Chk02_HdrR> hdrL = up0().subList(Chk02_HdrR.$peg_no, grp.get(0).hdr_peg_no());
					hdrL.setBoolean(Chk02_HdrR.$err_flg, true);
				}
			}
		}

		protected void callRqmtChkSrv(MCList<Chk02_RsltR> notErrL) {
			MSBCL_RqmtRegService.Rqmt_Chk01 ope = MSBCL_RqmtRegService.crtRqmt_Chk01();
			addAll(ope.up0(), notErrL, createMap_Rqmt_Chk01_RsltR_Chk02_RsltR());

			ope.exec();

			MCIndexKey idxkey = ope.down0().createIndex(Rqmt_Chk01_RsltR.$peg_no);
			MCJoinKey<MCList<Rqmt_Chk01_RsltR>> joinkey = notErrL.join(Chk02_RsltR.$peg_no,ope.down0(), idxkey);
			join(notErrL, joinkey, createMap_Chk02_RsltR_Rqmt_Chk01_RsltR());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}

		/** Chk02_RsltR → Rqmt_Chk01_RsltR (Chk02 → Rqmt_Chk01) */
		protected Map_Rqmt_Chk01_RsltR_Chk02_RsltR<Rqmt_Chk01_RsltR, Chk02_RsltR> createMap_Rqmt_Chk01_RsltR_Chk02_RsltR() {
			return new Map_Rqmt_Chk01_RsltR_Chk02_RsltR<Rqmt_Chk01_RsltR, Chk02_RsltR>();
		}

		/** Chk02_RsltR → Rqmt_Chk01_RsltR (Chk02 → Rqmt_Chk01) */
		public class Map_Rqmt_Chk01_RsltR_Chk02_RsltR<D extends Rqmt_Chk01_RsltR, S extends Chk02_RsltR>
				extends MCRowMapper<D, S> {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Rqmt_Chk01_RsltR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(Rqmt_Chk01_RsltR.$data_crud_typ, Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(Rqmt_Chk01_RsltR.$mrp_typ, Chk01_RsltR.$mrp_typ);
				addColumnPathMap(Rqmt_Chk01_RsltR.$rqmt_no, Chk01_RsltR.$rqmt_no);
				addColumnPathMap(Rqmt_Chk01_RsltR.$upd_cntr, Chk01_RsltR.$upd_cntr);
			}
		}

		/** Rqmt_Chk01_RsltR → Chk02_RsltR (Rqmt_Chk01 → Chk02) */
		protected Map_Chk02_RsltR_Rqmt_Chk01_RsltR<Chk02_RsltR,Rqmt_Chk01_RsltR> createMap_Chk02_RsltR_Rqmt_Chk01_RsltR() {
			return new Map_Chk02_RsltR_Rqmt_Chk01_RsltR<Chk02_RsltR, Rqmt_Chk01_RsltR>();
		}

		/** Rqmt_Chk01_RsltR → Chk02_RsltR (Rqmt_Chk01 → Chk02) */
		public class Map_Chk02_RsltR_Rqmt_Chk01_RsltR<D extends Chk02_RsltR, S extends Rqmt_Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Chk02_RsltR.$peg_no, Rqmt_Chk01_RsltR.$peg_no);
				addColumnPathMap(Chk02_RsltR.$err_flg, Rqmt_Chk01_RsltR.$err_flg);
				addColumnPathMap(Chk02_RsltR.$data_crud_typ, Rqmt_Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(Chk02_RsltR.$mrp_typ, Rqmt_Chk01_RsltR.$mrp_typ);
				addColumnPathMap(Chk02_RsltR.$rqmt_no, Rqmt_Chk01_RsltR.$rqmt_no);
				addColumnPathMap(Chk02_RsltR.$upd_cntr, Rqmt_Chk01_RsltR.$upd_cntr);
			}
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 */
	public class Upd01 extends MSBCL_MstrPlnReg_MC_A.Upd01 {

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0(), up1());
			}
			catch (Exception e) {
				handleEx(e, up0(), up1());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk01();

			MCList<Chk01_RsltR> notErrL = up1().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callRqmtRegSrv(notErrL);
			}
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up1());

			// 上り電文の属性を変更する前に、下り電文にpeg_noと属性をコピーする
			copyPegNoAndAttr(down1(), up1());
			MCIndexKey idxKey = up0().createIndex(Chk01_HdrR.$peg_no);

			for (Chk01_RsltR r : up1()) {
				if (r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					r.rqmt_gnrt_typ(MSC_RQMT_GNRT_TYP.MNL.value());
				}
				else if (r.isStatusModify()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
				else if (r.isStatusDelete()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				else {
					r.setStatus(MCRow.NONE);
				}

				Chk01_HdrR hdrR = up0().getFirst(idxKey, r.hdr_peg_no());
				if (!isNull(hdrR)) {
					// メッセージ出力用に行番号のみを上段の行番号を設定する
					r.setGUIIndex(hdrR.getGUIIndex());
				}
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBCL_MstrPlnReg.Chk01 ope = MSBCL_MstrPlnReg.crtChk01();
			ope.up0().setAll(up0());
			ope.up1().setAll(up1());
			ope.exec();
			up0().setAll(ope.down0());
			up1().setAll(ope.down1());
		}

		/**
		 * 日次生産依頼登録サービスを実行する
		 */
		protected void callRqmtRegSrv(MCList<Chk01_RsltR> notErrL) {
			MSBCL_RqmtRegService.Rqmt_Upd01 ope = MSBCL_RqmtRegService.crtRqmt_Upd01();
			addAll(ope.up0(), notErrL, createMap_Rqmt_Chk01_RsltR_Chk01_RsltR());

			ope.exec();

			String[] srcCols = {Rqmt_Chk01_RsltR.$rqmt_no};
			String[] destCols = {Chk01_RsltR.$rqmt_no};
			copyByPegNo(notErrL, destCols, ope.down0(), srcCols);
		}

		protected void handleSuccess(MCList<Chk01_HdrR> l1, MCList<Chk01_RsltR> l2) {
			dbTran().commit();

			for (Chk01_HdrR r : l1) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
			for (Chk01_RsltR r : l2) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e, MCList<Chk01_HdrR> l1, MCList<Chk01_RsltR> l2) {
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

			for (Chk01_HdrR r : l1) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
			for (Chk01_RsltR r : l2) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());

			// up1の属性を変更しているため、setAllは使わない  @see editUp
			String[] downCols = new String[] {Chk01_RsltR.$hdr_peg_no, Chk01_RsltR.$rqmt_no, Chk01_RsltR.$rtn_sts_typ};
			copyByPegNo(down1(), downCols, up1(), downCols);
		}

		@Override
		protected <T extends MCRow> MCList<T> getSplitList(MCParam p) {
			@SuppressWarnings("unchecked")
			MCList<T> ret = (MCList<T>) up0();
			return ret;
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		@SuppressWarnings("unchecked")
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			MCIndexKey dtlIdx = up1().createIndex(Chk01_RsltR.$hdr_peg_no);

			List<MCOperation> opeL = new ArrayList<>();
			for (MCList<Chk01_HdrR> l : splitUp0(up0(), getSplitRowCount())) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_HdrR> up0L = (MCList<Chk01_HdrR>)ope.up(0);
				MCList<Chk01_RsltR> up1L = (MCList<Chk01_RsltR>)ope.up(1);

				up0L.setAll(l);
				for (Chk01_HdrR rsltR : l) {
					up1L.addAll(up1().subList(dtlIdx, rsltR.peg_no()));
				}
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 紐付けＮＯ１が同一の上り電文行が、同じMCListに格納されるように分割する
		 *@param list クライアントから渡された上り電文
		 *@param max １スレッドあたりの最大件数
		 *@return
		 */
		protected List<MCList<Chk01_HdrR>> splitUp0(MCList<Chk01_HdrR> list, int max) {
			List<MCList<Chk01_HdrR>> ret = new ArrayList<>();
			MCList<Chk01_HdrR> tmp = MCList.create(Chk01_HdrR.class);
			for (Chk01_HdrR r : list) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk01_HdrR.class);
				}
				tmp.add(r);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		/** Chk01_RsltR → Rqmt_Chk01_RsltR (Upd01 → Rqmt_Upd01) */
		protected Map_Rqmt_Chk01_RsltR_Chk01_RsltR<Rqmt_Chk01_RsltR, Chk01_RsltR> createMap_Rqmt_Chk01_RsltR_Chk01_RsltR() {
			return new Map_Rqmt_Chk01_RsltR_Chk01_RsltR<Rqmt_Chk01_RsltR, Chk01_RsltR>();
		}

		/** Chk01_RsltR → Rqmt_Chk01_RsltR (Upd01 → Rqmt_Upd01) */
		public class Map_Rqmt_Chk01_RsltR_Chk01_RsltR<D extends Rqmt_Chk01_RsltR, S extends Chk01_RsltR>
				extends MCRowMapper<D, S> {
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
	public class Del01 extends MSBCL_MstrPlnReg_MC_A.Del01 {

		@Override
		protected void call() {
			try {
				super.call();
				handleSuccess(up0(), up1());
			}
			catch (Exception e) {
				handleEx(e, up0(), up1());
			}
			finally {
				setDown();
			}
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk02();

			MCList<Chk02_RsltR> notErrL = up1().subList(Chk02_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				callRqmtDelSrv(notErrL);
			}
		}

		/**
		 * 上り電文を編集する
		 */
		protected void editUp() {
			setPegNo(Chk02_RsltR.$peg_no, up1());

			// 上り電文の属性を変更する前に、下り電文にpeg_noと属性をコピーする
			copyPegNoAndAttr(down1(), up1());
			MCIndexKey idxKey = up0().createIndex(Chk02_HdrR.$peg_no);

			for (Chk02_RsltR r : up1()) {
				r.setStatus(MCRow.DELETE);
				r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());

				Chk02_HdrR hdrR = up0().getFirst(idxKey, r.hdr_peg_no());
				if (!isNull(hdrR)) {
					// メッセージ出力用に行番号のみを上段の行番号を設定する
					r.setGUIIndex(hdrR.getGUIIndex());
				}
			}
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBCL_MstrPlnReg.Chk02 ope = MSBCL_MstrPlnReg.crtChk02();
			ope.up0().setAll(up0());
			ope.up1().setAll(up1());

			ope.exec();

			up0().setAll(ope.down0());
			up1().setAll(ope.down1());
		}

		/**
		 * 日次生産依頼登録サービスを実行する
		 */
		protected void callRqmtDelSrv(MCList<Chk02_RsltR> notErrL) {
			MSBCL_RqmtRegService.Rqmt_Upd01 ope = MSBCL_RqmtRegService.crtRqmt_Upd01();
			addAll(ope.up0(), notErrL, createMap_Rqmt_Chk01_RsltR_Chk02_RsltR());

			ope.exec();
		}

		protected void handleSuccess(MCList<Chk02_HdrR> l1, MCList<Chk02_RsltR> l2) {
			dbTran().commit();
			for (Chk02_HdrR r : l1) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
			for (Chk02_RsltR r : l2) {
				if (!r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		protected void handleEx(Exception e, MCList<Chk02_HdrR> l1, MCList<Chk02_RsltR> l2) {
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

			for (Chk02_HdrR r : l1) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
			for (Chk02_RsltR r : l2) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());

			// up1の属性を変更しているため、setAllは使わない  @see editUp
			String[] downCols = new String[] {Chk02_RsltR.$hdr_peg_no, Chk02_RsltR.$rqmt_no, Chk02_RsltR.$rtn_sts_typ};
			copyByPegNo(down1(), downCols, up1(), downCols);
		}

		@Override
		protected <T extends MCRow> MCList<T> getSplitList(MCParam p) {
			@SuppressWarnings("unchecked")
			MCList<T> ret = (MCList<T>) up0();
			return ret;
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		@SuppressWarnings("unchecked")
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			MCIndexKey dtlIdx = up1().createIndex(Chk02_RsltR.$hdr_peg_no);

			List<MCOperation> opeL = new ArrayList<>();
			for (MCList<Chk02_HdrR> l : splitUp0(up0(), getSplitRowCount())) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk02_HdrR> up0L = (MCList<Chk02_HdrR>)ope.up(0);
				MCList<Chk02_RsltR> up1L = (MCList<Chk02_RsltR>)ope.up(1);

				up0L.setAll(l);
				for (Chk02_HdrR rsltR : l) {
					up1L.addAll(up1().subList(dtlIdx, rsltR.peg_no()));
				}
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 紐付けＮＯ１が同一の上り電文行が、同じMCListに格納されるように分割する
		 *@param list クライアントから渡された上り電文
		 *@param max １スレッドあたりの最大件数
		 *@return
		 */
		protected List<MCList<Chk02_HdrR>> splitUp0(MCList<Chk02_HdrR> list, int max) {
			List<MCList<Chk02_HdrR>> ret = new ArrayList<>();
			MCList<Chk02_HdrR> tmp = MCList.create(Chk02_HdrR.class);
			for (Chk02_HdrR r : list) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk02_HdrR.class);
				}
				tmp.add(r);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		/** Chk02_RsltR → Rqmt_Chk01_RsltR (Upd01 → Rqmt_Upd01) */
		protected Map_Rqmt_Chk01_RsltR_Chk02_RsltR<Rqmt_Chk01_RsltR, Chk02_RsltR> createMap_Rqmt_Chk01_RsltR_Chk02_RsltR() {
			return new Map_Rqmt_Chk01_RsltR_Chk02_RsltR<Rqmt_Chk01_RsltR, Chk02_RsltR>();
		}

		/** Chk02_RsltR → Rqmt_Chk01_RsltR (Upd01 → Rqmt_Upd01) */
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

	/**
	 * Srch01オペレーション.<p>
	 *
	 */
	public class Srch01 extends MSBCL_MstrPlnReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			MCList<Srch01_MtrxRsltR> mst = getMaster();
			if (mst.size() > 0){
				MCList<Srch01_MtrxRsltR> req = getSumRqmt();
				MCList<Srch01_MtrxRsltR> prcdReq = getSumPrcdRqmt();
				MCList<Srch01_MtrxRsltR> shipSchd = getSumShipSchd();

				down0().addAll(mergeList(mst, req, prcdReq, shipSchd));
				down1().addAll(getRqmt());
				down1().addAll(getPrcdRqmt());
				down2().addAll(getMaxQty(mst));
			}
		}

		/** 日付部分の項目名 */
		protected String[] _qtyCols = null;

		/** 項目名の配列を返します */
		protected String[] getColnm() {
			if (_qtyCols == null) {
				_qtyCols = new String[] {Srch01_MaxQtyRsltR.$qty_00,
						Srch01_MaxQtyRsltR.$qty_01, Srch01_MaxQtyRsltR.$qty_02,
						Srch01_MaxQtyRsltR.$qty_03, Srch01_MaxQtyRsltR.$qty_04,
						Srch01_MaxQtyRsltR.$qty_05, Srch01_MaxQtyRsltR.$qty_06,
						Srch01_MaxQtyRsltR.$qty_07, Srch01_MaxQtyRsltR.$qty_08,
						Srch01_MaxQtyRsltR.$qty_09, Srch01_MaxQtyRsltR.$qty_10,
						Srch01_MaxQtyRsltR.$qty_11, Srch01_MaxQtyRsltR.$qty_12,
						Srch01_MaxQtyRsltR.$qty_13, Srch01_MaxQtyRsltR.$qty_14,
						Srch01_MaxQtyRsltR.$qty_15, Srch01_MaxQtyRsltR.$qty_16,
						Srch01_MaxQtyRsltR.$qty_17, Srch01_MaxQtyRsltR.$qty_18,
						Srch01_MaxQtyRsltR.$qty_19, Srch01_MaxQtyRsltR.$qty_20,
						Srch01_MaxQtyRsltR.$qty_21, Srch01_MaxQtyRsltR.$qty_22,
						Srch01_MaxQtyRsltR.$qty_23, Srch01_MaxQtyRsltR.$qty_24,
						Srch01_MaxQtyRsltR.$qty_25, Srch01_MaxQtyRsltR.$qty_26,
						Srch01_MaxQtyRsltR.$qty_27, Srch01_MaxQtyRsltR.$qty_28,
						Srch01_MaxQtyRsltR.$qty_29, Srch01_MaxQtyRsltR.$qty_30,
						Srch01_MaxQtyRsltR.$qty_31, Srch01_MaxQtyRsltR.$qty_32,
						Srch01_MaxQtyRsltR.$qty_33, Srch01_MaxQtyRsltR.$qty_34,
						Srch01_MaxQtyRsltR.$qty_35, Srch01_MaxQtyRsltR.$qty_36,
						Srch01_MaxQtyRsltR.$qty_37, Srch01_MaxQtyRsltR.$qty_38,
						Srch01_MaxQtyRsltR.$qty_39, Srch01_MaxQtyRsltR.$qty_40,
						Srch01_MaxQtyRsltR.$qty_41, Srch01_MaxQtyRsltR.$qty_42,
						Srch01_MaxQtyRsltR.$qty_43, Srch01_MaxQtyRsltR.$qty_44,
						Srch01_MaxQtyRsltR.$qty_45, Srch01_MaxQtyRsltR.$qty_46,
						Srch01_MaxQtyRsltR.$qty_47, Srch01_MaxQtyRsltR.$qty_48,
						Srch01_MaxQtyRsltR.$qty_49, Srch01_MaxQtyRsltR.$qty_50,
						Srch01_MaxQtyRsltR.$qty_51, Srch01_MaxQtyRsltR.$qty_52,
						Srch01_MaxQtyRsltR.$qty_53, Srch01_MaxQtyRsltR.$qty_54,
						Srch01_MaxQtyRsltR.$qty_55, Srch01_MaxQtyRsltR.$qty_56,
						Srch01_MaxQtyRsltR.$qty_57, Srch01_MaxQtyRsltR.$qty_58,
						Srch01_MaxQtyRsltR.$qty_59, Srch01_MaxQtyRsltR.$qty_60,
						Srch01_MaxQtyRsltR.$qty_61, Srch01_MaxQtyRsltR.$qty_62,
						Srch01_MaxQtyRsltR.$qty_63, Srch01_MaxQtyRsltR.$qty_64,
						Srch01_MaxQtyRsltR.$qty_65, Srch01_MaxQtyRsltR.$qty_66,
						Srch01_MaxQtyRsltR.$qty_67, Srch01_MaxQtyRsltR.$qty_68,
						Srch01_MaxQtyRsltR.$qty_69, Srch01_MaxQtyRsltR.$qty_70,
						Srch01_MaxQtyRsltR.$qty_71, Srch01_MaxQtyRsltR.$qty_72,
						Srch01_MaxQtyRsltR.$qty_73, Srch01_MaxQtyRsltR.$qty_74,
						Srch01_MaxQtyRsltR.$qty_75, Srch01_MaxQtyRsltR.$qty_76,
						Srch01_MaxQtyRsltR.$qty_77, Srch01_MaxQtyRsltR.$qty_78,
						Srch01_MaxQtyRsltR.$qty_79, Srch01_MaxQtyRsltR.$qty_80,
						Srch01_MaxQtyRsltR.$qty_81, Srch01_MaxQtyRsltR.$qty_82,
						Srch01_MaxQtyRsltR.$qty_83, Srch01_MaxQtyRsltR.$qty_84,
						Srch01_MaxQtyRsltR.$qty_85, Srch01_MaxQtyRsltR.$qty_86,
						Srch01_MaxQtyRsltR.$qty_87, Srch01_MaxQtyRsltR.$qty_88,
						Srch01_MaxQtyRsltR.$qty_89, Srch01_MaxQtyRsltR.$qty_90,
						Srch01_MaxQtyRsltR.$qty_91, Srch01_MaxQtyRsltR.$qty_92,
						Srch01_MaxQtyRsltR.$qty_93
				};
			}
			return _qtyCols;
		}

		/** 
		 * ＭＰＳ品目マスタを取得する
		 * 検索範囲の日付毎レコードとして作成する
		 */
		protected MCList<Srch01_MtrxRsltR> getMaster() {
			MCList<Srch01_MtrxRsltR> mst = MCList.create(Srch01_MtrxRsltR.class);
			MCQueryPlan sql = MSBCL0020_MAM_MPS_ITM_S01();
			executeQuery(mst, sql, up0());

			MCList<Srch01_MtrxRsltR> rslt = MCList.create(Srch01_MtrxRsltR.class);
			for (Srch01_MtrxRsltR row : mst) {
				row.rqmt_qty(MCNumber.ZERO);
				row.prcd_rqmt_qty(MCNumber.ZERO);
				row.ship_schd_qty(MCNumber.ZERO);
				for (MCDate dt = up0().due_dt_fr(); dt.lte(up0().due_dt_to()); dt = dt.addDay(1)) {
					Srch01_MtrxRsltR copyRow = row.clone();
					copyRow.due_dt(dt);
					rslt.add(copyRow);
				}
			}
			return rslt;
		}

		/** 日次生産依頼サマリ情報を取得する */
		protected MCList<Srch01_MtrxRsltR> getSumRqmt() {
			MCList<Srch01_MtrxRsltR> sum = MCList.create(Srch01_MtrxRsltR.class);
			MCQueryPlan sql = MSBCL0020_MST_RQMT_S02();
			executeQuery(sum, sql, up0());

			return sum;
		}

		/** 先行手配日次生産依頼サマリ情報を取得する */
		protected MCList<Srch01_MtrxRsltR> getSumPrcdRqmt() {
			MCList<Srch01_MtrxRsltR> sum = MCList.create(Srch01_MtrxRsltR.class);
			MCQueryPlan sql = MSBCL0020_MST_PRCD_RQMT_S02();
			executeQuery(sum, sql, up0());

			return sum;
		}

		/** 出荷予定サマリ情報を取得する */
		protected MCList<Srch01_MtrxRsltR> getSumShipSchd() {
			MCList<Srch01_MtrxRsltR> sum = MCList.create(Srch01_MtrxRsltR.class);
			MCQueryPlan sql = MSBCL0020_MST_SHIP_SCHD_S01();
			executeQuery(sum, sql, up0());

			return sum;
		}

		/** マスタを基準に各種情報をマージする */
		protected MCList<Srch01_MtrxRsltR> mergeList(MCList<Srch01_MtrxRsltR> mst,
				MCList<Srch01_MtrxRsltR> req, MCList<Srch01_MtrxRsltR> prcdReq, MCList<Srch01_MtrxRsltR> shipSchd) {

			// 日次生産依頼用マージキー
			String[] keys1 = new String[]{Srch01_MtrxRsltR.$itm_cd,
					Srch01_MtrxRsltR.$itm_sub1, Srch01_MtrxRsltR.$itm_sub2, Srch01_MtrxRsltR.$itm_sub3,
					Srch01_MtrxRsltR.$strg_loc_cd,
					Srch01_MtrxRsltR.$mfg_loc_cd,Srch01_MtrxRsltR.$sppl_cd,Srch01_MtrxRsltR.$rqst_loc_cd,
					Srch01_MtrxRsltR.$due_dt};
			// 出荷実績用マージキー
			String[] keys2 = new String[]{Srch01_MtrxRsltR.$itm_cd,
					Srch01_MtrxRsltR.$itm_sub1, Srch01_MtrxRsltR.$itm_sub2, Srch01_MtrxRsltR.$itm_sub3,
					Srch01_MtrxRsltR.$strg_loc_cd, Srch01_MtrxRsltR.$due_dt};
			MCIndexKey reqKey = req.createIndex(keys1);
			MCIndexKey prcdReqKey = prcdReq.createIndex(keys1);
			MCIndexKey shipSchdKey = shipSchd.createIndex(keys2);

			mst.sort(Srch01_MtrxRsltR.$mps_grp_cd, Srch01_MtrxRsltR.$itm_cd,
					Srch01_MtrxRsltR.$itm_sub1, Srch01_MtrxRsltR.$itm_sub2, Srch01_MtrxRsltR.$itm_sub3);
			for (Srch01_MtrxRsltR row : mst) {
				Comparable<?>[] vals1 = new Comparable[]{row.itm_cd(),
						row.itm_sub1(), row.itm_sub2(), row.itm_sub3(),
						row.strg_loc_cd(),
						row.mfg_loc_cd(), row.sppl_cd(), row.rqst_loc_cd(),
						row.due_dt()};
				Comparable<?>[] vals2 = new Comparable[]{row.itm_cd(),
						row.itm_sub1(), row.itm_sub2(), row.itm_sub3(),
						row.strg_loc_cd(), row.due_dt()};

				Srch01_MtrxRsltR subReq = req.getFirst(reqKey, vals1);
				if (!isNull(subReq)) {
					row.rqmt_qty(subReq.rqmt_qty());
				}

				Srch01_MtrxRsltR subPrcdReq = prcdReq.getFirst(prcdReqKey, vals1);
				if (!isNull(subPrcdReq)) {
					row.prcd_rqmt_qty(subPrcdReq.rqmt_qty());
				}

				Srch01_MtrxRsltR subShipSchd = shipSchd.getFirst(shipSchdKey, vals2);
				if (!isNull(subShipSchd)) {
					row.ship_schd_qty(subShipSchd.rqmt_qty());
				}

				if (!isNullOrNullVal(row.mfg_loc_cd()) && !isNullOrNullVal(row.mfg_loc_nm())){
					row.proc_cd(row.mfg_loc_cd());
					row.proc_nm(row.mfg_loc_nm());
				}
				else if (!isNullOrNullVal(row.sppl_cd()) && !isNullOrNullVal(row.sppl_nm())){
					row.proc_cd(row.sppl_cd());
					row.proc_nm(row.sppl_nm());
				}
				else if (!isNullOrNullVal(row.rqst_loc_cd()) && !isNullOrNullVal(row.rqst_loc_nm())){
					row.proc_cd(row.rqst_loc_cd());
					row.proc_nm(row.rqst_loc_nm());
				}
			}

			removeDelFlgNoTran(mst);

			return mst;
		}

		/** ＭＰＳ品目マスタが論理削除されており、かつ日次生産依頼も存在しない行を削除する */
		protected void removeDelFlgNoTran(MCList<Srch01_MtrxRsltR> mst){
			MCList<Srch01_MtrxRsltR> delL = mst.subList(Srch01_MtrxRsltR.$mst_del_flg, true);
			if(delL.isEmpty()) {
				return;
			}

			String[] grp = new String[]{Srch01_MtrxRsltR.$mps_grp_cd, Srch01_MtrxRsltR.$itm_cd,
					Srch01_MtrxRsltR.$itm_sub1, Srch01_MtrxRsltR.$itm_sub2, Srch01_MtrxRsltR.$itm_sub3,
					Srch01_MtrxRsltR.$strg_loc_cd};
			MCList<Srch01_MtrxRsltR> removeList = MCList.create(Srch01_MtrxRsltR.class);
			for (MCList<Srch01_MtrxRsltR> l: delL.groupList(grp)) {
				MCNumber sumRqmtQty = l.sum(Srch01_MtrxRsltR.$rqmt_qty);
				MCNumber sumPrcdRqmtQty = l.sum(Srch01_MtrxRsltR.$prcd_rqmt_qty);
				if (isSame(sumRqmtQty, MCNumber.ZERO) && isSame(sumPrcdRqmtQty, MCNumber.ZERO)) {
					removeList.addAll(l);
				}
			}
			if (removeList.size() > 0){
				mst.removeAll(removeList);
			}
		}

		/** 日次生産依頼情報を取得する */
		protected MCList<Srch01_RsltR> getRqmt() {
			MCList<Srch01_RsltR> rqmt = MCList.create(Srch01_RsltR.class);
			MCQueryPlan sql = MSBCL0020_MST_RQMT_S01();
			executeQuery(rqmt, sql, up0());

			return rqmt;
		}

		/** 先行手配日次生産依頼情報を取得する */
		protected MCList<Srch01_RsltR> getPrcdRqmt() {
			MCList<Srch01_RsltR> rqmt = MCList.create(Srch01_RsltR.class);
			MCQueryPlan sql = MSBCL0020_MST_PRCD_RQMT_S01();
			executeQuery(rqmt, sql, up0());

			return rqmt;
		}

		protected MCList<Srch01_MaxQtyRsltR> getMaxQty(MCList<Srch01_MtrxRsltR> mst) {
			MCList<MAM_MPS_GRP_R> mpsGrpL = MCList.create(MAM_MPS_GRP_R.class);
			dbSelectKey("MSBCL0020_MAM_MPS_GRP_S01", mpsGrpL, MCQueryApiBuilder.create(MAM_MPS_GRP_R.create("T")), mst.groupBy(Srch01_MtrxRsltR.$mps_grp_cd));

			MCList<Srch01_MaxQtyRsltR> retL = MCList.create(Srch01_MaxQtyRsltR.class);
			for (MAM_MPS_GRP_R mpsGrp : mpsGrpL) {
				Srch01_MaxQtyRsltR retR = Srch01_MaxQtyRsltR.create();
				retR.mps_grp_cd(mpsGrp.mps_grp_cd());
				int i = 0;
				for (MCDate dt = up0().due_dt_fr(); dt.lte(up0().due_dt_to()); dt = dt.addDay(1)) {
					retR.setNumber(getColnm()[i++], getProdQtyByMonth(mpsGrp, dt.getMonth()));
				}
				retL.add(retR);
			}
			return retL;
		}

		protected MCNumber getProdQtyByMonth(MAM_MPS_GRP_R mpsGrp, int month) {
			switch (month) {
				case MCDate.JAN:
					return mpsGrp.mon01_prod_qty();
				case MCDate.FEB:
					return mpsGrp.mon02_prod_qty();
				case MCDate.MAR:
					return mpsGrp.mon03_prod_qty();
				case MCDate.APR:
					return mpsGrp.mon04_prod_qty();
				case MCDate.MAY:
					return mpsGrp.mon05_prod_qty();
				case MCDate.JUN:
					return mpsGrp.mon06_prod_qty();
				case MCDate.JUL:
					return mpsGrp.mon07_prod_qty();
				case MCDate.AUG:
					return mpsGrp.mon08_prod_qty();
				case MCDate.SEP:
					return mpsGrp.mon09_prod_qty();
				case MCDate.OCT:
					return mpsGrp.mon10_prod_qty();
				case MCDate.NOV:
					return mpsGrp.mon11_prod_qty();
				case MCDate.DEC:
					return mpsGrp.mon12_prod_qty();
				default:
					return MCNumber.ZERO;
			}
		}
	}

	//FMCB CUSTOM END
}