package mcframe.serverMGBF.MGBFL0400;

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
import static mcframe.serverMGBF.MGBFL0400.Query.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBFL_MlyRptSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBFL_MlyRptSrch_MC extends MGBFL_MlyRptSrch_MC_A{
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
	 * Srch01オペレーション.<p>
	 *
	 * 月別原価レポートを検索する<br>
	 */
	public class Srch01 extends MGBFL_MlyRptSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			srchKeyConf();
			if (down1().isEmpty()) {
				return;
			}
			editDown1();
			srchCalcFix();
			srchRpt();
		}

		protected void srchKeyConf() {
			executeQuery(down1(), MGBFL0400_MAM_RPT_KEY_CONF_S01(), up0());
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
					// カラムグループのラベルに表示するのでtoDispしている
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

		protected void srchCalcFix() {
			executeQuery(down2(), MGBFL0400_MGT_CALC_FIX_S01(), up0());
		}

		protected void srchRpt() {
			if (down1().isEmpty()) {
				return;
			}

			executeQuery(down0(), getRptSrchSql(), up0());

			// down0がなかったらdown1, down2, down3クリア
			if (down0().isEmpty()) {
				down1().clear();
				down2().clear();
				return;
			}
			srchCalcNo();

			for (Srch01_DtlR src : down0()) {
				src.rpt_row_view(nvl(src.rpt_pre_word(), "") + nvl(src.rpt_row_nm(), ""));

				ArrayList<String> col_all = new ArrayList<>();
				int i = 0;
				for (int x = 0; x < down1().size(); x++) {
					for (MCDate d = up0().ym_fr(); d.lte(up0().ym_to()); d = d.addMonth(1)) {
						MCNumber v = src.getNumberNE("col_" + i);
						col_all.add(isNull(v) ? null : v.toString());
						i++;
					}
				}
				src.col_all(MCStringUtil.arrayValueJoin(col_all.toArray(new String[0])));
			}
		}

		protected MCQueryPlan getRptSrchSql() {
			int i = 0;
			List<String> ymList = new ArrayList<String>();
			for (MCDate d = up0().ym_fr(); d.lte(up0().ym_to()); d = d.addMonth(1)) {
				String ym = "ym" + i;
				ymList.add(ym);
				up0().addDateColumn(ym, d);
				i++;
			}
			i = 0;
			List<String[]> bindList = new ArrayList<String[]>();
			for (Srch01_KeyR r : down1()) {
				String[] b = new String[] {BIND_RPT_KEY_1 + i, BIND_RPT_KEY_2 + i, BIND_RPT_KEY_3 + i, BIND_RPT_KEY_4 + i};
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

			return MGBFL0400_MGT_RPT_S01(bindList, ymList, up0().rpt_key_typ());
		}

		protected void srchCalcNo() {
			executeQuery(down3(), MGBFL0400_MGT_CALC_FIX_S02(), up0());
		}
	}

	//FMCB CUSTOM END
}