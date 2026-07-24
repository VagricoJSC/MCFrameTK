package mcframe.serverMGBF.MGBFL0410;

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
import java.util.ArrayList;
import java.util.List;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMGBF.MGBFL0410.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_RptCmp"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_RptCmp_MC extends MGBFL_RptCmp_MC_A{
	//FMCB CUSTOM START

	/**
	 * 横展開キー項目用バインド変数名１：横展開キー項目１を格納するバインド変数名のベース文字列
	 */
	protected static final String BIND_RPT_KEY_1 = "bind_rpt_key_1_";

	/**
	 * 横展開キー項目用バインド変数名２：横展開キー項目２を格納するバインド変数名のベース文字列
	 */
	protected static final String BIND_RPT_KEY_2 = "bind_rpt_key_2_";

	/**
	 * 横展開キー項目用バインド変数名３：横展開キー項目３を格納するバインド変数名のベース文字列
	 */
	protected static final String BIND_RPT_KEY_3 = "bind_rpt_key_3_";

	/**
	 * 横展開キー項目用バインド変数名４：横展開キー項目４を格納するバインド変数名のベース文字列
	 */
	protected static final String BIND_RPT_KEY_4 = "bind_rpt_key_4_";

	/**
	 * 横展開キー項目用バインド変数名５：横展開キー項目５を格納するバインド変数名のベース文字列
	 */
	protected static final String BIND_RPT_KEY_5 = "bind_rpt_key_5_";

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 原価レポートを比較する<br>
	 */
	public class Srch01 extends MGBFL_RptCmp_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			srchRptCmpConf();
			if (down2().isEmpty()) {
				return;
			}
			srchRptKeyConf();
			if (down1().isEmpty()) {
				down2().clear();
				return;
			}
			editDown1();
			srchRpt();
			if (down0().isEmpty()) {
				down1().clear();
				down2().clear();
			}
			editDown0();
		}
		
		protected void srchRptCmpConf() {
			executeQuery(down2(), MGBFL0410_MAM_RPT_CMP_CONF_S01(), up0());
		}

		protected void srchRptKeyConf() {
			executeQuery(down1(), MGBFL0410_MAM_RPT_KEY_CONF_S01(), up0());
		}
		
		protected void editDown1() {
			down1().sort(Srch01_KeyR.$rpt_key_seq);
			for (Srch01_KeyR src : down1()) {
				if (MAC_RPT_KEY_TYP.isMNG_DPT(up0().rpt_key_typ())) {
					src.cd(src.dpt_cd());
					src.nm(src.dpt_nm());
				}
				else if (MAC_RPT_KEY_TYP.isWG(up0().rpt_key_typ())) {
					src.cd(src.wg_cd());
					src.nm(src.wg_nm());
				}
				else if (MAC_RPT_KEY_TYP.isITM(up0().rpt_key_typ())) {
					src.cd(toDispItm(src.itm_cd(), src.itm_sub1(), src.itm_sub2(), src.itm_sub3()));
					src.nm(src.itm_nm());
				}
				else if (MAC_RPT_KEY_TYP.isITM_JNL(up0().rpt_key_typ())) {
					src.cd(src.itm_jnl_cd());
					src.nm(src.itm_jnl_nm());
				}
				else {
					src.cd(src.itm_grp_typ() + " * " + src.itm_grp_cd());
					src.nm(src.itm_grp_nm());
				}
			}
		}

		protected void srchRpt() {
			executeQuery(down0(), getRptSrchSql(), up0());
		}

		protected MCQueryPlan getRptSrchSql() {
			int i = 0;
			List<String> colList = new ArrayList<String>();
			for (Srch01_MstrR r2 : down2()) {
				if (!r2.sml_flg()) {
					String col = BIND_RPT_KEY_1 + i;
					colList.add(col);
					up0().addStringColumn(col, r2.col_cd());
					i++;
				}
				else {
					colList.add(null);
				}
			}
			i = 0;
			List<String[]> bindList = new ArrayList<String[]>();
			for (Srch01_KeyR r : down1()) {
				String[] b = new String[] {BIND_RPT_KEY_2 + i, BIND_RPT_KEY_3 + i, BIND_RPT_KEY_4 + i, BIND_RPT_KEY_5 + i};
				bindList.add(b);

				if (MAC_RPT_KEY_TYP.isMNG_DPT(up0().rpt_key_typ())) {
					up0().addStringColumn(b[0], r.dpt_cd());
				}
				else if (MAC_RPT_KEY_TYP.isWG(up0().rpt_key_typ())) {
					up0().addStringColumn(b[0], r.wg_cd());
				}
				else if (MAC_RPT_KEY_TYP.isITM(up0().rpt_key_typ())) {
					up0().addStringColumn(b[0], r.itm_cd());
					up0().addStringColumn(b[1], r.itm_sub1());
					up0().addStringColumn(b[2], r.itm_sub2());
					up0().addStringColumn(b[3], r.itm_sub3());
				}
				else if (MAC_RPT_KEY_TYP.isITM_JNL(up0().rpt_key_typ())) {
					up0().addStringColumn(b[0], r.itm_jnl_cd());
				}
				else {
					up0().addStringColumn(b[0], r.itm_grp_typ());
					up0().addStringColumn(b[1], r.itm_grp_cd());
				}
				i++;
			}
				return MGBFL0410_MGT_RPT_S01(bindList, colList, up0().rpt_key_typ());
		}

		protected void editDown0() {
			MCList<Srch01_MstrSmlR> list = MCList.create(Srch01_MstrSmlR.class);
			executeQuery(list, MGBFL0410_MAM_RPT_CMP_SML_S01(), up0());

			for (Srch01_DtlR src : down0()) {
				src.rpt_row_view(nvl(src.rpt_pre_word(), "") + nvl(src.rpt_row_nm(), ""));

				// 集計項目の設定
				for (int x = 0; x < down1().size(); x++) {
					for (Srch01_MstrR smlRow : down2().subList(
							Srch01_MstrR.$sml_flg, true)) {
						MCList<Srch01_MstrSmlR> sumList = list.subList(
								Srch01_MstrSmlR.$sml_col_cd, smlRow.col_cd());
						src.setNumberNE(getColName(smlRow.col_cd(), x), getSumValue(src, sumList, x));
					}
				}

				// 数値項目の結合
				ArrayList<String> col_all = new ArrayList<>();
				int idx = 0;
				for (int i = 0; i < down1().size(); i++) {
					for (int j = 0; j < down2().size(); j++) {
						MCNumber v = src.getNumberNE("col_" + idx);
						col_all.add(isNull(v) ? null : v.toString());
						idx++;
					}
				}
				src.col_all(MCStringUtil.arrayValueJoin(col_all.toArray(new String[0])));
			}
		}
		
		protected MCNumber getSumValue(Srch01_DtlR src, MCList<Srch01_MstrSmlR> sumList, int x) {
			MCNumber sum = MCNumber.ZERO;
			for (Srch01_MstrSmlR colRow : sumList) {
				String col = getColName(colRow.tgt_col_cd(), x);
				if (isNull(col) == false) {
					if (colRow.minus_flg()) {
						sum = sum.subtract(nvl(src.getNumberNE(col),
								MCNumber.ZERO));
					}
					else {
						sum = sum
								.add(nvl(src.getNumberNE(col), MCNumber.ZERO));
					}
				}
			}
			return sum;
		}

		protected String getColName(String colCd, int x) {
			int i = 0;
			for (Srch01_MstrR r : down2()) {
				if (isSame(r.col_cd(), colCd)) break;
				i++;
			}
			return "col_" + (down2().size() * x + i);
		}
	}

	//FMCB CUSTOM END
}