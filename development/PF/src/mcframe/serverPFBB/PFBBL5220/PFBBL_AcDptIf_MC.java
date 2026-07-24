package mcframe.serverPFBB.PFBBL5220;

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
import mcframe.serverPF.dbc.*;
import static mcframe.commonPF.notice.PF_Msg.*;

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
import static mcframe.serverPF.dbc.PFFunction.*;


//手修正によるカスタマイズで必要なimportはこの間に記述してください。
//FMCB CUSTOM_IMPORT START
import mcframe.serverPFBZ.PFBZL9030.*;
import mcframe.commonPFBB.PFBBR5220.*;
import mcframe.serverPFUD.PFUDL5020.SdrvDtlR;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBBL_AcDptIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBBL_AcDptIf_MC extends PFBBL_AcDptIf_MC_A{
	//FMCB CUSTOM START

	/**
	 * AcDptIf_Conv02オペレーション.<p>
	 *
	 */
	public class AcDptIf_Conv01 extends PFBBL_AcDptIf_MC_A.AcDptIf_Conv01 {

		/**
		 * 必須項目のカラムを指定します。
		 */
		protected String[] _reqColumns = {
				DtlR.$code, DtlR.$name
		};

		@Override
		protected void call() {
			super.call();
		}

		/**
		 * 受信IFのレポートセットのインスタンスを生成します
		 */
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MBT_AC_DPT_IF_R.class);
			_IfRptSet.setReportSet(PFBBR_AcDptPrnt.create());
			_IfRptSet.setRowMapper(new MBT_AC_DPT_IF_R_DtlR());
			_IfRptSet.setReqColumns(_reqColumns);
		}

		/**
		 * 受信ＩＦのレポートセットに上り電文の内容を設定します
		 */
		protected void setRptSetData() {
			_IfRptSet.getReportSet().addAll(up1());
		}

		protected void recvIf(SdrvDtlR r) {
			super.recvIf(r);
			r.sdrv_sts_typ(MAC_SDRV_STS_TYP.RECV_CONV_OK.value());
		}

	}

	public class MBT_AC_DPT_IF_R_DtlR<D extends MBT_AC_DPT_IF_R, S extends DtlR, W extends PFT_SDRV_IF_R> extends MAUCC_RowMapperWith<D, S, W> {

		protected W _ifR;

		@Override
		public void setWith(W ifR) {
			this._ifR = ifR;
		}

		@Override
		protected void setupColumnPathMap() {
			super.setupColumnPathMap();

			addColumnPathMap(MBT_AC_DPT_IF_R.$ac_dpt_cd, DtlR.$code);
			addColumnPathMap(MBT_AC_DPT_IF_R.$ac_dpt_nm, DtlR.$name);
		}

		@Override
		public void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.data_lno(getSequence(MAC_NUM_SYS_TYP.AC_DPT_IF_DATA_LNO.value()));
			dest.data_no(_ifR.data_no());
			dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dest.imp_flg(true);

			dest.st_dt(MCDate.valueOf(2000, 1, 1, 0, 0, 0));
			dest.end_dt(MCDate.valueOf(2099, 12, 31, 23, 59, 59));
		}

	}

	//FMCB CUSTOM END
}