package mcframe.serverMSBF.MSBFL0100;

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
import mcframe.serverMSBF.MSBFL0100.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBF.MSBFL0100.Query.*;
import mcframe.commonCore.param.MCParam;
import mcframe.serverMSBF.MSBFL5010.*;
import mcframe.serverMSBF.MSBFL5110.*;
import mcframe.serverMSBF.MSBFL5210.*;
import mcframe.serverMSBF.MSBFL5330.*;
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverFXUC.FXUCL0170.*;
import mcframe.serverMAUC.MAUCL5010.*;
import java.util.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_MrktJudgReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_MrktJudgReg_MC extends MSBFL_MrktJudgReg_MC_A{
	//FMCB CUSTOM START
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 市場出荷判定を検索する<br>
	 */
	public class Srch01 extends MSBFL_MrktJudgReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 検索条件設定
			setUpTmpCol(up0());

			// 検索する
			MCQueryPlan inspSchdSql = MSBFL0100_MST_MRKT_JUDG_S01();
			searchForDL(inspSchdSql, up0(), down0());
		}

		@Override
		protected void editListMain() {
			super.editListMain();

			for (Srch01_RsltR r : down0()) {
				if (!isNullOr(r.mfg_so_aprv_typ(), r.quality_mng_typ(), r.mfg_mng_typ())
						&& (MSC_DEVIANT_TYP.isNO_EXIST(r.deviant_typ()) || (MSC_DEVIANT_TYP.isEXIST(r.deviant_typ()) && !isNull(r.deviant_msr_typ())))
						&& ((MSC_PROD_ITM_INFO_TYP.isNO_EXIST(r.prod_itm_info_typ()) && MSC_CHD_ITM_INFO_TYP.isNO_EXIST(r.chd_itm_info_typ()))
								|| (((MSC_PROD_ITM_INFO_TYP.isEXIST(r.prod_itm_info_typ()) && !isNull(r.chd_itm_info_typ())) || (MSC_CHD_ITM_INFO_TYP.isEXIST(r.chd_itm_info_typ()) && !isNull(r.prod_itm_info_typ())))
										&& !isNull(r.intr_rmrks())))) {
					r.input_flg(true);
				}
				else {
					r.input_flg(false);
				}
			}
		}
	}

	/**
	 * 検索条件に対する一時カラムを設定する
	 * @param up
	 */
	protected void setUpTmpCol(Srch01_CndR up) {
		// 市場出荷判定状況区分
		if (up.opn_flg()) {
			up.addStringColumn("TMP_MRKT_JUDG_STS_TYP_OPN", MSC_MRKT_JUDG_STS_TYP.OPN.value());
		}
		if (up.acpt_flg()) {
			up.addStringColumn("TMP_MRKT_JUDG_STS_TYP_ACPT", MSC_MRKT_JUDG_STS_TYP.ACPT.value());
		}
		if (up.not_acpt_flg()) {
			up.addStringColumn("TMP_MRKT_JUDG_STS_TYP_NOT_ACPT", MSC_MRKT_JUDG_STS_TYP.NOT_ACPT.value());
		}
		// 主担当のみ
		up.addStringColumn("TMP_MAIN_FLG_CUTOFF", toTrueStr(up.main_flg()));
		// 未入力、入力済
		if (up.not_input_flg() && !up.input_flg()) {
			up.addStringColumn("TMP_NOT_INPUT_FLG_CUTOFF", toTrueStr(true));
			up.addStringColumn("TMP_INPUT_FLG_CUTOFF", toTrueStr(false));
		}
		else if (!up.not_input_flg() && up.input_flg()) {
			up.addStringColumn("TMP_NOT_INPUT_FLG_CUTOFF", toTrueStr(false));
			up.addStringColumn("TMP_INPUT_FLG_CUTOFF", toTrueStr(true));
		}
		else {
			up.addStringColumn("TMP_NOT_INPUT_FLG_CUTOFF", toTrueStr(false));
			up.addStringColumn("TMP_INPUT_FLG_CUTOFF", toTrueStr(false));
		}
		// 記録書
		if (up.mrkt_judg_prnt_flg() && up.mrkt_judg_not_prnt_flg()) {
			up.addStringColumn("TMP_MRKT_JUDG_FLG_CUTOFF", toFalseStr(true));
		} 
		else if (!up.mrkt_judg_prnt_flg() && !up.mrkt_judg_not_prnt_flg()) {
			up.addStringColumn("TMP_MRKT_JUDG_FLG_CUTOFF", toFalseStr(true));
		}
		else if (up.mrkt_judg_prnt_flg()) {
			up.addStringColumn("TMP_MRKT_JUDG_FLG_CUTOFF", toTrueStr(true));
		}
		else if (up.mrkt_judg_not_prnt_flg()) {
			up.addStringColumn("TMP_MRKT_JUDG_FLG_CUTOFF", toFalseStr(false));
		}

		// 操作種別
		if (isSame(up.ope(), MSC_MRKT_JUDG_REG_OPE.OPE_UPD_JUDG.value()) || isSame(up.ope(), MSC_MRKT_JUDG_REG_OPE.OPE_DEL_JUDG.value())) {
			up.addStringColumn("TMP_OPE_JUDG_FLG_CUTOFF", toTrueStr(true));
			up.addStringColumn("TMP_NOT_OPE_JUDG_FLG_CUTOFF", toTrueStr(false));
		}
		else {
			up.addStringColumn("TMP_OPE_JUDG_FLG_CUTOFF", toTrueStr(false));
			up.addStringColumn("TMP_NOT_OPE_JUDG_FLG_CUTOFF", toTrueStr(true));
		}

		// 承認役割チェック
		// ログインユーザ
		up.addStringColumn("TMP_LOGIN_USR_ID", mcframe.serverCore.sys.MCSys.user.ID());
		// 運用日付
		up.addDateColumn("TMP_TODAY", getToday());
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 製造承認、品質管理、工場出荷承認の判定結果を取得する<br>
	 */
	public class Srch02 extends MSBFL_MrktJudgReg_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			srchTypInfo();
		}

		/**
		 * 製造承認、品質管理、工場出荷承認の判定結果を取得する。
		 */
		protected void srchTypInfo() {
			down0().setAll(up0());

			MCList<MST_LOT_R> lotSelectL = selLotInfoL();
			MCList<MST_YIELD_ACT_R> yieldSelectL = selYieldActL();
			MCList<MST_INSP_INST_R> instSelectL = selInspInstL();
			MCList<MST_INSP_SCHD_R> schdSelectL = selInspSchdL();
			MCList<MST_PLNT_APRV_R> plntAprvSelectL = selPlntAprvL();

			// 製造管理結果設定
			setMfgMngTyp(lotSelectL, yieldSelectL);

			// 品質管理結果設定
			setQualityMngTyp(instSelectL, schdSelectL);

			// 製造所からの出荷承認結果設定
			setMfgSoAprvTyp(plntAprvSelectL);
		}

		/**
		 * ロット管理情報を取得する。
		 * @return
		 */
		protected MCList<MST_LOT_R> selLotInfoL() {
			MCList<MST_LOT_R> lotBindL = MCList.create(MST_LOT_R.class);
			MCList<MST_LOT_R> lotSelectL = MCList.create(MST_LOT_R.class);
			MST_LOT_R t = MST_LOT_R.create("T");
			MCQueryApiBuilder lotSelectL_bldr = MCQueryApiBuilder.create(t);

			addAll(lotBindL, up0(), createMap_MST_LOT_R_Srch02_RsltR());

			lotSelectL_bldr.addConstWhereWithAnd(t.mfg_aprv_sts_typ.isNotNull());
			dbSelectColumn("MSBFL0100_MST_LOT_S01", lotSelectL, lotSelectL_bldr, lotBindL, getCndCols());

			return lotSelectL;
		}

		/**
		 * 出来高実績情報を取得する。
		 * @return
		 */
		protected MCList<MST_YIELD_ACT_R> selYieldActL() {
			MCList<MST_YIELD_ACT_R> yieldActBindL = MCList.create(MST_YIELD_ACT_R.class);
			MCList<MST_YIELD_ACT_R> yieldActSelectL = MCList.create(MST_YIELD_ACT_R.class);
			MCQueryApiBuilder yieldActSelectL_bldr = MCQueryApiBuilder.create( MST_YIELD_ACT_R.create("T"));

			addAll(yieldActBindL, up0(), createMap_MST_YIELD_ACT_R_Srch02_RsltR());

			dbSelectColumn("MSBFL0100_MST_YIELD_ACT_S01", yieldActSelectL, yieldActSelectL_bldr, yieldActBindL, getCndCols());

			return yieldActSelectL;
		}

		/**
		 * 検査指図と検査実績から検査判定結果区分を取得する。
		 * @return
		 */
		protected MCList<MST_INSP_INST_R> selInspInstL() {
			MCList<MST_INSP_INST_R> instBindL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_ACT_R t2 = MST_INSP_ACT_R.create("T2");

			MCList<MST_INSP_INST_R> instSelectL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder instSelectL_bldr = MCQueryApiBuilder.create(t);

			addAll(instBindL, up0(), createMap_MST_INSP_INST_R_Srch02_RsltR());

			instSelectL_bldr.addLeftOuterJoin(t2, bracket( t.insp_no.eq(t2.insp_no)));

			instSelectL_bldr.addSelect(t2.insp_judg_rslt_typ);

			instSelectL_bldr.addConstWhereWithAnd(t.insp_sts_typ.eq(value(MSC_INSP_STS_TYP.JDG.value())));
			dbSelectColumn("MSBFL0100_MST_INSP_INST_S01", instSelectL, instSelectL_bldr, instBindL, getCndCols());

			return instSelectL;
		}

		/**
		 * 検査予定情報を取得する。
		 * @return
		 */
		protected MCList<MST_INSP_SCHD_R> selInspSchdL() {
			MCList<MST_INSP_SCHD_R> schdBindL = MCList.create(MST_INSP_SCHD_R.class);
			MCList<MST_INSP_SCHD_R> schdSelectL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdSelectL_bldr = MCQueryApiBuilder.create(t);
			
			addAll(schdBindL, up0(), createMap_MST_INSP_SCHD_R_Srch02_RsltR());

			schdSelectL_bldr.setWhere(t.insp_schd_sts_typ.eq(value(MSC_INSP_STS_TYP.YET.value())));
			dbSelectColumn("MSBFL0100_MST_INSP_SCHD_S01", schdSelectL, schdSelectL_bldr, schdBindL, getCndCols());

			return schdSelectL;
		}

		/**
		 * 工場出荷承認ヘッダ情報を取得する。
		 * @return
		 */
		protected MCList<MST_PLNT_APRV_R> selPlntAprvL() {
			MCList<MST_PLNT_APRV_R> plntAprvBindL = MCList.create(MST_PLNT_APRV_R.class);
			MCList<MST_PLNT_APRV_R> plntAprvSelectL = MCList.create(MST_PLNT_APRV_R.class);
			MCQueryApiBuilder plntAprvSelectL_bldr = MCQueryApiBuilder.create(MST_PLNT_APRV_R.create("T"));

			addAll(plntAprvBindL, up0(), createMap_MST_PLNT_APRV_R_Srch02_RsltR());

			dbSelectColumn("MSBFL0100_MST_PLNT_APRV_S01", plntAprvSelectL, plntAprvSelectL_bldr, plntAprvBindL, getCndCols());

			return plntAprvSelectL;
		}

		/**
		 * 製造所からの出荷承認結果を設定する。
		 * @param selectL
		 */
		protected void setMfgSoAprvTyp(MCList<MST_PLNT_APRV_R> selectL) {
			MCIndexKey idxkey = selectL.createIndex(getCndCols());
			for (Srch02_RsltR r : down0()) {
				MCList<MST_PLNT_APRV_R> subL = selectL.subList(idxkey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lot_no());
				if (!isNull(subL)) {
					MCList<MST_PLNT_APRV_R> acptL = subL.subList(MST_PLNT_APRV_R.$plnt_aprv_sts_typ, MSC_PLNT_APRV_STS_TYP.ACPT.value());
					MCList<MST_PLNT_APRV_R> rjctL = subL.subList(MST_PLNT_APRV_R.$plnt_aprv_sts_typ, MSC_PLNT_APRV_STS_TYP.RJCT.value());
					
					// 承認結果が全て承認済みなら、判定：可
					if (!isNull(acptL) && subL.size() == acptL.size()) {
						r.mfg_so_aprv_typ(MSC_MFG_SO_APRV_TYP.OK.value());
					}
					// 承認結果が全て却下なら、判定：不可
					else if (!isNull(rjctL) && subL.size() == rjctL.size()) {
						r.mfg_so_aprv_typ(MSC_MFG_SO_APRV_TYP.NG.value());
					}
				}
			}
		}

		/**
		 * 品質管理結果を設定する。
		 */
		protected void setQualityMngTyp(MCList<MST_INSP_INST_R> instL, MCList<MST_INSP_SCHD_R> schdL) {
			MCIndexKey instIdxkey = instL.createIndex(getCndCols());
			MCIndexKey schdIdxkey = schdL.createIndex(getCndCols());
	
			for (Srch02_RsltR r : down0()) {
				MCList<MST_INSP_INST_R> subInstL = instL.subList(instIdxkey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lot_no());
				MCList<MST_INSP_SCHD_R> subSchdL = schdL.subList(schdIdxkey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lot_no());
				if (!isNull(subInstL) && isNull(subSchdL)) {
					int okCnt = subInstL.subList(MST_INSP_ACT_R.$insp_judg_rslt_typ, MSC_INSP_JUDG_RSLT_TYP.OK.value()).size();
					int ngCnt = subInstL.subList(MST_INSP_ACT_R.$insp_judg_rslt_typ, MSC_INSP_JUDG_RSLT_TYP.NG.value()).size();
					int spCnt = subInstL.subList(MST_INSP_ACT_R.$insp_judg_rslt_typ, MSC_INSP_JUDG_RSLT_TYP.SP.value()).size();
					
					// 判定結果が全て(合格、特採)なら、判定：可
					if ((okCnt + spCnt) == subInstL.size()) {
						r.quality_mng_typ(MSC_QUALITY_MNG_TYP.OK.value());
					}
					else if (ngCnt == subInstL.size()) {
						r.quality_mng_typ(MSC_QUALITY_MNG_TYP.NG.value());
					}
				}
			}
		}

		/**
		 * 製造管理結果を設定する。
		 * @param lotL
		 * @param yieldActL
		 */
		protected void setMfgMngTyp(MCList<MST_LOT_R> lotL, MCList<MST_YIELD_ACT_R> yieldActL) {
			MCIndexKey lotIdxkey = lotL.createIndex(getCndCols());
			MCIndexKey yieldIdxkey = yieldActL.createIndex(getCndCols());
	
			for (Srch02_RsltR r : down0()) {
				MCList<MST_LOT_R> subLotL = lotL.subList(lotIdxkey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lot_no());
				MCList<MST_YIELD_ACT_R> subYieldL = yieldActL.subList(yieldIdxkey, r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.lot_no());
				if (!isNull(subLotL) && !isNull(subYieldL)) {
					int lotCnt = subLotL.subList(MST_LOT_R.$mfg_aprv_sts_typ, MSC_MFG_APRV_STS_TYP.ACT_ACPT.value()).size();
					int yieldCnt = subYieldL.subList(MST_YIELD_ACT_R.$yield_typ, MAC_YIELD_TYP.GOOD.value()).size();
					
					// 承認結果が全て記録承認済なら、判定：可
					if (subLotL.size() == lotCnt && subYieldL.size() == yieldCnt) {
						r.mfg_mng_typ(MSC_MFG_SO_APRV_TYP.OK.value());
					}
				}
			}
		}

		protected String[] getCndCols() {
			return new String[] {Srch02_RsltR.$itm_cd, Srch02_RsltR.$itm_sub1, Srch02_RsltR.$itm_sub2, Srch02_RsltR.$itm_sub3, Srch02_RsltR.$lot_no};
		}

		protected Map_MST_LOT_R_Srch02_RsltR<MST_LOT_R,Srch02_RsltR> createMap_MST_LOT_R_Srch02_RsltR() {
			return new Map_MST_LOT_R_Srch02_RsltR<MST_LOT_R, Srch02_RsltR>();
		}

		public class Map_MST_LOT_R_Srch02_RsltR<D extends MST_LOT_R, S extends Srch02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_LOT_R.$itm_cd, Srch02_RsltR.$itm_cd);
				addColumnPathMap(MST_LOT_R.$itm_sub1, Srch02_RsltR.$itm_sub1);
				addColumnPathMap(MST_LOT_R.$itm_sub2, Srch02_RsltR.$itm_sub2);
				addColumnPathMap(MST_LOT_R.$itm_sub3, Srch02_RsltR.$itm_sub3);
				addColumnPathMap(MST_LOT_R.$lot_no, Srch02_RsltR.$lot_no);

			}
		}

		protected Map_MST_YIELD_ACT_R_Srch02_RsltR<MST_YIELD_ACT_R,Srch02_RsltR> createMap_MST_YIELD_ACT_R_Srch02_RsltR() {
			return new Map_MST_YIELD_ACT_R_Srch02_RsltR<MST_YIELD_ACT_R, Srch02_RsltR>();
		}

		public class Map_MST_YIELD_ACT_R_Srch02_RsltR<D extends MST_YIELD_ACT_R, S extends Srch02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_YIELD_ACT_R.$itm_cd, Srch02_RsltR.$itm_cd);
				addColumnPathMap(MST_YIELD_ACT_R.$itm_sub1, Srch02_RsltR.$itm_sub1);
				addColumnPathMap(MST_YIELD_ACT_R.$itm_sub2, Srch02_RsltR.$itm_sub2);
				addColumnPathMap(MST_YIELD_ACT_R.$itm_sub3, Srch02_RsltR.$itm_sub3);
				addColumnPathMap(MST_YIELD_ACT_R.$lot_no, Srch02_RsltR.$lot_no);

			}
		}

		protected Map_MST_INSP_INST_R_Srch02_RsltR<MST_INSP_INST_R,Srch02_RsltR> createMap_MST_INSP_INST_R_Srch02_RsltR() {
			return new Map_MST_INSP_INST_R_Srch02_RsltR<MST_INSP_INST_R, Srch02_RsltR>();
		}

		public class Map_MST_INSP_INST_R_Srch02_RsltR<D extends MST_INSP_INST_R, S extends Srch02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_INSP_INST_R.$itm_cd, Srch02_RsltR.$itm_cd);
				addColumnPathMap(MST_INSP_INST_R.$itm_sub1, Srch02_RsltR.$itm_sub1);
				addColumnPathMap(MST_INSP_INST_R.$itm_sub2, Srch02_RsltR.$itm_sub2);
				addColumnPathMap(MST_INSP_INST_R.$itm_sub3, Srch02_RsltR.$itm_sub3);
				addColumnPathMap(MST_INSP_INST_R.$lot_no, Srch02_RsltR.$lot_no);

			}
		}

		protected Map_MST_INSP_SCHD_R_Srch02_RsltR<MST_INSP_SCHD_R,Srch02_RsltR> createMap_MST_INSP_SCHD_R_Srch02_RsltR() {
			return new Map_MST_INSP_SCHD_R_Srch02_RsltR<MST_INSP_SCHD_R, Srch02_RsltR>();
		}

		public class Map_MST_INSP_SCHD_R_Srch02_RsltR<D extends MST_INSP_SCHD_R, S extends Srch02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_INSP_SCHD_R.$itm_cd, Srch02_RsltR.$itm_cd);
				addColumnPathMap(MST_INSP_SCHD_R.$itm_sub1, Srch02_RsltR.$itm_sub1);
				addColumnPathMap(MST_INSP_SCHD_R.$itm_sub2, Srch02_RsltR.$itm_sub2);
				addColumnPathMap(MST_INSP_SCHD_R.$itm_sub3, Srch02_RsltR.$itm_sub3);
				addColumnPathMap(MST_INSP_SCHD_R.$lot_no, Srch02_RsltR.$lot_no);

			}
		}

		protected Map_MST_PLNT_APRV_R_Srch02_RsltR<MST_PLNT_APRV_R,Srch02_RsltR> createMap_MST_PLNT_APRV_R_Srch02_RsltR() {
			return new Map_MST_PLNT_APRV_R_Srch02_RsltR<MST_PLNT_APRV_R, Srch02_RsltR>();
		}

		public class Map_MST_PLNT_APRV_R_Srch02_RsltR<D extends MST_PLNT_APRV_R, S extends Srch02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_PLNT_APRV_R.$itm_cd, Srch02_RsltR.$itm_cd);
				addColumnPathMap(MST_PLNT_APRV_R.$itm_sub1, Srch02_RsltR.$itm_sub1);
				addColumnPathMap(MST_PLNT_APRV_R.$itm_sub2, Srch02_RsltR.$itm_sub2);
				addColumnPathMap(MST_PLNT_APRV_R.$itm_sub3, Srch02_RsltR.$itm_sub3);
				addColumnPathMap(MST_PLNT_APRV_R.$lot_no, Srch02_RsltR.$lot_no);

			}
		}
	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録・訂正前チェックを行う。<br>
	 */
	public class Chk01 extends MSBFL_MrktJudgReg_MC_A.Chk01 {
		// 品目マスタコンテナキャッシュ
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItmL = null;
		// 品目マスタ(工場・物流倉庫)コンテナキャッシュ
		protected FXUCL_MCDbcCache<MAM_ITM_SITE_R> _cacheItmSiteL = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initMasterData();
			super.doIt();

			setDown();
		}

		@Override
		protected MCMessageList updCntChkReq() {
			MCMessageList msgL = super.updCntChkReq();
			msgL.addAll(updCntChkReqCmn(up0()));
			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 市場出荷判定ヘッダの更新カウンタチェック
			msgL.addAll(chkMrktJudgUpdCnt());

			// データ補完
			compData();

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk01_RsltR> notErrL = getChkList(up0());

			// 条件付チェック
			msgL.addAll(chkItmsWithCnd(notErrL));

			// 承認対象チェック
			msgL.addAll(chkAprvRole(notErrL));

			// ロット管理対象チェック
			msgL.addAll(chkLot(notErrL));

			// 市場出荷判定の未登録チェック
			msgL.addAll(chkMrktJudg(notErrL));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * マスタ初期化
		 */
		protected void initMasterData() {
			initItmCache();
			initItmSiteCache();
		}

		/**
		 * データ補完
		 */
		protected void compData() {
			MCList<InspSchd_Srch01_CndR> cndL = MCList.create(InspSchd_Srch01_CndR.class);
			for (Chk01_RsltR upR : up0()) {
				MAM_ITM_R itmR = getItmR(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3());
				if (!MAC_DATA_CRUD_TYP.isUPD(upR.data_crud_typ()) && !MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
					// 更新役割ＣＤ
					upR.mrkt_judg_upd_role_cd(itmR.mrkt_judg_upd_role_cd());
					// 承認役割ＣＤ
					upR.mrkt_judg_role_cd(itmR.mrkt_judg_role_cd());
				}

				if (!MAC_DATA_CRUD_TYP.isDEL(upR.data_crud_typ())) {
					// 市場出荷判定対象ＦＬＧ
					upR.mrkt_judg_flg(itmR.mrkt_judg_flg());

					
					MAM_ITM_SITE_R itmSiteR = getItmSiteR(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3(), upR.site_cd());
					if (!isNull(itmSiteR)) {
						upR.ntfy_nm(itmSiteR.ntfy_nm());
					}
					if (upR.add_flg()) {
						InspSchd_Srch01_CndR cndR = InspSchd_Srch01_CndR.create();
						copy(cndR, upR, createMap_InspSchd_Srch01_CndR_Chk01_RsltR());
						cndR.base_dt(getToday());
						// 工場出荷承認に紐つかない市場出荷判定データの場合、検査指図が取得できないため、検査区分・製造場所・発注先といった情報がわからない
						// この場合、品目品管マスタの取得の優先順はロット検査と同様とするため、検査区分としてロット検査を渡している
						// ※工場物流倉庫が一致するレコードを優先して取得する
						cndR.insp_typ(MSC_INSP_TYP.LOT.value());
						cndR.to_site_cd(upR.to_site_cd());
						cndR.no_insp_srch_flg(true);

						cndL.add(cndR);
					}
				}
			}

			if (!cndL.isEmpty()) {
				
				MCList<InspSchd_Srch01_CndR> mstL = callInspSchdService(cndL);
				
				String[] destCols = new String[] {Chk01_RsltR.$no_mrkt_judg_flg};
				String[] srcCols = new String[] {InspSchd_Srch01_CndR.$no_mrkt_judg_flg};
				copyByPegNo(up0(), destCols, mstL, srcCols);
			}
		}

		/**
		 * 更新カウンタチェック前の必須チェック
		 * @param up
		 * @return
		 */
		protected MCMessageList updCntChkReqCmn(MCList<Chk01_RsltR> up) {
			MCMessageList msgL = new MCMessageList();
			for (Chk01_RsltR r : up) {
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					msgL.addAll(check(r, Chk01_RsltR.$mrkt_judg_no, new FXUCL_RequiredValidater()));
				}
			}
			return msgL;
		}

		/**
		 * 更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkMrktJudgUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_MRKT_JUDG_R> selectL = MCList.create(MST_MRKT_JUDG_R.class);
			MST_MRKT_JUDG_R t = MST_MRKT_JUDG_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.mrkt_judg_no);

			dbSelectKeyForUpdateNoWait("MSBFL0100_MST_MRKT_JUDG_S01", selectL, selectL_bldr, up0());

			MCIndexKey idxkey = selectL.createIndex(MST_MRKT_JUDG_R.$mrkt_judg_no);
			for (Chk01_RsltR r : up0()) {
				if (MAC_DATA_CRUD_TYP.isUPD(r.data_crud_typ())) {
					MST_MRKT_JUDG_R selectR = selectL.getFirst(idxkey, r.mrkt_judg_no());
					msgL.addAll(checkUpdCntrNE(r, Chk01_RsltR.$upd_cntr, selectR));
					
					if (!isNull(selectR)) {
						if (!isSame(r.itm_cd(), selectR.itm_cd())) {
							msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_cd, selectR.itm_cd(), r));
						}
						if (!isSame(r.itm_sub1(), selectR.itm_sub1())) {
							msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub1, selectR.itm_sub1(), r));
						}
						if (!isSame(r.itm_sub2(), selectR.itm_sub2())) {
							msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub2, selectR.itm_sub2(), r));
						}
						if (!isSame(r.itm_sub3(), selectR.itm_sub3())) {
							msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub3, selectR.itm_sub3(), r));
						}
						
						// データ補完
						// 更新役割ＣＤ
						r.mrkt_judg_upd_role_cd(selectR.mrkt_judg_upd_role_cd());
						// 承認役割ＣＤ
						r.mrkt_judg_role_cd(selectR.mrkt_judg_role_cd());
					}
				}
			}

			return msgL;
		}

		/**
		 * 条件付チェックを実行する。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkItmsWithCnd(MCList<Chk01_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk01_RsltR chkR : upL) {
				if (MAC_DATA_CRUD_TYP.isCRT(chkR.data_crud_typ())) {
					// 必須チェック
					msgL.addAll(check(chkR, Chk01_RsltR.$itm_cd, new FXUCL_RequiredValidater()));
					msgL.addAll(check(chkR, Chk01_RsltR.$itm_sub1, new FXUCL_RequiredValidater()));
					msgL.addAll(check(chkR, Chk01_RsltR.$itm_sub2, new FXUCL_RequiredValidater()));
					msgL.addAll(check(chkR, Chk01_RsltR.$itm_sub3, new FXUCL_RequiredValidater()));
					if (!MAC_LOT_MNG_TYP.isNOT_MNG(chkR.lot_mng_typ())) {
						msgL.addAll(check(chkR, Chk01_RsltR.$lot_no, new FXUCL_RequiredValidater()));
					}
					msgL.addAll(check(chkR, Chk01_RsltR.$site_cd, new FXUCL_RequiredValidater()));
				}
				else if (!MAC_DATA_CRUD_TYP.isDEL(chkR.data_crud_typ())) {
					msgL.addAll(check(chkR, Chk01_RsltR.$upd_dt, new FXUCL_BeforeTodayValidater()));
				}
			}

			return msgL;
		}

		/**
		 * 承認役割権限チェックを実行する。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkAprvRole(MCList<Chk01_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk01_RsltR upR : upL) {
				if (upR.no_mrkt_judg_flg() || !upR.mrkt_judg_flg()) {
					msgL.add(new MCMessage(upR, null, MSBFL0005, 
							toDispItm(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3()),
							toDispGUIIndex(upR)));
				}

				// 権限チェック
				if (!isAprvUsrR(upR.mrkt_judg_upd_role_cd()) && !isAprvUsrR(upR.mrkt_judg_role_cd())) {
					msgL.add(new MCMessage(upR, null, MSBFL0010, toDispGUIIndex(upR)));
				}
			}

			return msgL;
		}

		/**
		 * ロット管理対象をチェックする。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkLot(MCList<Chk01_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk01_RsltR upR : upL) {

				if (!MAC_LOT_MNG_TYP.req_lot(upR.lot_mng_typ())) {
					msgL.add(new MCMessage(upR, null, MSBFL0006, 
							toDispItm(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3()),
							toDispGUIIndex(upR)));
				}
			}

			return msgL;
		}

		/**
		 * 市場出荷判定の存在チェックを実行する。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkMrktJudg(MCList<Chk01_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();

			MCList<Chk01_RsltR> insL = upL.subList(Chk01_RsltR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());

			if (insL.isEmpty()) {
				return msgL;
			}

			MCList<MST_MRKT_JUDG_R> selectL = MCList.create(MST_MRKT_JUDG_R.class);
			MST_MRKT_JUDG_R t = MST_MRKT_JUDG_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);

			selectL_bldr.setSelect(t.mrkt_judg_no);
			selectL_bldr.addSelect(t.itm_cd);
			selectL_bldr.addSelect(t.itm_sub1);
			selectL_bldr.addSelect(t.itm_sub2);
			selectL_bldr.addSelect(t.itm_sub3);
			selectL_bldr.addSelect(t.lot_no);
			selectL_bldr.setWhere(t.itm_cd.eq(bind("itm_cd")));
			selectL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("itm_sub1")));
			selectL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("itm_sub2")));
			selectL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("itm_sub3")));
			selectL_bldr.addWhereWithAnd(t.lot_no.eq(bind("lot_no")));
			dbSelect("MSBFL0100_MST_MRKT_JUDG_S02", selectL, selectL_bldr, insL);

			MCIndexKey idxkey = selectL.createIndex(MST_MRKT_JUDG_R.$itm_cd, MST_MRKT_JUDG_R.$itm_sub1, MST_MRKT_JUDG_R.$itm_sub2, MST_MRKT_JUDG_R.$itm_sub3, MST_MRKT_JUDG_R.$lot_no);
			for (Chk01_RsltR upR : insL) {
				MST_MRKT_JUDG_R selectR = selectL.getFirst(idxkey, upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3(), upR.lot_no());

				if (!isNull(selectR)) {
					msgL.add(new MCMessage(upR, null, MSBFL0007, 
							toDispItm(upR.itm_cd(), upR.itm_sub1(), upR.itm_sub2(), upR.itm_sub3()),
							upR.lot_no(), toDispGUIIndex(upR)));
				}
			}
			return msgL;
		}

		/**
		 * 検査予定登録サービスの品管関連マスタ取得を呼び出す。
		 * @param cndL 上り電文
		 * @return 品管関連マスタ情報
		 */
		protected MCList<InspSchd_Srch01_CndR> callInspSchdService(MCList<InspSchd_Srch01_CndR> cndL) {

			MSBFL_InspSchdService.InspSchd_Srch01 srch01 = MSBFL_InspSchdService.crtInspSchd_Srch01();

			srch01.up0().setAll(cndL);;

			srch01.exec();

			return srch01.down0();
		}

		/**
		 * 品目マスタコンテナを取得する。
		 * 
		 * @param itmCd 品目ＣＤ
		 * @param itmSub1 枝番１
		 * @param itmSub2 枝番２
		 * @param itmSub3 枝番３
		 * @return 品目マスタコンテナ
		 */
		protected MAM_ITM_R getItmR(String itmCd, String itmSub1, String itmSub2, String itmSub3) {

			MAM_ITM_R retR = _cacheItmL.get(itmCd, itmSub1, itmSub2, itmSub3);
			if (retR == null) {
				retR = MAM_ITM_R.create();
			}
			return retR;
		}

		/**
		 * 品目マスタ(工場・物流倉庫)コンテナを取得する。
		 * 
		 * @param itmCd 品目ＣＤ
		 * @param itmSub1 枝番１
		 * @param itmSub2 枝番２
		 * @param itmSub3 枝番３
		 * @param siteCd 工場・物流倉庫
		 * 
		 * @return 品目マスタコンテナ
		 */
		protected MAM_ITM_SITE_R getItmSiteR(String itmCd, String itmSub1, String itmSub2, String itmSub3, String siteCd) {

			return _cacheItmSiteL.get(itmCd, itmSub1, itmSub2, itmSub3, siteCd);
		}


		/**
		 * 品目マスタコンテナキャッシュを初期化する。
		 * 
		 * @param bindL キャッシュ条件
		 */
		protected void initItmCache() {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(nvl( t.mrkt_judg_upd_role_cd, t.mrkt_judg_role_cd).as("mrkt_judg_upd_role_cd"));
			dbc_bldr.addSelect(t.mrkt_judg_role_cd);
			dbc_bldr.addSelect(t.mrkt_judg_flg);
			_cacheItmL = new FXUCL_MCDbcCache<MAM_ITM_R>(dbc_bldr, up0(), Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub3);
		}

		/**
		 * 品目マスタ(工場・物流倉庫)コンテナキャッシュを初期化する。
		 * 
		 * @param bindL キャッシュ条件
		 */
		protected void initItmSiteCache() {

			MAM_ITM_SITE_R t = MAM_ITM_SITE_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.ntfy_nm);
			_cacheItmSiteL = new FXUCL_MCDbcCache<MAM_ITM_SITE_R>(dbc_bldr, up0(), 
					Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub3, Chk01_RsltR.$site_cd);
		}


		protected Map_InspSchd_Srch01_CndR_Chk01_RsltR<InspSchd_Srch01_CndR,Chk01_RsltR> createMap_InspSchd_Srch01_CndR_Chk01_RsltR() {
			return new Map_InspSchd_Srch01_CndR_Chk01_RsltR<InspSchd_Srch01_CndR, Chk01_RsltR>();
		}

		public class Map_InspSchd_Srch01_CndR_Chk01_RsltR<D extends InspSchd_Srch01_CndR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspSchd_Srch01_CndR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(InspSchd_Srch01_CndR.$itm_sub3, Chk01_RsltR.$itm_sub3);

			}
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 判定前チェックを行う。<br>
	 */
	public class Chk02 extends MSBFL_MrktJudgReg_MC_A.Chk02 {
		// 承認担当者情報コンテナキャッシュ
		protected FXUCL_MCDbcCacheStEnd<MAVM_APRV_USR_R> _aprvUsrL = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			initMasterData();
			super.doIt();
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 市場出荷判定ヘッダの更新カウンタチェック
			msgL.addAll(chkMrktJudgUpdCnt());

			// データ補完
			compData();

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk02_RsltR> notErrL = getChkList(up0());

			// 条件付チェック
			msgL.addAll(chkItmsWithCnd(notErrL));

			// 出荷判定の権限チェック
			msgL.addAll(chkAprvRole(notErrL));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		protected void initMasterData() {
			initAprvUsrCache();
		}

		/**
		 * データ補完
		 */
		protected void compData() {
			setMainFlg();
			setPlntAprvDt();
		}

		/**
		 * 主担当ＦＬＧを設定する
		 */
		protected void setMainFlg() {
			for (Chk02_RsltR upR : up0()) {
				MAVM_APRV_USR_R aprvUsrR = getAprvUsrR(upR);
				if (!isNull(aprvUsrR)) {
					// 主担当ＦＬＧ
					upR.main_flg(aprvUsrR.main_flg());
				}
			}
		}
		
		/**
		 * 工場出荷承認の承認日を設定する。
		 */
		protected void setPlntAprvDt() {
			MST_MRKT_JUDG_D_R t = MST_MRKT_JUDG_D_R.create("T");
			MST_PLNT_APRV_D_R t2 = MST_PLNT_APRV_D_R.create("T2");
			MST_PLNT_APRV_R t3 = MST_PLNT_APRV_R.create("T3");

			MCList<MST_MRKT_JUDG_D_R> mrktDL = MCList.create(MST_MRKT_JUDG_D_R.class);
			MCQueryApiBuilder mrktDL_bldr = MCQueryApiBuilder.create(t);
			mrktDL_bldr.setSelect(t.mrkt_judg_no);
			mrktDL_bldr.addSelect(t.mrkt_judg_src_typ);
			mrktDL_bldr.addSelect(t3.aprv_dt);
			mrktDL_bldr.setDistinct();
			mrktDL_bldr.addLeftOuterJoin(t2, bracket( t.mrkt_judg_src_no.eq(t2.plnt_aprv_d_no)));
			mrktDL_bldr.addLeftOuterJoin(t3, bracket( t2.plnt_aprv_no.eq(t3.plnt_aprv_no)));
			mrktDL_bldr.setWhere(t.mrkt_judg_no.eq(bind("mrkt_judg_no")));
			mrktDL_bldr.addWhereWithAnd(t.mrkt_judg_src_typ.eq(value(MSC_MRKT_JUDG_SRC_TYP.PLNT_APRV.value())));
			dbSelect("MSBFL0100_MST_MRKT_JUDG_D_S01", mrktDL, mrktDL_bldr, up0());

			MCIndexKey idxkey = mrktDL.createIndex(MST_MRKT_JUDG_D_R.$mrkt_judg_no);

			for (Chk02_RsltR upR : up0()) {
				MST_MRKT_JUDG_D_R mrktDR = mrktDL.getFirst(idxkey, upR.mrkt_judg_no());
				if (!isNull(mrktDR)) {
					upR.mrkt_judg_src_typ(mrktDR.mrkt_judg_src_typ());
					upR.aprv_dt(mrktDR.getDateNE("APRV_DT"));
				}
			}
		}

		/**
		 * 更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkMrktJudgUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_MRKT_JUDG_R> selectL = MCList.create(MST_MRKT_JUDG_R.class);
			MST_MRKT_JUDG_R t = MST_MRKT_JUDG_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.mrkt_judg_no);

			dbSelectKeyForUpdateNoWait("MSBFL0100_MST_MRKT_JUDG_S03", selectL, selectL_bldr, up0());

			MCIndexKey idxkey = selectL.createIndex(MST_MRKT_JUDG_R.$mrkt_judg_no);
			for (Chk02_RsltR r : up0()) {
				MST_MRKT_JUDG_R selectR = selectL.getFirst(idxkey, r.mrkt_judg_no());
				msgL.addAll(checkUpdCntrNE(r, Chk02_RsltR.$upd_cntr, selectR));

				if (!isNull(selectR)) {
					if (!isSame(r.itm_cd(), selectR.itm_cd())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_cd, selectR.itm_cd(), r));
					}
					if (!isSame(r.itm_sub1(), selectR.itm_sub1())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub1, selectR.itm_sub1(), r));
					}
					if (!isSame(r.itm_sub2(), selectR.itm_sub2())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub2, selectR.itm_sub2(), r));
					}
					if (!isSame(r.itm_sub3(), selectR.itm_sub3())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub3, selectR.itm_sub3(), r));
					}
					r.mrkt_judg_role_cd(selectR.mrkt_judg_role_cd());
					r.mrkt_judg_sts_typ(selectR.mrkt_judg_sts_typ());
				}
			}

			return msgL;
		}

		/**
		 * 条件付チェックを実行する。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkItmsWithCnd(MCList<Chk02_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk02_RsltR r : upL) {
				// 条件付必須チェック
				if (r.acpt_flg()) {
					msgL.addAll(check(r, Chk02_RsltR.$mfg_so_aprv_typ, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk02_RsltR.$quality_mng_typ, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk02_RsltR.$mfg_mng_typ, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk02_RsltR.$deviant_typ, new FXUCL_RequiredValidater()));
					if (!MSC_DEVIANT_TYP.isNO_EXIST(r.deviant_typ())) {
						msgL.addAll(check(r, Chk02_RsltR.$deviant_msr_typ, new FXUCL_RequiredValidater()));
					}
					msgL.addAll(check(r, Chk02_RsltR.$prod_itm_info_typ, new FXUCL_RequiredValidater()));
					msgL.addAll(check(r, Chk02_RsltR.$chd_itm_info_typ, new FXUCL_RequiredValidater()));
					if (MSC_PROD_ITM_INFO_TYP.isEXIST(r.prod_itm_info_typ()) || MSC_CHD_ITM_INFO_TYP.isEXIST(r.chd_itm_info_typ())) {
						msgL.addAll(check(r, Chk02_RsltR.$intr_rmrks, new FXUCL_RequiredValidater()));
					}
				}
				if (MSC_MRKT_JUDG_SRC_TYP.isPLNT_APRV(r.mrkt_judg_src_typ())) {
					// 日付前後チェック
					if (!isNull(r.aprv_dt())) {
						msgL.addAll(check(r, new String[] {Chk02_RsltR.$aprv_dt, Chk02_RsltR.$judg_dt}, new FXUCL_BeforeAfterValidater()));
					}
				}
			}

			return msgL;
		}

		/**
		 * 承認役割権限チェックを実行する。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkAprvRole(MCList<Chk02_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk02_RsltR upR : upL) {
				if (!isAprvUsrR(upR.mrkt_judg_role_cd())) {
					msgL.add(new MCMessage(upR, null, MSBFL0010, toDispGUIIndex(upR)));
				}
			}

			return msgL;
		}

		protected MAVM_APRV_USR_R getAprvUsrR(Chk02_RsltR upR) {
			return _aprvUsrL.get(upR.judg_dt(), upR.judg_usr_cd(), upR.mrkt_judg_role_cd());
		}

		protected void initAprvUsrCache() {

			MAVM_APRV_USR_R t = MAVM_APRV_USR_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSelect(t.usr_cd);
			dbc_bldr.addSelect(t.aprv_role_cd);
			dbc_bldr.addSelect(t.main_flg);
			_aprvUsrL = new FXUCL_MCDbcCacheStEnd<MAVM_APRV_USR_R>(dbc_bldr, up0(), new String[] {
				Chk02_RsltR.$judg_usr_cd, Chk02_RsltR.$mrkt_judg_role_cd
			});
		}
	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 取消前チェックを行う。<br>
	 */
	public class Chk03 extends MSBFL_MrktJudgReg_MC_A.Chk03 {
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
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 市場出荷判定ヘッダの更新カウンタチェック
			msgL.addAll(chkMrktJudgUpdCnt());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk03_RsltR> notErrL = getChkList(up0());

			// 承認対象チェック
			msgL.addAll(chkAprvRole(notErrL));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkMrktJudgUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_MRKT_JUDG_R> selectL = MCList.create(MST_MRKT_JUDG_R.class);
			MST_MRKT_JUDG_R t = MST_MRKT_JUDG_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.mrkt_judg_no);

			dbSelectKeyForUpdateNoWait("MSBFL0100_MST_MRKT_JUDG_S04", selectL, selectL_bldr, up0());

			MCIndexKey idxkey = selectL.createIndex(MST_MRKT_JUDG_R.$mrkt_judg_no);
			for (Chk03_RsltR r : up0()) {
				MST_MRKT_JUDG_R selectR = selectL.getFirst(idxkey, r.mrkt_judg_no());
				msgL.addAll(checkUpdCntrNE(r, Chk03_RsltR.$upd_cntr, selectR));

				if (!isNull(selectR)) {
					if (!isSame(r.itm_cd(), selectR.itm_cd())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_cd, selectR.itm_cd(), r));
					}
					if (!isSame(r.itm_sub1(), selectR.itm_sub1())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub1, selectR.itm_sub1(), r));
					}
					if (!isSame(r.itm_sub2(), selectR.itm_sub2())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub2, selectR.itm_sub2(), r));
					}
					if (!isSame(r.itm_sub3(), selectR.itm_sub3())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub3, selectR.itm_sub3(), r));
					}
					
					r.mrkt_judg_role_cd(selectR.mrkt_judg_role_cd());
				}
			}

			return msgL;
		}

		/**
		 * 承認役割権限チェックを実行する。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkAprvRole(MCList<Chk03_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk03_RsltR upR : upL) {
				if (!isAprvUsrR(upR.mrkt_judg_role_cd())) {
					msgL.add(new MCMessage(upR, null, MSBFL0010, toDispGUIIndex(upR)));
				}
			}

			return msgL;
		}
	}
	/**
	 * Chk04オペレーション.<p>
	 *
	 * 判定取消前チェックを行う。<br>
	 */
	public class Chk04 extends MSBFL_MrktJudgReg_MC_A.Chk04 {

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
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 市場出荷判定ヘッダの更新カウンタチェック
			msgL.addAll(chkMrktJudgUpdCnt());

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<Chk04_RsltR> notErrL = getChkList(up0());

			// 出荷判定の権限チェック
			msgL.addAll(chkAprvRole(notErrL));

			return msgL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 更新カウンタチェックを行う。
		 * 
		 * @return メッセージリスト
		 */
		protected MCMessageList chkMrktJudgUpdCnt() {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_MRKT_JUDG_R> selectL = MCList.create(MST_MRKT_JUDG_R.class);
			MST_MRKT_JUDG_R t = MST_MRKT_JUDG_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.mrkt_judg_no);

			dbSelectKeyForUpdateNoWait("MSBFL0100_MST_MRKT_JUDG_S05", selectL, selectL_bldr, up0());

			MCIndexKey idxkey = selectL.createIndex(MST_MRKT_JUDG_R.$mrkt_judg_no);
			for (Chk04_RsltR r : up0()) {
				MST_MRKT_JUDG_R selectR = selectL.getFirst(idxkey, r.mrkt_judg_no());
				msgL.addAll(checkUpdCntrNE(r, Chk04_RsltR.$upd_cntr, selectR));

				if (!isNull(selectR)) {
					if (!isSame(r.itm_cd(), selectR.itm_cd())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_cd, selectR.itm_cd(), r));
					}
					if (!isSame(r.itm_sub1(), selectR.itm_sub1())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub1, selectR.itm_sub1(), r));
					}
					if (!isSame(r.itm_sub2(), selectR.itm_sub2())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub2, selectR.itm_sub2(), r));
					}
					if (!isSame(r.itm_sub3(), selectR.itm_sub3())) {
						msgL.addAll(getRecordInvalidMsg(Chk01_RsltR.$itm_sub3, selectR.itm_sub3(), r));
					}

					// データ補完
					r.judg_dt(selectR.judg_dt());
					r.mrkt_judg_role_cd(selectR.mrkt_judg_role_cd());
					r.mrkt_judg_sts_typ(MSC_MRKT_JUDG_STS_TYP.OPN.value());
					r.mrkt_judg_prnt_flg(selectR.mrkt_judg_prnt_flg());
					r.seq(selectR.seq());
				}
			}

			return msgL;
		}

		/**
		 * 承認役割権限チェックを実行する。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList chkAprvRole(MCList<Chk04_RsltR> upL) {
			MCMessageList msgL = new MCMessageList();

			for (Chk04_RsltR upR : upL) {
				if (!isAprvUsrR(upR.mrkt_judg_role_cd())) {
					msgL.add(new MCMessage(upR, null, MSBFL0010, toDispGUIIndex(upR)));
				}
			}

			return msgL;
		}
	}

	/**
	 * ログインユーザの承認役割権限チェックを行う。
	 * 
	 * @param roleCd 役割ＣＤ
	 * @return 
	 */
	protected boolean isAprvUsrR(String roleCd) {
		String loginUsrId = mcframe.serverCore.sys.MCSys.user.ID();

		MAVM_APRV_USR_R t = MAVM_APRV_USR_R.create("T");

		int cnt = execDbCount("MSBFL0100_MAVM_APRV_USR_S01", t, t.aprv_role_cd.eq(bind("1"))
						.and(t.usr_cd.eq(bind("2")))
						.and(t.st_dt.lte(bind("3")))
						.and(t.end_dt.isNull()
						.or(t.end_dt.gte(bind("3")))),roleCd, loginUsrId, getToday());

		return cnt > 0;
	}
	/**
	 * Imp01オペレーション.<p>
	 *
	 * ファイルから取り込んだ市場出荷判定情報のチェック処理を行う<br>
	 */
	public class Imp01 extends MSBFL_MrktJudgReg_MC_A.Imp01 {
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
		
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());
			for (Chk01_RsltR r : up0()) {
				r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				r.to_site_cd(r.site_cd());
				r.add_flg(true);
			}
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBFL_MrktJudgReg.Chk01 ope = MSBFL_MrktJudgReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}
		
		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
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
		
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 市場出荷判定の予定データの登録・訂正を行う<br>
	 */
	public class Upd01 extends MSBFL_MrktJudgReg_MC_A.Upd01 {
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

			// 前チェック処理
			callThisChk01();

			MCList<Chk01_RsltR> notErrL = up0().subList(Chk01_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {

				// 市場出荷判定の登録・訂正
				callMrktJudgServiceUpd01(notErrL);
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}
		
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
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_RsltR.$peg_no, up0());
			for (Chk01_RsltR r : up0()) {
				if (r.isStatusCreate()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					if (!r.add_flg()) {
						r.add_flg(true);
					}
					setNoDelFlg(r);
				}
				else if (r.isStatusModify()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
					setNoDelFlg(r);
				}
				else if (r.isStatusDelete()) {
					r.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				r.to_site_cd(r.site_cd());
			}
		}

		/**
		 * 作成元取消不可FLGの値を設定する。
		 * @param r
		 */
		protected void setNoDelFlg(Chk01_RsltR r) {
			if (isNullAnd(r.mfg_so_aprv_typ(), r.quality_mng_typ(), r.mfg_mng_typ(), r.deviant_typ(), r.deviant_msr_typ(), r.prod_itm_info_typ(), r.chd_itm_info_typ())) {
				r.no_del_flg(false);
			}
			else {
				r.no_del_flg(true);
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBFL_MrktJudgReg.Chk01 ope = MSBFL_MrktJudgReg.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 市場出荷判定情報サービスの市場出荷判定作成を呼び出す。
		 * 
		 * @param notErrL
		 */
		protected void callMrktJudgServiceUpd01(MCList<Chk01_RsltR> notErrL) {
			MSBFL_MrktJudgService.MrktJudg_Upd01 upd = MSBFL_MrktJudgService.crtMrktJudg_Upd01();

			addAll(upd.up0(), notErrL, createMap_MrktJudg_Chk01_RsltR_Chk01_RsltR());

			upd.exec();

			String[] destCols = new String[] {Chk01_RsltR.$mrkt_judg_no, Chk01_RsltR.$mrkt_judg_sts_typ, Chk01_RsltR.$mrkt_judg_sts_typ_nm};
			String[] srcCols = new String[] {MrktJudg_Chk01_RsltR.$mrkt_judg_no, MrktJudg_Chk01_RsltR.$mrkt_judg_sts_typ, MrktJudg_Chk01_RsltR.$mrkt_judg_sts_typ_nm};
			copyByPegNo(notErrL, destCols, upd.down0(), srcCols);
		}

		/**
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
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

		/**
		 * エラーハンドルを設定する。
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e, MCList<Chk01_RsltR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			// 画面にエラー内容を表示するために、メッセージプールにaddしているが、Exceptionと上り電文の行との対応付けはできないので、
			// causeRowは設定しない
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk01_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		protected Map_MrktJudg_Chk01_RsltR_Chk01_RsltR<MrktJudg_Chk01_RsltR,Chk01_RsltR> createMap_MrktJudg_Chk01_RsltR_Chk01_RsltR() {
			return new Map_MrktJudg_Chk01_RsltR_Chk01_RsltR<MrktJudg_Chk01_RsltR, Chk01_RsltR>();
		}

		public class Map_MrktJudg_Chk01_RsltR_Chk01_RsltR<D extends MrktJudg_Chk01_RsltR, S extends Chk01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MrktJudg_Chk01_RsltR.$peg_no, Chk01_RsltR.$peg_no);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$data_crud_typ, Chk01_RsltR.$data_crud_typ);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$mrkt_judg_no, Chk01_RsltR.$mrkt_judg_no);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$mfg_so_aprv_typ, Chk01_RsltR.$mfg_so_aprv_typ);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$quality_mng_typ, Chk01_RsltR.$quality_mng_typ);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$mfg_mng_typ, Chk01_RsltR.$mfg_mng_typ);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$deviant_typ, Chk01_RsltR.$deviant_typ);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$deviant_msr_typ, Chk01_RsltR.$deviant_msr_typ);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$prod_itm_info_typ, Chk01_RsltR.$prod_itm_info_typ);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$chd_itm_info_typ, Chk01_RsltR.$chd_itm_info_typ);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$itm_cd, Chk01_RsltR.$itm_cd);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub1);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub2);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$itm_sub3, Chk01_RsltR.$itm_sub3);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$site_cd, Chk01_RsltR.$site_cd);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$upd_dt, Chk01_RsltR.$upd_dt);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$upd_usr_cd, Chk01_RsltR.$mrkt_upd_usr_cd);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$upd_dpt_cd, Chk01_RsltR.$mrkt_upd_dpt_cd);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$base_unit_qty, Chk01_RsltR.$base_unit_qty);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$base_unit_cd, Chk01_RsltR.$base_unit_cd);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$no_del_flg, Chk01_RsltR.$no_del_flg);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$add_flg, Chk01_RsltR.$add_flg);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$intr_rmrks, Chk01_RsltR.$intr_rmrks);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$sub_char1, Chk01_RsltR.$sub_char1);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$sub_char2, Chk01_RsltR.$sub_char2);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$sub_char3, Chk01_RsltR.$sub_char3);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$vld_dt, Chk01_RsltR.$vld_dt);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$mrkt_judg_sts_typ, Chk01_RsltR.$mrkt_judg_sts_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.fromScrFlg(true);
				dest.lot_no(nvl(src.lot_no(), MAC_STR.NULL_VAL.value()));
				dest.sublot_no(MAC_STR.NULL_VAL.value());
			}
		}
	}

	/**
	 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
	 * @param list クライアントから渡された上り電文
	 * @param max １スレッドあたりの最大件数
	 * @return
	 */
	protected List<MCList<Chk01_RsltR>> splitUp(MCList<Chk01_RsltR> list, int max) {
		List<MCList<Chk01_RsltR>> ret = new ArrayList<>();
		MCList<Chk01_RsltR>[] grpL = list.groupList(Chk01_RsltR.$itm_cd
				, Chk01_RsltR.$itm_sub1, Chk01_RsltR.$itm_sub2, Chk01_RsltR.$itm_sub3);
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

	/**
	 * Upd02オペレーション.<p>
	 *
	 * 市場出荷の判定を行う<br>
	 */
	public class Upd02 extends MSBFL_MrktJudgReg_MC_A.Upd02 {
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

			// 前チェック処理
			callThisChk02();

			MCList<Chk02_RsltR> notErrL = up0().subList(Chk02_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				
				// 市場出荷判定の判定
				MCList<MST_MRKT_JUDG_R> updL = updMrktJudg(notErrL);
				
				// ロット管理情報の市場出荷判定状況区分の更新
				callLotServiceUpd05(notErrL);

				// 即時発行はオンの場合、記録書発行
				callInspRptServicePrnt04(notErrL);

				// プッシュ通知
				callPushNtc(updL);
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk02_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk02_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk02_RsltR> up0L = ((MCList<Chk02_RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk02_RsltR.$peg_no, up0());
			setNoDelFlg();
		}

		/**
		 * 作成元取消不可FLGの値を設定する。
		 * @param r
		 */
		protected void setNoDelFlg() {
			for (Chk02_RsltR r : up0()) {
				if (isNullAnd(r.mfg_so_aprv_typ(), r.quality_mng_typ(), r.mfg_mng_typ(), r.deviant_typ(), r.deviant_msr_typ(), r.prod_itm_info_typ(), r.chd_itm_info_typ())) {
					r.no_del_flg(false);
				}
				else {
					r.no_del_flg(true);
				}
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			// 定数名設定
			putNames();

			down0().setAll(up0());
		}

		/**
		 * 定数名を設定する。
		 */
		protected void putNames() {
			MSC_MRKT_JUDG_STS_TYP.putNameNE(up0(), Chk02_RsltR.$mrkt_judg_sts_typ, Chk02_RsltR.$mrkt_judg_sts_typ_nm, getUsrLocale());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBFL_MrktJudgReg.Chk02 ope = MSBFL_MrktJudgReg.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 市場出荷判定の判定取消を実行する。
		 * 
		 * @param notErrL
		 * @return updL
		 */
		protected MCList<MST_MRKT_JUDG_R> updMrktJudg(MCList<Chk02_RsltR> notErrL) {
			MCList<MST_MRKT_JUDG_R> updL = MCList.create(MST_MRKT_JUDG_R.class);

			addAll(updL, notErrL, createMap_MST_MRKT_JUDG_R_Chk02_RsltR());

			if (!updL.isEmpty()) {
				// 更新項目設定
				MST_MRKT_JUDG_R t = MST_MRKT_JUDG_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				editMrktJudgLSetStmt(updL, t, updL_bldr);

				dbUpdateKey("MSBFL0100_MST_MRKT_JUDG_U01", updL, updL_bldr);
			}

			return updL;
		}

		/**
		 * ロット情報サービスの区分更新を呼び出す。
		 * 
		 * @param notErrL
		 */
		protected void callLotServiceUpd05(MCList<Chk02_RsltR> notErrL) {
			MSBFL_LotService.Lot_Upd05 upd = MSBFL_LotService.crtLot_Upd05();

			addAll(upd.up0(), notErrL, createMap_Lot_Upd05_CndR_Chk02_RsltR());

			upd.exec();
		}

		/**
		 * 市場出荷可否判定記録書を発行する。
		 * 
		 * @param notErrL
		 */
		protected void callInspRptServicePrnt04(MCList<Chk02_RsltR> notErrL) {
			MSBFL_InspRptService.InspRpt_Prnt04 prnt = MSBFL_InspRptService.crtInspRpt_Prnt04();

			addAll(prnt.up0(), notErrL.subList(Chk02_RsltR.$prnt_flg, true), createMap_InspRpt_Prnt04_DtlR_Chk02_RsltR());

			prnt.exec();

			String[] destCols = new String[] {Chk02_RsltR.$mrkt_judg_no, Chk02_RsltR.$mrkt_judg_prnt_flg, Chk02_RsltR.$mrkt_judg_prnt_tm};
			String[] srcCols = new String[] {InspRpt_Prnt04_DtlR.$mrkt_judg_no, InspRpt_Prnt04_DtlR.$mrkt_judg_prnt_flg, InspRpt_Prnt04_DtlR.$mrkt_judg_prnt_tm};
			copyByPegNo(notErrL, destCols, prnt.down0(), srcCols);
		}

		/**
		 * 市場出荷判定ヘッダ更新用のdbContainerのset句を編集する。
		 * @param updL 更新用リスト
		 */
		protected void editMrktJudgLSetStmt(MCList<MST_MRKT_JUDG_R> updL, MST_MRKT_JUDG_R t, MCQueryApiBuilder updL_bldr) {
			updL_bldr.setSet(t.mrkt_judg_sts_typ);
			updL_bldr.addSet(t.judg_usr_cd);
			updL_bldr.addSet(t.main_flg);
			updL_bldr.addSet(t.judg_dpt_cd);
			updL_bldr.addSet(t.judg_dt);
			updL_bldr.addSet(t.mfg_so_aprv_typ);
			updL_bldr.addSet(t.quality_mng_typ);
			updL_bldr.addSet(t.mfg_mng_typ);
			updL_bldr.addSet(t.deviant_typ);
			updL_bldr.addSet(t.deviant_msr_typ);
			updL_bldr.addSet(t.prod_itm_info_typ);
			updL_bldr.addSet(t.chd_itm_info_typ);
			updL_bldr.addSet(t.judg_rsn);
			updL_bldr.addSet(t.no_del_flg);
			updL_bldr.addSet(t.intr_rmrks);
		}
		
		/**
		 * プッシュ通知を実行する。
		 * 
		 * @param bindL
		 */
		protected void callPushNtc(MCList<MST_MRKT_JUDG_R> bindL) {
			if (bindL.isEmpty()) {
				return;
			}

			MCList<MST_MRKT_JUDG_D_R> selectL = getMrktJudgDL(bindL);
			if (selectL.isEmpty()) {
				return;
			}

			MCList<Chk02_RsltR> pushTmpL = MCList.create(Chk02_RsltR.class);

			// 工場出荷承認の部門にプッシュ通知情報作成
			pushTmpL.addAll(crtPushNtcInfoForPlnt(selectL));

			// 検査実績の部門にプッシュ通知情報作成
			pushTmpL.addAll(crtPushNtcInfoForInsp(selectL));

			// 製造実績の部門にプッシュ通知情報作成
			pushTmpL.addAll(crtPushNtcInfoForMfg(selectL));

			MCIndexKey idxkey = pushTmpL.createIndex(Chk02_RsltR.$push_dpt_cd, Chk02_RsltR.$judg_dt);
			for (Chk02_RsltR rsltR : pushTmpL.groupBy(Chk02_RsltR.$push_dpt_cd, Chk02_RsltR.$judg_dt)) {
				MCList<Chk02_RsltR> tmpL = pushTmpL.subList(idxkey, rsltR.push_dpt_cd(), rsltR.judg_dt());
				int cnt = tmpL.groupBy(Chk02_RsltR.$mrkt_judg_no).size();

				MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();

				MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.MRKT_JUDG_RESULT);
				info.setMsg(new MCMessage(MSBFL0098, cnt));
				info.addDpt(rsltR.push_dpt_cd(), nvl(rsltR.judg_dt(), getToday()));
				info.addScrBind(MSC_MRKT_JUDG_REG_OPE.OPE_REF.value(), false, true, true, toYMDString(rsltR.judg_dt()), toYMDString(rsltR.judg_dt()), null, null);

				mgr.exec();
			}
		}

		/**
		 * 工場出荷承認部門にプッシュ通知情報を作成する。
		 * 
		 * @param bindL
		 * @return
		 */
		protected MCList<Chk02_RsltR>  crtPushNtcInfoForPlnt(MCList<MST_MRKT_JUDG_D_R> bindL) {

			MCList<Chk02_RsltR> pushTmpL = MCList.create(Chk02_RsltR.class);
			MCList<MST_MRKT_JUDG_D_R> selectL = getMrktJudgDLForPlnt(bindL);

			if (selectL.isEmpty()) {
				return pushTmpL;
			}

			MCIndexKey idxkey = selectL.createIndex(MST_MRKT_JUDG_D_R.$mrkt_judg_no);
			for (Chk02_RsltR rsltR : up0()) {
				MST_MRKT_JUDG_D_R selectR = selectL.getFirst(idxkey, rsltR.mrkt_judg_no());
				if (isNull(selectR)) {
					continue;
				}
				if (!isNull(selectR) && !isNull(selectR.getStringNE("APRV_DPT_CD"))) {
					Chk02_RsltR newR = Chk02_RsltR.create();
					newR.mrkt_judg_no(selectR.mrkt_judg_no());
					newR.push_dpt_cd(selectR.getStringNE("APRV_DPT_CD"));
					newR.judg_dt(rsltR.judg_dt());
					pushTmpL.add(newR);
				}
			}

			return pushTmpL;
		}

		/**
		 * 検査判定部門 または 実績部門にプッシュ通知情報を作成する。
		 * 
		 * @param bindL
		 * @return
		 */
		protected MCList<Chk02_RsltR> crtPushNtcInfoForInsp(MCList<MST_MRKT_JUDG_D_R> bindL) {

			MCList<Chk02_RsltR> pushTmpL = MCList.create(Chk02_RsltR.class);
			MCList<MST_MRKT_JUDG_D_R> selectL = getMrktJudgDLForInsp(bindL);

			if (selectL.isEmpty()) {
				return pushTmpL;
			}

			MCIndexKey idxkey = selectL.createIndex(MST_MRKT_JUDG_D_R.$mrkt_judg_no);
			for (Chk02_RsltR rsltR : up0()) {
				MST_MRKT_JUDG_D_R selectR = selectL.getFirst(idxkey, rsltR.mrkt_judg_no());
				if (isNull(selectR)) {
					continue;
				}
				if (isSame(selectR.getStringNE("INSP_APRV_FLG"), "1")) {
					if (!isNull(selectR.getStringNE("JUDG_DPT_CD"))) {
						Chk02_RsltR newR = Chk02_RsltR.create();
						newR.mrkt_judg_no(selectR.mrkt_judg_no());
						newR.push_dpt_cd(selectR.getStringNE("JUDG_DPT_CD"));
						newR.judg_dt(rsltR.judg_dt());
						pushTmpL.add(newR);
					}
				}
				else {
					if (!isNull(selectR.getStringNE("ACT_DPT_CD"))) {
						Chk02_RsltR newR = Chk02_RsltR.create();
						newR.mrkt_judg_no(selectR.mrkt_judg_no());
						rsltR.push_dpt_cd(selectR.getStringNE("ACT_DPT_CD"));
						newR.judg_dt(rsltR.judg_dt());
						pushTmpL.add(newR);
					}
				}
			}

			return pushTmpL;
		}

		/**
		 * 製造承認部門にプッシュ通知情報を作成する。
		 * 
		 * @param bindL
		 * @return
		 */
		protected MCList<Chk02_RsltR> crtPushNtcInfoForMfg(MCList<MST_MRKT_JUDG_D_R> bindL) {

			MCList<Chk02_RsltR> pushTmpL = MCList.create(Chk02_RsltR.class);
			MCList<MST_MRKT_JUDG_D_R> selectL = getMrktJudgDLForMfg(bindL);

			if (selectL.isEmpty()) {
				return pushTmpL;
			}

			MCIndexKey idxkey = selectL.createIndex(MST_MRKT_JUDG_D_R.$mrkt_judg_no);
			
			for (Chk02_RsltR rsltR : up0()) {
				MST_MRKT_JUDG_D_R selectR = selectL.getFirst(idxkey, rsltR.mrkt_judg_no());
				if (isNull(selectR)) {
					continue;
				}
				if (isSame(selectR.getStringNE("APRV_FLG"), "1")) {
					if (!isNull(selectR.getStringNE("APRV_DPT_CD"))) {
						Chk02_RsltR newR = Chk02_RsltR.create();
						newR.mrkt_judg_no(selectR.mrkt_judg_no());
						newR.push_dpt_cd(selectR.getStringNE("APRV_DPT_CD"));
						newR.judg_dt(rsltR.judg_dt());
						pushTmpL.add(newR);
					}
				}
				else {
					if (!isNull(selectR.getStringNE("ACT_DPT_CD"))) {
						Chk02_RsltR newR = Chk02_RsltR.create();
						newR.mrkt_judg_no(selectR.mrkt_judg_no());
						newR.push_dpt_cd(selectR.getStringNE("ACT_DPT_CD"));
						newR.judg_dt(rsltR.judg_dt());
						pushTmpL.add(newR);
					}
				}
			}

			return pushTmpL;
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk02_RsltR>> splitUp(MCList<Chk02_RsltR> list, int max) {
			List<MCList<Chk02_RsltR>> ret = new ArrayList<>();
			MCList<Chk02_RsltR>[] grpL = list.groupList(Chk02_RsltR.$itm_cd
					, Chk02_RsltR.$itm_sub1, Chk02_RsltR.$itm_sub2, Chk02_RsltR.$itm_sub3);
			MCList<Chk02_RsltR> tmp = MCList.create(Chk02_RsltR.class);
			for (MCList<Chk02_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk02_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		/**
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk02_RsltR> l) {
			dbTran().commit();
			for (Chk02_RsltR r : l) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * エラーハンドルを設定する。
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e, MCList<Chk02_RsltR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			// 画面にエラー内容を表示するために、メッセージプールにaddしているが、Exceptionと上り電文の行との対応付けはできないので、
			// causeRowは設定しない
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk02_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		protected Map_MST_MRKT_JUDG_R_Chk02_RsltR<MST_MRKT_JUDG_R,Chk02_RsltR> createMap_MST_MRKT_JUDG_R_Chk02_RsltR() {
			return new Map_MST_MRKT_JUDG_R_Chk02_RsltR<MST_MRKT_JUDG_R, Chk02_RsltR>();
		}

		public class Map_MST_MRKT_JUDG_R_Chk02_RsltR<D extends MST_MRKT_JUDG_R, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_MRKT_JUDG_R.$mrkt_judg_no, Chk02_RsltR.$mrkt_judg_no);
				addColumnPathMap(MST_MRKT_JUDG_R.$judg_usr_cd, Chk02_RsltR.$judg_usr_cd);
				addColumnPathMap(MST_MRKT_JUDG_R.$main_flg, Chk02_RsltR.$main_flg);
				addColumnPathMap(MST_MRKT_JUDG_R.$judg_dpt_cd, Chk02_RsltR.$judg_dpt_cd);
				addColumnPathMap(MST_MRKT_JUDG_R.$judg_dt, Chk02_RsltR.$judg_dt);
				addColumnPathMap(MST_MRKT_JUDG_R.$mfg_so_aprv_typ, Chk02_RsltR.$mfg_so_aprv_typ);
				addColumnPathMap(MST_MRKT_JUDG_R.$quality_mng_typ, Chk02_RsltR.$quality_mng_typ);
				addColumnPathMap(MST_MRKT_JUDG_R.$mfg_mng_typ, Chk02_RsltR.$mfg_mng_typ);
				addColumnPathMap(MST_MRKT_JUDG_R.$deviant_typ, Chk02_RsltR.$deviant_typ);
				addColumnPathMap(MST_MRKT_JUDG_R.$deviant_msr_typ, Chk02_RsltR.$deviant_msr_typ);
				addColumnPathMap(MST_MRKT_JUDG_R.$prod_itm_info_typ, Chk02_RsltR.$prod_itm_info_typ);
				addColumnPathMap(MST_MRKT_JUDG_R.$chd_itm_info_typ, Chk02_RsltR.$chd_itm_info_typ);
				addColumnPathMap(MST_MRKT_JUDG_R.$judg_rsn, Chk02_RsltR.$judg_rsn);
				addColumnPathMap(MST_MRKT_JUDG_R.$no_del_flg, Chk02_RsltR.$no_del_flg);
				addColumnPathMap(MST_MRKT_JUDG_R.$intr_rmrks, Chk02_RsltR.$intr_rmrks);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (src.acpt_flg()) {
					src.mrkt_judg_sts_typ(MSC_MRKT_JUDG_STS_TYP.ACPT.value());
				}
				else if (src.not_acpt_flg()) {
					src.mrkt_judg_sts_typ(MSC_MRKT_JUDG_STS_TYP.NOT_ACPT.value());
				}
				dest.mrkt_judg_sts_typ(src.mrkt_judg_sts_typ());
			}
		}

		protected Map_Lot_Upd05_CndR_Chk02_RsltR<Lot_Upd05_CndR,Chk02_RsltR> createMap_Lot_Upd05_CndR_Chk02_RsltR() {
			return new Map_Lot_Upd05_CndR_Chk02_RsltR<Lot_Upd05_CndR, Chk02_RsltR>();
		}

		public class Map_Lot_Upd05_CndR_Chk02_RsltR<D extends Lot_Upd05_CndR, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd05_CndR.$itm_cd, Chk02_RsltR.$itm_cd);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub1, Chk02_RsltR.$itm_sub1);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub2, Chk02_RsltR.$itm_sub2);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub3, Chk02_RsltR.$itm_sub3);
				addColumnPathMap(Lot_Upd05_CndR.$lot_no, Chk02_RsltR.$lot_no);
				addColumnPathMap(Lot_Upd05_CndR.$mrkt_judg_sts_typ, Chk02_RsltR.$mrkt_judg_sts_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.mrkt_judg_flg(true);
			}
		}

		protected Map_InspRpt_Prnt04_DtlR_Chk02_RsltR<InspRpt_Prnt04_DtlR,Chk02_RsltR> createMap_InspRpt_Prnt04_DtlR_Chk02_RsltR() {
			return new Map_InspRpt_Prnt04_DtlR_Chk02_RsltR<InspRpt_Prnt04_DtlR, Chk02_RsltR>();
		}

		public class Map_InspRpt_Prnt04_DtlR_Chk02_RsltR<D extends InspRpt_Prnt04_DtlR, S extends Chk02_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspRpt_Prnt04_DtlR.$peg_no, Chk02_RsltR.$peg_no);
				addColumnPathMap(InspRpt_Prnt04_DtlR.$mrkt_judg_no, Chk02_RsltR.$mrkt_judg_no);
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 市場出荷判定の予定データの取消を行う<br>
	 */
	public class Del01 extends MSBFL_MrktJudgReg_MC_A.Del01 {
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

			// 前チェック処理
			callThisChk03();

			MCList<Chk03_RsltR> notErrL = up0().subList(Chk03_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				
				// 市場出荷判定の取消
				callMrktJudgServiceUpd01(notErrL);
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk03_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk03_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk03_RsltR> up0L = ((MCList<Chk03_RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk03_RsltR.$peg_no, up0());
			up0().setStringNE(Chk03_RsltR.$data_crud_typ, MAC_DATA_CRUD_TYP.DEL.value());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MSBFL_MrktJudgReg.Chk03 ope = MSBFL_MrktJudgReg.crtChk03();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 市場出荷判定情報サービスの市場出荷判定作成を呼び出す。
		 * 
		 * @param notErrL
		 */
		protected void callMrktJudgServiceUpd01(MCList<Chk03_RsltR> notErrL) {
			MSBFL_MrktJudgService.MrktJudg_Upd01 upd = MSBFL_MrktJudgService.crtMrktJudg_Upd01();

			addAll(upd.up0(), notErrL, createMap_MrktJudg_Chk01_RsltR_Chk03_RsltR());

			upd.exec();
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk03_RsltR>> splitUp(MCList<Chk03_RsltR> list, int max) {
			List<MCList<Chk03_RsltR>> ret = new ArrayList<>();
			MCList<Chk03_RsltR>[] grpL = list.groupList(Chk03_RsltR.$itm_cd
					, Chk03_RsltR.$itm_sub1, Chk03_RsltR.$itm_sub2, Chk03_RsltR.$itm_sub3);
			MCList<Chk03_RsltR> tmp = MCList.create(Chk03_RsltR.class);
			for (MCList<Chk03_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk03_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		/**
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk03_RsltR> l) {
			dbTran().commit();
			for (Chk03_RsltR r : l) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * エラーハンドルを設定する。
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e, MCList<Chk03_RsltR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			// 画面にエラー内容を表示するために、メッセージプールにaddしているが、Exceptionと上り電文の行との対応付けはできないので、
			// causeRowは設定しない
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk03_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		protected Map_MrktJudg_Chk01_RsltR_Chk03_RsltR<MrktJudg_Chk01_RsltR,Chk03_RsltR> createMap_MrktJudg_Chk01_RsltR_Chk03_RsltR() {
			return new Map_MrktJudg_Chk01_RsltR_Chk03_RsltR<MrktJudg_Chk01_RsltR, Chk03_RsltR>();
		}

		public class Map_MrktJudg_Chk01_RsltR_Chk03_RsltR<D extends MrktJudg_Chk01_RsltR, S extends Chk03_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MrktJudg_Chk01_RsltR.$peg_no, Chk03_RsltR.$peg_no);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$data_crud_typ, Chk03_RsltR.$data_crud_typ);
				addColumnPathMap(MrktJudg_Chk01_RsltR.$mrkt_judg_no, Chk03_RsltR.$mrkt_judg_no);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.fromScrFlg(true);
			}
		}
	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 市場出荷の判定取消を行う<br>
	 */
	public class Del02 extends MSBFL_MrktJudgReg_MC_A.Del02 {
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

			// 前チェック処理
			callThisChk04();

			MCList<Chk04_RsltR> notErrL = up0().subList(Chk04_RsltR.$err_flg, false);
			if (notErrL.size() != 0) {
				
				// 市場出荷判定の判定取消
				MCList<MST_MRKT_JUDG_R> updL = updMrktJudg(notErrL);
				
				// ロット管理情報の市場出荷判定状況区分の更新
				callLotServiceUpd05(notErrL);

				// プッシュ通知
				callPushNtc(updL);
			}
		}

		@Override
		protected int getSplitRowCount() {
			return getThreadBatchSize(up0().size());
		}

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk04_RsltR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk04_RsltR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk04_RsltR> up0L = ((MCList<Chk04_RsltR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk04_RsltR.$peg_no, up0());
			up0().setDateNE(Chk04_RsltR.$del_dt, getToday());
			up0().setStringNE(Chk04_RsltR.$del_usr_cd, mcframe.serverCore.sys.MCSys.user.ID());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			// 定数名設定
			putNames();

			down0().setAll(up0());
		}

		/**
		 * 定数名を設定する。
		 */
		protected void putNames() {
			MSC_MRKT_JUDG_STS_TYP.putNameNE(up0(), Chk04_RsltR.$mrkt_judg_sts_typ, Chk04_RsltR.$mrkt_judg_sts_typ_nm, getUsrLocale());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk04() {
			MSBFL_MrktJudgReg.Chk04 ope = MSBFL_MrktJudgReg.crtChk04();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 市場出荷判定の判定取消を実行する。
		 * 
		 * @param notErrL
		 * @return updL
		 */
		protected MCList<MST_MRKT_JUDG_R> updMrktJudg(MCList<Chk04_RsltR> notErrL) {
			MCList<MST_MRKT_JUDG_R> updL = MCList.create(MST_MRKT_JUDG_R.class);
			addAll(updL, notErrL, createMap_MST_MRKT_JUDG_R_Chk04_RsltR());

			if (!updL.isEmpty()) {
				MST_MRKT_JUDG_R t = MST_MRKT_JUDG_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				// 更新項目設定
				editMrktJudgLSetStmt(updL, t, updL_bldr);
				dbUpdateKey("MSBFL0100_MST_MRKT_JUDG_U02", updL, updL_bldr);
			}

			return updL;
		}

		/**
		 * ロット情報サービスの区分更新を呼び出す。
		 * 
		 * @param notErrL
		 */
		protected void callLotServiceUpd05(MCList<Chk04_RsltR> notErrL) {
			MSBFL_LotService.Lot_Upd05 upd = MSBFL_LotService.crtLot_Upd05();

			addAll(upd.up0(), notErrL, createMap_Lot_Upd05_CndR_Chk04_RsltR());

			upd.exec();
		}

		/**
		 * 市場出荷判定ヘッダ更新用のdbContainerのset句を編集する。
		 * @param updL 更新用リスト
		 */
		protected void editMrktJudgLSetStmt(MCList<MST_MRKT_JUDG_R> updL, MST_MRKT_JUDG_R t, MCQueryApiBuilder updL_bldr) {
			updL_bldr.setSet(t.mrkt_judg_sts_typ);
			updL_bldr.addSet(t.judg_dt);
			updL_bldr.addSet(t.judg_usr_cd);
			updL_bldr.addSet(t.judg_dpt_cd);
			updL_bldr.addSet(t.main_flg);
			updL_bldr.addSet(t.mrkt_judg_prnt_flg);
			updL_bldr.addSet(t.mrkt_judg_prnt_tm);
			updL_bldr.addSet(t.seq);
			updL_bldr.addSet(t.judg_rsn);
		}
		
		/**
		 * プッシュ通知を実行する。
		 * 
		 * @param bindL
		 */
		protected void callPushNtc(MCList<MST_MRKT_JUDG_R> bindL) {

			MCList<MST_MRKT_JUDG_D_R> selectL = getMrktJudgDL(bindL);
			if (selectL.isEmpty()) {
				return;
			}

			MCList<Chk04_RsltR> pushTmpL = MCList.create(Chk04_RsltR.class);

			// 工場出荷承認の部門にプッシュ通知情報作成
			pushTmpL.addAll(crtPushNtcInfoForPlnt(selectL));

			// 検査実績の部門にプッシュ通知情報作成
			pushTmpL.addAll(crtPushNtcInfoForInsp(selectL));

			// 製造実績の部門にプッシュ通知情報作成
			pushTmpL.addAll(crtPushNtcInfoForMfg(selectL));
			
			MCIndexKey idxkey = pushTmpL.createIndex(Chk04_RsltR.$push_dpt_cd, Chk04_RsltR.$judg_dt);
			for (Chk04_RsltR rsltR : pushTmpL.groupBy(Chk04_RsltR.$push_dpt_cd, Chk04_RsltR.$judg_dt)) {
				MCList<Chk04_RsltR> tmpL = pushTmpL.subList(idxkey, rsltR.push_dpt_cd(), rsltR.judg_dt());
				int cnt = tmpL.groupBy(Chk04_RsltR.$mrkt_judg_no).size();

				MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();

				MAUCL_PushNtcInfo info = mgr.createInfo(MAC_PUSH_NTC_TYP.MRKT_JUDG_RESULT);
				info.setMsg(new MCMessage(MSBFL0099, cnt));
				info.addDpt(rsltR.push_dpt_cd(), nvl(rsltR.judg_dt(), getToday()));
				info.addScrBind(MSC_MRKT_JUDG_REG_OPE.OPE_REF.value(), true, false, false, null, null, toYMDHMSString(getToday()), toYMDHMSString(getToday().endTimeOfDay()));

				mgr.exec();
			}
		}

		/**
		 * 工場出荷承認部門にプッシュ通知情報を作成する。
		 * 
		 * @param bindL
		 * @return
		 */
		protected MCList<Chk04_RsltR> crtPushNtcInfoForPlnt(MCList<MST_MRKT_JUDG_D_R> bindL) {

			MCList<Chk04_RsltR> pushTmpL = MCList.create(Chk04_RsltR.class);
			MCList<MST_MRKT_JUDG_D_R> selectL = getMrktJudgDLForPlnt(bindL);

			if (selectL.isEmpty()) {
				return pushTmpL;
			}

			MCIndexKey idxkey = selectL.createIndex(MST_MRKT_JUDG_D_R.$mrkt_judg_no);
			for (Chk04_RsltR rsltR : up0()) {
				MST_MRKT_JUDG_D_R selectR = selectL.getFirst(idxkey, rsltR.mrkt_judg_no());
				if (isNull(selectR)) {
					continue;
				}
				if (!isNull(selectR)) {
					Chk04_RsltR newR = Chk04_RsltR.create();
					newR.mrkt_judg_no(selectR.mrkt_judg_no());
					newR.push_dpt_cd(selectR.getStringNE("APRV_DPT_CD"));
					newR.judg_dt(rsltR.judg_dt());
					pushTmpL.add(newR);
				}
			}

			return pushTmpL;
		}

		/**
		 * 検査判定部門 または 実績部門にプッシュ通知情報を作成する。
		 * 
		 * @param bindL
		 * @return
		 */
		protected MCList<Chk04_RsltR> crtPushNtcInfoForInsp(MCList<MST_MRKT_JUDG_D_R> bindL) {

			MCList<Chk04_RsltR> pushTmpL = MCList.create(Chk04_RsltR.class);
			MCList<MST_MRKT_JUDG_D_R> selectL = getMrktJudgDLForInsp(bindL);

			if (selectL.isEmpty()) {
				return pushTmpL;
			}

			MCIndexKey idxkey = selectL.createIndex(MST_MRKT_JUDG_D_R.$mrkt_judg_no);
			for (Chk04_RsltR rsltR : up0()) {
				MST_MRKT_JUDG_D_R selectR = selectL.getFirst(idxkey, rsltR.mrkt_judg_no());
				if (isNull(selectR)) {
					continue;
				}
				Chk04_RsltR newR = Chk04_RsltR.create();
				if (isSame(selectR.getStringNE("INSP_APRV_FLG"), "1")) {
					newR.push_dpt_cd(selectR.getStringNE("JUDG_DPT_CD"));
				}
				else {
					newR.push_dpt_cd(selectR.getStringNE("ACT_DPT_CD"));
				}
				newR.mrkt_judg_no(selectR.mrkt_judg_no());
				newR.judg_dt(rsltR.judg_dt());
				pushTmpL.add(newR);
			}

			return pushTmpL;
		}

		/**
		 * 製造承認部門にプッシュ通知情報を作成する。
		 * 
		 * @param bindL
		 * @return
		 */
		protected MCList<Chk04_RsltR> crtPushNtcInfoForMfg(MCList<MST_MRKT_JUDG_D_R> bindL) {

			MCList<Chk04_RsltR> pushTmpL = MCList.create(Chk04_RsltR.class);
			MCList<MST_MRKT_JUDG_D_R> selectL = getMrktJudgDLForMfg(bindL);

			if (selectL.isEmpty()) {
				return pushTmpL;
			}

			MCIndexKey idxkey = selectL.createIndex(MST_MRKT_JUDG_D_R.$mrkt_judg_no);
			for (Chk04_RsltR rsltR : up0()) {
				MST_MRKT_JUDG_D_R selectR = selectL.getFirst(idxkey, rsltR.mrkt_judg_no());
				if (isNull(selectR)) {
					continue;
				}
				Chk04_RsltR newR = Chk04_RsltR.create();
				if (isSame(selectR.getStringNE("APRV_FLG"), "1")) {
					newR.push_dpt_cd(selectR.getStringNE("APRV_DPT_CD"));
				}
				else {
					newR.push_dpt_cd(selectR.getStringNE("ACT_DPT_CD"));
				}
				newR.mrkt_judg_no(selectR.mrkt_judg_no());
				newR.judg_dt(rsltR.judg_dt());
				pushTmpL.add(newR);
			}

			return pushTmpL;
		}

		/**
		 * 品目ＣＤ、枝番１～３が同一の上り電文行が、同じMCListに格納されるように分割する
		 * @param list クライアントから渡された上り電文
		 * @param max １スレッドあたりの最大件数
		 * @return
		 */
		protected List<MCList<Chk04_RsltR>> splitUp(MCList<Chk04_RsltR> list, int max) {
			List<MCList<Chk04_RsltR>> ret = new ArrayList<>();
			MCList<Chk04_RsltR>[] grpL = list.groupList(Chk04_RsltR.$itm_cd
					, Chk04_RsltR.$itm_sub1, Chk04_RsltR.$itm_sub2, Chk04_RsltR.$itm_sub3);
			MCList<Chk04_RsltR> tmp = MCList.create(Chk04_RsltR.class);
			for (MCList<Chk04_RsltR> grp : grpL) {
				if (tmp.size() >= max) {
					ret.add(tmp);
					tmp = MCList.create(Chk04_RsltR.class);
				}
				tmp.addAll(grp);
			}
			if (!tmp.isEmpty()) {
				ret.add(tmp);
			}
			return ret;
		}

		/**
		 * 処理結果状態区分を設定する。
		 * @param l
		 */
		protected void handleSuccess(MCList<Chk04_RsltR> l) {
			dbTran().commit();
			for (Chk04_RsltR r : l) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * エラーハンドルを設定する。
		 * @param e
		 * @param l
		 */
		protected void handleEx(Exception e, MCList<Chk04_RsltR> l) {
			dbTran().rollback();
			MCException mcex;
			if (e instanceof MCException) {
				mcex = (MCException)e;
			}
			else {
				mcex = new MCException(e);
			}
			MCLog.write(mcex);
			// 画面にエラー内容を表示するために、メッセージプールにaddしているが、Exceptionと上り電文の行との対応付けはできないので、
			// causeRowは設定しない
			MCMessage msg = mcex.getMCMessage();
			MCMessagePool.add(msg);
			MCMessagePool.addAll(mcex.getCauseMessageList());
			for (Chk04_RsltR r : l) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
			}
		}

		protected Map_MST_MRKT_JUDG_R_Chk04_RsltR<MST_MRKT_JUDG_R,Chk04_RsltR> createMap_MST_MRKT_JUDG_R_Chk04_RsltR() {
			return new Map_MST_MRKT_JUDG_R_Chk04_RsltR<MST_MRKT_JUDG_R, Chk04_RsltR>();
		}

		public class Map_MST_MRKT_JUDG_R_Chk04_RsltR<D extends MST_MRKT_JUDG_R, S extends Chk04_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_MRKT_JUDG_R.$mrkt_judg_no, Chk04_RsltR.$mrkt_judg_no);
				addColumnPathMap(MST_MRKT_JUDG_R.$mrkt_judg_sts_typ, Chk04_RsltR.$mrkt_judg_sts_typ);
				addColumnPathMap(MST_MRKT_JUDG_R.$judg_rsn, Chk04_RsltR.$judg_rsn);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.judg_dt(null);
				dest.judg_usr_cd(null);
				dest.judg_dpt_cd(null);
				dest.main_flg(false);
				if (src.mrkt_judg_prnt_flg()) {
					dest.seq(src.seq().add(MCNumber.ONE));
				}
				else {
					dest.seq(src.seq());
				}
				src.mrkt_judg_prnt_flg(false);
				dest.mrkt_judg_prnt_flg(src.mrkt_judg_prnt_flg());
				dest.mrkt_judg_prnt_tm(null);
				dest.mrkt_judg_prnt_tm(src.mrkt_judg_prnt_tm());
			}
		}

		protected Map_Lot_Upd05_CndR_Chk04_RsltR<Lot_Upd05_CndR,Chk04_RsltR> createMap_Lot_Upd05_CndR_Chk04_RsltR() {
			return new Map_Lot_Upd05_CndR_Chk04_RsltR<Lot_Upd05_CndR, Chk04_RsltR>();
		}

		public class Map_Lot_Upd05_CndR_Chk04_RsltR<D extends Lot_Upd05_CndR, S extends Chk04_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(Lot_Upd05_CndR.$itm_cd, Chk04_RsltR.$itm_cd);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub1, Chk04_RsltR.$itm_sub1);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub2, Chk04_RsltR.$itm_sub2);
				addColumnPathMap(Lot_Upd05_CndR.$itm_sub3, Chk04_RsltR.$itm_sub3);
				addColumnPathMap(Lot_Upd05_CndR.$lot_no, Chk04_RsltR.$lot_no);
				addColumnPathMap(Lot_Upd05_CndR.$mrkt_judg_sts_typ, Chk04_RsltR.$mrkt_judg_sts_typ);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);

				dest.mrkt_judg_flg(true);
			}
		}
	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 市場出荷可否判定記録書を発行する<br>
	 */
	public class Prnt01 extends MSBFL_MrktJudgReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// 市場出荷可否判定記録書発行
			callInspRptServicePrnt04();

			// 処理結果状況区分設定
			setRtnStsTyp();

			// 下り電文設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Prnt01_RsltR.$peg_no, up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}

		/**
		 * 処理結果状況区分を設定する。
		 */
		protected void setRtnStsTyp() {
			for (Prnt01_RsltR r : up0()) {
				if (r.err_flg()) {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
				}
				else {
					r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
				}
			}
		}

		/**
		 * 市場出荷可否判定記録書を発行する。
		 */
		protected void callInspRptServicePrnt04() {
			MSBFL_InspRptService.InspRpt_Prnt04 prnt = MSBFL_InspRptService.crtInspRpt_Prnt04();

			addAll(prnt.up0(), up0(), createMap_InspRpt_Prnt04_DtlR_Prnt01_RsltR());

			prnt.exec();

			String[] destCols = new String[] {Prnt01_RsltR.$mrkt_judg_no, Prnt01_RsltR.$mrkt_judg_prnt_flg, Prnt01_RsltR.$mrkt_judg_prnt_tm, Prnt01_RsltR.$err_flg};
			String[] srcCols = new String[] {InspRpt_Prnt04_DtlR.$mrkt_judg_no, InspRpt_Prnt04_DtlR.$mrkt_judg_prnt_flg, InspRpt_Prnt04_DtlR.$mrkt_judg_prnt_tm, InspRpt_Prnt04_DtlR.$err_flg};
			copyByPegNo(up0(), destCols, prnt.down0(), srcCols);
		}

		protected Map_InspRpt_Prnt04_DtlR_Prnt01_RsltR<InspRpt_Prnt04_DtlR,Prnt01_RsltR> createMap_InspRpt_Prnt04_DtlR_Prnt01_RsltR() {
			return new Map_InspRpt_Prnt04_DtlR_Prnt01_RsltR<InspRpt_Prnt04_DtlR, Prnt01_RsltR>();
		}

		public class Map_InspRpt_Prnt04_DtlR_Prnt01_RsltR<D extends InspRpt_Prnt04_DtlR, S extends Prnt01_RsltR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspRpt_Prnt04_DtlR.$peg_no, Prnt01_RsltR.$peg_no);
				addColumnPathMap(InspRpt_Prnt04_DtlR.$mrkt_judg_no, Prnt01_RsltR.$mrkt_judg_no);
			}
		}
	}

	/**
	 * プッシュ通知対象を取得する。
	 * 
	 * @param bindL
	 * @return
	 */
	protected MCList<MST_MRKT_JUDG_D_R> getMrktJudgDL(MCList<MST_MRKT_JUDG_R> bindL) {
		MCList<MST_MRKT_JUDG_D_R> selectL = MCList.create(MST_MRKT_JUDG_D_R.class);
		MST_MRKT_JUDG_D_R t = MST_MRKT_JUDG_D_R.create("T");
		MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
		selectL_bldr.setWhere(t.mrkt_judg_no.eq(bind("mrkt_judg_no")));
		selectL_bldr.addWhereWithAnd(t.mrkt_judg_src_typ.eq(value(MSC_MRKT_JUDG_SRC_TYP.PLNT_APRV.value())));
		dbSelect("MSBFL0100_MST_MRKT_JUDG_D_S02", selectL, selectL_bldr, bindL);
		return selectL;
	}

	/**
	 * 工場出荷承認の部門情報を取得する。
	 * 
	 * @param bindL
	 * @return
	 */
	protected MCList<MST_MRKT_JUDG_D_R> getMrktJudgDLForPlnt(MCList<MST_MRKT_JUDG_D_R> bindL) {
		if (bindL.isEmpty()) {
			return bindL;
		}

		MST_PLNT_APRV_D_R t2 = MST_PLNT_APRV_D_R.create("T2");
		MST_PLNT_APRV_R t3 = MST_PLNT_APRV_R.create("T3");

		MCList<MST_MRKT_JUDG_D_R> selectL = MCList.create(MST_MRKT_JUDG_D_R.class);
		MST_MRKT_JUDG_D_R t = MST_MRKT_JUDG_D_R.create("T");
		MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
		selectL_bldr.setSelect(t.mrkt_judg_no);
		selectL_bldr.addSelect(t3.plnt_aprv_no);
		selectL_bldr.addSelect(t3.aprv_dpt_cd);
		selectL_bldr.addLeftOuterJoin(t2, bracket( t.mrkt_judg_src_no.eq(t2.plnt_aprv_d_no)));
		selectL_bldr.addLeftOuterJoin(t3, bracket( t2.plnt_aprv_no.eq(t3.plnt_aprv_no)));
		selectL_bldr.setDistinct();
		selectL_bldr.setWhere(t.mrkt_judg_d_no.eq(bind("mrkt_judg_d_no")));
		dbSelect("MSBFL0100_MST_MRKT_JUDG_D_S03", selectL, selectL_bldr, bindL);

		return selectL;
	}

	/**
	 * 検査実績の部門情報を取得する。
	 * 
	 * @param bindL
	 * @return
	 */
	protected MCList<MST_MRKT_JUDG_D_R> getMrktJudgDLForInsp(MCList<MST_MRKT_JUDG_D_R> bindL) {
		if (bindL.isEmpty()) {
			return bindL;
		}

		MST_PLNT_APRV_D_R t2 = MST_PLNT_APRV_D_R.create("T2");
		MST_INSP_INST_R t3 = MST_INSP_INST_R.create("T3");
		MST_INSP_ACT_R t4 = MST_INSP_ACT_R.create("T4");

		MCList<MST_MRKT_JUDG_D_R> selectL = MCList.create(MST_MRKT_JUDG_D_R.class);
		MST_MRKT_JUDG_D_R t = MST_MRKT_JUDG_D_R.create("T");
		MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
		selectL_bldr.setSelect(t.mrkt_judg_no);
		selectL_bldr.addSelect(t3.insp_aprv_flg);
		selectL_bldr.addSelect(t4.act_dpt_cd);
		selectL_bldr.addSelect(t4.judg_dpt_cd);
		selectL_bldr.addLeftOuterJoin(t2, bracket( t.mrkt_judg_src_no.eq(t2.plnt_aprv_d_no)));
		selectL_bldr.addLeftOuterJoin(t3, bracket( t2.insp_no.eq(t3.insp_no)));
		selectL_bldr.addLeftOuterJoin(t4, bracket( t2.insp_no.eq(t4.insp_no)));
		selectL_bldr.setDistinct();
		selectL_bldr.setWhere(t.mrkt_judg_d_no.eq(bind("mrkt_judg_d_no")));
		dbSelect("MSBFL0100_MST_MRKT_JUDG_D_S04", selectL, selectL_bldr, bindL);

		return selectL;
	}


	/**
	 * 製造実績の部門情報を取得する。
	 * 
	 * @param bindL
	 * @return
	 */
	protected MCList<MST_MRKT_JUDG_D_R> getMrktJudgDLForMfg(MCList<MST_MRKT_JUDG_D_R> bindL) {
		if (bindL.isEmpty()) {
			return bindL;
		}

		MST_MRKT_JUDG_D_R t = MST_MRKT_JUDG_D_R.create("T");
		MST_PLNT_APRV_D_R t2 = MST_PLNT_APRV_D_R.create("T2");
		MST_YIELD_ACT_R t3 = MST_YIELD_ACT_R.create("T3");
		MST_MFG_ACT_R t4 = MST_MFG_ACT_R.create("T4");
		MST_MFG_INST_R t5 = MST_MFG_INST_R.create("T5");

		MCList<MST_MRKT_JUDG_D_R> selectL = MCList.create(MST_MRKT_JUDG_D_R.class);
		MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
		selectL_bldr.setSelect(t.mrkt_judg_no);
		selectL_bldr.addSelect(t5.aprv_flg);
		selectL_bldr.addSelect(t4.act_dpt_cd);
		selectL_bldr.addSelect(t4.aprv_dpt_cd);
		selectL_bldr.addLeftOuterJoin(t2, bracket( t.mrkt_judg_src_no.eq(t2.plnt_aprv_d_no)));
		selectL_bldr.addLeftOuterJoin(t3, bracket( t2.src_no4.eq(t3.yield_act_no)));
		selectL_bldr.addLeftOuterJoin(t4, bracket( t3.mfg_act_no.eq(t4.mfg_act_no)));
		selectL_bldr.addLeftOuterJoin(t5, bracket( t4.mfg_inst_no.eq(t5.mfg_inst_no)));
		selectL_bldr.setDistinct();
		selectL_bldr.setWhere(t.mrkt_judg_d_no.eq(bind("mrkt_judg_d_no")));
		selectL_bldr.addWhereWithAnd(t2.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())));
		selectL_bldr.addWhereWithAnd(t2.src_no4.isNotNull());
		dbSelect("MSBFL0100_MST_MRKT_JUDG_D_S05", selectL, selectL_bldr, bindL);

		return selectL;
	}

	//FMCB CUSTOM END
}