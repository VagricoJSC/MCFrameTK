package mcframe.serverMSBF.MSBFL5060;

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
import mcframe.serverMSBF.MSBFL5060.*;	// このimportはFrameManagerの自動生成で追加されました。
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import mcframe.commonCore.container.MCRow.Status;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;

import mcframe.serverMSBF.MSBFL5030.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_StdInspActRcptIFService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_StdInspActRcptIFService_MC extends MSBFL_StdInspActRcptIFService_MC_A{
	//FMCB CUSTOM START
	/** 更新カウンタチェックＦＬＧ */
	private boolean updCntrChkFlg = false;

	/**
	 * StdInspActIF_Upd01オペレーション.<p>
	 *
	 * 規格検査の実績を登録・更新する。<br>
	 */
	public class StdInspActIF_Upd01 extends MSBFL_StdInspActRcptIFService_MC_A.StdInspActIF_Upd01 {
		/** 検査ＮＯ（更新対象）セット */
		private Set<String> _inspNoSet = null;
		/** チェックＯＫ紐付けＮＯセット */
		private Set<MCNumber> _pegNoOKSet = new HashSet<MCNumber>();
		/** 検査ＮＯ毎の紐付けＮＯマップ */
		private Map<String, MCNumber> _pnMap = new HashMap<String, MCNumber>();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 更新前処理
			preProc(up0(), up1());
			// 規格検査明細チェック
			checkStdDtl();

			throwUpdErr();

			// 補完処理
			updCompletion();

			// 業務チェック
			callUpdChk();

			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())) {
				throwUpdErr();
			}

			// 更新処理
			execUpd();

			throwUpdErr();

			// 下り電文の設定処理
			down0().setAll(up2());
		}

		protected void checkStdDtl() {
			MCMessageList msgL = new MCMessageList();

			// 検査ＮＯセットの初期化
			_inspNoSet = new HashSet<String>();
			_inspNoSet.addAll(up1().getString(StdInspActIF_Upd01_HdrR.$insp_no));
			Set<String> stdInspInstNoSet = new HashSet<String>();

			for (StdInspActIF_Upd01_DtlR dtlR : up2()) {
				// 検査ＮＯの必須＆存在チェック
				msgL.addAll(check(dtlR, StdInspActIF_Upd01_DtlR.$insp_no, new FXUCL_RequiredValidater()));
				if (!isNull(dtlR.insp_no()) && !_inspNoSet.contains(dtlR.insp_no())) {
					msgL.add(new MCMessage(MSBFL0063, dtlR, dtlR.insp_no()));
				}

				// 規格検査指図ＮＯの必須＆重複チェック
				msgL.addAll(check(dtlR, StdInspActIF_Upd01_DtlR.$std_insp_inst_no, new FXUCL_RequiredValidater()));
				if (stdInspInstNoSet.contains(dtlR.std_insp_inst_no())) {
					msgL.add(new MCMessage(MSBFL0064, dtlR, dtlR.std_insp_inst_no()));
				} else if (!isNull(dtlR.std_insp_inst_no())) {
					stdInspInstNoSet.add(dtlR.std_insp_inst_no());
				}

				// 規格検査実績ＮＯの必須チェック（更新時）
				if (dtlR.isStatusModify() || dtlR.isStatusDelete()) {
					msgL.addAll(check(dtlR, StdInspActIF_Upd01_DtlR.$std_insp_act_no, new FXUCL_RequiredValidater()));
				}
			}

			if (!msgL.isEmpty()) {
				MCMessagePool.addAll(msgL);
			}
		}

		/**
		 * データ補完処理
		 */
		protected void updCompletion() {
			compHdr();
			compDtl();
		}

		/**
		 * 検査指図を補完する。
		 */
		protected void compHdr() {
			// 登録済の検査指図を取得する。
			MCList<MST_INSP_INST_R> selectL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setSelect(t.insp_no);
			selectL_bldr.addSelect(t.act_cont_fctr);

			MCList<MST_INSP_INST_R> bindL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R bindR = null;
			for (String inspNo : _inspNoSet) {
				bindR = MST_INSP_INST_R.create();
				bindR.insp_no(inspNo);
				bindL.add(bindR);
			}
			dbSelectColumn("MSBFL5060_MST_INSP_INST_S01",
					selectL, selectL_bldr, bindL, MST_INSP_INST_R.$insp_no);
			
			// 検査指図の補完を行う。
			MCNumber pegNo = new MCNumber(up1().size());
			MCIndexKey idxkey = selectL.createIndex(MST_INSP_INST_R.$insp_no);
			for (StdInspActIF_Upd01_HdrR row : up1()) {
				// 紐付けＮＯの再設定
				if (isNull(row.peg_no())) {
					pegNo = pegNo.add(MCNumber.ONE);
					row.peg_no(pegNo);
				}
				_pnMap.put(row.insp_no(), row.peg_no());

				// 実際有効成分係数の再設定
				MST_INSP_INST_R selectR = selectL.getFirst(idxkey, row.insp_no());
				if (isNull(selectR)) {
					continue;
				}

				row.act_cont_fctr(compVal(row.act_cont_fctr_upd_flg(), row.act_cont_fctr(), selectR.act_cont_fctr(), null));
			}
		}

		/**
		 * 規格検査実績を補完する。
		 */
		protected void compDtl() {
			// 規格検査指図を取得する。
			MCList<MST_STD_INSP_INST_R> instL = MCList.create(MST_STD_INSP_INST_R.class);
			MST_STD_INSP_INST_R t = MST_STD_INSP_INST_R.create("T");
			MCQueryApiBuilder instL_bldr = MCQueryApiBuilder.create(t);
			instL_bldr.setSelect(t.insp_no);
			instL_bldr.addSelect(t.std_insp_inst_no);
			instL_bldr.addOrderByAsc(t.insp_no, t.std_insp_inst_no);

			MCList<MST_STD_INSP_INST_R> bindInstL = MCList.create(MST_STD_INSP_INST_R.class);
			MST_STD_INSP_INST_R bindInstR = null;
			for (String inspNo : _inspNoSet) {
				bindInstR = MST_STD_INSP_INST_R.create();
				bindInstR.insp_no(inspNo);
				bindInstL.add(bindInstR);
			}
			dbSelectColumn("MSBFL5060_MST_STD_INSP_INST_S01",
					instL, instL_bldr, bindInstL, MST_STD_INSP_INST_R.$insp_no);

			// 規格検査実績を取得する。
			MCList<MST_STD_INSP_ACT_R> actL = MCList.create(MST_STD_INSP_ACT_R.class);
			MST_STD_INSP_ACT_R t1 = MST_STD_INSP_ACT_R.create("T");
			MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t1);
			actL_bldr.addOrderByAsc(t1.insp_no, t1.std_insp_inst_no);

			MCList<MST_STD_INSP_ACT_R> bindActL = MCList.create(MST_STD_INSP_ACT_R.class);
			MST_STD_INSP_ACT_R bindActR = null;
			for (String inspNo : _inspNoSet) {
				bindActR = MST_STD_INSP_ACT_R.create();
				bindActR.insp_no(inspNo);
				bindActL.add(bindActR);
			}
			dbSelectColumn("MSBFL5060_MST_STD_INSP_ACT_S01",
					actL, actL_bldr, bindActL, MST_STD_INSP_ACT_R.$insp_no);

			// 規格検査指図の補完を行う。
			MCIndexKey idxkeyUp2  = up2().createIndex(StdInspActIF_Upd01_DtlR.$insp_no);
			MCIndexKey idxkeyAct  = actL.createIndex(MST_STD_INSP_ACT_R.$insp_no);
			MCIndexKey idxkeyInst = instL.createIndex(MST_STD_INSP_INST_R.$insp_no);
			MCList<StdInspActIF_Upd01_DtlR> up2SubL = null;
			MCList<MST_STD_INSP_ACT_R> actSubL = null;
			MCList<MST_STD_INSP_INST_R> instSubL = null;
			MCList<StdInspActIF_Upd01_DtlR> up2RstL = MCList.create(StdInspActIF_Upd01_DtlR.class);
			for (String inspNo: _inspNoSet) {
				// 検査ＮＯ単位で処理
				up2SubL  = up2().subList(idxkeyUp2,  inspNo);
				actSubL  = actL.subList(idxkeyAct,   inspNo);
				instSubL = instL.subList(idxkeyInst, inspNo);
				// 補完処理
				compDtlVal(up2SubL, actSubL, instSubL);
				up2RstL.addAll(up2SubL);
			}

			// 補完処理結果を上り電文に設定する。
			up2().setAll(up2RstL);
		}

		protected void compDtlVal(MCList<StdInspActIF_Upd01_DtlR> up2SubL, MCList<MST_STD_INSP_ACT_R> actSubL, MCList<MST_STD_INSP_INST_R> instSubL) {
			if (isNull(up2SubL))  up2SubL  = MCList.create(StdInspActIF_Upd01_DtlR.class);
			if (isNull(actSubL))  actSubL  = MCList.create(MST_STD_INSP_ACT_R.class);
			if (isNull(instSubL)) instSubL = MCList.create(MST_STD_INSP_INST_R.class);

			// 項目補完：　規格検査実績の新規や更新時
			MST_STD_INSP_ACT_R actR = null;
			MCIndexKey idxkeyAct  = actSubL.createIndex(MST_STD_INSP_ACT_R.$std_insp_act_no);
			for (StdInspActIF_Upd01_DtlR dtlR : up2SubL) {
				if (isNull(dtlR.peg_no())) {
					dtlR.peg_no(_pnMap.get(dtlR.insp_no()));
				}

				// 新規行の場合、上り電文の値をそのままとする。
				if (dtlR.isStatusCreate() || isNull(dtlR.std_insp_act_no())) {
					dtlR.setStatus(Status.CREATE);
					dtlR.std_insp_act_no(null);
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
					continue;
				} 

				actR = actSubL.getFirst(idxkeyAct, dtlR.std_insp_act_no());
				if (isNull(actR)) {
					continue;
				}

				// 更新行の場合、項目補完を行う。
				dtlR.setStatus(Status.MODIFY);
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				compVal(dtlR.qn_insp_val_upd_flg(), dtlR.qn_insp_val(), actR.qn_insp_val(), dtlR.qn_insp_val());
				compVal(dtlR.ql_insp_val_upd_flg(), dtlR.ql_insp_val(), actR.ql_insp_val(), dtlR.ql_insp_val());
				compVal(dtlR.st_tm_upd_flg(), dtlR.st_tm(), actR.st_tm(), dtlR.st_tm());
				compVal(dtlR.end_tm_upd_flg(), dtlR.end_tm(), actR.end_tm(), dtlR.end_tm());
				compVal(dtlR.dpt_cd_upd_flg(), dtlR.dpt_cd(), actR.dpt_cd(), dtlR.dpt_cd());
				compVal(dtlR.usr_cd_upd_flg(), dtlR.usr_cd(), actR.usr_cd(), dtlR.usr_cd());
				compVal(dtlR.std_insp_rslt_typ_upd_flg(), dtlR.std_insp_rslt_typ(), actR.std_insp_rslt_typ(), dtlR.std_insp_rslt_typ());
				compVal(dtlR.act_intr_rmrks_upd_flg(), dtlR.act_intr_rmrks(), actR.act_intr_rmrks(), dtlR.act_intr_rmrks());
				compVal(dtlR.sub_char1_upd_flg(), dtlR.sub_char1(), actR.sub_char1(), dtlR.sub_char1());
				compVal(dtlR.sub_char2_upd_flg(), dtlR.sub_char2(), actR.sub_char2(), dtlR.sub_char2());
				compVal(dtlR.sub_char3_upd_flg(), dtlR.sub_char3(), actR.sub_char3(), dtlR.sub_char3());
			}

			// レコード補完：　未入力の規格検査指図も空の実績を作成する。
			Set<String> stdInspInstNoSet = new HashSet<String>();
			stdInspInstNoSet.addAll(up2SubL.getString(StdInspActIF_Upd01_DtlR.$std_insp_inst_no));
			for (MST_STD_INSP_INST_R instR : instSubL) {
				if (stdInspInstNoSet.contains(instR.std_insp_inst_no())) {
					continue;
				}

				StdInspActIF_Upd01_DtlR dtlR = StdInspActIF_Upd01_DtlR.create();
				dtlR.insp_no(instR.insp_no());
				dtlR.std_insp_inst_no(instR.std_insp_inst_no());
				dtlR.setStatus(Status.CREATE);
				dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				dtlR.peg_no(_pnMap.get(dtlR.insp_no()));
				up2SubL.add(dtlR);
			}
		}

		protected void callUpdChk() {
			// 業務チェックを行う。
			MSBFL_StdInspActService.StdInspAct_Chk01 ope = MSBFL_StdInspActService.crtStdInspAct_Chk01();
			addAll(ope.up0(), up1(), createMap_StdInspAct_Chk01_HdrR_StdInspActIF_Upd01_HdrR());
			addAll(ope.up1(), up2(), createMap_StdInspAct_Chk01_DtlR_StdInspActIF_Upd01_DtlR());
			ope.exec();

			// チェックエラーが発生しなかった紐付けＮＯを洗い出す。（明細も含む）
			MCNumber minErrPegNo = null;
			Set<MCNumber> pegNoErrSet = new HashSet<MCNumber>();
			pegNoErrSet.addAll(ope.down0().subList(StdInspAct_Chk01_HdrR.$err_flg, true).getNumberNE(StdInspAct_Chk01_HdrR.$peg_no));
			MCIndexKey idxkey = ope.down0().createIndex(StdInspAct_Chk01_HdrR.$insp_no);
			for (StdInspAct_Chk01_DtlR dtlR : ope.down1()) {
				if (!dtlR.err_flg()) {
					continue;
				}

				StdInspAct_Chk01_HdrR hdrR = ope.down0().getFirst(idxkey, dtlR.insp_no());
				if (!isNull(hdrR) && !isNull(hdrR.peg_no())) {
					pegNoErrSet.add(hdrR.peg_no());
				}
			}
			for ( MCNumber v : pegNoErrSet) {
				if (minErrPegNo == null || minErrPegNo.gt(v)) {
					minErrPegNo = v;
				}
			}
			for (StdInspAct_Chk01_HdrR hdrR : ope.down0()) {
				if (pegNoErrSet.contains(hdrR.peg_no())) {
					continue;
				}
				if (MAC_IF_UPD_TYP.isSTOP_ERROR(up0().if_upd_typ())) {
					if (minErrPegNo != null && minErrPegNo.lte(hdrR.peg_no())) {
						continue;
					}
				}
				
				_pegNoOKSet.add(hdrR.peg_no());
			}
		}

		protected void execUpd() {
			if (_pegNoOKSet.isEmpty()) {
				return;
			}

			MSBFL_StdInspActService.StdInspAct_Upd01 ope = MSBFL_StdInspActService.crtStdInspAct_Upd01();

			// すべて登録の場合
			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())) {
				addAll(ope.up0(), up1(), createMap_StdInspAct_Chk01_HdrR_StdInspActIF_Upd01_HdrR());
				addAll(ope.up1(), up2(), createMap_StdInspAct_Chk01_DtlR_StdInspActIF_Upd01_DtlR());
			// チェックエラーが発生しなかったデータのみ、登録の場合
			} else {
				MCList<StdInspActIF_Upd01_HdrR> updHdrL = MCList.create(StdInspActIF_Upd01_HdrR.class);
				MCList<StdInspActIF_Upd01_DtlR> updDtlL = MCList.create(StdInspActIF_Upd01_DtlR.class);
				Set<String> inspNoOKSet = new HashSet<String>();
				for (StdInspActIF_Upd01_HdrR hdrR : up1()) {
					if (_pegNoOKSet.contains(hdrR.peg_no())) {
						updHdrL.add(hdrR);
						inspNoOKSet.add(hdrR.insp_no());
					}
				}
				for (StdInspActIF_Upd01_DtlR dtlR : up2()) {
					if (inspNoOKSet.contains(dtlR.insp_no())) {
						updDtlL.add(dtlR);
					}
				}
				addAll(ope.up0(), updHdrL, createMap_StdInspAct_Chk01_HdrR_StdInspActIF_Upd01_HdrR());
				addAll(ope.up1(), updDtlL, createMap_StdInspAct_Chk01_DtlR_StdInspActIF_Upd01_DtlR());
			}

			ope.exec();
		}

		/**
		 * 更新ＦＬＧに従い、上り電文の値、または、更新前の値を更新結果に決めます。
		 * @param updFlg 更新ＦＬＧ
		 * @param upVal 上り電文の値
		 * @param dbVal 更新前の値
		 * @param defVal デフォルト値
		 * @return 更新後の値
		 */
		private String compVal(boolean updFlg, String upVal, String dbVal, String defVal) {
			if (updFlg){
				return nvl(upVal, defVal);
			}

			return dbVal;
		}

		/**
		 * 更新ＦＬＧに従い、上り電文の値、または、更新前の値を更新結果に決めます。
		 * @param updFlg 更新ＦＬＧ
		 * @param upVal 上り電文の値
		 * @param dbVal 更新前の値
		 * @param defVal デフォルト値
		 * @return 更新後の値
		 */
		private MCNumber compVal(boolean updFlg, MCNumber upVal, MCNumber dbVal, MCNumber defVal) {
			if (updFlg){
				return nvl(upVal, defVal);
			}

			return dbVal;
		}

		/**
		 * 更新ＦＬＧに従い、上り電文の値、または、更新前の値を更新結果に決めます。
		 * @param updFlg 更新ＦＬＧ
		 * @param upVal 上り電文の値
		 * @param dbVal 更新前の値
		 * @param defVal デフォルト値
		 * @return 更新後の値
		 */
		private MCDate compVal(boolean updFlg, MCDate upVal, MCDate dbVal, MCDate defVal) {
			if (updFlg){
				return nvl(upVal, defVal);
			}

			return dbVal;
		}
	}

	/**
	 * StdInspActIF_Del01オペレーション.<p>
	 *
	 * 規格検査の実績を取り消す。<br>
	 */
	public class StdInspActIF_Del01 extends MSBFL_StdInspActRcptIFService_MC_A.StdInspActIF_Del01 {
		/** チェックＯＫ紐付けＮＯセット */
		private Set<MCNumber> _pegNoOKSet = new HashSet<MCNumber>();

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 取消前処理 
			preProc(up0(), up1());
			throwCanErr();

			// 紐付けＮＯの設定
			setPegNo();

			// 業務チェック
			callDelChk();

			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())) {
				throwCanErr();
			}

			// 取消処理
			execDel();

			throwCanErr();
		}

		/**
		 * 紐付けＮＯの設定処理
		 */
		protected void setPegNo() {
			MCNumber pegNo = new MCNumber(up1().size());
			for ( StdInspActIF_Upd01_HdrR row : up1()) {
				if (isNull(row.peg_no())) {
					pegNo = pegNo.add(MCNumber.ONE);
					row.peg_no(pegNo);
				}
			}
		}

		/**
		 * 業務チェック処理を実行する
		 */
		protected void callDelChk() {
			// 業務チェックを行う。
			MSBFL_StdInspActService.StdInspAct_Chk03 ope = MSBFL_StdInspActService.crtStdInspAct_Chk03();
			addAll(ope.up0(), up1(), createMap_StdInspAct_Chk03_HdrR_StdInspActIF_Upd01_HdrR());
			ope.exec();

			// チェックエラーが発生しなかった紐付けＮＯを洗い出す。
			MCNumber minErrPegNo = null;
			Set<MCNumber> pegNoErrSet = new HashSet<MCNumber>();
			pegNoErrSet.addAll(ope.down0().subList(StdInspAct_Chk01_HdrR.$err_flg, true).getNumberNE(StdInspAct_Chk01_HdrR.$peg_no));
			for ( MCNumber v : pegNoErrSet) {
				if (minErrPegNo == null || minErrPegNo.gt(v)) {
					minErrPegNo = v;
				}
			}
			for (StdInspAct_Chk03_HdrR hdrR : ope.down0()) {
				if (pegNoErrSet.contains(hdrR.peg_no())) {
					continue;
				}
				if (MAC_IF_UPD_TYP.isSTOP_ERROR(up0().if_upd_typ())) {
					if (minErrPegNo != null && minErrPegNo.lte(hdrR.peg_no())) {
						continue;
					}
				}
				
				_pegNoOKSet.add(hdrR.peg_no());
			}
		}

		/**
		 * 取消処理を実施する。
		 */
		protected void execDel() {
			if (_pegNoOKSet.isEmpty()) {
				return;
			}

			MSBFL_StdInspActService.StdInspAct_Del01 ope = MSBFL_StdInspActService.crtStdInspAct_Del01();
			if (MAC_IF_UPD_TYP.isALL_ERROR(up0().if_upd_typ())) {
				addAll(ope.up0(), up1(), createMap_StdInspAct_Chk03_HdrR_StdInspActIF_Upd01_HdrR());
			} else {
				MCList<StdInspActIF_Upd01_HdrR> delHdrL = MCList.create(StdInspActIF_Upd01_HdrR.class);
				for (StdInspActIF_Upd01_HdrR hdrR : up1()) {
					if (_pegNoOKSet.contains(hdrR.peg_no())) {
						delHdrL.add(hdrR);
					}
				}
				addAll(ope.up0(), delHdrL, createMap_StdInspAct_Chk03_HdrR_StdInspActIF_Upd01_HdrR());
			}

			ope.exec();
		}
	}

	/**
	 * 前処理<br>&nbsp;&nbsp;
	 *  ＝＞必須チェック、重複チェック
	 */
	protected void preProc(StdInspActIF_Upd01_CtrlR upCtrl, MCList<StdInspActIF_Upd01_HdrR> upHdrL) {
		// 必須チェック
		updCntrChkFlg = upCtrl.upd_cntr_chk_flg();
		MCMessagePool.addAll(checkReq(upCtrl, upHdrL));
	}

	/**
	 * 上り電文に対する必須チェックを行う。
	 * @return チェック結果メッセージ
	 */
	protected MCMessageList checkReq(StdInspActIF_Upd01_CtrlR upCtrl, MCList<StdInspActIF_Upd01_HdrR> upHdrL) {
		MCMessageList msgL = new MCMessageList();

		// 制御ブロック（電文）の必須チェック
		msgL.addAll(check(upCtrl, StdInspActIF_Upd01_CtrlR.$if_upd_typ, new FXUCL_RequiredValidater()));

		// 検査指図ブロック（電文）の必須チェック
		msgL.addAll(check(upHdrL, StdInspActIF_Upd01_HdrR.$insp_no, new FXUCL_RequiredValidater()));
		if (upCtrl.upd_cntr_chk_flg()) {
			msgL.addAll(check(upHdrL, StdInspActIF_Upd01_HdrR.$inst_upd_cntr, new FXUCL_RequiredValidater()));
		}

		return msgL;
	}

	/**
	 * 検査ＮＯの重複チェック
	 * @return チェック結果メッセージ
	 */
	protected MCMessageList checkDup(MCList<StdInspActIF_Upd01_HdrR> upHdrL) {
		MCMessageList msgL = new MCMessageList();

		Set<String> inspNoSet = new HashSet<String>();
		for (StdInspActIF_Upd01_HdrR row : upHdrL) {
			if (inspNoSet.contains(row.insp_no())) {
				msgL.add(new MCMessage(MSBFL0062, row, row.insp_no()));
				continue;
			}

			inspNoSet.add(row.insp_no());
		}

		return msgL;
	}

	/**
	 * ロック処理、更新カウンタチェック
	 * @return チェック結果メッセージ
	 */
	protected MCMessageList lockAndUpdCntcheck(StdInspActIF_Upd01_CtrlR upCtrl, MCList<StdInspActIF_Upd01_HdrR> upHdrL) {
		MCMessageList msgL = new MCMessageList();

		// ロック処理
		MCList<MST_INSP_INST_R> selectL = MCList.create(MST_INSP_INST_R.class);
		MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(MST_INSP_INST_R.create("T"));
		dbSelectKeyForUpdateNoWait("MSBFL5060_MST_INSP_INST_S02", selectL, selectL_bldr, upHdrL);

		// 更新カウンタチェック
		if (upCtrl.upd_cntr_chk_flg()) {
			MCIndexKey idxkey = selectL.createIndex(MST_INSP_INST_R.$insp_no);
			for (StdInspActIF_Upd01_HdrR row : upHdrL) {
				MST_INSP_INST_R selectR = selectL.getFirst(idxkey, row.insp_no());
				msgL.addAll(checkUpdCntrNE(row, StdInspActIF_Upd01_HdrR.$inst_upd_cntr, selectR));
			}
		}

		return msgL;
	}

	// --- MCRowMapper ---
	protected Map_StdInspAct_Chk01_HdrR_StdInspActIF_Upd01_HdrR<StdInspAct_Chk01_HdrR,StdInspActIF_Upd01_HdrR> createMap_StdInspAct_Chk01_HdrR_StdInspActIF_Upd01_HdrR() {
		return new Map_StdInspAct_Chk01_HdrR_StdInspActIF_Upd01_HdrR<StdInspAct_Chk01_HdrR, StdInspActIF_Upd01_HdrR>();
	}

	public class Map_StdInspAct_Chk01_HdrR_StdInspActIF_Upd01_HdrR<D extends StdInspAct_Chk01_HdrR, S extends StdInspActIF_Upd01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StdInspAct_Chk01_HdrR.$peg_no, StdInspActIF_Upd01_HdrR.$peg_no);
			addColumnPathMap(StdInspAct_Chk01_HdrR.$insp_no, StdInspActIF_Upd01_HdrR.$insp_no);
			addColumnPathMap(StdInspAct_Chk01_HdrR.$inst_upd_cntr, StdInspActIF_Upd01_HdrR.$inst_upd_cntr);
			addColumnPathMap(StdInspAct_Chk01_HdrR.$act_cont_fctr, StdInspActIF_Upd01_HdrR.$act_cont_fctr);
			addColumnPathMap(StdInspAct_Chk01_HdrR.$cont_fctr_flg, StdInspActIF_Upd01_HdrR.$act_cont_fctr_upd_flg);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.upd_cntr_chk_flg(updCntrChkFlg);
		}
	}

	protected Map_StdInspAct_Chk03_HdrR_StdInspActIF_Upd01_HdrR<StdInspAct_Chk03_HdrR,StdInspActIF_Upd01_HdrR> createMap_StdInspAct_Chk03_HdrR_StdInspActIF_Upd01_HdrR() {
		return new Map_StdInspAct_Chk03_HdrR_StdInspActIF_Upd01_HdrR<StdInspAct_Chk03_HdrR, StdInspActIF_Upd01_HdrR>();
	}

	public class Map_StdInspAct_Chk03_HdrR_StdInspActIF_Upd01_HdrR<D extends StdInspAct_Chk03_HdrR, S extends StdInspActIF_Upd01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StdInspAct_Chk03_HdrR.$peg_no, StdInspActIF_Upd01_HdrR.$peg_no);
			addColumnPathMap(StdInspAct_Chk03_HdrR.$insp_no, StdInspActIF_Upd01_HdrR.$insp_no);
			addColumnPathMap(StdInspAct_Chk03_HdrR.$inst_upd_cntr, StdInspActIF_Upd01_HdrR.$inst_upd_cntr);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.upd_cntr_chk_flg(updCntrChkFlg);
		}
	}

	protected Map_StdInspAct_Chk01_DtlR_StdInspActIF_Upd01_DtlR<StdInspAct_Chk01_DtlR,StdInspActIF_Upd01_DtlR> createMap_StdInspAct_Chk01_DtlR_StdInspActIF_Upd01_DtlR() {
		return new Map_StdInspAct_Chk01_DtlR_StdInspActIF_Upd01_DtlR<StdInspAct_Chk01_DtlR, StdInspActIF_Upd01_DtlR>();
	}

	public class Map_StdInspAct_Chk01_DtlR_StdInspActIF_Upd01_DtlR<D extends StdInspAct_Chk01_DtlR, S extends StdInspActIF_Upd01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StdInspAct_Chk01_DtlR.$peg_no, StdInspActIF_Upd01_DtlR.$peg_no);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$std_insp_act_no, StdInspActIF_Upd01_DtlR.$std_insp_act_no);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$std_insp_inst_no, StdInspActIF_Upd01_DtlR.$std_insp_inst_no);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$insp_no, StdInspActIF_Upd01_DtlR.$insp_no);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$qn_insp_val, StdInspActIF_Upd01_DtlR.$qn_insp_val);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$ql_insp_val, StdInspActIF_Upd01_DtlR.$ql_insp_val);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$usr_cd, StdInspActIF_Upd01_DtlR.$usr_cd);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$dpt_cd, StdInspActIF_Upd01_DtlR.$dpt_cd);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$std_insp_rslt_typ, StdInspActIF_Upd01_DtlR.$std_insp_rslt_typ);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$act_intr_rmrks, StdInspActIF_Upd01_DtlR.$act_intr_rmrks);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$sub_char1, StdInspActIF_Upd01_DtlR.$sub_char1);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$sub_char2, StdInspActIF_Upd01_DtlR.$sub_char2);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$sub_char3, StdInspActIF_Upd01_DtlR.$sub_char3);
			// 検査開始日時～検査終了日時
			addColumnPathMap(StdInspAct_Chk01_DtlR.$st_tm, StdInspActIF_Upd01_DtlR.$st_tm);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$end_tm, StdInspActIF_Upd01_DtlR.$end_tm);
		}
	}

	//FMCB CUSTOM END
}