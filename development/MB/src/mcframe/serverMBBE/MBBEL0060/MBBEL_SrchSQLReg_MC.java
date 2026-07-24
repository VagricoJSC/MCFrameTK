package mcframe.serverMBBE.MBBEL0060;

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
import mcframe.serverMBBE.MBBEL0060.*; // このimportはFrameManagerの自動生成で追加されました。
import java.util.HashSet;
import java.util.List;
import static mcframe.serverMBBE.MBBEL0060.Query.*;
import mcframe.serverCore.mcjdbc.MCSQLParser;
import static mcframe.commonFX.notice.FX_Msg.*;
//FMCB CUSTOM_IMPORT END

/**
 * "MBBEL_SrchSQLReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。
 */
abstract public class MBBEL_SrchSQLReg_MC extends MBBEL_SrchSQLReg_MC_A{
	//FMCB CUSTOM START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 業務データダウンロード管理を検索<br>
	 */
	public class Srch01 extends MBBEL_SrchSQLReg_MC_A.Srch01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			super.doSearchMain();
			//dbTran().select(MBBEL0060_MBT_BIZ_DAT_DL_S01, up0(), down0());
			executeQuery(down0(), MBBEL0060_MBT_BIZ_DAT_DL_S01(), up0());

			if (!isNull(down0().biz_dat_id())) {
				down0().cartridge_nm(mcframe.commonCore.report.MCReportConst
						.getClientCartridgeLabel(down0().cartridge()));
				down1().sql_src(down0().sql_src());
				down2().addAll(getBindLst(down0().sql_src()));
			}
		}
	}

	/**
	 * Srch02オペレーション.<p>
	 *
	 * バインド変数取得<br>
	 */
	public class Srch02 extends MBBEL_SrchSQLReg_MC_A.Srch02 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doSearchMain() {
			try {
				super.doSearchMain();
				MCSQLParser parser = MCSQLParser.create();
				parser.parse(up0().sql_src(), null, null, false);
				List<String> condColL = parser.getExecuteList();
				HashSet<String> findl = new HashSet<>();

				for (String key : condColL) {
					if (isNull(key)) {
						throw new MCAppException(MBBEL0001);
					}
					key = key.toUpperCase();
					if (!findl.contains(key)) {
						Srch01_RsltBindR d = Srch01_RsltBindR.create();
						d.cond_col(key);
						down0().add(d);
						findl.add(key);
					}
				}
			}
			catch (MCException e) {
				throw new MCAppException(e, MBBEL0001);
			}
		}
	}

	/**
	 * Ins01オペレーション.<p>
	 *
	 * 業務データダウンロード管理に新規登録<br>
	 */
	public class Ins01 extends MBBEL_SrchSQLReg_MC_A.Ins01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {
			MBT_BIZ_DAT_DL_R dbc = setInsDat();
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MBT_BIZ_DAT_DL_R.create("T"));
			dbInsertEx("MBBEL0060_MBT_BIZ_DAT_DL_I01", dbc, dbc_bldr, FXBAL0013);

			down0().addAll(getBindLst(up1().sql_src()));
		}

		protected MBT_BIZ_DAT_DL_R setInsDat() {
			MBT_BIZ_DAT_DL_R dbc = MBT_BIZ_DAT_DL_R.create();

			dbc.biz_dat_id(up0().biz_dat_id());
			dbc.biz_dat_nm(up0().biz_dat_nm());
			dbc.module_id(up0().module_id());
			dbc.logic_id(up0().logic_id());
			dbc.func_actyp(up0().func_actyp());

			dbc.biz_dat_get_typ(MAC_BIZ_DAT_GET_TYP.SQL_REG.value());

			dbc.biz_dat_rmrks1(up0().biz_dat_rmrks1());
			dbc.biz_dat_rmrks2(up0().biz_dat_rmrks2());
			dbc.biz_dat_rmrks3(up0().biz_dat_rmrks3());
			dbc.print_flg(up0().print_flg());
			dbc.dwnld_flg(up0().dwnld_flg());
			dbc.form_file_nm(up0().form_file_nm());
			dbc.cartridge(up0().cartridge());
			
			dbc.sql_src(up1().sql_src());

			return dbc;
		}
	}

	/**
	 * Upd01オペレーション.<p>
	 *
	 * 業務データダウンロード管理を更新<br>
	 */
	public class Upd01 extends MBBEL_SrchSQLReg_MC_A.Upd01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			lockAndChk(up0());

			MBT_BIZ_DAT_DL_R dbc = MBT_BIZ_DAT_DL_R.create();
			dbc.biz_dat_nm(up0().biz_dat_nm());
			dbc.module_id(up0().module_id());
			dbc.logic_id(up0().logic_id());
			dbc.func_actyp(up0().func_actyp());
			dbc.biz_dat_rmrks1(up0().biz_dat_rmrks1());
			dbc.biz_dat_rmrks2(up0().biz_dat_rmrks2());
			dbc.biz_dat_rmrks3(up0().biz_dat_rmrks3());
			dbc.print_flg(up0().print_flg());
			dbc.dwnld_flg(up0().dwnld_flg());
			dbc.form_file_nm(isNull(up0().form_file_nm()) ? up0().biz_dat_id() : up0().form_file_nm());
			dbc.cartridge(up0().cartridge());
			dbc.sql_src(up1().sql_src());
			dbc.biz_dat_id(up0().biz_dat_id());
			
			MBT_BIZ_DAT_DL_R t = MBT_BIZ_DAT_DL_R.create("T");
			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(t);
			dbc_bldr.setSet(t.biz_dat_nm);
			dbc_bldr.addSet(t.module_id);
			dbc_bldr.addSet(t.logic_id);
			dbc_bldr.addSet(t.func_actyp);
			dbc_bldr.addSet(t.biz_dat_rmrks1);
			dbc_bldr.addSet(t.biz_dat_rmrks2);
			dbc_bldr.addSet(t.biz_dat_rmrks3);
			dbc_bldr.addSet(t.sql_src);
			dbc_bldr.addSet(t.print_flg);
			dbc_bldr.addSet(t.dwnld_flg);
			dbc_bldr.addSet(t.form_file_nm);
			dbc_bldr.addSet(t.cartridge);
			dbUpdateKey("MBBEL0060_MBT_BIZ_DAT_DL_U01", dbc, dbc_bldr);

			down0().addAll(getBindLst(up1().sql_src()));
		}
	}

	/**
	 * Del01オペレーション.<p>
	 *
	 * 業務データダウンロード管理を更新<br>
	 */
	public class Del01 extends MBBEL_SrchSQLReg_MC_A.Del01 {

		@Override
		protected void call() {
			super.call();
		}

		@Override
		protected void doIt() {

			lockAndChk(up0());

			MBT_BIZ_DAT_DL_R dbc = MBT_BIZ_DAT_DL_R.create();
			dbc.biz_dat_id(up0().biz_dat_id());

			MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MBT_BIZ_DAT_DL_R.create("T"));
			dbDeleteKey("MBBEL0060_MBT_BIZ_DAT_DL_D01", dbc, dbc_bldr);
		}
	}

	protected void lockAndChk(Ins01_BaseR up0) {
		MBT_BIZ_DAT_DL_R dbc = MBT_BIZ_DAT_DL_R.create();
		MCQueryApiBuilder dbc_bldr = MCQueryApiBuilder.create(MBT_BIZ_DAT_DL_R.create("T"));
		dbSelectKeyForUpdateNoWait("MBBEL0060_MBT_BIZ_DAT_DL_S01", dbc, dbc_bldr, up0);

		checkUpdCntr(up0, dbc);
	}

	protected MCList<Srch01_RsltBindR> getBindLst(String sql_src) {
		MBBEL_SrchSQLReg.Srch02 s2 = MBBEL_SrchSQLReg.crtSrch02();

		s2.up0().sql_src(sql_src);
		s2.exec();
		return s2.down0();
	}

	//FMCB CUSTOM END
}