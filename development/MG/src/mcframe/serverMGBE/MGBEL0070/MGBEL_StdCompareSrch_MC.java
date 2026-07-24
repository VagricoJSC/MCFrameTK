package mcframe.serverMGBE.MGBEL0070;

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
import static mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil.*;
import static mcframe.serverMAUC.MAUCL0020.MAUCL_AppSys.*;
import static mcframe.serverMAUC.MAUCL0030.MAUCL_Dac.*;
import static mcframe.serverMAUC.MAUCL0060.MAUCL_Num.*;
import mcframe.commonMB.constant.*;
import mcframe.serverMB.dbc.*;
import static mcframe.commonMB.notice.MB_Msg.*;
import static mcframe.serverMBUC.MBUCL0010.MBUCL_MCDataUtil.*;
import static mcframe.serverMGUC.MGUCL0020.MGUCL_AppSys.*;
import mcframe.commonMG.constant.*;
import mcframe.serverMG.dbc.*;
import static mcframe.commonMG.notice.MG_Msg.*;

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import static mcframe.serverFXBA.FXBAL0120.FXBAL_BatchLogManager.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBCFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMG.dbc.MGFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import static mcframe.serverMGBE.MGBEL0070.Query.*;
import java.util.ArrayList;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBEL_StdCompareSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBEL_StdCompareSrch_MC extends MGBEL_StdCompareSrch_MC_A{
	//FMCB CUSTOM START
	/** 製造原価 */
	protected static final String MFG_COST = "0";
	/** 総原価 */
	protected static final String TOTAL_COST = "1";
	// 原価種別
	protected String _costTyp = null;

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 標準計算結果比較の検索を行います。<br>
	 */
	public class Srch01 extends MGBEL_StdCompareSrch_MC_A.Srch01 {

		/** 数量取得用のキー */
		protected String[] _qtyKeys = new String[] {
				Srch01_RsltR.$wg_cd,
				Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub2, Srch01_RsltR.$itm_sub3,
				Srch01_RsltR.$dpt_cd, Srch01_RsltR.$dpt_nm,
				Srch01_RsltR.$cst_cd, Srch01_RsltR.$dlv_cd, 
				Srch01_RsltR.$dest_cd1, Srch01_RsltR.$dest_cd2, Srch01_RsltR.$dest_cd3,
				Srch01_RsltR.$tgt_no
				};
		/** 単価比較用のキー */
		protected String[] _diffKeys = new String[] {
				Srch01_RsltR.$wg_cd,
				Srch01_RsltR.$itm_cd, Srch01_RsltR.$itm_sub1, Srch01_RsltR.$itm_sub2, Srch01_RsltR.$itm_sub3,
				Srch01_RsltR.$dpt_cd, Srch01_RsltR.$dpt_nm,
				Srch01_RsltR.$cst_cd, Srch01_RsltR.$dlv_cd,
				Srch01_RsltR.$dest_cd1, Srch01_RsltR.$dest_cd2, Srch01_RsltR.$dest_cd3
		};

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			editUp();
			srch();
		}

		protected void editUp() {
			_costTyp = up0().ope();

			up0().addStringColumn("no_dpt_flg_str", toTrueStr(up0().no_dpt_flg()));
			up0().addStringColumn("no_cst_flg_str", toTrueStr(up0().no_cst_flg()));
			up0().addStringColumn("no_dlv_flg_str", toTrueStr(up0().no_dlv_flg()));
			up0().addStringColumn("no_dest1_flg_str", toTrueStr(up0().no_dest1_flg()));
			up0().addStringColumn("no_dest2_flg_str", toTrueStr(up0().no_dest2_flg()));
			up0().addStringColumn("no_dest3_flg_str", toTrueStr(up0().no_dest3_flg()));
			if (isSame(_costTyp, MFG_COST)) {
				up0().addStringColumn("mfg_flg_str", "1");
				up0().addStringColumn("sls_flg_str", "0");
			}
			else {
				up0().addStringColumn("all_flg_str", "1");
				up0().addStringColumn("sls_flg_str", "1");
			}
		}

		protected void srch() {
			addDynamicBind(up0(), down0());
			executeQuery(down0(), MGBEL0070_MGT_STD_TOP_S01(), up0());
			if (down0().isEmpty()) {
				return;
			}
			MCList<Srch01_QtyR> list = MCList.create(Srch01_QtyR.class);
			executeQuery(list, MGBEL0070_MGT_STD_TOP_S02(), up0());
			setQty(list);
		}

		/** 数量取得および単価計算 */
		protected void setQty(MCList<Srch01_QtyR> list) {
			MCIndexKey idx = list.createIndex(_qtyKeys);
			for (Srch01_RsltR r : down0()) {
				Srch01_QtyR qtyR = list.getFirst(idx, r.toArray(_qtyKeys));
				if (qtyR == null) {
					r.qty(0);
					r.qty_unit(0);
				}
				else {
					r.qty(qtyR.qty());
					r.qty_unit(calcUnit(r.ttl(), nvl(r.qty(), MCNumber.ZERO), Srch01_RsltR.qty_unit_META.scale()));
				}
			}
		}

		@Override
		protected void editListMain() {
			super.editListMain();
			if (down0().isEmpty()) {
				return;
			}
			setDiff();
			setDown();
		}

		/** 単価差異フラグ設定 */
		protected void setDiff() {
			MCList<Srch01_RsltR> chkdList = MCList.create(Srch01_RsltR.class);
			for (Srch01_RsltR r : down0()) {
				if (chkdList.getFirst(_diffKeys, r.toArray(_diffKeys)) != null) {
					continue;
				}
				chkdList.add(r);
				Comparable<?>[] val1 = new Comparable<?>[] {
						r.wg_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dpt_cd(), r.dpt_nm(), r.cst_cd(),
						r.dlv_cd(), r.dest_cd1(), r.dest_cd2(), r.dest_cd3(), MCNumber.ONE
						};
				Comparable<?>[] val2 = new Comparable<?>[] {
						r.wg_cd(), r.itm_cd(), r.itm_sub1(), r.itm_sub2(), r.itm_sub3(), r.dpt_cd(), r.dpt_nm(), r.cst_cd(),
						r.dlv_cd(), r.dest_cd1(), r.dest_cd2(), r.dest_cd3(), MCNumber.valueOf(2)
						};

				MCList<Srch01_RsltR> l1 = down0().subList(_qtyKeys, val1);
				MCList<Srch01_RsltR> l2 = down0().subList(_qtyKeys, val2);
				// 必ず１行
				boolean diff = !isSame(l1.get(0).qty_unit(), l2.get(0).qty_unit());
				l1.get(0).diff_flg(diff);
				l2.get(0).diff_flg(diff);
			}
		}

		/** 検索条件に合わせて結果を抽出する */
		protected void setDown() {
			if (up0().diff_flg() && up0().no_diff_flg()) {
				// すべて表示時はそのまま
				return;
			}
			MCList<Srch01_RsltR> newList = MCList.create(Srch01_RsltR.class);
			down0().forEach(r -> {
				if (up0().diff_flg() && r.diff_flg() || !up0().diff_flg() && !r.diff_flg()) {
					newList.add(r);
				}
			});
			down0().setAll(newList);
		}
	}

	@Override
	protected ArrayList<String> getValidExpnsTyp() {
		ArrayList<String> list = new ArrayList<String>();
		list.add(MAC_EXPNS_TYP.PROD.value());
		// 総原価の場合は販管費も追加
		if (isSame(_costTyp, TOTAL_COST)) {
			list.add(MAC_EXPNS_TYP.SGA.value());
		}
		return list;
	}

	@Override
	protected String[] getSumTgtCols() {
		String[] stringArray = {
				"T.STD_COST"
		};
		return stringArray;
	}

	//FMCB CUSTOM END
}