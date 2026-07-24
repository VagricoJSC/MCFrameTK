package mcframe.serverMABC.MABCL0040;

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

import static mcframe.serverFXUC.FXUCL0160.FXUCL_DateUtil.*;
import static mcframe.serverFXUC.FXUCL0170.FXUCL_ValidaterUtil.*;
import mcframe.serverCore.queryapi.MCQueryExecution.MCQueryPlan;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.commonMA.constant.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MABCL_MultiSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MABCL_MultiSrch_MC extends MABCL_MultiSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 複数のマスタ、名称マスタの検索を行います。<br>
	 */
	public class Srch01 extends MABCL_MultiSrch_MC_A.Srch01 {
		@Override
		protected void call() {

			String mstNm = getCnvStr(up0().mst_nm(), up0().partial_flg());
			String mstNmNm = getCnvStr(up0().mst_nm_nm(), up0().partial_flg());

			for (MAC_MST_NM cnst : MAC_MST_NM.array()) {
				if (cnst.is_multi()) {
					if (match(cnst, mstNm, mstNmNm)) {
						Srch01_Rslt1R r = Srch01_Rslt1R.create();
						r.mst_key(cnst.key());
						r.mst_nm(cnst.value());
						r.mst_nm_nm(cnst.name());
						r.multi_sort(cnst.multi_sort());
						
						MAM_MST_CTL_R t = MAM_MST_CTL_R.create("T");
						MCQueryApiBuilder bldr = MCQueryApiBuilder.create(t);
						bldr.setSelect(t.mst_nm);
						bldr.addSelect(t.mst_set_typ);
						bldr.addSelect(t.lcl_flg);
						bldr.setWhere(t.mst_nm.eq(bind("mst_nm")));
						mcframe.serverMAUC.MAUCL7080.MAUCL_DbUtil
								.dbSelect("MABCL0040_MAM_MST_CTL_S01", r, bldr, r);
						down0().add(r);
					}
				}
			}
			MAC_MST_SET_TYP.putNameNE(down0(), Srch01_Rslt1R.$mst_set_typ,
					Srch01_Rslt1R.$mst_set_typ_nm);
			
			// ソート
			down0().sort(Srch01_Rslt1R.$multi_sort);
		}
		/**
		 * 部分一致チェック用の文字列に変換した文字列を返す
		 */
		protected String getCnvStr(String str, boolean partialFlg) {
			if (isNull(str)) {
				return ".*";
			}
			return partialFlg ? ".*"+str+".*" : str;
		}
		/**
		 * 検索条件に一致するかチェックする
		 */
		protected boolean match(MAC_MST_NM cnst, String mstNm, String mstNmNm) {
			return cnst.key().matches(mstNm) && cnst.name().matches(mstNmNm);
		}
	}

	//FMCB CUSTOM END
}