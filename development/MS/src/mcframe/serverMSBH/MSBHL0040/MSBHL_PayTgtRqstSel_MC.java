package mcframe.serverMSBH.MSBHL0040;

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
import mcframe.serverMSBH.MSBHL5030.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MSBHL_PayTgtRqstSel"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MSBHL_PayTgtRqstSel_MC extends MSBHL_PayTgtRqstSel_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 支払対象の買掛明細を検索する。<br>
	 */
	public class Srch01 extends MSBHL_PayTgtRqstSel_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			setUpTmpCol(up0());
			
			mapUpContainers(MSBHL5030);
			Srch03.exec();
			setDown();
			mapDownContainers(MSBHL5030);
		}
		
		protected void setUpTmpCol(Srch01_CndR up) {

			// 仮単価含む
			Srch03.up0().addStringColumn("inc_interim_false", toFalseStr(up.inc_interim_flg()));
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();
			
			editdown();
		}
		
		/**
		 * 検索条件の支払上限金額が指定された場合、検索結果を支払予定日,買掛明細ＮＯの昇順にソートして
		 * 支払上限金額を超える手前までの明細を返す
		 */
		protected void setDown() {
			if (!isNull(up0().max_amt())) {
				Srch03.down0().sort(PaySchd_Srch03_RsltR.$pay_schd_dt,
						PaySchd_Srch03_RsltR.$ap_d_no);
				MCList<PaySchd_Srch03_RsltR> l = MCList
						.create(PaySchd_Srch03_RsltR.class);
				MCNumber incTaxAmt = MCNumber.ZERO;
				for (PaySchd_Srch03_RsltR r : Srch03.down0()) {
					incTaxAmt = incTaxAmt.add(r.trd_cur_inc_tax_amt());
					// 次の金額を足して上限金額を超える場合は終了
					if (incTaxAmt.gt(up0().max_amt())) {
						Srch03.down0().setAll(l);
						break;
					}
					l.add(r);
				}
			}
		}
		
		/**
		 * 下り電文を編集する
		 */
		protected void editdown() {
			setRowNum();
		}
		
		/**
		 * ページング処理に利用する行番号を設定する
		 */
		protected void setRowNum() {
			int rowNum = 1;
			for (Srch01_RsltR r : down0()) {
				r.row_num(rowNum);
				rowNum++;
			}
		}
	}

	//FMCB CUSTOM END
}