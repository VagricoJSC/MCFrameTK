package mcframe.serverMSBE.MSBEL2610;

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
import mcframe.serverMSBE.MSBEL2610.*;	// このimportはFrameManagerの自動生成で追加されました。
import static mcframe.serverMSBE.MSBEL2610.Query.*;
import static mcframe.serverMAUC.MAUCL0140.MAUCL_DateUtil.*;
import static mcframe.serverMSUC.MSUCL0050.MSUCL_ClUtil.*;
import mcframe.serverMSBI.MSBIL5010.*;
import mcframe.serverMSBE.MSBEL5010.*;
import mcframe.serverMSBE.MSBEL6610.*;
import mcframe.commonCore.param.MCParam;
import mcframe.commonCore.lang.*;
import java.util.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverCore.mcjdbc.MCTransactionManager.dbTran;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBEL_StktkList"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBEL_StktkList_MC extends MSBEL_StktkList_MC_A{
	//FMCB CUSTOM START
	protected MCList<MST_STKTK_ACT_R> _torL;

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 入出庫制御の設定対象となる場所を検索します。<br>
	 */
	public class Srch01 extends MSBEL_StktkList_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setUpTmpCol(up0());

			executeQuery(down0(), MSBEL2610_MST_STKTK_S01(), up0());
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				editDownCmn(r);
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 入出庫制御の設定対象となる場所と品目を検索します。<br>
	 */
	public class Srch02 extends MSBEL_StktkList_MC_A.Srch02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setUpTmpCol(up0());

			executeQuery(down0(), MSBEL2610_MST_STKTK_S02(), up0());
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				editDownCmn(r);
			}
		}
	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 理論在庫の作成対象となる場所を検索します。<br>
	 */
	public class Srch03 extends MSBEL_StktkList_MC_A.Srch03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setUpTmpCol(up0());
			
			// 月次の場合（棚卸年月指定の場合）、制御対象日に月度の末日を設定する
			if (isNull(up0().ctrl_tgt_dt())) {
				up0().ctrl_tgt_dt(getYmEndDt(up0().stktk_ym()));
			}

			executeQuery(down0(), MSBEL2610_MST_STKTK_S03(), up0());
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				editDownCmn(r);
			}
		}
	}
	/**
	 * Srch04オペレーション.<p>
	 *
	 * 理論在庫の作成対象となる場所と品目を検索します。<br>
	 */
	public class Srch04 extends MSBEL_StktkList_MC_A.Srch04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setUpTmpCol(up0());

			executeQuery(down0(), MSBEL2610_MST_STKTK_S04(), up0());
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				editDownCmn(r);
			}
		}
	}
	/**
	 * Srch05オペレーション.<p>
	 *
	 * 在庫確定の対象となる棚卸制御管理情報を検索します。<br>
	 */
	public class Srch05 extends MSBEL_StktkList_MC_A.Srch05 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MCQueryPlan sql = MSBEL2610_MST_STKTK_S05();

			setUpTmpCol(up0());

			executeQuery(down0(), sql, up0());
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				editDownCmn(r);
			}
		}
	}
	/**
	 * Srch06オペレーション.<p>
	 *
	 * 入出庫制御の取消対象となる場所を検索します。<br>
	 */
	public class Srch06 extends MSBEL_StktkList_MC_A.Srch06 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setUpTmpCol(up0());

			// 場所のみ
			up0().addStringColumn("no_itm", toTrueStr(true));

			executeQuery(down0(), MSBEL2610_MST_STKTK_S06(), up0());
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				editDownCmn(r);
			}
		}
	}
	/**
	 * Srch07オペレーション.<p>
	 *
	 * 入出庫制御の取消対象となる場所と品目を検索します。<br>
	 */
	public class Srch07 extends MSBEL_StktkList_MC_A.Srch07 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			setUpTmpCol(up0());

			// 場所＋品目
			up0().addStringColumn("has_itm", toTrueStr(true));

			executeQuery(down0(), MSBEL2610_MST_STKTK_S06(), up0());
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				editDownCmn(r);
			}
		}
	}
	/**
	 * Srch08オペレーション.<p>
	 *
	 * 理論在庫の取消対象となる場所（月次）を検索します。<br>
	 */
	public class Srch08 extends MSBEL_StktkList_MC_A.Srch08 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MCQueryPlan sql = MSBEL2610_MST_STKTK_S05();

			setUpTmpCol(up0());

			// 場所のみ
			up0().addStringColumn("no_itm", toTrueStr(true));
			// 月次
			up0().addStringColumn("stktk_typ", MSC_STKTK_TYP.MONTHLY.value());

			executeQuery(down0(), sql, up0());
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				editDownCmn(r);
			}
		}
	}
	/**
	 * Srch09オペレーション.<p>
	 *
	 * 理論在庫の取消対象となる場所を検索します。<br>
	 */
	public class Srch09 extends MSBEL_StktkList_MC_A.Srch09 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MCQueryPlan sql = MSBEL2610_MST_STKTK_S05();

			setUpTmpCol(up0());

			// 場所のみ
			up0().addStringColumn("no_itm", toTrueStr(true));
			// 月次でない（循環）
			up0().addStringColumn("stktk_typ", MSC_STKTK_TYP.CYCLECNT.value());

			executeQuery(down0(), sql, up0());
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				editDownCmn(r);
			}
		}
	}
	/**
	 * Srch10オペレーション.<p>
	 *
	 * 理論在庫の取消対象となる場所と品目を検索します。<br>
	 */
	public class Srch10 extends MSBEL_StktkList_MC_A.Srch10 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			MCQueryPlan sql = MSBEL2610_MST_STKTK_S05();

			setUpTmpCol(up0());

			// 場所＋品目
			up0().addStringColumn("has_itm", toTrueStr(true));

			executeQuery(down0(), sql, up0());
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				editDownCmn(r);
			}
		}
	}
	/**
	 * Srch11オペレーション.<p>
	 *
	 * 在庫確定の取消対象となる棚卸制御管理情報を検索します。<br>
	 */
	public class Srch11 extends MSBEL_StktkList_MC_A.Srch11 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			MCQueryPlan sql = MSBEL2610_MST_STKTK_S11();

			setUpTmpCol(up0());

			executeQuery(down0(), sql, up0());
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				editDownCmn(r);
			}
		}
	}
	/**
	 * Srch12オペレーション.<p>
	 *
	 * 棚卸状況区分に従い、棚卸制御管理情報を検索します。<br>
	 */
	public class Srch12 extends MSBEL_StktkList_MC_A.Srch12 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();

			setUpTmpCol(up0());

			executeQuery(down0(), MSBEL2610_MST_STKTK_S12(), up0());
		}
		@Override
		protected void editListMain() {
			super.editListMain();
			for (Srch01_RsltR r : down0()) {
				editDownCmn(r);
			}
		}
	}
	
	/**
	 * 検索条件に対する一時カラムを設定する
	 * @param up
	 */
	protected void setUpTmpCol(Srch01_CndR up) {
		// 棚卸状況
		if (up.stktk_sts_wtg()) {
			up.addStringColumn("tmp_stktk_sts_wtg", MSC_STKTK_STS_TYP.STKTK_WTG.value());
		}
		if (up.stktk_sts_st()) {
			up.addStringColumn("tmp_stktk_sts_st", MSC_STKTK_STS_TYP.STKTK_ST.value());
		}
		if (up.stktk_sts_rfl()) {
			up.addStringColumn("tmp_stktk_sts_rfl", MSC_STKTK_STS_TYP.STKTK_DIFF_RFL_CMPL.value());
		}
		// 帳票出力
		up.addStringColumn("tmp_not_invlist", toTrueStr(up.not_invlist_flg()));
		up.addStringColumn("tmp_invlist", toTrueStr(up.invlist_flg()));
		up.addStringColumn("tmp_not_difflist", toTrueStr(up.not_difflist_flg()));
		up.addStringColumn("tmp_difflist", toTrueStr(up.difflist_flg()));
	}
	
	/**
	 * 下り電文の加工の共通処理
	 */
	protected void editDownCmn(Srch01_RsltR r) {
	}

	/**
	 * Chk01オペレーション.<p>
	 *
	 * 入出庫制御前に事前チェックを行います。<br>
	 */
	public class Chk01 extends MSBEL_StktkList_MC_A.Chk01 {
		@Override
		protected void call() {
			super.call();
		}
		@Override
		protected void doIt() {
			super.doIt();

			MCMessageList msgL = new MCMessageList();

			// 固有のチェック処理
			msgL.addAll(chk());

			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setErrToRtnStsTyp();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// ロック
			// 棚卸制御管理
			msgL.addAll(chkStktk());
			setErrFlg(msgL);

			return msgL;
		}
		
		/**
		 * 棚卸制御管理のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkStktk() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			
			return chkStktkCmn(notErrL);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			for (Chk01_DtlR r : notErrL) {
				// DACチェック
				msgL.addAll(checkWritableLocCdDac(r, Chk01_DtlR.$loc_cd));
			}
			return msgL;
		}

		/**
		 * 固有エラーチェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			MCDate cur_end = getAcYm(getToday());
			for (Chk01_DtlR r : notErrL) {
			// 指定の制御対象日あるいは棚卸年月ではまだ棚卸を実施できません。
				if (cur_end.lt(getAcYm(r.ctrl_tgt_dt()))) {
					msgL.add(new MCMessage(r, null, MSBEL0186, toDispGUIIndex(r)));
				}
			}

			// 締チェック、入出庫制御
			chkCl(notErrL, false);

			return(msgL);
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * Chk02オペレーション.<p>
	 *
	 * 理論在庫作成前に事前チェックを行います。<br>
	 */
	public class Chk02 extends MSBEL_StktkList_MC_A.Chk02 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCMessageList msgL = new MCMessageList();

			// 固有のチェック処理
			msgL.addAll(chk());

			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setErrToRtnStsTyp();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// ロック
			// 棚卸制御管理
			msgL.addAll(chkStktk());
			setErrFlg(msgL);

			// 前回棚卸日情報
			msgL.addAll(chkPreStktk());
			setErrFlg(msgL);

			return msgL;
		}
		
		/**
		 * 棚卸制御管理のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkStktk() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			
			return chkStktkCmn(notErrL);
		}

		/**
		 * 前回棚卸日情報のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkPreStktk() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			return chkPreStktkCmn(notErrL);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			for (Chk01_DtlR r : notErrL) {
				// DACチェック
				msgL.addAll(checkWritableLocCdDac(r, Chk01_DtlR.$loc_cd));
			}
			return msgL;
		}

		/**
		 * 固有エラーチェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			MCDate cur_end = getAcYm(getToday());
			for (Chk01_DtlR r : notErrL) {
			// 指定の制御対象日あるいは棚卸年月ではまだ棚卸を実施できません。
				if (cur_end.lt(getAcYm(r.ctrl_tgt_dt()))) {
					msgL.add(new MCMessage(r, null, MSBEL0186, toDispGUIIndex(r)));
				}
			// 指定の日付以降で棚卸を実施しているため、理論在庫を作成できません。
				if (r.ctrl_tgt_dt().lte(r.latest_stktk_st_dt())) {
					msgL.add(new MCMessage(r, null, MSBEL0103, toDispGUIIndex(r)));
				}
			
			// 以前に開始した棚卸がまだ終了していないため、理論在庫を作成できません。
				if (!isSame(r.latest_stktk_st_dt(), r.last_stktk_dt())) {
					msgL.add(new MCMessage(r, null, MSBEL0104, toDispGUIIndex(r)));
				}
				else if (MAC_STR.isNULL_VAL(r.itm_cd())) {
					MST_PRE_STKTK_R t = MST_PRE_STKTK_R.create("T");
					MCQueryApiBuilder stkPre_bldr = MCQueryApiBuilder.create(t);
					MCList<MST_PRE_STKTK_R> stkPreL = MCList.create(MST_PRE_STKTK_R.class);

					stkPre_bldr.setWhere(t.itm_cd.neq(value(MAC_STR.NULL_VAL.value())));
					stkPre_bldr.addWhereWithAnd(t.loc_cd.eq(bind("1")), r.loc_cd());
					stkPre_bldr.addWhereWithAnd((t.last_stktk_dt.isNull()
							.and(t.latest_stktk_st_dt.isNotNull()))
									.or(t.latest_stktk_st_dt.neq(t.last_stktk_dt)));
					dbSelect("MSBEL2610_MST_PRE_STKTK_S02", stkPreL, stkPre_bldr);

					if (!isNull(stkPreL)) {
						msgL.add(new MCMessage(r, null, MSBEL0104, toDispGUIIndex(r)));
					}
				}
			}
			// 締チェック
			chkCl(notErrL, true);

			// 品目マスタの存在チェック
			msgL.addAll(chkMamItm(notErrL));

			return(msgL);
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 在庫確定前に事前チェックを行います。<br>
	 */
	public class Chk03 extends MSBEL_StktkList_MC_A.Chk03 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCMessageList msgL = new MCMessageList();

			// 固有のチェック処理
			msgL.addAll(chk());

			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setErrToRtnStsTyp();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// ロック
			// 棚卸制御管理
			msgL.addAll(chkStktk());
			setErrFlg(msgL);

			// 前回棚卸日情報
			msgL.addAll(chkPreStktk());
			setErrFlg(msgL);

			return msgL;
		}
		
		/**
		 * 棚卸制御管理のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkStktk() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			
			return chkStktkCmn(notErrL);
		}

		/**
		 * 前回棚卸日情報のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkPreStktk() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			return chkPreStktkCmn(notErrL);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			for (Chk01_DtlR r : notErrL) {
				// DACチェック
				msgL.addAll(checkWritableLocCdDac(r, Chk01_DtlR.$loc_cd));
			}
			return msgL;
		}

		/**
		 * 固有エラーチェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			
			// 取引ＣＤの存在チェック
			msgL.addAll(chkTrdCd(notErrL));
			
			//品目ＣＤの存在チェック
			msgL.addAll(chkItmCd(notErrL));
			
			// 実棚入力完了チェック
			msgL.addAll(chkInputAct(notErrL));

			// 理論在庫更新チェック
			msgL.addAll(chkTorUpd(notErrL));

			return(msgL);
		}

		/**
		 * 取引ＣＤの存在チェック
		 */
		protected MCMessageList chkTrdCd(MCList<Chk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();
			if (isNull(getTrdCd())) {
				notErrL.forEach(r -> {
					msgL.add(new MCMessage(MSBEL0252,
						MAC_TRD_PTN_TYP.STK_ADJST.value(), toDispGUIIndex(r)));
				});
			}
			return msgL;
		}

		/**
		 * 品目ＣＤの存在チェック
		 */
		protected MCMessageList chkItmCd(MCList<Chk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();
			
			MCList<MST_STKTK_ACT_R> stkActL = MCList.create(MST_STKTK_ACT_R.class);
			MST_STKTK_ACT_R t = MST_STKTK_ACT_R.create("T");
			MAM_ITM_R m1 = MAM_ITM_R.create("M1");
			MAVM_ITM_UNIT_R m4 = MAVM_ITM_UNIT_R.create("M4");
			
			MCQueryApiBuilder l_bldr = MCQueryApiBuilder.create(t);
			l_bldr.setSelect(t.stktk_base_dt, t.loc_cd, t.itm_cd, t.itm_sub1, t.itm_sub2, t.itm_sub3);
			l_bldr.addSelect(t.trd_unit_cd);
			l_bldr.addSelect(m1.del_flg);
			l_bldr.addSelect("unit_del_flg", m4.del_flg);
			l_bldr.addLeftOuterJoin(m1,
					bracket(t.itm_cd.eq(m1.itm_cd)
							.and(t.itm_sub1.eq(m1.itm_sub1))
							.and(t.itm_sub2.eq(m1.itm_sub2))
							.and(t.itm_sub3.eq(m1.itm_sub3))));
			l_bldr.addLeftOuterJoin(m4,
					bracket(t.itm_cd.eq(m4.itm_cd)
							.and(t.itm_sub1.eq(m4.itm_sub1))
							.and(t.itm_sub2.eq(m4.itm_sub2))
							.and(t.itm_sub3.eq(m4.itm_sub3))
							.and(t.trd_unit_cd.eq(m4.unit_cd))));
			
			l_bldr.setWhere(t.stktk_base_dt.eq(bind("ctrl_tgt_dt")));
			l_bldr.addWhereWithAnd(t.loc_cd.eq(bind("loc_cd")));
			dbSelect("MSBEL2610_MST_STKTK_ACT_S06", stkActL, l_bldr, notErrL.groupBy(Chk01_DtlR.$ctrl_tgt_dt,Chk01_DtlR.$loc_cd));

			MCIndexKey idx_locitm = stkActL.createIndex(MST_STKTK_ACT_R.$itm_cd, MST_STKTK_ACT_R.$itm_sub1, MST_STKTK_ACT_R.$itm_sub2,
					MST_STKTK_ACT_R.$itm_sub3, MST_STKTK_ACT_R.$loc_cd, MST_STKTK_ACT_R.$stktk_base_dt);
			MCIndexKey idx_loc = stkActL.createIndex(MST_STKTK_ACT_R.$loc_cd, MST_STKTK_ACT_R.$stktk_base_dt);
			
			MCList<MST_STKTK_ACT_R> stkActChkL = MCList.create(MST_STKTK_ACT_R.class);
			
			//先に処理をした実棚情報の日付・場所で、すでに同じ品目が品目マスタエラーになっていた場合、重複して品目のメッセージを表示しない
			Map<List<String>, MST_STKTK_ACT_R> map = new HashMap<List<String>, MST_STKTK_ACT_R>();

			for (Chk01_DtlR chkR : notErrL) {
				if (!isNullOrNullVal(chkR.itm_cd())) {
					stkActChkL = stkActL.subList(idx_locitm, chkR.itm_cd(), chkR.itm_sub1(), chkR.itm_sub2(), chkR.itm_sub3(), chkR.loc_cd(), chkR.ctrl_tgt_dt());
				}
				else {
					stkActChkL = stkActL.subList(idx_loc, chkR.loc_cd(), chkR.ctrl_tgt_dt());
				}
				for (MST_STKTK_ACT_R r : stkActChkL) {

					List<String> keyList = new ArrayList<String>();
					keyList.add(r.itm_cd());
					keyList.add(r.itm_sub1());
					keyList.add(r.itm_sub2());
					keyList.add(r.itm_sub3());
					
					List<String> UnitkeyList = new ArrayList<String>();
					UnitkeyList.add(r.itm_cd());
					UnitkeyList.add(r.itm_sub1());
					UnitkeyList.add(r.itm_sub2());
					UnitkeyList.add(r.itm_sub3());
					UnitkeyList.add(r.trd_unit_cd());

					if (map.containsKey(keyList)) {
						chkR.err_flg(true);
					}
					else if (isNull(r.getString("del_flg"))) {
						msgL.add(new MCMessage(chkR, null, MAUAL0189, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), toDispGUIIndex(chkR)));
						map.put(keyList, r);
					}
					
					if (map.containsKey(UnitkeyList)) {
						chkR.err_flg(true);
					}
					else if (isNull(r.getString("unit_del_flg"))) {
						msgL.add(new MCMessage(chkR, null, MSBEL0351, toDispItm(r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3()), r.trd_unit_cd()));
						map.put(UnitkeyList, r);
					}
				}
			}
			return msgL;
		}

		/**
		 * 実棚入力完了チェック
		 */
		protected MCMessageList chkInputAct(MCList<Chk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();

			MCList<MST_STKTK_ACT_R> actL = MCList.create(MST_STKTK_ACT_R.class);
			MST_STKTK_ACT_R t = MST_STKTK_ACT_R.create("T");
			MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t);
			MAM_BP_R m10 = MAM_BP_R.create("M10");
			MAM_LOC_R m3 = MAM_LOC_R.create("M3");
			for (Chk01_DtlR r : notErrL) {
				actL.init();
				actL_bldr = MCQueryApiBuilder.create(t);
				actL_bldr.addLeftOuterJoin(m10, bracket(t.stk_arrv_bp_cd.eq(m10.bp_cd)));
				actL_bldr.addLeftOuterJoin(m3, bracket(t.loc_cd.eq(m3.loc_cd)));
				actL_bldr.addWhereWithAnd(t.loc_cd.eq(bind("1")), r.loc_cd());
				if (!isNullOrNullVal(r.itm_cd())) {
					actL_bldr.addWhereWithAnd(t.itm_cd.eq(bind("1")), r.itm_cd());
					actL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("1")), r.itm_sub1());
					actL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("1")), r.itm_sub2());
					actL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("1")), r.itm_sub3());
				}
				actL_bldr.addWhereWithAnd(t.stktk_base_dt.eq(bind("1")), r.ctrl_tgt_dt());
				actL_bldr.addWhereWithAnd(t.in_xfr_typ.eq(bind("1")), MSC_IN_XFR_TYP.IN_LOC.value());
				actL_bldr.addWhereWithAnd(
						t.stk_id_typ.notIn(bind("1"), bind("2"), bind("3"), bind("4"),
								bind("5"), bind("6")),
						MSC_STK_ID_TYP.RNT_RCV.value(),
						MSC_STK_ID_TYP.PURC_PRE_ACCPT.value(),
						MSC_STK_ID_TYP.RTN_PRE_ACCPT.value(),
						MSC_STK_ID_TYP.SLF_SUPPRT.value(), MSC_STK_ID_TYP.CSTSTK.value(),
						MSC_STK_ID_TYP.ACCPT_DFCT.value());
				actL_bldr.addWhereWithAnd(not(t.stk_arrv_bp_cd
						.neq(value(MAC_STR.NULL_VAL.value()))
						.and(t.fix_no_flg.eq(value(true)).or(
								t.fix_no_flg.eq(value(false)).and(m10.cnsgn_stktk_flg
										.eq(value(false)).and(m3.sppl_cd.isNull()))))));
				actL_bldr.addWhereWithAnd(t.act_input_flg.eq(value(false)));
				actL_bldr.addWhereWithAnd(
						bracket(t.tor_qty.isNull().or(t.tor_qty.gt(value(0)))));
				int i = dbSelect("MSBEL2610_MST_STKTK_ACT_S01", actL, actL_bldr);
				if (i > 0) {
					msgL.add(new MCMessage(r, null, MSBEL0105, toDispGUIIndex(r)));
				}
			}
			return(msgL);
		}

		/**
		 * 理論在庫更新チェック
		 */
		protected MCMessageList chkTorUpd(MCList<Chk01_DtlR> notErrL) {
			MCMessageList msgL = new MCMessageList();
			
			// 理論在庫チェック不要は除く
			MCList<Chk01_DtlR> chkL = notErrL.subList(Chk01_DtlR.$not_chk_tor_flg, false);

			// 現状の理論在庫を取得
			MCList<MST_STKTK_ACT_R> newTorL = getTorList(chkL);
			MCIndexKey idxkey = newTorL.createIndex(_loc_key);

			for (Chk01_DtlR r : chkL) {
				// 実棚情報を取得
				MCList<MST_STKTK_ACT_R> actL = MCList.create(MST_STKTK_ACT_R.class);
				MST_STKTK_ACT_R t = MST_STKTK_ACT_R.create("T");
				MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t);
				actL_bldr.addWhereWithAnd(t.loc_cd.eq(bind("1")), r.loc_cd());
				if (!isNullOrNullVal(r.itm_cd())) {
					actL_bldr.addWhereWithAnd(t.itm_cd.eq(bind("1")), r.itm_cd());
					actL_bldr.addWhereWithAnd(t.itm_sub1.eq(bind("1")), r.itm_sub1());
					actL_bldr.addWhereWithAnd(t.itm_sub2.eq(bind("1")), r.itm_sub2());
					actL_bldr.addWhereWithAnd(t.itm_sub3.eq(bind("1")), r.itm_sub3());
				}
				actL_bldr.addWhereWithAnd(t.stktk_base_dt.eq(bind("1")),
						r.ctrl_tgt_dt());
				actL_bldr.addWhereWithAnd(t.tor_qty.isNotNull());
				dbSelect("MSBEL2610_MST_STKTK_ACT_S02", actL, actL_bldr);

				// 現状の理論在庫から対象分を抽出する
				MCList<MST_STKTK_ACT_R> tgtTorL;
				if (isNullOrNullVal(r.itm_cd())) {
					tgtTorL = newTorL.subList(idxkey, r.loc_cd());
				}
				else {
					tgtTorL = newTorL.subList(idxkey, getVals(r, _loc_key));
				}
				tgtTorL.sort(_stktkact_key);
				MCIndexKey tgt_idxkey = tgtTorL.createIndex(_stktkact_key);

				boolean err = false;
				if (isSame(actL.size(), tgtTorL.size())) {
					for (MST_STKTK_ACT_R actR : actL) {
						MST_STKTK_ACT_R tgtR = tgtTorL.getFirst(tgt_idxkey, getVals(actR, _stktkact_key));
						if (!isNull(tgtR)) {
							if (!isSame(tgtR.tor_qty(), actR.tor_qty())) {
								// 理論在庫数量が異なればエラー
								err = true;
								break;
							}
						}
						else {
							// 理論在庫レコードが見つからなければエラー
							err = true;
							break;
						}
					}
				}
				else {
					// 要素数が異なればエラー
					err = true;
				}

				if (err) {
					msgL.add(new MCMessage(r, null, MSBEL0106, toDispGUIIndex(r)));	
				}
			}
			return(msgL);
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Chk04オペレーション.<p>
	 *
	 * 入出庫制御取消前に事前チェックを行います。<br>
	 */
	public class Chk04 extends MSBEL_StktkList_MC_A.Chk04 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCMessageList msgL = new MCMessageList();

			// 固有のチェック処理
			msgL.addAll(chk());

			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setErrToRtnStsTyp();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// ロック
			// 棚卸制御管理
			msgL.addAll(chkStktk());
			setErrFlg(msgL);

			return msgL;
		}
		
		/**
		 * 棚卸制御管理のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkStktk() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			
			return chkStktkCmn(notErrL);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			for (Chk01_DtlR r : notErrL) {
				// DACチェック
				msgL.addAll(checkWritableLocCdDac(r, Chk01_DtlR.$loc_cd));
			}
			return msgL;
		}

		/**
		 * 固有エラーチェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			// 締チェック
			chkCl(notErrL, true);

			return(msgL);
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Chk05オペレーション.<p>
	 *
	 * 理論在庫取消前に事前チェックを行います。<br>
	 */
	public class Chk05 extends MSBEL_StktkList_MC_A.Chk05 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCMessageList msgL = new MCMessageList();

			// 固有のチェック処理
			msgL.addAll(chk());

			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setErrToRtnStsTyp();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// ロック
			// 棚卸制御管理
			msgL.addAll(chkStktk());
			setErrFlg(msgL);

			// 前回棚卸日情報
			msgL.addAll(chkPreStktk());
			setErrFlg(msgL);

			return msgL;
		}
		
		/**
		 * 棚卸制御管理のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkStktk() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			
			return chkStktkCmn(notErrL);
		}

		/**
		 * 前回棚卸日情報のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkPreStktk() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			return chkPreStktkCmn(notErrL);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			for (Chk01_DtlR r : notErrL) {
				// DACチェック
				msgL.addAll(checkWritableLocCdDac(r, Chk01_DtlR.$loc_cd));
			}
			return msgL;
		}

		/**
		 * 固有エラーチェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
//			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			return(msgL);
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Chk06オペレーション.<p>
	 *
	 * 在庫確定取消前に事前チェックを行います。<br>
	 */
	public class Chk06 extends MSBEL_StktkList_MC_A.Chk06 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCMessageList msgL = new MCMessageList();

			// 固有のチェック処理
			msgL.addAll(chk());

			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setErrToRtnStsTyp();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// ロック
			// 棚卸制御管理
			msgL.addAll(chkStktk());
			setErrFlg(msgL);

			// 前回棚卸日情報
			msgL.addAll(chkPreStktk());
			setErrFlg(msgL);

			return msgL;
		}
		
		/**
		 * 棚卸制御管理のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkStktk() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			
			return chkStktkCmn(notErrL);
		}

		/**
		 * 前回棚卸日情報のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkPreStktk() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			return chkPreStktkCmn(notErrL);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			for (Chk01_DtlR r : notErrL) {
				// DACチェック
				msgL.addAll(checkWritableLocCdDac(r, Chk01_DtlR.$loc_cd));
			}
			return msgL;
		}

		/**
		 * 固有エラーチェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			// 締チェック
			chkCl(notErrL, true);

			return(msgL);
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}
	/**
	 * Chk07オペレーション.<p>
	 *
	 * 帳票発行前に事前チェックを行います。<br>
	 */
	public class Chk07 extends MSBEL_StktkList_MC_A.Chk07 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			super.doIt();

			MCMessageList msgL = new MCMessageList();

			// 固有のチェック処理
			msgL.addAll(chk());

			MCMessagePool.addAll(msgL);
			setErrFlg(msgL);
			setErrToRtnStsTyp();
			setDown();
		}
		
		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();

			// ロック
			// 棚卸制御管理
			msgL.addAll(chkStktk());
			setErrFlg(msgL);

			return msgL;
		}
		
		/**
		 * 棚卸制御管理のロック、更新カウンタチェック、値の補完
		 */
		protected MCMessageList chkStktk() {
			MCList<Chk01_DtlR> notErrL = getChkList(up0());
			
			return chkStktkCmn(notErrL);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			for (Chk01_DtlR r : notErrL) {
				// DACチェック
				msgL.addAll(checkWritableLocCdDac(r, Chk01_DtlR.$loc_cd));
			}
			return msgL;
		}

		/**
		 * 固有エラーチェック
		 */
		protected MCMessageList chk() {
			MCMessageList msgL = new MCMessageList();
			MCList<Chk01_DtlR> notErrL = getChkList(up0());

			for (Chk01_DtlR r : notErrL) {
			// 棚卸を開始していないため、出力できません。
				if (MSC_STKTK_STS_TYP.isSTKTK_WTG(r.stktk_sts_typ())) {
					msgL.add(new MCMessage(r, null, MSBEL0107, toDispGUIIndex(r)));					
				}
			}
			return(msgL);
		}
		
		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * 棚卸制御管理のロック、更新カウンタチェック（共通）
	 */
	protected MCMessageList chkStktkCmn(MCList<Chk01_DtlR> notErrL) {
		MCMessageList msgL = new MCMessageList();

		if (notErrL.isEmpty()) {
			return msgL;
		}
		
		// ロック
		final String[] stktk_key = new String[]{
				MST_STKTK_R.$loc_cd,
				MST_STKTK_R.$ctrl_tgt_dt,
				MST_STKTK_R.$itm_cd,
				MST_STKTK_R.$itm_sub1,
				MST_STKTK_R.$itm_sub2,
				MST_STKTK_R.$itm_sub3
				};

		MCList<MST_STKTK_R> bindL = MCList.create(MST_STKTK_R.class);
		addAll(bindL, notErrL, createMap_MST_STKTK_R_Chk01_DtlR());

		MCList<MST_STKTK_R> stktkL = MCList.create(MST_STKTK_R.class);
		dbSelectColumnForUpdateNoWait("MSBEL2610_MST_STKTK_S01", stktkL,
				MCQueryApiBuilder.create(MST_STKTK_R.create("T")), bindL, stktk_key);

		// 対応するレコードを取得
		MCIndexKey idxkey = stktkL.createIndex(stktk_key);
		for (Chk01_DtlR r : notErrL) {
			MST_STKTK_R selectR = stktkL.getFirst(idxkey, r.loc_cd(), r.ctrl_tgt_dt(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			if (!isNull(selectR)) {
				// 更新カウンタチェック
				MCMessageList msg = new MCMessageList();
				msg.addAll(checkUpdCntrNE(r, Chk01_DtlR.$stktk_upd_cntr, selectR));
				if (msg.isEmpty() && isNull(r.stktk_upd_cntr())) {
					msgL.add(msgExclusionErrUpd(r));
				}
				else {
					msgL.addAll(msg);
				}
			}
		}
		return msgL;
	}
	/**
	 * 前回棚卸日情報のロック、更新カウンタチェック（共通）
	 */
	protected MCMessageList chkPreStktkCmn(MCList<Chk01_DtlR> notErrL) {
		MCMessageList msgL = new MCMessageList();

		if (notErrL.isEmpty()) {
			return msgL;
		}
		
		// ロック
		final String[] prestktk_key = new String[]{
				MST_STKTK_R.$loc_cd,
				MST_STKTK_R.$itm_cd,
				MST_STKTK_R.$itm_sub1,
				MST_STKTK_R.$itm_sub2,
				MST_STKTK_R.$itm_sub3
				};

		MCList<MST_PRE_STKTK_R> prestktkL = MCList.create(MST_PRE_STKTK_R.class);
		dbSelectKeyForUpdateNoWait("MSBEL2610_MST_PRE_STKTK_S01", prestktkL,
				MCQueryApiBuilder.create(MST_PRE_STKTK_R.create("T")), notErrL);

		// 対応するレコードを取得
		MCIndexKey idxkey = prestktkL.createIndex(prestktk_key);
		for (Chk01_DtlR r : notErrL) {
			MST_PRE_STKTK_R selectR = prestktkL.getFirst(idxkey, r.loc_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			if (!isNull(selectR)) {
				// 更新カウンタチェック
				msgL.addAll(checkUpdCntrNE(r, Chk01_DtlR.$pre_stktk_upd_cntr, selectR));
			}
		}
		return msgL;
	}

	/**
	 * 在庫締チェック
	 */
	protected void chkCl(MCList<Chk01_DtlR> l, boolean io_lmt_skip_flg) {
		MSBIL_ClService.Cl_Chk03 o = MSBIL_ClService.crtCl_Chk03();
		addAll(o.up0(), l, createMap_Cl_Chk03_CndR_Chk01_DtlR());
		o.up0().setBooleanNE(Cl_Chk03_CndR.$io_lmt_skip_flg, io_lmt_skip_flg);
		o.exec();
		copyErrFlg(l, o.down0());
	}

	/**
	 * 理論在庫マイナスチェック
	 */
	protected MCMessageList chkMinusTorQty(MCList<Chk01_DtlR> notErrL) {
		MCMessageList msgL = new MCMessageList();
		_torL = getTorList(notErrL);
		
		for (Chk01_DtlR r : notErrL) {
			MCList<MST_STKTK_ACT_R> torL;
			if (isNullOrNullVal(r.itm_cd())) {
				torL = _torL.subList(MST_STKTK_ACT_R.$loc_cd, r.loc_cd());
			}
			else {
				torL = _torL.subList(_loc_key, getVals(r, _loc_key));
			}
			
			if (!isNull(torL) || !torL.isEmpty()) {
				for (MST_STKTK_ACT_R torR : torL) {
					if (torR.tor_qty().isNegative()) {
						msgL.add(new MCMessage(r, null, MSBEL0108, toDispGUIIndex(r)));
						break;
					}
				}
			}
		}
		return msgL;
	}

	/**
	 * 品目マスタの存在チェック<br>
	 * 理論在庫作成対象となった月次受払在庫、受払実績、保持されている実棚情報に対して、品目マスタの存在チェックを行う
	 */
	protected MCMessageList chkMamItm(MCList<Chk01_DtlR> upL) {
		MCMessageList msgL = new MCMessageList();
		
		MCList<Chk01_DtlR> itmNotNullL = MCList.create(Chk01_DtlR.class);
		MCList<Chk01_DtlR> itmNullL = MCList.create(Chk01_DtlR.class);
		for (Chk01_DtlR r : upL) {
			if (!isNullOrNullVal(r.itm_cd())) {
				itmNotNullL.add(r);
			}
			else {
				itmNullL.add(r);
			}
		}
		
		if(!itmNullL.isEmpty()) {
			msgL.addAll(chkMamItmByItmFlg(itmNullL, false));
		}
		if(!itmNotNullL.isEmpty()) {
			msgL.addAll(chkMamItmByItmFlg(itmNotNullL, true));
		}
		return msgL;
	}

	/**
	 * 品目の有り／無しで分割して品目マスタの存在チェックを行う<br>
	 * 理論在庫作成対象となった月次受払在庫、受払実績、保持されている実棚情報に対して、品目マスタの存在チェックを行う
	 */
	protected MCMessageList chkMamItmByItmFlg(MCList<Chk01_DtlR> upL, boolean stktk_itm_spc_flg) {
		MCMessageList msgL = new MCMessageList();
		
		/*** 最新の在庫締月を取得 ***/
		MCDate cl_ym = getStkClYm();
		// 締月の末日
		MCDate cl_end_dt = getYmEndDt(cl_ym);
		
		// ワークテーブルを作成
		insertMSW_STKTK_ACT_KEY(upL, stktk_itm_spc_flg);
		
		MCList<MST_STKTK_ACT_R> tstkAllL = MCList.create(MST_STKTK_ACT_R.class);
		MST_MLY_STK_DTL_R bind = MST_MLY_STK_DTL_R.create();
		bind.ac_ym(cl_ym);
		bind.addDateColumn("cl_end_dt", cl_end_dt);
		bind.addBooleanColumn("stktk_itm_spc_flg", stktk_itm_spc_flg);
		executeQuery(tstkAllL, MSBEL2610_MST_MLY_STK_DTL_S02(), bind);
		
		// 保持していた実棚情報を取得
		MCList<MST_STKTK_ACT_R> actL = MCList.create(MST_STKTK_ACT_R.class);
		MST_STKTK_ACT_R t = MST_STKTK_ACT_R.create("T");
		MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t);
		MAM_BP_R m10 = MAM_BP_R.create("M10");
		MAM_LOC_R m3 = MAM_LOC_R.create("M3");
		MAM_ITM_R m1 = MAM_ITM_R.create("M1");
		MSW_STKTK_ACT_KEY_R w1 = MSW_STKTK_ACT_KEY_R.create("W1");
		
		actL_bldr.addSelect(m10.cnsgn_stktk_flg, m3.sppl_cd);
		actL_bldr.addLeftOuterJoin(m10, bracket(t.stk_arrv_bp_cd.eq(m10.bp_cd)));
		actL_bldr.addLeftOuterJoin(m3, bracket(t.loc_cd.eq(m3.loc_cd)));
		actL_bldr.addLeftOuterJoin(m1,
			bracket(t.itm_cd.eq(m1.itm_cd)
				.and(t.itm_sub1.eq(m1.itm_sub1))
				.and(t.itm_sub2.eq(m1.itm_sub2))
				.and(t.itm_sub3.eq(m1.itm_sub3))));
		if (stktk_itm_spc_flg) {
			actL_bldr.addInnerJoin(w1,
				bracket(t.loc_cd.eq(w1.loc_cd))
					.and(t.stktk_base_dt.eq(w1.stktk_base_dt))
					.and(w1.keep_data_flg.eq(value(true)))
					.and(t.itm_cd.eq(w1.itm_cd))
					.and(t.itm_sub1.eq(w1.itm_sub1))
					.and(t.itm_sub2.eq(w1.itm_sub2))
					.and(t.itm_sub3.eq(w1.itm_sub3)));
		}
		else {
			actL_bldr.addInnerJoin(w1,
				bracket(t.loc_cd.eq(w1.loc_cd))
					.and(t.stktk_base_dt.eq(w1.stktk_base_dt))
					.and(w1.keep_data_flg.eq(value(true))));
		}
		actL_bldr.addWhereWithAnd(t.keep_data_flg.eq(value(true)));
		actL_bldr.addWhereWithAnd(m1.itm_cd.isNull());
		dbSelect("MSBEL2610_MST_STKTK_ACT_S07", actL, actL_bldr);
		
		// 理論在庫から対象分を抽出する
		for (MST_STKTK_ACT_R actR : actL) {
			// 積送品等は何もしない
			if (isRflTgt(actR)) {
				// リストに追加	
				tstkAllL.add(actR);
			}
		}
		
		if (!tstkAllL.isEmpty()) {
			MCIndexKey tstkLocItmIdx = null;
			MCIndexKey tstkLocIdx = null;
			if(stktk_itm_spc_flg) {
				tstkLocItmIdx = tstkAllL.createIndex(MST_STKTK_ACT_R.$loc_cd, MST_STKTK_ACT_R.$itm_cd, MST_STKTK_ACT_R.$itm_sub1, MST_STKTK_ACT_R.$itm_sub2, MST_STKTK_ACT_R.$itm_sub3);
			}
			else {
				tstkLocIdx = tstkAllL.createIndex(MST_STKTK_ACT_R.$loc_cd);
			}
			
			for (Chk01_DtlR r : upL) {
				MCList<MST_STKTK_ACT_R> tstkL = MCList.create(MST_STKTK_ACT_R.class);
				if (stktk_itm_spc_flg) {
					tstkL = tstkAllL.subList(tstkLocItmIdx, r.loc_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
				}
				else {
					tstkL = tstkAllL.subList(tstkLocIdx, r.loc_cd());
				}
				
				for (MST_STKTK_ACT_R tstkR : tstkL.groupBy(MST_STKTK_ACT_R.$itm_cd, MST_STKTK_ACT_R.$itm_sub1, MST_STKTK_ACT_R.$itm_sub2, MST_STKTK_ACT_R.$itm_sub3)) {
					msgL.add(new MCMessage(r, null, MAUAL0189, toDispItm(tstkR.itm_cd(), tstkR.itm_sub1(), tstkR.itm_sub2(), tstkR.itm_sub3()), toDispGUIIndex(r)));
				}
			}
		}
		return msgL;
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 入出庫制御を設定します。<br>
	 */
	public class Upd01 extends MSBEL_StktkList_MC_A.Upd01 {
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
			MCList<Chk01_DtlR> notErrL = up0().subList(Chk01_DtlR.$err_flg, false);
			if (notErrL.size() != 0) { 
				// 入出庫制御ＦＬＧ更新
				updIoCtrl(notErrL, true);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_DtlR.$peg_no, up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk01() {
			MSBEL_StktkList.Chk01 ope = MSBEL_StktkList.crtChk01();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
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
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 現在の実棚情報や受払実績をもとに、現状の理論在庫を作成します。<br>
	 */
	public class Upd02 extends MSBEL_StktkList_MC_A.Upd02 {
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
			_torL = MCList.create(MST_STKTK_ACT_R.class);

			editUp();
			
			callThisChk02();
			MCList<Chk01_DtlR> notErrL = up0().subList(Chk01_DtlR.$err_flg, false);
			if (notErrL.size() != 0) { 
				delStktk(notErrL);
				// 理論在庫作成
				updStktk_crtTor(notErrL, up1().add_io_ctrl_flg());
				createTor(notErrL);
				updPreStktk_crtTor(notErrL);

				// 棚卸表印刷
				if (up1().prnt_flg()) {
					notErrL.addBooleanColumn("invlist", true);
					notErrL.addBooleanColumn("difflist", false);
					printStktkList(notErrL);
				}
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_DtlR.$peg_no, up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk02() {
			MSBEL_StktkList.Chk02 ope = MSBEL_StktkList.crtChk02();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
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
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));  
				up0L.setAll(l);
				setUpRowParam(1, (MCRow)ope.up(1), up1());
				opeL.add(ope);
			}
			return opeL;
		}
		/**
		 * 理論在庫を作成する前に不要なデータを削除する
		 */
		protected void delStktk(MCList<Chk01_DtlR> upL) {
			if (upL.isEmpty()) {
				return;
			}

			MCList<MST_STKTK_R> delL = MCList.create(MST_STKTK_R.class);
			MCList<MST_STKTK_R> delL2 = MCList.create(MST_STKTK_R.class);
			
			for (Chk01_DtlR r : upL) {
				MST_STKTK_R tmpR = MST_STKTK_R.create();
				tmpR.loc_cd(r.loc_cd());
				tmpR.ctrl_tgt_dt(r.ctrl_tgt_dt());
				// 場所
				if (isNullOrNullVal(r.itm_cd())) {
					delL2.add(tmpR);
				}
				// 場所品目
				else {
					delL.add(tmpR);
				}
			}
			// 場所品目のときは場所の情報を削除する
			if (!delL.isEmpty()) {
				
				execDbWkDelete("MSBEL2610_MSW_STKTK_KEY_D01", MSW_STKTK_KEY_R.create());
				
				dbWkInsert("MSBEL2610_MSW_STKTK_I01", delL,
						MCQueryApiBuilder.create(MST_STKTK_R.create("T")).getBaseDbc());
				
				MST_STKTK_R S0T = MST_STKTK_R.create("T");
				MSW_STKTK_KEY_R S1W = MSW_STKTK_KEY_R.create("W");
				MCDelete q2 = sql("MSBEL2610_MST_STKTK_D01").delete(S0T)
						.where(value(0).eq(value(0))
								.and(exists(subQuery().select(value("X")).from(S1W)
										.where(value(0).eq(value(0))
												.and(S1W.ctrl_tgt_dt.eq(S0T.ctrl_tgt_dt))
												.and(S1W.loc_cd.eq(S0T.loc_cd)))))
								.and(S0T.itm_cd.eq(value(MAC_STR.NULL_VAL.value()))));
				q2.executeUpdate();
				
				MST_STKTK_ACT_R S0T1 = MST_STKTK_ACT_R.create("T");
				MSW_STKTK_KEY_R S1W1 = MSW_STKTK_KEY_R.create("W");
				MCDelete q3 = sql("MSBEL2610_MST_STKTK_ACT_D01").delete(S0T1)
						.where(value(0).eq(value(0))
						.and(exists(subQuery().select(value("X")).from(S1W1)
								.where(value(0).eq(value(0))
										.and(S1W1.ctrl_tgt_dt.eq(S0T1.stktk_base_dt))
										.and(S1W1.loc_cd.eq(S0T1.loc_cd)))))
						.and(S0T1.stktk_itm_spc_flg.eq(value(false))));
				q3.executeUpdate();
			}
			// 場所のときは場所品目の情報を削除する
			if (!delL2.isEmpty()) {
				execDbWkDelete("MSBEL2610_MSW_STKTK_KEY_D02", MSW_STKTK_KEY_R.create());

				dbWkInsert("MSBEL2610_MSW_STKTK_I02", delL2,
						MCQueryApiBuilder.create(MST_STKTK_R.create("T")).getBaseDbc());
				
				MST_STKTK_R S0T = MST_STKTK_R.create("T");
				MSW_STKTK_KEY_R S1W = MSW_STKTK_KEY_R.create("W");
				MCDelete q2 = sql("MSBEL2610_MST_STKTK_D02").delete(S0T)
						.where(value(0).eq(value(0))
								.and(exists(subQuery().select(value("X")).from(S1W)
										.where(value(0).eq(value(0))
												.and(S1W.ctrl_tgt_dt.eq(S0T.ctrl_tgt_dt))
												.and(S1W.loc_cd.eq(S0T.loc_cd)))))
								.and(S0T.itm_cd.neq(value(MAC_STR.NULL_VAL.value()))));
				q2.executeUpdate();
				
				MST_STKTK_ACT_R S0T1 = MST_STKTK_ACT_R.create("T");
				MSW_STKTK_KEY_R S1W1 = MSW_STKTK_KEY_R.create("W");
				MCDelete q3 = sql("MSBEL2610_MST_STKTK_ACT_D02").delete(S0T1)
						.where(value(0).eq(value(0))
						.and(exists(subQuery().select(value("X")).from(S1W1)
								.where(value(0).eq(value(0))
										.and(S1W1.ctrl_tgt_dt.eq(S0T1.stktk_base_dt))
										.and(S1W1.loc_cd.eq(S0T1.loc_cd)))))
						.and(S0T1.stktk_itm_spc_flg.eq(value(true))));
				q3.executeUpdate();
			}
		}
	}
	/**
	 * Upd03オペレーション.<p>
	 *
	 * 実棚情報を元に、現状在庫へ反映します。<br>
	 */
	public class Upd03 extends MSBEL_StktkList_MC_A.Upd03 {
		protected String _trd_cd;
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
			preProc();
			editUp();
			
			callThisChk03();
			MCList<Chk01_DtlR> notErrL = up0().subList(Chk01_DtlR.$err_flg, false);
			if (notErrL.size() != 0) { 
				// 在庫確定
				updStktk_fix(notErrL);
				updStk(notErrL);
				updPreStktk_fix(notErrL);
			}
		}

		/**
		 * 前処理
		 */
		protected void preProc() {
			_trd_cd = getTrdCd();
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_DtlR.$peg_no, up0());
		}
		
		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk03() {
			MSBEL_StktkList.Chk03 ope = MSBEL_StktkList.crtChk03();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 棚卸制御更新（在庫確定）
		 */
		protected void updStktk_fix(MCList<Chk01_DtlR> upL) {
			MCList<MST_STKTK_R> updL = MCList.create(MST_STKTK_R.class);
			
			for (Chk01_DtlR r : upL) {
				MST_STKTK_R tmpR = MST_STKTK_R.create();
				copy(tmpR, r, createMap_MST_STKTK_R_Chk01_DtlR());
				tmpR.io_ctrl_flg(true);
				tmpR.stktk_sts_typ(MSC_STKTK_STS_TYP.STKTK_DIFF_RFL_CMPL.value());
				tmpR.diff_upd_tm(MCDate.now());
				updL.add(tmpR);
			}

			if (!updL.isEmpty()) {
				MST_STKTK_R t = MST_STKTK_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				updL_bldr.setSet(t.io_ctrl_flg,
						t.stktk_sts_typ,
						t.diff_upd_tm,
						t.act_dpt_cd,
						t.act_usr_cd,
						t.stktk_rpt_rmrks,
						t.intr_rmrks,
						t.sub_char1,
						t.sub_char2,
						t.sub_char3);
				dbUpdateKey("MSBEL2610_MST_STKTK_U01", updL, updL_bldr);
			}
		}
		/**
		 * 在庫を確定する。
		 */
		protected void updStk(MCList<Chk01_DtlR> upL) {
			MCList<IoAct_Ins01_DtlR> ioL = MCList.create(IoAct_Ins01_DtlR.class);
			MCList<MST_STKTK_ACT_R> updL = MCList.create(MST_STKTK_ACT_R.class);

			for (Chk01_DtlR r : upL) {
				// 実棚情報を取得
				MAM_ITM_R m1 = MAM_ITM_R.create("M1");
				MAM_SUNDRY_ITM_R m2 = MAM_SUNDRY_ITM_R.create("M2");
				MAM_LOC_R m3 = MAM_LOC_R.create("M3");
				MAVM_ITM_UNIT_R m4 = MAVM_ITM_UNIT_R.create("M4");

				MCList<MST_STKTK_ACT_R> actL = MCList.create(MST_STKTK_ACT_R.class);
				MST_STKTK_ACT_R t1 = MST_STKTK_ACT_R.create("T");
				MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t1);
				actL_bldr.addSelect(m1.itm_nm, m1.sundry_itm_flg,
						m2.itm_nm.as("sundry_itm_nm"));
				actL_bldr.addSelect(m1.sno1_mng_typ, m1.sno2_mng_typ,
						m1.sno3_mng_typ, m1.sno4_mng_typ);
				actL_bldr.addSelect(m1.unit_cd, m1.dec_place, m1.rnd_typ);
				actL_bldr.addSelect(m3.sppl_cd);
				actL_bldr.addSelect(m4.conv_base_qty, m4.conv_qty, m4.pack_flg);
				actL_bldr.addLeftOuterJoin(m1,
						bracket(t1.itm_cd.eq(m1.itm_cd)
								.and(t1.itm_sub1.eq(m1.itm_sub1))
								.and(t1.itm_sub2.eq(m1.itm_sub2))
								.and(t1.itm_sub3.eq(m1.itm_sub3))));
				actL_bldr.addLeftOuterJoin(m2,
						bracket(t1.itm_cd.eq(m2.itm_cd)
								.and(t1.itm_sub1.eq(m2.itm_sub1))
								.and(t1.itm_sub2.eq(m2.itm_sub2))
								.and(t1.itm_sub3.eq(m2.itm_sub3))
								.and(t1.sno1.eq(m2.sno1))
								.and(t1.sno2.eq(m2.sno2))
								.and(t1.sno3.eq(m2.sno3))
								.and(t1.sno4.eq(m2.sno4))));
				actL_bldr.addLeftOuterJoin(m3, bracket(t1.loc_cd.eq(m3.loc_cd)));
				actL_bldr.addLeftOuterJoin(m4,
						bracket(t1.itm_cd.eq(m4.itm_cd)
								.and(t1.itm_sub1.eq(m4.itm_sub1))
								.and(t1.itm_sub2.eq(m4.itm_sub2))
								.and(t1.itm_sub3.eq(m4.itm_sub3))
								.and(t1.trd_unit_cd.eq(m4.unit_cd))));
				actL_bldr.addWhereWithAnd(t1.loc_cd.eq(bind("1")), r.loc_cd());
				if (!isNullOrNullVal(r.itm_cd())) {
					actL_bldr.addWhereWithAnd(t1.itm_cd.eq(bind("1")), r.itm_cd());
					actL_bldr.addWhereWithAnd(t1.itm_sub1.eq(bind("1")), r.itm_sub1());
					actL_bldr.addWhereWithAnd(t1.itm_sub2.eq(bind("1")), r.itm_sub2());
					actL_bldr.addWhereWithAnd(t1.itm_sub3.eq(bind("1")), r.itm_sub3());
				}
				actL_bldr.addWhereWithAnd(t1.stktk_base_dt.eq(bind("1")), r.ctrl_tgt_dt());
				actL_bldr.addWhereWithAnd(t1.act_diff_qty.neq(value(0)));
				dbSelect("MSBEL2610_MST_STKTK_ACT_S03", actL, actL_bldr);

				// 実棚情報から受払実績サービスの電文を作成する
				doSeqCache(MSC_NUM_SYS_TYP.STKTKACT, actL.size());
				for (MST_STKTK_ACT_R actR : actL) {
					IoAct_Ins01_DtlR ioR = IoAct_Ins01_DtlR.create();
					setIoAct(ioR, actR, r);
					ioL.add(ioR);
				}
				updL.addAll(actL);
			}
			// 受払実績更新
			MSBEL_IoActService.IoAct_Ins01 o1 = MSBEL_IoActService.crtIoAct_Ins01();
			o1.up0().addAll(ioL);
			o1.exec();
			MSBEL_IoActService.IoAct_Upd01 o2 = MSBEL_IoActService.crtIoAct_Upd01();
			o2.exec();

			// 実棚情報更新
			MST_STKTK_ACT_R t2 = MST_STKTK_ACT_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t2);
			updL_bldr.setSet(t2.stktk_act_no);
			dbUpdateKey("MSBEL2610_MST_STKTK_ACT_U01", updL, updL_bldr);
		}
		/**
		 * 受払実績サービスの電文を作成する
		 */
		protected void setIoAct(IoAct_Ins01_DtlR dest, MST_STKTK_ACT_R src, Chk01_DtlR stktkR) {
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dest.ac_dt(src.stktk_base_dt());
			dest.act_tm(src.stktk_base_dt());
			dest.trd_cd(_trd_cd);
			dest.trd_ptn_typ(MAC_TRD_PTN_TYP.STK_ADJST.value());
			dest.trn_typ(MSC_TRN_TYP.STK_ADJST.value());
			if (src.act_diff_qty().isNegative()) {
				dest.gi_wg_cd(src.wg_cd());
				dest.gi_loc_cd(src.loc_cd());
				dest.gi_str_ln_cd(src.str_ln_cd());
				dest.gi_gd_cd(src.gd_cd());
				dest.io_typ(MSC_IO_TYP.GI.value());
			}
			else {
				dest.gr_wg_cd(src.wg_cd());
				dest.gr_loc_cd(src.loc_cd());
				dest.gr_str_ln_cd(src.str_ln_cd());
				dest.gr_gd_cd(src.gd_cd());
				dest.io_typ(MSC_IO_TYP.GR.value());
			}
			dest.act_usr_cd(stktkR.act_usr_cd());
			dest.act_dpt_cd(stktkR.act_dpt_cd());
			dest.itm_cd(src.itm_cd());
			dest.itm_sub1(src.itm_sub1());
			dest.itm_sub2(src.itm_sub2());
			dest.itm_sub3(src.itm_sub3());
			if (isSame(src.getStringNE("sundry_itm_flg"), toTrueStr(true))) {
				dest.itm_nm(src.getStringNE("sundry_itm_nm"));
			}
			else {
				dest.itm_nm(src.getStringNE("itm_nm"));
			}
			dest.stk_mng_typ(MAC_STK_MNG_TYP.MNG.value());
			dest.sundry_itm_flg(isSame(src.getStringNE("sundry_itm_flg"), toTrueStr(true)));
			dest.stk_arrv_bp_cd(src.stk_arrv_bp_cd());
			dest.lot_no(src.lot_no());
			dest.sublot_no(src.sublot_no());
			dest.sno1(src.sno1());
			dest.sno2(src.sno2());
			dest.sno3(src.sno3());
			dest.sno4(src.sno4());
			dest.sno1_mng_typ(src.getStringNE("sno1_mng_typ"));
			dest.sno2_mng_typ(src.getStringNE("sno2_mng_typ"));
			dest.sno3_mng_typ(src.getStringNE("sno3_mng_typ"));
			dest.sno4_mng_typ(src.getStringNE("sno4_mng_typ"));
			dest.in_xfr_typ(src.in_xfr_typ());
			dest.quality_typ(src.quality_typ());
			dest.stk_insp_typ(src.stk_insp_typ());
			dest.stk_id_typ(src.stk_id_typ());
			dest.stk_bp_cd(src.stk_bp_cd());
			if (isSame(src.getStringNE("pack_flg"), toTrueStr(true))) {
				dest.trd_unit_qty(src.act_diff_qty().abs());
				dest.trd_unit_cd(src.trd_unit_cd());
				dest.pack_unit_qty(src.act_diff_qty().abs());
				dest.pack_unit_cd(src.trd_unit_cd());
			}
			else {
				dest.trd_unit_qty(convToBaseUnit(src.act_diff_qty().abs(),
						src.getNumberNE("conv_base_qty"), src.getNumberNE("conv_qty"),
						src.getNumberNE("dec_place"), src.getStringNE("rnd_typ")));
				dest.trd_unit_cd(src.getStringNE("unit_cd"));
				dest.pack_unit_qty(convToBaseUnit(src.act_diff_qty().abs(),
						src.getNumberNE("conv_base_qty"), src.getNumberNE("conv_qty"),
						src.getNumberNE("dec_place"), src.getStringNE("rnd_typ")));
				dest.pack_unit_cd(src.getStringNE("unit_cd"));
			}
			dest.base_unit_qty(convToBaseUnit(src.act_diff_qty().abs(),
					src.getNumberNE("conv_base_qty"), src.getNumberNE("conv_qty"),
					src.getNumberNE("dec_place"), src.getStringNE("rnd_typ")));
			dest.base_unit_cd(src.getStringNE("unit_cd"));
			if (!MAC_STR.isNULL_VAL(src.stk_arrv_bp_cd())) {
				if (isNull(src.getStringNE("sppl_cd"))) {
					dest.dlv_cd(src.stk_arrv_bp_cd());
				}
				else {
					dest.sppl_cd(src.stk_arrv_bp_cd());
				}
			}

			// 棚卸実績ＮＯを発番し、セット
			String act_no = getStrSeq(MSC_NUM_SYS_TYP.STKTKACT);
			dest.act_no(act_no);
			src.stktk_act_no(act_no);
		}

		/**
		 * 前回棚卸日情報更新（在庫確定）
		 */
		protected void updPreStktk_fix(MCList<Chk01_DtlR> upL) {
			MCList<MST_PRE_STKTK_R> updL = MCList.create(MST_PRE_STKTK_R.class);

			for (Chk01_DtlR r : upL) {
				MST_PRE_STKTK_R tmpR = MST_PRE_STKTK_R.create();
				copy(tmpR, r, createMap_MST_PRE_STKTK_R_Chk01_DtlR());

				tmpR.last_stktk_dt(r.ctrl_tgt_dt());

				updL.add(tmpR);
			}

			if (!updL.isEmpty()) {
				MST_PRE_STKTK_R t = MST_PRE_STKTK_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				updL_bldr.setSet(t.last_stktk_dt);
				dbUpdateKey("MSBEL2610_MST_PRE_STKTK_U01", updL, updL_bldr);
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
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
	}
	/**
	 * Upd04オペレーション.<p>
	 *
	 * 理論在庫を再作成します。<br>
	 */
	public class Upd04 extends MSBEL_StktkList_MC_A.Upd04 {
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
			_torL = MCList.create(MST_STKTK_ACT_R.class);

			editUp();
			
			callThisChk05();
			MCList<Chk01_DtlR> notErrL = up0().subList(Chk01_DtlR.$err_flg, false);
			if (notErrL.size() != 0) { 
				// 理論在庫取消
				updStktk_canTor(notErrL, true);
				cancelTor(notErrL, true);
				updPreStktk_canTor(notErrL);
				
				notErrL.setBoolean(Chk01_DtlR.$act_qty_keep_flg, true);

				// 理論在庫作成
				updStktk_crtTor(notErrL, true);
				createTor(notErrL);
				updPreStktk_crtTor(notErrL);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_DtlR.$peg_no, up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk05() {
			MSBEL_StktkList.Chk05 ope = MSBEL_StktkList.crtChk05();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
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

		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();

			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
	}

	/**
	 * 棚卸制御更新（理論在庫作成）
	 */
	protected void updStktk_crtTor(MCList<Chk01_DtlR> upL, boolean io_ctrl_flg) {
		MCList<MST_STKTK_R> insL = MCList.create(MST_STKTK_R.class);
		MCList<MST_STKTK_R> updL = MCList.create(MST_STKTK_R.class);
		
		for (Chk01_DtlR r : upL) {
			MST_STKTK_R tmpR = MST_STKTK_R.create();
			copy(tmpR, r, createMap_MST_STKTK_R_Chk01_DtlR());
			tmpR.io_ctrl_flg(io_ctrl_flg);
			tmpR.stktk_sts_typ(MSC_STKTK_STS_TYP.STKTK_ST.value());
			tmpR.act_qty_keep_flg(false);
			tmpR.stktk_st_tm(MCDate.now());

			if (isNull(r.stktk_upd_cntr())) {
				insL.add(tmpR);
			}
			else {
				updL.add(tmpR);
			}
		}

		if (!insL.isEmpty()) {
			dbInsertEx("MSBEL2610_MST_STKTK_I01", insL,
					MCQueryApiBuilder.create(MST_STKTK_R.create("T")));
		}
		if (!updL.isEmpty()) {
			MST_STKTK_R updL_t = MST_STKTK_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(updL_t);
			updL_bldr.setSet(updL_t.io_ctrl_flg,
					updL_t.stktk_typ, updL_t.stktk_sts_typ,
					updL_t.stktk_st_tm, updL_t.act_qty_keep_flg,
					updL_t.act_dpt_cd, updL_t.act_usr_cd,
					updL_t.stktk_rpt_rmrks, updL_t.intr_rmrks,
					updL_t.sub_char1, updL_t.sub_char2, updL_t.sub_char3);
			updL_bldr.setWhere(updL_t.ctrl_tgt_dt.eq(bindEx("ctrl_tgt_dt")));
			updL_bldr.addWhereWithAnd(updL_t.loc_cd.eq(bindEx("loc_cd")));
			updL_bldr.addWhereWithAnd(updL_t.itm_cd.eq(bindEx("itm_cd")));
			updL_bldr.addWhereWithAnd(updL_t.itm_sub1.eq(bindEx("itm_sub1")));
			updL_bldr.addWhereWithAnd(updL_t.itm_sub2.eq(bindEx("itm_sub2")));
			updL_bldr.addWhereWithAnd(updL_t.itm_sub3.eq(bindEx("itm_sub3")));
			dbUpdate("MSBEL2610_MST_STKTK_U02", updL, updL_bldr);
		}
	}
	
	/**
	 * 理論在庫を作成する。<br>
	 * 保持データがある場合は使用する
	 */
	protected void createTor(MCList<Chk01_DtlR> upL) {
		MCList<MST_STKTK_ACT_R> insL = MCList.create(MST_STKTK_ACT_R.class);
		MCList<MST_STKTK_ACT_R> torL = getTorList(upL);	// エラーあるかもしれないので取り直し
		MCIndexKey idxkey = torL.createIndex(_stktkact_key);

		// 保持していた実棚情報を取得
		MCList<MST_STKTK_ACT_R> actL = getActList(upL);
		
		// 理論在庫から対象分を抽出する
		for (MST_STKTK_ACT_R actR : actL) {
			// 積送品等は何もしない
			if (isRflTgt(actR)) {
				MST_STKTK_ACT_R tgtR = torL.getFirst(idxkey, getVals(actR, _stktkact_key));
				if (!isNull(tgtR)) {
					// 反映先が見つかった場合
					if (actR.use_diff_flg()) {
						// 差異数量使用する場合
						tgtR.act_diff_qty(actR.act_diff_qty());
						tgtR.trd_unit_qty(tgtR.tor_qty().add(actR.act_diff_qty()));
					}
					else {
						// 実棚数量使用する場合
						tgtR.trd_unit_qty(actR.trd_unit_qty());
						tgtR.act_diff_qty(actR.trd_unit_qty().subtract(tgtR.tor_qty()));
					}
					tgtR.use_diff_flg(actR.use_diff_flg());
					tgtR.act_input_flg(actR.act_input_flg());
					tgtR.stktk_act_rmrks(actR.stktk_act_rmrks());
					tgtR.intr_rmrks(actR.intr_rmrks());
					tgtR.sub_char1(actR.sub_char1());
					tgtR.sub_char2(actR.sub_char2());
					tgtR.sub_char3(actR.sub_char3());
				}
				else {
					// 見つからない場合は追加
					MST_STKTK_ACT_R insR = actR.clone();
					insR.keep_data_flg(false);
					insR.tor_qty(null);
					if (insR.use_diff_flg()) {
						// 差異数量使用する場合
						insR.trd_unit_qty(insR.act_diff_qty());
					}
					else {
						// 実棚数量使用する場合
						insR.act_diff_qty(insR.trd_unit_qty());
					}
					// 追加リスト
					insL.add(insR);
				}
			}
		}
		// 理論在庫登録
		if (!insL.isEmpty()) {
			torL.addAll(insL);
		}
		if (!torL.isEmpty()) {
			dbInsertEx("MSBEL2610_MST_STKTK_ACT_I01", torL,
					MCQueryApiBuilder.create(MST_STKTK_ACT_R.create("T")));
		}
		
		// 保持データ削除
		if (!actL.isEmpty()) {
			dbDeleteKey("MSBEL2610_MST_STKTK_ACT_D03", actL,
					MCQueryApiBuilder.create(MST_STKTK_ACT_R.create("T")));
		}
	}
	
	/**	
	 * 保持していた実棚情報を取得
	 */
	protected MCList<MST_STKTK_ACT_R> getActList(MCList<Chk01_DtlR> upL) {
		MCList<MST_STKTK_ACT_R> all_tstkL = MCList.create(MST_STKTK_ACT_R.class);
		MCList<Chk01_DtlR> itmNotNullL = MCList.create(Chk01_DtlR.class);
		MCList<Chk01_DtlR> itmNullL = MCList.create(Chk01_DtlR.class);
		for (Chk01_DtlR r : upL) {
			if (!isNullOrNullVal(r.itm_cd())) {
				itmNotNullL.add(r);
			}
			else {
				itmNullL.add(r);
			}
		}
		
		if(!itmNullL.isEmpty()) {
			all_tstkL.addAll(getActListByItmFlg(itmNullL, false));
		}
		if(!itmNotNullL.isEmpty()) {
			all_tstkL.addAll(getActListByItmFlg(itmNotNullL, true));
		}
		return all_tstkL;
	}
	
	/**
	 * 品目の有り／無しで分割して保持していた実棚情報を取得	
	 */
	protected MCList<MST_STKTK_ACT_R> getActListByItmFlg(MCList<Chk01_DtlR> upL, boolean stktk_itm_spc_flg) {
		// ワークテーブルを作成
		insertMSW_STKTK_ACT_KEY(upL, stktk_itm_spc_flg);
		
		//保持していた実棚情報を取得
		MCList<MST_STKTK_ACT_R> actL = MCList.create(MST_STKTK_ACT_R.class);
		MST_STKTK_ACT_R t = MST_STKTK_ACT_R.create("T");
		MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t);
		MAM_BP_R m10 = MAM_BP_R.create("M10");
		MAM_LOC_R m3 = MAM_LOC_R.create("M3");
		MSW_STKTK_ACT_KEY_R w1 = MSW_STKTK_ACT_KEY_R.create("W1");
		
		actL_bldr.addSelect(m10.cnsgn_stktk_flg, m3.sppl_cd);
		actL_bldr.addLeftOuterJoin(m10, bracket(t.stk_arrv_bp_cd.eq(m10.bp_cd)));
		actL_bldr.addLeftOuterJoin(m3, bracket(t.loc_cd.eq(m3.loc_cd)));
		
		if (stktk_itm_spc_flg) {
			actL_bldr.addInnerJoin(w1,
				bracket(t.loc_cd.eq(w1.loc_cd))
					.and(t.stktk_base_dt.eq(w1.stktk_base_dt))
					.and(w1.keep_data_flg.eq(value(true)))
					.and(t.itm_cd.eq(w1.itm_cd))
					.and(t.itm_sub1.eq(w1.itm_sub1))
					.and(t.itm_sub2.eq(w1.itm_sub2))
					.and(t.itm_sub3.eq(w1.itm_sub3)));
		}
		else {
			actL_bldr.addInnerJoin(w1,
				bracket(t.loc_cd.eq(w1.loc_cd))
					.and(t.stktk_base_dt.eq(w1.stktk_base_dt))
					.and(w1.keep_data_flg.eq(value(true))));
		}
		actL_bldr.addWhereWithAnd(t.keep_data_flg.eq(value(true)));
		dbSelect("MSBEL2610_MST_STKTK_ACT_S04", actL, actL_bldr);
		
		return actL;
	}

	protected boolean isRflTgt(MST_STKTK_ACT_R r) {
		// 実棚入力済ＦＬＧがオフ
		if (!r.act_input_flg()) {
			return false;
		}
		// 在庫識別区分がVMI
		if (MSC_STK_ID_TYP.isRNT_RCV(r.stk_id_typ())) {
			return false;
		}
		// 在庫識別区分が返品検収前、仕入検収前、自給品、預り、検収不良
		else if (MSC_STK_ID_TYP.isRTN_PRE_ACCPT(r.stk_id_typ())) {
			return false;
		}
		else if (MSC_STK_ID_TYP.isPURC_PRE_ACCPT(r.stk_id_typ())) {
			return false;
		}
		else if (MSC_STK_ID_TYP.isSLF_SUPPRT(r.stk_id_typ())) {
			return false;
		}
		else if (MSC_STK_ID_TYP.isCSTSTK(r.stk_id_typ())) {
			return false;
		}
		else if (MSC_STK_ID_TYP.isACCPT_DFCT(r.stk_id_typ())) {
			return false;
		}
		// 積送品区分が積送中
		if (MSC_IN_XFR_TYP.isIN_XFR(r.in_xfr_typ())) {
			return false;
		}
		// 在庫着荷先が設定されており、
		if (!isNullOrNullVal(r.stk_arrv_bp_cd())) {
			// 確定ＮＯＦＬＧがオン
			if (r.fix_no_flg()) {
				return false;
			}
			// 確定ＮＯＦＬＧがオフかつ貸出在庫棚卸対象ＦＬＧがオフの外注でない場所
			else if (!isSame(r.getStringNE("cnsgn_stktk_flg"), "1") && isNull(r.getStringNE("sppl_cd"))) {
				return false;
			}
		}
		// 理論在庫数量がマイナス
		if (!isNull(r.tor_qty()) && r.tor_qty().isNegative()) {
			return false;
		}
		return true;
	}

	/**
	 * 前回棚卸日情報更新（理論在庫作成）
	 */
	protected void updPreStktk_crtTor(MCList<Chk01_DtlR> upL) {
		MCList<MST_PRE_STKTK_R> insL = MCList.create(MST_PRE_STKTK_R.class);
		MCList<MST_PRE_STKTK_R> updL = MCList.create(MST_PRE_STKTK_R.class);
		
		for (Chk01_DtlR r : upL) {
			MST_PRE_STKTK_R tmpR = MST_PRE_STKTK_R.create();
			copy(tmpR, r, createMap_MST_PRE_STKTK_R_Chk01_DtlR());
			
			tmpR.latest_stktk_st_dt(r.ctrl_tgt_dt());

			if (isNull(r.pre_stktk_upd_cntr())) {
				insL.add(tmpR);
			}
			else {
				updL.add(tmpR);
			}
		}

		if (!insL.isEmpty()) {
			dbInsertEx("MSBEL2610_MST_PRE_STKTK_I01", insL,
					MCQueryApiBuilder.create(MST_PRE_STKTK_R.create("T")));
		}
		if (!updL.isEmpty()) {
			MST_PRE_STKTK_R t = MST_PRE_STKTK_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
			updL_bldr.setSet(t.latest_stktk_st_dt);
			dbUpdateKey("MSBEL2610_MST_PRE_STKTK_U02", updL, updL_bldr);
		}
	}

	/**
	 * 棚卸制御更新（理論在庫取消）
	 */
	protected void updStktk_canTor(MCList<Chk01_DtlR> upL, boolean act_qty_keep_flg) {
		MCList<MST_STKTK_R> updL = MCList.create(MST_STKTK_R.class);
		
		for (Chk01_DtlR r : upL) {
			MST_STKTK_R tmpR = MST_STKTK_R.create();
			copy(tmpR, r, createMap_MST_STKTK_R_Chk01_DtlR());
			tmpR.io_ctrl_flg(false);
			tmpR.stktk_sts_typ(MSC_STKTK_STS_TYP.STKTK_WTG.value());
			tmpR.act_qty_keep_flg(act_qty_keep_flg);

			updL.add(tmpR);
		}

		if (!updL.isEmpty()) {
			MST_STKTK_R t = MST_STKTK_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
			updL_bldr.setSet(t.io_ctrl_flg,
					t.act_dpt_cd, t.act_usr_cd,
					t.stktk_sts_typ, t.act_qty_keep_flg,
					t.stktk_rpt_rmrks, t.intr_rmrks,
					t.sub_char1, t.sub_char2,
					t.sub_char3);
			dbUpdateKey("MSBEL2610_MST_STKTK_U03", updL, updL_bldr);
		}
	}
	
	/**
	 * 理論在庫取消
	 */
	protected void cancelTor(MCList<Chk01_DtlR> upL, boolean act_qty_keep_flg) {
		MCList<MST_STKTK_ACT_R> bindL = MCList.create(MST_STKTK_ACT_R.class);

		// バインド設定
		for (Chk01_DtlR r : upL) {
			MST_STKTK_ACT_R bindR = MST_STKTK_ACT_R.create();
			bindR.stktk_base_dt(r.ctrl_tgt_dt());
			bindR.loc_cd(r.loc_cd());
			if (!isNullOrNullVal(r.itm_cd())) {
				bindR.itm_cd(r.itm_cd());
				bindR.itm_sub1(r.itm_sub1());
				bindR.itm_sub2(r.itm_sub2());
				bindR.itm_sub3(r.itm_sub3());
			}
			bindL.add(bindR);
		}
		if (act_qty_keep_flg) {
			executeBatchUpdate(MSBEL2610_MST_STKTK_ACT_U01(), null, bindL);
		}
		else {
			executeBatchUpdate(MSBEL2610_MST_STKTK_ACT_D01(), null, bindL);
		}
	}

	/**
	 * 前回棚卸日情報更新（理論在庫取消）
	 */
	protected void updPreStktk_canTor(MCList<Chk01_DtlR> upL) {
		MCList<MST_PRE_STKTK_R> updL = MCList.create(MST_PRE_STKTK_R.class);
		
		for (Chk01_DtlR r : upL) {
			MST_PRE_STKTK_R tmpR = MST_PRE_STKTK_R.create();
			copy(tmpR, r, createMap_MST_PRE_STKTK_R_Chk01_DtlR());
			
			updL.add(tmpR);
		}

		if (!updL.isEmpty()) {
			MST_PRE_STKTK_R t = MST_PRE_STKTK_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
			updL_bldr.setSetVL(t.latest_stktk_st_dt, t.last_stktk_dt);
			dbUpdateKey("MSBEL2610_MST_PRE_STKTK_U03", updL, updL_bldr);
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 入出庫制御を取り消します。<br>
	 */
	public class Del01 extends MSBEL_StktkList_MC_A.Del01 {
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
			
			callThisChk04();
			
			MCList<Chk01_DtlR> notErrL = up0().subList(Chk01_DtlR.$err_flg, false);
			if (notErrL.size() != 0) { 
				// 入出庫制御ＦＬＧ更新
				updIoCtrl(notErrL, false);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_DtlR.$peg_no, up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk04() {
			MSBEL_StktkList.Chk04 ope = MSBEL_StktkList.crtChk04();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
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
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 理論在庫を取り消します。<br>
	 */
	public class Del02 extends MSBEL_StktkList_MC_A.Del02 {
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
			
			callThisChk05();
			MCList<Chk01_DtlR> notErrL = up0().subList(Chk01_DtlR.$err_flg, false);
			if (notErrL.size() != 0) { 
				// 理論在庫取消
				updStktk_canTor(notErrL, up1().act_qty_keep_flg());
				cancelTor(notErrL, up1().act_qty_keep_flg());
				updPreStktk_canTor(notErrL);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_DtlR.$peg_no, up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk05() {
			MSBEL_StktkList.Chk05 ope = MSBEL_StktkList.crtChk05();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
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
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));  
				up0L.setAll(l);
				setUpRowParam(1, (MCRow)ope.up(1), up1());
				opeL.add(ope);
			}
			return opeL;
		}
	}
	/**
	 * Del03オペレーション.<p>
	 *
	 * 在庫確定を取り消します。<br>
	 */
	public class Del03 extends MSBEL_StktkList_MC_A.Del03 {
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
			
			callThisChk06();
			MCList<Chk01_DtlR> notErrL = up0().subList(Chk01_DtlR.$err_flg, false);
			if (notErrL.size() != 0) { 
				// 在庫確定取消
				updStktk_canFix(notErrL);
				canStk(notErrL);
				updPreStktk_fix(notErrL);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_DtlR.$peg_no, up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk06() {
			MSBEL_StktkList.Chk06 ope = MSBEL_StktkList.crtChk06();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 棚卸制御更新（在庫確定取消）
		 */
		protected void updStktk_canFix(MCList<Chk01_DtlR> upL) {
			MCList<MST_STKTK_R> updL = MCList.create(MST_STKTK_R.class);
			
			for (Chk01_DtlR r : upL) {
				MST_STKTK_R tmpR = MST_STKTK_R.create();
				copy(tmpR, r, createMap_MST_STKTK_R_Chk01_DtlR());
				tmpR.stktk_sts_typ(MSC_STKTK_STS_TYP.STKTK_ST.value());
				tmpR.diff_upd_tm(null);
				updL.add(tmpR);
			}

			if (!updL.isEmpty()) {
				MST_STKTK_R t = MST_STKTK_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
				updL_bldr.setSet(t.stktk_sts_typ, t.diff_upd_tm,
						t.stktk_rpt_rmrks, t.intr_rmrks,
						t.sub_char1, t.sub_char2, t.sub_char3);
				dbUpdateKey("MSBEL2610_MST_STKTK_U04", updL, updL_bldr);
			}
		}
		/**
		 * 在庫を確定取消する。
		 */
		protected void canStk(MCList<Chk01_DtlR> upL) {
			MCList<IoAct_Ins01_DtlR> ioL = MCList.create(IoAct_Ins01_DtlR.class);
			MCList<MST_STKTK_ACT_R> updL = MCList.create(MST_STKTK_ACT_R.class);

			for (Chk01_DtlR r : upL) {
				// 実棚情報を取得
				MCList<MST_STKTK_ACT_R> actL = MCList.create(MST_STKTK_ACT_R.class);
				MST_STKTK_ACT_R t1 = MST_STKTK_ACT_R.create("T");
				MCQueryApiBuilder actL_bldr = MCQueryApiBuilder.create(t1);
				actL_bldr.addWhereWithAnd(t1.loc_cd.eq(bind("1")), r.loc_cd());
				if (!isNullOrNullVal(r.itm_cd())) {
					actL_bldr.addWhereWithAnd(t1.itm_cd.eq(bind("1")), r.itm_cd());
					actL_bldr.addWhereWithAnd(t1.itm_sub1.eq(bind("1")), r.itm_sub1());
					actL_bldr.addWhereWithAnd(t1.itm_sub2.eq(bind("1")), r.itm_sub2());
					actL_bldr.addWhereWithAnd(t1.itm_sub3.eq(bind("1")), r.itm_sub3());
				}
				actL_bldr.addWhereWithAnd(t1.stktk_base_dt.eq(bind("1")), r.ctrl_tgt_dt());
				actL_bldr.addWhereWithAnd(t1.stktk_act_no.neq(value(MAC_STR.NULL_VAL.value())));
				dbSelectForUpdate("MSBEL2610_MST_STKTK_ACT_S05", actL, actL_bldr);

				// 実棚情報から受払実績サービスの電文を作成する
				for (MST_STKTK_ACT_R actR : actL) {
					IoAct_Ins01_DtlR ioR = IoAct_Ins01_DtlR.create();
					setIoActCan(ioR, actR, r);
					ioL.add(ioR);
				}
				updL.addAll(actL);
			}
			// 受払実績更新
			MSBEL_IoActService.IoAct_Ins01 o1 = MSBEL_IoActService.crtIoAct_Ins01();
			o1.up0().addAll(ioL);
			o1.exec();
			MSBEL_IoActService.IoAct_Upd01 o2 = MSBEL_IoActService.crtIoAct_Upd01();
			o2.exec();

			// 実棚情報更新
			MST_STKTK_ACT_R t2 = MST_STKTK_ACT_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t2);
			updL.setString(MST_STKTK_ACT_R.$stktk_act_no, MAC_STR.NULL_VAL.value());
			updL_bldr.setSet(t2.stktk_act_no);
			dbUpdateKey("MSBEL2610_MST_STKTK_ACT_U02", updL, updL_bldr);
		}
		protected void setIoActCan(IoAct_Ins01_DtlR dest, MST_STKTK_ACT_R src, Chk01_DtlR stktkR) {
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.DEL.value());
			dest.can_ac_dt(src.stktk_base_dt());
			dest.act_no(src.stktk_act_no());
			dest.trn_typ(MSC_TRN_TYP.STK_ADJST.value());
		}

		/**
		 * 前回棚卸日情報更新（在庫確定取消）
		 */
		protected void updPreStktk_fix(MCList<Chk01_DtlR> upL) {
			MCList<MST_PRE_STKTK_R> updL = MCList.create(MST_PRE_STKTK_R.class);

			for (Chk01_DtlR r : upL) {
				MST_PRE_STKTK_R tmpR = MST_PRE_STKTK_R.create();
				copy(tmpR, r, createMap_MST_PRE_STKTK_R_Chk01_DtlR());

				// 前回の棚卸基準日を取得
				MST_STKTK_R preR = MST_STKTK_R.create();
				MST_STKTK_R t1 = MST_STKTK_R.create("T");
				MCQueryApiBuilder preR_bldr = MCQueryApiBuilder.create(t1);
				preR_bldr.addMax(t1.ctrl_tgt_dt, "max_dt");
				preR_bldr.addWhereWithAnd(t1.ctrl_tgt_dt.lt(bind("1")), r.ctrl_tgt_dt());
				preR_bldr.addWhereWithAnd(t1.loc_cd.eq(bind("1")), r.loc_cd());
				preR_bldr.addWhereWithAnd(t1.itm_cd.eq(bind("1")), r.itm_cd());
				preR_bldr.addWhereWithAnd(t1.itm_sub1.eq(bind("1")), r.itm_sub1());
				preR_bldr.addWhereWithAnd(t1.itm_sub2.eq(bind("1")), r.itm_sub2());
				preR_bldr.addWhereWithAnd(t1.itm_sub3.eq(bind("1")), r.itm_sub3());
				preR_bldr.addWhereWithAnd(t1.diff_upd_tm.isNotNull());
				dbSelect("MSBEL2610_MST_STKTK_S02", preR, preR_bldr);
				MCDate pre_dt = preR.getDateNE("max_dt");

				tmpR.last_stktk_dt(pre_dt);

				updL.add(tmpR);
			}

			if (!updL.isEmpty()) {
				MST_PRE_STKTK_R t2 = MST_PRE_STKTK_R.create("T");
				MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t2);
				updL_bldr.setSet(t2.last_stktk_dt);
				dbUpdateKey("MSBEL2610_MST_PRE_STKTK_U04", updL, updL_bldr);
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
		
		@Override
		protected <T extends MCRow> List<MCOperation> splitParam(MCLogic lgc, MCParam p) {
			List<MCOperation> opeL = new ArrayList<>();
			
			List<MCList<Chk01_DtlR>> list = splitUp(up0(), getSplitRowCount());
			for (MCList<Chk01_DtlR> l : list) {
				MCOperation ope = createInstance(lgc, p);
				MCList<Chk01_DtlR> up0L = ((MCList<Chk01_DtlR>)ope.up(0));  
				up0L.setAll(l);
				opeL.add(ope);
			}
			return opeL;
		}
	}

	/**
	 * 入出庫制御ＦＬＧ更新
	 */
	protected void updIoCtrl(MCList<Chk01_DtlR> upL, boolean io_ctrl_flg) {
		MCList<MST_STKTK_R> insL = MCList.create(MST_STKTK_R.class);
		MCList<MST_STKTK_R> updL = MCList.create(MST_STKTK_R.class);
		
		for (Chk01_DtlR r : upL) {
			MST_STKTK_R tmpR = MST_STKTK_R.create();
			copy(tmpR, r, createMap_MST_STKTK_R_Chk01_DtlR());
			tmpR.io_ctrl_flg(io_ctrl_flg);

			if (isNull(r.stktk_upd_cntr())) {
				tmpR.stktk_typ(MSC_STKTK_TYP.CYCLECNT.value());
				tmpR.stktk_sts_typ(MSC_STKTK_STS_TYP.STKTK_WTG.value());
				tmpR.act_qty_keep_flg(false);
				insL.add(tmpR);
			}
			else {
				updL.add(tmpR);
			}
		}

		if (!insL.isEmpty()) {
			dbInsertEx("MSBEL2610_MST_STKTK_I02", insL,
					MCQueryApiBuilder.create(MST_STKTK_R.create("T")));
		}
		if (!updL.isEmpty()) {
			MST_STKTK_R t = MST_STKTK_R.create("T");
			MCQueryApiBuilder updL_bldr = MCQueryApiBuilder.create(t);
			updL_bldr.setSet(t.io_ctrl_flg,
					t.act_dpt_cd, t.act_usr_cd,
					t.stktk_rpt_rmrks, t.intr_rmrks,
					t.sub_char1, t.sub_char2, t.sub_char3);
			dbUpdateKey("MSBEL2610_MST_STKTK_U05", updL, updL_bldr);
		}
	}

	/**
	 * 理論在庫リスト取得
	 */
	protected MCList<MST_STKTK_ACT_R> getTorList(MCList<Chk01_DtlR> upL) {
		MCList<MST_STKTK_ACT_R> all_tstkL = MCList.create(MST_STKTK_ACT_R.class);
		MCList<Chk01_DtlR> itmNotNullL = MCList.create(Chk01_DtlR.class);
		MCList<Chk01_DtlR> itmNullL = MCList.create(Chk01_DtlR.class);
		for (Chk01_DtlR r : upL) {
			if (!isNullOrNullVal(r.itm_cd())) {
				itmNotNullL.add(r);
			}
			else {
				itmNullL.add(r);
			}
		}
		
		if(!itmNullL.isEmpty()) {
			all_tstkL.addAll(getTorListByItmFlg(itmNullL, false));
		}
		if(!itmNotNullL.isEmpty()) {
			all_tstkL.addAll(getTorListByItmFlg(itmNotNullL, true));
		}
		return all_tstkL;
	}

	/**
	 * 品目の有り／無しで分割して理論在庫リスト取得	
	 */
	protected MCList<MST_STKTK_ACT_R> getTorListByItmFlg(MCList<Chk01_DtlR> upL, boolean stktk_itm_spc_flg) {
		MCList<MST_STKTK_ACT_R> all_tstkL = MCList.create(MST_STKTK_ACT_R.class);
		
		/*** 最新の在庫締月を取得 ***/
		MCDate cl_ym = getStkClYm();
		// 締月の末日
		MCDate cl_end_dt = getYmEndDt(cl_ym);
		// ワークテーブルを作成
		insertMSW_STKTK_ACT_KEY(upL, stktk_itm_spc_flg);
				
		MCList<MST_STKTK_ACT_R> tstkAllL = MCList.create(MST_STKTK_ACT_R.class);
		MST_MLY_STK_DTL_R bind = MST_MLY_STK_DTL_R.create();
		bind.ac_ym(cl_ym);
		bind.addDateColumn("cl_end_dt", cl_end_dt);
		bind.addBooleanColumn("stktk_itm_spc_flg", stktk_itm_spc_flg);
		executeQuery(tstkAllL, MSBEL2610_MST_MLY_STK_DTL_S01(), bind);
		
		MCIndexKey tstkLocItmIdx = null;
		MCIndexKey tstkLocIdx = null;
		if(stktk_itm_spc_flg) {
			tstkLocItmIdx = tstkAllL.createIndex(MST_STKTK_ACT_R.$loc_cd, MST_STKTK_ACT_R.$itm_cd, MST_STKTK_ACT_R.$itm_sub1, MST_STKTK_ACT_R.$itm_sub2, MST_STKTK_ACT_R.$itm_sub3);	
		}
		else {
			tstkLocIdx = tstkAllL.createIndex(MST_STKTK_ACT_R.$loc_cd);
		}
		
		for (Chk01_DtlR r : upL) {
			/*** 締月の受払在庫と ***/
			/*** 締月の翌日から制御対象日までの受払実績を取得し、実棚情報の形に変換 ***/
			MCList<MST_STKTK_ACT_R> tstkL = MCList.create(MST_STKTK_ACT_R.class);
			if (stktk_itm_spc_flg) {
				tstkL = tstkAllL.subList(tstkLocItmIdx, r.loc_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3());
			}
			else {
				tstkL = tstkAllL.subList(tstkLocIdx, r.loc_cd());
			}
			
			tstkL.setDateNE(MST_STKTK_ACT_R.$stktk_base_dt, r.ctrl_tgt_dt());
			tstkL.setBooleanNE(MST_STKTK_ACT_R.$keep_data_flg, false);
			tstkL.setColumnValueNE(MST_STKTK_ACT_R.$trd_unit_qty, MST_STKTK_ACT_R.$tor_qty);
			tstkL.setNumberNE(MST_STKTK_ACT_R.$act_diff_qty, MCNumber.ZERO);
			tstkL.setBooleanNE(MST_STKTK_ACT_R.$act_input_flg, false);
			tstkL.setBooleanNE(MST_STKTK_ACT_R.$use_diff_flg, false);
			tstkL.setBooleanNE(MST_STKTK_ACT_R.$stktk_itm_spc_flg, stktk_itm_spc_flg);
			tstkL.setStringNE(MST_STKTK_ACT_R.$stktk_act_no, MAC_STR.NULL_VAL.value());
			
			all_tstkL.addAll(tstkL);
		}
		return all_tstkL;
	}

	/**
	 * ワークテーブルを作成
	 * @param upL
	 * @param stktk_itm_spc_flg
	 */
	public void insertMSW_STKTK_ACT_KEY(MCList<Chk01_DtlR> upL, boolean stktk_itm_spc_flg) {
		// ワークテーブルを作成
		MCList<MST_STKTK_ACT_R> wkL = MCList.create(MST_STKTK_ACT_R.class);
		for (Chk01_DtlR r : upL) {
			MST_STKTK_ACT_R wkR = MST_STKTK_ACT_R.create();
			wkR.loc_cd(r.loc_cd());
			if (stktk_itm_spc_flg) {
				wkR.itm_cd(r.itm_cd());
				wkR.itm_sub1(r.itm_sub1());
				wkR.itm_sub2(r.itm_sub2());
				wkR.itm_sub3(r.itm_sub3());
			}
			else {
				wkR.itm_cd(MAC_STR.NULL_VAL.value());
				wkR.itm_sub1(MAC_STR.NULL_VAL.value());
				wkR.itm_sub2(MAC_STR.NULL_VAL.value());
				wkR.itm_sub3(MAC_STR.NULL_VAL.value());
			}
			wkR.stktk_base_dt(r.ctrl_tgt_dt());
			wkR.keep_data_flg(r.act_qty_keep_flg());
			wkL.add(wkR);
		}
		
		execDbWkDelete("MSBEL2610_MSW_STKTK_ACT_KEY_D01", MSW_STKTK_ACT_KEY_R.create());
		dbWkInsert("MSBEL2610_MSW_STKTK_ACT_KEY_I01", wkL,
				MCQueryApiBuilder.create(MST_STKTK_ACT_R.create("T")).getBaseDbc());
	}

	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 棚卸表や、実棚差異リストを出力します。<br>
	 */
	public class Prnt01 extends MSBEL_StktkList_MC_A.Prnt01 {
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
			
			callThisChk07();
			
			MCList<Chk01_DtlR> notErrL = up0().subList(Chk01_DtlR.$err_flg, false);
			if (notErrL.size() != 0) { 
				// 棚卸表印刷
				notErrL.addBooleanColumn("invlist", up1().invlist_flg());
				notErrL.addBooleanColumn("difflist", up1().difflist_flg());
				printStktkList(notErrL);
			}
		}

		/**
		 * 上り電文の編集
		 */
		protected void editUp() {
			setPegNo(Chk01_DtlR.$peg_no, up0());
		}

		/**
		 * チェック処理を実行する
		 */
		protected void callThisChk07() {
			MSBEL_StktkList.Chk07 ope = MSBEL_StktkList.crtChk07();
			ope.up0().setAll(up0());
			ope.exec();
			up0().setAll(ope.down0());
		}

		/**
		 * 下り電文設定
		 */
		protected void setDown() {
			down0().setAll(up0());
		}
	}

	/**
	 * 棚卸表印刷
	 */
	protected void printStktkList(MCList<Chk01_DtlR> notErrL) {
		MSBEL_StktkListPrntService.StktkList_Prnt01 o = MSBEL_StktkListPrntService.crtStktkList_Prnt01();
		addAll(o.up0(), notErrL, createMap_StktkList_Prnt01_DtlR_Chk01_DtlR());
		o.exec();
	}

	/**
	 * 場所が同一の上り電文行が、同じMCListに格納されるように分割する
	 * @param list クライアントから渡された上り電文
	 * @param max １スレッドあたりの最大件数
	 * @return
	 */
	protected List<MCList<Chk01_DtlR>> splitUp(MCList<Chk01_DtlR> list, int max) {
		List<MCList<Chk01_DtlR>> ret = new ArrayList<>();
		// groupList
		MCList<Chk01_DtlR>[] grpL = list.groupList(Chk01_DtlR.$loc_cd);
		MCList<Chk01_DtlR> tmp = MCList.create(Chk01_DtlR.class);
		for (MCList<Chk01_DtlR> grp : grpL) {
			if (tmp.size() >= max) {
				ret.add(tmp);
				tmp = MCList.create(Chk01_DtlR.class);
			}
			tmp.addAll(grp);
		}
		if (!tmp.isEmpty()) {
			ret.add(tmp);
		}
		return ret;
	}
	
	protected void handleSuccess(MCList<Chk01_DtlR> l) {
		dbTran().commit();
		for (Chk01_DtlR r : l) {
			if (!r.err_flg()) {
				r.rtn_sts_typ(MAC_RTN_STS_TYP.OK.value());
			}
		}
	}
	
	protected void handleEx(Exception e,
			MCList<Chk01_DtlR> l) {
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
		for (Chk01_DtlR r : l) {
			r.rtn_sts_typ(MAC_RTN_STS_TYP.ERR.value());
		}
	}

	protected static final String[] _stktkact_key = new String[]{
			MST_STKTK_ACT_R.$loc_cd,
			MST_STKTK_ACT_R.$itm_cd,
			MST_STKTK_ACT_R.$itm_sub1,
			MST_STKTK_ACT_R.$itm_sub2,
			MST_STKTK_ACT_R.$itm_sub3,
			MST_STKTK_ACT_R.$str_ln_cd,
			MST_STKTK_ACT_R.$stk_arrv_bp_cd,
			MST_STKTK_ACT_R.$lot_no,
			MST_STKTK_ACT_R.$sublot_no,
			MST_STKTK_ACT_R.$sno1,
			MST_STKTK_ACT_R.$sno2,
			MST_STKTK_ACT_R.$sno3,
			MST_STKTK_ACT_R.$sno4,
			MST_STKTK_ACT_R.$fix_no_flg,
			MST_STKTK_ACT_R.$trd_unit_cd,
			MST_STKTK_ACT_R.$gd_cd,
			MST_STKTK_ACT_R.$in_xfr_typ,
			MST_STKTK_ACT_R.$quality_typ,
			MST_STKTK_ACT_R.$stk_insp_typ,
			MST_STKTK_ACT_R.$stk_id_typ,
			MST_STKTK_ACT_R.$stk_bp_cd,
			MST_STKTK_ACT_R.$stktk_base_dt
			};
	protected static final String[] _loc_key = new String[]{
			MST_STKTK_ACT_R.$loc_cd,
			MST_STKTK_ACT_R.$itm_cd,
			MST_STKTK_ACT_R.$itm_sub1,
			MST_STKTK_ACT_R.$itm_sub2,
			MST_STKTK_ACT_R.$itm_sub3
			};
	/**
	 * ロウの値を配列に変換する
	 * <p>
	 */
	@SuppressWarnings("rawtypes")
	protected Comparable[] getVals(MCRow row, String[] keys) {
		Comparable[] vals = new Comparable[keys.length];
		int i = 0;
		for (String col : keys) {
			vals[i] = row.getValueNE(col);
			i++;
		}
		return vals;
	}

	protected Map_MST_STKTK_R_Chk01_DtlR<MST_STKTK_R,Chk01_DtlR> createMap_MST_STKTK_R_Chk01_DtlR() {
		return new Map_MST_STKTK_R_Chk01_DtlR<MST_STKTK_R, Chk01_DtlR>();
	}

	public class Map_MST_STKTK_R_Chk01_DtlR<D extends MST_STKTK_R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_STKTK_R.$loc_cd, Chk01_DtlR.$loc_cd);
			addColumnPathMap(MST_STKTK_R.$ctrl_tgt_dt, Chk01_DtlR.$ctrl_tgt_dt);
			addColumnPathMap(MST_STKTK_R.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(MST_STKTK_R.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(MST_STKTK_R.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(MST_STKTK_R.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(MST_STKTK_R.$stktk_typ, Chk01_DtlR.$stktk_typ);
			addColumnPathMap(MST_STKTK_R.$wg_cd, Chk01_DtlR.$wg_cd);
			addColumnPathMap(MST_STKTK_R.$stktk_sts_typ, Chk01_DtlR.$stktk_sts_typ);
			addColumnPathMap(MST_STKTK_R.$act_dpt_cd, Chk01_DtlR.$act_dpt_cd);
			addColumnPathMap(MST_STKTK_R.$act_usr_cd, Chk01_DtlR.$act_usr_cd);
			addColumnPathMap(MST_STKTK_R.$io_ctrl_flg, Chk01_DtlR.$io_ctrl_flg);
			addColumnPathMap(MST_STKTK_R.$act_qty_keep_flg, Chk01_DtlR.$act_qty_keep_flg);
			addColumnPathMap(MST_STKTK_R.$stktk_rpt_rmrks, Chk01_DtlR.$stktk_rpt_rmrks);
			addColumnPathMap(MST_STKTK_R.$intr_rmrks, Chk01_DtlR.$stktk_intr_rmrks);
			addColumnPathMap(MST_STKTK_R.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(MST_STKTK_R.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(MST_STKTK_R.$sub_char3, Chk01_DtlR.$sub_char3);

		}
	}

	protected Map_MST_PRE_STKTK_R_Chk01_DtlR<MST_PRE_STKTK_R,Chk01_DtlR> createMap_MST_PRE_STKTK_R_Chk01_DtlR() {
		return new Map_MST_PRE_STKTK_R_Chk01_DtlR<MST_PRE_STKTK_R, Chk01_DtlR>();
	}

	public class Map_MST_PRE_STKTK_R_Chk01_DtlR<D extends MST_PRE_STKTK_R, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(MST_PRE_STKTK_R.$loc_cd, Chk01_DtlR.$loc_cd);
			addColumnPathMap(MST_PRE_STKTK_R.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(MST_PRE_STKTK_R.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(MST_PRE_STKTK_R.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(MST_PRE_STKTK_R.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(MST_PRE_STKTK_R.$sub_char1, Chk01_DtlR.$sub_char1);
			addColumnPathMap(MST_PRE_STKTK_R.$sub_char2, Chk01_DtlR.$sub_char2);
			addColumnPathMap(MST_PRE_STKTK_R.$sub_char3, Chk01_DtlR.$sub_char3);

		}
	}

	protected Map_Cl_Chk03_CndR_Chk01_DtlR<Cl_Chk03_CndR,Chk01_DtlR> createMap_Cl_Chk03_CndR_Chk01_DtlR() {
		return new Map_Cl_Chk03_CndR_Chk01_DtlR<Cl_Chk03_CndR, Chk01_DtlR>();
	}

	public class Map_Cl_Chk03_CndR_Chk01_DtlR<D extends Cl_Chk03_CndR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(Cl_Chk03_CndR.$peg_no, Chk01_DtlR.$peg_no);
			addColumnPathMap(Cl_Chk03_CndR.$ac_dt, Chk01_DtlR.$ctrl_tgt_dt);
			addColumnPathMap(Cl_Chk03_CndR.$loc_cd, Chk01_DtlR.$loc_cd);
			addColumnPathMap(Cl_Chk03_CndR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(Cl_Chk03_CndR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(Cl_Chk03_CndR.$err_flg, Chk01_DtlR.$err_flg);

		}
		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);
			
			// 在庫締チェックがオン
			dest.sls_cls_chk_flg(false);
			dest.rcv_cls_chk_flg(false);
			dest.purc_cls_chk_flg(false);
			dest.pay_cls_chk_flg(false);
			dest.stk_cls_chk_flg(true);
			dest.io_lmt_skip_flg(true);
			dest.bp_cd(null);
		}
	}

	protected Map_StktkList_Prnt01_DtlR_Chk01_DtlR<StktkList_Prnt01_DtlR,Chk01_DtlR> createMap_StktkList_Prnt01_DtlR_Chk01_DtlR() {
		return new Map_StktkList_Prnt01_DtlR_Chk01_DtlR<StktkList_Prnt01_DtlR, Chk01_DtlR>();
	}

	public class Map_StktkList_Prnt01_DtlR_Chk01_DtlR<D extends StktkList_Prnt01_DtlR, S extends Chk01_DtlR> extends MCRowMapper<D,S>{
		@Override
		protected void setupColumnPathMap() {
			addColumnPathMap(StktkList_Prnt01_DtlR.$ctrl_tgt_dt, Chk01_DtlR.$ctrl_tgt_dt);
			addColumnPathMap(StktkList_Prnt01_DtlR.$loc_cd, Chk01_DtlR.$loc_cd);
			addColumnPathMap(StktkList_Prnt01_DtlR.$itm_cd, Chk01_DtlR.$itm_cd);
			addColumnPathMap(StktkList_Prnt01_DtlR.$itm_sub1, Chk01_DtlR.$itm_sub1);
			addColumnPathMap(StktkList_Prnt01_DtlR.$itm_sub2, Chk01_DtlR.$itm_sub2);
			addColumnPathMap(StktkList_Prnt01_DtlR.$itm_sub3, Chk01_DtlR.$itm_sub3);
			addColumnPathMap(StktkList_Prnt01_DtlR.$stktk_rpt_flg, "invlist");
			addColumnPathMap(StktkList_Prnt01_DtlR.$diff_rpt_flg, "difflist");
			addColumnPathMap(StktkList_Prnt01_DtlR.$stktk_typ, Chk01_DtlR.$stktk_typ);
			addColumnPathMap(StktkList_Prnt01_DtlR.$stktk_rpt_rmrks, Chk01_DtlR.$stktk_rpt_rmrks);

		}
	}

	protected String getTrdCd() {
		MCList<MAM_TRD_R> trdL = MCList.create(MAM_TRD_R.class);
		MAM_TRD_R t = MAM_TRD_R.create("T");
		MCQueryApiBuilder trdL_bldr = MCQueryApiBuilder.create(t);
		MAM_TRD_R r = MAM_TRD_R.create();

		trdL_bldr.addWhereWithAnd(t.trd_ptn_typ.eq(bind("1")), MAC_TRD_PTN_TYP.STK_ADJST.value());
		trdL_bldr.addWhereWithAnd(t.auto_adopt_flg.eq(value(true)));

		dbSelect("MSBEL2610_MAM_TRD_S01", trdL, trdL_bldr);
		if (!trdL.isEmpty()) {
			r = trdL.get(0);
		}
		return r.trd_cd();
		
	}

	//FMCB CUSTOM END
}