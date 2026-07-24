package mcframe.serverMSBF.MSBFL5030;

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
import mcframe.serverMSBF.MSBFL5030.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverFXUC.FXUCL0030.*;
import mcframe.serverFXUC.FXUCL0170.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_StdInspActService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_StdInspActService_MC extends MSBFL_StdInspActService_MC_A{
	//FMCB CUSTOM START

	/**
	 * StdInspAct_Chk01オペレーション.<p>
	 *
	 * 登録・更新前チェックを行う。<br>
	 */
	public class StdInspAct_Chk01 extends MSBFL_StdInspActService_MC_A.StdInspAct_Chk01 {
		// 品目マスタコンテナキャッシュ
		protected FXUCL_MCDbcCache<MAM_ITM_R> _cacheItmL = null;

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			// 下り電文設定
			setDown();
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査指図の更新カウンタチェック
			msgL.addAll(chkInstUpdCnt(up0()));

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<StdInspAct_Chk01_HdrR> notErrL = getChkList(up0());
			if (notErrL.isEmpty()) {
				return msgL;
			}
			
			// 場所の更新権限のチェック
			msgL.addAll(dacChk(notErrL));

			// 有効成分対象ＦＬＧの補完
			compContFctrFlg(notErrL);

			// 有効成分対象ＦＬＧがオンの場合、
			msgL.addAll(check(notErrL.subList(StdInspAct_Chk01_HdrR.$cont_fctr_flg, true), StdInspAct_Chk01_HdrR.$act_cont_fctr, new FXUCL_PositiveValidater()));

			// 検査指図承認チェック
			msgL.addAll(checkMain(notErrL));

			// 規格検査指図ＮＯの存在チェック
			msgL.addAll(checkStdInspInstNo(notErrL));

			// 定量値の桁チェック
			msgL.addAll(checkQnValPlace(notErrL));

			return msgL;
		}

		/**
		 * 検査指図の更新カウンタチェックを行う。
		 * 
		 * @param upL チェック対象
		 */
		protected MCMessageList chkInstUpdCnt(MCList<StdInspAct_Chk01_HdrR> upL) {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_INSP_INST_R> selectL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.insp_no);
			dbSelectKeyForUpdateNoWait("MSBFL5030_MST_INSP_INST_S01", selectL, selectL_bldr, upL);

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_INST_R.$insp_no);

			for (StdInspAct_Chk01_HdrR r : upL) {
				MST_INSP_INST_R selectR = selectL.getFirst(idxkey, r.insp_no());
				if (r.upd_cntr_chk_flg()) {
					msgL.addAll(checkUpdCntrNE(r, StdInspAct_Chk01_HdrR.$inst_upd_cntr,
							selectR));
					setErrFlg(r, msgL);
				}

				if (!isNull(selectR)) {
					r.itm_cd(selectR.itm_cd());
					r.itm_sub1(selectR.itm_sub1());
					r.itm_sub2(selectR.itm_sub2());
					r.itm_sub3(selectR.itm_sub3());
					r.insp_sts_typ(selectR.insp_sts_typ());
					r.std_req_flg(selectR.std_req_flg());
					r.std_cnf_req_flg(selectR.std_cnf_req_flg());
					r.insp_typ(selectR.insp_typ());
					r.mfg_loc_cd(selectR.mfg_loc_cd());
				}
			}

			return msgL;
		}

		/**
		 * 場所の更新権限のチェックをします。
		 * 
		 * @param subUpL チェック対象
		 * @return
		 */
		protected MCMessageList dacChk(MCList<StdInspAct_Chk01_HdrR> subUpL) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_INSP_SCHD_R> schdDbL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdDbL_bldr = MCQueryApiBuilder.create(t);
			schdDbL_bldr.setWhere(t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5030_MST_INSP_SCHD_S01", schdDbL, schdDbL_bldr, subUpL);
			MCIndexKey idxkey = schdDbL.createIndex(MST_INSP_SCHD_R.$insp_no);
			
			for (StdInspAct_Chk01_HdrR r : subUpL) {
				if (MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
					msgL.addAll(
							checkWritableLocCdDac(r, StdInspAct_Chk01_HdrR.$mfg_loc_cd));
				}
				else {
					MCMessageList msgTmpL = new MCMessageList();

					MCList<MST_INSP_SCHD_R> schdL = schdDbL.subList(idxkey, r.insp_no());
					for (MST_INSP_SCHD_R schdR : schdL) {
						schdR.setAttributes(r);
						msgTmpL.addAll(
								checkWritableLocCdDac(schdR, MST_INSP_SCHD_R.$loc_cd));
					}
					if (!schdL.isEmpty() && schdL.size() == msgTmpL.size()) {
						r.err_flg(true);
						msgL.addAll(msgTmpL);
					}
				}
			}

			return msgL;
		}

		/**
		 * 定量値の桁チェック
		 * @return メッセージリスト
		 */
		protected MCMessageList checkQnValPlace(MCList<StdInspAct_Chk01_HdrR> subUpL) {
			MCMessageList msgL = new MCMessageList();
			MCList<StdInspAct_Chk01_DtlR> subL = up1().subList(r -> isChkRow(r, subUpL));
			if (subL.isEmpty()) {
				return msgL;
			}
			MCList<StdInspAct_Chk01_DtlR> chkL = subL.subList(StdInspAct_Chk01_DtlR.$insp_qlqn_typ, MAC_INSP_QLQN_TYP.QNTV.value());
			for (StdInspAct_Chk01_DtlR chkR : chkL){

				// 整数部桁チェック
				msgL.addAll(checkDigitPlace(chkR, StdInspAct_Chk01_DtlR.$qn_int_digit, StdInspAct_Chk01_DtlR.$qn_insp_val));

				// 有効小数部桁チェック
				msgL.addAll(checkDecPlace(chkR, StdInspAct_Chk01_DtlR.$qn_int_frac, StdInspAct_Chk01_DtlR.$qn_insp_val));
			}

			return msgL;
		}

		/**
		 * 有効正数部桁チェック
		 * @param chkL
		 * @param decPlaceCol
		 * @param numCol
		 * @return
		 */
		protected MCMessageList checkDigitPlace(StdInspAct_Chk01_DtlR chkR, String decPlaceCol, String numCol) {
			MCMessageList msgL = new MCMessageList();
			
			MCNumber n = chkR.getNumber(decPlaceCol);
			if (isNull(n)) {
				return msgL;
			}
			MCNumber numVal = chkR.getNumberNE(numCol);
			if (isNull(numVal)) {
				return msgL;
			}

			if (numVal.precision() - numVal.scale() > n.intValue()) {
				msgL.add(new MCMessage(chkR, numCol, MSBFL0066, getLabel(chkR, numCol), numVal, n, toDispGUIIndex(chkR)));
			}
			return msgL;
		}

		/**
		 * 有効成分対象ＦＬＧを補完する。
		 * 
		 * @param subUpL 補完対象
		 */
		protected void compContFctrFlg(MCList<StdInspAct_Chk01_HdrR> subUpL) {
			createItmCache();
			for (StdInspAct_Chk01_HdrR r : subUpL) {
				MAM_ITM_R itmR = _cacheItmL.getEx(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());

				if (!isNull(itmR)) {
					r.cont_fctr_flg(itmR.cont_fctr_flg());
				}
			}
		}

		/**
		 * 品目マスタコンテナキャッシュを初期化する。
		 */
		protected void createItmCache() {
			MAM_ITM_R t = MAM_ITM_R.create("T");
			MCQueryApiBuilder dbcL_bldr = MCQueryApiBuilder.create(t);
			dbcL_bldr.setSelect(t.cont_fctr_flg);
			_cacheItmL = new FXUCL_MCDbcCache<MAM_ITM_R>(dbcL_bldr, up0(), new String[] {
					StdInspAct_Chk01_HdrR.$itm_cd, StdInspAct_Chk01_HdrR.$itm_sub1,
					StdInspAct_Chk01_HdrR.$itm_sub2, StdInspAct_Chk01_HdrR.$itm_sub3
			});
		}

		/**
		 * チェック処理
		 * 
		 * @param subUpL チェック対象
		 */
		protected MCMessageList checkMain(MCList<StdInspAct_Chk01_HdrR> subUpL) {
			MCMessageList msgL = new MCMessageList();

			// 検査指図情報取得
			MCList<MST_INSP_INST_R> selectL = MCList.create(MST_INSP_INST_R.class);
			dbSelectKey("MSBFL5030_MST_INSP_INST_S02", selectL,
					MCQueryApiBuilder.create(MST_INSP_INST_R.create("T")), subUpL);

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_INST_R.$insp_no);

			for (StdInspAct_Chk01_HdrR chkR : subUpL) {
				MST_INSP_INST_R instR = selectL.getFirst(idxkey, chkR.insp_no());
				if (isNull(instR)) {
					continue;
				}

				// 検査承認状況が指図未承認の場合
				if (MSC_INSP_APRV_STS_TYP.isINST_OPN(instR.insp_aprv_sts_typ())) {
					msgL.add(new MCMessage(chkR, null, MSBFL0058, chkR.insp_no(),
							toDispGUIIndex(chkR)));
				}
			}

			return msgL;
		}

		/**
		 * 規格検査指図ＮＯの存在チェックを行う。
		 * @return
		 */
		protected MCMessageList checkStdInspInstNo(MCList<StdInspAct_Chk01_HdrR> subUpL) {
			MCMessageList msgL = new MCMessageList();

			MCList<StdInspAct_Chk01_DtlR> subL = up1().subList(r -> isChkRow(r, subUpL));
			if (subL.isEmpty()) {
				return msgL;
			}

			MCList<MST_STD_INSP_INST_R> selectL = MCList.create(MST_STD_INSP_INST_R.class);
			MST_STD_INSP_INST_R t = MST_STD_INSP_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.addOrderByAsc(t.std_insp_inst_no);
			dbSelectKey("MSBFL5030_MST_STD_INSP_INST_S01", selectL, selectL_bldr,
					subL.groupBy(MST_STD_INSP_INST_R.$std_insp_inst_no));

			MCIndexKey idxkey = selectL.createIndex(MST_STD_INSP_INST_R.$std_insp_inst_no);

			for (StdInspAct_Chk01_DtlR chkR : subL) {
				MST_STD_INSP_INST_R selectR = selectL.getFirst(idxkey,
						chkR.std_insp_inst_no());
				if (isNull(selectR)) {
					msgL.add(new MCMessage(chkR, null, MSBFL0065, chkR.std_insp_inst_no(),
							toDispGUIIndex(chkR)));
					continue;
				}
				chkR.insp_qlqn_typ(selectR.insp_qlqn_typ());
			}
			return msgL;
		}

		protected boolean isChkRow(StdInspAct_Chk01_DtlR r, MCList<StdInspAct_Chk01_HdrR> subUpL) {
			if (!isNull(subUpL.getFirst(StdInspAct_Chk01_HdrR.$insp_no, r.insp_no()))) {
				return true;
			}
			return false;
		}
	}
	/**
	 * StdInspAct_Chk02オペレーション.<p>
	 *
	 * 確認前チェックを行う。<br>
	 */
	public class StdInspAct_Chk02 extends MSBFL_StdInspActService_MC_A.StdInspAct_Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			// 下り電文設定
			setDown();
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査指図の更新カウンタチェック
			msgL.addAll(chkInstUpdCnt(up0()));

			// doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
			crrctDataBeforeDoServerChk();

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<StdInspAct_Chk02_DtlR> notErrL = getChkList(up1());
			
			MCList<StdInspAct_Chk02_DtlR> chkL = notErrL.subList(StdInspAct_Chk02_DtlR.$cnf_flg, true);
			
			// 必須チェック
			msgL.addAll(check(chkL, StdInspAct_Chk02_DtlR.$cnf_dt, new FXUCL_RequiredValidater()));
			msgL.addAll(check(chkL, StdInspAct_Chk02_DtlR.$cnf_usr_cd, new FXUCL_RequiredValidater()));
			msgL.addAll(check(chkL, StdInspAct_Chk02_DtlR.$cnf_dpt_cd, new FXUCL_RequiredValidater()));
			
			// 場所の更新権限のチェック
			msgL.addAll(dacChk(up0()));
			msgL.addAll(checkMain(notErrL));

			return msgL;
		}

		/**
		 * doServerChk（リストロジックによるチェックなど）実行前に行うべきデータの補正
		 */
		protected void crrctDataBeforeDoServerChk() {
			for (StdInspAct_Chk02_DtlR r : up1()) {
				if (!r.cnf_flg()) {
					r.clear(StdInspAct_Chk02_DtlR.$cnf_dt, StdInspAct_Chk02_DtlR.$cnf_usr_cd, StdInspAct_Chk02_DtlR.$cnf_dpt_cd);
				}
			}
		}

		/**
		 * 検査指図の更新カウンタチェックを行う。
		 * 
		 * @param upL チェック対象
		 */
		protected MCMessageList chkInstUpdCnt(MCList<StdInspAct_Chk02_HdrR> upL) {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_INSP_INST_R> selectL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.insp_no);
			dbSelectKeyForUpdateNoWait("MSBFL5030_MST_INSP_INST_S03", selectL, selectL_bldr, upL);

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_INST_R.$insp_no);
			for (StdInspAct_Chk02_HdrR r : upL) {
				MST_INSP_INST_R selectR = selectL.getFirst(idxkey, r.insp_no());
				if (r.upd_cntr_chk_flg()) {
					msgL.addAll(checkUpdCntrNE(r, StdInspAct_Chk02_HdrR.$inst_upd_cntr, selectR));
				}
				if (!isNull(selectR)) {
					r.insp_typ(selectR.insp_typ());
					r.mfg_loc_cd(selectR.mfg_loc_cd());
				}
			}

			return msgL;
		}

		/**
		 * チェック処理
		 * 
		 * @param upL チェック対象
		 */
		protected MCMessageList checkMain(MCList<StdInspAct_Chk02_DtlR> upL) {
			MCMessageList msgL = new MCMessageList();

			// 規格検査実績情報取得
			MCList<MST_STD_INSP_ACT_R> selectL = MCList.create(MST_STD_INSP_ACT_R.class);
			dbSelectKey("MSBFL5030_MST_STD_INSP_ACT_S01", selectL,
					MCQueryApiBuilder.create(MST_STD_INSP_ACT_R.create("T")), upL);

			MCIndexKey indexKey = selectL.createIndex(MST_STD_INSP_ACT_R.$std_insp_act_no);

			for (StdInspAct_Chk02_DtlR chkR : upL) {
				MST_STD_INSP_ACT_R stdR = selectL.getFirst(indexKey,
						chkR.std_insp_act_no());
				if (isNull(stdR) || !stdR.cnf_flg()) {
					continue;
				}

				// 規格検査結果区分が設定されていない場合
				if (isNull(stdR.std_insp_rslt_typ())) {
					msgL.add(new MCMessage(chkR, null, MSBFL0059, chkR.std_insp_act_no(),
							toDispGUIIndex(chkR)));
				}
			}

			return msgL;
		}

		/**
		 * 場所の更新権限のチェックをします。
		 * 
		 * @param subUpL チェック対象
		 * @return
		 */
		protected MCMessageList dacChk(MCList<StdInspAct_Chk02_HdrR> subUpL) {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_INSP_SCHD_R> schdDbL = MCList.create(MST_INSP_SCHD_R.class);
			MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
			MCQueryApiBuilder schdDbL_bldr = MCQueryApiBuilder.create(t);
			schdDbL_bldr.setWhere(t.insp_no.eq(bind("insp_no")));
			dbSelect("MSBFL5030_MST_INSP_SCHD_S02", schdDbL, schdDbL_bldr, subUpL);
			MCIndexKey idxkey = schdDbL.createIndex(MST_INSP_SCHD_R.$insp_no);

			for (StdInspAct_Chk02_HdrR r : subUpL) {
				if (MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
					msgL.addAll(
							checkWritableLocCdDac(r, StdInspAct_Chk02_HdrR.$mfg_loc_cd));
				}
				else {
					MCMessageList msgTmpL = new MCMessageList();

					MCList<MST_INSP_SCHD_R> schdL = schdDbL.subList(idxkey,
							r.insp_no());
					for (MST_INSP_SCHD_R schdR : schdL) {
						schdR.setAttributes(r);
						msgTmpL.addAll(
								checkWritableLocCdDac(schdR, MST_INSP_SCHD_R.$loc_cd));
					}
					if (!schdL.isEmpty() && schdL.size() == msgTmpL.size()) {
						r.err_flg(true);
						msgL.addAll(msgTmpL);
					}
				}
			}

			return msgL;
		}

	}
	/**
	 * StdInspAct_Chk03オペレーション.<p>
	 *
	 * 取消前チェックを行う。<br>
	 */
	public class StdInspAct_Chk03 extends MSBFL_StdInspActService_MC_A.StdInspAct_Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			// 下り電文設定
			setDown();
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up0());
			down1().setAll(up1());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// 検査指図の更新カウンタチェック
			msgL.addAll(chkInstUpdCnt(up0()));

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			MCList<StdInspAct_Chk03_HdrR> notErrL = getChkList(up0());
			// 場所の更新権限のチェック
			msgL.addAll(dacChk(notErrL));
			msgL.addAll(checkMain(notErrL));

			return msgL;
		}

		/**
		 * 検査指図の更新カウンタチェックを行う。
		 * 
		 * @param upL チェック対象
		 */
		protected MCMessageList chkInstUpdCnt(MCList<StdInspAct_Chk03_HdrR> upL) {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_INSP_INST_R> selectL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder selectL_bldr = MCQueryApiBuilder.create(t);
			selectL_bldr.setOrderByAsc(t.insp_no);
			dbSelectKeyForUpdateNoWait("MSBFL5030_MST_INSP_INST_S04", selectL, selectL_bldr, upL);

			MCIndexKey idxkey = selectL.createIndex(MST_INSP_INST_R.$insp_no);
			for (StdInspAct_Chk03_HdrR r : upL) {
				MST_INSP_INST_R selectR = selectL.getFirst(idxkey, r.insp_no());
				if (r.upd_cntr_chk_flg()) {
					msgL.addAll(checkUpdCntrNE(r, StdInspAct_Chk03_HdrR.$inst_upd_cntr,
							selectR));
				}
				if (!isNull(selectR)) {
					r.insp_typ(selectR.insp_typ());
					r.mfg_loc_cd(selectR.mfg_loc_cd());
				}
			}

			return msgL;
		}

		/**
		 * 場所の更新権限のチェックをします。
		 * 
		 * @param upL チェック対象
		 * @return
		 */
		protected MCMessageList dacChk(MCList<StdInspAct_Chk03_HdrR> upL) {
			MCMessageList msgL = new MCMessageList();

			for (StdInspAct_Chk03_HdrR r : upL) {
				if (MSC_INSP_TYP.isPRDCT(r.insp_typ())) {
					msgL.addAll(
							checkWritableLocCdDac(r, StdInspAct_Chk03_HdrR.$mfg_loc_cd));
				}
				else {
					MCMessageList msgTmpL = new MCMessageList();

					MCList<MST_INSP_SCHD_R> schdL = MCList.create(MST_INSP_SCHD_R.class);
					MST_INSP_SCHD_R t = MST_INSP_SCHD_R.create("T");
					MCQueryApiBuilder schdL_bldr = MCQueryApiBuilder.create(t);
					schdL_bldr.setWhere(t.insp_no.eq(bind("insp_no")));
					dbSelect("MSBFL5030_MST_INSP_SCHD_S03", schdL, schdL_bldr, r);
					
					for (MST_INSP_SCHD_R schdR : schdL) {
						schdR.setAttributes(r);
						msgTmpL.addAll(
								checkWritableLocCdDac(schdR, MST_INSP_SCHD_R.$loc_cd));
					}
					if (!schdL.isEmpty() && schdL.size() == msgTmpL.size()) {
						r.err_flg(true);
						msgL.addAll(msgTmpL);
					}
				}
			}

			return msgL;
		}

		/**
		 * チェック処理
		 * 
		 * @param upL チェック対象
		 */
		protected MCMessageList checkMain(MCList<StdInspAct_Chk03_HdrR> upL) {
			MCMessageList msgL = new MCMessageList();

			if (!isNull(up1())) {
				return msgL;
			}

			// 検査指図情報取得
			MCList<MST_INSP_INST_R> selectL = MCList.create(MST_INSP_INST_R.class);
			dbSelectKey("MSBFL5030_MST_INSP_INST_S05", selectL,
					MCQueryApiBuilder.create(MST_INSP_INST_R.create("T")), upL);

			// 規格検査実績情報取得
			MCList<MST_STD_INSP_ACT_R> stdL = MCList.create(MST_STD_INSP_ACT_R.class);
			MCList<MST_STD_INSP_ACT_R> bindL = MCList.create(MST_STD_INSP_ACT_R.class);
			for (StdInspAct_Chk03_HdrR upR : upL) {
				MST_STD_INSP_ACT_R bindR = MST_STD_INSP_ACT_R.create();
				bindR.insp_no(upR.insp_no());
				bindL.add(bindR);
			}
			MST_STD_INSP_ACT_R t2 = MST_STD_INSP_ACT_R.create("T");
			MCQueryApiBuilder stdL_bldr = MCQueryApiBuilder.create(t2);
			stdL_bldr.addConstWhereWithAnd(t2.cnf_flg.eq(value(true)));
			dbSelectColumn("MSBFL5030_MST_STD_INSP_ACT_S02", stdL, stdL_bldr, bindL,
					MST_STD_INSP_ACT_R.$insp_no);

			MCIndexKey indexKey = selectL.createIndex(MST_INSP_INST_R.$insp_no);
			MCIndexKey stdIndexKey = stdL.createIndex(MST_STD_INSP_ACT_R.$insp_no);

			for (StdInspAct_Chk03_HdrR chkR : upL) {
				MST_INSP_INST_R instR = selectL.getFirst(indexKey, chkR.insp_no());
				if (isNull(instR)) {
					continue;
				}

				// 検査状況区分は「完了」 且つ 規格検査必須FLGはオンの場合
				if (MSC_INSP_STS_TYP.isJDG(instR.insp_sts_typ()) && instR.std_req_flg()) {
					msgL.add(new MCMessage(chkR, null, MSBFL0060, chkR.insp_no(),
							toDispGUIIndex(chkR)));
				}

				// 確認済の規格検査実績がある場合
				if (!isNull(stdL.getFirst(stdIndexKey, chkR.insp_no()))) {
					msgL.add(new MCMessage(chkR, null, MSBFL0061, chkR.insp_no(),
							toDispGUIIndex(chkR)));
				}
			}

			return msgL;
		}
	}
	/**
	 * StdInspAct_Upd01オペレーション.<p>
	 *
	 * 規格検査実績を登録・更新する。<br>
	 */
	public class StdInspAct_Upd01 extends MSBFL_StdInspActService_MC_A.StdInspAct_Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			MCList<MST_INSP_INST_R> selectL = MCList.create(MST_INSP_INST_R.class);
			dbSelectKey("MSBFL5030_MST_INSP_INST_S06", selectL,
					MCQueryApiBuilder.create(MST_INSP_INST_R.create("T")), up0());
			MCIndexKey idxkey = selectL.createIndex(MST_INSP_INST_R.$insp_no);
			MCIndexKey dtlIdxkey = up1().createIndex(StdInspAct_Chk01_DtlR.$insp_no);
			for (StdInspAct_Chk01_HdrR upR : up0()) {
				MST_INSP_INST_R dbR = selectL.getFirst(idxkey, upR.insp_no());
				if (isNull(dbR)) {
					continue;
				}

				// 検査指図の更新
				updInspInst(dbR, upR);

				// 規格検査実績の登録・更新
				updStdInspAct(up1().subList(dtlIdxkey, upR.insp_no()), upR);
			}

			// 下り電文設定
			setDown();
		}

		/**
		 * 下り電文の設定
		 */
		protected void setDown() {
			down0().setAll(up1());
		}

		/**
		 * 検査指図を更新する。
		 * 
		 * @param dbR ＤＢの検査指図情報
		 * @param upR 更新対象
		 */
		protected void updInspInst(MST_INSP_INST_R dbR, StdInspAct_Chk01_HdrR upR) {
			copy(dbR, upR, createMap_MST_INSP_INST_R_StdInspAct_Chk01_HdrR());

			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder dbR_bldr = MCQueryApiBuilder.create(t);
			dbR_bldr.setSet(t.insp_rslt_prnt_flg);
			dbR_bldr.addSet(t.insp_rslt_prnt_tm);
			dbR_bldr.addSet(t.seq);
			// 有効成分対象 且つ 検査完了以外の場合、更新可能
			if (upR.cont_fctr_flg() && !MSC_INSP_STS_TYP.isJDG(upR.insp_sts_typ())) {
				dbR_bldr.addSet(t.act_cont_fctr);
			}

			dbUpdateKey("MSBFL5030_MST_INSP_INST_U01", dbR, dbR_bldr);
		}

		/**
		 * 規格検査実績を登録・更新する。
		 * 
		 * @param upL 登録・更新対象リスト
		 * @param upHdrR ヘッダ対象
		 */
		protected void updStdInspAct(MCList<StdInspAct_Chk01_DtlR> upL,
				StdInspAct_Chk01_HdrR upHdrR) {

			MCList<MST_STD_INSP_ACT_R> insL = MCList.create(MST_STD_INSP_ACT_R.class);
			MCList<MST_STD_INSP_ACT_R> updL = MCList.create(MST_STD_INSP_ACT_R.class);

			// 規格検査実績の登録・更新情報を作成
			for (StdInspAct_Chk01_DtlR upR : upL) {
				MST_STD_INSP_ACT_R newR = MST_STD_INSP_ACT_R.create();

				if (isNull(upR.std_insp_act_no())) {

					// 規格検査実績ＮＯの発番
					upR.std_insp_act_no(getStrSeq(MSC_NUM_SYS_TYP.INSPSA));

					copy(newR, upR, createMap_MST_STD_INSP_ACT_R_StdInspAct_Chk01_DtlR());
					insL.add(newR);
				}
				else {
					copy(newR, upR, createMap_MST_STD_INSP_ACT_R_StdInspAct_Chk01_DtlR());
					updL.add(newR);
				}
			}

			if (!insL.isEmpty()) {
				dbInsertEx("MSBFL5030_MST_STD_INSP_ACT_I01", insL,
						MCQueryApiBuilder.create(MST_STD_INSP_ACT_R.create("T")));
			}

			if (!updL.isEmpty()) {
				MST_STD_INSP_ACT_R t = MST_STD_INSP_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				editStdInspActLSetStmt(updL_bldr, t, upHdrR);
				dbUpdateKey("MSBFL5030_MST_STD_INSP_ACT_U01", updL, updL_bldr);
			}
		}

		/**
		 * 検査指図テーブル更新用のdbContainerのset句を編集する。
		 * @param updL 更新用リスト
		 */
		protected void editInspInstLSetStmt(MCQueryApiBuilder updL_bldr, MST_INSP_INST_R t) {
			updL_bldr.setSet(t.act_cont_fctr);
			updL_bldr.addSet(t.seq);
		}

		/**
		 * 規格検査実績テーブル更新用のdbContainerのset句を編集する。
		 * @param updL 更新用リスト
		 */
		protected void editStdInspActLSetStmt(MCQueryApiBuilder updL_bldr,
				MST_STD_INSP_ACT_R t, StdInspAct_Chk01_HdrR upHdrR) {
			updL_bldr.setSet(t.act_intr_rmrks);
			updL_bldr.addSet(t.sub_char1);
			updL_bldr.addSet(t.sub_char2);
			updL_bldr.addSet(t.sub_char3);
			if (!upHdrR.std_cnf_req_flg()) {
				if (!upHdrR.std_req_flg()) {
					updL_bldr.addSet(t.qn_insp_val);
					updL_bldr.addSet(t.ql_insp_val);
					updL_bldr.addSet(t.std_insp_rslt_typ);
				}
				updL_bldr.addSet(t.st_tm);
				updL_bldr.addSet(t.end_tm);
				updL_bldr.addSet(t.usr_cd);
				updL_bldr.addSet(t.dpt_cd);
			}
		}

		protected Map_MST_INSP_INST_R_StdInspAct_Chk01_HdrR<MST_INSP_INST_R,StdInspAct_Chk01_HdrR> createMap_MST_INSP_INST_R_StdInspAct_Chk01_HdrR() {
			return new Map_MST_INSP_INST_R_StdInspAct_Chk01_HdrR<MST_INSP_INST_R, StdInspAct_Chk01_HdrR>();
		}

		public class Map_MST_INSP_INST_R_StdInspAct_Chk01_HdrR<D extends MST_INSP_INST_R, S extends StdInspAct_Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_INSP_INST_R.$insp_no, StdInspAct_Chk01_HdrR.$insp_no);
				addColumnPathMap(MST_INSP_INST_R.$act_cont_fctr, StdInspAct_Chk01_HdrR.$act_cont_fctr);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				if (dest.insp_rslt_prnt_flg()) {
					dest.seq(dest.seq().add(MCNumber.ONE));
				}
				dest.insp_rslt_prnt_flg(false);
				dest.insp_rslt_prnt_tm(null);
			}
		}

		protected Map_MST_STD_INSP_ACT_R_StdInspAct_Chk01_DtlR<MST_STD_INSP_ACT_R,StdInspAct_Chk01_DtlR> createMap_MST_STD_INSP_ACT_R_StdInspAct_Chk01_DtlR() {
			return new Map_MST_STD_INSP_ACT_R_StdInspAct_Chk01_DtlR<MST_STD_INSP_ACT_R, StdInspAct_Chk01_DtlR>();
		}

		public class Map_MST_STD_INSP_ACT_R_StdInspAct_Chk01_DtlR<D extends MST_STD_INSP_ACT_R, S extends StdInspAct_Chk01_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_STD_INSP_ACT_R.$std_insp_act_no, StdInspAct_Chk01_DtlR.$std_insp_act_no);
				addColumnPathMap(MST_STD_INSP_ACT_R.$std_insp_inst_no, StdInspAct_Chk01_DtlR.$std_insp_inst_no);
				addColumnPathMap(MST_STD_INSP_ACT_R.$insp_no, StdInspAct_Chk01_DtlR.$insp_no);
				addColumnPathMap(MST_STD_INSP_ACT_R.$qn_insp_val, StdInspAct_Chk01_DtlR.$qn_insp_val);
				addColumnPathMap(MST_STD_INSP_ACT_R.$ql_insp_val, StdInspAct_Chk01_DtlR.$ql_insp_val);
				addColumnPathMap(MST_STD_INSP_ACT_R.$st_tm, StdInspAct_Chk01_DtlR.$st_tm);
				addColumnPathMap(MST_STD_INSP_ACT_R.$end_tm, StdInspAct_Chk01_DtlR.$end_tm);
				addColumnPathMap(MST_STD_INSP_ACT_R.$dpt_cd, StdInspAct_Chk01_DtlR.$dpt_cd);
				addColumnPathMap(MST_STD_INSP_ACT_R.$usr_cd, StdInspAct_Chk01_DtlR.$usr_cd);
				addColumnPathMap(MST_STD_INSP_ACT_R.$std_insp_rslt_typ, StdInspAct_Chk01_DtlR.$std_insp_rslt_typ);
				addColumnPathMap(MST_STD_INSP_ACT_R.$act_intr_rmrks, StdInspAct_Chk01_DtlR.$act_intr_rmrks);
				addColumnPathMap(MST_STD_INSP_ACT_R.$sub_char1, StdInspAct_Chk01_DtlR.$sub_char1);
				addColumnPathMap(MST_STD_INSP_ACT_R.$sub_char2, StdInspAct_Chk01_DtlR.$sub_char2);
				addColumnPathMap(MST_STD_INSP_ACT_R.$sub_char3, StdInspAct_Chk01_DtlR.$sub_char3);
			}
		}
	}
	/**
	 * StdInspAct_Upd02オペレーション.<p>
	 *
	 * 規格検査実績を確認する。<br>
	 */
	public class StdInspAct_Upd02 extends MSBFL_StdInspActService_MC_A.StdInspAct_Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			for (StdInspAct_Chk02_HdrR upR : up0()) {

				// 検査指図の空更新
				updInspInstTs(upR);

				// 規格検査実績の確認
				updStdInspAct(up1().subList(StdInspAct_Chk02_DtlR.$insp_no, upR.insp_no()));
			}
		}

		/**
		 * 検査指図を空更新する。
		 * 
		 * @param upR 更新対象
		 */
		protected void updInspInstTs(StdInspAct_Chk02_HdrR upR) {
			MST_INSP_INST_R updR = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder updR_bldr = MCQueryApiBuilder.create(updR);
			updR.insp_no(upR.insp_no());
			dbTsUpdateKey("MSBFL5030_MST_INSP_INST_U02", updR, updR_bldr.getBaseDbc());
		}

		/**
		 * 規格検査実績の確認情報を更新する。
		 * 
		 * @param upL チェック対象
		 */
		protected void updStdInspAct(MCList<StdInspAct_Chk02_DtlR> upL) {
			MCList<MST_STD_INSP_ACT_R> updL = MCList.create(MST_STD_INSP_ACT_R.class);

			addAll(updL, upL.subList(StdInspAct_Chk02_DtlR.$cnf_flg, true),
					createMap_MST_STD_INSP_ACT_R_StdInspAct_Chk02_DtlR());

			if (!updL.isEmpty()) {
				MST_STD_INSP_ACT_R t = MST_STD_INSP_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				// 更新項目設定
				editStdInspActLSetStmt(updL_bldr, t);

				dbUpdateKey("MSBFL5030_MST_STD_INSP_ACT_U02", updL, updL_bldr);
			}
		}

		/**
		 * 規格検査実績テーブル更新用のdbContainerのset句を編集する。
		 * @param updL 更新用リスト
		 * @param hdrR ヘッダ対象
		 */
		protected void editStdInspActLSetStmt(MCQueryApiBuilder updL_bldr,
				MST_STD_INSP_ACT_R t) {
			updL_bldr.setSet(t.cnf_intr_rmrks);
			updL_bldr.addSet(t.cnf_flg);
			updL_bldr.addSet(t.cnf_dt);
			updL_bldr.addSet(t.cnf_dpt_cd);
			updL_bldr.addSet(t.cnf_usr_cd);
		}

		protected Map_MST_STD_INSP_ACT_R_StdInspAct_Chk02_DtlR<MST_STD_INSP_ACT_R,StdInspAct_Chk02_DtlR> createMap_MST_STD_INSP_ACT_R_StdInspAct_Chk02_DtlR() {
			return new Map_MST_STD_INSP_ACT_R_StdInspAct_Chk02_DtlR<MST_STD_INSP_ACT_R, StdInspAct_Chk02_DtlR>();
		}

		public class Map_MST_STD_INSP_ACT_R_StdInspAct_Chk02_DtlR<D extends MST_STD_INSP_ACT_R, S extends StdInspAct_Chk02_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_STD_INSP_ACT_R.$std_insp_act_no, StdInspAct_Chk02_DtlR.$std_insp_act_no);
				addColumnPathMap(MST_STD_INSP_ACT_R.$cnf_flg, StdInspAct_Chk02_DtlR.$cnf_flg);
				addColumnPathMap(MST_STD_INSP_ACT_R.$cnf_dt, StdInspAct_Chk02_DtlR.$cnf_dt);
				addColumnPathMap(MST_STD_INSP_ACT_R.$cnf_dpt_cd, StdInspAct_Chk02_DtlR.$cnf_dpt_cd);
				addColumnPathMap(MST_STD_INSP_ACT_R.$cnf_usr_cd, StdInspAct_Chk02_DtlR.$cnf_usr_cd);
				addColumnPathMap(MST_STD_INSP_ACT_R.$cnf_intr_rmrks, StdInspAct_Chk02_DtlR.$cnf_intr_rmrks);
			}
		}
	}
	/**
	 * StdInspAct_Del01オペレーション.<p>
	 *
	 * 規格検査実績　または　確認情報の取消を行う。<br>
	 */
	public class StdInspAct_Del01 extends MSBFL_StdInspActService_MC_A.StdInspAct_Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 規格検査実績（電文）がない場合
			if (up1().isEmpty()) {
				// 規格検査実績の取消
				delStdInspActInfo();
			}
			else {
				// 規格検査実績の確認情報のクリア
				for (StdInspAct_Chk03_HdrR upR : up0()) {

					// 検査指図の空更新
					updInspInstTs(upR);

					// 規格検査実績の確認
					updStdInspAct(up1().subList(StdInspAct_Chk01_DtlR.$insp_no, upR.insp_no()), upR);
				}
			}
		}

		/**
		 * 規格検査実績を取り消す。
		 */
		protected void delStdInspActInfo() {
			// 検査指図の更新
			updInspInst();

			// 規格検査実績の削除
			delStdInspAct();
		}

		/**
		 * 検査指図を空更新する。
		 * 
		 * @param upR 更新対象
		 */
		protected void updInspInstTs(StdInspAct_Chk03_HdrR upR) {
			MST_INSP_INST_R updR = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder updR_bldr = MCQueryApiBuilder.create(updR);
			updR.insp_no(upR.insp_no());
			dbTsUpdateKey("MSBFL5030_MST_INSP_INST_U03", updR, updR_bldr.getBaseDbc());
		}

		/**
		 * 規格検査実績を削除する。
		 */
		protected void delStdInspAct() {
			MST_STD_INSP_ACT_R t = MST_STD_INSP_ACT_R.create("T");
			execDbDelete("MSBFL5030_MST_STD_INSP_ACT_D01", t, t.insp_no.eq(bind("insp_no")), up0());
		}

		/**
		 * 検査指図を更新する。
		 */
		protected void updInspInst() {
			MCList<MST_INSP_INST_R> dbL = MCList.create(MST_INSP_INST_R.class);
			MST_INSP_INST_R t = MST_INSP_INST_R.create("T");
			MCQueryApiBuilder dbL_bldr = MCQueryApiBuilder.create(t);
			dbSelectKey("MSBFL5030_MST_INSP_INST_S07", dbL, dbL_bldr, up0());

			for (MST_INSP_INST_R upR : dbL) {
				// 検査状況区分は検査完了以外の場合、実際有効成分係数をクリアする。
				if (!MSC_INSP_STS_TYP.isJDG(upR.insp_sts_typ())) {
					upR.act_cont_fctr(null);
				}
				if (upR.insp_rslt_prnt_flg()) {
					upR.seq(upR.seq().add(MCNumber.ONE));
				}
				upR.insp_rslt_prnt_flg(false);
				upR.insp_rslt_prnt_tm(null);
			}

			if (!dbL.isEmpty()) {

				// 更新項目設定
				editInspInstLSetStmt(dbL_bldr, t);

				dbUpdateKey("MSBFL5030_MST_INSP_INST_U04", dbL, dbL_bldr);
			}
		}

		/**
		 * 規格検査実績の確認情報をクリアする。
		 * 
		 * @param upL 更新対象リスト
		 * @param hdrR ヘッダ対象
		 */
		protected void updStdInspAct(MCList<StdInspAct_Chk03_DtlR> upL, StdInspAct_Chk03_HdrR hdrR) {
			MCList<MST_STD_INSP_ACT_R> updL = MCList.create(MST_STD_INSP_ACT_R.class);

			addAll(updL, upL.subList(StdInspAct_Chk03_DtlR.$cnf_flg, false),
					createMap_MST_STD_INSP_ACT_R_StdInspAct_Chk03_DtlR());

			if (!updL.isEmpty()) {
				MST_STD_INSP_ACT_R t = MST_STD_INSP_ACT_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				// 更新項目設定
				editStdInspActLSetStmt(updL_bldr, t);

				dbUpdateKey("MSBFL5030_MST_STD_INSP_ACT_U03", updL, updL_bldr);
			}
		}

		/**
		 * 規格検査実績テーブル更新用のdbContainerのset句を編集する。
		 * @param updL 更新用リスト
		 * @param hdrR ヘッダ対象
		 */
		protected void editStdInspActLSetStmt(MCQueryApiBuilder updL_bldr, MST_STD_INSP_ACT_R t) {
			updL_bldr.setSet(t.cnf_intr_rmrks);
			updL_bldr.addSet(t.cnf_flg);
			updL_bldr.addSet(t.cnf_dt);
			updL_bldr.addSet(t.cnf_dpt_cd);
			updL_bldr.addSet(t.cnf_usr_cd);
		}

		/**
		 * 検査指図テーブル更新用のdbContainerのset句を編集する。
		 * @param updL 更新用リスト
		 */
		protected void editInspInstLSetStmt(MCQueryApiBuilder dbL_bldr, MST_INSP_INST_R t) {
			dbL_bldr.setSet(t.act_cont_fctr);
			dbL_bldr.addSet(t.insp_rslt_prnt_flg);
			dbL_bldr.addSet(t.insp_rslt_prnt_tm);
			dbL_bldr.addSet(t.seq);
		}

		protected Map_MST_STD_INSP_ACT_R_StdInspAct_Chk03_DtlR<MST_STD_INSP_ACT_R,StdInspAct_Chk03_DtlR> createMap_MST_STD_INSP_ACT_R_StdInspAct_Chk03_DtlR() {
			return new Map_MST_STD_INSP_ACT_R_StdInspAct_Chk03_DtlR<MST_STD_INSP_ACT_R, StdInspAct_Chk03_DtlR>();
		}

		public class Map_MST_STD_INSP_ACT_R_StdInspAct_Chk03_DtlR<D extends MST_STD_INSP_ACT_R, S extends StdInspAct_Chk03_DtlR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(MST_STD_INSP_ACT_R.$std_insp_act_no, StdInspAct_Chk03_DtlR.$std_insp_act_no);
				addColumnPathMap(MST_STD_INSP_ACT_R.$cnf_flg, StdInspAct_Chk03_DtlR.$cnf_flg);
				addColumnPathMap(MST_STD_INSP_ACT_R.$cnf_intr_rmrks, StdInspAct_Chk03_DtlR.$cnf_intr_rmrks);
			}

			@Override
			protected void valueCopy(D dest, S src) {
				super.valueCopy(dest, src);
				dest.cnf_dt(null);
				dest.cnf_usr_cd(null);
				dest.cnf_dpt_cd(null);
			}
		}
	}

	//FMCB CUSTOM END
}