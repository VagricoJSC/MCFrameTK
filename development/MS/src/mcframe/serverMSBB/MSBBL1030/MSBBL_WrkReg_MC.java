package mcframe.serverMSBB.MSBBL1030;

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
import mcframe.serverMSBB.MSBBL1030.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.commonCore.container.MCRow.*;
import mcframe.commonMAUA.MAUAC0010.MAUAC_List;
import static mcframe.serverMSBB.MSBBL1030.Query.*;
import mcframe.serverFXUC.FXUCL0170.FXUCL_RequiredValidater;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBBL_WrkReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBBL_WrkReg_MC extends MSBBL_WrkReg_MC_A{
	//FMCB CUSTOM START
	
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 案件情報を検索する<br>
	 */
	public class Srch01 extends MSBBL_WrkReg_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			int cnt = srchHdr();
			if (isSame(cnt, 0)) {
				return;
			}
			chkRsltHdr();

			srchDtl1();
			chkRsltDtl1();

			srchDtl2();
			chkRsltDtl2();

			srchDtl3();
			chkRsltDtl3();

			srchDtl4();
			chkRsltDtl4();

			srchDtl5();
			chkRsltDtl5();
		}

		/**
		 * 	案件情報検索
		 * @return　検索結果件数
		 */
		protected int srchHdr() {
			return executeQuery(down0(), MABBL1030_MST_WRK_S01(), up0());
		}

		/**
		 * 	ヘッダの検索結果をチェック
		 */
		protected void chkRsltHdr() {
		}

		/**
		 * 	得意先案件情報検索
		 */
		protected void srchDtl1() {
			executeQuery(down1(), MABBL1030_MST_CST_WRK_S01(), up0());
		}

		/**
		 * 	得意先案件情報の検索結果をチェック
		 */
		protected void chkRsltDtl1() {
		}

		/**
		 * 	活動履歴情報検索
		 */
		protected void srchDtl2() {
			executeQuery(down2(), MSBBL1030_MST_WRK_ACT_HIST_S01(), up0());
		}

		/**
		 * 	活動履歴情報の検索結果をチェック
		 */
		protected void chkRsltDtl2() {
		}

		/**
		 * 	競合情報検索
		 */
		protected void srchDtl3() {
			executeQuery(down3(), MSBBL1030_MST_WRK_COMP_S01(), up0());
		}

		/**
		 * 	競合情報の検索結果をチェック
		 */
		protected void chkRsltDtl3() {
		}

		/**
		 * 	見積情報検索
		 */
		protected void srchDtl4() {
			executeQuery(down4(), MSBBL1030_MST_QTN_S01(), up0());
		}

		/**
		 * 	見積情報の検索結果をチェック
		 */
		protected void chkRsltDtl4() {
		}

		/**
		 * 	案件手配紐付情報検索
		 */
		protected void srchDtl5() {
			executeQuery(down5(), MSBBL1030_MST_WRK_SNO_S01(), up0());
		}

		/**
		 * 	案件手配紐付情報の検索結果をチェック
		 */
		protected void chkRsltDtl5() {
		}
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 案件情報を新規登録・訂正する前のチェックを行う<br>
	 */
	public class Chk01 extends MSBBL_WrkReg_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();
			if (!hasErr()) {
			}
			setCompNo();
			setHistNo();
			setDown();
		}

		/**
		 * 競合ＮＯ設定
		 */
		protected void setCompNo() {
			// 案件競合情報から案件に紐付くレコードの競合ＮＯの最大値を取得
			MST_WRK_COMP_R cstWrkR = MST_WRK_COMP_R.create();
			MST_WRK_COMP_R t = MST_WRK_COMP_R.create("T");
			MCQueryApiBuilder cstWrkR_bldr = MCQueryApiBuilder.create(t);
			cstWrkR_bldr.setSelect(max(t.comp_no).as("comp_no"));
			cstWrkR_bldr.setWhere(t.wrk_no.eq(bind("1")), up0().wrk_no());
			dbSelect("MSBBL1030_MST_WRK_COMP_S01", cstWrkR, cstWrkR_bldr);

			MCNumber compNo = nvl(cstWrkR.comp_no(), MCNumber.ZERO);

			for (Chk01_Dtl3R r : up3().subList(Status.CREATE)) {
				compNo = compNo.add(1);
				r.comp_no(compNo);
			}
		}

		/**
		 * 履歴ＮＯ設定
		 */
		protected void setHistNo() {
			// 案件活動履歴情報から案件に紐付くレコードの競合ＮＯの最大値を取得
			MST_WRK_ACT_HIST_R wrkActHistR = MST_WRK_ACT_HIST_R.create();
			MST_WRK_ACT_HIST_R t = MST_WRK_ACT_HIST_R.create("T");
			MCQueryApiBuilder wrkActHistR_bldr = MCQueryApiBuilder.create(t);
			wrkActHistR_bldr.setSelect(max(t.hist_no).as("hist_no"));
			wrkActHistR_bldr.setWhere(t.wrk_no.eq(bind("1")), up0().wrk_no());
			dbSelect("MSBBL1030_MST_WRK_ACT_HIST_S01", wrkActHistR, wrkActHistR_bldr);

			MCNumber histNo = nvl(wrkActHistR.hist_no(), MCNumber.ZERO);

			for (Chk01_Dtl2R r : up2().subList(Status.CREATE)) {
				histNo = histNo.add(1);
				r.hist_no(histNo);
			}
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up1());
			down2().setAll(up2());
			down3().setAll(up3());
			down4().setAll(up4());
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chkWrk());

			return msgL;
		}

		/**
		 * 案件情報の更新カウンタチェック
		 * 
		 * @return
		 */
		protected MCMessageList chkWrk() {
			MCMessageList msgL = new MCMessageList();

			if (isNull(up0().wrk_no())) {
				return msgL;
			}

			MST_WRK_R wrkR = MST_WRK_R.create();
			MST_WRK_R t = MST_WRK_R.create("T");
			MCQueryApiBuilder wrkR_bldr = MCQueryApiBuilder.create(t);
			wrkR_bldr.addSelect(t.upd_cntr);
			wrkR_bldr.addWhereWithAnd(t.wrk_no.eq(bind("1")), up0().wrk_no());
			dbSelectForUpdateNoWait("MSBBL1030_MST_WRK_S01", wrkR, wrkR_bldr);

			msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$upd_cntr, wrkR));

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();

			// 諸口FLGオン時の得意先名の必須チェック
			MCList<Chk01_Dtl1R> notErrDtl1L = getChkList(up1(), MCRow.Status.CREATE, MCRow.Status.MODIFY);

			for (Chk01_Dtl1R r : notErrDtl1L) {
				if (r.cst_sundry_flg()) {
					msgL.addAll(check(r, Chk01_Dtl1R.$cst_nm, new FXUCL_RequiredValidater()));
				}
			}

			// 発番ＦＬＧオフ時の手配ＮＯ１必須チェック
			MCList<Chk01_Dtl5R> notErrDtl5L = getChkList(up4(), MCRow.Status.CREATE, MCRow.Status.MODIFY);
			for (Chk01_Dtl5R r : notErrDtl5L) {
				if (!r.num_flg()) {
					msgL.addAll(check(r, Chk01_Dtl5R.$sno1, new FXUCL_RequiredValidater()));
				}
			}

			// 案件手配紐付情報存在チェック
			if (!notErrDtl5L.isEmpty()) {
				MCList<MST_WRK_SNO_R> wrkSnoL = MCList.create(MST_WRK_SNO_R.class);
				
				MST_WRK_SNO_R t1 = MST_WRK_SNO_R.create("T");
				MCQueryApiBuilder builder = MCQueryApiBuilder.create(t1);
				MST_WRK_R t2 = MST_WRK_R.create("T2");
				builder.addSelect(t1.sno1);
				builder.addInnerJoin(t2, bracket(t1.wrk_no.eq(t2.wrk_no)));
				builder.setWhere(t1.sno1.eq(bind(MST_WRK_SNO_R.$sno1)).and(t2.can_flg.eq(value(false))));
				dbSelect("MSBBL1030_MST_WRK_SNO_S01", wrkSnoL, builder, notErrDtl5L);

				if (wrkSnoL.size() > 0) {
					Chk01_Dtl5R dtl5R = notErrDtl5L.getFirst("sno1", wrkSnoL.get(0).sno1());
					msgL.add(new MCMessage(dtl5R, Chk01_Dtl5R.$sno1, MSBBL0001));
				}
			}
			return msgL;
		}

		@Override
		protected void putListLogicCheckBind() {
			super.putListLogicCheckBind();
			
			ListLogicBind cstBind = getListLogicBind(up1(), Chk01_Dtl1R.$cst_cd);
			cstBind.putBind(MAUAC_List.BpCols.$i_dt, getToday());
		}

		@Override
		protected boolean isSetListLogicValue(MCNumber paramIndex, MCRow row, String column) {
			if (isSame(paramIndex, 1)) {
				if (isCstCols(column)) {
					if (row.getBoolean(Chk01_Dtl1R.$cst_sundry_flg)) {
						return false;
					}
				}
			}
			return super.isSetListLogicValue(paramIndex, row, column);
		}

		protected boolean isCstCols(String column) {
			return isSame(column, Chk01_Dtl1R.$zip_cd)
				|| isSame(column, Chk01_Dtl1R.$addr1)
				|| isSame(column, Chk01_Dtl1R.$addr2)
				|| isSame(column, Chk01_Dtl1R.$addr3)
				|| isSame(column, Chk01_Dtl1R.$addr4)
				|| isSame(column, Chk01_Dtl1R.$tel)
				|| isSame(column, Chk01_Dtl1R.$fax)
				|| isSame(column, Chk01_Dtl1R.$cst_cntct_dpt)
				|| isSame(column, Chk01_Dtl1R.$cst_cntct_psn);
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 案件情報を取り消す前のチェックを行う<br>
	 */
	public class Chk02 extends MSBBL_WrkReg_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			if (!hasErr()) {
			}
			setDown();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			msgL.addAll(chkWrk());

			return msgL;
		}

		/**
		 * 案件情報の更新カウンタチェック
		 * 
		 * @return
		 */
		protected MCMessageList chkWrk() {
			MCMessageList msgL = new MCMessageList();

			if (isNull(up0().wrk_no())) {
				return msgL;
			}

			MST_WRK_R wrkR = MST_WRK_R.create();
			MST_WRK_R t = MST_WRK_R.create("T");
			MCQueryApiBuilder wrkR_bldr = MCQueryApiBuilder.create(t);
			wrkR_bldr.addSelect(t.upd_cntr);
			wrkR_bldr.addWhereWithAnd(t.wrk_no.eq(bind("1")), up0().wrk_no());
			dbSelectForUpdateNoWait("MSBBL1030_MST_WRK_S02", wrkR, wrkR_bldr);

			msgL.addAll(checkUpdCntrNE(up0(), Chk01_HdrR.$upd_cntr, wrkR));

			return msgL;
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			if (up0().err_flg()) {
				return msgL;
			}
			msgL.addAll(chkOther(up0()));

			return msgL;
		}

		/**
		 * 固有チェック
		 * @param up0
		 * @return
		 */
		protected MCMessageList chkOther(Chk02_HdrR up0) {
			MCMessageList msgL = new MCMessageList();

			if (getQtn(up0().wrk_no()).size() > 0) {
				msgL.add(new MCMessage(MSBBL0178));
			}
			if (getSlo(up0().wrk_no()).size() > 0) {
				msgL.add(new MCMessage(MSBBL0179));
			}
			return msgL;
		}

		/**
		 * 見積情報取得
		 * @param wrk_no
		 * @return
		 */
		protected MCList<MST_QTN_R> getQtn(String wrk_no) {
			MCList<MST_QTN_R> qtnL = MCList.create(MST_QTN_R.class);
			MST_QTN_R t = MST_QTN_R.create("T");
			MCQueryApiBuilder qtnL_bldr = MCQueryApiBuilder.create(t);
			qtnL_bldr.setWhere(t.wrk_no.eq(bind("1")), wrk_no);
			qtnL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBBL1030_MST_QTN_S01", qtnL, qtnL_bldr);
			return qtnL;
		}

		/**
		 * 受注情報取得
		 * @param wrk_no
		 * @return
		 */
		protected MCList<MST_SLO_R> getSlo(String wrk_no) {
			MCList<MST_SLO_R> sloL = MCList.create(MST_SLO_R.class);
			MST_SLO_R t = MST_SLO_R.create("T");
			MCQueryApiBuilder sloL_bldr = MCQueryApiBuilder.create(t);
			sloL_bldr.setWhere(t.wrk_no.eq(bind("1")), wrk_no);
			sloL_bldr.addWhereWithAnd(t.can_flg.eq(value(false)));
			dbSelect("MSBBL1030_MST_SLO_S01", sloL, sloL_bldr);
			return sloL;
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			copyall(down0(), up0());
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 案件情報を登録する<br>
	 */
	public class Ins01 extends MSBBL_WrkReg_MC_A.Ins01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callWrkChk01();

			throwUpdErr();

			crtCstWrk();
			crtWrkActHist();
			crtWrkComp();
			crtWrkSno();
			crtWrk();

			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_HdrR.$peg_no, up0());

			ElmArgsR args = ElmArgsR.create();
			args.co_cd(getCo().co_cd());
			args.dt(getToday());

			up0().wrk_no(getNum(MAC_NUM_BIZ_TYP.WRK, args));

			for (int i1 = 0; i1 < up1().size(); i1++) {
				up1().get(i1).wrk_no(up0().wrk_no());
			}
			for (int i2 = 0; i2 < up2().size(); i2++) {
				up2().get(i2).wrk_no(up0().wrk_no());
			}
			for (int i3 = 0; i3 < up3().size(); i3++) {
				up3().get(i3).wrk_no(up0().wrk_no());
			}
			for (int i4 = 0; i4 < up4().size(); i4++) {
				up4().get(i4).wrk_no(up0().wrk_no());
			}

			// Chk01で更新用必須チェックの対応にならないよう新規ステータスにする。
			up0().setStatus(Status.CREATE);
		}

		/**
		 * 更新前チェック処理を呼び出す。
		 */
		protected void callWrkChk01() {

			MSBBL_WrkReg.Chk01 ope = MSBBL_WrkReg.crtChk01();

			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.up3().setAll(up3());
			ope.up4().setAll(up4());

			ope.exec();

			copyall(up0(), ope.down0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.up3().setAll(up3());
			ope.up4().setAll(up4());
		}

		/**
		 * 得意先案件情報登録処理を呼び出す。
		 */
		protected void crtCstWrk() {
			MCList<MST_CST_WRK_R> cstWrkL = MCList.create(MST_CST_WRK_R.class);
			addAll(cstWrkL, up1(), createMap_MST_CST_WRK_R_Chk01_Dtl1R());
			dbInsertEx("MSBBL1030_MST_CST_WRK_I01", cstWrkL,
					MCQueryApiBuilder.create(MST_CST_WRK_R.create("T")));
		}

		/**
		 * 案件活動履歴登録処理を呼び出す。
		 */
		protected void crtWrkActHist() {
			MCList<MST_WRK_ACT_HIST_R> wrkActHistL = MCList.create(MST_WRK_ACT_HIST_R.class);
			addAll(wrkActHistL, up2(), createMap_MST_WRK_ACT_HIST_R_Chk01_Dtl2R());
			dbInsertEx("MSBBL1030_MST_WRK_ACT_HIST_I01", wrkActHistL,
					MCQueryApiBuilder.create(MST_WRK_ACT_HIST_R.create("T")));
		}

		/**
		 * 案件競合情報登録処理を呼び出す。
		 */
		protected void crtWrkComp() {
			MCList<MST_WRK_COMP_R> wrkCompL = MCList.create(MST_WRK_COMP_R.class);
			addAll(wrkCompL, up3(), createMap_MST_WRK_COMP_R_Chk01_Dtl3R());
			dbInsertEx("MSBBL1030_MST_WRK_COMP_I01", wrkCompL,
					MCQueryApiBuilder.create(MST_WRK_COMP_R.create("T")));
		}

		/**
		 * 案件手配紐付情報処理を呼び出す。
		 */
		protected void crtWrkSno() {
			setSno(up0(), up4());

			delCanSNO(up4());

			MCList<MST_WRK_SNO_R> wrkSnoL = MCList.create(MST_WRK_SNO_R.class);
			addAll(wrkSnoL, up4(), createMap_MST_WRK_SNO_R_Chk01_Dtl5R());
			dbInsertEx("MSBBL1030_MST_WRK_SNO_I01", wrkSnoL,
					MCQueryApiBuilder.create(MST_WRK_SNO_R.create("T")));
		}

		/**
		 * 案件情報処理を呼び出す。
		 */
		protected void crtWrk() {
			MST_WRK_R wrkR = MST_WRK_R.create();
			copy(wrkR, up0(), createMap_MST_WRK_R_Chk01_HdrR());
			dbInsert("MSBBL1030_MST_WRK_I01", wrkR,
					MCQueryApiBuilder.create(MST_WRK_R.create("T")));
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			copyall(down0(), up0());
			down1().setAll(up4());
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 案件情報を訂正する<br>
	 */
	public class Upd01 extends MSBBL_WrkReg_MC_A.Upd01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			editUp();
			callWrkChk01();
			throwUpdErr();

			crtCstWrk();
			crtWrkActHist();
			crtWrkComp();
			crtWrkSno();
			crtWrk();

			setDown();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_HdrR.$peg_no, up0());
			setPegNo(Chk01_HdrR.$peg_no, up1());
			setPegNo(Chk01_HdrR.$peg_no, up2());
			setPegNo(Chk01_HdrR.$peg_no, up3());
			setPegNo(Chk01_HdrR.$peg_no, up4());

			for (int i1 = 0; i1 < up1().size(); i1++) {
				up1().get(i1).wrk_no(up0().wrk_no());
				if (!up1().get(i1).cst_sundry_flg()) {
					up1().get(i1).cst_nm(null);
				}
			}
			for (int i2 = 0; i2 < up2().size(); i2++) {
				up2().get(i2).wrk_no(up0().wrk_no());
			}
			for (int i3 = 0; i3 < up3().size(); i3++) {
				up3().get(i3).wrk_no(up0().wrk_no());
			}
			for (int i4 = 0; i4 < up4().size(); i4++) {
				up4().get(i4).wrk_no(up0().wrk_no());
			}
		}

		/**
		 * 更新前チェック処理を呼び出す。
		 */
		protected void callWrkChk01() {

			MSBBL_WrkReg.Chk01 ope = MSBBL_WrkReg.crtChk01();

			copyall(ope.up0(), up0());
			ope.up1().setAll(up1());
			ope.up2().setAll(up2());
			ope.up3().setAll(up3());
			ope.up4().setAll(up4());

			ope.exec();

			copyall(up0(), ope.down0());
			up1().setAll(ope.down1());
			up2().setAll(ope.down2());
			up3().setAll(ope.down3());
			up4().setAll(ope.down4());
		}

		/**
		 * 得意先案件情報登録処理を呼び出す。
		 */
		protected void crtCstWrk() {
			MCList<Chk01_Dtl1R> chkUp1 = up1().subList(Status.CREATE, Status.MODIFY, Status.DELETE);
			// 得意先案件情報に変更がない場合は、更新不要
			if (chkUp1.isEmpty()) {
				return;
			}
			
			MST_CST_WRK_R t = MST_CST_WRK_R.create("T");
			execDbDelete("MSBBL1030_MST_CST_WRK_D01", t, t.wrk_no.eq(bind("1")), up0().wrk_no());
			
			MCList<MST_CST_WRK_R> cstWrkL = MCList.create(MST_CST_WRK_R.class);
			MCList<Chk01_Dtl1R> up1 = up1().subList(Status.CREATE, Status.MODIFY, Status.NONE);
			addAll(cstWrkL, up1, createMap_MST_CST_WRK_R_Chk01_Dtl1R());
			
			dbInsert("MSBBL1030_MST_CST_WRK_I02", cstWrkL, MCQueryApiBuilder.create(t));
		}

		/**
		 * 案件活動履歴登録処理を呼び出す。
		 */
		protected void crtWrkActHist() {
			MCList<MST_WRK_ACT_HIST_R> wrkActHistL = MCList.create(MST_WRK_ACT_HIST_R.class);
			addAll(wrkActHistL, up2(), createMap_MST_WRK_ACT_HIST_R_Chk01_Dtl2R());
			MCQueryApiBuilder wrkActHistR_bldr = MCQueryApiBuilder.create(MST_WRK_ACT_HIST_R.create("T"));

			for (MST_WRK_ACT_HIST_R wrkActHistR : wrkActHistL) {
				if (isSame(wrkActHistR.getStatus(), Status.CREATE)) {
					dbInsert("MSBBL1030_MST_WRK_ACT_HIST_I02", wrkActHistR, wrkActHistR_bldr);
				}
				else if (isSame(wrkActHistR.getStatus(), Status.MODIFY)) {
					dbUpdateKey("MSBBL1030_MST_WRK_ACT_HIST_U01", wrkActHistR, wrkActHistR_bldr);
				}
				else if (isSame(wrkActHistR.getStatus(), Status.DELETE)) {
					dbDeleteKey("MSBBL1030_MST_WRK_ACT_HIST_D01", wrkActHistR, wrkActHistR_bldr);
				}
			}
		}

		/**
		 * 案件競合情報登録処理を呼び出す。
		 */
		protected void crtWrkComp() {
			MCList<MST_WRK_COMP_R> wrkCompL = MCList.create(MST_WRK_COMP_R.class);
			addAll(wrkCompL, up3(), createMap_MST_WRK_COMP_R_Chk01_Dtl3R());
			MCQueryApiBuilder wrkCompR_bldr = MCQueryApiBuilder.create(MST_WRK_COMP_R.create("T"));

			for (MST_WRK_COMP_R wrkCompR : wrkCompL) {
				if (isSame(wrkCompR.getStatus(), Status.CREATE)) {
					dbInsert("MSBBL1030_MST_WRK_COMP_I02", wrkCompR, wrkCompR_bldr);
				}
				else if (isSame(wrkCompR.getStatus(), Status.MODIFY)) {
					dbUpdateKey("MSBBL1030_MST_WRK_COMP_U01", wrkCompR, wrkCompR_bldr);
				}
				else if (isSame(wrkCompR.getStatus(), Status.DELETE)) {
					dbDeleteKey("MSBBL1030_MST_WRK_COMP_D01", wrkCompR, wrkCompR_bldr);
				}
			}
		}

		/**
		 * 案件手配紐付情報処理を呼び出す。
		 */
		protected void crtWrkSno() {
			MCList<Chk01_Dtl5R> chkUp4 = up4().subList(Status.CREATE, Status.MODIFY, Status.DELETE);			

			// 案件手配紐付情報に変更がない場合は、更新不要
			if (chkUp4.isEmpty()) {
				return;
			}
			delCanSNO(up4());
			
			MST_WRK_SNO_R t = MST_WRK_SNO_R.create("T");
			execDbDelete("MSBBL1030_MST_WRK_SNO_D01", t, t.wrk_no.eq(bind("1")), up0().wrk_no());
			
			
			MCList<MST_WRK_SNO_R> wrkSnoL = MCList.create(MST_WRK_SNO_R.class);
			MCList<Chk01_Dtl5R> up4 = up4().subList(Status.CREATE, Status.MODIFY, Status.NONE);
			setSno(up0(), up4);
			addAll(wrkSnoL, up4, createMap_MST_WRK_SNO_R_Chk01_Dtl5R());
			
			dbInsert("MSBBL1030_MST_WRK_SNO_I02", wrkSnoL, MCQueryApiBuilder.create(t));
		}

		/**
		 * 案件情報処理を呼び出す。
		 */
		protected void crtWrk() {
			MST_WRK_R wrkR = MST_WRK_R.create();
			copy(wrkR, up0(), createMap_MST_WRK_R_Chk01_HdrR());
			MCQueryApiBuilder wrkR_bldr = MCQueryApiBuilder.create(MST_WRK_R.create("T"));
			wrkR_bldr.setSetAll();
			dbUpdateKey("MSBBL1030_MST_WRK_U01", wrkR, wrkR_bldr);
		}

		/**
		 * 下り電文を設定する。
		 */
		protected void setDown() {
			down0().setAll(up4());
		}
	}
	
	/**
	 * 取消した手配NOを削除する
	 * @param dtlL
	 */
	protected void delCanSNO(MCList<Chk01_Dtl5R> dtlL) {
		MST_WRK_SNO_R t1 = MST_WRK_SNO_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(t1);
		MST_WRK_R t2 = MST_WRK_R.create("T2");
		builder.addSelect(t1.sno1);
		builder.addInnerJoin(t2, bracket(t1.wrk_no.eq(t2.wrk_no)));
		builder.setWhere(
				t1.sno1.eq(bind(MST_WRK_SNO_R.$sno1)).and(t2.can_flg.eq(value(true))));
		MCList<MST_WRK_SNO_R> queryResult = MCList.create(MST_WRK_SNO_R.class);
		dbSelect("MSBBL1030_MST_WRK_SNO_S02", queryResult, builder, dtlL);

		if (!isNull(queryResult)) {
			dbDeleteKey("MSBBL1030_MST_WRK_SNO_D01", queryResult, builder);
		}
	}


	/**
	 * 発番対象行を取得する。
	 * @param dtlL
	 * @return
	 */
	protected MCList<Chk01_Dtl5R> getSetSno(MCList<Chk01_Dtl5R> dtlL) {
		MCList<Chk01_Dtl5R> l = MCList.create(Chk01_Dtl5R.class);

		// システムパラメータで 手配ＮＯ を使用しない設定になっている場合は対象なし。
		int use_att = Integer.parseInt(getSysParm("SNO_TYP"));
		if (!(1 <= use_att && use_att <= 4)) {
			return l;
		}

		l = dtlL.subList(Chk01_Dtl5R.$num_flg, true);
		return l;
	}

	/**
	 * 手配ＮＯを発番する。
	 */
	protected void setSno(Chk01_HdrR hdrR, MCList<Chk01_Dtl5R> dtlL) {
		MCList<Chk01_Dtl5R> l = getSetSno(dtlL);
		if (l.isEmpty()) {
			return;
		}

		for (Chk01_Dtl5R dtlR : l) {
			ElmArgsR argsR = ElmArgsR.create();

			argsR.dt(getToday()); // 運用日
			argsR.str3(hdrR.wrk_no()); // 文字列３（案件ＮＯ）

			dtlR.sno1(getNum(MAC_NUM_BIZ_TYP.SNO, argsR));
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 案件情報を取り消す<br>
	 */
	public class Del01 extends MSBBL_WrkReg_MC_A.Del01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			editUp();
			callThisChk02();
			throwCanErr();
			delWrk();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk02_HdrR.$peg_no, up0());

			up0().setStatus(Status.MODIFY);
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBBL_WrkReg.Chk02 ope = MSBBL_WrkReg.crtChk02();
			copyall(ope.up0(), up0());
			ope.exec();
			copyall(up0(), ope.down0());
		}

		/**
		 * 案件情報処理を更新する。
		 */
		protected void delWrk() {
			MST_WRK_R wrkR = MST_WRK_R.create();
			copy(wrkR, up0(), createMap_MST_WRK_R_Chk02_HdrR());
			wrkR.can_flg(true);
			MST_WRK_R t = MST_WRK_R.create("T");
			execDbUpdateKey("MSBBL1030_MST_WRK_U02", t, wrkR, t.can_flg);
		}
	}

	protected Map_MST_WRK_R_Chk01_HdrR<MST_WRK_R,Chk01_HdrR> createMap_MST_WRK_R_Chk01_HdrR() {
		return new Map_MST_WRK_R_Chk01_HdrR<MST_WRK_R, Chk01_HdrR>();
	}

	public class Map_MST_WRK_R_Chk01_HdrR<D extends MST_WRK_R, S extends Chk01_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_WRK_R.$wrk_no, Chk01_HdrR.$wrk_no);
			addColumnPathMap(MST_WRK_R.$wrk_nm, Chk01_HdrR.$wrk_nm);
			addColumnPathMap(MST_WRK_R.$st_dt, Chk01_HdrR.$st_dt);
			addColumnPathMap(MST_WRK_R.$end_dt, Chk01_HdrR.$end_dt);
			addColumnPathMap(MST_WRK_R.$wrk_desc, Chk01_HdrR.$wrk_desc);
			addColumnPathMap(MST_WRK_R.$term_cond, Chk01_HdrR.$term_cond);
			addColumnPathMap(MST_WRK_R.$wrk_sts_cd, Chk01_HdrR.$wrk_sts_cd);
			addColumnPathMap(MST_WRK_R.$slo_acc_cd, Chk01_HdrR.$slo_acc_cd);
			addColumnPathMap(MST_WRK_R.$cur_cd, Chk01_HdrR.$cur_cd);
			addColumnPathMap(MST_WRK_R.$budget, Chk01_HdrR.$budget);
			addColumnPathMap(MST_WRK_R.$slo_rsn, Chk01_HdrR.$slo_rsn);
			addColumnPathMap(MST_WRK_R.$fail_rsn, Chk01_HdrR.$fail_rsn);
			addColumnPathMap(MST_WRK_R.$wrk_rmrks, Chk01_HdrR.$wrk_rmrks);
			addColumnPathMap(MST_WRK_R.$sub_char1, Chk01_HdrR.$sub_char1);
			addColumnPathMap(MST_WRK_R.$sub_char2, Chk01_HdrR.$sub_char2);
			addColumnPathMap(MST_WRK_R.$sub_char3, Chk01_HdrR.$sub_char3);
			addColumnPathMap(MST_WRK_R.$wrk_ar_flg, Chk01_HdrR.$wrk_ar_flg);
			addColumnPathMap(MST_WRK_R.$wrk_ap_flg, Chk01_HdrR.$wrk_ap_flg);
			addColumnPathMap(MST_WRK_R.$upd_cntr, Chk01_HdrR.$upd_cntr);
		}
		@Override
		public void valueCopy(D dest, S src) {
			dest.prj_no(MAC_STR.NULL_VAL.value());
		}
	}

	protected Map_MST_CST_WRK_R_Chk01_Dtl1R<MST_CST_WRK_R,Chk01_Dtl1R> createMap_MST_CST_WRK_R_Chk01_Dtl1R() {
		return new Map_MST_CST_WRK_R_Chk01_Dtl1R<MST_CST_WRK_R, Chk01_Dtl1R>();
	}

	public class Map_MST_CST_WRK_R_Chk01_Dtl1R<D extends MST_CST_WRK_R, S extends Chk01_Dtl1R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_CST_WRK_R.$wrk_no, Chk01_Dtl1R.$wrk_no);
			addColumnPathMap(MST_CST_WRK_R.$cst_cd, Chk01_Dtl1R.$cst_cd);
			addColumnPathMap(MST_CST_WRK_R.$cst_sundry_flg, Chk01_Dtl1R.$cst_sundry_flg);
			addColumnPathMap(MST_CST_WRK_R.$cst_cntct_dpt, Chk01_Dtl1R.$cst_cntct_dpt);
			addColumnPathMap(MST_CST_WRK_R.$cst_cntct_psn, Chk01_Dtl1R.$cst_cntct_psn);
			addColumnPathMap(MST_CST_WRK_R.$zip_cd, Chk01_Dtl1R.$zip_cd);
			addColumnPathMap(MST_CST_WRK_R.$addr1, Chk01_Dtl1R.$addr1);
			addColumnPathMap(MST_CST_WRK_R.$addr2, Chk01_Dtl1R.$addr2);
			addColumnPathMap(MST_CST_WRK_R.$addr3, Chk01_Dtl1R.$addr3);
			addColumnPathMap(MST_CST_WRK_R.$addr4, Chk01_Dtl1R.$addr4);
			addColumnPathMap(MST_CST_WRK_R.$tel, Chk01_Dtl1R.$tel);
			addColumnPathMap(MST_CST_WRK_R.$fax, Chk01_Dtl1R.$fax);
			addColumnPathMap(MST_CST_WRK_R.$capital, Chk01_Dtl1R.$capital);
			addColumnPathMap(MST_CST_WRK_R.$emp_num, Chk01_Dtl1R.$emp_num);
			addColumnPathMap(MST_CST_WRK_R.$sub_char1, Chk01_Dtl1R.$sub_char1);
			addColumnPathMap(MST_CST_WRK_R.$sub_char2, Chk01_Dtl1R.$sub_char2);
			addColumnPathMap(MST_CST_WRK_R.$sub_char3, Chk01_Dtl1R.$sub_char3);
			addColumnPathMap(MST_CST_WRK_R.$upd_cntr, Chk01_Dtl1R.$upd_cntr);
		}

		@Override
		public void valueCopy(D dest, S src) {
			if (src.cst_sundry_flg()) {
				dest.cst_nm(src.cst_nm());
			}
		}
	}

	protected Map_MST_WRK_ACT_HIST_R_Chk01_Dtl2R<MST_WRK_ACT_HIST_R,Chk01_Dtl2R> createMap_MST_WRK_ACT_HIST_R_Chk01_Dtl2R() {
		return new Map_MST_WRK_ACT_HIST_R_Chk01_Dtl2R<MST_WRK_ACT_HIST_R, Chk01_Dtl2R>();
	}

	public class Map_MST_WRK_ACT_HIST_R_Chk01_Dtl2R<D extends MST_WRK_ACT_HIST_R, S extends Chk01_Dtl2R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_WRK_ACT_HIST_R.$wrk_no, Chk01_Dtl2R.$wrk_no);
			addColumnPathMap(MST_WRK_ACT_HIST_R.$hist_no, Chk01_Dtl2R.$hist_no);
			addColumnPathMap(MST_WRK_ACT_HIST_R.$act_sts_cd, Chk01_Dtl2R.$act_sts_cd);
			addColumnPathMap(MST_WRK_ACT_HIST_R.$act_hist, Chk01_Dtl2R.$act_hist);
			addColumnPathMap(MST_WRK_ACT_HIST_R.$act_schd_dt, Chk01_Dtl2R.$act_schd_dt);
			addColumnPathMap(MST_WRK_ACT_HIST_R.$act_schd, Chk01_Dtl2R.$act_schd);
			addColumnPathMap(MST_WRK_ACT_HIST_R.$act_act_dt, Chk01_Dtl2R.$act_act_dt);
			addColumnPathMap(MST_WRK_ACT_HIST_R.$act_act, Chk01_Dtl2R.$act_act);
			addColumnPathMap(MST_WRK_ACT_HIST_R.$sub_char1, Chk01_Dtl2R.$sub_char1);
			addColumnPathMap(MST_WRK_ACT_HIST_R.$sub_char2, Chk01_Dtl2R.$sub_char2);
			addColumnPathMap(MST_WRK_ACT_HIST_R.$sub_char3, Chk01_Dtl2R.$sub_char3);
			addColumnPathMap(MST_WRK_ACT_HIST_R.$upd_cntr, Chk01_Dtl2R.$upd_cntr);
		}
	}

	protected Map_MST_WRK_COMP_R_Chk01_Dtl3R<MST_WRK_COMP_R,Chk01_Dtl3R> createMap_MST_WRK_COMP_R_Chk01_Dtl3R() {
		return new Map_MST_WRK_COMP_R_Chk01_Dtl3R<MST_WRK_COMP_R, Chk01_Dtl3R>();
	}

	public class Map_MST_WRK_COMP_R_Chk01_Dtl3R<D extends MST_WRK_COMP_R, S extends Chk01_Dtl3R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_WRK_COMP_R.$wrk_no, Chk01_Dtl3R.$wrk_no);
			addColumnPathMap(MST_WRK_COMP_R.$comp_no, Chk01_Dtl3R.$comp_no);
			addColumnPathMap(MST_WRK_COMP_R.$comp_dt, Chk01_Dtl3R.$comp_dt);
			addColumnPathMap(MST_WRK_COMP_R.$comp_info, Chk01_Dtl3R.$comp_info);
			addColumnPathMap(MST_WRK_COMP_R.$sub_char1, Chk01_Dtl3R.$sub_char1);
			addColumnPathMap(MST_WRK_COMP_R.$sub_char2, Chk01_Dtl3R.$sub_char2);
			addColumnPathMap(MST_WRK_COMP_R.$sub_char3, Chk01_Dtl3R.$sub_char3);
			addColumnPathMap(MST_WRK_COMP_R.$upd_cntr, Chk01_Dtl3R.$upd_cntr);

		}
	}

	protected Map_MST_WRK_SNO_R_Chk01_Dtl5R<MST_WRK_SNO_R,Chk01_Dtl5R> createMap_MST_WRK_SNO_R_Chk01_Dtl5R() {
		return new Map_MST_WRK_SNO_R_Chk01_Dtl5R<MST_WRK_SNO_R, Chk01_Dtl5R>();
	}

	public class Map_MST_WRK_SNO_R_Chk01_Dtl5R<D extends MST_WRK_SNO_R, S extends Chk01_Dtl5R> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_WRK_SNO_R.$sno1, Chk01_Dtl5R.$sno1);
			addColumnPathMap(MST_WRK_SNO_R.$wrk_no, Chk01_Dtl5R.$wrk_no);
			addColumnPathMap(MST_WRK_SNO_R.$upd_cntr, Chk01_Dtl5R.$upd_cntr);
		}
	}

	protected Map_MST_WRK_R_Chk02_HdrR<MST_WRK_R,Chk02_HdrR> createMap_MST_WRK_R_Chk02_HdrR() {
		return new Map_MST_WRK_R_Chk02_HdrR<MST_WRK_R, Chk02_HdrR>();
	}

	public class Map_MST_WRK_R_Chk02_HdrR<D extends MST_WRK_R, S extends Chk02_HdrR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_WRK_R.$wrk_no, Chk02_HdrR.$wrk_no);
			addColumnPathMap(MST_WRK_R.$upd_cntr, Chk02_HdrR.$upd_cntr);
		}

		@Override
		public void valueCopy(D dest, S src) {
			dest.prj_no(MAC_STR.NULL_VAL.value());
		}
	}

	//FMCB CUSTOM END
}