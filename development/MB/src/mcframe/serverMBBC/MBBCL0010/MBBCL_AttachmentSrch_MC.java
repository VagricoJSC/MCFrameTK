package mcframe.serverMBBC.MBBCL0010;

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
import static mcframe.serverMBBC.MBBCL0010.Query.*;
import mcframe.serverMBBC.MBBCL5020.*;

import java.util.Map;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBCL_AttachmentSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBCL_AttachmentSrch_MC extends MBBCL_AttachmentSrch_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理をする<br>
	 */
	public class Srch01 extends MBBCL_AttachmentSrch_MC_A.Srch01 {
		@Override
		protected void call() {
			super.call();
		}
		
		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			editUp();
			executeQuery(down0(), MBBCL0010_MBT_ATTACHMENT_S01(), up0());
		}
		
		protected void editUp() {
			if (!up0().disp_old_flg()) {
				up0().addBooleanColumn("exclude_del_flg", true);
			}
		}
		
		@Override
		protected void editListMain() {
			super.editListMain();

			MBBCL_AttachService.createRptExtSysCache(down0());
			for (Srch01_RsltR r : down0()) {
				r.report_nm(MBBCL_AttachService.getReportNm(r.report_id()));

				if (isNull(r.doc_id())) {
					r.fs_flg(true);
				}
				else {
					String extSysCd = MBBCL_AttachService.getCacheRptExtSysCd(r.biz_typ(), r.bp_cd(), r.dt());
					// プレビューURLの取得（PDFのみ）
					if (r.file_nm().toLowerCase().matches(".*\\.pdf$")) {
						r.preview_url(getPreviewUrl(extSysCd, r.doc_id()));
					}
				}
			}
		}

		protected String getPreviewUrl(String extSysCd, String docId) {
			Map<String, String> m = MBBCL_AttachService.getExtParaMap(extSysCd);
			String url = m.get("web_url");
			if (isNull(url)) {
				return null;
			}
			String previewUrl = url.replaceAll("service$", "preview.jsp?docId=");
			return previewUrl + docId;
		}
	}

	//FMCB CUSTOM END
}