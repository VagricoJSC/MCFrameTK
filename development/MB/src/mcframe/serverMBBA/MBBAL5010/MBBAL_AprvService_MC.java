package mcframe.serverMBBA.MBBAL5010;

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
import mcframe.serverMAUC.MAUCL0060.ElmArgsR;
import static mcframe.commonMA.notice.MA_Msg.*;
import static mcframe.serverMAUC.MAUCL0010.MAUCL_MCDataUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverMBBA.MBBAL5010.*;	// このimportはFrameManagerの自動生成で追加されました。

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

import static mcframe.serverCore.requester.MCRequestObject.*;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverMAUC.MAUCL5010.*;
import static mcframe.serverMBBA.MBBAL5010.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBAL_AprvService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBAL_AprvService_MC extends MBBAL_AprvService_MC_A{
	//FMCB CUSTOM START

	/**
	 * オブジェクト共有用のクラス
	 */
	protected static final Class<MBBAL_AprvService> CLAZZ =
			MBBAL_AprvService.class;

	/**
	 * 承認情報ヘッダ
	 */
	protected Map<List<Comparable<?>>, MBT_APRV_R> _hdrMap = null;

	/**
	 * 承認情報ヘッダを取得します。
	 */
	protected static Map<List<Comparable<?>>, MBT_APRV_R> getHdrMap() {
		return object(CLAZZ)._getHdrMap();
	}

	/**
	 * 承認情報ヘッダを取得します。
	 */
	protected Map<List<Comparable<?>>, MBT_APRV_R> _getHdrMap() {
		if (_hdrMap == null) {
			_hdrMap = new HashMap<>();
		}
		return _hdrMap;
	}

	/**
	 * Aprv_Chk01オペレーション.<p>
	 *
	 * 承認情報を作成する際のチェックを行う。<br>
	 */
	public class Aprv_Chk01 extends MBBAL_AprvService_MC_A.Aprv_Chk01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			dbUp();
			return msgL;
		}

		/**
		 * 上り電文に対応するDB処理を行います。
		 */
		protected void dbUp() {
			BiConsumer<MBT_APRV_R, Aprv_Chk01_Rslt1R> cpy = (d, s) -> {
				d.aprv_no(s.aprv_no());
			};
			selHdr(MBT_APRV_R.class, up0(), cpy);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Aprv_Chk01_Rslt1R> chkL = getChkList(up0());
			msgL.addAll(chkHdrI(chkL));
			msgL.addAll(chkSts(chkL));
			return msgL;
		}

		/**
		 * 承認情報ヘッダの更新可能性をチェックします。
		 */
		protected MCMessageList chkHdrI(MCList<Aprv_Chk01_Rslt1R> chkL) {
			Function<Aprv_Chk01_Rslt1R, String> func = r -> r.aprv_no();
			return chkHdr(chkL, func);
		}

		/**
		 * 承認状況区分をチェックします。
		 */
		protected MCMessageList chkSts(MCList<Aprv_Chk01_Rslt1R> chkL) {
			MCMessageList msgL = new MCMessageList();
			String[] cols = new String[] {
				  Aprv_Chk01_Rslt1R.$aprv_no
			};
			Function<Aprv_Chk01_Rslt1R, MCMessage> updF = r -> {
				if (r.aprv_no() == null) {
					return null;
				}
				MBT_APRV_R hdrR = getMapVal(getHdrMap(), r.toArray(cols));
				if (hdrR == null) {
					return null;
				}
				if (!MAC_APRV_STS_TYP.isFIX(hdrR.aprv_sts_typ()) &&
						!MAC_APRV_STS_TYP.isACPT(hdrR.aprv_sts_typ())) {
					return null;
				}
				if (hdrR.aprv_upd_flg()) {
					return null;
				}
				return new MCMessage(r, null, MBBAL0005, r.aprv_no());
			};
			for (Aprv_Chk01_Rslt1R chkR : chkL) {
				msgL.add(updF.apply(chkR));
			}
			return msgL;
		}

		@Override
		protected void doIt() {
			super.doIt();
			crtDown();
		}

		/**
		 * 下り電文を作成します。
		 */
		protected void crtDown() {
			down0().addAll(up0());
		}

	}

	/**
	 * Aprv_Chk02オペレーション.<p>
	 *
	 * 承認次処理済に更新する際のチェックを行う。<br>
	 */
	public class Aprv_Chk02 extends MBBAL_AprvService_MC_A.Aprv_Chk02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			dbUp();
			return msgL;
		}

		/**
		 * 上り電文に対応するDB処理を行います。
		 */
		protected void dbUp() {
			BiConsumer<MBT_APRV_R, Aprv_Chk02_Rslt1R> cpy = (d, s) -> {
				d.aprv_no(s.aprv_no());
			};
			selHdr(MBT_APRV_R.class, up0(), cpy);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Aprv_Chk02_Rslt1R> chkL = getChkList(up0());
			msgL.addAll(chkHdrI(chkL));
			msgL.addAll(chkSts(chkL));
			return msgL;
		}

		/**
		 * 承認情報ヘッダの更新可能性をチェックします。
		 */
		protected MCMessageList chkHdrI(MCList<Aprv_Chk02_Rslt1R> chkL) {
			Function<Aprv_Chk02_Rslt1R, String> func = r -> r.aprv_no();
			return chkHdr(chkL, func);
		}

		/**
		 * 承認状況区分をチェックします。
		 */
		protected MCMessageList chkSts(MCList<Aprv_Chk02_Rslt1R> chkL) {
			MCMessageList msgL = new MCMessageList();
			String[] cols = new String[] {
				  Aprv_Chk02_Rslt1R.$aprv_no
			};
			Function<Aprv_Chk02_Rslt1R, MCMessage> acptF = r -> {
				if (r.aprv_no() == null) {
					return null;
				}
				MBT_APRV_R hdrR = getMapVal(getHdrMap(), r.toArray(cols));
				if (hdrR == null) {
					return null;
				}
				if (MAC_APRV_STS_TYP.isACPT(hdrR.aprv_sts_typ())) {
					return null;
				}
				return new MCMessage(r, null, MBBAL0007,
						r.aprv_no(), hdrR.aprv_func_typ(),
						hdrR.aprv_src_no1(), hdrR.aprv_src_no2());
			};
			for (Aprv_Chk02_Rslt1R chkR : chkL) {
				msgL.add(acptF.apply(chkR));
			}
			return msgL;
		}

		@Override
		protected void doIt() {
			super.doIt();
			crtDown();
		}

		/**
		 * 下り電文を作成します。
		 */
		protected void crtDown() {
			down0().addAll(up0());
		}

	}

	/**
	 * Aprv_Chk03オペレーション.<p>
	 *
	 * 承認次処理済を解除する際のチェックを行う。<br>
	 */
	public class Aprv_Chk03 extends MBBAL_AprvService_MC_A.Aprv_Chk03 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			dbUp();
			return msgL;
		}

		/**
		 * 上り電文に対応するDB処理を行います。
		 */
		protected void dbUp() {
			BiConsumer<MBT_APRV_R, Aprv_Chk02_Rslt1R> cpy = (d, s) -> {
				d.aprv_no(s.aprv_no());
			};
			selHdr(MBT_APRV_R.class, up0(), cpy);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Aprv_Chk02_Rslt1R> chkL = getChkList(up0());
			msgL.addAll(chkHdrI(chkL));
			return msgL;
		}

		/**
		 * 承認情報ヘッダの更新可能性をチェックします。
		 */
		protected MCMessageList chkHdrI(MCList<Aprv_Chk02_Rslt1R> chkL) {
			Function<Aprv_Chk02_Rslt1R, String> func = r -> r.aprv_no();
			return chkHdr(chkL, func);
		}

		@Override
		protected void doIt() {
			super.doIt();
			crtDown();
		}

		/**
		 * 下り電文を作成します。
		 */
		protected void crtDown() {
			down0().addAll(up0());
		}

	}

	/**
	 * Aprv_Chk04オペレーション.<p>
	 *
	 * 承認情報を削除する際のチェックを行う。<br>
	 */
	public class Aprv_Chk04 extends MBBAL_AprvService_MC_A.Aprv_Chk04 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected MCMessageList doServerCheckBase() {
			MCMessageList msgL = super.doServerCheckBase();
			dbUp();
			return msgL;
		}

		/**
		 * 上り電文に対応するDB処理を行います。
		 */
		protected void dbUp() {
			BiConsumer<MBT_APRV_R, Aprv_Chk04_Rslt1R> cpy = (d, s) -> {
				d.aprv_no(s.aprv_no());
			};
			selHdr(MBT_APRV_R.class, up0(), cpy);
		}

		@Override
		protected MCMessageList doServerCheckSub() {
			MCMessageList msgL = super.doServerCheckSub();
			MCList<Aprv_Chk04_Rslt1R> chkL = getChkList(up0());
			msgL.addAll(chkHdrI(chkL));
			msgL.addAll(chkSts(chkL));
			return msgL;
		}

		/**
		 * 承認情報ヘッダの更新可能性をチェックします。
		 */
		protected MCMessageList chkHdrI(MCList<Aprv_Chk04_Rslt1R> chkL) {
			Function<Aprv_Chk04_Rslt1R, String> func = r -> r.aprv_no();
			return chkHdr(chkL, func);
		}

		/**
		 * 承認状況区分をチェックします。
		 */
		protected MCMessageList chkSts(MCList<Aprv_Chk04_Rslt1R> chkL) {
			MCMessageList msgL = new MCMessageList();
			String[] cols = new String[] {
				  Aprv_Chk01_Rslt1R.$aprv_no
			};
			Function<Aprv_Chk04_Rslt1R, MCMessage> canF = r -> {
				MBT_APRV_R hdrR = getMapVal(getHdrMap(), r.toArray(cols));
				if (hdrR == null) {
					return null;
				}
				if (!MAC_APRV_STS_TYP.isFIX(hdrR.aprv_sts_typ()) &&
						!MAC_APRV_STS_TYP.isACPT(hdrR.aprv_sts_typ())) {
					return null;
				}
				if (hdrR.aprv_can_flg()) {
					return null;
				}
				return new MCMessage(r, null, MBBAL0008, r.aprv_no());
			};
			for (Aprv_Chk04_Rslt1R chkR : chkL) {
				msgL.add(canF.apply(chkR));
			}
			return msgL;
		}

		@Override
		protected void doIt() {
			super.doIt();
			crtDown();
		}

		/**
		 * 下り電文を作成します。
		 */
		protected void crtDown() {
			down0().addAll(up0());
		}

	}

	/**
	 * 承認情報ヘッダを検索します。
	 */
	protected <D extends MCDBContainer, S extends MCRow> void selHdr(
			Class<D> clazz, MCList<S> bindL, BiConsumer<D, S> cpy) {
		List<BiConsumer<D, S>> cpyL = new ArrayList<>();
		cpyL.add(cpy);
		
		MCDBContainer wkTbl = getRegWk(clazz, bindL, cpyL);
		String aprvNoCol = MBT_APRV_R.$aprv_no;
		MCList<MBT_APRV_R> hdrL = MCList.create(MBT_APRV_R.class);
		MBT_APRV_R hdrR = MBT_APRV_R.create("T");
		MCQueryApiBuilder hdrR_bldr = MCQueryApiBuilder.create(hdrR);
		hdrR_bldr.addWhereWithAnd(hdrR.can_flg.eq(bind("can_flg")));
		setSelWk(hdrR, hdrR_bldr, wkTbl, true, aprvNoCol);
		dbSelectForUpdate("MBBAL5010_MBT_APRV_S01", hdrL, hdrR_bldr, hdrR);
		getHdrMap().putAll(crtRowMap(hdrL, aprvNoCol));
	}

	/**
	 * 承認情報ヘッダの更新可能性をチェックします。
	 */
	protected <T extends MCRow> MCMessageList chkHdr(
			MCList<T> chkL, Function<T, String> func) {
		MCMessageList msgL = new MCMessageList();
		Function<T, MCMessage> hdrF = r -> {
			String val = func.apply(r);
			if (val == null) {
				return null;
			}
			if (getMapVal(getHdrMap(), val) != null) {
				return null;
			}
			return new MCMessage(r, null, MBBAL0001, val);
		};
		for (T chkR : chkL) {
			msgL.add(hdrF.apply(chkR));
		}
		return msgL;
	}

	// **********************************************************************

	/**
	 * Aprv_Upd01オペレーション.<p>
	 *
	 * 承認情報を作成する。<br>
	 */
	public class Aprv_Upd01 extends MBBAL_AprvService_MC_A.Aprv_Upd01 {

		// 事前に外部から Aprv_Chk01 が呼び出されている想定

		/**
		 * 上り電文
		 */
		protected Map<MCNumber, Aprv_Chk01_Rslt1R> _upMap = new HashMap<>();

		/**
		 * ワーク
		 */
		protected MCList<Aprv_Upd01_Wk1R> _wkL =
				MCList.create(Aprv_Upd01_Wk1R.class);

		/**
		 * 承認情報ヘッダ（登録対象）
		 */
		protected MCList<MBT_APRV_R> _regHdrL = MCList.create(MBT_APRV_R.class);

		/**
		 * 承認情報明細（登録対象）
		 */
		protected MCList<MBT_APRV_D_R> _regDtlL = MCList.create(MBT_APRV_D_R.class);

		@Override
		protected void call() {
			crtUpMap();
			delI();
			crtWk();
			crtRegHdr();
			crtRegDtl();
			regHdr();
			regDtl();
			crtDown();
			callPushNtc();
		}

		/**
		 * 上り電文を取得するマップを作成します。
		 */
		protected void crtUpMap() {
			for (Aprv_Chk01_Rslt1R upR : up0()) {
				_upMap.put(upR.peg_no(), upR);
			}
		}

		/**
		 * 承認情報を削除します。
		 */
		protected void delI() {
			Function<Aprv_Chk01_Rslt1R, Comparable<?>[]> func = r -> {
				return new Comparable<?>[] {
					  r.aprv_no()
				};
			};
			del(up0(), func);
		}

		/**
		 * ワークデータを作成します。
		 */
		protected void crtWk() {
			regWk();
			extWk();
			editWk();
		}

		/**
		 * ワークデータを登録します。
		 */
		protected void regWk() {
			MCQueryApiBuilder wkR_bldr = MCQueryApiBuilder.create(MBW_APRV_R.create("T"));
			execDbWkDelete("MBBAL5010_MBW_APRV_D01", MBW_APRV_R.create());
			wkR_bldr.buildInsert("MBBAL5010_MBW_APRV_I01").executeBatchUpdate(up0());
		}

		/**
		 * ワークデータの絞込を行います。
		 */
		protected void extWk() {
			MCList<Aprv_Upd01_Wk1R> wkL =
					MCList.create(Aprv_Upd01_Wk1R.class);
			executeQuery(wkL, MBBAL5010_MBW_APRV_S01());
			MCRowMatcher<Aprv_Upd01_Wk1R> tgtRM = r -> match(r);
			wkL.setAll(wkL.subList(tgtRM));
			MCList<Aprv_Upd01_Wk1R>[] wkGLArr =
					wkL.groupList(Aprv_Upd01_Wk1R.$peg_no);
			String[] cols = new String[] {
				  Aprv_Upd01_Wk1R.$prio
				, Aprv_Upd01_Wk1R.$aprv_row_num
			};
			for (MCList<Aprv_Upd01_Wk1R> wkGL : wkGLArr) {
				for (String col : cols) {
					List<MCNumber> colL = wkGL.groupBy(col).getNumber(col);
					MCNumber min = Collections.min(colL);
					wkGL = wkGL.subList(col, min);
				}
				_wkL.addAll(wkGL);
			}
		}

		/**
		 * 絞込条件に当てはまる場合に true が返ります。
		 */
		protected boolean match(Aprv_Upd01_Wk1R wkR) {
			return matchItmGrp(wkR) && matchBpGrp(wkR) && matchAmt(wkR);
		}

		/**
		 * 品目分類に関する絞込を行います。
		 */
		protected boolean matchItmGrp(Aprv_Upd01_Wk1R wkR) {
			String itmGrpTyp = wkR.itm_grp_typ();
			if (MAC_ITM_GRP_TYP.isGRP1(itmGrpTyp)) {
				return isSame(wkR.itm_grp_cd(), wkR.itm_grp_cd1());
			}
			if (MAC_ITM_GRP_TYP.isGRP2(itmGrpTyp)) {
				return isSame(wkR.itm_grp_cd(), wkR.itm_grp_cd2());
			}
			if (MAC_ITM_GRP_TYP.isGRP3(itmGrpTyp)) {
				return isSame(wkR.itm_grp_cd(), wkR.itm_grp_cd3());
			}
			if (MAC_ITM_GRP_TYP.isGRP4(itmGrpTyp)) {
				return isSame(wkR.itm_grp_cd(), wkR.itm_grp_cd4());
			}
			if (MAC_ITM_GRP_TYP.isGRP5(itmGrpTyp)) {
				return isSame(wkR.itm_grp_cd(), wkR.itm_grp_cd5());
			}
			if (MAC_ITM_GRP_TYP.isGRP6(itmGrpTyp)) {
				return isSame(wkR.itm_grp_cd(), wkR.itm_grp_cd6());
			}
			if (MAC_ITM_GRP_TYP.isGRP7(itmGrpTyp)) {
				return isSame(wkR.itm_grp_cd(), wkR.itm_grp_cd7());
			}
			if (MAC_ITM_GRP_TYP.isGRP8(itmGrpTyp)) {
				return isSame(wkR.itm_grp_cd(), wkR.itm_grp_cd8());
			}
			if (MAC_ITM_GRP_TYP.isGRP9(itmGrpTyp)) {
				return isSame(wkR.itm_grp_cd(), wkR.itm_grp_cd9());
			}
			if (MAC_ITM_GRP_TYP.isGRP10(itmGrpTyp)) {
				return isSame(wkR.itm_grp_cd(), wkR.itm_grp_cd10());
			}
			return true;
		}

		/**
		 * 取引先分類に関する絞込を行います。
		 */
		protected boolean matchBpGrp(Aprv_Upd01_Wk1R wkR) {
			String bpGrpTyp = wkR.bp_grp_typ();
			if (MAC_BP_GRP_TYP.isGRP1(bpGrpTyp)) {
				return isSame(wkR.bp_grp_cd(), wkR.bp_grp_cd1());
			}
			if (MAC_BP_GRP_TYP.isGRP2(bpGrpTyp)) {
				return isSame(wkR.bp_grp_cd(), wkR.bp_grp_cd2());
			}
			if (MAC_BP_GRP_TYP.isGRP3(bpGrpTyp)) {
				return isSame(wkR.bp_grp_cd(), wkR.bp_grp_cd3());
			}
			if (MAC_BP_GRP_TYP.isGRP4(bpGrpTyp)) {
				return isSame(wkR.bp_grp_cd(), wkR.bp_grp_cd4());
			}
			if (MAC_BP_GRP_TYP.isGRP5(bpGrpTyp)) {
				return isSame(wkR.bp_grp_cd(), wkR.bp_grp_cd5());
			}
			if (MAC_BP_GRP_TYP.isGRP6(bpGrpTyp)) {
				return isSame(wkR.bp_grp_cd(), wkR.bp_grp_cd6());
			}
			if (MAC_BP_GRP_TYP.isGRP7(bpGrpTyp)) {
				return isSame(wkR.bp_grp_cd(), wkR.bp_grp_cd7());
			}
			if (MAC_BP_GRP_TYP.isGRP8(bpGrpTyp)) {
				return isSame(wkR.bp_grp_cd(), wkR.bp_grp_cd8());
			}
			if (MAC_BP_GRP_TYP.isGRP9(bpGrpTyp)) {
				return isSame(wkR.bp_grp_cd(), wkR.bp_grp_cd9());
			}
			if (MAC_BP_GRP_TYP.isGRP10(bpGrpTyp)) {
				return isSame(wkR.bp_grp_cd(), wkR.bp_grp_cd10());
			}
			return true;
		}

		/**
		 * 金額に関する絞込を行います。
		 */
		protected boolean matchAmt(Aprv_Upd01_Wk1R wkR) {
			boolean ret = true;
			Aprv_Chk01_Rslt1R upR = _upMap.get(wkR.peg_no());
			MCNumber l1, g1, s1, l2, g2, s2, l3, g3, s3;
			l1 = wkR.val_min1(); g1 = wkR.val_max1(); s1 = upR.src_amt1();
			l2 = wkR.val_min2(); g2 = wkR.val_max2(); s2 = upR.src_amt2();
			l3 = wkR.val_min3(); g3 = wkR.val_max3(); s3 = upR.src_amt3();
			boolean match1 = isNull(s1) ?
					isNullAnd(l1, g1) : s1.gte(l1) && s1.lte(g1);
			boolean match2 = isNull(s2) ?
					isNullAnd(l2, g2) : s2.gte(l2) && s2.lte(g2);
			boolean match3 = isNull(s3) ?
					isNullAnd(l3, g3) : s3.gte(l3) && s3.lte(g3);
			String b1, b2;
			b1 = wkR.bind_cond1(); b2 = wkR.bind_cond2();
			ret = match1;
			if (MAC_BIND_COND_TYP.isOP_AND(b1)) {
				ret = ret && match2;
			}
			if (MAC_BIND_COND_TYP.isOP_OR(b1)) {
				ret = ret || match2;
			}
			if (MAC_BIND_COND_TYP.isOP_AND(b2)) {
				ret = ret && match3;
			}
			if (MAC_BIND_COND_TYP.isOP_OR(b2)) {
				ret = ret || match3;
			}
			return ret;
		}

		/**
		 * ワークデータを編集します。
		 */
		protected void editWk() {
			editWkNotUpdFlg();
			editWkKey();
		}

		/**
		 * ワークデータの更新不可フラグを編集します。
		 */
		protected void editWkNotUpdFlg() {
			MCList<Aprv_Upd01_Wk1R>[] wkGLArr =
					_wkL.groupList(Aprv_Upd01_Wk1R.$peg_no);
			String col = Aprv_Upd01_Wk1R.$aprv_seq;
			for (MCList<Aprv_Upd01_Wk1R> wkGL : wkGLArr) {
				List<MCNumber> aprvSeqL = wkGL.groupBy(col).getNumber(col);
				MCNumber min = Collections.min(aprvSeqL);
				for (Aprv_Upd01_Wk1R wkGR : wkGL) {
					if (isSame(wkGR.aprv_seq(), min)) {
						wkGR.not_upd_flg(false);
					}
					else {
						wkGR.not_upd_flg(true);
					}
				}
			}
		}

		/**
		 * ワークデータのキー項目を編集します。
		 */
		protected void editWkKey() {
			MCList<Aprv_Upd01_Wk1R>[] wkGLArr =
					_wkL.groupList(Aprv_Upd01_Wk1R.$peg_no);
			for (MCList<Aprv_Upd01_Wk1R> wkGL : wkGLArr) {
				Comparable<?> val =
						_upMap.get(wkGL.get(0).peg_no()).aprv_no();
				MBT_APRV_R hdrR = getMapVal(getHdrMap(), val);
				String aprvNo =
						hdrR == null ? getIssuedAprvNo() : hdrR.aprv_no();
				MCNumber aprvNoSeq = MCNumber.sum(MCNumber.ONE,
						hdrR == null ? null : hdrR.aprv_no_seq());
				wkGL.setString(Aprv_Upd01_Wk1R.$aprv_no, aprvNo);
				wkGL.setNumber(Aprv_Upd01_Wk1R.$aprv_no_seq, aprvNoSeq);
			}
		}

		/**
		 * 承認NOを発番して取得します。
		 */
		protected String getIssuedAprvNo() {
			ElmArgsR elm = ElmArgsR.create();
			elm.co_cd(getCo().co_cd());
			elm.dt(getToday());
			return getNum(MAC_NUM_BIZ_TYP.APRV, elm);
		}

		/**
		 * 承認情報ヘッダ（登録対象）を作成します。
		 */
		protected void crtRegHdr() {
			MCList<Aprv_Upd01_Wk1R>[] wkGLArr =
					_wkL.groupList(Aprv_Upd01_Wk1R.$peg_no);
			for (MCList<Aprv_Upd01_Wk1R> wkGL : wkGLArr) {
				Aprv_Upd01_Wk1R wkGR = wkGL.get(0);
				MBT_APRV_R regHdrR = _regHdrL.createRow();
				Aprv_Chk01_Rslt1R upR = _upMap.get(wkGR.peg_no());
				regHdrR.aprv_no(wkGR.aprv_no());
				regHdrR.aprv_no_seq(wkGR.aprv_no_seq());
				regHdrR.aprv_sts_typ(MAC_APRV_STS_TYP.OPN.value());
				regHdrR.ins_dt(MCDate.now().trunc(MCDateFieldType.DAY));
				regHdrR.biz_usr_cd(upR.biz_usr_cd());
				regHdrR.src_ins_usr_cd(MCSys.user.ID());
				regHdrR.master_dt(upR.master_dt());
				regHdrR.aprv_func_typ(upR.aprv_func_typ());
				regHdrR.aprv_rt_ptn(wkGR.aprv_rt_ptn());
				regHdrR.aprv_row_num(wkGR.aprv_row_num());
				regHdrR.src_itm_cd(upR.src_itm_cd());
				regHdrR.src_itm_sub1(upR.src_itm_sub1());
				regHdrR.src_itm_sub2(upR.src_itm_sub2());
				regHdrR.src_itm_sub3(upR.src_itm_sub3());
				regHdrR.src_dpt_cd(upR.src_dpt_cd());
				regHdrR.src_bp_cd(upR.src_bp_cd());
				regHdrR.src_cur_cd1(upR.src_cur_cd1());
				regHdrR.src_amt1(upR.src_amt1());
				regHdrR.src_cur_cd2(upR.src_cur_cd2());
				regHdrR.src_amt2(upR.src_amt2());
				regHdrR.src_cur_cd3(upR.src_cur_cd3());
				regHdrR.src_amt3(upR.src_amt3());
				regHdrR.src_ext_key1(upR.src_ext_key1());
				regHdrR.src_ext_key2(upR.src_ext_key2());
				regHdrR.src_ext_key3(upR.src_ext_key3());
				regHdrR.aprv_src_no1(upR.aprv_src_no1());
				regHdrR.aprv_src_no2(upR.aprv_src_no2());
				regHdrR.aprv_upd_flg(wkGR.aprv_upd_flg());
				regHdrR.aprv_can_flg(wkGR.aprv_can_flg());
				_regHdrL.add(regHdrR);
			}
		}

		/**
		 * 承認情報明細（登録対象）を作成します。
		 */
		protected void crtRegDtl() {
			for (Aprv_Upd01_Wk1R wkR : _wkL) {
				MBT_APRV_D_R regDtlR = _regDtlL.createRow();
				regDtlR.aprv_no(wkR.aprv_no());
				regDtlR.aprv_no_seq(wkR.aprv_no_seq());
				regDtlR.aprv_role_cd(wkR.aprv_role_cd());
				regDtlR.aprv_usr_cd(wkR.aprv_usr_cd());
				regDtlR.aprv_seq(wkR.aprv_seq());
				regDtlR.aprv_d_sts_typ(MAC_APRV_D_STS_TYP.OPN.value());
				regDtlR.not_upd_flg(wkR.not_upd_flg());
				_regDtlL.add(regDtlR);
			}
		}

		/**
		 * 承認情報ヘッダを登録します。
		 */
		protected void regHdr() {
			MCQueryApiBuilder regHdrL_bldr = MCQueryApiBuilder.create(MBT_APRV_R.create("T"));
			dbInsertEx("MBBAL5010_MBT_APRV_I01", _regHdrL, regHdrL_bldr);
		}

		/**
		 * 承認情報明細を登録します。
		 */
		protected void regDtl() {
			MCQueryApiBuilder regDtlL_bldr = MCQueryApiBuilder.create(MBT_APRV_D_R.create("T"));
			dbInsertEx("MBBAL5010_MBT_APRV_D_I01", _regDtlL, regDtlL_bldr);
		}

		/**
		 * 下り電文を作成します。
		 */
		protected void crtDown() {
			Map<List<Comparable<?>>, Aprv_Upd01_Wk1R> wkMap =
					crtRowMap(_wkL, Aprv_Upd01_Wk1R.$peg_no);
			for (Aprv_Chk01_Rslt1R upR : up0()) {
				Aprv_Upd01_Dtl1R downR = down0().createRow();
				Comparable<?> val = upR.peg_no();
				Aprv_Upd01_Wk1R wkR = getMapVal(wkMap, val);
				boolean wk = (wkR != null);
				downR.peg_no(upR.peg_no());
				downR.aprv_no(wk ? wkR.aprv_no() : null);
				downR.aprv_flg(wk);
				down0().add(downR);
			}
		}

		/**
		 * プッシュ通知処理を呼び出します。
		 */
		protected void callPushNtc() {
			if (_regHdrL.isEmpty()) {
				return;
			}
			
			String[] dtlCols = new String[] {
				  MBT_APRV_D_R.$aprv_no
				, MBT_APRV_D_R.$aprv_no_seq
			};
			Map<List<Comparable<?>>, MCList<MBT_APRV_D_R>> dtlLMap =
					crtListMap(_regDtlL, dtlCols);
			MAUCL_PushNtcMgr mgr = MAUCL_PushNtcMgr.create();
			// ************************************************************
			String[] hdrCols = new String[] {
				  MBT_APRV_R.$aprv_no
				, MBT_APRV_R.$aprv_no_seq
			};
			String roleCol = MBT_APRV_D_R.$aprv_role_cd;
			MCRowMatcher<MBT_APRV_D_R> tgtRM = r -> !r.not_upd_flg();
			// ************************************************************
			List<BiConsumer<MAM_BP_R, MBT_APRV_R>> bpCpyL =
					new ArrayList<>();
			bpCpyL.add((d, s) -> {d.bp_cd(s.src_bp_cd());});
			
			BiConsumer<MCDBContainer, MCQueryApiBuilder> bpCnd = (t, r_bldr) -> {
				r_bldr.setSelect(t.getColumn$("bp_cd"), t.getColumn$("bp_nm"));
			};
			Map<List<Comparable<?>>, MAM_BP_R> bpMap = getMap(
					MAM_BP_R.class, _regHdrL, bpCpyL, bpCnd);
			List<BiConsumer<MAM_USR_R, MBT_APRV_R>> usrCpyL =
					new ArrayList<>();
			usrCpyL.add((d, s) -> {d.usr_cd(s.biz_usr_cd());});
			usrCpyL.add((d, s) -> {d.usr_cd(s.src_ins_usr_cd());});
			
			BiConsumer<MCDBContainer, MCQueryApiBuilder> usrCnd = (t, r_bldr) -> {
				r_bldr.setSelect(t.getColumn$("usr_cd"), t.getColumn$("usr_nm"));
			};
			Map<List<Comparable<?>>, MAM_USR_R> usrMap = getMap(
					MAM_USR_R.class, _regHdrL, usrCpyL, usrCnd);
			List<BiConsumer<MAM_CUR_R, MBT_APRV_R>> curCpyL =
					new ArrayList<>();
			curCpyL.add((d, s) -> {d.cur_cd(s.src_cur_cd1());});
			
			BiConsumer<MCDBContainer, MCQueryApiBuilder> curCnd = (t, r_bldr) -> {
				r_bldr.setSelect(t.getColumn$("cur_cd"), t.getColumn$("cur_nm"));
			};
			Map<List<Comparable<?>>, MAM_CUR_R> curMap = getMap(
					MAM_CUR_R.class, _regHdrL, curCpyL, curCnd);
			// ************************************************************
			for (MBT_APRV_R hdrR : _regHdrL) {
				Comparable<?>[] vals = hdrR.toArray(hdrCols);
				MCList<MBT_APRV_D_R> dtlL = getMapVal(dtlLMap, vals);
				if (dtlL == null) {
					continue;
				}
				List<String> roleL = dtlL.subList(
						tgtRM).groupBy(roleCol).getString(roleCol);
				// ************************************************************
				String nStr = getMsgNullStr();
				MAC_APRV_FUNC_TYP aprvFuncTyp =
						MAC_APRV_FUNC_TYP.get(hdrR.aprv_func_typ());
				String aprvFuncTypNm = (aprvFuncTyp == null ?
						nStr : aprvFuncTyp.name(MCSys.user.locale()));
				MAM_BP_R bpR = getMapVal(bpMap, hdrR.src_bp_cd());
				String srcBpNm = (bpR == null ? nStr : bpR.bp_nm());
				MAM_USR_R usrR1 = getMapVal(usrMap, hdrR.biz_usr_cd());
				String bizUsrNm = (usrR1 == null ? nStr : usrR1.usr_nm());
				MAM_USR_R usrR2 = getMapVal(usrMap, hdrR.src_ins_usr_cd());
				String srcInsUsrNm = (usrR2 == null ? nStr : usrR2.usr_nm());
				MAM_CUR_R curR = getMapVal(curMap, hdrR.src_cur_cd1());
				String srcCurNm1 = (curR == null ? nStr : curR.cur_nm());
				String srcAmt1 = nvl(hdrR.src_amt1(), nStr).toString();
				// ************************************************************
				MAUCL_PushNtcInfo info1 =
						mgr.createInfo(MAC_PUSH_NTC_TYP.APRV_RQST_MAIN);
				for (String role : roleL) {
					info1.addAprvRole(role, hdrR.master_dt());
				}
				if (hdrR.aprv_no_seq().lte(1)) {
					info1.setMsg(new MCMessage(MBBAL1001,
							aprvFuncTypNm, srcBpNm,
							bizUsrNm, srcInsUsrNm, srcCurNm1, srcAmt1));
				}
				else {
					info1.setMsg(new MCMessage(MBBAL1003,
							aprvFuncTypNm, hdrR.aprv_no(), srcBpNm,
							bizUsrNm, srcInsUsrNm, srcCurNm1, srcAmt1));
				}
				info1.addScrBind(hdrR.aprv_no(), true, false);
				MAUCL_PushNtcInfo info2 =
						mgr.createInfo(MAC_PUSH_NTC_TYP.APRV_RQST_SUB);
				for (String role : roleL) {
					info2.addAprvRole(role, hdrR.master_dt());
				}
				if (hdrR.aprv_no_seq().lte(1)) {
					info2.setMsg(new MCMessage(MBBAL1002,
							aprvFuncTypNm, srcBpNm,
							bizUsrNm, srcInsUsrNm, srcCurNm1, srcAmt1));
				}
				else {
					info2.setMsg(new MCMessage(MBBAL1003,
							aprvFuncTypNm, hdrR.aprv_no(), srcBpNm,
							bizUsrNm, srcInsUsrNm, srcCurNm1, srcAmt1));
				}
				info2.addScrBind(hdrR.aprv_no(), false, true);
				// ************************************************************
			}
			mgr.exec();
		}

	}

	/**
	 * メッセージにおけるNULL文字を取得します。
	 */
	protected String getMsgNullStr() {
		return "-";
	}

	/**
	 * Aprv_Upd02オペレーション.<p>
	 *
	 * 承認次処理済に更新する。<br>
	 */
	public class Aprv_Upd02 extends MBBAL_AprvService_MC_A.Aprv_Upd02 {

		@Override
		protected void call() {
			regHdr();
		}


		/**
		 * 承認情報ヘッダを登録します。
		 */
		protected void regHdr() {
			updNextOprFlg(up0(), true);
		}

	}

	/**
	 * Aprv_Upd03オペレーション.<p>
	 *
	 * 承認次処理済を解除する。<br>
	 */
	public class Aprv_Upd03 extends MBBAL_AprvService_MC_A.Aprv_Upd03 {

		@Override
		protected void call() {
			regHdr();
		}

		/**
		 * 承認情報ヘッダを登録します。
		 */
		protected void regHdr() {
			updNextOprFlg(up0(), false);
		}

	}

	/**
	 * Aprv_Del01オペレーション.<p>
	 *
	 * 承認情報を削除する。<br>
	 */
	public class Aprv_Del01 extends MBBAL_AprvService_MC_A.Aprv_Del01 {

		// 事前に外部から Aprv_Chk04 が呼び出されている想定

		@Override
		protected void call() {
			delI();
		}

		/**
		 * 承認情報を削除します。
		 */
		protected void delI() {
			Function<Aprv_Chk04_Rslt1R, Comparable<?>[]> func = r -> {
				return new Comparable<?>[] {
					  r.aprv_no()
				};
			};
			del(up0(), func);
		}

	}

	/**
	 * 承認情報を削除します。
	 */
	protected <T extends MCRow> void del(
			MCList<T> upL, Function<T, Comparable<?>[]> func) {
		if (upL == null) {
			return;
		}
		MCList<MBT_APRV_R> delL = MCList.create(MBT_APRV_R.class);
		MCList<MBT_APRV_R> canL = MCList.create(MBT_APRV_R.class);
		for (T upR : upL) {
			Comparable<?>[] vals = func.apply(upR);
			MBT_APRV_R hdrR = getMapVal(getHdrMap(), vals);
			if (hdrR == null) {
				continue;
			}
			if (MAC_APRV_STS_TYP.isOPN(hdrR.aprv_sts_typ())) {
				delL.add(hdrR);
			}
			else {
				canL.add(hdrR);
			}
		}
		delHdr(delL);
		delDtl(delL);
		canHdr(canL);
	}

	/**
	 * 承認情報ヘッダを物理削除します。
	 */
	protected <T extends MCRow> void delHdr(MCList<T> bindL) {
		MBT_APRV_R t = MBT_APRV_R.create("T");
		execDbDeleteKey("MBBAL5010_MBT_APRV_D01", t, bindL);
	}

	/**
	 * 承認情報明細を物理削除します。
	 */
	protected <T extends MCRow> void delDtl(MCList<T> bindL) {
		
		String[] cols = new String[] {
				MBT_APRV_D_R.$aprv_no, MBT_APRV_D_R.$aprv_no_seq
		};
		MCPredicate condition = null;
		MBT_APRV_D_R t = MBT_APRV_D_R.create("T");
		for (String col : cols) {
			MCPredicate c = MCQueryApiBuilder.makeEq(t.getColumn$(col), bind(col));
			if (t.isNullableColumn(col)) {
				c = c.or(MCQueryApiBuilder.makeIsNull(t.getColumn$(col)).and(bind(col).isNull()));
			}
			condition = (condition == null) ? c : condition.and(c);
		}
		
		execDbDelete("MBBAL5010_MBT_APRV_D_D01", t, condition, bindL);
	}

	/**
	 * 承認情報ヘッダを論理削除します。
	 */
	protected <T extends MCRow> void canHdr(MCList<T> bindL) {
		MBT_APRV_R dbc = MBT_APRV_R.create("T");
		MCQueryApiBuilder builder = MCQueryApiBuilder.create(dbc);
		builder.setSet("can_flg", dbc.can_flg, value(true));
		dbUpdateKey("MBBAL5010_MBT_APRV_U01", bindL, builder);
	}

	/**
	 * 次処理済フラグを更新します。
	 */
	protected void updNextOprFlg(
			MCList<Aprv_Chk02_Rslt1R> upL, boolean flg) {
		if (upL == null) {
			return;
		}
		MCList<MBT_APRV_R> regHdrL = MCList.create(MBT_APRV_R.class);
		for (Aprv_Chk02_Rslt1R upR : upL) {
			MBT_APRV_R regHdrR = regHdrL.createRow();
			Comparable<?> val = upR.aprv_no();
			MBT_APRV_R hdrR = getMapVal(getHdrMap(), val);
			regHdrR.aprv_no(upR.aprv_no());
			regHdrR.aprv_no_seq(hdrR.aprv_no_seq());
			regHdrR.next_opr_flg(flg);
			regHdrL.add(regHdrR);
		}
		MBT_APRV_R t = MBT_APRV_R.create("T");
		MCQueryApiBuilder regHdrL_bldr = MCQueryApiBuilder.create(t);
		regHdrL_bldr.setSet(t.next_opr_flg);
		dbUpdateKey("MBBAL5010_MBT_APRV_U02", regHdrL, regHdrL_bldr);
	}

	// **********************************************************************

	/**
	 * テーブルのデータを検索するマップを取得します。
	 */
	protected <D extends MCDBContainer, S extends MCRow> Map<List<Comparable<?>>, D> getMap(
			Class<D> clazz, MCList<S> bindL, List<BiConsumer<D, S>> cpyL,
			BiConsumer<MCDBContainer, MCQueryApiBuilder> cnd, String... cols) {
		MCDBContainer wkTbl = getRegWk(clazz, bindL, cpyL);
		if (wkTbl == null) {
			return null;
		}
		MCList<D> dbcL = MCList.create(clazz);
		D dbcR = dbcL.createRow();
		dbcR.setAlias("T");
		MCQueryApiBuilder dbcR_bldr = MCQueryApiBuilder.create(dbcR);
		if (cnd != null) {
			cnd.accept(dbcR, dbcR_bldr);
		}
		setSelWk(dbcR, dbcR_bldr, wkTbl, false);
		dbcR_bldr.buildSelect(createSqlId(LOGIC_ID, dbcR_bldr.getBaseDbc(), "S50")).executeQuery(dbcL);
		String[] keyCols = (cols == null || cols.length == 0 ?
				dbcR.getKeyColumn() : cols);
		return crtRowMap(dbcL, keyCols);
	}

	/**
	 * ワークテーブルにデータを登録し、当ワークテーブルの名称を取得します。
	 */
	protected <D extends MCDBContainer, S extends MCRow> MCDBContainer getRegWk(
			Class<D> clazz, MCList<S> bindL, List<BiConsumer<D, S>> cpyL) {
		if (clazz == null || bindL == null || cpyL == null) {
			return null;
		}
		MCList<D> dbcL = MCList.create(clazz);
		D protoR = dbcL.createRow();
		
		//ワークテーブルのＤＢコンテナを作成する
		MCDBContainer wkTbl = protoR.getPkWorkDbc("W");
		if (wkTbl == null) {
			return null;
		}
		MCQueryApiBuilder wK_bldr = MCQueryApiBuilder.create(wkTbl);
		
		//ワークテーブルをクリアする
		execDbWkDelete(createSqlId(LOGIC_ID, wK_bldr.getBaseDbc(), "D50"), wkTbl);
		
		//VALUES句の項目をDBContainerのカラム名で設定する
		wK_bldr.setValues(wK_bldr.getBaseDbc().getKeyColumn$());
		
		for (S bindR : bindL) {
			for (BiConsumer<D, S> cpy : cpyL) {
				D dbcR = dbcL.createRow();
				cpy.accept(dbcR, bindR);
				dbcL.add(dbcR);
			}
		}
		
		//ワークテーブルにデータを登録する
		wK_bldr.buildInsert(createSqlId(LOGIC_ID, wK_bldr.getBaseDbc(), "I50")).executeBatchUpdate(dbcL);
		
		return wkTbl;
	}

	/**
	 * ワークテーブルに紐付く検索を行う設定を施します。
	 */
	protected <D extends MCDBContainer> D setSelWk(D dbcR, MCQueryApiBuilder dbcR_bldr,
			MCDBContainer wkTbl, boolean lock, String... cols) {
		if (dbcR == null) {
			return null;
		}
		
		MCDBContainer selWkTbl = (wkTbl == null ? dbcR.getPkWorkDbc("W") : wkTbl);
		if (selWkTbl == null) {
			return dbcR;
		}
		String[] joinCols = (cols == null || cols.length == 0 ?
				dbcR.getKeyColumn() : cols);
		if (joinCols.length == 0) {
			return dbcR;
		}
		
		MCPredicate condition = null;
		for (String col : joinCols) {
			MCPermColumn mainCol = dbcR.getColumn$(col);
			MCPermColumn wkCol = selWkTbl.getColumn$(col);
			MCPredicate c = MCQueryApiBuilder.makeEq(mainCol, wkCol);
			if (dbcR.isNullableColumn(col)) {
				c = c.or(MCQueryApiBuilder.makeIsNull(mainCol).and(MCQueryApiBuilder.makeIsNull(wkCol)));
			}
			condition = (condition == null) ? c : condition.and(c);
		}
		dbcR_bldr.addInnerJoin(selWkTbl, condition);
		
		if (lock) {
			dbcR_bldr.setOrderByAsc(dbcR_bldr.getBaseDbc().getKeyColumn$());
			dbcR_bldr.setLockTable(dbcR.getColumn$(joinCols[0]));
		}
		return dbcR;
	}

	/**
	 * コンテナを取得するマップを作成します。
	 */
	protected <T extends MCRow> Map<List<Comparable<?>>, T>
			crtRowMap(MCList<T> tgtL, String... cols) {
		Map<List<Comparable<?>>, T> ret = new HashMap<>();
		if (tgtL == null) {
			return ret;
		}
		MCList<T>[] tgtGLArr = tgtL.groupList(cols);
		for (MCList<T> tgtGL : tgtGLArr) {
			// tgtGL.size() == 1 を想定
			for (T tgtGR : tgtGL) {
				Comparable<?>[] vals = tgtGR.toArray(cols);
				ret.put(Arrays.asList(vals), tgtGR);
			}
		}
		return ret;
	}

	/**
	 * コンテナを取得するマップを作成します。
	 */
	protected <T extends MCRow> Map<List<Comparable<?>>, MCList<T>>
			crtListMap(MCList<T> tgtL, String... cols) {
		Map<List<Comparable<?>>, MCList<T>> ret = new HashMap<>();
		if (tgtL == null) {
			return ret;
		}
		MCList<T>[] tgtGLArr = tgtL.groupList(cols);
		for (MCList<T> tgtGL : tgtGLArr) {
			Comparable<?>[] vals = tgtGL.get(0).toArray(cols);
			ret.put(Arrays.asList(vals), tgtGL);
		}
		return ret;
	}

	/**
	 * マップから値を取得します。
	 */
	protected <T> T getMapVal(
			Map<List<Comparable<?>>, T> map, Comparable<?>... vals) {
		return map.get(Arrays.asList(vals));
	}

	//FMCB CUSTOM END
}