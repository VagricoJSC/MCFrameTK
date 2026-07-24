package mcframe.serverMGBG.MGBGL5080;

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
import mcframe.serverPFBZ.PFBZL9030.*;
import mcframe.commonMGBG.MGBGR5080.*;
import mcframe.serverPFUD.PFUDL5020.SdrvDtlR;
import mcframe.serverPF.dbc.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MGBGL_GaActAlcRecvIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MGBGL_GaActAlcRecvIf_MC extends MGBGL_GaActAlcRecvIf_MC_A{
	//FMCB CUSTOM START

	/**
	 * GaActAlcIf_Conv01オペレーション.<p>
	 *
	 */
	public class GaActAlcIf_Conv01 extends MGBGL_GaActAlcRecvIf_MC_A.GaActAlcIf_Conv01 {

		/**
		 * 必須項目のカラムを指定します。
		 */
		protected String[] _reqColumns = {
				DtlR.$ym, DtlR.$accode
		};

		@Override
		protected void call() {
			super.call();
		}

		/**
		 * 受信IFのレポートセットのインスタンスを生成します
		 */
		@Override
		protected void crtRptSet() {
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class,
					MGT_ACT_ALC_AMT_RCV_R.class);
			_IfRptSet.setReportSet(MGBGR_GaActAlcPrnt.create());
			_IfRptSet.setRowMapper(new MGT_ACT_ALC_AMT_RCV_R_DtlR());
			_IfRptSet.setReqColumns(_reqColumns);
		}

		/**
		 * 受信ＩＦのレポートセットに上り電文の内容を設定します
		 */
		@Override
		protected void setRptSetData() {
			_IfRptSet.getReportSet().addAll(up1());
		}

		@Override
		protected void recvIf(SdrvDtlR r) {
			super.recvIf(r);
			r.sdrv_sts_typ(MAC_SDRV_STS_TYP.RECV_CONV_OK.value());
		}

	}

	public class MGT_ACT_ALC_AMT_RCV_R_DtlR<D extends MGT_ACT_ALC_AMT_RCV_R, S extends DtlR, W extends PFT_SDRV_IF_R>
			extends MAUCC_RowMapperWith<D, S, W> {

		protected W _ifR;

		protected MCList<MAM_ACCOUNT_R> _cacheAc;

		protected MCIndexKey _acKey;

		@Override
		public void setWith(W ifR) {
			_ifR = ifR;
		}

		@Override
		protected void setupColumnPathMap() {
			super.setupColumnPathMap();

			addColumnPathMap(MGT_ACT_ALC_AMT_RCV_R.$ym, DtlR.$ym);
			addColumnPathMap(MGT_ACT_ALC_AMT_RCV_R.$ac_cd, DtlR.$accode);
			addColumnPathMap(MGT_ACT_ALC_AMT_RCV_R.$sub_ac_cd, DtlR.$subcode);
			addColumnPathMap(MGT_ACT_ALC_AMT_RCV_R.$dpt_cd, DtlR.$deptcode);
			addColumnPathMap(MGT_ACT_ALC_AMT_RCV_R.$if_sub_num1, DtlR.$amountdrsc);
			addColumnPathMap(MGT_ACT_ALC_AMT_RCV_R.$if_sub_num2, DtlR.$amountcrsc);

		}

		@Override
		protected void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.calc_ctg_cd(src.getStringNE("calc_ctg_cd"));
			dest.data_lno(getSequence(MGC_NUM_SYS_TYP.ACT_ALC_IF_DATA_LNO.value()));
			dest.data_no(_ifR.data_no());
			dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dest.imp_flg(true);

			dest.amt(getAmt(dest.ac_cd(), src.amountdrsc(), src.amountcrsc()));
		}

		protected MCNumber getAmt(String acCd, MCNumber drAmt, MCNumber crAmt) {
			MAM_ACCOUNT_R ac = getAcR(acCd);

			if (ac != null) {
				if (MAC_DC_TYP.isDR(ac.dc_typ())) {
					return nvl(drAmt, MCNumber.ZERO).subtract(nvl(crAmt, MCNumber.ZERO));
				}
				else if (MAC_DC_TYP.isCR(ac.dc_typ())) {
					return nvl(crAmt, MCNumber.ZERO).subtract(nvl(drAmt, MCNumber.ZERO));
				}
			}
			return null;
		}

		protected MAM_ACCOUNT_R getAcR(String acCd) {
			if (_cacheAc == null) {
				initAcCache();
			}
			return _cacheAc.getFirst(_acKey, acCd);
		}

		protected void initAcCache() {
			_cacheAc = MCList.create(MAM_ACCOUNT_R.class);
			MAM_ACCOUNT_R t = MAM_ACCOUNT_R.create("T");
			MCQueryApiBuilder cacheAc_bldr = MCQueryApiBuilder.create(t);
			cacheAc_bldr.setSelect(t.ac_cd, t.dc_typ);
			dbSelect("MGBGL5080_MAM_ACCOUNT_S01", _cacheAc, cacheAc_bldr);

			_acKey = _cacheAc.createIndex(MAM_ACCOUNT_R.$ac_cd);
		}

	}

	//FMCB CUSTOM END
}