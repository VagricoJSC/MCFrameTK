package mcframe.serverMSBC.MSBCL6050;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBCL_MfgActRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_MfgActRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBCL6050";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_MfgActRegService.MfgActReg_Chk01 aMfgActReg_Chk01;

	protected void initMfgActReg_Chk01() {
		this.info = PDef.MS_MSBCL6050_MfgActReg_Chk01_INFO;
		this.aMfgActReg_Chk01 = ((MSBCL_MfgActRegService)this).new MfgActReg_Chk01();
	}

	public static MSBCL_MfgActRegService.MfgActReg_Chk01 crtMfgActReg_Chk01() {
		MSBCL_MfgActRegService lgc = new MSBCL_MfgActRegService();
		lgc.initMfgActReg_Chk01();
		return lgc.aMfgActReg_Chk01;
	}

	protected void paramMfgActReg_Chk01(MCParam p) {
		if (this.aMfgActReg_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActReg_Chk01.up0());
		p.addUpBlock(aMfgActReg_Chk01.up1());
		p.addUpBlock(aMfgActReg_Chk01.up2());
		p.addUpBlock(aMfgActReg_Chk01.up3());
		p.addUpBlock(aMfgActReg_Chk01.up4());
		p.addUpBlock(aMfgActReg_Chk01.up5());
		p.addUpBlock(aMfgActReg_Chk01.up6());
		p.addDownBlock(aMfgActReg_Chk01.down0());
		p.addDownBlock(aMfgActReg_Chk01.down1());
		p.addDownBlock(aMfgActReg_Chk01.down2());
		p.addDownBlock(aMfgActReg_Chk01.down3());
		p.addDownBlock(aMfgActReg_Chk01.down4());
		p.addDownBlock(aMfgActReg_Chk01.down5());
		p.addDownBlock(aMfgActReg_Chk01.down6());
	}

	protected void doMfgActReg_Chk01() {
		aMfgActReg_Chk01.call();
	};

	/**
	 * MfgActReg_Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR createMfgActReg_Chk01_HdrR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR.create();
	}

	/**
	 * MfgActReg_Chk01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> createMfgActReg_Chk01_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR.class);
	}

	/**
	 * MfgActReg_Chk01_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR createMfgActReg_Chk01_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR.create();
	}

	/**
	 * MfgActReg_Chk01_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> createMfgActReg_Chk01_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR.class);
	}

	/**
	 * MfgActReg_Chk01_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR createMfgActReg_Chk01_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR.create();
	}

	/**
	 * MfgActReg_Chk01_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> createMfgActReg_Chk01_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR.class);
	}

	/**
	 * MfgActReg_Chk01_DtlLossブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR createMfgActReg_Chk01_DtlLossR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR.create();
	}

	/**
	 * MfgActReg_Chk01_DtlLossブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> createMfgActReg_Chk01_DtlLossL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR.class);
	}

	/**
	 * MfgActReg_Chk01_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR createMfgActReg_Chk01_DtlWkR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR.create();
	}

	/**
	 * MfgActReg_Chk01_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> createMfgActReg_Chk01_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR.class);
	}

	/**
	 * MfgActReg_Chk01_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR createMfgActReg_Chk01_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR.create();
	}

	/**
	 * MfgActReg_Chk01_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> createMfgActReg_Chk01_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR.class);
	}

	/**
	 * MfgActReg_Chk01_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR createMfgActReg_Chk01_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR.create();
	}

	/**
	 * MfgActReg_Chk01_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> createMfgActReg_Chk01_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR.class);
	}
	protected MSBCL_MfgActRegService.MfgActReg_Chk02 aMfgActReg_Chk02;

	protected void initMfgActReg_Chk02() {
		this.info = PDef.MS_MSBCL6050_MfgActReg_Chk02_INFO;
		this.aMfgActReg_Chk02 = ((MSBCL_MfgActRegService)this).new MfgActReg_Chk02();
	}

	public static MSBCL_MfgActRegService.MfgActReg_Chk02 crtMfgActReg_Chk02() {
		MSBCL_MfgActRegService lgc = new MSBCL_MfgActRegService();
		lgc.initMfgActReg_Chk02();
		return lgc.aMfgActReg_Chk02;
	}

	protected void paramMfgActReg_Chk02(MCParam p) {
		if (this.aMfgActReg_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActReg_Chk02.up0());
		p.addUpBlock(aMfgActReg_Chk02.up1());
		p.addUpBlock(aMfgActReg_Chk02.up2());
		p.addUpBlock(aMfgActReg_Chk02.up3());
		p.addUpBlock(aMfgActReg_Chk02.up4());
		p.addDownBlock(aMfgActReg_Chk02.down0());
		p.addDownBlock(aMfgActReg_Chk02.down1());
		p.addDownBlock(aMfgActReg_Chk02.down2());
		p.addDownBlock(aMfgActReg_Chk02.down3());
		p.addDownBlock(aMfgActReg_Chk02.down4());
		p.addDownBlock(aMfgActReg_Chk02.down5());
		p.addDownBlock(aMfgActReg_Chk02.down6());
		p.addDownBlock(aMfgActReg_Chk02.down7());
	}

	protected void doMfgActReg_Chk02() {
		aMfgActReg_Chk02.call();
	};

	/**
	 * MfgActReg_Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR createMfgActReg_Chk02_HdrR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR.create();
	}

	/**
	 * MfgActReg_Chk02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR> createMfgActReg_Chk02_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR.class);
	}

	/**
	 * MfgActReg_Chk02_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR createMfgActReg_Chk02_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR.create();
	}

	/**
	 * MfgActReg_Chk02_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR> createMfgActReg_Chk02_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR.class);
	}

	/**
	 * MfgActReg_Chk02_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR createMfgActReg_Chk02_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR.create();
	}

	/**
	 * MfgActReg_Chk02_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR> createMfgActReg_Chk02_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR.class);
	}

	/**
	 * MfgActReg_Chk02_DtlLossブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR createMfgActReg_Chk02_DtlLossR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR.create();
	}

	/**
	 * MfgActReg_Chk02_DtlLossブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR> createMfgActReg_Chk02_DtlLossL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR.class);
	}

	/**
	 * MfgActReg_Chk02_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR createMfgActReg_Chk02_DtlWkR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR.create();
	}

	/**
	 * MfgActReg_Chk02_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR> createMfgActReg_Chk02_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR.class);
	}

	/**
	 * MfgActReg_Chk02_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR createMfgActReg_Chk02_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR.create();
	}

	/**
	 * MfgActReg_Chk02_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR> createMfgActReg_Chk02_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR.class);
	}

	/**
	 * MfgActReg_Chk02_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR createMfgActReg_Chk02_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR.create();
	}

	/**
	 * MfgActReg_Chk02_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR> createMfgActReg_Chk02_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR.class);
	}

	/**
	 * MfgActReg_Chk02_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_CtrlR createMfgActReg_Chk02_CtrlR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_CtrlR.create();
	}
	protected MSBCL_MfgActRegService.MfgActReg_Chk03 aMfgActReg_Chk03;

	protected void initMfgActReg_Chk03() {
		this.info = PDef.MS_MSBCL6050_MfgActReg_Chk03_INFO;
		this.aMfgActReg_Chk03 = ((MSBCL_MfgActRegService)this).new MfgActReg_Chk03();
	}

	public static MSBCL_MfgActRegService.MfgActReg_Chk03 crtMfgActReg_Chk03() {
		MSBCL_MfgActRegService lgc = new MSBCL_MfgActRegService();
		lgc.initMfgActReg_Chk03();
		return lgc.aMfgActReg_Chk03;
	}

	protected void paramMfgActReg_Chk03(MCParam p) {
		if (this.aMfgActReg_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActReg_Chk03.up0());
		p.addUpBlock(aMfgActReg_Chk03.up1());
		p.addUpBlock(aMfgActReg_Chk03.up2());
		p.addUpBlock(aMfgActReg_Chk03.up3());
		p.addDownBlock(aMfgActReg_Chk03.down0());
		p.addDownBlock(aMfgActReg_Chk03.down1());
	}

	protected void doMfgActReg_Chk03() {
		aMfgActReg_Chk03.call();
	};

	/**
	 * MfgActReg_Chk03_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_CtrlR createMfgActReg_Chk03_CtrlR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_CtrlR.create();
	}

	/**
	 * MfgActReg_Chk03_Hdr1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R createMfgActReg_Chk03_Hdr1R(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R.create();
	}

	/**
	 * MfgActReg_Chk03_Hdr1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R> createMfgActReg_Chk03_Hdr1L(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R.class);
	}

	/**
	 * MfgActReg_Chk03_Hdr2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R createMfgActReg_Chk03_Hdr2R(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R.create();
	}

	/**
	 * MfgActReg_Chk03_Hdr2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R> createMfgActReg_Chk03_Hdr2L(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R.class);
	}

	/**
	 * MfgActReg_Chk03_DtlYieldByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR createMfgActReg_Chk03_DtlYieldByProdR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR.create();
	}

	/**
	 * MfgActReg_Chk03_DtlYieldByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR> createMfgActReg_Chk03_DtlYieldByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR.class);
	}
	protected MSBCL_MfgActRegService.MfgActReg_Chk04 aMfgActReg_Chk04;

	protected void initMfgActReg_Chk04() {
		this.info = PDef.MS_MSBCL6050_MfgActReg_Chk04_INFO;
		this.aMfgActReg_Chk04 = ((MSBCL_MfgActRegService)this).new MfgActReg_Chk04();
	}

	public static MSBCL_MfgActRegService.MfgActReg_Chk04 crtMfgActReg_Chk04() {
		MSBCL_MfgActRegService lgc = new MSBCL_MfgActRegService();
		lgc.initMfgActReg_Chk04();
		return lgc.aMfgActReg_Chk04;
	}

	protected void paramMfgActReg_Chk04(MCParam p) {
		if (this.aMfgActReg_Chk04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActReg_Chk04.up0());
		p.addUpBlock(aMfgActReg_Chk04.up1());
		p.addDownBlock(aMfgActReg_Chk04.down0());
	}

	protected void doMfgActReg_Chk04() {
		aMfgActReg_Chk04.call();
	};

	/**
	 * MfgActReg_Chk04_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR createMfgActReg_Chk04_RsltR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.create();
	}

	/**
	 * MfgActReg_Chk04_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> createMfgActReg_Chk04_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.class);
	}

	/**
	 * MfgActReg_Chk04_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_CtrlR createMfgActReg_Chk04_CtrlR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_CtrlR.create();
	}
	protected MSBCL_MfgActRegService.MfgActReg_Chk05 aMfgActReg_Chk05;

	protected void initMfgActReg_Chk05() {
		this.info = PDef.MS_MSBCL6050_MfgActReg_Chk05_INFO;
		this.aMfgActReg_Chk05 = ((MSBCL_MfgActRegService)this).new MfgActReg_Chk05();
	}

	public static MSBCL_MfgActRegService.MfgActReg_Chk05 crtMfgActReg_Chk05() {
		MSBCL_MfgActRegService lgc = new MSBCL_MfgActRegService();
		lgc.initMfgActReg_Chk05();
		return lgc.aMfgActReg_Chk05;
	}

	protected void paramMfgActReg_Chk05(MCParam p) {
		if (this.aMfgActReg_Chk05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActReg_Chk05.up0());
		p.addUpBlock(aMfgActReg_Chk05.up1());
		p.addDownBlock(aMfgActReg_Chk05.down0());
	}

	protected void doMfgActReg_Chk05() {
		aMfgActReg_Chk05.call();
	};

	/**
	 * MfgActReg_Chk05_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR createMfgActReg_Chk05_RsltR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.create();
	}

	/**
	 * MfgActReg_Chk05_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> createMfgActReg_Chk05_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.class);
	}

	/**
	 * MfgActReg_Chk05_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk05_CtrlR createMfgActReg_Chk05_CtrlR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk05_CtrlR.create();
	}
	protected MSBCL_MfgActRegService.MfgActReg_Upd01 aMfgActReg_Upd01;

	protected void initMfgActReg_Upd01() {
		this.info = PDef.MS_MSBCL6050_MfgActReg_Upd01_INFO;
		this.aMfgActReg_Upd01 = ((MSBCL_MfgActRegService)this).new MfgActReg_Upd01();
	}

	public static MSBCL_MfgActRegService.MfgActReg_Upd01 crtMfgActReg_Upd01() {
		MSBCL_MfgActRegService lgc = new MSBCL_MfgActRegService();
		lgc.initMfgActReg_Upd01();
		return lgc.aMfgActReg_Upd01;
	}

	protected void paramMfgActReg_Upd01(MCParam p) {
		if (this.aMfgActReg_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActReg_Upd01.up0());
		p.addUpBlock(aMfgActReg_Upd01.up1());
		p.addUpBlock(aMfgActReg_Upd01.up2());
		p.addUpBlock(aMfgActReg_Upd01.up3());
		p.addUpBlock(aMfgActReg_Upd01.up4());
		p.addUpBlock(aMfgActReg_Upd01.up5());
		p.addUpBlock(aMfgActReg_Upd01.up6());
		p.addUpBlock(aMfgActReg_Upd01.up7());
		p.addDownBlock(aMfgActReg_Upd01.down0());
		p.addDownBlock(aMfgActReg_Upd01.down1());
		p.addDownBlock(aMfgActReg_Upd01.down2());
		p.addDownBlock(aMfgActReg_Upd01.down3());
		p.addDownBlock(aMfgActReg_Upd01.down4());
		p.addDownBlock(aMfgActReg_Upd01.down5());
		p.addDownBlock(aMfgActReg_Upd01.down6());
	}

	protected void doMfgActReg_Upd01() {
		aMfgActReg_Upd01.call();
	};

	/**
	 * MfgActReg_Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR createMfgActReg_Upd01_HdrR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR.create();
	}

	/**
	 * MfgActReg_Upd01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> createMfgActReg_Upd01_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR.class);
	}

	/**
	 * MfgActReg_Upd01_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR createMfgActReg_Upd01_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR.create();
	}

	/**
	 * MfgActReg_Upd01_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> createMfgActReg_Upd01_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR.class);
	}

	/**
	 * MfgActReg_Upd01_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR createMfgActReg_Upd01_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR.create();
	}

	/**
	 * MfgActReg_Upd01_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> createMfgActReg_Upd01_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR.class);
	}

	/**
	 * MfgActReg_Upd01_DtlLossブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR createMfgActReg_Upd01_DtlLossR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR.create();
	}

	/**
	 * MfgActReg_Upd01_DtlLossブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> createMfgActReg_Upd01_DtlLossL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR.class);
	}

	/**
	 * MfgActReg_Upd01_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR createMfgActReg_Upd01_DtlWkR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR.create();
	}

	/**
	 * MfgActReg_Upd01_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> createMfgActReg_Upd01_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR.class);
	}

	/**
	 * MfgActReg_Upd01_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR createMfgActReg_Upd01_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR.create();
	}

	/**
	 * MfgActReg_Upd01_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> createMfgActReg_Upd01_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR.class);
	}

	/**
	 * MfgActReg_Upd01_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR createMfgActReg_Upd01_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR.create();
	}

	/**
	 * MfgActReg_Upd01_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> createMfgActReg_Upd01_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR.class);
	}

	/**
	 * MfgActReg_Upd01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_CtrlR createMfgActReg_Upd01_CtrlR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_CtrlR.create();
	}
	protected MSBCL_MfgActRegService.MfgActReg_Upd02 aMfgActReg_Upd02;

	protected void initMfgActReg_Upd02() {
		this.info = PDef.MS_MSBCL6050_MfgActReg_Upd02_INFO;
		this.aMfgActReg_Upd02 = ((MSBCL_MfgActRegService)this).new MfgActReg_Upd02();
	}

	public static MSBCL_MfgActRegService.MfgActReg_Upd02 crtMfgActReg_Upd02() {
		MSBCL_MfgActRegService lgc = new MSBCL_MfgActRegService();
		lgc.initMfgActReg_Upd02();
		return lgc.aMfgActReg_Upd02;
	}

	protected void paramMfgActReg_Upd02(MCParam p) {
		if (this.aMfgActReg_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActReg_Upd02.up0());
		p.addUpBlock(aMfgActReg_Upd02.up1());
		p.addUpBlock(aMfgActReg_Upd02.up2());
		p.addUpBlock(aMfgActReg_Upd02.up3());
		p.addDownBlock(aMfgActReg_Upd02.down0());
		p.addDownBlock(aMfgActReg_Upd02.down1());
		p.addDownBlock(aMfgActReg_Upd02.down2());
	}

	protected void doMfgActReg_Upd02() {
		aMfgActReg_Upd02.call();
	};

	/**
	 * MfgActReg_Upd02_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_CtrlR createMfgActReg_Upd02_CtrlR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_CtrlR.create();
	}

	/**
	 * MfgActReg_Upd02_Hdr1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R createMfgActReg_Upd02_Hdr1R(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R.create();
	}

	/**
	 * MfgActReg_Upd02_Hdr1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> createMfgActReg_Upd02_Hdr1L(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R.class);
	}

	/**
	 * MfgActReg_Upd02_Hdr2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R createMfgActReg_Upd02_Hdr2R(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R.create();
	}

	/**
	 * MfgActReg_Upd02_Hdr2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> createMfgActReg_Upd02_Hdr2L(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R.class);
	}

	/**
	 * MfgActReg_Upd02_DtlYieldByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR createMfgActReg_Upd02_DtlYieldByProdR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR.create();
	}

	/**
	 * MfgActReg_Upd02_DtlYieldByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR> createMfgActReg_Upd02_DtlYieldByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR.class);
	}

	/**
	 * MfgActReg_Upd02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR createMfgActReg_Upd02_HdrR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR.create();
	}

	/**
	 * MfgActReg_Upd02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> createMfgActReg_Upd02_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR.class);
	}

	/**
	 * MfgActReg_Upd02_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR createMfgActReg_Upd02_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR.create();
	}

	/**
	 * MfgActReg_Upd02_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> createMfgActReg_Upd02_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR.class);
	}

	/**
	 * MfgActReg_Upd02_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR createMfgActReg_Upd02_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR.create();
	}

	/**
	 * MfgActReg_Upd02_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> createMfgActReg_Upd02_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR.class);
	}

	/**
	 * MfgActReg_Upd02_DtlLossブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR createMfgActReg_Upd02_DtlLossR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR.create();
	}

	/**
	 * MfgActReg_Upd02_DtlLossブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> createMfgActReg_Upd02_DtlLossL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR.class);
	}

	/**
	 * MfgActReg_Upd02_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR createMfgActReg_Upd02_DtlWkR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR.create();
	}

	/**
	 * MfgActReg_Upd02_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> createMfgActReg_Upd02_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR.class);
	}

	/**
	 * MfgActReg_Upd02_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR createMfgActReg_Upd02_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR.create();
	}

	/**
	 * MfgActReg_Upd02_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> createMfgActReg_Upd02_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR.class);
	}

	/**
	 * MfgActReg_Upd02_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR createMfgActReg_Upd02_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR.create();
	}

	/**
	 * MfgActReg_Upd02_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> createMfgActReg_Upd02_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR.class);
	}
	protected MSBCL_MfgActRegService.MfgActReg_Upd03 aMfgActReg_Upd03;

	protected void initMfgActReg_Upd03() {
		this.info = PDef.MS_MSBCL6050_MfgActReg_Upd03_INFO;
		this.aMfgActReg_Upd03 = ((MSBCL_MfgActRegService)this).new MfgActReg_Upd03();
	}

	public static MSBCL_MfgActRegService.MfgActReg_Upd03 crtMfgActReg_Upd03() {
		MSBCL_MfgActRegService lgc = new MSBCL_MfgActRegService();
		lgc.initMfgActReg_Upd03();
		return lgc.aMfgActReg_Upd03;
	}

	protected void paramMfgActReg_Upd03(MCParam p) {
		if (this.aMfgActReg_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActReg_Upd03.up0());
		p.addUpBlock(aMfgActReg_Upd03.up1());
		p.addDownBlock(aMfgActReg_Upd03.down0());
	}

	protected void doMfgActReg_Upd03() {
		aMfgActReg_Upd03.call();
	};

	/**
	 * MfgActReg_Upd03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR createMfgActReg_Upd03_RsltR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.create();
	}

	/**
	 * MfgActReg_Upd03_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> createMfgActReg_Upd03_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.class);
	}

	/**
	 * MfgActReg_Upd03_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd03_CtrlR createMfgActReg_Upd03_CtrlR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd03_CtrlR.create();
	}
	protected MSBCL_MfgActRegService.MfgActReg_Upd04 aMfgActReg_Upd04;

	protected void initMfgActReg_Upd04() {
		this.info = PDef.MS_MSBCL6050_MfgActReg_Upd04_INFO;
		this.aMfgActReg_Upd04 = ((MSBCL_MfgActRegService)this).new MfgActReg_Upd04();
	}

	public static MSBCL_MfgActRegService.MfgActReg_Upd04 crtMfgActReg_Upd04() {
		MSBCL_MfgActRegService lgc = new MSBCL_MfgActRegService();
		lgc.initMfgActReg_Upd04();
		return lgc.aMfgActReg_Upd04;
	}

	protected void paramMfgActReg_Upd04(MCParam p) {
		if (this.aMfgActReg_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActReg_Upd04.up0());
		p.addUpBlock(aMfgActReg_Upd04.up1());
		p.addDownBlock(aMfgActReg_Upd04.down0());
	}

	protected void doMfgActReg_Upd04() {
		aMfgActReg_Upd04.call();
	};

	/**
	 * MfgActReg_Upd04_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_CtrlR createMfgActReg_Upd04_CtrlR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_CtrlR.create();
	}

	/**
	 * MfgActReg_Upd04_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR createMfgActReg_Upd04_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR.create();
	}

	/**
	 * MfgActReg_Upd04_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR> createMfgActReg_Upd04_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR.class);
	}
	protected MSBCL_MfgActRegService.MfgActReg_Del01 aMfgActReg_Del01;

	protected void initMfgActReg_Del01() {
		this.info = PDef.MS_MSBCL6050_MfgActReg_Del01_INFO;
		this.aMfgActReg_Del01 = ((MSBCL_MfgActRegService)this).new MfgActReg_Del01();
	}

	public static MSBCL_MfgActRegService.MfgActReg_Del01 crtMfgActReg_Del01() {
		MSBCL_MfgActRegService lgc = new MSBCL_MfgActRegService();
		lgc.initMfgActReg_Del01();
		return lgc.aMfgActReg_Del01;
	}

	protected void paramMfgActReg_Del01(MCParam p) {
		if (this.aMfgActReg_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActReg_Del01.up0());
		p.addUpBlock(aMfgActReg_Del01.up1());
		p.addUpBlock(aMfgActReg_Del01.up2());
		p.addUpBlock(aMfgActReg_Del01.up3());
		p.addUpBlock(aMfgActReg_Del01.up4());
		p.addDownBlock(aMfgActReg_Del01.down0());
	}

	protected void doMfgActReg_Del01() {
		aMfgActReg_Del01.call();
	};

	/**
	 * MfgActReg_Del01_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_CtrlR createMfgActReg_Del01_CtrlR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_CtrlR.create();
	}

	/**
	 * MfgActReg_Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR createMfgActReg_Del01_HdrR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR.create();
	}

	/**
	 * MfgActReg_Del01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR> createMfgActReg_Del01_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR.class);
	}

	/**
	 * MfgActReg_Del01_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR createMfgActReg_Del01_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR.create();
	}

	/**
	 * MfgActReg_Del01_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR> createMfgActReg_Del01_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR.class);
	}

	/**
	 * MfgActReg_Del01_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR createMfgActReg_Del01_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR.create();
	}

	/**
	 * MfgActReg_Del01_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR> createMfgActReg_Del01_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR.class);
	}

	/**
	 * MfgActReg_Del01_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR createMfgActReg_Del01_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR.create();
	}

	/**
	 * MfgActReg_Del01_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR> createMfgActReg_Del01_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR.class);
	}
	protected MSBCL_MfgActRegService.MfgActReg_Del02 aMfgActReg_Del02;

	protected void initMfgActReg_Del02() {
		this.info = PDef.MS_MSBCL6050_MfgActReg_Del02_INFO;
		this.aMfgActReg_Del02 = ((MSBCL_MfgActRegService)this).new MfgActReg_Del02();
	}

	public static MSBCL_MfgActRegService.MfgActReg_Del02 crtMfgActReg_Del02() {
		MSBCL_MfgActRegService lgc = new MSBCL_MfgActRegService();
		lgc.initMfgActReg_Del02();
		return lgc.aMfgActReg_Del02;
	}

	protected void paramMfgActReg_Del02(MCParam p) {
		if (this.aMfgActReg_Del02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgActReg_Del02.up0());
		p.addUpBlock(aMfgActReg_Del02.up1());
		p.addDownBlock(aMfgActReg_Del02.down0());
	}

	protected void doMfgActReg_Del02() {
		aMfgActReg_Del02.call();
	};

	/**
	 * MfgActReg_Del02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR createMfgActReg_Del02_RsltR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.create();
	}

	/**
	 * MfgActReg_Del02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> createMfgActReg_Del02_RsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.class);
	}

	/**
	 * MfgActReg_Del02_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6050.MfgActReg_Del02_CtrlR createMfgActReg_Del02_CtrlR(){
		return mcframe.serverMSBC.MSBCL6050.MfgActReg_Del02_CtrlR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * MfgActReg_Chk01オペレーション.<p>
	 *
	 * 製造実績の登録・訂正・取消前チェックの共通処理<br>
	 */
	abstract public class MfgActReg_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActReg_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> up4;
		/** このオペレーションへの上り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> up5;
		/** このオペレーションへの上り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> up6;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> down5;
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> down6;
		
		
		// コンストラクタ
		protected MfgActReg_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR.class);
			up4 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR.class);
			up5 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR.class);
			up6 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR.class);
			down4 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR.class);
			down5 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR.class);
			down6 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			if (i == 4) return up4();
			if (i == 5) return up5();
			if (i == 6) return up6();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			if (i == 5) return down5();
			if (i == 6) return down6();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
			down5().clear();
			down6().clear();
		}
		/**
		 * MfgActReg_Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR createMfgActReg_Chk01_HdrR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR.create();
		}

		/**
		 * MfgActReg_Chk01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> createMfgActReg_Chk01_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR.class);
		}

		/**
		 * MfgActReg_Chk01_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR createMfgActReg_Chk01_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR.create();
		}

		/**
		 * MfgActReg_Chk01_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> createMfgActReg_Chk01_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR.class);
		}

		/**
		 * MfgActReg_Chk01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR createMfgActReg_Chk01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR.create();
		}

		/**
		 * MfgActReg_Chk01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> createMfgActReg_Chk01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR.class);
		}

		/**
		 * MfgActReg_Chk01_DtlLossブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR createMfgActReg_Chk01_DtlLossR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR.create();
		}

		/**
		 * MfgActReg_Chk01_DtlLossブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> createMfgActReg_Chk01_DtlLossL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR.class);
		}

		/**
		 * MfgActReg_Chk01_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR createMfgActReg_Chk01_DtlWkR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR.create();
		}

		/**
		 * MfgActReg_Chk01_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> createMfgActReg_Chk01_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR.class);
		}

		/**
		 * MfgActReg_Chk01_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR createMfgActReg_Chk01_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR.create();
		}

		/**
		 * MfgActReg_Chk01_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> createMfgActReg_Chk01_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR.class);
		}

		/**
		 * MfgActReg_Chk01_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR createMfgActReg_Chk01_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR.create();
		}

		/**
		 * MfgActReg_Chk01_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> createMfgActReg_Chk01_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>st_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_act_qty</td></tr>
		 * 	<tr><td><br></td><td>rem_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_yield</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>act_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>not_pd_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>lst_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * 	<tr><td><br></td><td>is_src_md_mfg_srv_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_act_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_yield</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bkf_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_upd_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>bkf_not_ref_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_qty</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bkf_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_not_comp_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>is_only_abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_peg_no</td></tr>
		 * 	<tr><td><br></td><td>loss_act_no</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>act_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>brk_pd</td></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>fclty</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wk_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>wk_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>wk_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_wk_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> up4() {
			return up4;
		}

		/**
		 * 上り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> up5() {
			return up5;
		}

		/**
		 * 上り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> up6() {
			return up6;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_no</td></tr>
		 * 	<tr><td><br></td><td>inst_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>st_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_act_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dfct_qty</td></tr>
		 * 	<tr><td><br></td><td>rem_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>act_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>act_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>prnt_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_yield</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_purc_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>act_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>not_pd_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * 	<tr><td><br></td><td>is_src_md_mfg_srv_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_act_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_yield</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bkf_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_upd_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>bkf_not_ref_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_lot_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_qty</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_sno4</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bkf_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>base_unit_alt_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>slf_support_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>slf_support_upri</td></tr>
		 * 	<tr><td><br></td><td>slf_support_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>slf_support_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>slf_support_xrate</td></tr>
		 * 	<tr><td><br></td><td>vmi_interim_flg</td></tr>
		 * 	<tr><td><br></td><td>vmi_upri</td></tr>
		 * 	<tr><td><br></td><td>base_unit_std_qty</td></tr>
		 * 	<tr><td><br></td><td>add_flg</td></tr>
		 * 	<tr><td><br></td><td>old_ver_no</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>is_only_abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>fxd_loss_flg</td></tr>
		 * 	<tr><td><br></td><td>loss_act_no</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>act_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>brk_pd</td></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>fclty</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wk_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>wk_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>wk_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_wk_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>not_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>old_lot_no</td></tr>
		 * 	<tr><td><br></td><td>old_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>old_yield_typ</td></tr>
		 * 	<tr><td><br></td><td>old_base_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>old_lot_no</td></tr>
		 * 	<tr><td><br></td><td>old_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> down6() {
			return down6;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgActReg_Chk02オペレーション.<p>
	 *
	 * 製造実績の取消前チェックの共通処理<br>
	 */
	abstract public class MfgActReg_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActReg_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_CtrlR up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR> down5;
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR> down6;
		/** このオペレーションからの下り電文パラメータの第7ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_CtrlR down7;
		/** [MfgActReg_Chk02_DtlLoss]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR> aMfgActReg_Chk02_DtlLoss;
		/** [MfgActReg_Chk02_DtlOper]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR> aMfgActReg_Chk02_DtlOper;
		/** [MfgActReg_Chk02_DtlWk]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR> aMfgActReg_Chk02_DtlWk;
		
		/**
		 * 連携情報 MAR<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Chk01 （{@link #chk01}）<br>
		 */
		public final String MAR = "MAR";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Chk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR&gt; （{@link #chk01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR&gt; （{@link #chk01_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR&gt; （{@link #chk01_up2}）<br>
		 * 第4 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR&gt; （{@link #chk01_up3}）<br>
		 * 第5 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR&gt; （{@link #chk01_up4}）<br>
		 * 第6 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR&gt; （{@link #chk01_up5}）<br>
		 * 第7 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR&gt; （{@link #chk01_up6}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR&gt; （{@link #chk01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR&gt; （{@link #chk01_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR&gt; （{@link #chk01_down2}）<br>
		 * 第4 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR&gt; （{@link #chk01_down3}）<br>
		 * 第5 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR&gt; （{@link #chk01_down4}）<br>
		 * 第6 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR&gt; （{@link #chk01_down5}）<br>
		 * 第7 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR&gt; （{@link #chk01_down6}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Chk01 chk01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> chk01_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> chk01_up1;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> chk01_up2;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> chk01_up3;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> chk01_up4;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> chk01_up5;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> chk01_up6;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> chk01_down0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> chk01_down1;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> chk01_down2;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> chk01_down3;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> chk01_down4;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> chk01_down5;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> chk01_down6;
		
		// コンストラクタ
		protected MfgActReg_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR.class);
			up4 = mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR.class);
			down4 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR.class);
			down5 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR.class);
			down6 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR.class);
			down7 = mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_CtrlR.create();
			aMfgActReg_Chk02_DtlLoss = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR.class);
			aMfgActReg_Chk02_DtlOper = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR.class);
			aMfgActReg_Chk02_DtlWk = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.crtMfgActReg_Chk01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR>)chk01.up(0);
			chk01_up1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR>)chk01.up(1);
			chk01_up2 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR>)chk01.up(2);
			chk01_up3 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR>)chk01.up(3);
			chk01_up4 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR>)chk01.up(4);
			chk01_up5 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR>)chk01.up(5);
			chk01_up6 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR>)chk01.up(6);
			chk01_down0 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR>)chk01.down(0);
			chk01_down1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR>)chk01.down(1);
			chk01_down2 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR>)chk01.down(2);
			chk01_down3 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR>)chk01.down(3);
			chk01_down4 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR>)chk01.down(4);
			chk01_down5 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR>)chk01.down(5);
			chk01_down6 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR>)chk01.down(6);

			// オペレーション、オペレーショングループの登録
			appendOpe(MAR, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MAR<br>
		 * up0() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR&gt; （{@link #chk01_up0}）<br>
		 * aMfgActReg_Chk02_DtlOper => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR&gt; （{@link #chk01_up1}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR&gt; （{@link #chk01_up2}）<br>
		 * aMfgActReg_Chk02_DtlLoss => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR&gt; （{@link #chk01_up3}）<br>
		 * aMfgActReg_Chk02_DtlWk => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR&gt; （{@link #chk01_up4}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR&gt; （{@link #chk01_up5}）<br>
		 * up3() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR&gt; （{@link #chk01_up6}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MAR)) {
				up_MAR(chk01_up0, chk01_up1, chk01_up2, chk01_up3, chk01_up4, chk01_up5, chk01_up6, up0(), aMfgActReg_Chk02_DtlOper, up1(), aMfgActReg_Chk02_DtlLoss, aMfgActReg_Chk02_DtlWk, up2(), up3());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MAR<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR&gt;（{@link #chk01_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR&gt;（{@link #chk01_down1}）=> down1()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR&gt;（{@link #chk01_down2}）=> down2()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR&gt;（{@link #chk01_down3}）=> down3()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR&gt;（{@link #chk01_down4}）=> down4()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR&gt;（{@link #chk01_down5}）=> down5()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR&gt;（{@link #chk01_down6}）=> down6()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MAR)) {
				down_MAR(down0(), down1(), down2(), down3(), down4(), down5(), down6(), chk01_down0, chk01_down1, chk01_down2, chk01_down3, chk01_down4, chk01_down5, chk01_down6);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			if (i == 4) return up4();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			if (i == 5) return down5();
			if (i == 6) return down6();
			if (i == 7) return down7();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
			down5().clear();
			down6().clear();
			down7().clear();
		}
		/**
		 * MfgActReg_Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR createMfgActReg_Chk02_HdrR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR.create();
		}

		/**
		 * MfgActReg_Chk02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR> createMfgActReg_Chk02_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR.class);
		}

		/**
		 * MfgActReg_Chk02_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR createMfgActReg_Chk02_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR.create();
		}

		/**
		 * MfgActReg_Chk02_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR> createMfgActReg_Chk02_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR.class);
		}

		/**
		 * MfgActReg_Chk02_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR createMfgActReg_Chk02_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR.create();
		}

		/**
		 * MfgActReg_Chk02_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR> createMfgActReg_Chk02_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR.class);
		}

		/**
		 * MfgActReg_Chk02_DtlLossブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR createMfgActReg_Chk02_DtlLossR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR.create();
		}

		/**
		 * MfgActReg_Chk02_DtlLossブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR> createMfgActReg_Chk02_DtlLossL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR.class);
		}

		/**
		 * MfgActReg_Chk02_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR createMfgActReg_Chk02_DtlWkR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR.create();
		}

		/**
		 * MfgActReg_Chk02_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR> createMfgActReg_Chk02_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR.class);
		}

		/**
		 * MfgActReg_Chk02_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR createMfgActReg_Chk02_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR.create();
		}

		/**
		 * MfgActReg_Chk02_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR> createMfgActReg_Chk02_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR.class);
		}

		/**
		 * MfgActReg_Chk02_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR createMfgActReg_Chk02_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR.create();
		}

		/**
		 * MfgActReg_Chk02_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR> createMfgActReg_Chk02_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR.class);
		}

		/**
		 * MfgActReg_Chk02_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_CtrlR createMfgActReg_Chk02_CtrlR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>lst_del_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lst_del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_CtrlR up4() {
			return up4;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_act_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dfct_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>old_ver_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>fxd_loss_flg</td></tr>
		 * 	<tr><td><br></td><td>loss_act_no</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>not_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>old_lot_no</td></tr>
		 * 	<tr><td><br></td><td>old_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>old_yield_typ</td></tr>
		 * 	<tr><td><br></td><td>old_base_unit_yield_act_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>old_lot_no</td></tr>
		 * 	<tr><td><br></td><td>old_sublot_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR> down6() {
			return down6;
		}

		/**
		 * 下り電文の第7ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第7ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lst_del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_CtrlR down7() {
			return down7;
		}


		/**
		 * [MfgActReg_Chk02_DtlLoss]ブロックのコンテナaMfgActReg_Chk02_DtlLossLを返します。
		 *
		 * @return MfgActReg_Chk02_DtlLossL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR> MfgActReg_Chk02_DtlLoss() {
			return aMfgActReg_Chk02_DtlLoss;
		}

		/**
		 * [MfgActReg_Chk02_DtlOper]ブロックのコンテナaMfgActReg_Chk02_DtlOperLを返します。
		 *
		 * @return MfgActReg_Chk02_DtlOperL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR> MfgActReg_Chk02_DtlOper() {
			return aMfgActReg_Chk02_DtlOper;
		}

		/**
		 * [MfgActReg_Chk02_DtlWk]ブロックのコンテナaMfgActReg_Chk02_DtlWkLを返します。
		 *
		 * @return MfgActReg_Chk02_DtlWkL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR> MfgActReg_Chk02_DtlWk() {
			return aMfgActReg_Chk02_DtlWk;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this).info;
		}

		//-----------------------MAR専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMARの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAR(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> dest0_2, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> dest0_3, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> dest0_4, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> dest0_5, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> dest0_6, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR> src_MfgActReg_Chk02_Hdr, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR> src_MfgActReg_Chk02_DtlOper, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR> src_MfgActReg_Chk02_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR> src_MfgActReg_Chk02_DtlLoss, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR> src_MfgActReg_Chk02_DtlWk, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR> src_MfgActReg_Chk02_DtlYield, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR> src_MfgActReg_Chk02_DtlByProd){
			up_MAR_chk01_0(dest0_0, src_MfgActReg_Chk02_Hdr);
			up_MAR_chk01_1(dest0_1, src_MfgActReg_Chk02_DtlOper);
			up_MAR_chk01_2(dest0_2, src_MfgActReg_Chk02_DtlInpt);
			up_MAR_chk01_3(dest0_3, src_MfgActReg_Chk02_DtlLoss);
			up_MAR_chk01_4(dest0_4, src_MfgActReg_Chk02_DtlWk);
			up_MAR_chk01_5(dest0_5, src_MfgActReg_Chk02_DtlYield);
			up_MAR_chk01_6(dest0_6, src_MfgActReg_Chk02_DtlByProd);
		}
		
		/**
		 * 連携処理MAR_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAR_chk01_0() {
			MCRowMapper map = new Map_up_MAR_chk01_0();
			return map;
		}

		/**
		 * 連携処理MAR_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAR_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr");
				addColumnPathMap("mfg_act_upd_cntr", "mfg_act_upd_cntr");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("upd_cntr_chk_flg", "upd_cntr_chk_flg");
				addColumnPathMap("is_src_batch_flg", "is_src_batch_flg");
			}
		}

		/**
		 * 連携処理MAR_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAR_chk01_0(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR r_src) {
		}

		/**
		 * 連携処理MAR_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAR_chk01_0(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR> src) {
			MCRowMapper _rm = createMap_up_MAR_chk01_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAR_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MAR_chk01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAR_chk01_1() {
			MCRowMapper map = new Map_up_MAR_chk01_1();
			return map;
		}

		/**
		 * 連携処理MAR_chk01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAR_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("oper_act_no", "oper_act_no");
			}
		}

		/**
		 * 連携処理MAR_chk01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAR_chk01_1(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR r_src) {
		}

		/**
		 * 連携処理MAR_chk01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAR_chk01_1(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR> src) {
			MCRowMapper _rm = createMap_up_MAR_chk01_1();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAR_chk01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MAR_chk01の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAR_chk01_2() {
			MCRowMapper map = new Map_up_MAR_chk01_2();
			return map;
		}

		/**
		 * 連携処理MAR_chk01の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAR_chk01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("inpt_schd_no", "inpt_schd_no");
				addColumnPathMap("inpt_act_no", "inpt_act_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
			}
		}

		/**
		 * 連携処理MAR_chk01の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAR_chk01_2(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR r_src) {
		}

		/**
		 * 連携処理MAR_chk01の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAR_chk01_2(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR> src) {
			MCRowMapper _rm = createMap_up_MAR_chk01_2();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAR_chk01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MAR_chk01の上りブロック3のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAR_chk01_3() {
			MCRowMapper map = new Map_up_MAR_chk01_3();
			return map;
		}

		/**
		 * 連携処理MAR_chk01の上りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAR_chk01_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("inpt_peg_no", "inpt_peg_no");
				addColumnPathMap("loss_act_no", "loss_act_no");
			}
		}

		/**
		 * 連携処理MAR_chk01の上りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAR_chk01_3(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR r_src) {
		}

		/**
		 * 連携処理MAR_chk01の上りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAR_chk01_3(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR> src) {
			MCRowMapper _rm = createMap_up_MAR_chk01_3();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAR_chk01_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MAR_chk01の上りブロック4のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAR_chk01_4() {
			MCRowMapper map = new Map_up_MAR_chk01_4();
			return map;
		}

		/**
		 * 連携処理MAR_chk01の上りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAR_chk01_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("wk_act_no", "wk_act_no");
			}
		}

		/**
		 * 連携処理MAR_chk01の上りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAR_chk01_4(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR r_src) {
		}

		/**
		 * 連携処理MAR_chk01の上りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAR_chk01_4(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR> src) {
			MCRowMapper _rm = createMap_up_MAR_chk01_4();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAR_chk01_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MAR_chk01の上りブロック5のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAR_chk01_5() {
			MCRowMapper map = new Map_up_MAR_chk01_5();
			return map;
		}

		/**
		 * 連携処理MAR_chk01の上りブロック5のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAR_chk01_5 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("yield_act_no", "yield_act_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
			}
		}

		/**
		 * 連携処理MAR_chk01の上りブロック5のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAR_chk01_5(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MAR_chk01の上りブロック5のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAR_chk01_5(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR> src) {
			MCRowMapper _rm = createMap_up_MAR_chk01_5();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAR_chk01_5(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MAR_chk01の上りブロック6のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAR_chk01_6() {
			MCRowMapper map = new Map_up_MAR_chk01_6();
			return map;
		}

		/**
		 * 連携処理MAR_chk01の上りブロック6のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAR_chk01_6 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("yield_act_no", "yield_act_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
			}
		}

		/**
		 * 連携処理MAR_chk01の上りブロック6のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAR_chk01_6(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MAR_chk01の上りブロック6のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAR_chk01_6(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR> src) {
			MCRowMapper _rm = createMap_up_MAR_chk01_6();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAR_chk01_6(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MAR専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMARの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAR(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR> dest_MfgActReg_Chk02_Hdr, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR> dest_MfgActReg_Chk02_DtlOper, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR> dest_MfgActReg_Chk02_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR> dest_MfgActReg_Chk02_DtlLoss, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR> dest_MfgActReg_Chk02_DtlWk, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR> dest_MfgActReg_Chk02_DtlYield, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR> dest_MfgActReg_Chk02_DtlByProd, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> src0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> src0_1, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> src0_2, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> src0_3, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> src0_4, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> src0_5, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> src0_6){
			down_MAR_chk01_0(dest_MfgActReg_Chk02_Hdr, src0_0);
			down_MAR_chk01_1(dest_MfgActReg_Chk02_DtlOper, src0_1);
			down_MAR_chk01_2(dest_MfgActReg_Chk02_DtlInpt, src0_2);
			down_MAR_chk01_3(dest_MfgActReg_Chk02_DtlLoss, src0_3);
			down_MAR_chk01_4(dest_MfgActReg_Chk02_DtlWk, src0_4);
			down_MAR_chk01_5(dest_MfgActReg_Chk02_DtlYield, src0_5);
			down_MAR_chk01_6(dest_MfgActReg_Chk02_DtlByProd, src0_6);
		}

		/**
		 * 連携処理MAR_chk01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MAR_chk01_0() {
			MCRowMapper map = new Map_down_MAR_chk01_0();
			return map;
		}

		/**
		 * 連携処理MAR_chk01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MAR_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("base_unit_st_act_qty", "base_unit_st_act_qty");
				addColumnPathMap("base_unit_yield_qty", "base_unit_yield_qty");
				addColumnPathMap("base_unit_dfct_qty", "base_unit_dfct_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("mfg_mtd_typ", "mfg_mtd_typ");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("aprv_flg", "aprv_flg");
				addColumnPathMap("mfg_aprv_role_cd", "mfg_aprv_role_cd");
				addColumnPathMap("old_mfg_aprv_sts_typ", "old_mfg_aprv_sts_typ");
				addColumnPathMap("old_end_act_tm", "old_end_act_tm");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr");
				addColumnPathMap("mfg_act_upd_cntr", "mfg_act_upd_cntr");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("itm_ord_no", "itm_ord_no");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("is_src_batch_flg", "is_src_batch_flg");
			}
		}

		/**
		 * 連携処理MAR_chk01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MAR_chk01_0(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR r_src) {
		}

		/**
		 * 連携処理MAR_chk01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MAR_chk01_0(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> src) {
			MCRowMapper _rm = createMap_down_MAR_chk01_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MAR_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MAR_chk01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MAR_chk01_1() {
			MCRowMapper map = new Map_down_MAR_chk01_1();
			return map;
		}

		/**
		 * 連携処理MAR_chk01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_MAR_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("oper_ord_no", "oper_ord_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("oper_act_no", "oper_act_no");
			}
		}

		/**
		 * 連携処理MAR_chk01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MAR_chk01_1(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR r_src) {
		}

		/**
		 * 連携処理MAR_chk01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MAR_chk01_1(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> src) {
			MCRowMapper _rm = createMap_down_MAR_chk01_1();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MAR_chk01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MAR_chk01の下りブロック2のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MAR_chk01_2() {
			MCRowMapper map = new Map_down_MAR_chk01_2();
			return map;
		}

		/**
		 * 連携処理MAR_chk01の下りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_down_MAR_chk01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("old_ver_no", "old_ver_no");
				addColumnPathMap("inpt_schd_no", "inpt_schd_no");
				addColumnPathMap("inpt_act_no", "inpt_act_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
			}
		}

		/**
		 * 連携処理MAR_chk01の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MAR_chk01_2(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR r_src) {
		}

		/**
		 * 連携処理MAR_chk01の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MAR_chk01_2(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> src) {
			MCRowMapper _rm = createMap_down_MAR_chk01_2();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MAR_chk01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MAR_chk01の下りブロック3のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MAR_chk01_3() {
			MCRowMapper map = new Map_down_MAR_chk01_3();
			return map;
		}

		/**
		 * 連携処理MAR_chk01の下りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_down_MAR_chk01_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("inpt_peg_no", "inpt_peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("fxd_loss_flg", "fxd_loss_flg");
				addColumnPathMap("loss_act_no", "loss_act_no");
				addColumnPathMap("loss_rsn_cd", "loss_rsn_cd");
			}
		}

		/**
		 * 連携処理MAR_chk01の下りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MAR_chk01_3(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR r_src) {
		}

		/**
		 * 連携処理MAR_chk01の下りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MAR_chk01_3(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> src) {
			MCRowMapper _rm = createMap_down_MAR_chk01_3();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlLossR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MAR_chk01_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MAR_chk01の下りブロック4のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MAR_chk01_4() {
			MCRowMapper map = new Map_down_MAR_chk01_4();
			return map;
		}

		/**
		 * 連携処理MAR_chk01の下りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_down_MAR_chk01_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("wk_act_no", "wk_act_no");
			}
		}

		/**
		 * 連携処理MAR_chk01の下りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MAR_chk01_4(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR r_src) {
		}

		/**
		 * 連携処理MAR_chk01の下りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MAR_chk01_4(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> src) {
			MCRowMapper _rm = createMap_down_MAR_chk01_4();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MAR_chk01_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MAR_chk01の下りブロック5のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MAR_chk01_5() {
			MCRowMapper map = new Map_down_MAR_chk01_5();
			return map;
		}

		/**
		 * 連携処理MAR_chk01の下りブロック5のためのRowMapperクラス。<p>
		 */
		public class Map_down_MAR_chk01_5 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("yield_act_no", "yield_act_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("not_stk_flg", "not_stk_flg");
				addColumnPathMap("old_lot_no", "old_lot_no");
				addColumnPathMap("old_sublot_no", "old_sublot_no");
				addColumnPathMap("old_yield_typ", "old_yield_typ");
				addColumnPathMap("old_base_unit_yield_act_qty", "old_base_unit_yield_act_qty");
			}
		}

		/**
		 * 連携処理MAR_chk01の下りブロック5のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MAR_chk01_5(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MAR_chk01の下りブロック5のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MAR_chk01_5(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_down_MAR_chk01_5();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MAR_chk01_5(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理MAR_chk01の下りブロック6のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MAR_chk01_6() {
			MCRowMapper map = new Map_down_MAR_chk01_6();
			return map;
		}

		/**
		 * 連携処理MAR_chk01の下りブロック6のためのRowMapperクラス。<p>
		 */
		public class Map_down_MAR_chk01_6 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("yield_act_no", "yield_act_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("old_lot_no", "old_lot_no");
				addColumnPathMap("old_sublot_no", "old_sublot_no");
			}
		}

		/**
		 * 連携処理MAR_chk01の下りブロック6のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MAR_chk01_6(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MAR_chk01の下りブロック6のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MAR_chk01_6(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_down_MAR_chk01_6();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MAR_chk01_6(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * MfgActReg_Chk03オペレーション.<p>
	 *
	 * 製造実績の一括登録・訂正前チェックの共通処理<br>
	 */
	abstract public class MfgActReg_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActReg_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R> down1;
		
		
		// コンストラクタ
		protected MfgActReg_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * MfgActReg_Chk03_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_CtrlR createMfgActReg_Chk03_CtrlR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_CtrlR.create();
		}

		/**
		 * MfgActReg_Chk03_Hdr1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R createMfgActReg_Chk03_Hdr1R(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R.create();
		}

		/**
		 * MfgActReg_Chk03_Hdr1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R> createMfgActReg_Chk03_Hdr1L(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R.class);
		}

		/**
		 * MfgActReg_Chk03_Hdr2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R createMfgActReg_Chk03_Hdr2R(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R.create();
		}

		/**
		 * MfgActReg_Chk03_Hdr2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R> createMfgActReg_Chk03_Hdr2L(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R.class);
		}

		/**
		 * MfgActReg_Chk03_DtlYieldByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR createMfgActReg_Chk03_DtlYieldByProdR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR.create();
		}

		/**
		 * MfgActReg_Chk03_DtlYieldByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR> createMfgActReg_Chk03_DtlYieldByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_unit_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>st_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_act_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_act_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>st_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_act_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgActReg_Chk04オペレーション.<p>
	 *
	 * 工数実績の登録・訂正前チェックを行う。<br>
	 */
	abstract public class MfgActReg_Chk04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActReg_Chk04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> down0;
		
		
		// コンストラクタ
		protected MfgActReg_Chk04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.class);
			up1 = mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgActReg_Chk04_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR createMfgActReg_Chk04_RsltR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.create();
		}

		/**
		 * MfgActReg_Chk04_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> createMfgActReg_Chk04_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.class);
		}

		/**
		 * MfgActReg_Chk04_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_CtrlR createMfgActReg_Chk04_CtrlR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_wk_act_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>brk_pd</td></tr>
		 * 	<tr><td><br></td><td>act_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>fclty</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>wk_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_wk_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>file_imp_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_wk_act_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>old_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>brk_pd</td></tr>
		 * 	<tr><td><br></td><td>act_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_dec_place</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_day_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>fclty</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>dpt_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>wk_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_wk_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgActReg_Chk05オペレーション.<p>
	 *
	 * 工数実績の取消前チェックを行う。<br>
	 */
	abstract public class MfgActReg_Chk05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActReg_Chk05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk05_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> down0;
		
		
		// コンストラクタ
		protected MfgActReg_Chk05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.class);
			up1 = mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk05_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgActReg_Chk05_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR createMfgActReg_Chk05_RsltR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.create();
		}

		/**
		 * MfgActReg_Chk05_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> createMfgActReg_Chk05_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.class);
		}

		/**
		 * MfgActReg_Chk05_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk05_CtrlR createMfgActReg_Chk05_CtrlR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk05_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_wk_act_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>wk_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk05_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk05_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_wk_act_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>old_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>wk_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgActReg_Upd01オペレーション.<p>
	 *
	 * 製造実績の登録・訂正・取消の共通処理<br>
	 */
	abstract public class MfgActReg_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActReg_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> up4;
		/** このオペレーションへの上り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> up5;
		/** このオペレーションへの上り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> up6;
		/** このオペレーションへの上り電文パラメータの第7ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_CtrlR up7;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> down5;
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> down6;
		
		/**
		 * 連携情報 MAT<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.MfgActTblReg_Upd01 （{@link #matUpd01}）<br>
		 * 連携先 mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.MfgActTblReg_Upd02 （{@link #matUpd02}）<br>
		 * 連携先 mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.MfgActTblReg_Upd03 （{@link #matUpd03}）<br>
		 * 連携先 mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.MfgActTblReg_Upd05 （{@link #matUpd05}）<br>
		 * 連携先 mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.MfgActTblReg_Upd06 （{@link #matUpd06}）<br>
		 */
		public final String MAT = "MAT";

		/**
		 * 連携オペレーション matUpd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.MfgActTblReg_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR&gt; （{@link #matUpd01_up0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.MfgActTblReg_Upd01 matUpd01;
		/**
		 * 連携オペレーション matUpd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.MfgActTblReg_Upd02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR&gt; （{@link #matUpd02_up0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.MfgActTblReg_Upd02 matUpd02;
		/**
		 * 連携オペレーション matUpd03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.MfgActTblReg_Upd03}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR&gt; （{@link #matUpd03_up0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.MfgActTblReg_Upd03 matUpd03;
		/**
		 * 連携オペレーション matUpd05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.MfgActTblReg_Upd05}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR&gt; （{@link #matUpd05_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR&gt; （{@link #matUpd05_down0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.MfgActTblReg_Upd05 matUpd05;
		/**
		 * 連携オペレーション matUpd06<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.MfgActTblReg_Upd06}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR&gt; （{@link #matUpd06_up0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.MfgActTblReg_Upd06 matUpd06;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR> matUpd01_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR> matUpd02_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR> matUpd03_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR> matUpd05_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR> matUpd06_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR> matUpd05_down0;
		/**
		 * 連携情報 MATI<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.MfgActTblReg_Upd04 （{@link #matUpd04}）<br>
		 */
		public final String MATI = "MATI";

		/**
		 * 連携オペレーション matUpd04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.MfgActTblReg_Upd04}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR&gt; （{@link #matUpd04_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR&gt; （{@link #matUpd04_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR&gt; （{@link #matUpd04_up2}）<br>
		 * 第4 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR&gt; （{@link #matUpd04_up3}）<br>
		 * 第5 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR&gt; （{@link #matUpd04_up4}）<br>
		 * 第6 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR&gt; （{@link #matUpd04_up5}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.MfgActTblReg_Upd04 matUpd04;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR> matUpd04_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR> matUpd04_up1;
		public final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR> matUpd04_up2;
		public final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR> matUpd04_up3;
		public final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR> matUpd04_up4;
		public final MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR> matUpd04_up5;
		// 連携ロジック下り
		
		// コンストラクタ
		protected MfgActReg_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR.class);
			up4 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR.class);
			up5 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR.class);
			up6 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR.class);
			up7 = mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR.class);
			down4 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR.class);
			down5 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR.class);
			down6 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR.class);

			// 連携オペレーションの初期化
			matUpd01 = mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.crtMfgActTblReg_Upd01();
			matUpd02 = mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.crtMfgActTblReg_Upd02();
			matUpd03 = mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.crtMfgActTblReg_Upd03();
			matUpd05 = mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.crtMfgActTblReg_Upd05();
			matUpd06 = mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.crtMfgActTblReg_Upd06();
			matUpd04 = mcframe.serverMSBC.MSBCL6060.MSBCL_MfgActTblRegService.crtMfgActTblReg_Upd04();
			
			// 連携オペレーションのコンテナ取得
			matUpd01_up0 = (MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR>)matUpd01.up(0);
			matUpd02_up0 = (MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR>)matUpd02.up(0);
			matUpd03_up0 = (MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR>)matUpd03.up(0);
			matUpd05_up0 = (MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR>)matUpd05.up(0);
			matUpd06_up0 = (MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR>)matUpd06.up(0);
			matUpd05_down0 = (MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR>)matUpd05.down(0);
			matUpd04_up0 = (MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR>)matUpd04.up(4);
			matUpd04_up1 = (MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR>)matUpd04.up(5);
			matUpd04_up2 = (MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR>)matUpd04.up(0);
			matUpd04_up3 = (MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR>)matUpd04.up(1);
			matUpd04_up4 = (MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR>)matUpd04.up(2);
			matUpd04_up5 = (MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR>)matUpd04.up(3);

			// オペレーション、オペレーショングループの登録
			appendOpe(MAT, matUpd01);
			appendOpe(MAT, matUpd02);
			appendOpe(MAT, matUpd03);
			appendOpe(MAT, matUpd05);
			appendOpe(MAT, matUpd06);
			appendOpe(MATI, matUpd04);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MAT<br>
		 * up0() => MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR&gt; （{@link #matUpd01_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR&gt; （{@link #matUpd02_up0}）<br>
		 * up5() => MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR&gt; （{@link #matUpd03_up0}）<br>
		 * up4() => MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR&gt; （{@link #matUpd05_up0}）<br>
		 * up6() => MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR&gt; （{@link #matUpd06_up0}）<br>
		 * MATI<br>
		 * up0() => MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR&gt; （{@link #matUpd04_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR&gt; （{@link #matUpd04_up1}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR&gt; （{@link #matUpd04_up2}）<br>
		 * up3() => MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR&gt; （{@link #matUpd04_up3}）<br>
		 * up5() => MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR&gt; （{@link #matUpd04_up4}）<br>
		 * up6() => MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR&gt; （{@link #matUpd04_up5}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MAT)) {
				up_MAT(matUpd01_up0, matUpd02_up0, matUpd03_up0, matUpd05_up0, matUpd06_up0, up0(), up1(), up5(), up4(), up6());
			}
			if (key.equals(MATI)) {
				up_MATI(matUpd04_up0, matUpd04_up1, matUpd04_up2, matUpd04_up3, matUpd04_up4, matUpd04_up5, up0(), up1(), up2(), up3(), up5(), up6());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MAT<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR&gt;（{@link #matUpd05_down0}）=> down4()<br>
		 * MATI<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MAT)) {
				down_MAT(down4(), matUpd05_down0);
			}
			if (key.equals(MATI)) {
				down_MATI();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			if (i == 4) return up4();
			if (i == 5) return up5();
			if (i == 6) return up6();
			if (i == 7) return up7();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			if (i == 5) return down5();
			if (i == 6) return down6();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
			down5().clear();
			down6().clear();
		}
		/**
		 * MfgActReg_Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR createMfgActReg_Upd01_HdrR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR.create();
		}

		/**
		 * MfgActReg_Upd01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> createMfgActReg_Upd01_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR.class);
		}

		/**
		 * MfgActReg_Upd01_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR createMfgActReg_Upd01_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR.create();
		}

		/**
		 * MfgActReg_Upd01_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> createMfgActReg_Upd01_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR.class);
		}

		/**
		 * MfgActReg_Upd01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR createMfgActReg_Upd01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR.create();
		}

		/**
		 * MfgActReg_Upd01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> createMfgActReg_Upd01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR.class);
		}

		/**
		 * MfgActReg_Upd01_DtlLossブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR createMfgActReg_Upd01_DtlLossR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR.create();
		}

		/**
		 * MfgActReg_Upd01_DtlLossブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> createMfgActReg_Upd01_DtlLossL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR.class);
		}

		/**
		 * MfgActReg_Upd01_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR createMfgActReg_Upd01_DtlWkR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR.create();
		}

		/**
		 * MfgActReg_Upd01_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> createMfgActReg_Upd01_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR.class);
		}

		/**
		 * MfgActReg_Upd01_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR createMfgActReg_Upd01_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR.create();
		}

		/**
		 * MfgActReg_Upd01_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> createMfgActReg_Upd01_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR.class);
		}

		/**
		 * MfgActReg_Upd01_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR createMfgActReg_Upd01_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR.create();
		}

		/**
		 * MfgActReg_Upd01_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> createMfgActReg_Upd01_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR.class);
		}

		/**
		 * MfgActReg_Upd01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_CtrlR createMfgActReg_Upd01_CtrlR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_no</td></tr>
		 * 	<tr><td><br></td><td>inst_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>st_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_act_qty</td></tr>
		 * 	<tr><td><br></td><td>rem_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dfct_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>act_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>act_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>prnt_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_yield</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_purc_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>act_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_outsrc_srv_flg</td></tr>
		 * 	<tr><td><br></td><td>lst_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * 	<tr><td><br></td><td>is_src_md_mfg_srv_flg</td></tr>
		 * 	<tr><td><br></td><td>unschd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>not_bkf_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>not_wk_cost_upd_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>not_pd_chk_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_act_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_yield</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bkf_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_upd_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>bkf_not_ref_flg</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_lot_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_qty</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>acxfr_act_bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_sno4</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>bkf_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>base_unit_alt_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>slf_support_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>slf_support_upri</td></tr>
		 * 	<tr><td><br></td><td>slf_support_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>slf_support_xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>slf_support_xrate</td></tr>
		 * 	<tr><td><br></td><td>vmi_interim_flg</td></tr>
		 * 	<tr><td><br></td><td>vmi_upri</td></tr>
		 * 	<tr><td><br></td><td>base_unit_std_qty</td></tr>
		 * 	<tr><td><br></td><td>add_flg</td></tr>
		 * 	<tr><td><br></td><td>old_ver_no</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>is_only_abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_peg_no</td></tr>
		 * 	<tr><td><br></td><td>fxd_loss_flg</td></tr>
		 * 	<tr><td><br></td><td>loss_act_no</td></tr>
		 * 	<tr><td><br></td><td>loss_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>loss_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_loss_qty</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>act_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>brk_pd</td></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>fclty</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wk_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>wk_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>wk_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> up4() {
			return up4;
		}

		/**
		 * 上り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>not_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>old_lot_no</td></tr>
		 * 	<tr><td><br></td><td>old_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>old_yield_typ</td></tr>
		 * 	<tr><td><br></td><td>old_base_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> up5() {
			return up5;
		}

		/**
		 * 上り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_id</td></tr>
		 * 	<tr><td><br></td><td>data_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>old_lot_no</td></tr>
		 * 	<tr><td><br></td><td>old_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> up6() {
			return up6;
		}

		/**
		 * 上り電文の第7ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第7ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>not_io_act_srv_exec_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_CtrlR up7() {
			return up7;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_peg_no</td></tr>
		 * 	<tr><td><br></td><td>loss_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> down6() {
			return down6;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this).info;
		}

		//-----------------------MAT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMATの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAT(MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR> dest1_0, MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR> dest2_0, MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR> dest3_0, MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR> dest4_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> src_MfgActReg_Upd01_Hdr, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> src_MfgActReg_Upd01_DtlOper, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> src_MfgActReg_Upd01_DtlYield, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> src_MfgActReg_Upd01_DtlWk, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> src_MfgActReg_Upd01_DtlByProd){
			up_MAT_matUpd01_0(dest0_0, src_MfgActReg_Upd01_Hdr);
			up_MAT_matUpd02_0(dest1_0, src_MfgActReg_Upd01_DtlOper);
			up_MAT_matUpd03_0(dest2_0, src_MfgActReg_Upd01_DtlYield);
			up_MAT_matUpd05_0(dest3_0, src_MfgActReg_Upd01_DtlWk);
			up_MAT_matUpd06_0(dest4_0, src_MfgActReg_Upd01_DtlByProd);
		}
		
		/**
		 * 連携処理MAT_matUpd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAT_matUpd01_0() {
			MCRowMapper map = new Map_up_MAT_matUpd01_0();
			return map;
		}

		/**
		 * 連携処理MAT_matUpd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAT_matUpd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("st_act_tm", "st_act_tm");
				addColumnPathMap("st_ac_dt", "st_ac_dt");
				addColumnPathMap("end_act_tm", "end_act_tm");
				addColumnPathMap("end_ac_dt", "end_ac_dt");
				addColumnPathMap("base_unit_yield_qty", "base_unit_yield_qty");
				addColumnPathMap("base_unit_dfct_qty", "base_unit_dfct_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("act_usr_cd", "act_usr_cd");
				addColumnPathMap("act_dpt_cd", "act_dpt_cd");
				addColumnPathMap("mfg_act_rpt_rmrks", "act_rpt_rmrks");
				addColumnPathMap("mfg_act_intr_rmrks", "intr_rmrks");
				addColumnPathMap("mfg_act_sub_char1", "mfg_act_sub_char1");
				addColumnPathMap("mfg_act_sub_char2", "mfg_act_sub_char2");
				addColumnPathMap("mfg_act_sub_char3", "mfg_act_sub_char3");
				addColumnPathMap("act_prnt_flg", "act_prnt_flg");
				addColumnPathMap("act_prnt_tm", "act_prnt_tm");
				addColumnPathMap("prnt_seq", "prnt_seq");
				addColumnPathMap("itm_yield", "itm_yield");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("mfg_aprv_sts_typ", "mfg_aprv_sts_typ");
				addColumnPathMap("aprv_dt", "aprv_dt");
				addColumnPathMap("aprv_dpt_cd", "aprv_dpt_cd");
				addColumnPathMap("aprv_usr_cd", "aprv_usr_cd");
				addColumnPathMap("aprv_tm", "aprv_tm");
				addColumnPathMap("aprv_rsn", "aprv_rsn");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("arr_purc_auto_reg_flg", "arr_purc_auto_reg_flg");
			}
		}

		/**
		 * 連携処理MAT_matUpd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAT_matUpd01_0(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR r_src) {
		}

		/**
		 * 連携処理MAT_matUpd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAT_matUpd01_0(MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> src) {
			MCRowMapper _rm = createMap_up_MAT_matUpd01_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAT_matUpd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MAT_matUpd02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAT_matUpd02_0() {
			MCRowMapper map = new Map_up_MAT_matUpd02_0();
			return map;
		}

		/**
		 * 連携処理MAT_matUpd02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAT_matUpd02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("oper_unit_qty", "oper_unit_act_qty");
				addColumnPathMap("oper_std_qty", "oper_std_qty");
				addColumnPathMap("oper_conv_qty", "oper_conv_qty");
				addColumnPathMap("oper_unit_cd", "oper_unit_cd");
				addColumnPathMap("oper_yield", "oper_yield");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("intr_rmrks", "oper_act_intr_rmrks");
				addColumnPathMap("act_rpt_rmrks", "oper_act_rpt_rmrks");
				addColumnPathMap("oper_act_sub_char1", "oper_act_sub_char1");
				addColumnPathMap("oper_act_sub_char2", "oper_act_sub_char2");
				addColumnPathMap("oper_act_sub_char3", "oper_act_sub_char3");
				addColumnPathMap("bkf_ctl_flg", "bkf_upd_flg");
				addColumnPathMap("wk_cost_calc_ctl_flg", "wk_cost_upd_calc_flg");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("oper_act_no", "oper_act_no");
				addColumnPathMap("mes_id", "mes_id");
				addColumnPathMap("data_no", "data_no");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("arr_act_no", "arr_act_no");
				addColumnPathMap("purc_act_io_no", "purc_act_io_no");
				addColumnPathMap("st_act_tm", "st_act_tm");
				addColumnPathMap("end_act_tm", "end_act_tm");
				addColumnPathMap("bkf_not_ref_flg", "bkf_not_ref_flg");
				addColumnPathMap("not_cmpl_flg", "not_cmpl_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_oper_act_no", "ext_oper_act_no");
				addColumnPathMap("if_auto_reg_flg", "if_auto_reg_flg");
			}
		}

		/**
		 * 連携処理MAT_matUpd02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAT_matUpd02_0(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR r_src) {
		}

		/**
		 * 連携処理MAT_matUpd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAT_matUpd02_0(MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> src) {
			MCRowMapper _rm = createMap_up_MAT_matUpd02_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd02_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAT_matUpd02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MAT_matUpd03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAT_matUpd03_0() {
			MCRowMapper map = new Map_up_MAT_matUpd03_0();
			return map;
		}

		/**
		 * 連携処理MAT_matUpd03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAT_matUpd03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("yield_typ", "yield_typ");
				addColumnPathMap("trd_unit_qty", "trd_unit_yield_act_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_yield_act_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("act_tm", "act_tm");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("lot_ctl_flg", "same_lot_flg");
				addColumnPathMap("yield_rsn_cd", "yield_rsn_cd");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("yield_rate", "yield_rate");
				addColumnPathMap("insp_cnt_rmrks", "insp_cnt_rmrks");
				addColumnPathMap("intr_rmrks", "yield_act_intr_rmrks");
				addColumnPathMap("act_rpt_rmrks", "yield_act_rpt_rmrks");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("yield_act_sub_char1", "yield_act_sub_char1");
				addColumnPathMap("yield_act_sub_char2", "yield_act_sub_char2");
				addColumnPathMap("yield_act_sub_char3", "yield_act_sub_char3");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("yield_act_no", "yield_act_no");
				addColumnPathMap("mes_id", "mes_id");
				addColumnPathMap("data_no", "data_no");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("disp_seq", "oper_disp_seq");
				addColumnPathMap("itm_ord_no", "itm_ord_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("pack_flg", "pack_flg");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("act_dpt_cd", "act_dpt_cd");
				addColumnPathMap("act_usr_cd", "act_usr_cd");
				addColumnPathMap("itm_mfg_inst_qty", "itm_mfg_inst_qty");
				addColumnPathMap("mfg_st_qty", "mfg_st_qty");
				addColumnPathMap("mfg_inst_lot_no", "mfg_inst_lot_no");
				addColumnPathMap("mfg_inst_sublot_no", "mfg_inst_sublot_no");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("oper_act_no", "oper_act_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("mfg_mtd_typ", "mfg_mtd_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("yield_loc_cd", "yield_loc_cd");
				addColumnPathMap("yield_str_ln_cd", "yield_str_ln_cd");
				addColumnPathMap("sublot_ctl_flg", "sublot_ctl_flg");
				addColumnPathMap("bkf_ctl_flg", "bkf_ctl_flg");
				addColumnPathMap("not_stk_flg", "not_stk_flg");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_yield_act_no", "ext_yield_act_no");
			}
		}

		/**
		 * 連携処理MAT_matUpd03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAT_matUpd03_0(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MAT_matUpd03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAT_matUpd03_0(MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_up_MAT_matUpd03_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd03_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAT_matUpd03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MAT_matUpd05の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAT_matUpd05_0() {
			MCRowMapper map = new Map_up_MAT_matUpd05_0();
			return map;
		}

		/**
		 * 連携処理MAT_matUpd05の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAT_matUpd05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("wk_cost", "act_wk_cost");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("st_tm", "st_tm");
				addColumnPathMap("end_tm", "end_tm");
				addColumnPathMap("brk_pd", "brk_pd");
				addColumnPathMap("wk_day_cd", "wk_day_cd");
				addColumnPathMap("wk_rsn_cd", "wk_rsn_cd");
				addColumnPathMap("wk_usr_cd", "wk_usr_cd");
				addColumnPathMap("wk_usr_dpt_cd", "wk_usr_dpt_cd");
				addColumnPathMap("fclty", "fclty");
				addColumnPathMap("wk_cost_calc_ctl_flg", "wk_cost_calc_upd_flg");
				addColumnPathMap("intr_rmrks", "wk_act_intr_rmrks");
				addColumnPathMap("sub_char1", "wk_act_sub_char1");
				addColumnPathMap("sub_char2", "wk_act_sub_char2");
				addColumnPathMap("sub_char3", "wk_act_sub_char3");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("wk_act_no", "wk_act_no");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("oper_act_no", "oper_act_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_wk_act_no", "ext_wk_act_no");
			}
		}

		/**
		 * 連携処理MAT_matUpd05の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAT_matUpd05_0(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR r_src) {
		}

		/**
		 * 連携処理MAT_matUpd05の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAT_matUpd05_0(MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> src) {
			MCRowMapper _rm = createMap_up_MAT_matUpd05_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAT_matUpd05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MAT_matUpd06の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAT_matUpd06_0() {
			MCRowMapper map = new Map_up_MAT_matUpd06_0();
			return map;
		}

		/**
		 * 連携処理MAT_matUpd06の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAT_matUpd06_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("trd_unit_qty", "trd_unit_yield_act_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_yield_act_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("act_tm", "act_tm");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("lot_ctl_flg", "same_lot_flg");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("yield_rsn_cd", "yield_rsn_cd");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("yield_rate", "yield_rate");
				addColumnPathMap("intr_rmrks", "yield_act_intr_rmrks");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("yield_act_sub_char1", "yield_act_sub_char1");
				addColumnPathMap("yield_act_sub_char2", "yield_act_sub_char2");
				addColumnPathMap("yield_act_sub_char3", "yield_act_sub_char3");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("yield_act_no", "yield_act_no");
				addColumnPathMap("mes_id", "mes_id");
				addColumnPathMap("data_no", "data_no");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("disp_seq", "oper_disp_seq");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("pack_flg", "pack_flg");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("act_dpt_cd", "act_dpt_cd");
				addColumnPathMap("act_usr_cd", "act_usr_cd");
				addColumnPathMap("itm_mfg_inst_qty", "itm_mfg_inst_qty");
				addColumnPathMap("mfg_st_qty", "mfg_st_qty");
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("par_itm_nm", "par_itm_nm");
				addColumnPathMap("mfg_inst_lot_no", "mfg_inst_lot_no");
				addColumnPathMap("mfg_inst_sublot_no", "mfg_inst_sublot_no");
				addColumnPathMap("mfg_inst_sno1", "mfg_inst_sno1");
				addColumnPathMap("mfg_inst_sno2", "mfg_inst_sno2");
				addColumnPathMap("mfg_inst_sno3", "mfg_inst_sno3");
				addColumnPathMap("mfg_inst_sno4", "mfg_inst_sno4");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("mfg_inst_sno1_mng_typ", "mfg_inst_sno1_mng_typ");
				addColumnPathMap("mfg_inst_sno2_mng_typ", "mfg_inst_sno2_mng_typ");
				addColumnPathMap("mfg_inst_sno3_mng_typ", "mfg_inst_sno3_mng_typ");
				addColumnPathMap("mfg_inst_sno4_mng_typ", "mfg_inst_sno4_mng_typ");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("oper_act_no", "oper_act_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("mfg_mtd_typ", "mfg_mtd_typ");
				addColumnPathMap("yield_typ", "yield_typ");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("yield_loc_cd", "yield_loc_cd");
				addColumnPathMap("yield_str_ln_cd", "yield_str_ln_cd");
				addColumnPathMap("bkf_ctl_flg", "bkf_ctl_flg");
				addColumnPathMap("sublot_ctl_flg", "sublot_ctl_flg");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_yield_act_no", "ext_yield_act_no");
			}
		}

		/**
		 * 連携処理MAT_matUpd06の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAT_matUpd06_0(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MAT_matUpd06の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAT_matUpd06_0(MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_up_MAT_matUpd06_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd06_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAT_matUpd06_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MATI専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMATIの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MATI(MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR> dest0_2, MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR> dest0_3, MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR> dest0_4, MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR> dest0_5, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> src_MfgActReg_Upd01_Hdr, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> src_MfgActReg_Upd01_DtlOper, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> src_MfgActReg_Upd01_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> src_MfgActReg_Upd01_DtlLoss, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> src_MfgActReg_Upd01_DtlYield, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> src_MfgActReg_Upd01_DtlByProd){
			up_MATI_matUpd04_0(dest0_0, src_MfgActReg_Upd01_Hdr);
			up_MATI_matUpd04_1(dest0_1, src_MfgActReg_Upd01_DtlOper);
			up_MATI_matUpd04_2(dest0_2, src_MfgActReg_Upd01_DtlInpt);
			up_MATI_matUpd04_3(dest0_3, src_MfgActReg_Upd01_DtlLoss);
			up_MATI_matUpd04_4(dest0_4, src_MfgActReg_Upd01_DtlYield);
			up_MATI_matUpd04_5(dest0_5, src_MfgActReg_Upd01_DtlByProd);
		}
		
		/**
		 * 連携処理MATI_matUpd04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MATI_matUpd04_0() {
			MCRowMapper map = new Map_up_MATI_matUpd04_0();
			return map;
		}

		/**
		 * 連携処理MATI_matUpd04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MATI_matUpd04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("hdr_peg_no", "peg_no");
				addColumnPathMap("bkf_tgt_cnt", "bkf_tgt_cnt");
				addColumnPathMap("bkf_success_cnt", "bkf_success_cnt");
				addColumnPathMap("bkf_failure_cnt", "bkf_failure_cnt");
			}
		}

		/**
		 * 連携処理MATI_matUpd04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MATI_matUpd04_0(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR r_src) {
		}

		/**
		 * 連携処理MATI_matUpd04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MATI_matUpd04_0(MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> src) {
			MCRowMapper _rm = createMap_up_MATI_matUpd04_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MATI_matUpd04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MATI_matUpd04の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MATI_matUpd04_1() {
			MCRowMapper map = new Map_up_MATI_matUpd04_1();
			return map;
		}

		/**
		 * 連携処理MATI_matUpd04の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MATI_matUpd04_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("oper_peg_no", "peg_no");
				addColumnPathMap("bkf_tgt_cnt", "bkf_tgt_cnt");
				addColumnPathMap("bkf_success_cnt", "bkf_success_cnt");
				addColumnPathMap("bkf_failure_cnt", "bkf_failure_cnt");
			}
		}

		/**
		 * 連携処理MATI_matUpd04の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MATI_matUpd04_1(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR r_src) {
		}

		/**
		 * 連携処理MATI_matUpd04の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MATI_matUpd04_1(MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> src) {
			MCRowMapper _rm = createMap_up_MATI_matUpd04_1();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MATI_matUpd04_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MATI_matUpd04の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MATI_matUpd04_2() {
			MCRowMapper map = new Map_up_MATI_matUpd04_2();
			return map;
		}

		/**
		 * 連携処理MATI_matUpd04の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_MATI_matUpd04_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_grp_seq", "alt_grp_seq");
				addColumnPathMap("alt_itm_fix_flg", "alt_itm_fix_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("base_unit_inpt_qty", "base_unit_inpt_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("cont_fctr_flg", "cont_fctr_flg");
				addColumnPathMap("cont_fctr_rnd_typ", "cont_fctr_rnd_typ");
				addColumnPathMap("cont_fctr_dec_place", "cont_fctr_dec_place");
				addColumnPathMap("act_cont_fctr", "act_cont_fctr");
				addColumnPathMap("std_cont_fctr", "std_cont_fctr");
				addColumnPathMap("cont_qty", "cont_inpt_qty");
				addColumnPathMap("cont_fctr_unit_cd", "cont_fctr_unit_cd");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("vld_dt", "vld_dt");
				addColumnPathMap("first_gr_dt", "first_gr_dt");
				addColumnPathMap("lot_seq", "lot_seq");
				addColumnPathMap("acxfr_qty", "acxfr_act_qty");
				addColumnPathMap("acxfr_rsn_cd", "acxfr_act_rsn_cd");
				addColumnPathMap("acxfr_bd_dpt_cd", "acxfr_act_bd_dpt_cd");
				addColumnPathMap("act_tm", "act_tm");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno1_null_flg", "sno1_null_flg");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno2_null_flg", "sno2_null_flg");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno3_null_flg", "sno3_null_flg");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sno4_null_flg", "sno4_null_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("inpt_rsn_cd", "inpt_rsn_cd");
				addColumnPathMap("inpt_loc_cd", "inpt_loc_cd");
				addColumnPathMap("inpt_str_ln_cd", "inpt_str_ln_cd");
				addColumnPathMap("inpt_loc_sppl_cd", "inpt_loc_sppl_cd");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("intr_rmrks", "inpt_act_intr_rmrks");
				addColumnPathMap("act_rpt_rmrks", "inpt_act_rpt_rmrks");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("inpt_act_sub_char1", "inpt_act_sub_char1");
				addColumnPathMap("inpt_act_sub_char2", "inpt_act_sub_char2");
				addColumnPathMap("inpt_act_sub_char3", "inpt_act_sub_char3");
				addColumnPathMap("bkf_ctl_flg", "bkf_upd_flg");
				addColumnPathMap("lot_mix_flg", "lot_mix_flg");
				addColumnPathMap("sublot_mix_flg", "sublot_mix_flg");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("alloc_flg", "alloc_flg");
				addColumnPathMap("alloc_ctl_typ", "alloc_ctl_typ");
				addColumnPathMap("inpt_schd_no", "inpt_schd_no");
				addColumnPathMap("inpt_act_no", "inpt_act_no");
				addColumnPathMap("mes_id", "mes_id");
				addColumnPathMap("data_no", "data_no");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("disp_seq", "oper_disp_seq");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("mfg_mtd_typ", "mfg_mtd_typ");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("act_dpt_cd", "act_dpt_cd");
				addColumnPathMap("act_usr_cd", "act_usr_cd");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("mfg_str_ln_cd", "mfg_str_ln_cd");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("itm_mfg_inst_qty", "itm_mfg_inst_qty");
				addColumnPathMap("mfg_st_qty", "mfg_st_qty");
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("par_itm_nm", "par_itm_nm");
				addColumnPathMap("mfg_inst_lot_no", "mfg_inst_lot_no");
				addColumnPathMap("mfg_inst_sublot_no", "mfg_inst_sublot_no");
				addColumnPathMap("mfg_inst_sno1", "mfg_inst_sno1");
				addColumnPathMap("mfg_inst_sno2", "mfg_inst_sno2");
				addColumnPathMap("mfg_inst_sno3", "mfg_inst_sno3");
				addColumnPathMap("mfg_inst_sno4", "mfg_inst_sno4");
				addColumnPathMap("mfg_inst_sno1_mng_typ", "mfg_inst_sno1_mng_typ");
				addColumnPathMap("mfg_inst_sno2_mng_typ", "mfg_inst_sno2_mng_typ");
				addColumnPathMap("mfg_inst_sno3_mng_typ", "mfg_inst_sno3_mng_typ");
				addColumnPathMap("mfg_inst_sno4_mng_typ", "mfg_inst_sno4_mng_typ");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("slf_support_cur_cd", "slf_support_cur_cd");
				addColumnPathMap("slf_support_upri", "slf_support_upri");
				addColumnPathMap("slf_support_tax_cd", "slf_support_tax_cd");
				addColumnPathMap("slf_support_xrate_cd", "slf_support_xrate_cd");
				addColumnPathMap("slf_support_xrate", "slf_support_xrate");
				addColumnPathMap("vmi_interim_flg", "vmi_interim_flg");
				addColumnPathMap("vmi_upri", "vmi_upri");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("oper_act_no", "oper_act_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("stk_insp_typ", "stk_insp_typ");
				addColumnPathMap("base_unit_std_qty", "base_unit_std_qty");
				addColumnPathMap("add_flg", "add_flg");
				addColumnPathMap("lst_reg_flg", "lst_reg_flg");
				addColumnPathMap("is_src_batch_flg", "is_src_batch_flg");
				addColumnPathMap("is_src_md_mfg_srv_flg", "is_src_md_mfg_srv_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_inpt_act_no", "ext_inpt_act_no");
				addColumnPathMap("if_auto_reg_flg", "if_auto_reg_flg");
				addColumnPathMap("not_pd_chk_flg", "not_pd_chk_flg");
				addColumnPathMap("is_only_abort_flg", "is_only_abort_flg");
			}
		}

		/**
		 * 連携処理MATI_matUpd04の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MATI_matUpd04_2(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR r_src) {
		}

		/**
		 * 連携処理MATI_matUpd04の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MATI_matUpd04_2(MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> src) {
			MCRowMapper _rm = createMap_up_MATI_matUpd04_2();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MATI_matUpd04_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MATI_matUpd04の上りブロック3のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MATI_matUpd04_3() {
			MCRowMapper map = new Map_up_MATI_matUpd04_3();
			return map;
		}

		/**
		 * 連携処理MATI_matUpd04の上りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_up_MATI_matUpd04_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("inpt_peg_no", "inpt_peg_no");
				addColumnPathMap("fxd_loss_flg", "fxd_loss_flg");
				addColumnPathMap("loss_act_no", "loss_act_no");
				addColumnPathMap("inpt_act_no", "inpt_act_no");
				addColumnPathMap("loss_rsn_cd", "loss_rsn_cd");
				addColumnPathMap("base_unit_qty", "loss_qty");
				addColumnPathMap("cont_qty", "cont_loss_qty");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("loss_act_sub_char1", "sub_char1");
				addColumnPathMap("loss_act_sub_char2", "sub_char2");
				addColumnPathMap("loss_act_sub_char3", "sub_char3");
			}
		}

		/**
		 * 連携処理MATI_matUpd04の上りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MATI_matUpd04_3(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR r_src) {
		}

		/**
		 * 連携処理MATI_matUpd04の上りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MATI_matUpd04_3(MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> src) {
			MCRowMapper _rm = createMap_up_MATI_matUpd04_3();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR r_src : src){
				mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlLossR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MATI_matUpd04_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MATI_matUpd04の上りブロック4のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MATI_matUpd04_4() {
			MCRowMapper map = new Map_up_MATI_matUpd04_4();
			return map;
		}

		/**
		 * 連携処理MATI_matUpd04の上りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_up_MATI_matUpd04_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("trd_unit_qty", "trd_unit_yield_act_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_yield_act_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("loc_cd", "strg_loc_cd");
				addColumnPathMap("str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("yield_act_no", "yield_act_no");
				addColumnPathMap("pack_flg", "pack_flg");
				addColumnPathMap("mfg_mtd_typ", "mfg_mtd_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("not_stk_flg", "not_stk_flg");
			}
		}

		/**
		 * 連携処理MATI_matUpd04の上りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MATI_matUpd04_4(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MATI_matUpd04の上りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MATI_matUpd04_4(MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_up_MATI_matUpd04_4();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MATI_matUpd04_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MATI_matUpd04の上りブロック5のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MATI_matUpd04_5() {
			MCRowMapper map = new Map_up_MATI_matUpd04_5();
			return map;
		}

		/**
		 * 連携処理MATI_matUpd04の上りブロック5のためのRowMapperクラス。<p>
		 */
		public class Map_up_MATI_matUpd04_5 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("trd_unit_qty", "trd_unit_yield_act_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_yield_act_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("loc_cd", "strg_loc_cd");
				addColumnPathMap("str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("yield_act_no", "yield_act_no");
				addColumnPathMap("pack_flg", "pack_flg");
				addColumnPathMap("mfg_mtd_typ", "mfg_mtd_typ");
			}
		}

		/**
		 * 連携処理MATI_matUpd04の上りブロック5のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MATI_matUpd04_5(mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MATI_matUpd04の上りブロック5のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MATI_matUpd04_5(MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_up_MATI_matUpd04_5();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd04_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MATI_matUpd04_5(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MAT専用down関連メソッド--------------------------
		/**
		 * 連携処理MAT_matUpd05の下りブロック0のJoinKey<p>
		 */
		protected MCJoinKey<MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR>> MAT_matUpd05_0_jk;

		/**
		 * オペレーショングループMATの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAT(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> dest_MfgActReg_Upd01_DtlWk, MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR> src3_0){
			join_MAT_matUpd05_0(dest_MfgActReg_Upd01_DtlWk, src3_0);
			down_MAT_matUpd05_0(dest_MfgActReg_Upd01_DtlWk);
		}

		/**
		 * 連携処理MAT_matUpd05の下りブロック0のJoinKeyを作成する。<p>
		 */
		protected void join_MAT_matUpd05_0(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR> src){
			String[] dest_cols ={
				};
			String[] src_cols = {
				};
			MAT_matUpd05_0_jk = dest.join(dest_cols, src, src_cols);
		}

		/**
		 * 連携処理MAT_matUpd05の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MAT_matUpd05_0() {
			MCRowMapper map = new Map_down_MAT_matUpd05_0();
			return map;
		}

		/**
		 * 連携処理MAT_matUpd05の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MAT_matUpd05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("act_wk_cost", "wk_cost");
				addColumnPathMap("wk_act_no", "wk_act_no");
			}
		}

		/**
		 * 連携処理MAT_matUpd05の下りブロック0のJoin処理を行う。<p>
		 *
		 * @param dest コピー先のList
		 */
		protected void down_MAT_matUpd05_0(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> dest){
			if(MAT_matUpd05_0_jk == null) return;
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR r_dest : dest){
				mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR jRow = (mcframe.serverMSBC.MSBCL6060.MfgActTblReg_Upd05_DtlR)r_dest.getJoinedRow(MAT_matUpd05_0_jk);
				if(jRow == null) continue;
				r_dest.peg_no(jRow.peg_no());
				r_dest.act_wk_cost(jRow.wk_cost());
				r_dest.wk_act_no(jRow.wk_act_no());
			}
		}
		//-----------------------MATI専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMATIの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MATI(){
		}
	}
	/**
	 * MfgActReg_Upd02オペレーション.<p>
	 *
	 * 製造実績の一括登録・訂正処理<br>
	 */
	abstract public class MfgActReg_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActReg_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR> down2;
		/** [MfgActReg_Upd02_DtlByProd]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> aMfgActReg_Upd02_DtlByProd;
		/** [MfgActReg_Upd02_DtlInpt]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> aMfgActReg_Upd02_DtlInpt;
		/** [MfgActReg_Upd02_DtlLoss]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> aMfgActReg_Upd02_DtlLoss;
		/** [MfgActReg_Upd02_DtlOper]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> aMfgActReg_Upd02_DtlOper;
		/** [MfgActReg_Upd02_DtlWk]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> aMfgActReg_Upd02_DtlWk;
		/** [MfgActReg_Upd02_DtlYield]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> aMfgActReg_Upd02_DtlYield;
		/** [MfgActReg_Upd02_Hdr]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> aMfgActReg_Upd02_Hdr;
		
		/**
		 * 連携情報 MAR1<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Upd01 （{@link #marUpd01}）<br>
		 */
		public final String MAR1 = "MAR1";

		/**
		 * 連携オペレーション marUpd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR&gt; （{@link #marUpd01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR&gt; （{@link #marUpd01_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR&gt; （{@link #marUpd01_up2}）<br>
		 * 第4 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR&gt; （{@link #marUpd01_up3}）<br>
		 * 第5 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR&gt; （{@link #marUpd01_up4}）<br>
		 * 第6 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR&gt; （{@link #marUpd01_up5}）<br>
		 * 第7 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR&gt; （{@link #marUpd01_up6}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Upd01 marUpd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> marUpd01_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> marUpd01_up1;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> marUpd01_up2;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> marUpd01_up3;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> marUpd01_up4;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> marUpd01_up5;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> marUpd01_up6;
		// 連携ロジック下り
		/**
		 * 連携情報 MAR2<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Chk03 （{@link #marChk03}）<br>
		 */
		public final String MAR2 = "MAR2";

		/**
		 * 連携オペレーション marChk03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Chk03}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_CtrlR （{@link #marChk03_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R&gt; （{@link #marChk03_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R&gt; （{@link #marChk03_up2}）<br>
		 * 第4 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR&gt; （{@link #marChk03_up3}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Chk03 marChk03;
		// 連携ロジック上り
		public final mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_CtrlR marChk03_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R> marChk03_up1;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R> marChk03_up2;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR> marChk03_up3;
		// 連携ロジック下り
		
		// コンストラクタ
		protected MfgActReg_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR.class);
			aMfgActReg_Upd02_DtlByProd = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR.class);
			aMfgActReg_Upd02_DtlInpt = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR.class);
			aMfgActReg_Upd02_DtlLoss = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR.class);
			aMfgActReg_Upd02_DtlOper = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR.class);
			aMfgActReg_Upd02_DtlWk = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR.class);
			aMfgActReg_Upd02_DtlYield = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR.class);
			aMfgActReg_Upd02_Hdr = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR.class);

			// 連携オペレーションの初期化
			marUpd01 = mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.crtMfgActReg_Upd01();
			marChk03 = mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.crtMfgActReg_Chk03();
			
			// 連携オペレーションのコンテナ取得
			marUpd01_up0 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR>)marUpd01.up(0);
			marUpd01_up1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR>)marUpd01.up(1);
			marUpd01_up2 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR>)marUpd01.up(2);
			marUpd01_up3 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR>)marUpd01.up(3);
			marUpd01_up4 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR>)marUpd01.up(4);
			marUpd01_up5 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR>)marUpd01.up(5);
			marUpd01_up6 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR>)marUpd01.up(6);
			marChk03_up0 = (mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_CtrlR)marChk03.up(0);
			marChk03_up1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R>)marChk03.up(1);
			marChk03_up2 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R>)marChk03.up(2);
			marChk03_up3 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR>)marChk03.up(3);

			// オペレーション、オペレーショングループの登録
			appendOpe(MAR1, marUpd01);
			appendOpe(MAR2, marChk03);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MAR1<br>
		 * aMfgActReg_Upd02_Hdr => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR&gt; （{@link #marUpd01_up0}）<br>
		 * aMfgActReg_Upd02_DtlOper => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR&gt; （{@link #marUpd01_up1}）<br>
		 * aMfgActReg_Upd02_DtlInpt => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR&gt; （{@link #marUpd01_up2}）<br>
		 * aMfgActReg_Upd02_DtlLoss => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR&gt; （{@link #marUpd01_up3}）<br>
		 * aMfgActReg_Upd02_DtlWk => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR&gt; （{@link #marUpd01_up4}）<br>
		 * aMfgActReg_Upd02_DtlYield => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR&gt; （{@link #marUpd01_up5}）<br>
		 * aMfgActReg_Upd02_DtlByProd => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR&gt; （{@link #marUpd01_up6}）<br>
		 * MAR2<br>
		 * up0() => mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_CtrlR （{@link #marChk03_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R&gt; （{@link #marChk03_up1}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R&gt; （{@link #marChk03_up2}）<br>
		 * up3() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR&gt; （{@link #marChk03_up3}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MAR1)) {
				up_MAR1(marUpd01_up0, marUpd01_up1, marUpd01_up2, marUpd01_up3, marUpd01_up4, marUpd01_up5, marUpd01_up6, aMfgActReg_Upd02_Hdr, aMfgActReg_Upd02_DtlOper, aMfgActReg_Upd02_DtlInpt, aMfgActReg_Upd02_DtlLoss, aMfgActReg_Upd02_DtlWk, aMfgActReg_Upd02_DtlYield, aMfgActReg_Upd02_DtlByProd);
			}
			if (key.equals(MAR2)) {
				up_MAR2(marChk03_up0, marChk03_up1, marChk03_up2, marChk03_up3, up0(), up1(), up2(), up3());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MAR1<br>
		 * （下りブロック定義なし）<br>
		 * MAR2<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MAR1)) {
				down_MAR1();
			}
			if (key.equals(MAR2)) {
				down_MAR2();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * MfgActReg_Upd02_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_CtrlR createMfgActReg_Upd02_CtrlR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_CtrlR.create();
		}

		/**
		 * MfgActReg_Upd02_Hdr1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R createMfgActReg_Upd02_Hdr1R(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R.create();
		}

		/**
		 * MfgActReg_Upd02_Hdr1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> createMfgActReg_Upd02_Hdr1L(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R.class);
		}

		/**
		 * MfgActReg_Upd02_Hdr2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R createMfgActReg_Upd02_Hdr2R(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R.create();
		}

		/**
		 * MfgActReg_Upd02_Hdr2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> createMfgActReg_Upd02_Hdr2L(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R.class);
		}

		/**
		 * MfgActReg_Upd02_DtlYieldByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR createMfgActReg_Upd02_DtlYieldByProdR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR.create();
		}

		/**
		 * MfgActReg_Upd02_DtlYieldByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR> createMfgActReg_Upd02_DtlYieldByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR.class);
		}

		/**
		 * MfgActReg_Upd02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR createMfgActReg_Upd02_HdrR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR.create();
		}

		/**
		 * MfgActReg_Upd02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> createMfgActReg_Upd02_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR.class);
		}

		/**
		 * MfgActReg_Upd02_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR createMfgActReg_Upd02_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR.create();
		}

		/**
		 * MfgActReg_Upd02_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> createMfgActReg_Upd02_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR.class);
		}

		/**
		 * MfgActReg_Upd02_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR createMfgActReg_Upd02_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR.create();
		}

		/**
		 * MfgActReg_Upd02_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> createMfgActReg_Upd02_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR.class);
		}

		/**
		 * MfgActReg_Upd02_DtlLossブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR createMfgActReg_Upd02_DtlLossR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR.create();
		}

		/**
		 * MfgActReg_Upd02_DtlLossブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> createMfgActReg_Upd02_DtlLossL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR.class);
		}

		/**
		 * MfgActReg_Upd02_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR createMfgActReg_Upd02_DtlWkR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR.create();
		}

		/**
		 * MfgActReg_Upd02_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> createMfgActReg_Upd02_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR.class);
		}

		/**
		 * MfgActReg_Upd02_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR createMfgActReg_Upd02_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR.create();
		}

		/**
		 * MfgActReg_Upd02_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> createMfgActReg_Upd02_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR.class);
		}

		/**
		 * MfgActReg_Upd02_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR createMfgActReg_Upd02_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR.create();
		}

		/**
		 * MfgActReg_Upd02_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> createMfgActReg_Upd02_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>oper_unit_flg</td></tr>
		 * 	<tr><td><br></td><td>act_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>not_bkf_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>not_wk_cost_upd_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>not_io_act_srv_exec_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>not_commit_flg</td></tr>
		 * 	<tr><td><br></td><td>is_oper_act_cmpl_batch_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>st_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_act_qty</td></tr>
		 * 	<tr><td><br></td><td>rem_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_act_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oper_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oper_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>st_act_tm</td></tr>
		 * 	<tr><td><br></td><td>st_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>end_act_tm</td></tr>
		 * 	<tr><td><br></td><td>end_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>base_unit_st_act_qty</td></tr>
		 * 	<tr><td><br></td><td>rem_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>act_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>act_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_yield</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>not_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>if_auto_reg_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_yield_act_qty</td></tr>
		 * 	<tr><td><br></td><td>act_tm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>same_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>yield_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_rate</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>yield_act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>all_oper_act_reg_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>bkf_failure_cnt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR> down2() {
			return down2;
		}


		/**
		 * [MfgActReg_Upd02_DtlByProd]ブロックのコンテナaMfgActReg_Upd02_DtlByProdLを返します。
		 *
		 * @return MfgActReg_Upd02_DtlByProdL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> MfgActReg_Upd02_DtlByProd() {
			return aMfgActReg_Upd02_DtlByProd;
		}

		/**
		 * [MfgActReg_Upd02_DtlInpt]ブロックのコンテナaMfgActReg_Upd02_DtlInptLを返します。
		 *
		 * @return MfgActReg_Upd02_DtlInptL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> MfgActReg_Upd02_DtlInpt() {
			return aMfgActReg_Upd02_DtlInpt;
		}

		/**
		 * [MfgActReg_Upd02_DtlLoss]ブロックのコンテナaMfgActReg_Upd02_DtlLossLを返します。
		 *
		 * @return MfgActReg_Upd02_DtlLossL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> MfgActReg_Upd02_DtlLoss() {
			return aMfgActReg_Upd02_DtlLoss;
		}

		/**
		 * [MfgActReg_Upd02_DtlOper]ブロックのコンテナaMfgActReg_Upd02_DtlOperLを返します。
		 *
		 * @return MfgActReg_Upd02_DtlOperL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> MfgActReg_Upd02_DtlOper() {
			return aMfgActReg_Upd02_DtlOper;
		}

		/**
		 * [MfgActReg_Upd02_DtlWk]ブロックのコンテナaMfgActReg_Upd02_DtlWkLを返します。
		 *
		 * @return MfgActReg_Upd02_DtlWkL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> MfgActReg_Upd02_DtlWk() {
			return aMfgActReg_Upd02_DtlWk;
		}

		/**
		 * [MfgActReg_Upd02_DtlYield]ブロックのコンテナaMfgActReg_Upd02_DtlYieldLを返します。
		 *
		 * @return MfgActReg_Upd02_DtlYieldL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> MfgActReg_Upd02_DtlYield() {
			return aMfgActReg_Upd02_DtlYield;
		}

		/**
		 * [MfgActReg_Upd02_Hdr]ブロックのコンテナaMfgActReg_Upd02_HdrLを返します。
		 *
		 * @return MfgActReg_Upd02_HdrL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> MfgActReg_Upd02_Hdr() {
			return aMfgActReg_Upd02_Hdr;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this).info;
		}

		//-----------------------MAR1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAR1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAR1(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> dest0_2, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> dest0_3, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> dest0_4, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> dest0_5, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> dest0_6, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> src_MfgActReg_Upd02_Hdr, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> src_MfgActReg_Upd02_DtlOper, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> src_MfgActReg_Upd02_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> src_MfgActReg_Upd02_DtlLoss, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> src_MfgActReg_Upd02_DtlWk, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> src_MfgActReg_Upd02_DtlYield, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> src_MfgActReg_Upd02_DtlByProd){
			up_MAR1_marUpd01_0(dest0_0, src_MfgActReg_Upd02_Hdr);
			up_MAR1_marUpd01_1(dest0_1, src_MfgActReg_Upd02_DtlOper);
			up_MAR1_marUpd01_2(dest0_2, src_MfgActReg_Upd02_DtlInpt);
			up_MAR1_marUpd01_3(dest0_3, src_MfgActReg_Upd02_DtlLoss);
			up_MAR1_marUpd01_4(dest0_4, src_MfgActReg_Upd02_DtlWk);
			up_MAR1_marUpd01_5(dest0_5, src_MfgActReg_Upd02_DtlYield);
			up_MAR1_marUpd01_6(dest0_6, src_MfgActReg_Upd02_DtlByProd);
		}
		
		/**
		 * 連携処理MAR1_marUpd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAR1_marUpd01_0() {
			MCRowMapper map = new Map_up_MAR1_marUpd01_0();
			return map;
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAR1_marUpd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("inst_lot_no", "inst_lot_no");
				addColumnPathMap("inst_sublot_no", "inst_sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("st_act_tm", "st_act_tm");
				addColumnPathMap("st_ac_dt", "st_ac_dt");
				addColumnPathMap("end_act_tm", "end_act_tm");
				addColumnPathMap("end_ac_dt", "end_ac_dt");
				addColumnPathMap("itm_mfg_inst_qty", "itm_mfg_inst_qty");
				addColumnPathMap("base_unit_st_act_qty", "base_unit_st_act_qty");
				addColumnPathMap("rem_abort_flg", "rem_abort_flg");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("base_unit_yield_qty", "base_unit_yield_qty");
				addColumnPathMap("base_unit_dfct_qty", "base_unit_dfct_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("act_usr_cd", "act_usr_cd");
				addColumnPathMap("act_dpt_cd", "act_dpt_cd");
				addColumnPathMap("act_rpt_rmrks", "act_rpt_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("mfg_act_sub_char1", "mfg_act_sub_char1");
				addColumnPathMap("mfg_act_sub_char2", "mfg_act_sub_char2");
				addColumnPathMap("mfg_act_sub_char3", "mfg_act_sub_char3");
				addColumnPathMap("act_prnt_flg", "act_prnt_flg");
				addColumnPathMap("act_prnt_tm", "act_prnt_tm");
				addColumnPathMap("prnt_seq", "prnt_seq");
				addColumnPathMap("itm_yield", "itm_yield");
				addColumnPathMap("mfg_mtd_typ", "mfg_mtd_typ");
				addColumnPathMap("mfg_inst_unit_typ", "mfg_inst_unit_typ");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("mfg_str_ln_cd", "mfg_str_ln_cd");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("itm_ord_no", "itm_ord_no");
				addColumnPathMap("aprv_flg", "aprv_flg");
				addColumnPathMap("mfg_aprv_role_cd", "mfg_aprv_role_cd");
				addColumnPathMap("old_mfg_aprv_sts_typ", "old_mfg_aprv_sts_typ");
				addColumnPathMap("old_end_act_tm", "old_end_act_tm");
				addColumnPathMap("itm_mfg_inst_no", "itm_mfg_inst_no");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("lot_no_ptn_cd", "lot_no_ptn_cd");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("sublot_no_ptn_cd", "sublot_no_ptn_cd");
				addColumnPathMap("arr_purc_auto_reg_flg", "arr_purc_auto_reg_flg");
				addColumnPathMap("act_immed_prnt_flg", "act_immed_prnt_flg");
				addColumnPathMap("lst_reg_flg", "lst_reg_flg");
				addColumnPathMap("bkf_tgt_cnt", "bkf_tgt_cnt");
				addColumnPathMap("bkf_success_cnt", "bkf_success_cnt");
				addColumnPathMap("bkf_failure_cnt", "bkf_failure_cnt");
			}
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAR1_marUpd01_0(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR r_src) {
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAR1_marUpd01_0(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR> src) {
			MCRowMapper _rm = createMap_up_MAR1_marUpd01_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAR1_marUpd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MAR1_marUpd01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAR1_marUpd01_1() {
			MCRowMapper map = new Map_up_MAR1_marUpd01_1();
			return map;
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAR1_marUpd01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_unit_act_qty", "oper_unit_act_qty");
				addColumnPathMap("oper_std_qty", "oper_std_qty");
				addColumnPathMap("oper_conv_qty", "oper_conv_qty");
				addColumnPathMap("oper_unit_conv_rnd_typ", "oper_unit_conv_rnd_typ");
				addColumnPathMap("oper_unit_dec_place", "oper_unit_dec_place");
				addColumnPathMap("oper_unit_cd", "oper_unit_cd");
				addColumnPathMap("oper_yield", "oper_yield");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("oper_act_intr_rmrks", "oper_act_intr_rmrks");
				addColumnPathMap("oper_act_rpt_rmrks", "oper_act_rpt_rmrks");
				addColumnPathMap("oper_act_sub_char1", "oper_act_sub_char1");
				addColumnPathMap("oper_act_sub_char2", "oper_act_sub_char2");
				addColumnPathMap("oper_act_sub_char3", "oper_act_sub_char3");
				addColumnPathMap("bkf_flg", "bkf_flg");
				addColumnPathMap("bkf_upd_flg", "bkf_upd_flg");
				addColumnPathMap("wk_cost_calc_flg", "wk_cost_calc_flg");
				addColumnPathMap("wk_cost_upd_calc_flg", "wk_cost_upd_calc_flg");
				addColumnPathMap("oper_ord_no", "oper_ord_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("oper_act_no", "oper_act_no");
				addColumnPathMap("mes_id", "mes_id");
				addColumnPathMap("data_no", "data_no");
				addColumnPathMap("arr_act_no", "arr_act_no");
				addColumnPathMap("purc_act_io_no", "purc_act_io_no");
				addColumnPathMap("st_act_tm", "st_act_tm");
				addColumnPathMap("end_act_tm", "end_act_tm");
				addColumnPathMap("bkf_not_ref_flg", "bkf_not_ref_flg");
				addColumnPathMap("bkf_tgt_cnt", "bkf_tgt_cnt");
				addColumnPathMap("bkf_success_cnt", "bkf_success_cnt");
				addColumnPathMap("bkf_failure_cnt", "bkf_failure_cnt");
				addColumnPathMap("not_cmpl_flg", "not_cmpl_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_oper_act_no", "ext_oper_act_no");
				addColumnPathMap("if_auto_reg_flg", "if_auto_reg_flg");
			}
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAR1_marUpd01_1(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR r_src) {
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAR1_marUpd01_1(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR> src) {
			MCRowMapper _rm = createMap_up_MAR1_marUpd01_1();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAR1_marUpd01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MAR1_marUpd01の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAR1_marUpd01_2() {
			MCRowMapper map = new Map_up_MAR1_marUpd01_2();
			return map;
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAR1_marUpd01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_grp_seq", "alt_grp_seq");
				addColumnPathMap("alt_itm_fix_flg", "alt_itm_fix_flg");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("base_unit_inpt_qty", "base_unit_inpt_qty");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("cont_fctr_flg", "cont_fctr_flg");
				addColumnPathMap("cont_fctr_rnd_typ", "cont_fctr_rnd_typ");
				addColumnPathMap("cont_fctr_dec_place", "cont_fctr_dec_place");
				addColumnPathMap("act_cont_fctr", "act_cont_fctr");
				addColumnPathMap("std_cont_fctr", "std_cont_fctr");
				addColumnPathMap("cont_inpt_qty", "cont_inpt_qty");
				addColumnPathMap("cont_fctr_unit_cd", "cont_fctr_unit_cd");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("inpt_lot_no", "inpt_lot_no");
				addColumnPathMap("inpt_sublot_no", "inpt_sublot_no");
				addColumnPathMap("vld_dt", "vld_dt");
				addColumnPathMap("first_gr_dt", "first_gr_dt");
				addColumnPathMap("lot_seq", "lot_seq");
				addColumnPathMap("acxfr_act_qty", "acxfr_act_qty");
				addColumnPathMap("acxfr_act_rsn_cd", "acxfr_act_rsn_cd");
				addColumnPathMap("acxfr_act_bd_dpt_cd", "acxfr_act_bd_dpt_cd");
				addColumnPathMap("act_tm", "act_tm");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno1_null_flg", "sno1_null_flg");
				addColumnPathMap("inst_sno1", "inst_sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno2_null_flg", "sno2_null_flg");
				addColumnPathMap("inst_sno2", "inst_sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno3_null_flg", "sno3_null_flg");
				addColumnPathMap("inst_sno3", "inst_sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sno4_null_flg", "sno4_null_flg");
				addColumnPathMap("inst_sno4", "inst_sno4");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("inpt_rsn_cd", "inpt_rsn_cd");
				addColumnPathMap("inpt_loc_cd", "inpt_loc_cd");
				addColumnPathMap("inpt_str_ln_tgt_flg", "inpt_str_ln_tgt_flg");
				addColumnPathMap("inpt_str_ln_cd", "inpt_str_ln_cd");
				addColumnPathMap("inpt_loc_sppl_cd", "inpt_loc_sppl_cd");
				addColumnPathMap("stk_id_typ", "stk_id_typ");
				addColumnPathMap("stk_bp_cd", "stk_bp_cd");
				addColumnPathMap("stk_arrv_bp_cd", "stk_arrv_bp_cd");
				addColumnPathMap("inpt_act_intr_rmrks", "inpt_act_intr_rmrks");
				addColumnPathMap("inpt_act_rpt_rmrks", "inpt_act_rpt_rmrks");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("inpt_act_sub_char1", "inpt_act_sub_char1");
				addColumnPathMap("inpt_act_sub_char2", "inpt_act_sub_char2");
				addColumnPathMap("inpt_act_sub_char3", "inpt_act_sub_char3");
				addColumnPathMap("bkf_upd_flg", "bkf_upd_flg");
				addColumnPathMap("lot_mix_flg", "lot_mix_flg");
				addColumnPathMap("sublot_mix_flg", "sublot_mix_flg");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("prov_typ", "prov_typ");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("base_unit_alt_qty", "base_unit_alt_qty");
				addColumnPathMap("alloc_flg", "alloc_flg");
				addColumnPathMap("alloc_ctl_typ", "alloc_ctl_typ");
				addColumnPathMap("inpt_schd_no", "inpt_schd_no");
				addColumnPathMap("inpt_act_no", "inpt_act_no");
				addColumnPathMap("mes_id", "mes_id");
				addColumnPathMap("data_no", "data_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("slf_support_cur_cd", "slf_support_cur_cd");
				addColumnPathMap("slf_support_upri", "slf_support_upri");
				addColumnPathMap("slf_support_tax_cd", "slf_support_tax_cd");
				addColumnPathMap("slf_support_xrate_cd", "slf_support_xrate_cd");
				addColumnPathMap("slf_support_xrate", "slf_support_xrate");
				addColumnPathMap("vmi_interim_flg", "vmi_interim_flg");
				addColumnPathMap("vmi_upri", "vmi_upri");
				addColumnPathMap("base_unit_std_qty", "base_unit_std_qty");
				addColumnPathMap("add_flg", "add_flg");
				addColumnPathMap("old_ver_no", "old_ver_no");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_inpt_act_no", "ext_inpt_act_no");
				addColumnPathMap("if_auto_reg_flg", "if_auto_reg_flg");
				addColumnPathMap("is_only_abort_flg", "is_only_abort_flg");
			}
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAR1_marUpd01_2(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR r_src) {
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAR1_marUpd01_2(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR> src) {
			MCRowMapper _rm = createMap_up_MAR1_marUpd01_2();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAR1_marUpd01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MAR1_marUpd01の上りブロック3のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAR1_marUpd01_3() {
			MCRowMapper map = new Map_up_MAR1_marUpd01_3();
			return map;
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAR1_marUpd01_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("inpt_peg_no", "inpt_peg_no");
				addColumnPathMap("fxd_loss_flg", "fxd_loss_flg");
				addColumnPathMap("loss_act_no", "loss_act_no");
				addColumnPathMap("loss_rsn_cd", "loss_rsn_cd");
				addColumnPathMap("loss_qty", "loss_qty");
				addColumnPathMap("cont_loss_qty", "cont_loss_qty");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
			}
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAR1_marUpd01_3(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR r_src) {
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAR1_marUpd01_3(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR> src) {
			MCRowMapper _rm = createMap_up_MAR1_marUpd01_3();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlLossR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlLossR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAR1_marUpd01_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MAR1_marUpd01の上りブロック4のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAR1_marUpd01_4() {
			MCRowMapper map = new Map_up_MAR1_marUpd01_4();
			return map;
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAR1_marUpd01_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("act_wk_cost", "act_wk_cost");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("st_tm", "st_tm");
				addColumnPathMap("end_tm", "end_tm");
				addColumnPathMap("brk_pd", "brk_pd");
				addColumnPathMap("wk_day_cd", "wk_day_cd");
				addColumnPathMap("wk_rsn_cd", "wk_rsn_cd");
				addColumnPathMap("wk_usr_cd", "wk_usr_cd");
				addColumnPathMap("wk_usr_dpt_cd", "wk_usr_dpt_cd");
				addColumnPathMap("fclty", "fclty");
				addColumnPathMap("wk_cost_calc_flg", "wk_cost_calc_flg");
				addColumnPathMap("wk_cost_calc_upd_flg", "wk_cost_calc_upd_flg");
				addColumnPathMap("wk_act_intr_rmrks", "wk_act_intr_rmrks");
				addColumnPathMap("wk_act_sub_char1", "wk_act_sub_char1");
				addColumnPathMap("wk_act_sub_char2", "wk_act_sub_char2");
				addColumnPathMap("wk_act_sub_char3", "wk_act_sub_char3");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("wk_act_no", "wk_act_no");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_wk_act_no", "ext_wk_act_no");
			}
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAR1_marUpd01_4(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR r_src) {
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAR1_marUpd01_4(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR> src) {
			MCRowMapper _rm = createMap_up_MAR1_marUpd01_4();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAR1_marUpd01_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MAR1_marUpd01の上りブロック5のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAR1_marUpd01_5() {
			MCRowMapper map = new Map_up_MAR1_marUpd01_5();
			return map;
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック5のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAR1_marUpd01_5 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("yield_typ", "yield_typ");
				addColumnPathMap("trd_unit_yield_act_qty", "trd_unit_yield_act_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("base_unit_yield_act_qty", "base_unit_yield_act_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("act_tm", "act_tm");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("same_lot_flg", "same_lot_flg");
				addColumnPathMap("yield_rsn_cd", "yield_rsn_cd");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("yield_rate", "yield_rate");
				addColumnPathMap("insp_cnt_rmrks", "insp_cnt_rmrks");
				addColumnPathMap("yield_act_intr_rmrks", "yield_act_intr_rmrks");
				addColumnPathMap("yield_act_rpt_rmrks", "yield_act_rpt_rmrks");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("yield_act_sub_char1", "yield_act_sub_char1");
				addColumnPathMap("yield_act_sub_char2", "yield_act_sub_char2");
				addColumnPathMap("yield_act_sub_char3", "yield_act_sub_char3");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("yield_act_no", "yield_act_no");
				addColumnPathMap("stk_lst_prnt_flg", "stk_lst_prnt_flg");
				addColumnPathMap("mes_id", "mes_id");
				addColumnPathMap("data_no", "data_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("pack_flg", "pack_flg");
				addColumnPathMap("sublot_ctl_flg", "sublot_ctl_flg");
				addColumnPathMap("not_stk_flg", "not_stk_flg");
				addColumnPathMap("old_lot_no", "old_lot_no");
				addColumnPathMap("old_sublot_no", "old_sublot_no");
				addColumnPathMap("old_yield_typ", "old_yield_typ");
				addColumnPathMap("old_base_unit_yield_act_qty", "old_base_unit_yield_act_qty");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_yield_act_no", "ext_yield_act_no");
			}
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック5のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAR1_marUpd01_5(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック5のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAR1_marUpd01_5(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_up_MAR1_marUpd01_5();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAR1_marUpd01_5(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MAR1_marUpd01の上りブロック6のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAR1_marUpd01_6() {
			MCRowMapper map = new Map_up_MAR1_marUpd01_6();
			return map;
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック6のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAR1_marUpd01_6 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("data_crud_typ", "data_crud_typ");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("lot_no_typ", "lot_no_typ");
				addColumnPathMap("lot_no_ptn_cd", "lot_no_ptn_cd");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sublot_no_typ", "sublot_no_typ");
				addColumnPathMap("sublot_no_ptn_cd", "sublot_no_ptn_cd");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("trd_unit_yield_act_qty", "trd_unit_yield_act_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("base_unit_yield_act_qty", "base_unit_yield_act_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("act_tm", "act_tm");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("same_lot_flg", "same_lot_flg");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("yield_rsn_cd", "yield_rsn_cd");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("yield_rate", "yield_rate");
				addColumnPathMap("yield_act_intr_rmrks", "yield_act_intr_rmrks");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("yield_act_sub_char1", "yield_act_sub_char1");
				addColumnPathMap("yield_act_sub_char2", "yield_act_sub_char2");
				addColumnPathMap("yield_act_sub_char3", "yield_act_sub_char3");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("yield_act_no", "yield_act_no");
				addColumnPathMap("stk_lst_prnt_flg", "stk_lst_prnt_flg");
				addColumnPathMap("mes_id", "mes_id");
				addColumnPathMap("data_no", "data_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("pack_flg", "pack_flg");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("mes_flg", "mes_flg");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_yield_act_no", "ext_yield_act_no");
			}
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック6のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAR1_marUpd01_6(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MAR1_marUpd01の上りブロック6のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAR1_marUpd01_6(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_up_MAR1_marUpd01_6();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd01_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAR1_marUpd01_6(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAR2専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAR2の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAR2(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_CtrlR dest0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R> dest0_1, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R> dest0_2, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR> dest0_3, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_CtrlR src_MfgActReg_Upd02_Ctrl, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> src_MfgActReg_Upd02_Hdr1, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> src_MfgActReg_Upd02_Hdr2, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR> src_MfgActReg_Upd02_DtlYieldByProd){
			up_MAR2_marChk03_0(dest0_0, src_MfgActReg_Upd02_Ctrl);
			up_MAR2_marChk03_1(dest0_1, src_MfgActReg_Upd02_Hdr1);
			up_MAR2_marChk03_2(dest0_2, src_MfgActReg_Upd02_Hdr2);
			up_MAR2_marChk03_3(dest0_3, src_MfgActReg_Upd02_DtlYieldByProd);
		}
		
		/**
		 * 連携処理MAR2_marChk03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAR2_marChk03_0() {
			MCRowMapper map = new Map_up_MAR2_marChk03_0();
			return map;
		}

		/**
		 * 連携処理MAR2_marChk03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAR2_marChk03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("oper_unit_flg", "oper_unit_flg");
				addColumnPathMap("is_src_batch_flg", "is_src_batch_flg");
				addColumnPathMap("upd_cntr_chk_flg", "upd_cntr_chk_flg");
			}
		}

		/**
		 * 連携処理MAR2_marChk03の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_MAR2_marChk03_0(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_CtrlR dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_CtrlR src) {
			createMap_up_MAR2_marChk03_0().copy(dest, src);
		}
		
		/**
		 * 連携処理MAR2_marChk03の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAR2_marChk03_1() {
			MCRowMapper map = new Map_up_MAR2_marChk03_1();
			return map;
		}

		/**
		 * 連携処理MAR2_marChk03の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAR2_marChk03_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("st_act_tm", "st_act_tm");
				addColumnPathMap("st_ac_dt", "st_ac_dt");
				addColumnPathMap("end_act_tm", "end_act_tm");
				addColumnPathMap("end_ac_dt", "end_ac_dt");
				addColumnPathMap("base_unit_st_act_qty", "base_unit_st_act_qty");
				addColumnPathMap("oper_unit_act_qty", "oper_unit_act_qty");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("mfg_act_upd_cntr", "mfg_act_upd_cntr");
			}
		}

		/**
		 * 連携処理MAR2_marChk03の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAR2_marChk03_1(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R r_src) {
		}

		/**
		 * 連携処理MAR2_marChk03の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAR2_marChk03_1(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> src) {
			MCRowMapper _rm = createMap_up_MAR2_marChk03_1();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAR2_marChk03_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MAR2_marChk03の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAR2_marChk03_2() {
			MCRowMapper map = new Map_up_MAR2_marChk03_2();
			return map;
		}

		/**
		 * 連携処理MAR2_marChk03の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAR2_marChk03_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("st_act_tm", "st_act_tm");
				addColumnPathMap("st_ac_dt", "st_ac_dt");
				addColumnPathMap("end_act_tm", "end_act_tm");
				addColumnPathMap("end_ac_dt", "end_ac_dt");
				addColumnPathMap("base_unit_st_act_qty", "base_unit_st_act_qty");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr");
				addColumnPathMap("mfg_act_upd_cntr", "mfg_act_upd_cntr");
			}
		}

		/**
		 * 連携処理MAR2_marChk03の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAR2_marChk03_2(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R r_src) {
		}

		/**
		 * 連携処理MAR2_marChk03の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAR2_marChk03_2(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R> src) {
			MCRowMapper _rm = createMap_up_MAR2_marChk03_2();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_Hdr1R r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_Hdr2R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAR2_marChk03_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MAR2_marChk03の上りブロック3のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAR2_marChk03_3() {
			MCRowMapper map = new Map_up_MAR2_marChk03_3();
			return map;
		}

		/**
		 * 連携処理MAR2_marChk03の上りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAR2_marChk03_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("yield_typ", "yield_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_yield_act_qty", "trd_unit_yield_act_qty");
				addColumnPathMap("act_tm", "act_tm");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
			}
		}

		/**
		 * 連携処理MAR2_marChk03の上りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAR2_marChk03_3(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR r_src) {
		}

		/**
		 * 連携処理MAR2_marChk03の上りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAR2_marChk03_3(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR> src) {
			MCRowMapper _rm = createMap_up_MAR2_marChk03_3();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd02_DtlYieldByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk03_DtlYieldByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAR2_marChk03_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MAR1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAR1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAR1(){
		}
		//-----------------------MAR2専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAR2の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAR2(){
		}
	}
	/**
	 * MfgActReg_Upd03オペレーション.<p>
	 *
	 * 工数実績の登録・訂正処理<br>
	 */
	abstract public class MfgActReg_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActReg_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd03_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> down0;
		
		
		// コンストラクタ
		protected MfgActReg_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.class);
			up1 = mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd03_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgActReg_Upd03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR createMfgActReg_Upd03_RsltR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.create();
		}

		/**
		 * MfgActReg_Upd03_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> createMfgActReg_Upd03_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.class);
		}

		/**
		 * MfgActReg_Upd03_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd03_CtrlR createMfgActReg_Upd03_CtrlR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd03_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_wk_act_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>old_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>brk_pd</td></tr>
		 * 	<tr><td><br></td><td>act_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_dec_place</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wk_day_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_day_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_usr_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>fclty</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>act_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>act_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>act_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>act_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>dpt_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>wk_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mes_flg</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_wk_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>not_commit_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd03_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd03_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>act_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgActReg_Upd04オペレーション.<p>
	 *
	 * 製造実績受信ＩＦで自動作成された工程実績に紐付くすべての実績が完了になった場合、工程実績を完了にする。<br>
	 */
	abstract public class MfgActReg_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActReg_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR> down0;
		
		
		// コンストラクタ
		protected MfgActReg_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgActReg_Upd04_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_CtrlR createMfgActReg_Upd04_CtrlR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_CtrlR.create();
		}

		/**
		 * MfgActReg_Upd04_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR createMfgActReg_Upd04_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR.create();
		}

		/**
		 * MfgActReg_Upd04_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR> createMfgActReg_Upd04_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>not_commit_flg</td></tr>
		 * 	<tr><td><br></td><td>not_wk_cost_upd_calc_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Upd04_DtlOperR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgActReg_Del01オペレーション.<p>
	 *
	 * 製造実績の取消の共通処理<br>
	 */
	abstract public class MfgActReg_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActReg_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR> up4;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR> down0;
		
		/**
		 * 連携情報 MA<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Chk02 （{@link #maChk02}）<br>
		 */
		public final String MA = "MA";

		/**
		 * 連携オペレーション maChk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Chk02}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_CtrlR （{@link #maChk02_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR&gt; （{@link #maChk02_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR&gt; （{@link #maChk02_up2}）<br>
		 * 第4 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR&gt; （{@link #maChk02_up3}）<br>
		 * 第5 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR&gt; （{@link #maChk02_up4}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR&gt; （{@link #maChk02_down0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.MfgActReg_Chk02 maChk02;
		// 連携ロジック上り
		public final mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_CtrlR maChk02_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR> maChk02_up1;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR> maChk02_up2;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR> maChk02_up3;
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR> maChk02_up4;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR> maChk02_down0;
		
		// コンストラクタ
		protected MfgActReg_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR.class);
			up4 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR.class);

			// 連携オペレーションの初期化
			maChk02 = mcframe.serverMSBC.MSBCL6050.MSBCL_MfgActRegService.crtMfgActReg_Chk02();
			
			// 連携オペレーションのコンテナ取得
			maChk02_up0 = (mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_CtrlR)maChk02.up(4);
			maChk02_up1 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR>)maChk02.up(0);
			maChk02_up2 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR>)maChk02.up(1);
			maChk02_up3 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR>)maChk02.up(2);
			maChk02_up4 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR>)maChk02.up(3);
			maChk02_down0 = (MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR>)maChk02.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(MA, maChk02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MA<br>
		 * up0() => mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_CtrlR （{@link #maChk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR&gt; （{@link #maChk02_up1}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR&gt; （{@link #maChk02_up2}）<br>
		 * up3() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR&gt; （{@link #maChk02_up3}）<br>
		 * up4() => MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR&gt; （{@link #maChk02_up4}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MA)) {
				up_MA(maChk02_up0, maChk02_up1, maChk02_up2, maChk02_up3, maChk02_up4, up0(), up1(), up2(), up3(), up4());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MA<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR&gt;（{@link #maChk02_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MA)) {
				down_MA(down0(), maChk02_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			if (i == 4) return up4();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgActReg_Del01_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_CtrlR createMfgActReg_Del01_CtrlR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_CtrlR.create();
		}

		/**
		 * MfgActReg_Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR createMfgActReg_Del01_HdrR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR.create();
		}

		/**
		 * MfgActReg_Del01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR> createMfgActReg_Del01_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR.class);
		}

		/**
		 * MfgActReg_Del01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR createMfgActReg_Del01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR.create();
		}

		/**
		 * MfgActReg_Del01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR> createMfgActReg_Del01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR.class);
		}

		/**
		 * MfgActReg_Del01_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR createMfgActReg_Del01_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR.create();
		}

		/**
		 * MfgActReg_Del01_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR> createMfgActReg_Del01_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR.class);
		}

		/**
		 * MfgActReg_Del01_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR createMfgActReg_Del01_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR.create();
		}

		/**
		 * MfgActReg_Del01_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR> createMfgActReg_Del01_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lst_del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr_chk_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>not_commit_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>yield_act_no</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR> up4() {
			return up4;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this).info;
		}

		//-----------------------MA専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MA(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_CtrlR dest0_0, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR> dest0_2, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR> dest0_3, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR> dest0_4, mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_CtrlR src_MfgActReg_Del01_Ctrl, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR> src_MfgActReg_Del01_Hdr, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR> src_MfgActReg_Del01_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR> src_MfgActReg_Del01_DtlYield, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR> src_MfgActReg_Del01_DtlByProd){
			up_MA_maChk02_0(dest0_0, src_MfgActReg_Del01_Ctrl);
			up_MA_maChk02_1(dest0_1, src_MfgActReg_Del01_Hdr);
			up_MA_maChk02_2(dest0_2, src_MfgActReg_Del01_DtlInpt);
			up_MA_maChk02_3(dest0_3, src_MfgActReg_Del01_DtlYield);
			up_MA_maChk02_4(dest0_4, src_MfgActReg_Del01_DtlByProd);
		}
		
		/**
		 * 連携処理MA_maChk02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MA_maChk02_0() {
			MCRowMapper map = new Map_up_MA_maChk02_0();
			return map;
		}

		/**
		 * 連携処理MA_maChk02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MA_maChk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("lst_del_flg", "lst_del_flg");
				addColumnPathMap("upd_cntr_chk_flg", "upd_cntr_chk_flg");
				addColumnPathMap("is_src_batch_flg", "is_src_batch_flg");
			}
		}

		/**
		 * 連携処理MA_maChk02の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_MA_maChk02_0(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_CtrlR dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_CtrlR src) {
			createMap_up_MA_maChk02_0().copy(dest, src);
		}
		
		/**
		 * 連携処理MA_maChk02の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MA_maChk02_1() {
			MCRowMapper map = new Map_up_MA_maChk02_1();
			return map;
		}

		/**
		 * 連携処理MA_maChk02の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MA_maChk02_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("mfg_act_no", "mfg_act_no");
				addColumnPathMap("mfg_inst_upd_cntr", "mfg_inst_upd_cntr");
				addColumnPathMap("mfg_inst_pr_upd_cntr", "mfg_inst_pr_upd_cntr");
				addColumnPathMap("mfg_act_upd_cntr", "mfg_act_upd_cntr");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("div_seq", "div_seq");
				addColumnPathMap("upd_cntr_chk_flg", "upd_cntr_chk_flg");
				addColumnPathMap("is_src_batch_flg", "is_src_batch_flg");
			}
		}

		/**
		 * 連携処理MA_maChk02の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MA_maChk02_1(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR r_src) {
		}

		/**
		 * 連携処理MA_maChk02の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MA_maChk02_1(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR> src) {
			MCRowMapper _rm = createMap_up_MA_maChk02_1();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MA_maChk02_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MA_maChk02の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MA_maChk02_2() {
			MCRowMapper map = new Map_up_MA_maChk02_2();
			return map;
		}

		/**
		 * 連携処理MA_maChk02の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_MA_maChk02_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("inpt_act_no", "inpt_act_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
			}
		}

		/**
		 * 連携処理MA_maChk02の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MA_maChk02_2(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR r_src) {
		}

		/**
		 * 連携処理MA_maChk02の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MA_maChk02_2(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR> src) {
			MCRowMapper _rm = createMap_up_MA_maChk02_2();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MA_maChk02_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MA_maChk02の上りブロック3のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MA_maChk02_3() {
			MCRowMapper map = new Map_up_MA_maChk02_3();
			return map;
		}

		/**
		 * 連携処理MA_maChk02の上りブロック3のためのRowMapperクラス。<p>
		 */
		public class Map_up_MA_maChk02_3 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("yield_act_no", "yield_act_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
			}
		}

		/**
		 * 連携処理MA_maChk02の上りブロック3のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MA_maChk02_3(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR r_src) {
		}

		/**
		 * 連携処理MA_maChk02の上りブロック3のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MA_maChk02_3(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR> src) {
			MCRowMapper _rm = createMap_up_MA_maChk02_3();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MA_maChk02_3(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理MA_maChk02の上りブロック4のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MA_maChk02_4() {
			MCRowMapper map = new Map_up_MA_maChk02_4();
			return map;
		}

		/**
		 * 連携処理MA_maChk02の上りブロック4のためのRowMapperクラス。<p>
		 */
		public class Map_up_MA_maChk02_4 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("yield_act_no", "yield_act_no");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
			}
		}

		/**
		 * 連携処理MA_maChk02の上りブロック4のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MA_maChk02_4(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理MA_maChk02の上りブロック4のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MA_maChk02_4(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_up_MA_maChk02_4();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MA_maChk02_4(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MA専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MA(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR> dest_MfgActReg_Del01_Hdr, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR> src0_0){
			down_MA_maChk02_0(dest_MfgActReg_Del01_Hdr, src0_0);
		}

		/**
		 * 連携処理MA_maChk02の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MA_maChk02_0() {
			MCRowMapper map = new Map_down_MA_maChk02_0();
			return map;
		}

		/**
		 * 連携処理MA_maChk02の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MA_maChk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("rtn_sts_typ", "rtn_sts_typ");
			}
		}

		/**
		 * 連携処理MA_maChk02の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MA_maChk02_0(mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR r_dest, mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR r_src) {
		}

		/**
		 * 連携処理MA_maChk02の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MA_maChk02_0(MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR> src) {
			MCRowMapper _rm = createMap_down_MA_maChk02_0();
			for(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk02_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6050.MfgActReg_Del01_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MA_maChk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * MfgActReg_Del02オペレーション.<p>
	 *
	 * 工数実績の取消処理<br>
	 */
	abstract public class MfgActReg_Del02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgActReg_Del02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL6050.MfgActReg_Del02_CtrlR up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> down0;
		
		
		// コンストラクタ
		protected MfgActReg_Del02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.class);
			up1 = mcframe.serverMSBC.MSBCL6050.MfgActReg_Del02_CtrlR.create();
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgActReg_Del02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR createMfgActReg_Del02_RsltR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.create();
		}

		/**
		 * MfgActReg_Del02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> createMfgActReg_Del02_RsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR.class);
		}

		/**
		 * MfgActReg_Del02_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Del02_CtrlR createMfgActReg_Del02_CtrlR(){
			return mcframe.serverMSBC.MSBCL6050.MfgActReg_Del02_CtrlR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_wk_act_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>div_seq</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>old_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>oper_act_no</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>wk_act_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>not_commit_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL6050.MfgActReg_Del02_CtrlR
		 */
		public mcframe.serverMSBC.MSBCL6050.MfgActReg_Del02_CtrlR up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_act_no</td></tr>
		 * 	<tr><td><br></td><td>rtn_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6050.MfgActReg_Chk04_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgActRegService)MSBCL_MfgActRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}