package mcframe.serverMSBF.MSBFL0050;

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
import mcframe.serverMSBF.MSBFL0050.*;	// このimportはFrameManagerの自動生成で追加されました。
import mcframe.serverMSBF.MSBFL5030.*;
import mcframe.serverMSBF.MSBFL5330.*;
import static mcframe.commonCore.container.MCRow.*;
import static mcframe.serverMSBF.MSBFL0050.Query.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBFL_StdInspActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBFL_StdInspActReg_MC extends MSBFL_StdInspActReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 登録・更新前チェック処理を行う。<br>
	 */
	public class Chk01 extends MSBFL_StdInspActReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				// 規格検査実績サービスの登録・更新前チェック
				callStdInspActServiceChk01();
			}

			// 下り電文設定
			setDown();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			copyall(down0(), up0());
		}

		/**
		 * 規格検査実績サービスの登録・更新前チェックを行う。
		 */
		protected void callStdInspActServiceChk01() {
			MSBFL_StdInspActService.StdInspAct_Chk01 ope = MSBFL_StdInspActService.crtStdInspAct_Chk01();
			StdInspAct_Chk01_HdrR chkR = StdInspAct_Chk01_HdrR.create();

			copy(chkR, up0(), createMap_StdInspAct_Chk01_HdrR_Chk01_HdrR());
			ope.up0().add(chkR);
			addAll(ope.up1(), up1(), createMap_StdInspAct_Chk01_DtlR_Chk01_DtlR());

			ope.exec();

			up0().cont_fctr_flg(ope.down0().get(0).cont_fctr_flg());
			copyErrFlg(up0(), ope.down0().get(0));
			copyErrFlg(up1(), ope.down1());
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 規格検査実績確認前チェックを行う。<br>
	 */
	public class Chk02 extends MSBFL_StdInspActReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				// 規格検査実績サービスの確認前チェック
				callStdInspActServiceChk02();
			}

			// 下り電文設定
			setDown();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());
		}

		/**
		 * 規格検査実績サービスの確認前チェックを行う。
		 */
		protected void callStdInspActServiceChk02() {
			MSBFL_StdInspActService.StdInspAct_Chk02 ope = MSBFL_StdInspActService.crtStdInspAct_Chk02();
			StdInspAct_Chk02_HdrR chkR = StdInspAct_Chk02_HdrR.create();

			copy(chkR, up0(), createMap_StdInspAct_Chk02_HdrR_Chk02_HdrR());
			ope.up0().add(chkR);

			addAll(ope.up1(), up1(), createMap_StdInspAct_Chk02_DtlR_Chk02_DtlR());

			ope.exec();

			copyErrFlg(up0(), ope.down0().get(0));
			copyErrFlg(up1(), ope.down1());
		}
	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 規格検査実績の取消前チェックを行う。<br>
	 */
	public class Chk03 extends MSBFL_StdInspActReg_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				// 規格検査実績サービスの取消前チェック
				callStdInspActServiceChk03();
			}

			// 下り電文設定
			setDown();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			copyall(down0(), up0());
		}

		/**
		 * 規格検査実績サービスの取消前チェックを行う。
		 */
		protected void callStdInspActServiceChk03() {
			MSBFL_StdInspActService.StdInspAct_Chk03 ope = MSBFL_StdInspActService.crtStdInspAct_Chk03();
			StdInspAct_Chk03_HdrR chkR = StdInspAct_Chk03_HdrR.create();

			copy(chkR, up0(), createMap_StdInspAct_Chk03_HdrR_Chk03_HdrR());
			ope.up0().add(chkR);

			ope.exec();

			copyErrFlg(up0(), ope.down0().get(0));
		}
	}
	/**
	 * Chk04オペレーション.<p>
	 *
	 * 規格検査実績の確認取消前チェックを行う。<br>
	 */
	public class Chk04 extends MSBFL_StdInspActReg_MC_A.Chk04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
				// 規格検査実績サービスの取消前チェック
				callStdInspActServiceChk03();
			}

			// 下り電文設定
			setDown();
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down1().setAll(up1());
		}

		/**
		 * 規格検査実績サービスの取消前チェックを行う。
		 */
		protected void callStdInspActServiceChk03() {
			MSBFL_StdInspActService.StdInspAct_Chk03 ope = MSBFL_StdInspActService.crtStdInspAct_Chk03();
			StdInspAct_Chk03_HdrR chkR = StdInspAct_Chk03_HdrR.create();

			copy(chkR, up0(), createMap_StdInspAct_Chk03_HdrR_Chk04_HdrR());
			ope.up0().add(chkR);
			addAll(ope.up1(), up1(), createMap_StdInspAct_Chk03_DtlR_Chk04_DtlR());

			ope.exec();

			copyErrFlg(up0(), ope.down0().get(0));
			copyErrFlg(up1(), ope.down1());
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 規格検査実績を登録・更新する。<br>
	 */
	public class Upd01 extends MSBFL_StdInspActReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// 前チェック処理
			callThisChk01();

			throwUpdErr();

			// 規格検査実績の登録・更新
			callStdInspActServiceUpd01();

			// 即時発行（電文）はオンの場合、検査成績書の発行
			if (up0().prnt_flg()) {
				callInspRptServicePrnt02(up0());
			}

			// 下り電文設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_HdrR.$peg_no, up0());
			setPegNo(Chk01_DtlR.$peg_no, up1());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBFL_StdInspActReg.Chk01 ope = MSBFL_StdInspActReg.crtChk01();
			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			copyall(up0(), ope.down0());
		}

		/**
		 * 規格検査実績を登録・更新する。
		 */
		protected void callStdInspActServiceUpd01() {
			MSBFL_StdInspActService.StdInspAct_Upd01 upd01 = MSBFL_StdInspActService.crtStdInspAct_Upd01();

			StdInspAct_Chk01_HdrR updHdrR = StdInspAct_Chk01_HdrR.create();
			copy(updHdrR, up0(), createMap_StdInspAct_Chk01_HdrR_Chk01_HdrR());
			upd01.up0().add(updHdrR);
			addAll(upd01.up1(), up1(), createMap_StdInspAct_Chk01_DtlR_Chk01_DtlR());

			upd01.exec();

			String[] destCols = new String[] {Chk01_DtlR.$std_insp_act_no};
			String[] srcCols = new String[] {StdInspAct_Chk01_DtlR.$std_insp_act_no};
			copyByPegNo(up1(), destCols, upd01.down0(), srcCols);
		}

		/**
		 * 検査成績書を発行する。
		 * 
		 * @param ヘッダ情報（電文）
		 */
		protected void callInspRptServicePrnt02(Chk01_HdrR hdrR) {
			MSBFL_InspRptService.InspRpt_Prnt02 prnt = MSBFL_InspRptService.crtInspRpt_Prnt02();

			InspRpt_Prnt02_DtlR prntDtlR = InspRpt_Prnt02_DtlR.create();
			copy(prntDtlR, hdrR, createMap_InspRpt_Prnt02_DtlR_Chk01_HdrR());
			prnt.up0().add(prntDtlR);

			prnt.exec();

			hdrR.insp_rslt_prnt_flg(prnt.down0().get(0).insp_rslt_prnt_flg());
			hdrR.insp_rslt_prnt_tm(prnt.down0().get(0).insp_rslt_prnt_tm());
		}

		protected Map_InspRpt_Prnt02_DtlR_Chk01_HdrR<InspRpt_Prnt02_DtlR,Chk01_HdrR> createMap_InspRpt_Prnt02_DtlR_Chk01_HdrR() {
			return new Map_InspRpt_Prnt02_DtlR_Chk01_HdrR<InspRpt_Prnt02_DtlR, Chk01_HdrR>();
		}

		public class Map_InspRpt_Prnt02_DtlR_Chk01_HdrR<D extends InspRpt_Prnt02_DtlR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspRpt_Prnt02_DtlR.$peg_no, Chk01_HdrR.$peg_no);
				addColumnPathMap(InspRpt_Prnt02_DtlR.$insp_no, Chk01_HdrR.$insp_no);

			}
		}

	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 規格検査実績を確認する。<br>
	 */
	public class Upd02 extends MSBFL_StdInspActReg_MC_A.Upd02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// 前チェック処理
			callThisChk02();

			throwUpdErr();

			// 規格検査実績の確認
			callStdInspActServiceUpd02();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_HdrR.$peg_no, up0());
			setPegNo(Chk02_DtlR.$peg_no, up1());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBFL_StdInspActReg.Chk02 ope = MSBFL_StdInspActReg.crtChk02();
			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
			copyall(up0(), ope.down0());
		}

		/**
		 * 規格検査実績を確認する。
		 */
		protected void callStdInspActServiceUpd02() {
			MSBFL_StdInspActService.StdInspAct_Upd02 upd02 = MSBFL_StdInspActService.crtStdInspAct_Upd02();

			StdInspAct_Chk02_HdrR stdHdrR = StdInspAct_Chk02_HdrR.create();
			copy(stdHdrR, up0(), createMap_StdInspAct_Chk02_HdrR_Chk02_HdrR());
			upd02.up0().add(stdHdrR);
			addAll(upd02.up1(), up1(), createMap_StdInspAct_Chk02_DtlR_Chk02_DtlR());

			upd02.exec();
		}

		/**
		 * 検査成績書を発行する。
		 * 
		 * @param ヘッダ情報（電文）
		 */
		protected void callInspRptServicePrnt02(Chk02_HdrR hdrR) {
			MSBFL_InspRptService.InspRpt_Prnt02 prnt = MSBFL_InspRptService.crtInspRpt_Prnt02();

			InspRpt_Prnt02_DtlR prntDtlR = InspRpt_Prnt02_DtlR.create();
			copy(prntDtlR, hdrR, createMap_InspRpt_Prnt02_DtlR_Chk02_HdrR());
			prnt.up0().add(prntDtlR);

			prnt.exec();
		}

		protected Map_InspRpt_Prnt02_DtlR_Chk02_HdrR<InspRpt_Prnt02_DtlR,Chk02_HdrR> createMap_InspRpt_Prnt02_DtlR_Chk02_HdrR() {
			return new Map_InspRpt_Prnt02_DtlR_Chk02_HdrR<InspRpt_Prnt02_DtlR, Chk02_HdrR>();
		}

		public class Map_InspRpt_Prnt02_DtlR_Chk02_HdrR<D extends InspRpt_Prnt02_DtlR, S extends Chk02_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspRpt_Prnt02_DtlR.$peg_no, Chk02_HdrR.$peg_no);
				addColumnPathMap(InspRpt_Prnt02_DtlR.$insp_no, Chk02_HdrR.$insp_no);
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 規格検査実績を取り消す。<br>
	 */
	public class Del01 extends MSBFL_StdInspActReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// 前チェック処理
			callThisChk03();

			throwUpdErr();

			// 規格検査実績の取消
			callStdInspActServiceDel01();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk03_HdrR.$peg_no, up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MSBFL_StdInspActReg.Chk03 ope = MSBFL_StdInspActReg.crtChk03();
			copyall(ope.up0(), up0());
			ope.exec();
		}

		/**
		 * 規格検査実績の取消を行う。
		 */
		protected void callStdInspActServiceDel01() {
			MSBFL_StdInspActService.StdInspAct_Del01 del = MSBFL_StdInspActService.crtStdInspAct_Del01();

			StdInspAct_Chk03_HdrR delHdrR = StdInspAct_Chk03_HdrR.create();
			copy(delHdrR, up0(), createMap_StdInspAct_Chk03_HdrR_Chk03_HdrR());
			del.up0().add(delHdrR);

			del.exec();
		}
	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 規格検査実績の確認情報を取り消す。<br>
	 */
	public class Del02 extends MSBFL_StdInspActReg_MC_A.Del02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// 前チェック処理
			callThisChk04();

			throwUpdErr();

			// 規格検査実績の確認取消
			callStdInspActServiceDel01();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk04_HdrR.$peg_no, up0());
			setPegNo(Chk04_DtlR.$peg_no, up1());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk04() {
			MSBFL_StdInspActReg.Chk04 ope = MSBFL_StdInspActReg.crtChk04();
			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.exec();
		}

		/**
		 * 規格検査実績の確認取消を行う。
		 */
		protected void callStdInspActServiceDel01() {
			MSBFL_StdInspActService.StdInspAct_Del01 del = MSBFL_StdInspActService.crtStdInspAct_Del01();

			StdInspAct_Chk03_HdrR delHdrR = StdInspAct_Chk03_HdrR.create();
			copy(delHdrR, up0(), createMap_StdInspAct_Chk03_HdrR_Chk04_HdrR());
			del.up0().add(delHdrR);
			addAll(del.up1(), up1(), createMap_StdInspAct_Chk03_DtlR_Chk04_DtlR());

			del.exec();
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 検査成績書を発行する。<br>
	 */
	public class Prnt01 extends MSBFL_StdInspActReg_MC_A.Prnt01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			editUp();

			// 検査成績書発行
			callInspRptServicePrnt02();

			throwErr(msgNoPrintData());

			// 下り電文設定
			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Prnt01_HdrR.$peg_no, up0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			copyall(down0(), up0());
		}

		/**
		 * 検査成績書を発行する。
		 */
		protected void callInspRptServicePrnt02() {
			MSBFL_InspRptService.InspRpt_Prnt02 prnt = MSBFL_InspRptService.crtInspRpt_Prnt02();

			InspRpt_Prnt02_DtlR prntDtlR = InspRpt_Prnt02_DtlR.create();
			copy(prntDtlR, up0(), createMap_InspRpt_Prnt02_DtlR_Prnt01_HdrR());
			prnt.up0().add(prntDtlR);

			prnt.exec();

			up0().insp_rslt_prnt_flg(prnt.down0().get(0).insp_rslt_prnt_flg());
			up0().insp_rslt_prnt_tm(prnt.down0().get(0).insp_rslt_prnt_tm());
			up0().err_flg(prnt.down0().get(0).err_flg());
		}

		protected Map_InspRpt_Prnt02_DtlR_Prnt01_HdrR<InspRpt_Prnt02_DtlR,Prnt01_HdrR> createMap_InspRpt_Prnt02_DtlR_Prnt01_HdrR() {
			return new Map_InspRpt_Prnt02_DtlR_Prnt01_HdrR<InspRpt_Prnt02_DtlR, Prnt01_HdrR>();
		}

		public class Map_InspRpt_Prnt02_DtlR_Prnt01_HdrR<D extends InspRpt_Prnt02_DtlR, S extends Prnt01_HdrR> extends MCRowMapper<D,S>{
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap(InspRpt_Prnt02_DtlR.$peg_no, Prnt01_HdrR.$peg_no);
				addColumnPathMap(InspRpt_Prnt02_DtlR.$insp_no, Prnt01_HdrR.$insp_no);

			}
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 規格検査実績情報を検索する。<br>
	 */
	public class Srch01 extends MSBFL_StdInspActReg_MC_A.Srch01 {

		protected static final String OPE_DEL = "2";
		protected static final String OPE_DEL_CNF = "3";

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			// 検査指図情報取得
			int cnt = srchHdr();
			if (cnt <= 0) {
				return ;
			}

			// 規格検査明細情報取得
			cnt = srchDtl();
			if (cnt <= 0) {
				down0().clear();
			}
		}
		
		/**
		 * 検査指図情報を検索する。
		 * 
		 * @return 件数
		 */
		protected int srchHdr() {
			MCQueryPlan sql = MSBFL0050_MST_INSP_INST_S01();
			
			// 取消の場合、規格検査実績テーブルの存在有無を検索条件に追加する
			if (isSame(up0().ope(), OPE_DEL)) {
				sql.addDynamicSQLInfo(MSBFL0050_MST_INSP_INST_S01_WHERE01());
			}
			// 確認取消の場合、規格検査実績テーブルの確認済レコードの存在有無を検索条件に追加する
			else if (isSame(up0().ope(), OPE_DEL_CNF)) {
				sql.addDynamicSQLInfo(MSBFL0050_MST_INSP_INST_S01_WHERE02());
			}
			return executeQuery(down0(), sql, up0());
		}

		/**
		 * 規格検査指図情報を検索する。
		 * 
		 * @return 件数
		 */
		protected int srchDtl() {
			return executeQuery(down1(), MSBFL0050_MST_STD_INSP_INST_S01(), up0());
		}
	}

	// Mapper
	protected Map_StdInspAct_Chk01_HdrR_Chk01_HdrR<StdInspAct_Chk01_HdrR,Chk01_HdrR> createMap_StdInspAct_Chk01_HdrR_Chk01_HdrR() {
		return new Map_StdInspAct_Chk01_HdrR_Chk01_HdrR<StdInspAct_Chk01_HdrR, Chk01_HdrR>();
	}

	public class Map_StdInspAct_Chk01_HdrR_Chk01_HdrR<D extends StdInspAct_Chk01_HdrR, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StdInspAct_Chk01_HdrR.$peg_no, Chk01_HdrR.$peg_no);
			addColumnPathMap(StdInspAct_Chk01_HdrR.$insp_no, Chk01_HdrR.$insp_no);
			addColumnPathMap(StdInspAct_Chk01_HdrR.$act_cont_fctr, Chk01_HdrR.$act_cont_fctr);
			addColumnPathMap(StdInspAct_Chk01_HdrR.$cont_fctr_flg, Chk01_HdrR.$cont_fctr_flg);
			addColumnPathMap(StdInspAct_Chk01_HdrR.$inst_upd_cntr, Chk01_HdrR.$inst_upd_cntr);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.upd_cntr_chk_flg(true);
		}
	}

	protected Map_StdInspAct_Chk02_HdrR_Chk02_HdrR<StdInspAct_Chk02_HdrR,Chk02_HdrR> createMap_StdInspAct_Chk02_HdrR_Chk02_HdrR() {
		return new Map_StdInspAct_Chk02_HdrR_Chk02_HdrR<StdInspAct_Chk02_HdrR, Chk02_HdrR>();
	}

	public class Map_StdInspAct_Chk02_HdrR_Chk02_HdrR<D extends StdInspAct_Chk02_HdrR, S extends Chk02_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StdInspAct_Chk02_HdrR.$peg_no, Chk02_HdrR.$peg_no);
			addColumnPathMap(StdInspAct_Chk02_HdrR.$insp_no, Chk02_HdrR.$insp_no);
			addColumnPathMap(StdInspAct_Chk02_HdrR.$inst_upd_cntr, Chk02_HdrR.$inst_upd_cntr);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.upd_cntr_chk_flg(true);
		}
	}

	protected Map_StdInspAct_Chk01_DtlR_Chk01_DtlR<StdInspAct_Chk01_DtlR,Chk01_DtlR> createMap_StdInspAct_Chk01_DtlR_Chk01_DtlR() {
		return new Map_StdInspAct_Chk01_DtlR_Chk01_DtlR<StdInspAct_Chk01_DtlR, Chk01_DtlR>();
	}

	public class Map_StdInspAct_Chk01_DtlR_Chk01_DtlR<D extends StdInspAct_Chk01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StdInspAct_Chk01_DtlR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$std_insp_act_no, Chk01_DtlR.$std_insp_act_no);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$std_insp_inst_no, Chk01_DtlR.$std_insp_inst_no);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$insp_no, Chk01_DtlR.$insp_no);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$qn_insp_val, Chk01_DtlR.$qn_insp_val);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$ql_insp_val, Chk01_DtlR.$ql_insp_val);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$st_tm, Chk01_DtlR.$st_tm);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$end_tm, Chk01_DtlR.$end_tm);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$usr_cd, Chk01_DtlR.$usr_cd);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$dpt_cd, Chk01_DtlR.$dpt_cd);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$std_insp_rslt_typ, Chk01_DtlR.$std_insp_rslt_typ);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$act_intr_rmrks, Chk01_DtlR.$act_intr_rmrks);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$sub_char3, Chk01_DtlR.$sub_char3);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$qn_int_digit, Chk01_DtlR.$qn_int_digit);
			addColumnPathMap(StdInspAct_Chk01_DtlR.$qn_int_frac, Chk01_DtlR.$qn_int_frac);

		}
	}

	protected Map_StdInspAct_Chk02_DtlR_Chk02_DtlR<StdInspAct_Chk02_DtlR,Chk02_DtlR> createMap_StdInspAct_Chk02_DtlR_Chk02_DtlR() {
		return new Map_StdInspAct_Chk02_DtlR_Chk02_DtlR<StdInspAct_Chk02_DtlR, Chk02_DtlR>();
	}

	public class Map_StdInspAct_Chk02_DtlR_Chk02_DtlR<D extends StdInspAct_Chk02_DtlR, S extends Chk02_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StdInspAct_Chk02_DtlR.$peg_no, Chk02_DtlR.$peg_no);
			addColumnPathMap(StdInspAct_Chk02_DtlR.$std_insp_act_no, Chk02_DtlR.$std_insp_act_no);
			addColumnPathMap(StdInspAct_Chk02_DtlR.$insp_no, Chk02_DtlR.$insp_no);
			addColumnPathMap(StdInspAct_Chk02_DtlR.$cnf_flg, Chk02_DtlR.$cnf_flg);
			addColumnPathMap(StdInspAct_Chk02_DtlR.$cnf_dt, Chk02_DtlR.$cnf_dt);
			addColumnPathMap(StdInspAct_Chk02_DtlR.$cnf_usr_cd, Chk02_DtlR.$cnf_usr_cd);
			addColumnPathMap(StdInspAct_Chk02_DtlR.$cnf_dpt_cd, Chk02_DtlR.$cnf_dpt_cd);
			addColumnPathMap(StdInspAct_Chk02_DtlR.$cnf_intr_rmrks, Chk02_DtlR.$cnf_intr_rmrks);

		}
	}

	protected Map_StdInspAct_Chk03_HdrR_Chk03_HdrR<StdInspAct_Chk03_HdrR,Chk03_HdrR> createMap_StdInspAct_Chk03_HdrR_Chk03_HdrR() {
		return new Map_StdInspAct_Chk03_HdrR_Chk03_HdrR<StdInspAct_Chk03_HdrR, Chk03_HdrR>();
	}

	public class Map_StdInspAct_Chk03_HdrR_Chk03_HdrR<D extends StdInspAct_Chk03_HdrR, S extends Chk03_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StdInspAct_Chk03_HdrR.$peg_no, Chk03_HdrR.$peg_no);
			addColumnPathMap(StdInspAct_Chk03_HdrR.$insp_no, Chk03_HdrR.$insp_no);
			addColumnPathMap(StdInspAct_Chk03_HdrR.$inst_upd_cntr, Chk03_HdrR.$inst_upd_cntr);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.upd_cntr_chk_flg(true);
		}
	}

	protected Map_StdInspAct_Chk03_HdrR_Chk04_HdrR<StdInspAct_Chk03_HdrR,Chk04_HdrR> createMap_StdInspAct_Chk03_HdrR_Chk04_HdrR() {
		return new Map_StdInspAct_Chk03_HdrR_Chk04_HdrR<StdInspAct_Chk03_HdrR, Chk04_HdrR>();
	}

	public class Map_StdInspAct_Chk03_HdrR_Chk04_HdrR<D extends StdInspAct_Chk03_HdrR, S extends Chk04_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StdInspAct_Chk03_HdrR.$peg_no, Chk04_HdrR.$peg_no);
			addColumnPathMap(StdInspAct_Chk03_HdrR.$insp_no, Chk04_HdrR.$insp_no);
			addColumnPathMap(StdInspAct_Chk03_HdrR.$inst_upd_cntr, Chk04_HdrR.$inst_upd_cntr);
		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			dest.upd_cntr_chk_flg(true);
		}
	}

	protected Map_StdInspAct_Chk03_DtlR_Chk04_DtlR<StdInspAct_Chk03_DtlR,Chk04_DtlR> createMap_StdInspAct_Chk03_DtlR_Chk04_DtlR() {
		return new Map_StdInspAct_Chk03_DtlR_Chk04_DtlR<StdInspAct_Chk03_DtlR, Chk04_DtlR>();
	}

	public class Map_StdInspAct_Chk03_DtlR_Chk04_DtlR<D extends StdInspAct_Chk03_DtlR, S extends Chk04_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StdInspAct_Chk03_DtlR.$peg_no, Chk04_DtlR.$peg_no);
			addColumnPathMap(StdInspAct_Chk03_DtlR.$std_insp_act_no, Chk04_DtlR.$std_insp_act_no);
			addColumnPathMap(StdInspAct_Chk03_DtlR.$insp_no, Chk04_DtlR.$insp_no);
			addColumnPathMap(StdInspAct_Chk03_DtlR.$cnf_flg, Chk04_DtlR.$cnf_flg);
			addColumnPathMap(StdInspAct_Chk03_DtlR.$cnf_intr_rmrks, Chk04_DtlR.$cnf_intr_rmrks);

		}
	}

	//FMCB CUSTOM END
}