package mcframe.serverMSBE.MSBEL2520;

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
import mcframe.serverMS.dbc.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL5550.*; // このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBE.MSBEL2520.*; // このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL2520.Query.*;
import mcframe.serverMSBE.MSBEL6500.*;
import static mcframe.commonMAUA.MAUAC0010.MAUAC_List.*;
import mcframe.serverFSUA.FSUAL0010.FSUAL_List;
import mcframe.serverFXUC.FXUCL0170.FXUCL_BeforeTodayValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_ExistValidater;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;

import java.util.function.Predicate;
import java.util.Map;
import mcframe.commonMAUA.MAUAC0010.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_StkXfrActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_StkXfrActReg_MC extends MSBEL_StkXfrActReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 在庫振替実績を検索する<br>
	 */
	public class Srch01 extends MSBEL_StkXfrActReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			// 検索 (在庫振替実績ヘッダ)
			int cnt = srchHdr();
			if (cnt == 0) {
				return;
			}

			// 検索 (在庫振替実績明細)
			srchDtl();
		}

		/**
		 * 在庫振替実績ヘッダを検索する。
		 * @return 検索件数
		 */
		protected int srchHdr() {
			int cnt1 = executeQuery(down0(), MSBEL2520_MST_STK_XFR_ACT_S01(), up0());
			return cnt1;
		}

		/**
		 * 在庫振替実績明細を検索する。
		 */
		protected void srchDtl() {
			up0().io_typ(MSC_IO_TYP.GI.value());
			int cnt1 = executeQuery(down1(), MSBEL2520_MST_STK_XFR_ACT_D_S01(), up0());
			if (cnt1 == 0) {
				throw new MCAppException(up0(), null, MSBEL0061, up0().stk_xfr_act_no());
			}
			up0().io_typ(MSC_IO_TYP.GR.value());
			int cnt2 = executeQuery(down2(), MSBEL2520_MST_STK_XFR_ACT_D_S01(), up0());
			if (cnt2 == 0) {
				throw new MCAppException(up0(), null, MSBEL0062, up0().stk_xfr_act_no());
			}
			//　有効成分の計算
			calcContFctrQty(down1());
			calcContFctrQty(down2());
		}

		/**
		 * 有効成分を計算する。
		 * @param list　計算対象のリスト
		 */
		protected void calcContFctrQty(MCList<Srch01_DtlGiR> list) {
			for (Srch01_DtlGiR row : list) {
				// 標準有効成分
				row.std_cont_fctr_qty(
						convToContFctrUnit(row.base_unit_qty(), row.std_cont_fctr(),
								row.cont_fctr_dec_place(), row.cont_fctr_rnd_typ()));
				// 実際有効成分
				row.act_cont_fctr_qty(
						convToContFctrUnit(row.base_unit_qty(), row.act_cont_fctr(),
								row.cont_fctr_dec_place(), row.cont_fctr_rnd_typ()));
			}
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 在庫振替実績を登録する前に、チェックを実行する<br>
	 */
	public class Chk01 extends MSBEL_StkXfrActReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				// MSBE6500のチェック処理呼出
				callStkXfrActChk01();
			}
			setDown();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			msgList.addAll(chkHdr(up0()));
			msgList.addAll(chkDtl(MSC_IO_TYP.GI, up0(), up1()));
			msgList.addAll(chkDtl(MSC_IO_TYP.GR, up0(), up2()));

			return msgList;
		}

		@Override
		protected MCMessageList updCntChkReq() {
			// 新規登録時にはチェックしない
			return null;
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			// 棚ライン
			ListLogicBind strLnBind1 = getListLogicBind(up1(), Chk01_DtlGiR.$str_ln_cd);
			strLnBind1.putBind(StrLnCols.$i_loc_cd, up0(), Chk01_HdrR.$loc_cd);
			strLnBind1.putBind(StrLnCols.$i_mode_nullval_flg, true);
			ListLogicBind strLnBind2 = getListLogicBind(up2(), Chk01_DtlGiR.$str_ln_cd);
			strLnBind2.putBind(StrLnCols.$i_loc_cd, up0(), Chk01_HdrR.$loc_cd);
			strLnBind2.putBind(StrLnCols.$i_mode_nullval_flg, true);

			//  在庫取引先
			ListLogicBind stkBpBind1 = getListLogicBind(up1(), Chk01_DtlGiR.$stk_bp_cd);
			stkBpBind1.putBind(BpCols.$i_mode_nullval_flg, true);
			ListLogicBind stkBpBind2 = getListLogicBind(up2(), Chk01_DtlGiR.$stk_bp_cd);
			stkBpBind2.putBind(BpCols.$i_mode_nullval_flg, true);
		}

		@Override
		protected void customListLogicCnd(String column, MCNumber paramIndex,
				MCConstRow data, Map<String, Comparable<?>> cnd) {
			super.customListLogicCnd(column, paramIndex, data, cnd);

			customListLogicCndSub(column, paramIndex, data, cnd, up0());
		}

		/**
		 * 在庫振替実績登録サービスのChk01を実行する。
		 */
		protected void callStkXfrActChk01() {
			MSBEL_StkXfrActRegService.StkXfrAct_Chk01 ope = makeStkXfrActChk01();
			ope.exec();
			mapStkXfrActChk01Down(ope);
		}

		/**
		 * 在庫振替実績サービスの「StkXfrAct_Chk01」インスタンスを生成する。 <p>
		 * @return StkXfrAct_Chk01インスタンス
		 */
		protected MSBEL_StkXfrActRegService.StkXfrAct_Chk01 makeStkXfrActChk01() {
			MSBEL_StkXfrActRegService.StkXfrAct_Chk01 sxa = MSBEL_StkXfrActRegService
					.crtStkXfrAct_Chk01();
			// hdr
			StkXfrAct_Chk01_HdrR hdrR = sxa.createStkXfrAct_Chk01_HdrR();
			copy(hdrR, up0(), createMap_StkXfrAct_Chk01_HdrR_Chk01_HdrR());
			sxa.up0().add(hdrR);

			// dtlUp
			for (Chk01_DtlGiR up1 : up1()) {
				StkXfrAct_Chk01_DtlGiR dtlGiR = sxa.createStkXfrAct_Chk01_DtlGiR();
				copy(dtlGiR, up1, createMap_StkXfrAct_Chk01_DtlGiR_Chk01_DtlGiR());
				sxa.up1().add(dtlGiR);
			}

			// dtlDown
			for (Chk01_DtlGiR up2 : up2()) {
				StkXfrAct_Chk01_DtlGiR dtlGrR = sxa.createStkXfrAct_Chk01_DtlGiR();
				copy(dtlGrR, up2, createMap_StkXfrAct_Chk01_DtlGiR_Chk01_DtlGiR());
				sxa.up2().add(dtlGrR);
			}
			return sxa;
		}

		/**
		 * 在庫振替実績サービスの「StkXfrAct_Chk01」結果をマッピングする。 <p>
		 * @param ope StkXfrAct_Chk01インスタンス
		 */
		protected void mapStkXfrActChk01Down(
				MSBEL_StkXfrActRegService.StkXfrAct_Chk01 ope) {
			// hdr
			copyErrFlg(up0(), ope.down0().get(0));

			// dtlUp
			String[] destCols = new String[] {
					Chk01_DtlGiR.$sundry_itm_flg, Chk01_DtlGiR.$itm_nm,
					Chk01_DtlGiR.$pack_unit_qty, Chk01_DtlGiR.$pack_unit_cd,
					Chk01_DtlGiR.$io_upd_flg
			};
			String[] srcCols = new String[] {
					StkXfrAct_Chk01_DtlGiR.$sundry_itm_flg,
					StkXfrAct_Chk01_DtlGiR.$itm_nm, StkXfrAct_Chk01_DtlGiR.$pack_unit_qty,
					StkXfrAct_Chk01_DtlGiR.$pack_unit_cd,
					StkXfrAct_Chk01_DtlGiR.$io_upd_flg
			};
			copyByPegNo(up1(), destCols, ope.down1(), srcCols);
			copyErrFlg(up1(), ope.down1());

			// dtlUp
			copyByPegNo(up2(), destCols, ope.down2(), srcCols);
			copyErrFlg(up2(), ope.down2());
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 在庫振替実績を訂正する前に、チェックを実行する<br>
	 */
	public class Chk02 extends MSBEL_StkXfrActReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				// MSBE6500のチェック処理呼出
				callStkXfrActChk02();
			}
			setDown();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			//　更新カウンタチェック
			msgList.addAll(chkUpdCntr(up0()));

			msgList.addAll(chkHdr(up0()));
			msgList.addAll(chkDtl(MSC_IO_TYP.GI, up0(), up1()));
			msgList.addAll(chkDtl(MSC_IO_TYP.GR, up0(), up2()));

			return msgList;
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			// 棚ライン
			ListLogicBind strLnBind1 = getListLogicBind(up1(),
					StkXfrAct_Chk01_DtlGiR.$str_ln_cd);
			strLnBind1.putBind(StrLnCols.$i_loc_cd, up0(), Chk01_HdrR.$loc_cd);
			strLnBind1.putBind(StrLnCols.$i_mode_nullval_flg, true);
			ListLogicBind strLnBind2 = getListLogicBind(up2(),
					StkXfrAct_Chk01_DtlGiR.$str_ln_cd);
			strLnBind2.putBind(StrLnCols.$i_loc_cd, up0(), Chk01_HdrR.$loc_cd);
			strLnBind2.putBind(StrLnCols.$i_mode_nullval_flg, true);

			//  在庫取引先
			ListLogicBind stkBpBind1 = getListLogicBind(up1(), Chk01_DtlGiR.$stk_bp_cd);
			stkBpBind1.putBind(BpCols.$i_mode_nullval_flg, true);
			ListLogicBind stkBpBind2 = getListLogicBind(up2(), Chk01_DtlGiR.$stk_bp_cd);
			stkBpBind2.putBind(BpCols.$i_mode_nullval_flg, true);
		}

		@Override
		protected void customListLogicCnd(String column, MCNumber paramIndex,
				MCConstRow data, Map<String, Comparable<?>> cnd) {
			super.customListLogicCnd(column, paramIndex, data, cnd);

			customListLogicCndSub(column, paramIndex, data, cnd, up0());
		}

		/**
		 * 在庫振替実績登録サービスのChk02を実行する
		 */
		protected void callStkXfrActChk02() {
			MSBEL_StkXfrActRegService.StkXfrAct_Chk02 ope = makeStkXfrActChk02();
			ope.exec();
			mapStkXfrActChk02Down(ope);
		}

		/**
		 * 在庫振替実績サービスの「StkXfrAct_Chk02」インスタンスを生成する。<p> 
		 * @return　StkXfrAct_Chk02インスタンス
		 */
		protected MSBEL_StkXfrActRegService.StkXfrAct_Chk02 makeStkXfrActChk02() {
			MSBEL_StkXfrActRegService.StkXfrAct_Chk02 sxa = MSBEL_StkXfrActRegService
					.crtStkXfrAct_Chk02();
			// hdr
			StkXfrAct_Chk01_HdrR hdrR = sxa.createStkXfrAct_Chk02_HdrR();
			copy(hdrR, up0(), createMap_StkXfrAct_Chk01_HdrR_Chk01_HdrR());
			sxa.up0().add(hdrR);

			// dtlUp
			for (Chk01_DtlGiR up1 : up1()) {
				StkXfrAct_Chk01_DtlGiR dtlGiR = sxa.createStkXfrAct_Chk02_DtlGiR();
				copy(dtlGiR, up1, createMap_StkXfrAct_Chk01_DtlGiR_Chk01_DtlGiR());
				sxa.up1().add(dtlGiR);
			}

			// dtlDown
			for (Chk01_DtlGiR down1 : up2()) {
				StkXfrAct_Chk01_DtlGiR dtlGrR = sxa.createStkXfrAct_Chk02_DtlGiR();
				copy(dtlGrR, down1, createMap_StkXfrAct_Chk01_DtlGiR_Chk01_DtlGiR());
				sxa.up2().add(dtlGrR);
			}
			return sxa;
		}

		/**
		 * 在庫振替実績サービスの「StkXfrAct_Chk02」結果をマッピングする。<p>
		 * @param ope StkXfrAct_Chk02インスタンス
		 */
		protected void mapStkXfrActChk02Down(
				MSBEL_StkXfrActRegService.StkXfrAct_Chk02 ope) {
			// hdr
			copyErrFlg(up0(), ope.down0().get(0));
			up0().dlv_slip_no(ope.down0().get(0).dlv_slip_no());

			// dtlUp
			String[] destCols = new String[] {
					Chk01_DtlGiR.$sundry_itm_flg, Chk01_DtlGiR.$itm_nm,
					Chk01_DtlGiR.$pack_unit_qty, Chk01_DtlGiR.$pack_unit_cd,
					Chk01_DtlGiR.$io_upd_flg, Chk01_DtlGiR.$dlv_slip_no
			};
			String[] srcCols = new String[] {
					StkXfrAct_Chk01_DtlGiR.$sundry_itm_flg,
					StkXfrAct_Chk01_DtlGiR.$itm_nm, StkXfrAct_Chk01_DtlGiR.$pack_unit_qty,
					StkXfrAct_Chk01_DtlGiR.$pack_unit_cd,
					StkXfrAct_Chk01_DtlGiR.$io_upd_flg, StkXfrAct_Chk01_DtlGiR.$dlv_slip_no
			};
			copyByPegNo(up1(), destCols, ope.down1(), srcCols);
			copyErrFlg(up1(), ope.down1());

			// dtlUp
			copyByPegNo(up2(), destCols, ope.down2(), srcCols);
			copyErrFlg(up2(), ope.down2());
		}
	}

	/**
	 * Chk03オペレーション.<p>
	 *
	 * 在庫振替実績を取り消しする前に、チェックを実行する<br>
	 */
	public class Chk03 extends MSBEL_StkXfrActReg_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
				// MSBE6500のチェック処理呼出
				callStkXfrActChk03();
			}
			setDown();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			MCRow.copyall(down0(), up0());
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgList = super.doServerCheckSub();

			//　更新カウンタチェック
			msgList.addAll(chkUpdCntr(up0()));

			msgList.addAll(chkHdr(up0()));
			return msgList;
		}

		/**
		 * 在庫振替実績登録サービスのChk03を実行する
		 */
		protected void callStkXfrActChk03() {
			MSBEL_StkXfrActRegService.StkXfrAct_Chk03 ope = makeStkXfrActChk03();
			ope.exec();
			mapStkXfrActChk03Down(ope);
		}

		/**
		 * 在庫振替実績サービスの「StkXfrAct_Chk03」インスタンスを生成する。<p>
		 * @return StkXfrAct_Chk03インスタンス
		 */
		protected MSBEL_StkXfrActRegService.StkXfrAct_Chk03 makeStkXfrActChk03() {
			MSBEL_StkXfrActRegService.StkXfrAct_Chk03 sxa = MSBEL_StkXfrActRegService
					.crtStkXfrAct_Chk03();
			// hdr
			StkXfrAct_Chk01_HdrR hdrR = sxa.createStkXfrAct_Chk03_HdrR();
			copy(hdrR, up0(), createMap_StkXfrAct_Chk01_HdrR_Chk03_HdrR());
			sxa.up0().add(hdrR);

			return sxa;
		}

		/**
		 * 在庫振替実績サービスの「StkXfrAct_Chk03」結果をマッピングする。<p>
		 * @param ope StkXfrAct_Chk03インスタンス
		 */
		protected void mapStkXfrActChk03Down(
				MSBEL_StkXfrActRegService.StkXfrAct_Chk03 ope) {
			// hdr
			copyErrFlg(up0(), ope.down0().get(0));
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 在庫振替実績を登録する<br>
	 */
	public class Ins01 extends MSBEL_StkXfrActReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 上り電文編集
			editUp();

			// チェック処理
			callStkXfrActRegChk01();
			throwUpdErr();

			// 在庫振替実績登録サービス呼び出し
			callStkXfrActIns01();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			// peg_no設定
			setPegNo(Chk01_HdrR.$peg_no, up0());
			setPegNo(Chk01_DtlGiR.$peg_no, up1());
			setPegNo(Chk01_DtlGiR.$peg_no, up2());

			//ヘッダ明細紐付けＮＯ設定
			int hdrDtlNo = 0;
			up0().hdr_dtl_peg_no(hdrDtlNo);
			up1().setNumber(Chk01_DtlGiR.$hdr_dtl_peg_no, hdrDtlNo);
			up2().setNumber(Chk01_DtlGiR.$hdr_dtl_peg_no, hdrDtlNo);

			//ロット発番
			setLotNo(up0(), up2());

			up0().data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());

			up1().setValue(Chk01_DtlGiR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
			up2().setValue(Chk01_DtlGiR.$data_crud_typ, MAC_DATA_CRUD_TYP.CRT.value());
		}

		/**
		 * チェック処理を実行する。
		 */
		protected void callStkXfrActRegChk01() {
			mapUpContainers(CALL_OPE01);
			chk01.call();
			MCRow.copyall(up0(), chk01.down0());
			up1().setAll(chk01.down1());
			up2().setAll(chk01.down2());
		}

		/**
		 * 在庫振替実績登録サービスのInt01を実行する。
		 */
		protected void callStkXfrActIns01() {
			MSBEL_StkXfrActRegService.StkXfrAct_Ins01 sxa = makeStkXfrActIns01(up0(),
					up1(), up2());
			sxa.exec();
			mapStkXfrActIns01Down(sxa);
		}

		/**
		 * 在庫振替実績サービスの「StkXfrAct_Ins01」インスタンスを生成する。<p>
		 * 　@return StkXfrAct_Ins01インスタンス
		 */
		protected MSBEL_StkXfrActRegService.StkXfrAct_Ins01 makeStkXfrActIns01(
				Chk01_HdrR up0, MCList<Chk01_DtlGiR> giL, MCList<Chk01_DtlGiR> grL) {
			MSBEL_StkXfrActRegService.StkXfrAct_Ins01 sxa = MSBEL_StkXfrActRegService
					.crtStkXfrAct_Ins01();
			// hdr
			StkXfrAct_Chk01_HdrR hdrR = sxa.createStkXfrAct_Ins01_HdrR();
			copy(hdrR, up0, createMap_StkXfrAct_Chk01_HdrR_Chk01_HdrR());
			sxa.up0().add(hdrR);

			// dtlGi
			for (Chk01_DtlGiR gi : giL) {
				StkXfrAct_Chk01_DtlGiR dtlUpR = sxa.createStkXfrAct_Ins01_DtlGiR();
				copy(dtlUpR, gi, createMap_StkXfrAct_Chk01_DtlGiR_Chk01_DtlGiR());
				sxa.up1().add(dtlUpR);
			}

			// dtlGr
			for (Chk01_DtlGiR gr : grL) {
				StkXfrAct_Chk01_DtlGiR dtlDownR = sxa.createStkXfrAct_Ins01_DtlGiR();
				copy(dtlDownR, gr, createMap_StkXfrAct_Chk01_DtlGiR_Chk01_DtlGiR());
				sxa.up2().add(dtlDownR);
			}
			return sxa;
		}

		/**
		 * 在庫振替実績サービスの「StkXfrAct_Ins01」結果をマッピングする。<p>
		 * 
		 * @param sxa　StkXfrAct_Ins01インスタンス
		 */
		protected void mapStkXfrActIns01Down(
				MSBEL_StkXfrActRegService.StkXfrAct_Ins01 sxa) {
			// hdr
			copy(down0(), sxa.down0().get(0),
					createMap_Chk01_HdrR_StkXfrAct_Chk01_HdrR());

			// dtlUp
			for (StkXfrAct_Chk01_DtlGiR down1 : sxa.down1()) {
				Chk01_DtlGiR dtlGiR = down1().createRow();
				copy(dtlGiR, down1, createMap_Chk01_DtlGiR_StkXfrAct_Chk01_DtlGiR());
				down1().add(dtlGiR);
			}
			// dtlDown
			for (StkXfrAct_Chk01_DtlGiR down2 : sxa.down2()) {
				Chk01_DtlGiR dtlGrR = down2().createRow();
				copy(dtlGrR, down2, createMap_Chk01_DtlGiR_StkXfrAct_Chk01_DtlGiR());
				down2().add(dtlGrR);
			}
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 在庫振替実績を訂正する<br>
	 */
	public class Upd01 extends MSBEL_StkXfrActReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 上り電文編集
			editUp();

			// チェック処理
			callStkXfrActRegChk02();
			throwUpdErr();

			// 在庫振替実績登録サービス呼び出し
			callStkXfrActUpd01();
		}

		/**
		 * 上り電文の編集する。
		 */
		protected void editUp() {
			// peg_no設定
			setPegNo(Chk01_HdrR.$peg_no, up0());
			setPegNo(Chk01_DtlGiR.$peg_no, up1());
			setPegNo(Chk01_DtlGiR.$peg_no, up2());

			//ヘッダ明細紐付けＮＯ設定
			int hdrDtlNo = 0;
			up0().hdr_dtl_peg_no(hdrDtlNo);
			up1().setNumber(Chk01_DtlGiR.$hdr_dtl_peg_no, hdrDtlNo);
			up2().setNumber(Chk01_DtlGiR.$hdr_dtl_peg_no, hdrDtlNo);

			//ロット発番
			setLotNo(up0(), up2());

			// データ更新区分
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());

			for (Chk01_DtlGiR dtlR : up1()) {
				// 新規行
				if (dtlR.isStatusCreate()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				// 取消行
				else if (dtlR.isStatusDelete()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				// 訂正行
				else {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}

			for (Chk01_DtlGiR dtlR : up2()) {
				// 新規行
				if (dtlR.isStatusCreate()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
				}
				// 取消行
				else if (dtlR.isStatusDelete()) {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
				}
				// 訂正行
				else {
					dtlR.data_crud_typ(MAC_DATA_CRUD_TYP.UPD.value());
				}
			}
		}

		/**
		 * チェック処理を実行する。
		 */
		protected void callStkXfrActRegChk02() {
			mapUpContainers(CALL_OPE02);
			chk02.call();
			MCRow.copyall(up0(), chk02.down0());
			up1().setAll(chk02.down1());
			up2().setAll(chk02.down2());
		}

		/**
		 * 在庫振替実績登録サービスのUpd01を実行する。
		 */
		protected void callStkXfrActUpd01() {
			MSBEL_StkXfrActRegService.StkXfrAct_Upd01 sxa = makeStkXfrActUpd01();
			sxa.exec();
			mapStkXfrActUpd01Down(sxa);
		}

		/**
		 * 在庫振替実績サービスの「StkXfrAct_Upd01」インスタンスを生成する。<p>
		 * @return StkXfrAct_Upd01インスタンス
		 */
		protected MSBEL_StkXfrActRegService.StkXfrAct_Upd01 makeStkXfrActUpd01() {
			MSBEL_StkXfrActRegService.StkXfrAct_Upd01 sxa = MSBEL_StkXfrActRegService
					.crtStkXfrAct_Upd01();
			// hdr
			StkXfrAct_Chk01_HdrR hdrR = sxa.createStkXfrAct_Upd01_HdrR();
			copy(hdrR, up0(), createMap_StkXfrAct_Chk01_HdrR_Chk01_HdrR());
			sxa.up0().add(hdrR);

			// dtlUp
			for (Chk01_DtlGiR gi : up1()) {
				StkXfrAct_Chk01_DtlGiR dtlUpR = sxa.createStkXfrAct_Upd01_DtlGiR();
				copy(dtlUpR, gi, createMap_StkXfrAct_Chk01_DtlGiR_Chk01_DtlGiR());
				sxa.up1().add(dtlUpR);
			}

			// dtlDown
			for (Chk01_DtlGiR gr : up2()) {
				StkXfrAct_Chk01_DtlGiR dtlDownR = sxa.createStkXfrAct_Upd01_DtlGiR();
				copy(dtlDownR, gr, createMap_StkXfrAct_Chk01_DtlGiR_Chk01_DtlGiR());
				sxa.up2().add(dtlDownR);
			}
			return sxa;
		}

		/**
		 * 在庫振替実績サービスの「StkXfrAct_Upd01」結果をマッピングする。<p>
		 * @param sxa StkXfrAct_Upd01インスタンス
		 */
		protected void mapStkXfrActUpd01Down(
				MSBEL_StkXfrActRegService.StkXfrAct_Upd01 sxa) {
			// hdr
			copy(down0(), sxa.down0().get(0),
					createMap_Chk01_HdrR_StkXfrAct_Chk01_HdrR());

			// dtlUp
			for (StkXfrAct_Chk01_DtlGiR down1 : sxa.down1()) {
				Chk01_DtlGiR dtlUpR = down1().createRow();
				copy(dtlUpR, down1, createMap_Chk01_DtlGiR_StkXfrAct_Chk01_DtlGiR());
				down1().add(dtlUpR);
			}
			// dtlDown
			for (StkXfrAct_Chk01_DtlGiR down1 : sxa.down2()) {
				Chk01_DtlGiR dtlDownR = down2().createRow();
				copy(dtlDownR, down1, createMap_Chk01_DtlGiR_StkXfrAct_Chk01_DtlGiR());
				down2().add(dtlDownR);
			}
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 在庫振替実績を取り消す<br>
	 */
	public class Del01 extends MSBEL_StkXfrActReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 上り電文編集
			editUp();

			// チェック処理
			callStkXfrActRegChk03();
			throwCanErr();

			// 在庫振替実績登録サービス呼び出し
			callStkXfrActDel01();
		}

		/**
		 * 上り電文の編集する。
		 */
		protected void editUp() {
			// peg_no設定
			setPegNo(Chk01_HdrR.$peg_no, up0());

			// データ更新区分
			up0().data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
		}

		/**
		 * チェック処理を実行する。
		 */
		protected void callStkXfrActRegChk03() {
			mapUpContainers(CALL_OPE03);
			chk03.call();
			MCRow.copyall(up0(), chk03.down0());
		}

		/**
		 * 在庫振替実績登録サービスのDel01を実行する。
		 */
		protected void callStkXfrActDel01() {
			MSBEL_StkXfrActRegService.StkXfrAct_Del01 sxa = makeStkXfrActDel01();
			sxa.exec();
		}

		/**
		 * 在庫振替実績サービスの「StkXfrAct_Del01」インスタンスを生成する。
		 * @retrun StkXfrAct_Del01インスタンス
		 */
		protected MSBEL_StkXfrActRegService.StkXfrAct_Del01 makeStkXfrActDel01() {
			MSBEL_StkXfrActRegService.StkXfrAct_Del01 sxa = MSBEL_StkXfrActRegService
					.crtStkXfrAct_Del01();
			// hdr
			StkXfrAct_Chk01_HdrR hdrR = sxa.createStkXfrAct_Del01_HdrR();
			copy(hdrR, up0(), createMap_StkXfrAct_Chk01_HdrR_Chk03_HdrR());
			sxa.up0().add(hdrR);

			return sxa;
		}
	}

	// ------------共通処理実装------------
	/**
	 * 明細情報の補完をする。<p>
	 * @param hdr ヘッダ情報
	 * @param dtl 明細情報
	 */
	protected void editDtl(Chk01_HdrR hdr, Chk01_DtlGiR dtl) {
		// 基準単位数量の補完
		dtl.base_unit_qty(convToBaseUnit(dtl.trd_unit_qty(), dtl.trd_unit_conv_base_qty(),
				dtl.trd_unit_conv_qty(), dtl.base_unit_dec_place(),
				dtl.base_unit_conv_rnd_typ()));
		// 棚・ライン
		if (!hdr.str_ln_tgt_flg()) {
			dtl.str_ln_cd(MAC_STR.NULL_VAL.value());
		}
		// 在庫識別区分
		if (MAC_TRD_PTN_TYP.isXFR_ITM(hdr.trd_ptn_typ())) {
			dtl.stk_id_typ(MSC_STK_ID_TYP.COSTK.value());
		}
		// 在庫取引先CD
		if (MSC_STK_ID_TYP.isCOSTK(dtl.stk_id_typ())) {
			dtl.stk_bp_cd(MAC_STR.NULL_VAL.value());
		}
		//手配ＮＯ１
		if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(dtl.sno1_mng_typ())
				|| MAC_SNO_MNG_TYP.isNOT_MNG(dtl.sno1_mng_typ())) {
			dtl.sno1(MAC_STR.NULL_VAL.value());
		}
		//手配ＮＯ２
		if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(dtl.sno2_mng_typ())
				|| MAC_SNO_MNG_TYP.isNOT_MNG(dtl.sno2_mng_typ())) {
			dtl.sno2(MAC_STR.NULL_VAL.value());
		}
		//手配ＮＯ３
		if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(dtl.sno3_mng_typ())
				|| MAC_SNO_MNG_TYP.isNOT_MNG(dtl.sno3_mng_typ())) {
			dtl.sno3(MAC_STR.NULL_VAL.value());
		}
		//手配ＮＯ４
		if (MAC_SNO_MNG_TYP.isMNG_NOT_STK(dtl.sno4_mng_typ())
				|| MAC_SNO_MNG_TYP.isNOT_MNG(dtl.sno4_mng_typ())) {
			dtl.sno4(MAC_STR.NULL_VAL.value());
		}
		//ロットＮＯ
		if (MAC_LOT_MNG_TYP.isNOT_MNG(dtl.lot_mng_typ())) {
			dtl.lot_no(MAC_STR.NULL_VAL.value());
		}
		//サブロットＮＯ
		if (MAC_SUBLOT_MNG_TYP.isNOT_MNG(dtl.sublot_mng_typ())) {
			dtl.sublot_no(MAC_STR.NULL_VAL.value());
		}
		//確定ＮＯ
		if (MSC_FIX_NO_TYP.isNON(dtl.fix_no_typ())) {
			dtl.fix_no(MAC_STR.NULL_VAL.value());
		}
	}

	/**
	 * 更新カウンタ処理
	 * @param hdr ヘッダ情報
	 * @return メッセージリスト
	 */
	protected MCMessageList chkUpdCntr(Chk01_HdrR hdr) {
		MCMessageList msgL = new MCMessageList();

		MST_STK_XFR_ACT_R dbc = MST_STK_XFR_ACT_R.create();
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_STK_XFR_ACT_R.create("T"));
		dbSelectKeyForUpdateNoWait("MSBEL2520_MST_STK_XFR_ACT_S01", dbc, dbc_bldr, hdr);
		hdr.old_loc_cd(dbc.loc_cd());
		msgL.addAll(checkUpdCntrNE(hdr, Chk01_HdrR.$upd_cntr, dbc));
		return msgL;
	}

	/**
	 * 更新カウンタ処理
	 * @param hdr ヘッダ情報
	 * @return メッセージリスト
	 */
	protected MCMessageList chkUpdCntr(Chk03_HdrR hdr) {
		MCMessageList msgL = new MCMessageList();

		MST_STK_XFR_ACT_R dbc = MST_STK_XFR_ACT_R.create();
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MST_STK_XFR_ACT_R.create("T"));
		dbSelectKeyForUpdateNoWait("MSBEL2520_MST_STK_XFR_ACT_S02", dbc, dbc_bldr, hdr);
		msgL.addAll(checkUpdCntrNE(hdr, Chk01_HdrR.$upd_cntr, dbc));

		// DAC制御用項目として「場所CD」を補完
		hdr.loc_cd(dbc.loc_cd());

		return msgL;
	}

	/**
	 * リストロジック用の検索区分・条件を設定する。
	 */
	protected void customListLogicCndSub(String column, MCNumber paramIndex,
			MCConstRow data, Map<String, Comparable<?>> cnd, Chk01_HdrR hdrR) {
		if (!isSame(paramIndex, MCNumber.ZERO)) {
			if (isSame(column, Chk01_DtlGiR.$stk_bp_cd)) {
				cnd.put(MAUAC_List.BpCols.$i_bp_is_srch_typ,
						getStkBpIsSrchTyp(data.getStringNE(Chk01_DtlGiR.$stk_id_typ)));
			}
			else if (isSame(column, Chk01_DtlGiR.$stk_arrv_bp_cd)) {
				cnd.put(MAUAC_List.BpCols.$i_bp_is_srch_typ,
						getStkArrvBpIsSrchTyp(hdrR.sppl_cd()));
			}
		}
	}

	/**
	 * 取引先入力補助検索区分を取得する。
	 * 
	 * @return 取引先入力補助検索区分
	 */
	protected String getStkBpIsSrchTyp(String stkIdTyp) {
		if (stkIdTyp == null) {
			return null;
		}

		if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(stkIdTyp)
				|| MSC_STK_ID_TYP.isCSTSTK(stkIdTyp)) {
			return MAC_BP_IS_SRCH_TYP.CST.value();

		}
		else if (MSC_STK_ID_TYP.isRNT_RCV(stkIdTyp)
				|| MSC_STK_ID_TYP.isPURC_PRE_ACCPT(stkIdTyp)
				|| MSC_STK_ID_TYP.isACCPT_DFCT(stkIdTyp)
				|| MSC_STK_ID_TYP.isNCV_RCV(stkIdTyp)
				|| MSC_STK_ID_TYP.isONR_PROV(stkIdTyp)) {

			return MAC_BP_IS_SRCH_TYP.SPPL.value();

		}
		return MAC_BP_IS_SRCH_TYP.COMM.value();
	}

	/**
	 * 取引先入力補助検索区分を取得する。
	 * 
	 * @return 取引先入力補助検索区分
	 */
	protected String getStkArrvBpIsSrchTyp(String spplCd) {

		// 自社場所
		if (isNull(spplCd)) {
			return MAC_BP_IS_SRCH_TYP.DLV.value();
		}
		// 外注場所
		else {
			return MAC_BP_IS_SRCH_TYP.SPPL.value();
		}
	}

	/**
	 * ロット、サブロットNOを発番する
	 */
	protected void setLotNo(Chk01_HdrR up0, MCList<Chk01_DtlGiR> up2) {
		// 品目振替 or ロット・手配ＮＯ振替
		if (MAC_TRD_PTN_TYP.isXFR_ITM(up0.trd_ptn_typ())
				|| MAC_TRD_PTN_TYP.isXFR_LOT_SNO(up0.trd_ptn_typ())) {
			for (Chk01_DtlGiR dtlGrR : up2) {
				if (dtlGrR.crt_lot_flg()) {
					if (canGenerateLotNo(dtlGrR)) {
						dtlGrR.lot_no(getLotNo(up0, dtlGrR, MAC_NUM_BIZ_TYP.LOT));
					}
				}
				if (dtlGrR.crt_lot_flg() || MAC_SUBLOT_MNG_TYP.isSTK(dtlGrR.sublot_mng_typ())) {
					if (canGenerateSubLotNo(dtlGrR)) {
						dtlGrR.sublot_no(
								getLotNo(up0, dtlGrR, MAC_NUM_BIZ_TYP.SUBLOT));
					}
				}
			}
		}
	}

	protected boolean canGenerateLotNo(Chk01_DtlGiR dtlR) {
		if (isNull(dtlR)) {
			return false;
		}

		if (MAC_LOT_NO_TYP.isAUTO(dtlR.lot_no_typ())) {
			return true;
		}
		else if (MAC_LOT_NO_TYP.isAUTO_MANU(dtlR.lot_no_typ())) {
			return isNull(dtlR.lot_no());
		}

		return false;
	}

	protected boolean canGenerateSubLotNo(Chk01_DtlGiR dtlR) {
		if (isNull(dtlR)) {
			return false;
		}

		if (MAC_SUBLOT_MNG_TYP.isSTK(dtlR.sublot_mng_typ())) {
			if (!MAC_LOT_NO_TYP.isMANUAL(dtlR.sublot_no_typ())) {
				return isNull(dtlR.sublot_no());
			}
		}
		else {
			if (MAC_LOT_NO_TYP.isAUTO(dtlR.sublot_no_typ())) {
				return true;
			}
			else if (MAC_LOT_NO_TYP.isAUTO_MANU(dtlR.sublot_no_typ())) {
				return isNull(dtlR.sublot_no());
			}
		}

		return false;
	}

	protected String getLotNo(Chk01_HdrR up0, Chk01_DtlGiR dtlGrR,
			MAC_NUM_BIZ_TYP numBizTyp) {

		ElmArgsR lotArgs = ElmArgsR.create();
		if (MAC_NUM_BIZ_TYP.isLOT(numBizTyp)) {
			lotArgs.num_ptn_cd(dtlGrR.lot_no_ptn_cd());
		}
		else {
			lotArgs.num_ptn_cd(dtlGrR.sublot_no_ptn_cd());
		}
		lotArgs.itm_cd(dtlGrR.itm_cd());
		lotArgs.itm_sub1(dtlGrR.itm_sub1());
		lotArgs.itm_sub2(dtlGrR.itm_sub2());
		lotArgs.itm_sub3(dtlGrR.itm_sub3());
		lotArgs.loc_cd(up0.loc_cd());
		lotArgs.dpt_cd(up0.act_dpt_cd());
		lotArgs.co_cd(getCo().co_cd());
		lotArgs.bp_cd(null);
		lotArgs.wg_cd(up0.wg_cd());
		lotArgs.site_cd(null);
		lotArgs.trd_cd(up0.trd_cd());
		lotArgs.dt(up0.stk_xfr_act_tm());
		lotArgs.str(null);
		lotArgs.str2(null);
		lotArgs.str3(null);
		lotArgs.num(null);
		lotArgs.bp_lot_no(null);
		lotArgs.sno1(dtlGrR.sno1());
		lotArgs.sno2(dtlGrR.sno2());
		lotArgs.sno3(dtlGrR.sno3());
		lotArgs.sno4(dtlGrR.sno4());
		if (MAC_NUM_BIZ_TYP.isSUBLOT(numBizTyp)) {
			lotArgs.lot_no(dtlGrR.lot_no());
		}

		return getNum(numBizTyp, lotArgs);
	}

	// mapper
	// ■Chk01上り電文ヘッダ : MBSEL2520 → MBSEL6500 
	protected Map_StkXfrAct_Chk01_HdrR_Chk01_HdrR<StkXfrAct_Chk01_HdrR, Chk01_HdrR> createMap_StkXfrAct_Chk01_HdrR_Chk01_HdrR() {
		return new Map_StkXfrAct_Chk01_HdrR_Chk01_HdrR<StkXfrAct_Chk01_HdrR, Chk01_HdrR>();
	}

	public class Map_StkXfrAct_Chk01_HdrR_Chk01_HdrR<D extends StkXfrAct_Chk01_HdrR, S extends Chk01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$peg_no, Chk01_HdrR.$peg_no);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$hdr_dtl_peg_no,
					Chk01_HdrR.$hdr_dtl_peg_no);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$stk_xfr, Chk01_HdrR.$stk_xfr);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$ac_dt, Chk01_HdrR.$ac_dt);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$stk_xfr_act_tm,
					Chk01_HdrR.$stk_xfr_act_tm);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$can_ac_dt, Chk01_HdrR.$can_ac_dt);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$prnt_flg, Chk01_HdrR.$prnt_flg);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$upd_cntr, Chk01_HdrR.$upd_cntr);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$io_upd_flg, Chk01_HdrR.$io_upd_flg);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$dlv_slip_no, Chk01_HdrR.$dlv_slip_no);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$data_crud_typ, Chk01_HdrR.$data_crud_typ);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$sppl_cd, Chk01_HdrR.$sppl_cd);
		}
	}

	// ■Chk01上り電文明細 : MBSEL2520 → MBSEL6500 
	protected Map_StkXfrAct_Chk01_DtlGiR_Chk01_DtlGiR<StkXfrAct_Chk01_DtlGiR, Chk01_DtlGiR> createMap_StkXfrAct_Chk01_DtlGiR_Chk01_DtlGiR() {
		return new Map_StkXfrAct_Chk01_DtlGiR_Chk01_DtlGiR<StkXfrAct_Chk01_DtlGiR, Chk01_DtlGiR>();
	}

	public class Map_StkXfrAct_Chk01_DtlGiR_Chk01_DtlGiR<D extends StkXfrAct_Chk01_DtlGiR, S extends Chk01_DtlGiR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$peg_no, Chk01_DtlGiR.$peg_no);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$hdr_dtl_peg_no,
					Chk01_DtlGiR.$hdr_dtl_peg_no);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$stk_xfr_d, Chk01_DtlGiR.$stk_xfr_d);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$sundry_itm_flg,
					Chk01_DtlGiR.$sundry_itm_flg);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$itm_nm, Chk01_DtlGiR.$itm_nm);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$stk_mng_typ,
					Chk01_DtlGiR.$stk_mng_typ);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$crt_lot_flg,
					Chk01_DtlGiR.$crt_lot_flg);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$io_upd_flg,
					Chk01_DtlGiR.$io_upd_flg);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$dlv_slip_no, Chk01_DtlGiR.$dlv_slip_no);
			addColumnPathMap(StkXfrAct_Chk01_DtlGiR.$data_crud_typ, Chk01_DtlGiR.$data_crud_typ);
		}
	}

	// ■Chk03上り電文ヘッダ : MBSEL2520 → MBSEL6500 
	protected Map_StkXfrAct_Chk01_HdrR_Chk03_HdrR<StkXfrAct_Chk01_HdrR, Chk03_HdrR> createMap_StkXfrAct_Chk01_HdrR_Chk03_HdrR() {
		return new Map_StkXfrAct_Chk01_HdrR_Chk03_HdrR<StkXfrAct_Chk01_HdrR, Chk03_HdrR>();
	}

	public class Map_StkXfrAct_Chk01_HdrR_Chk03_HdrR<D extends StkXfrAct_Chk01_HdrR, S extends Chk03_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$peg_no, Chk03_HdrR.$peg_no);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$stk_xfr_act_no,
					Chk03_HdrR.$stk_xfr_act_no);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$loc_cd, Chk03_HdrR.$loc_cd);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$can_ac_dt, Chk03_HdrR.$can_ac_dt);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$upd_cntr, Chk03_HdrR.$upd_cntr);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$prnt_flg, Chk03_HdrR.$prnt_flg);
			addColumnPathMap(StkXfrAct_Chk01_HdrR.$data_crud_typ, Chk03_HdrR.$data_crud_typ);
		}
	}

	// ■下り電文ヘッダ : MBSEL6500 → MBSEL2520
	protected Map_Chk01_HdrR_StkXfrAct_Chk01_HdrR<Chk01_HdrR, StkXfrAct_Chk01_HdrR> createMap_Chk01_HdrR_StkXfrAct_Chk01_HdrR() {
		return new Map_Chk01_HdrR_StkXfrAct_Chk01_HdrR<Chk01_HdrR, StkXfrAct_Chk01_HdrR>();
	}

	public class Map_Chk01_HdrR_StkXfrAct_Chk01_HdrR<D extends Chk01_HdrR, S extends StkXfrAct_Chk01_HdrR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk01_HdrR.$peg_no, StkXfrAct_Chk01_HdrR.$peg_no);
			addColumnPathMap(Chk01_HdrR.$hdr_dtl_peg_no,
					StkXfrAct_Chk01_HdrR.$hdr_dtl_peg_no);
			addColumnPathMap(Chk01_HdrR.$stk_xfr_act_no,
					StkXfrAct_Chk01_HdrR.$stk_xfr_act_no);
		}
	}

	// ■下り電文明細 : MBSEL6500 → MBSEL2520	
	protected Map_Chk01_DtlGiR_StkXfrAct_Chk01_DtlGiR<Chk01_DtlGiR, StkXfrAct_Chk01_DtlGiR> createMap_Chk01_DtlGiR_StkXfrAct_Chk01_DtlGiR() {
		return new Map_Chk01_DtlGiR_StkXfrAct_Chk01_DtlGiR<Chk01_DtlGiR, StkXfrAct_Chk01_DtlGiR>();
	}

	public class Map_Chk01_DtlGiR_StkXfrAct_Chk01_DtlGiR<D extends Chk01_DtlGiR, S extends StkXfrAct_Chk01_DtlGiR>
			extends MCRowMapper<D, S> {
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Chk01_DtlGiR.$peg_no, StkXfrAct_Chk01_DtlGiR.$peg_no);
			addColumnPathMap(Chk01_DtlGiR.$hdr_dtl_peg_no,
					StkXfrAct_Chk01_DtlGiR.$hdr_dtl_peg_no);
			addColumnPathMap(Chk01_DtlGiR.$stk_xfr_act_no,
					StkXfrAct_Chk01_DtlGiR.$stk_xfr_act_no);
			addColumnPathMap(Chk01_DtlGiR.$stk_xfr_act_d_no,
					StkXfrAct_Chk01_DtlGiR.$stk_xfr_act_d_no);
			addColumnPathMap(Chk01_DtlGiR.$lot_no, StkXfrAct_Chk01_DtlGiR.$lot_no);
			addColumnPathMap(Chk01_DtlGiR.$sublot_no, StkXfrAct_Chk01_DtlGiR.$sublot_no);
		}
	}

	/**
	 * ヘッダ情報に対して、条件に応じて固有チェックを実施する。<p>
	 * @param hdr　ヘッダ情報
	 * @return　メッセージリスト
	 */
	protected MCMessageList chkHdr(Chk01_HdrR hdr) {
		MCMessageList msgList = new MCMessageList();

		msgList.addAll(checkWritableLocCdDac(hdr, StkXfrAct_Chk01_HdrR.$loc_cd));
		if (!isNull(hdr.old_loc_cd()) && !isSame(hdr.old_loc_cd(), hdr.loc_cd())) {
			msgList.addAll(checkWritableLocCdDac(hdr, Chk01_HdrR.$old_loc_cd));
		}

		// 条件付きチェック
		if (!MAC_DATA_CRUD_TYP.isCRT(hdr.data_crud_typ())) {
			// 【必須入力】在庫振替実績ＮＯ
			msgList.addAll(check(hdr, Chk01_HdrR.$stk_xfr_act_no,
					new FXUCL_RequiredValidater()));
			// 【必須入力】取消計上日
			msgList.addAll(
					check(hdr, Chk01_HdrR.$can_ac_dt, new FXUCL_RequiredValidater()));
			// 【必須入力】更新カウンタ
			msgList.addAll(
					check(hdr, Chk01_HdrR.$upd_cntr, new FXUCL_RequiredValidater()));

			// 【日付と運用日付の前後チェック】取消計上日
			msgList.addAll(
					check(hdr, Chk01_HdrR.$can_ac_dt, new FXUCL_BeforeTodayValidater()));
		}

		return msgList;
	}
	protected MCMessageList chkHdr(Chk03_HdrR hdr) {
		MCMessageList msgList = new MCMessageList();

		if (!isNull(hdr.loc_cd())) {
			msgList.addAll(checkWritableLocCdDac(hdr, StkXfrAct_Chk01_HdrR.$loc_cd));
		}

		return msgList;
	}

	/**
	 * 明細情報に対して、条件に応じて固有チェックを実施する。<p>
	 * @param io入出庫区分
	 * @param hdr　ヘッダ情報
	 * @param dtlL　明細情報
	 * @return　メッセージリスト
	 */
	protected MCMessageList chkDtl(MSC_IO_TYP io, Chk01_HdrR hdr,
			MCList<Chk01_DtlGiR> dtlL) {
		MCMessageList msgList = new MCMessageList();

		// 条件付き必須入力チェック
		for (Chk01_DtlGiR dtl : dtlL) {
			if (!MAC_DATA_CRUD_TYP.isCRT(dtl.data_crud_typ())) {
				// 【必須入力】在庫振替実績ＮＯ
				msgList.addAll(check(dtl, Chk01_DtlGiR.$stk_xfr_act_no,
						new FXUCL_RequiredValidater()));
				// 【必須入力】在庫振替実績明細ＮＯ
				msgList.addAll(check(dtl, Chk01_DtlGiR.$stk_xfr_act_d_no,
						new FXUCL_RequiredValidater()));
			}
			if (MSC_IO_TYP.isGR(io) && dtl.sundry_itm_flg()) {
				// 【必須入力】品名
				msgList.addAll(
						check(dtl, Chk01_DtlGiR.$itm_cd, new FXUCL_RequiredValidater()));
			}
			if (!MAC_LOT_MNG_TYP.isNOT_MNG(dtl.lot_mng_typ())) {
				// 【必須入力】ロットNO
				msgList.addAll(
						check(dtl, Chk01_DtlGiR.$lot_no, new FXUCL_RequiredValidater()));
			}
			if (!MAC_SUBLOT_MNG_TYP.isNOT_MNG(dtl.sublot_mng_typ())) {
				// 【必須入力】サブロットNO
				msgList.addAll(check(dtl, Chk01_DtlGiR.$sublot_no,
						new FXUCL_RequiredValidater()));
			}
			if (hdr.str_ln_tgt_flg()) {
				// 【必須入力】棚ライン
				msgList.addAll(check(dtl, Chk01_DtlGiR.$str_ln_cd,
						new FXUCL_RequiredValidater()));
			}
			if (!MSC_FIX_NO_TYP.isNON(dtl.fix_no_typ())) {
				// 【必須入力】確定NO
				msgList.addAll(
						check(dtl, Chk01_DtlGiR.$fix_no, new FXUCL_RequiredValidater()));
			}
			if (!MAC_TRD_PTN_TYP.isXFR_ITM(hdr.trd_ptn_typ())) {
				// 【必須入力】在庫識別区分
				msgList.addAll(check(dtl, Chk01_DtlGiR.$stk_id_typ,
						new FXUCL_RequiredValidater()));
			}

			//　値の補完
			editDtl(hdr, dtl);

			// 小数部有効桁チェック
			msgList.addAll(checkDecPlace(dtlL, Chk01_DtlGiR.$trd_unit_dec_place,
					Chk01_DtlGiR.$trd_unit_qty));
		}

		return msgList;
	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 振替伝票を印刷する<br>
	 */
	public class Prnt01 extends MSBEL_StkXfrActReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			// 出荷帳票発行サービス呼び出し
			callShipRprtPrnt01();
		}

		/**
		 * 出荷帳票発行サービスのPrnt01を実行する。
		 */
		protected void callShipRprtPrnt01() {
			MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 sxa = makelShipRprtPrnt01(up0());
			sxa.exec();
		}
	}

	/**
	 * 出荷帳票発行サービスの「ShipRprt_Prnt01」インスタンスを生成する。<p>
	 */
	protected MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 makelShipRprtPrnt01(
			ShipRprt_Prnt01_HdrR up0) {
		MSBEL_ShipRprtPrntService.ShipRprt_Prnt01 srp = MSBEL_ShipRprtPrntService
				.crtShipRprt_Prnt01();
		// hdr
		up0.trn_typ(MSC_TRN_TYP.STK_XFR.value());
		up0.dlv_slip_prnt_flg(true);
		srp.up0().add(up0);

		return srp;
	}

	//FMCB CUSTOM END
}