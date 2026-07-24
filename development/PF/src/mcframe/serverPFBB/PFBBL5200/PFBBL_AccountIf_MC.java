package mcframe.serverPFBB.PFBBL5200;

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
import mcframe.commonPFBB.PFBBR5200.*;
import mcframe.serverPFUD.PFUDL5020.SdrvDtlR;

import java.util.Map;
import java.util.HashMap;
//FMCB CUSTOM_IMPORT END

/**
 * "PFBBL_AccountIf"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class PFBBL_AccountIf_MC extends PFBBL_AccountIf_MC_A{
	//FMCB CUSTOM START

	/**
	 * AccountIf_Conv01オペレーション.<p>
	 *
	 */
	public class AccountIf_Conv01 extends PFBBL_AccountIf_MC_A.AccountIf_Conv01 {

		/**
		 * 必須項目のカラムを指定します。
		 */
		protected String[] _reqColumns = {
				DtlR.$precode, DtlR.$name, DtlR.$accounttype
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
			_IfRptSet = PFBZL_FileInput.createIfRecvReportSet(DtlR.class, MBT_ACCOUNT_IF_R.class);
			_IfRptSet.setReportSet(PFBBR_AccountPrnt.create());
			_IfRptSet.setRowMapper(new MBT_ACCOUNT_IF_R_DtlR());
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

	public class MBT_ACCOUNT_IF_R_DtlR<D extends MBT_ACCOUNT_IF_R, S extends DtlR, W extends PFT_SDRV_IF_R> extends MAUCC_RowMapperWith<D, S, W> {

		protected W _ifR;

		@Override
		public void setWith(W ifR) {
			this._ifR = ifR;
		}

		@Override
		protected void setupColumnPathMap() {
			super.setupColumnPathMap();

			addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_cd, DtlR.$precode);
			addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_nm, DtlR.$name);
			addColumnPathMap(MBT_ACCOUNT_IF_R.$ac_tax_cd, DtlR.$taxablecode);
		}

		@Override
		public void valueCopy(D dest, S src) {
			super.valueCopy(dest, src);

			dest.data_lno(getSequence(MAC_NUM_SYS_TYP.ACCOUNT_IF_DATA_LNO.value()));
			dest.data_no(_ifR.data_no());
			dest.exe_sts_typ(MAC_EXE_STS_TYP.NOT_EXE.value());
			dest.data_crud_typ(MAC_DATA_CRUD_TYP.CRT.value());
			dest.imp_flg(true);

			dest.dc_typ(getDcTyp(src.accounttype()));
			dest.ac_typ(getAcTyp(src.accounttype()));
			dest.sub_flg(isSame(src.subincludeflag(), 1));
			dest.foreign_flg(isSame(src.appraisalconvflag(), 1));
			dest.ac_typ1(nvl(src.vat_flag(), 0).toString());
			dest.ac_tax_typ(getAcTaxTyp(src.taxabletype(), src.taxtype()));

			dest.bp_flg(!isSame(src.correspondentset(), 2));
			dest.sum1_flg(!isSame(src.usermaster1control(), 2));
			dest.sum2_flg(!isSame(src.usermaster2control(), 2));
			dest.sum3_flg(!isSame(src.usermaster3control(), 2));
			dest.sum4_flg(!isSame(src.usermaster4control(), 2));
			dest.sum5_flg(!isSame(src.usermaster5control(), 2));

			dest.usr_flg(true);
		}

		/** 貸借区分 */
		protected String getDcTyp(String accounttype) {
			if (isSame(accounttype, "RAD") || isSame(accounttype, "FAD")) {
				return MAC_DC_TYP.DR.value();
			}
			return MAC_DC_TYP.CR.value();
		}

		/** 勘定科目区分 */
		protected String getAcTyp(String accounttype) {
			if (isSame(accounttype, "RAD") || isSame(accounttype, "RAC")) {
				return MAC_AC_TYP.BS.value();
			}
			return MAC_AC_TYP.PL.value();
		}

		protected Map<String, String> _taxTypMap = new HashMap<String, String>() {
			{
				put("1","A");
				put("4","B");
				put("7","C");
				put("9","D");
			}
		};

		/** 会計税区分 */
		protected String getAcTaxTyp(MCNumber taxabletype, MCNumber taxtype) {
			if(isNull(taxabletype)) {
				return null;
			}
			String type = taxabletype.gte(10) ? "0": taxabletype.toString();
			if("023568".indexOf(type) > 0) {
				return type;
			}
			else if (isSame(taxtype.toString(), 0)) {
				//内税
				return type;
			}
			//外税
			return _taxTypMap.get(type);
		}

	}

	//FMCB CUSTOM END
}