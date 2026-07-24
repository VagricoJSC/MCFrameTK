package mcframe.serverMSBF.MSBFL5330;

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
import static mcframe.serverMSBF.MSBFL5330.Query.*;
import mcframe.commonCore.report.container.*;
import mcframe.serverCore.report.MCServerReportManager;
import mcframe.serverCore.resource.MCConst;
import mcframe.commonMSBF.MSBFR0020.*;
import mcframe.commonMSBF.MSBFR0030.*;
import mcframe.commonMSBF.MSBFR0040.*;
import mcframe.commonMSBF.MSBFR0050.*;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_InspRptService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_InspRptService_MC extends MSBFL_InspRptService_MC_A{
	//FMCB CUSTOM START

	/**
	 * InspRpt_Prnt01オペレーション.<p>
	 *
	 * 検査指図リストを発行する。<br>
	 */
	public class InspRpt_Prnt01 extends MSBFL_InspRptService_MC_A.InspRpt_Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 前処理
			prepare();

			// 検査指図存在チェック
			chkInspInst();

			MCList<InspRpt_Prnt01_DtlR> notErrL = up0().subList(InspRpt_Prnt01_DtlR.$err_flg, false);
			if (notErrL.size() != 0) {

				// 検査指図情報（電文）編集
				editUp(notErrL);

				// 検査指図の更新
				updInspInst(notErrL);

				// 印刷処理
				prntMain(notErrL);
			}

			// 下り電文設定
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void prepare() {
			// ソート
			sortUp();
		}

		/**
		 * 更新前に上り電文をソートする。
		 */
		protected void sortUp() {
			up0().sort(InspRpt_Prnt01_DtlR.$insp_no);
		}

		/**
		 * 上り電文を編集する。
		 */
		protected void editUp(MCList<InspRpt_Prnt01_DtlR> subL) {
			MCDate prntDt = MCDate.now();
			String inspLstNo = getInspLstNo(prntDt);
			for (InspRpt_Prnt01_DtlR r : subL) {
				r.insp_lst_no(inspLstNo);
				r.insp_lst_prnt_flg(true);
				r.insp_lst_prnt_tm(prntDt);
			}
		}

		/**
		 * 検査指図の存在チェックを実行する。
		 * @return
		 */
		protected void chkInspInst() {
			MCList<MST_INSP_INST_R> lockL = lockInspInst();
			MCIndexKey idxkey = lockL.createIndex(MST_INSP_INST_R.$insp_no);

			MCMessageList msgList = new MCMessageList();
			for (InspRpt_Prnt01_DtlR upR : up0()) {
				MST_INSP_INST_R lockR = lockL.getFirst(idxkey, upR.insp_no());

				if (isNull(lockR)) {
					upR.err_flg(true);
					msgList.addAll(getRecordNotFoundMsg(
							"MS",
							"MST_INSP_INST",
							new String[]{MST_INSP_INST_R.$insp_no},
							new Comparable[]{upR.insp_no()}, upR));
				}
			}

			if (!msgList.isEmpty()) {
				MCMessagePool.addAll(msgList);
			}
		}

		/**
		 * 検査指図をロックする。
		 * @return
		 */
		protected MCList<MST_INSP_INST_R> lockInspInst() {
			MCList<MST_INSP_INST_R> lockL = MCList.create(MST_INSP_INST_R.class);
			MCQueryApiBuilder lockL_bldr = MCQueryApiBuilder.create(MST_INSP_INST_R.create("T"));
			dbSelectKeyForUpdate("MSBFL5330_MST_INSP_INST_S01", lockL, lockL_bldr, up0());
			
			return lockL;
		}

		/**
		 * 検査指図リストＮＯを発番する。
		 * 
		 * @param prntDt
		 * @return
		 */
		protected String getInspLstNo(MCDate prntDt) {
			ElmArgsR args = ElmArgsR.create();

			args.co_cd(getCo().co_cd());
			args.dt(prntDt);

			return getNum(MAC_NUM_BIZ_TYP.INSPL, args);
		}

		/**
		 * 検査指図テーブルを更新する。
		 */
		protected void updInspInst(MCList<InspRpt_Prnt01_DtlR> subL) {
			MCList<MST_INSP_INST_R> updInspInstL = MCList.create(MST_INSP_INST_R.class);

			addAll(updInspInstL, subL, createMap_MST_INSP_INST_R_InspRpt_Prnt01_DtlR());

			if (!updInspInstL.isEmpty()) {

				MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
				MCQueryApiBuilder updInspInstL_bldr = MCQueryApiBuilder.create(t);
				editInspInstLSetStmt(updInspInstL, t, updInspInstL_bldr);

				dbUpdateKey("MSBFL5330_MST_INSP_INST_U01", updInspInstL, updInspInstL_bldr);
			}
		}

		/**
		 * 印刷処理
		 */
		protected void prntMain(MCList<InspRpt_Prnt01_DtlR> subL) {
			MCList<InspLstDtlR> data = getPrntData(subL);
			MSBFR_InspLst rs = MSBFR_InspLst.create();
			setHdr(rs, data);
			editPrntData(rs, data);
			sortPrntData(data);
			execPrnt(rs, data);
		}

		/**
		 * 検査指図リスト用のデータを取得する。
		 * @return
		 */
		protected MCList<InspLstDtlR> getPrntData(MCList<InspRpt_Prnt01_DtlR> subL) {
			MCList<InspLstDtlR> data = MCList.create(InspLstDtlR.class);
			executeQuery(data, MSBFL5330_MST_INSP_INST_S01(), subL.get(0));

			//　帳票出力対象データの検査NOに紐づく検査予定を取得する
			MCList<MST_INSP_SCHD_R> inspSchdL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R inspSchd = MST_INSP_SCHD_R.create("T1");
			MAM_UNIT_R unit = MAM_UNIT_R.create("M1");
			MCQueryApiBuilder inspSchd_bldr = MCQueryApiBuilder.create(inspSchd);
			inspSchd_bldr.addLeftOuterJoin(unit, inspSchd.base_unit_cd.eq(unit.unit_cd));

			// 検査指図の検査NOと一致する検査予定を条件に指定
			inspSchd_bldr.addWhereWithAnd(inspSchd.insp_no.in(bind("insp_no")));

			// 基準単位名を追加
			inspSchd_bldr.addSelect(unit.base_unit_nm.as("base_unit_nm"));
			inspSchd_bldr.addOrderByAscNullsLast(inspSchd.insp_schd_no, inspSchd.smpl_inst_qty);
			dbSelect("MSBFL5330_MST_INSP_SCHD_S01", inspSchdL, inspSchd_bldr, data);

			MCIndexKey inspSchdkey = inspSchdL.createIndex(MST_INSP_SCHD_R.$insp_no);
			// 各検査指図リスト用データの検査NOに該当する検査予定から、抜取指図数を取得・設定する。
			// 1つの検査NOに対して、複数の検査予定データが存在する場合があるが、抜取数については全データ同一の値となっているので
			// getFirstで最初にヒットした検査予定の抜取指図数を設定する。
			for (InspLstDtlR r : data) {
				MST_INSP_SCHD_R inspSchdR = inspSchdL.getFirst(inspSchdkey, r.insp_no());
				r.smpl_inst_qty(inspSchdR.smpl_inst_qty());
				r.smpl_inst_base_unit_nm(inspSchdR.getString("base_unit_nm"));
				if (isNull(r.smpl_inst_qty()) && MAC_INSP_MTD_TYP.isTTL(r.insp_mtd_typ())) {
					// 抜取指図数が未設定かつ全数検査である場合、指図数がそのまま抜取指図数になるため、
					// 抜取指図数とその単位名について、表示しないようにnullで設定する
					r.smpl_inst_qty(null);
					r.smpl_inst_base_unit_nm(null);
				}
			}
			return data;
		}

		/**
		 * ヘッダ情報を設定する。
		 * @param rs
		 * @param data
		 */
		protected void setHdr(MSBFR_InspLst rs, MCList<InspLstDtlR> data) {
			if (!data.isEmpty()) {
				InspLstHdrR hdrR = InspLstHdrR.create();
				hdrR.insp_lst_no_lbl(MSC_INSP_PRNT_STR.INSP_LST_NO.name(getUsrLocale()));
				hdrR.insp_lst_no_hdr(data.get(0).insp_lst_no());
				hdrR.form_name(MSC_INSP_PRNT_STR.INSP_LST_SHEET.name(getUsrLocale()));
				hdrR.insp_no_lbl(MSC_INSP_PRNT_STR.INSP_NO.name(getUsrLocale()));
				hdrR.insp_typ_nm_lbl(MSC_INSP_PRNT_STR.INSP_TYP.name(getUsrLocale()));
				hdrR.insp_ptn_nm_lbl(MSC_INSP_PRNT_STR.INSP_PTN_NM.name(getUsrLocale()));
				hdrR.insp_mtd_typ_nm_lbl(MSC_INSP_PRNT_STR.INSP_MTD_TYP.name(getUsrLocale()));
				if (isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1")) {
					hdrR.insp_aprv_sts_typ_nm_lbl(MSC_INSP_PRNT_STR.INSP_APRV_STS_TYP.name(getUsrLocale()));
				}
				hdrR.prnt_tm(MCDate.now());
				rs.addRow(hdrR);
			}
		}

		/**
		 * 検査指図リスト用のデータを編集する。
		 * @param data
		 */
		protected void editPrntData(MSBFR_InspLst rs, MCList<InspLstDtlR> data) {
			//検査指図数をフォーマットし、整数部と小数部に分ける
			putNumStr(rs, data, InspLstDtlR.$s_int_base_unit_qty,
					InspLstDtlR.$s_dec_base_unit_qty,
					InspLstDtlR.$base_unit_qty,
					InspLstDtlR.$base_unit_dec_place);
			// 抜取指図数も同様にフォーマットする
			putNumStr(rs, data, InspLstDtlR.$int_smpl_inst_qty,
					InspLstDtlR.$dec_smpl_inst_qty,
					InspLstDtlR.$smpl_inst_qty,
					InspLstDtlR.$base_unit_dec_place);
			for (InspLstDtlR r : data) {

				//品目ＣＤを表示用に変換
				putPrntItmSub1(r, InspLstDtlR.$itm_sub1_view, InspLstDtlR.$itm_sub1_data);
				putPrntItmSub2(r, InspLstDtlR.$itm_sub2_view, InspLstDtlR.$itm_sub2_data);
				putPrntItmSub3(r, InspLstDtlR.$itm_sub3_view, InspLstDtlR.$itm_sub3_data);
				
				//ロットＮＯを表示用に変換
				putPrntStr(r, InspLstDtlR.$lot_no_view, InspLstDtlR.$lot_no_data);
				putPrntStr(r, InspLstDtlR.$sublot_no_view, InspLstDtlR.$sublot_no_data);

				//定数名を設定
				r.insp_typ_nm(MSC_INSP_TYP.get(r.insp_typ()).name(getUsrLocale()));
				r.insp_mtd_typ_nm(MAC_INSP_MTD_TYP.get(r.insp_mtd_typ()).name(getUsrLocale()));

				//booleanを帳票用の文字列表現に変換
				putPrntChk(r, InspLstDtlR.$s_std_cnf_req_flg, InspLstDtlR.$std_cnf_req_flg);
				putPrntChk(r, InspLstDtlR.$s_std_req_flg, InspLstDtlR.$std_req_flg);

				// 版ＮＯが空でない場合、ラベルを設定
				if (!isNull(r.ver_no())) {
					if (isSame(getSysParm("VER_ENABLE_FLG"), "1")) {
						r.ver_no_lbl(MSC_INSP_PRNT_STR.VER_NO.name(getUsrLocale()));
					}
					else {
						r.ver_no(null);
					}
				}
				// 承認状況区分が空でない場合、定数名を設定
				if (!isNull(r.insp_aprv_sts_typ())) {
					if (isSame(getSysParm("MFG_APRV_ENABLE_FLG"), "1")) {
						r.insp_aprv_sts_typ_nm(MSC_INSP_APRV_STS_TYP.get(r.insp_aprv_sts_typ()).name(getUsrLocale()));
					}
					else {
						r.insp_aprv_sts_typ_nm(null);
					}
				}
			}
		}

		/**
		 * 検査指図リスト用のデータをソートする。<br>
		 * ※印刷用データが編集し終わった後に実行すること。
		 */
		protected void sortPrntData(MCList<InspLstDtlR> data) {
			data.sort(SortType.ASC, InspLstDtlR.$st_tm, InspLstDtlR.$itm_cd,
					InspLstDtlR.$lot_no_data, InspLstDtlR.$sublot_no_data);
		}

		/**
		 * 印刷実行
		 * @param rs
		 * @param data
		 */
		protected void execPrnt(MSBFR_InspLst rs, MCList<InspLstDtlR> data) {
			rs.addAll(data);
			rs.setPersistent(false);
			MCServerReportManager.request(rs);
		}

		/**
		 * 検査指図テーブル更新用のdbContainerのset句を編集する。
		 * @param inspInstL 更新用リスト
		 */
		protected void editInspInstLSetStmt(MCList<MST_INSP_INST_R> inspInstL, 
				MST_INSP_INST_R t, MCQueryApiBuilder inspInstL_bldr) {
			inspInstL_bldr.setSet(t.insp_lst_no);
			inspInstL_bldr.addSet(t.insp_lst_prnt_flg);
			inspInstL_bldr.addSet(t.insp_lst_prnt_tm);
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().addAll(up0());
		}
	}
	/**
	 * InspRpt_Prnt02オペレーション.<p>
	 *
	 * 検査成績書を発行する。<br>
	 */
	public class InspRpt_Prnt02 extends MSBFL_InspRptService_MC_A.InspRpt_Prnt02 {
		/** 検査成績書の発行データリスト */
		protected MCList<InspRpt_Prnt02_DtlR> _prntDataL = null;
		/** 検査成績書の再発行データリスト */
		protected MCList<InspRpt_Prnt02_DtlR> _reprntDataL = null;
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			// 前処理
			prepare();

			// 検査指図存在チェック
			MCList<InspRpt_Prnt02_DtlR> tgtL = MCList.create(InspRpt_Prnt02_DtlR.class);
			chkInspInst(tgtL);

			MCList<InspRpt_Prnt02_DtlR> notErrL = tgtL.subList(InspRpt_Prnt02_DtlR.$err_flg, false);

			if (notErrL.size() != 0) {

				// 検査指図情報（電文）編集
				MCList<InspRpt_Prnt02_DtlR> updL = editUp(notErrL);

				// 検査指図の更新
				updInspInst(updL);

				// 印刷処理
				prntMain();
			}

			// 下り電文設定
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void prepare() {
			sortUp();
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().addAll(up0());
		}

		/**
		 * 更新前に上り電文をソートする。
		 */
		protected void sortUp() {
			up0().sort(InspRpt_Prnt02_DtlR.$insp_no);
		}

		/**
		 * 検査指図の存在チェックを実行する。
		 * @return
		 */
		protected void chkInspInst(MCList<InspRpt_Prnt02_DtlR> tgtL) {
			MCList<MST_INSP_INST_R> lockL = lockInspInst();
			MCIndexKey idxkey = lockL.createIndex(MST_INSP_INST_R.$insp_no);

			MCMessageList msgList = new MCMessageList();
			for (InspRpt_Prnt02_DtlR upR : up0()) {
				MST_INSP_INST_R lockR = lockL.getFirst(idxkey, upR.insp_no());

				if (isNull(lockR)) {
					upR.err_flg(true);
					msgList.addAll(getRecordNotFoundMsg(
							"MS",
							"MST_INSP_INST",
							new String[]{MST_INSP_INST_R.$insp_no},
							new Comparable[]{upR.insp_no()}, upR));
					continue;
				}

				upR.site_cd(lockR.to_site_cd());
				upR.insp_rslt_prnt_flg(lockR.insp_rslt_prnt_flg());
				upR.insp_rslt_prnt_tm(lockR.insp_rslt_prnt_tm());
				upR.seq(lockR.seq());
				
				// 抜取規格検査のみを検査成績書発行対象とする。
				if (MAC_INSP_MTD_TYP.isSPEC(lockR.insp_mtd_typ())) {
					tgtL.add(upR);
				}
			}

			if (!msgList.isEmpty()) {
				MCMessagePool.addAll(msgList);
			}
		}

		/**
		 * 検査指図をロックする。
		 * @return
		 */
		protected MCList<MST_INSP_INST_R> lockInspInst() {
			MCList<MST_INSP_INST_R> lockL = MCList.create(MST_INSP_INST_R.class);
			MCQueryApiBuilder lockL_bldr = MCQueryApiBuilder.create(MST_INSP_INST_R.create("T"));
			dbSelectKeyForUpdate("MSBFL5330_MST_INSP_INST_S02", lockL, lockL_bldr, up0());

			return lockL;
		}

		/**
		 * 上り電文を編集する。
		 * 
		 * @param subL
		 */
		protected MCList<InspRpt_Prnt02_DtlR> editUp(MCList<InspRpt_Prnt02_DtlR> subL) {
			_prntDataL = subL.subList(InspRpt_Prnt02_DtlR.$insp_rslt_prnt_flg, false);
			_reprntDataL = subL.subList(InspRpt_Prnt02_DtlR.$insp_rslt_prnt_flg, true);

			MCDate prntDt = MCDate.now();
			MCList<InspRpt_Prnt02_DtlR> rtnL = MCList.create(InspRpt_Prnt02_DtlR.class);
			for (InspRpt_Prnt02_DtlR r : subL) {
				if (!isSame(getSysParm("MFG_INSP_PRNT_REV_FLG"), "1") || !r.insp_rslt_prnt_flg()) {
					r.insp_rslt_prnt_flg(true);
					r.insp_rslt_prnt_tm(prntDt);
					rtnL.add(r);
				}
			}
			return rtnL;
		}

		/**
		 * 検査指図テーブルを更新する。
		 */
		protected void updInspInst(MCList<InspRpt_Prnt02_DtlR> subL) {
			MCList<MST_INSP_INST_R> updInspInstL = MCList.create(MST_INSP_INST_R.class);

			addAll(updInspInstL, subL, createMap_MST_INSP_INST_R_InspRpt_Prnt02_DtlR());

			if (!updInspInstL.isEmpty()) {

				MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
				MCQueryApiBuilder updInspInstL_bldr = MCQueryApiBuilder.create(t);
				editInspInstLSetStmt(updInspInstL, t, updInspInstL_bldr);

				dbUpdateKey("MSBFL5330_MST_INSP_INST_U02", updInspInstL, updInspInstL_bldr);
			}
		}

		/**
		 * 印刷処理
		 */
		protected void prntMain() {
			MCList<InspRpt_Prnt02_DtlR> tmpPrntDataL = MCList.create(InspRpt_Prnt02_DtlR.class);
			tmpPrntDataL.setAll(_prntDataL);
			if (isSame(getSysParm("MFG_INSP_PRNT_REV_FLG"), "1")) {
				// 再発行
				reprintData();
			}
			else {
				tmpPrntDataL.addAll(_reprntDataL);
			}

			// 最初発行
			if (!tmpPrntDataL.isEmpty()) {
				printData(tmpPrntDataL);
			}
		}

		/**
		 * 再発行する。
		 */
		protected void reprintData() {
			// 検査成績書の再発行情報リスト
			MCList<MCReportInfoR> reprntInfoList = MCList.create(MCReportInfoR.class);
			for (InspRpt_Prnt02_DtlR r : _reprntDataL) {
				MSBFR_InspRslt reportSet = MSBFR_InspRslt.create();
				
				// 業務情報を設定し、印刷データからデータを取得
				reportSet.setAppTitle1(MCConst.repotlbl.getLabel("MS.MSBFR0030.label"));
				reportSet.setAppReportNo1(r.insp_no());
				reportSet.setAppReportNo2(r.seq().toString());
				reportSet.setAppReportSts1(MAC_RPT_STS_TYP.CRT.value());
				reportSet.setAppFromCd1(r.site_cd());

				MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(reportSet, false);
				reprntInfoList.addAll(infoL);
			}
			if (!reprntInfoList.isEmpty()) {
				MCServerReportManager.reprint(reprntInfoList);
			}
		}

		/**
		 * 最初発行する。
		 */
		protected void printData(MCList<InspRpt_Prnt02_DtlR> prntDataL) {
			MSBFR_InspRslt rs = MSBFR_InspRslt.create();
			MCDate prntDt = MCDate.now();
			for (InspRpt_Prnt02_DtlR r : prntDataL) {
				if (rs.size() > 0) {
					rs.addNextPageRow();
				}
				InspRsltHdrR hdrR  = getPrntHdrData(r);
				MCList<InspRsltDtlR> dtlL = getPrntDtlData(r);

				editPrntHdrData(rs, hdrR, dtlL, prntDt);
				editPrntDtlData(rs, hdrR, dtlL);

				// 再印刷データ作成
				crtReprintData(r, hdrR, dtlL, prntDt);
			}

			if (rs.size() > 0) {
				rs.setPersistent(false);
				execPrnt(rs);
			}
		}

		/**
		 * 印刷実行
		 * @param rs
		 */
		protected void execPrnt(MSBFR_InspRslt rs) {
			MCServerReportManager.request(rs);
		}

		/**
		 * 印刷データを作成する。
		 */
		protected void crtReprintData(InspRpt_Prnt02_DtlR upR, InspRsltHdrR hdrR, MCList<InspRsltDtlR> dtlL, MCDate prntDt) {
			MSBFR_InspRslt reportSet = MSBFR_InspRslt.create();

			reportSet.setAppTitle1(MCConst.repotlbl.getLabel("MS.MSBFR0030.label"));
			reportSet.setAppReportNo1(hdrR.insp_no());
			reportSet.setAppReportNo2(upR.seq().toString());
			reportSet.setAppReportSts1(MAC_RPT_STS_TYP.CRT.value());
			reportSet.setAppReportStsNm1(MAC_RPT_STS_TYP.CRT.name());
			reportSet.setAppFromCd1(hdrR.site_cd());
			reportSet.setAppFromNm1(hdrR.site_nm());
			
			reportSet.addRow(hdrR);
			reportSet.addAll(dtlL);

			MCServerReportManager.request(reportSet, false);
		}

		/**
		 * 検査指図テーブル更新用のdbContainerのset句を編集する。
		 * @param inspInstL 更新用リスト
		 */
		protected void editInspInstLSetStmt(MCList<MST_INSP_INST_R> inspInstL,
				MST_INSP_INST_R t, MCQueryApiBuilder inspInstL_bldr) {
			inspInstL_bldr.setSet(t.insp_rslt_prnt_flg);
			inspInstL_bldr.addSet(t.insp_rslt_prnt_tm);
		}

		/**
		 * 検査成績書用のデータ（ヘッダ）を編集する。
		 * @param data
		 */
		protected void editPrntHdrData(MSBFR_InspRslt rs, InspRsltHdrR hdrR, MCList<InspRsltDtlR> dtlL, MCDate prntDt) {
			hdrR.insp_no_lbl(MSC_INSP_PRNT_STR.INSP_NO.name(getUsrLocale()));
			hdrR.form_name(MSC_INSP_PRNT_STR.INSP_RSLT_SHEET.name(getUsrLocale()));
			hdrR.prnt_tm(prntDt);
			hdrR.insp_ptn_nm_lbl(MSC_INSP_PRNT_STR.INSP_PTN_NM.name(getUsrLocale()));
			hdrR.qn_insp_val_lbl(MSC_INSP_PRNT_STR.QN_INSP_VAL.name(getUsrLocale()));
			hdrR.insp_end_tm_lbl(MSC_INSP_PRNT_STR.END_TM.name(getUsrLocale()));
			hdrR.insp_point_nm_lbl(MSC_INSP_PRNT_STR.INSP_POINT_NM.name(getUsrLocale()));
			hdrR.ql_insp_val_lbl(MSC_INSP_PRNT_STR.QL_INSP_VAL.name(getUsrLocale()));
			hdrR.insp_usr_nm_lbl(MSC_INSP_PRNT_STR.INSP_USR_NM.name(getUsrLocale()));

			// 版ＮＯが空でない場合、ラベルを設定
			if (!isNull(hdrR.ver_no())) {
				if (isSame(getSysParm("VER_ENABLE_FLG"), "1")) {
					hdrR.ver_no_lbl(MSC_INSP_PRNT_STR.VER_NO.name(getUsrLocale()));
				}
				else {
					hdrR.ver_no(null);
				}
			}

			if (!isNull(hdrR.insp_judg_rslt_typ())) {
				MSC_INSP_JUDG_RSLT_TYP.putNameNE(hdrR, InspRsltHdrR.$insp_judg_rslt_typ, InspRsltHdrR.$insp_judg_rslt_typ_nm, getUsrLocale());
			}

			//品目ＣＤを表示用に変換
			putPrntItmSub1(hdrR, InspRsltHdrR.$itm_sub1_view, InspRsltHdrR.$itm_sub1_data);
			putPrntItmSub2(hdrR, InspRsltHdrR.$itm_sub2_view, InspRsltHdrR.$itm_sub2_data);
			putPrntItmSub3(hdrR, InspRsltHdrR.$itm_sub3_view, InspRsltHdrR.$itm_sub3_data);

			//ロットＮＯを表示用に変換
			putPrntStr(hdrR, InspRsltHdrR.$lot_no_view, InspRsltHdrR.$lot_no_data);
			putPrntStr(hdrR, InspRsltHdrR.$sublot_no_view, InspRsltHdrR.$sublot_no_data);

			// 品名設定
			if (!isNull(hdrR.ntfy_nm())) {
				hdrR.itm_nm(hdrR.ntfy_nm());
			}

			rs.addRow(hdrR);
		}

		/**
		 * 検査成績書用のデータ（明細）を編集する。
		 * @param data
		 */
		protected void editPrntDtlData(MSBFR_InspRslt rs, InspRsltHdrR hdrR, MCList<InspRsltDtlR> dtlL) {
			//整数部と小数部に分ける
			putNumStr(rs, dtlL, InspRsltDtlR.$s_int_qn_out_min, InspRsltDtlR.$s_dec_qn_out_min,
					InspRsltDtlR.$qn_out_min, InspRsltDtlR.$qn_int_frac);

			putNumStr(rs, dtlL, InspRsltDtlR.$s_int_qn_insp_val, InspRsltDtlR.$s_dec_qn_insp_val,
					InspRsltDtlR.$qn_insp_val, InspRsltDtlR.$qn_int_frac);

			putNumStr(rs, dtlL, InspRsltDtlR.$s_int_qn_out_max, InspRsltDtlR.$s_dec_qn_out_max,
					InspRsltDtlR.$qn_out_max, InspRsltDtlR.$qn_int_frac);

			putNumStr(rs, dtlL, InspRsltDtlR.$s_int_qn_in_min, InspRsltDtlR.$s_dec_qn_in_min,
					InspRsltDtlR.$qn_in_min, InspRsltDtlR.$qn_int_frac);

			putNumStr(rs, dtlL, InspRsltDtlR.$s_int_qn_in_max, InspRsltDtlR.$s_dec_qn_in_max,
					InspRsltDtlR.$qn_in_max, InspRsltDtlR.$qn_int_frac);

			for (InspRsltDtlR r : dtlL) {
				//定数名を設定
				if (!isNull(r.insp_qlqn_typ())) {
					r.insp_qlqn_typ_nm(MAC_INSP_QLQN_TYP.get(r.insp_qlqn_typ()).name(getUsrLocale()));
				}
				if (!isNull(r.sign_out_min_typ())) {
					r.sign_out_min_typ_nm(MAC_SIGN_TYP.get(r.sign_out_min_typ()).name(getUsrLocale()));
				}
				if (!isNull(r.sign_out_max_typ())) {
					r.sign_out_max_typ_nm(MAC_SIGN_TYP.get(r.sign_out_max_typ()).name(getUsrLocale()));
				}
				if (!isNull(r.std_insp_rslt_typ())) {
					MSC_STD_INSP_RSLT_TYP.putNameNE(r, InspRsltDtlR.$std_insp_rslt_typ, InspRsltDtlR.$std_insp_rslt_typ_nm, getUsrLocale());
				}
				if (!isNull(r.sign_in_min_typ())) {
					r.sign_in_min_typ_nm(MAC_SIGN_TYP.get(r.sign_in_min_typ()).name(getUsrLocale()));
				}
				if (!isNull(r.sign_in_max_typ())) {
					r.sign_in_max_typ_nm(MAC_SIGN_TYP.get(r.sign_in_max_typ()).name(getUsrLocale()));
				}
			}
			rs.addAll(dtlL);
		}

		/**
		 * 検査成績書用のデータ（ヘッダ）を取得する。
		 * @return
		 */
		protected InspRsltHdrR getPrntHdrData(InspRpt_Prnt02_DtlR r) {
			InspRsltHdrR hdrR = InspRsltHdrR.create();
			executeQuery(hdrR, MSBFL5330_MST_INSP_INST_S02(), r);

			return hdrR;
		}

		/**
		 * 検査成績書用のデータ（明細）を取得する。
		 * @return
		 */
		protected MCList<InspRsltDtlR> getPrntDtlData(InspRpt_Prnt02_DtlR r) {
			MCList<InspRsltDtlR> dtlL = MCList.create(InspRsltDtlR.class);
			executeQuery(dtlL, MSBFL5330_MST_STD_INSP_INST_S01(), r);
			return dtlL;
		}
	}
	/**
	 * InspRpt_Prnt03オペレーション.<p>
	 *
	 * 工場出荷記録書を発行する。<br>
	 */
	public class InspRpt_Prnt03 extends MSBFL_InspRptService_MC_A.InspRpt_Prnt03 {
		/** 工場出荷記録書の発行データリスト */
		protected MCList<InspRpt_Prnt03_DtlR> _prntDataL = null;
		/** 工場出荷記録書の再発行データリスト */
		protected MCList<InspRpt_Prnt03_DtlR> _reprntDataL = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 前処理
			prepare();

			// 工場出荷承認ヘッダの存在チェック
			chkPlntAprv();

			MCList<InspRpt_Prnt03_DtlR> notErrL = up0().subList(InspRpt_Prnt03_DtlR.$err_flg, false);
			if (notErrL.size() != 0) {

				// 工場出荷承認情報（電文）編集
				MCList<InspRpt_Prnt03_DtlR> updL = editUp(notErrL);

				// 工場出荷承認ヘッダの更新
				updPlntAprv(updL);

				// 印刷処理
				prntMain();
			}

			// 下り電文設定
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void prepare() {
			// ソート
			sortUp();
		}

		/**
		 * 更新前に上り電文をソートする。
		 */
		protected void sortUp() {
			up0().sort(InspRpt_Prnt03_DtlR.$plnt_aprv_no);
		}

		/**
		 * 上り電文を編集する。
		 */
		protected MCList<InspRpt_Prnt03_DtlR> editUp(MCList<InspRpt_Prnt03_DtlR> subL) {
			_prntDataL = subL.subList(InspRpt_Prnt03_DtlR.$plnt_aprv_prnt_flg, false);
			_reprntDataL = subL.subList(InspRpt_Prnt03_DtlR.$plnt_aprv_prnt_flg, true);

			MCDate prntDt = MCDate.now();
			MCList<InspRpt_Prnt03_DtlR> rtnL = MCList.create(InspRpt_Prnt03_DtlR.class);
			for (InspRpt_Prnt03_DtlR r : subL) {
				if (!isSame(getSysParm("MFG_INSP_PRNT_REV_FLG"), "1") || !r.plnt_aprv_prnt_flg()) {
					r.plnt_aprv_prnt_flg(true);
					r.plnt_aprv_prnt_tm(prntDt);
					rtnL.add(r);
				}
			}
			return rtnL;
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().addAll(up0());
		}

		/**
		 * 工場出荷承認ヘッダの存在チェックを実行する。
		 * @return
		 */
		protected void chkPlntAprv() {
			MCList<MST_PLNT_APRV_R> lockL = lockPlntAprv();
			MCIndexKey idxkey = lockL.createIndex(MST_PLNT_APRV_R.$plnt_aprv_no);

			MCMessageList msgList = new MCMessageList();
			for (InspRpt_Prnt03_DtlR upR : up0()) {
				MST_PLNT_APRV_R lockR = lockL.getFirst(idxkey, upR.plnt_aprv_no());

				if (isNull(lockR)) {
					upR.err_flg(true);
					msgList.addAll(getRecordNotFoundMsg(
							"MS",
							"MST_PLNT_APRV",
							new String[]{MST_PLNT_APRV_R.$plnt_aprv_no},
							new Comparable[]{upR.plnt_aprv_no()}, upR));
					continue;
				}

				upR.aprv_usr_cd(lockR.aprv_usr_cd());
				upR.aprv_dpt_cd(lockR.aprv_dpt_cd());
				upR.site_cd(lockR.site_cd());
				upR.plnt_aprv_prnt_flg(lockR.plnt_aprv_prnt_flg());
				upR.plnt_aprv_prnt_tm(lockR.plnt_aprv_prnt_tm());
				upR.seq(lockR.seq());
			}

			if (!msgList.isEmpty()) {
				MCMessagePool.addAll(msgList);
			}
		}

		/**
		 * 工場出荷承認ヘッダをロックする。
		 * @return
		 */
		protected MCList<MST_PLNT_APRV_R> lockPlntAprv() {
			MCList<MST_PLNT_APRV_R> lockL = MCList.create(MST_PLNT_APRV_R.class);
			MCQueryApiBuilder lockL_bldr = MCQueryApiBuilder.create(MST_PLNT_APRV_R.create("T"));
			dbSelectKeyForUpdate("MSBFL5330_MST_PLNT_APRV_S01", lockL, lockL_bldr, up0());

			return lockL;
		}

		/**
		 * 工場出荷承認ヘッダテーブルを更新する。
		 */
		protected void updPlntAprv(MCList<InspRpt_Prnt03_DtlR> subL) {
			MCList<MST_PLNT_APRV_R> updPlntAprvL = MCList.create(MST_PLNT_APRV_R.class);

			addAll(updPlntAprvL, subL, createMap_MST_PLNT_APRV_R_InspRpt_Prnt03_DtlR());

			if (!updPlntAprvL.isEmpty()) {

				MST_PLNT_APRV_R t = MST_PLNT_APRV_R.create("T");
				MCQueryApiBuilder updPlntAprvL_bldr = MCQueryApiBuilder.create(t);
				editPlntAprvLSetStmt(updPlntAprvL, t, updPlntAprvL_bldr);

				dbUpdateKey("MSBFL5330_MST_PLNT_APRV_U01", updPlntAprvL, updPlntAprvL_bldr);
			}
		}

		/**
		 * 工場出荷承認ヘッダテーブル更新用のdbContainerのset句を編集する。
		 * @param plntAprvL 更新用リスト
		 */
		protected void editPlntAprvLSetStmt(MCList<MST_PLNT_APRV_R> plntAprvL,
				MST_PLNT_APRV_R t, MCQueryApiBuilder plntAprvL_bldr) {
			plntAprvL_bldr.setSet(t.plnt_aprv_prnt_flg);
			plntAprvL_bldr.addSet(t.plnt_aprv_prnt_tm);
		}

		protected void prntMain() {
			MCList<InspRpt_Prnt03_DtlR> tmpPrntDataL = MCList.create(InspRpt_Prnt03_DtlR.class);
			tmpPrntDataL.setAll(_prntDataL);
			if (isSame(getSysParm("MFG_INSP_PRNT_REV_FLG"), "1")) {
				// 再発行
				reprintData();
			}
			else {
				tmpPrntDataL.addAll(_reprntDataL);
			}
			// 最初発行
			if (!tmpPrntDataL.isEmpty()) {
				printData(tmpPrntDataL);
			}
		}

		/**
		 * 再発行する。
		 */
		protected void reprintData() {
			// 記録書の再発行情報リスト
			MCList<MCReportInfoR> reprntInfoList = MCList.create(MCReportInfoR.class);
			for (InspRpt_Prnt03_DtlR r : _reprntDataL) {
				MSBFR_PlntAprv reportSet = MSBFR_PlntAprv.create();
				
				// 業務情報を設定し、印刷データからデータを取得
				reportSet.setAppTitle1(MCConst.repotlbl.getLabel("MS.MSBFR0040.label"));
				reportSet.setAppReportNo1(r.plnt_aprv_no());
				reportSet.setAppReportNo2(r.seq().toString());
				reportSet.setAppReportSts1(MAC_RPT_STS_TYP.CRT.value());
				reportSet.setAppUsrCd1(r.aprv_usr_cd());
				reportSet.setAppUsrCd2(r.aprv_dpt_cd());
				reportSet.setAppFromCd1(r.site_cd());
				MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(reportSet, false);
				reprntInfoList.addAll(infoL);
			}
			if (!reprntInfoList.isEmpty()) {
				MCServerReportManager.reprint(reprntInfoList);
			}
		}

		/**
		 * 最初発行する。
		 */
		protected void printData(MCList<InspRpt_Prnt03_DtlR> prntDataL) {
			MSBFR_PlntAprv rs = MSBFR_PlntAprv.create();
			MCDate prntDt = MCDate.now();
			for (InspRpt_Prnt03_DtlR r : prntDataL) {
				if (rs.size() > 0) {
					rs.addNextPageRow();
				}
				PlntAprvHdrR hdrR  = getPrntHdrData(r);

				editPrntHdrData(rs, hdrR, prntDt);

				// 再印刷データ作成
				crtReprintData(r, hdrR, prntDt);
			}

			if (rs.size() > 0) {
				rs.setPersistent(false);
				execPrnt(rs);
			}
		}

		/**
		 * 印刷データを作成する。
		 */
		protected void crtReprintData(InspRpt_Prnt03_DtlR r, PlntAprvHdrR hdrR, MCDate prntDt) {
			MSBFR_PlntAprv reportSet = MSBFR_PlntAprv.create();

			reportSet.setAppTitle1(MCConst.repotlbl.getLabel("MS.MSBFR0040.label"));
			reportSet.setAppReportNo1(hdrR.plnt_aprv_no());
			reportSet.setAppReportNo2(r.seq().toString());
			reportSet.setAppReportSts1(MAC_RPT_STS_TYP.CRT.value());
			reportSet.setAppUsrCd1(hdrR.aprv_usr_cd());
			reportSet.setAppUsrCd2(hdrR.aprv_dpt_cd());
			reportSet.setAppFromCd1(hdrR.site_cd());
			reportSet.setAppReportStsNm1(MAC_RPT_STS_TYP.CRT.name());
			reportSet.setAppUsrNm1(hdrR.aprv_usr_nm());
			reportSet.setAppUsrNm2(hdrR.aprv_dpt_nm());
			reportSet.setAppFromNm1(hdrR.site_nm());
			reportSet.addRow(hdrR);

			MCServerReportManager.request(reportSet, false);
		}

		/**
		 * 工場出荷許可書用のデータ（ヘッダ）を取得する。
		 * @return
		 */
		protected PlntAprvHdrR getPrntHdrData(InspRpt_Prnt03_DtlR r) {
			PlntAprvHdrR hdrR = PlntAprvHdrR.create();

			hdrR.prnt_tm(r.plnt_aprv_prnt_tm());

			executeQuery(hdrR, MSBFL5330_MST_PLNT_APRV_S01(), r);

			MCList<MST_PLNT_APRV_D_R> plntAprvDL = MCList.create(MST_PLNT_APRV_D_R.class);
			MST_PLNT_APRV_D_R plntAprvDL_t = MST_PLNT_APRV_D_R.create("T");
			MCQueryApiBuilder plntAprvDL_bldr = MCQueryApiBuilder.create(plntAprvDL_t);
			MAM_UNIT_R m1 = MAM_UNIT_R.create("M1");
			plntAprvDL_bldr.setSelect(plntAprvDL_t.base_unit_qty);
			plntAprvDL_bldr.addSelect(m1.unit_nm.as("base_unit_nm"));
			plntAprvDL_bldr.addSelect(m1.dec_place.as("base_dec_place"));
			plntAprvDL_bldr.addLeftOuterJoin(m1, bracket( plntAprvDL_t.base_unit_cd.eq(m1.unit_cd)));
			plntAprvDL_bldr.setWhere(plntAprvDL_t.plnt_aprv_no.eq(bind("1")), r.plnt_aprv_no());
			if (isSame(getSysParm("PLNT_APRV_LATEST_QTY_FLG"), "1")) {
				plntAprvDL_bldr.addOrderByDesc(plntAprvDL_t.plnt_aprv_d_no);
			}
			dbSelect("MSBFL5330_MST_PLNT_APRV_D_S01", plntAprvDL, plntAprvDL_bldr);

			if (!plntAprvDL.isEmpty()) {
				if (isSame(getSysParm("PLNT_APRV_LATEST_QTY_FLG"), "1")) {
					hdrR.base_unit_qty(plntAprvDL.get(0).base_unit_qty());
				}
				else {
					hdrR.base_unit_qty(plntAprvDL.sum(MST_PLNT_APRV_D_R.$base_unit_qty));
				}
				hdrR.base_unit_nm(plntAprvDL.get(0).getStringNE("BASE_UNIT_NM"));
				hdrR.base_dec_place(plntAprvDL.get(0).getNumberNE("BASE_DEC_PLACE"));
			}

			MST_INSP_ACT_R inspActR = MST_INSP_ACT_R.create();
			MST_INSP_ACT_R inspActR_t = MST_INSP_ACT_R.create("T");
			MCQueryApiBuilder inspActR_bldr = MCQueryApiBuilder.create(inspActR_t);
			MST_PLNT_APRV_D_R S1T2 = MST_PLNT_APRV_D_R.create("T2");
			inspActR_bldr.setSelect(max(inspActR_t.judg_dt).as("judg_dt"));
			inspActR_bldr.addInnerJoin(S1T2, bracket( inspActR_t.insp_no.eq(S1T2.insp_no)));
			inspActR_bldr.setWhere(S1T2.plnt_aprv_no.eq(bind("1")), r.plnt_aprv_no());
			dbSelect("MSBFL5330_MST_INSP_ACT_S01", inspActR, inspActR_bldr);

			hdrR.insp_judg_dt(inspActR.judg_dt());

			MST_MFG_ACT_R actR = MST_MFG_ACT_R.create();
			MST_MFG_ACT_R actR_t = MST_MFG_ACT_R.create("T");
			MCQueryApiBuilder actR_bldr = MCQueryApiBuilder.create(actR_t);
			MST_PLNT_APRV_D_R S2T2 = MST_PLNT_APRV_D_R.create("T2");
			actR_bldr.setSelect(max(actR_t.aprv_dt).as("aprv_dt"));
			actR_bldr.addSelect(max(actR_t.end_act_tm).as("end_act_tm"));
			actR_bldr.addInnerJoin(S2T2, bracket( actR_t.mfg_inst_no.eq(S2T2.src_no1)));
			actR_bldr.setWhere(S2T2.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())));
			actR_bldr.addWhereWithAnd(S2T2.plnt_aprv_no.eq(bind("1")), r.plnt_aprv_no());
			dbSelect("MSBFL5330_MST_MFG_ACT_S01", actR, actR_bldr);

			if (isNullAnd(actR.aprv_dt(), actR.end_act_tm())) {
				// 外注の受入検査の場合は、上記SQLでは取得できないので、
				// 入荷明細ＮＯから製造実績を取得するSQLを再実行する。
				actR = MST_MFG_ACT_R.create();
				actR_t = MST_MFG_ACT_R.create("T");
				actR_bldr = MCQueryApiBuilder.create(actR_t);
				MST_ARR_SCHD_R S3T2 = MST_ARR_SCHD_R.create("T2");
				MST_ARR_ACT_R S3T3 = MST_ARR_ACT_R.create("T3");
				MST_PLNT_APRV_D_R S3T4 = MST_PLNT_APRV_D_R.create("T4");

				actR_bldr.setSelect(max(actR_t.aprv_dt).as("aprv_dt"));
				actR_bldr.addSelect(max(actR_t.end_act_tm).as("end_act_tm"));
				actR_bldr.addInnerJoin(S3T2, bracket( actR_t.mfg_inst_no.eq(S3T2.mfg_inst_no)));
				actR_bldr.addInnerJoin(S3T3, bracket( S3T2.arr_schd_no.eq(S3T3.arr_schd_no)));
				actR_bldr.addInnerJoin(S3T4, bracket( S3T3.arr_act_no.eq(S3T4.src_no4)));
				actR_bldr.setWhere(S3T4.insp_typ.eq(value(MSC_INSP_TYP.ACCPT.value())));
				actR_bldr.addWhereWithAnd(S3T4.plnt_aprv_no.eq(bind("1")), r.plnt_aprv_no());
				dbSelect("MSBFL5330_MST_MFG_ACT_S02", actR, actR_bldr);
			}

			if (!isNull(actR.aprv_dt())) {
				hdrR.act_aprv_dt(actR.aprv_dt());
			}
			else {
				hdrR.act_aprv_dt((isNull(actR.end_act_tm()) ? null : actR.end_act_tm().trunc(MCDateFieldType.DAY)));
			}

			return hdrR;
		}

		/**
		 * 工場出荷許可書用のデータ（ヘッダ）を編集する。
		 * @param data
		 */
		protected void editPrntHdrData(MSBFR_PlntAprv rs, PlntAprvHdrR hdrR, MCDate prntDt) {

			// 発行日時
			hdrR.prnt_tm(prntDt);

			// 品名設定
			if (!isNull(hdrR.ntfy_nm())) {
				hdrR.itm_nm(hdrR.ntfy_nm());
			}

			//ロットＮＯを表示用に変換
			putPrntStr(hdrR, PlntAprvHdrR.$lot_no_view, PlntAprvHdrR.$lot_no_data);
			putPrntStr(hdrR, PlntAprvHdrR.$sublot_no_view, PlntAprvHdrR.$sublot_no_data);

			//数量をフォーマット
			putNumStr(rs, hdrR, PlntAprvHdrR.$s_base_unit_qty, PlntAprvHdrR.$base_unit_qty,
					hdrR.base_dec_place());

			// サブロットＮＯが空でない場合、ラベルを設定
			if (!isNull(hdrR.sublot_no_data())) {
				hdrR.sublot_no_lbl(MSC_INSP_PRNT_STR.SUBLOT_NO.name(getUsrLocale()));
			}

			// 承認状況区分から承認・却下を判別して、承認・却下メッセージを設定
			if (MSC_PLNT_APRV_STS_TYP.isACPT(hdrR.plnt_aprv_sts_typ())) {
				hdrR.plnt_aprv_sts_typ_nm(MSC_INSP_PRNT_STR.ACPT_MSG.name(getUsrLocale()));
			}
			else if (MSC_PLNT_APRV_STS_TYP.isRJCT(hdrR.plnt_aprv_sts_typ())) {
				hdrR.plnt_aprv_sts_typ_nm(MSC_INSP_PRNT_STR.RJCT_MSG.name(getUsrLocale()));
			}

			rs.addRow(hdrR);
		}

		/**
		 * 印刷実行
		 * @param rs
		 */
		protected void execPrnt(MSBFR_PlntAprv rs) {
			MCServerReportManager.request(rs);
		}
	}
	/**
	 * InspRpt_Prnt04オペレーション.<p>
	 *
	 * 市場出荷可否判定記録書を発行する。<br>
	 */
	public class InspRpt_Prnt04 extends MSBFL_InspRptService_MC_A.InspRpt_Prnt04 {
		/** 市場出荷可否判定記録書の発行データリスト */
		protected MCList<InspRpt_Prnt04_DtlR> _prntDataL = null;
		/** 市場出荷可否判定記録書の再発行データリスト */
		protected MCList<InspRpt_Prnt04_DtlR> _reprntDataL = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 前処理
			prepare();

			// 市場出荷判定ヘッダの存在チェック
			chkMrktJudg();

			MCList<InspRpt_Prnt04_DtlR> notErrL = up0().subList(InspRpt_Prnt04_DtlR.$err_flg, false);
			if (notErrL.size() != 0) {

				// 市場出荷判定情報（電文）編集
				MCList<InspRpt_Prnt04_DtlR> updL = editUp(notErrL);

				// 市場出荷判定ヘッダの更新
				updMrktJudg(updL);

				// 印刷処理
				prntMain();
			}

			// 下り電文設定
			setDown();
		}

		/**
		 * 前処理
		 */
		protected void prepare() {
			sortUp();
		}

		/**
		 * 更新前に上り電文をソートする。
		 */
		protected void sortUp() {
			up0().sort(InspRpt_Prnt04_DtlR.$mrkt_judg_no);
		}

		/**
		 * 上り電文を編集する。
		 */
		protected MCList<InspRpt_Prnt04_DtlR> editUp(MCList<InspRpt_Prnt04_DtlR> subL) {
			_prntDataL = subL.subList(InspRpt_Prnt04_DtlR.$mrkt_judg_prnt_flg, false);
			_reprntDataL = subL.subList(InspRpt_Prnt04_DtlR.$mrkt_judg_prnt_flg, true);

			MCDate prntDt = MCDate.now();
			MCList<InspRpt_Prnt04_DtlR> rtnL = MCList.create(InspRpt_Prnt04_DtlR.class);
			for (InspRpt_Prnt04_DtlR r : subL) {
				if (!isSame(getSysParm("MFG_INSP_PRNT_REV_FLG"), "1") || !r.mrkt_judg_prnt_flg()) {
					r.mrkt_judg_prnt_flg(true);
					r.mrkt_judg_prnt_tm(prntDt);
					rtnL.add(r);
				}
			}
			return rtnL;
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().addAll(up0());
		}

		/**
		 * 市場出荷判定ヘッダの存在チェックを実行する。
		 * @return
		 */
		protected void chkMrktJudg() {
			MCList<MST_MRKT_JUDG_R> lockL = lockMrktJudg();
			MCIndexKey idxkey = lockL.createIndex(MST_MRKT_JUDG_R.$mrkt_judg_no);

			MCMessageList msgList = new MCMessageList();
			for (InspRpt_Prnt04_DtlR upR : up0()) {
				MST_MRKT_JUDG_R lockR = lockL.getFirst(idxkey, upR.mrkt_judg_no());

				if (isNull(lockR)) {
					upR.err_flg(true);
					msgList.addAll(getRecordNotFoundMsg(
							"MS",
							"MST_MRKT_JUDG",
							new String[]{MST_MRKT_JUDG_R.$mrkt_judg_no},
							new Comparable[]{upR.mrkt_judg_no()}, upR));
					continue;
				}

				upR.mrkt_judg_prnt_flg(lockR.mrkt_judg_prnt_flg());
				upR.mrkt_judg_prnt_tm(lockR.mrkt_judg_prnt_tm());
				upR.seq(lockR.seq());
			}

			if (!msgList.isEmpty()) {
				MCMessagePool.addAll(msgList);
			}
		}

		/**
		 * 市場出荷判定ヘッダをロックする。
		 * @return
		 */
		protected MCList<MST_MRKT_JUDG_R> lockMrktJudg() {
			MCList<MST_MRKT_JUDG_R> lockL = MCList.create(MST_MRKT_JUDG_R.class);
			MCQueryApiBuilder lockL_bldr = MCQueryApiBuilder.create(MST_MRKT_JUDG_R.create("T"));
			dbSelectKeyForUpdate("MSBFL5330_MST_MRKT_JUDG_S01", lockL, lockL_bldr, up0());

			return lockL;
		}

		/**
		 * 市場出荷判定ヘッダテーブルを更新する。
		 */
		protected void updMrktJudg(MCList<InspRpt_Prnt04_DtlR> subL) {
			MCList<MST_MRKT_JUDG_R> updMrktJudgL = MCList.create(MST_MRKT_JUDG_R.class);

			addAll(updMrktJudgL, subL, createMap_MST_MRKT_JUDG_R_InspRpt_Prnt04_DtlR());

			if (!updMrktJudgL.isEmpty()) {
				MST_MRKT_JUDG_R t = MST_MRKT_JUDG_R.create("T");
				MCQueryApiBuilder updMrktJudgL_bldr = MCQueryApiBuilder.create(t);
				editMrktJudgLSetStmt(updMrktJudgL, t, updMrktJudgL_bldr);

				dbUpdateKey("MSBFL5330_MST_MRKT_JUDG_U01", updMrktJudgL, updMrktJudgL_bldr);
			}
		}

		/**
		 * 印刷処理
		 */
		protected void prntMain() {
			MCList<InspRpt_Prnt04_DtlR> tmpPrntDataL = MCList.create(InspRpt_Prnt04_DtlR.class);
			tmpPrntDataL.setAll(_prntDataL);

			if (isSame(getSysParm("MFG_INSP_PRNT_REV_FLG"), "1")) {
				// 再発行
				reprintData();
			}
			else {
				tmpPrntDataL.addAll(_reprntDataL);
			}
			// 最初発行
			if (!tmpPrntDataL.isEmpty()) {
				printData(tmpPrntDataL);
			}
		}

		/**
		 * 再発行する。
		 */
		protected void reprintData() {
			// 記録書の再発行情報リスト
			MCList<MCReportInfoR> reprntInfoList = MCList.create(MCReportInfoR.class);
			for (InspRpt_Prnt04_DtlR r : _reprntDataL) {
				MSBFR_MrktJudg reportSet = MSBFR_MrktJudg.create();
				
				// 業務情報を設定し、印刷データからデータを取得
				reportSet.setAppTitle1(MCConst.repotlbl.getLabel("MS.MSBFR0050.label"));
				reportSet.setAppReportNo1(r.mrkt_judg_no());
				reportSet.setAppReportNo2(r.seq().toString());
				reportSet.setAppReportSts1(MAC_RPT_STS_TYP.CRT.value());
				reportSet.setAppFromCd1(r.site_cd());
				MCList<MCReportInfoR> infoL = MCServerReportManager.searchPrintData(reportSet, false);
				reprntInfoList.addAll(infoL);
			}
			if (!reprntInfoList.isEmpty()) {
				MCServerReportManager.reprint(reprntInfoList);
			}
		}

		/**
		 * 最初発行する。
		 */
		protected void printData(MCList<InspRpt_Prnt04_DtlR> prntDataL) {
			MSBFR_MrktJudg rs = MSBFR_MrktJudg.create();
			MCDate prntDt = MCDate.now();
			for (InspRpt_Prnt04_DtlR r : prntDataL) {
				if (rs.size() > 0) {
					rs.addNextPageRow();
				}
				MrktJudgHdrR hdrR  = getPrntHdrData(r);

				editPrntHdrData(rs, hdrR, prntDt);

				// 再印刷データ作成
				crtReprintData(r, hdrR, prntDt);
			}

			if (rs.size() > 0) {
				rs.setPersistent(false);
				execPrnt(rs);
			}
		}

		/**
		 * 印刷データを作成する。
		 */
		protected void crtReprintData(InspRpt_Prnt04_DtlR r, MrktJudgHdrR hdrR, MCDate prntDt) {
			MSBFR_MrktJudg reportSet = MSBFR_MrktJudg.create();

			reportSet.setAppTitle1(MCConst.repotlbl.getLabel("MS.MSBFR0050.label"));
			reportSet.setAppReportNo1(hdrR.mrkt_judg_no());
			reportSet.setAppReportNo2(r.seq().toString());
			reportSet.setAppReportSts1(MAC_RPT_STS_TYP.CRT.value());
			reportSet.setAppUsrCd1(hdrR.judg_usr_cd());
			reportSet.setAppUsrCd2(hdrR.judg_dpt_cd());
			reportSet.setAppFromCd1(hdrR.site_cd());
			reportSet.setAppReportStsNm1(MAC_RPT_STS_TYP.CRT.name());
			reportSet.setAppUsrNm1(hdrR.judg_usr_nm());
			reportSet.setAppUsrNm2(hdrR.judg_dpt_nm());
			reportSet.setAppFromNm1(hdrR.site_nm());
			reportSet.addRow(hdrR);

			MCServerReportManager.request(reportSet, false);
		}

		/**
		 * 市場出荷記録書用のデータを取得する。
		 * @return
		 */
		protected MrktJudgHdrR getPrntHdrData(InspRpt_Prnt04_DtlR r) {
			MrktJudgHdrR hdrR = MrktJudgHdrR.create();
			executeQuery(hdrR, MSBFL5330_MST_MRKT_JUDG_S01(), r);

			return hdrR;
		}

		/**
		 * 市場出荷判定ヘッダテーブル更新用のdbContainerのset句を編集する。
		 * @param mrktJudgL 更新用リスト
		 */
		protected void editMrktJudgLSetStmt(MCList<MST_MRKT_JUDG_R> mrktJudgL, MST_MRKT_JUDG_R t, 
				MCQueryApiBuilder mrktJudgL_bldr) {
			mrktJudgL_bldr.setSet(t.mrkt_judg_prnt_flg);
			mrktJudgL_bldr.addSet(t.mrkt_judg_prnt_tm);
		}

		/**
		 * 市場出荷判定記録書用のデータ（ヘッダ）を編集する。
		 * @param data
		 */
		protected void editPrntHdrData(MSBFR_MrktJudg rs, MrktJudgHdrR hdrR, MCDate prntDt) {

			// 発行日時
			hdrR.prnt_tm(prntDt);

			// 品名設定
			if (!isNull(hdrR.ntfy_nm())) {
				hdrR.itm_nm(hdrR.ntfy_nm());
			}

			//ロットＮＯを表示用に変換
			putPrntStr(hdrR, MrktJudgHdrR.$lot_no_view, MrktJudgHdrR.$lot_no_data);

			//数量をフォーマット
			putNumStr(rs, hdrR, MrktJudgHdrR.$s_unit_qty, MrktJudgHdrR.$base_unit_qty, hdrR.base_dec_place());

			//定数名を設定
			hdrR.mrkt_judg_sts_typ_nm(MSC_MRKT_JUDG_STS_TYP.get(hdrR.mrkt_judg_sts_typ()).name(getUsrLocale()));
			if (!isNull(hdrR.mfg_so_aprv_typ())) {
				hdrR.mfg_so_aprv_typ_nm(MSC_MFG_SO_APRV_TYP.get(hdrR.mfg_so_aprv_typ()).name(getUsrLocale()));
			}
			if (!isNull(hdrR.quality_mng_typ())) {
				hdrR.quality_mng_typ_nm(MSC_QUALITY_MNG_TYP.get(hdrR.quality_mng_typ()).name(getUsrLocale()));
			}
			if (!isNull(hdrR.mfg_mng_typ())) {
				hdrR.mfg_mng_typ_nm(MSC_MFG_MNG_TYP.get(hdrR.mfg_mng_typ()).name(getUsrLocale()));
			}
			if (!isNull(hdrR.deviant_typ())) {
				hdrR.deviant_typ_nm(MSC_DEVIANT_TYP.get(hdrR.deviant_typ()).name(getUsrLocale()));
			}
			if (!isNull(hdrR.deviant_msr_typ())) {
				hdrR.deviant_msr_typ_nm(MSC_DEVIANT_MSR_TYP.get(hdrR.deviant_msr_typ()).name(getUsrLocale()));
			}
			if (!isNull(hdrR.prod_itm_info_typ())) {
				hdrR.prod_itm_info_typ_nm(MSC_PROD_ITM_INFO_TYP.get(hdrR.prod_itm_info_typ()).name(getUsrLocale()));
			}
			if (!isNull(hdrR.chd_itm_info_typ())) {
				hdrR.chd_itm_info_typ_nm(MSC_CHD_ITM_INFO_TYP.get(hdrR.chd_itm_info_typ()).name(getUsrLocale()));
			}

			rs.addRow(hdrR);
		}

		/**
		 * 印刷実行
		 * @param rs
		 */
		protected void execPrnt(MSBFR_MrktJudg rs) {
			MCServerReportManager.request(rs);
		}
	}
	
	// Mapping
	protected Map_MST_INSP_INST_R_InspRpt_Prnt01_DtlR<MST_INSP_INST_R,InspRpt_Prnt01_DtlR> createMap_MST_INSP_INST_R_InspRpt_Prnt01_DtlR() {
		return new Map_MST_INSP_INST_R_InspRpt_Prnt01_DtlR<MST_INSP_INST_R, InspRpt_Prnt01_DtlR>();
	}

	public class Map_MST_INSP_INST_R_InspRpt_Prnt01_DtlR<D extends MST_INSP_INST_R, S extends InspRpt_Prnt01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_INSP_INST_R.$insp_no, InspRpt_Prnt01_DtlR.$insp_no);
			addColumnPathMap(MST_INSP_INST_R.$insp_lst_prnt_flg, InspRpt_Prnt01_DtlR.$insp_lst_prnt_flg);
			addColumnPathMap(MST_INSP_INST_R.$insp_lst_prnt_tm, InspRpt_Prnt01_DtlR.$insp_lst_prnt_tm);
			addColumnPathMap(MST_INSP_INST_R.$insp_lst_no, InspRpt_Prnt01_DtlR.$insp_lst_no);

		}
	}

	protected Map_MST_INSP_INST_R_InspRpt_Prnt02_DtlR<MST_INSP_INST_R,InspRpt_Prnt02_DtlR> createMap_MST_INSP_INST_R_InspRpt_Prnt02_DtlR() {
		return new Map_MST_INSP_INST_R_InspRpt_Prnt02_DtlR<MST_INSP_INST_R, InspRpt_Prnt02_DtlR>();
	}

	public class Map_MST_INSP_INST_R_InspRpt_Prnt02_DtlR<D extends MST_INSP_INST_R, S extends InspRpt_Prnt02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_INSP_INST_R.$insp_no, InspRpt_Prnt02_DtlR.$insp_no);
			addColumnPathMap(MST_INSP_INST_R.$insp_rslt_prnt_flg, InspRpt_Prnt02_DtlR.$insp_rslt_prnt_flg);
			addColumnPathMap(MST_INSP_INST_R.$insp_rslt_prnt_tm, InspRpt_Prnt02_DtlR.$insp_rslt_prnt_tm);

		}
	}

	protected Map_MST_PLNT_APRV_R_InspRpt_Prnt03_DtlR<MST_PLNT_APRV_R,InspRpt_Prnt03_DtlR> createMap_MST_PLNT_APRV_R_InspRpt_Prnt03_DtlR() {
		return new Map_MST_PLNT_APRV_R_InspRpt_Prnt03_DtlR<MST_PLNT_APRV_R, InspRpt_Prnt03_DtlR>();
	}

	public class Map_MST_PLNT_APRV_R_InspRpt_Prnt03_DtlR<D extends MST_PLNT_APRV_R, S extends InspRpt_Prnt03_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_PLNT_APRV_R.$plnt_aprv_no, InspRpt_Prnt03_DtlR.$plnt_aprv_no);
			addColumnPathMap(MST_PLNT_APRV_R.$plnt_aprv_prnt_flg, InspRpt_Prnt03_DtlR.$plnt_aprv_prnt_flg);
			addColumnPathMap(MST_PLNT_APRV_R.$plnt_aprv_prnt_tm, InspRpt_Prnt03_DtlR.$plnt_aprv_prnt_tm);
		}
	}

	protected Map_MST_MRKT_JUDG_R_InspRpt_Prnt04_DtlR<MST_MRKT_JUDG_R,InspRpt_Prnt04_DtlR> createMap_MST_MRKT_JUDG_R_InspRpt_Prnt04_DtlR() {
		return new Map_MST_MRKT_JUDG_R_InspRpt_Prnt04_DtlR<MST_MRKT_JUDG_R, InspRpt_Prnt04_DtlR>();
	}

	public class Map_MST_MRKT_JUDG_R_InspRpt_Prnt04_DtlR<D extends MST_MRKT_JUDG_R, S extends InspRpt_Prnt04_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_MRKT_JUDG_R.$mrkt_judg_no, InspRpt_Prnt04_DtlR.$mrkt_judg_no);
			addColumnPathMap(MST_MRKT_JUDG_R.$mrkt_judg_prnt_flg, InspRpt_Prnt04_DtlR.$mrkt_judg_prnt_flg);
			addColumnPathMap(MST_MRKT_JUDG_R.$mrkt_judg_prnt_tm, InspRpt_Prnt04_DtlR.$mrkt_judg_prnt_tm);
		}
	}

	//FMCB CUSTOM END
}