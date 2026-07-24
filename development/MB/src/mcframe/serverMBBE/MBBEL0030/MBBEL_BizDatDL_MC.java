package mcframe.serverMBBE.MBBEL0030;

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
import static mcframe.serverMBBE.MBBEL0030.Query.*;
import mcframe.commonCore.resource.ctrl.MCCustomResource;
import mcframe.serverCore.sys.MCSys;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.acl.MCACLManager;
import mcframe.serverCore.mcjdbc.MCSQLParser;
import java.util.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBEL_BizDatDL"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBEL_BizDatDL_MC extends MBBEL_BizDatDL_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 業務データを検索する<br>
	 */
	public class Srch01 extends MBBEL_BizDatDL_MC_A.Srch01 {
		protected static final String RES_NM = "MCBizDatDl";

		protected static final String RES_CND_LBL = "cnd_lbl";

		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			executeQuery(down0(), MBBEL0030_MBT_BIZ_DAT_DL_S01(), up0());

			editDown0();

			// リソースを読み込み、検索条件項目のラベルを取得する
			if (up0().res_flg()) {
				setLabel(down0());
			}
		}

		/**
		 * 下り電文を加工する。<p>
		 * <li>権限チェックがＯＫのレコードに絞り込む
		 * <li>前回ファイル作成時間を設定する
		 * <li>文字列条件リストを設定する
		 */
		protected void editDown0() {
			MCList<Srch01_RsltR> l = MCList.create(Srch01_RsltR.class);
			MCACLManager m = MCACLManager.createClientManager();
			for (Srch01_RsltR r : down0()) {
				if (m.authorize(r.module_id(), r.logic_id(), r.func_actyp(),
						r.biz_dat_nm())) {
					l.add(r);
				}
			}
			down0().setAll(l);
			setStrCndList();
		}

		/**
		 * 下り電文に文字列条件リストを設定する
		 */
		protected void setStrCndList() {
			StringBuilder bind = new StringBuilder();
			MCSQLParser parser = MCSQLParser.create();
			HashSet<String> findl = new HashSet<>();
			for (Srch01_RsltR r : down0()) {
				if (MAC_BIZ_DAT_GET_TYP.isSQL_REG(r.biz_dat_get_typ())) {
					String d = "";
					parser.parse(r.sql_src(), null, null, false);
					for (String s : parser.getExecuteList()) {
						String su = s.toUpperCase();
						if (!findl.contains(su)) {
							bind.append(d).append(s);
							d = ",";
							findl.add(su);
						}
					}
					if (bind.length() > 0) {
						r.str_cnd_list(bind.toString());
						bind.delete(0, bind.length());
						findl.clear();
					}
				}
			}
		}

		/**
		 * MCCustomResourceを継承したクラス（CONSTタイプとするため）
		 */
		private class MCBizDatDlResource extends MCCustomResource {
			MCBizDatDlResource(String name) {
				super(Type.CONST, name);
			}
		}

		/**
		 * リソースをロードしてラベルの設定
		 */
		protected void setLabel(MCList<Srch01_RsltR> list) {
			for (Srch01_RsltR r : list) {
				try {
					MCBizDatDlResource cr = new MCBizDatDlResource(RES_NM);
					cr.loadInit(null, r.res_path(), MCSys.user.locale());

					setLabelSub(cr, r, "dt_cond_col", "dt_lbl", 10);
					setLabelSub(cr, r, "str_cond_col", "str_lbl", 5);
					setLabelSub(cr, r, "num_cond_col", "num_lbl", 5);
					setLabelSub(cr, r, "flg_cond_col", "flg_lbl", 5);
				}
				catch (Exception e) {
					// 何もしない
				}
			}
		}

		/**
		 * ラベルの設定
		 */
		protected void setLabelSub(MCBizDatDlResource cr, Srch01_RsltR r, String bindNm,
				String lblNm, int condNum) {
			for (int i = 1; i <= condNum; i++) {
				String bind = r.getString(bindNm + i);
				if (bind != null) {
					String key = MCConst.createKey(r.biz_dat_id(), RES_CND_LBL, bind);
					String lbl = cr.getString(key);
					if (lbl == null) {
						lbl = bind;
					}
					r.setString(lblNm + i, lbl);
				}
			}
		}
	}

	//FMCB CUSTOM END
}