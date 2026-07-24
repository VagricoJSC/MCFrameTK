package mcframe.serverMSBC.MSBCL6010;

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
 * "MSBCL_MfgInstTblRegService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_MfgInstTblRegService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBCL6010";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd01 aMfgInstTblReg_Upd01;

	protected void initMfgInstTblReg_Upd01() {
		this.info = PDef.MS_MSBCL6010_MfgInstTblReg_Upd01_INFO;
		this.aMfgInstTblReg_Upd01 = ((MSBCL_MfgInstTblRegService)this).new MfgInstTblReg_Upd01();
	}

	public static MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd01 crtMfgInstTblReg_Upd01() {
		MSBCL_MfgInstTblRegService lgc = new MSBCL_MfgInstTblRegService();
		lgc.initMfgInstTblReg_Upd01();
		return lgc.aMfgInstTblReg_Upd01;
	}

	protected void paramMfgInstTblReg_Upd01(MCParam p) {
		if (this.aMfgInstTblReg_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstTblReg_Upd01.up0());
	}

	protected void doMfgInstTblReg_Upd01() {
		aMfgInstTblReg_Upd01.call();
	};

	/**
	 * MfgInstTblReg_Upd01_DtlMfgブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR createMfgInstTblReg_Upd01_DtlMfgR(){
		return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR.create();
	}

	/**
	 * MfgInstTblReg_Upd01_DtlMfgブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR> createMfgInstTblReg_Upd01_DtlMfgL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR.class);
	}
	protected MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd02 aMfgInstTblReg_Upd02;

	protected void initMfgInstTblReg_Upd02() {
		this.info = PDef.MS_MSBCL6010_MfgInstTblReg_Upd02_INFO;
		this.aMfgInstTblReg_Upd02 = ((MSBCL_MfgInstTblRegService)this).new MfgInstTblReg_Upd02();
	}

	public static MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd02 crtMfgInstTblReg_Upd02() {
		MSBCL_MfgInstTblRegService lgc = new MSBCL_MfgInstTblRegService();
		lgc.initMfgInstTblReg_Upd02();
		return lgc.aMfgInstTblReg_Upd02;
	}

	protected void paramMfgInstTblReg_Upd02(MCParam p) {
		if (this.aMfgInstTblReg_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstTblReg_Upd02.up0());
	}

	protected void doMfgInstTblReg_Upd02() {
		aMfgInstTblReg_Upd02.call();
	};

	/**
	 * MfgInstTblReg_Upd02_DtlItmMfgブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR createMfgInstTblReg_Upd02_DtlItmMfgR(){
		return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR.create();
	}

	/**
	 * MfgInstTblReg_Upd02_DtlItmMfgブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR> createMfgInstTblReg_Upd02_DtlItmMfgL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR.class);
	}
	protected MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd03 aMfgInstTblReg_Upd03;

	protected void initMfgInstTblReg_Upd03() {
		this.info = PDef.MS_MSBCL6010_MfgInstTblReg_Upd03_INFO;
		this.aMfgInstTblReg_Upd03 = ((MSBCL_MfgInstTblRegService)this).new MfgInstTblReg_Upd03();
	}

	public static MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd03 crtMfgInstTblReg_Upd03() {
		MSBCL_MfgInstTblRegService lgc = new MSBCL_MfgInstTblRegService();
		lgc.initMfgInstTblReg_Upd03();
		return lgc.aMfgInstTblReg_Upd03;
	}

	protected void paramMfgInstTblReg_Upd03(MCParam p) {
		if (this.aMfgInstTblReg_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstTblReg_Upd03.up0());
	}

	protected void doMfgInstTblReg_Upd03() {
		aMfgInstTblReg_Upd03.call();
	};

	/**
	 * MfgInstTblReg_Upd03_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR createMfgInstTblReg_Upd03_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR.create();
	}

	/**
	 * MfgInstTblReg_Upd03_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR> createMfgInstTblReg_Upd03_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR.class);
	}
	protected MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd04 aMfgInstTblReg_Upd04;

	protected void initMfgInstTblReg_Upd04() {
		this.info = PDef.MS_MSBCL6010_MfgInstTblReg_Upd04_INFO;
		this.aMfgInstTblReg_Upd04 = ((MSBCL_MfgInstTblRegService)this).new MfgInstTblReg_Upd04();
	}

	public static MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd04 crtMfgInstTblReg_Upd04() {
		MSBCL_MfgInstTblRegService lgc = new MSBCL_MfgInstTblRegService();
		lgc.initMfgInstTblReg_Upd04();
		return lgc.aMfgInstTblReg_Upd04;
	}

	protected void paramMfgInstTblReg_Upd04(MCParam p) {
		if (this.aMfgInstTblReg_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstTblReg_Upd04.up0());
		p.addDownBlock(aMfgInstTblReg_Upd04.down0());
	}

	protected void doMfgInstTblReg_Upd04() {
		aMfgInstTblReg_Upd04.call();
	};

	/**
	 * MfgInstTblReg_Upd04_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR createMfgInstTblReg_Upd04_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR.create();
	}

	/**
	 * MfgInstTblReg_Upd04_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR> createMfgInstTblReg_Upd04_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR.class);
	}
	protected MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd05 aMfgInstTblReg_Upd05;

	protected void initMfgInstTblReg_Upd05() {
		this.info = PDef.MS_MSBCL6010_MfgInstTblReg_Upd05_INFO;
		this.aMfgInstTblReg_Upd05 = ((MSBCL_MfgInstTblRegService)this).new MfgInstTblReg_Upd05();
	}

	public static MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd05 crtMfgInstTblReg_Upd05() {
		MSBCL_MfgInstTblRegService lgc = new MSBCL_MfgInstTblRegService();
		lgc.initMfgInstTblReg_Upd05();
		return lgc.aMfgInstTblReg_Upd05;
	}

	protected void paramMfgInstTblReg_Upd05(MCParam p) {
		if (this.aMfgInstTblReg_Upd05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstTblReg_Upd05.up0());
		p.addDownBlock(aMfgInstTblReg_Upd05.down0());
		p.addDownBlock(aMfgInstTblReg_Upd05.down1());
	}

	protected void doMfgInstTblReg_Upd05() {
		aMfgInstTblReg_Upd05.call();
	};

	/**
	 * MfgInstTblReg_Upd05_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR createMfgInstTblReg_Upd05_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR.create();
	}

	/**
	 * MfgInstTblReg_Upd05_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR> createMfgInstTblReg_Upd05_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR.class);
	}

	/**
	 * MfgInstTblReg_Upd05_DtlInptAllocStsブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptAllocStsR createMfgInstTblReg_Upd05_DtlInptAllocStsR(){
		return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptAllocStsR.create();
	}

	/**
	 * MfgInstTblReg_Upd05_DtlInptAllocStsブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptAllocStsR> createMfgInstTblReg_Upd05_DtlInptAllocStsL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptAllocStsR.class);
	}

	/**
	 * MfgInstTblReg_Upd05_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_HdrR createMfgInstTblReg_Upd05_HdrR(){
		return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_HdrR.create();
	}

	/**
	 * MfgInstTblReg_Upd05_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_HdrR> createMfgInstTblReg_Upd05_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_HdrR.class);
	}
	protected MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd06 aMfgInstTblReg_Upd06;

	protected void initMfgInstTblReg_Upd06() {
		this.info = PDef.MS_MSBCL6010_MfgInstTblReg_Upd06_INFO;
		this.aMfgInstTblReg_Upd06 = ((MSBCL_MfgInstTblRegService)this).new MfgInstTblReg_Upd06();
	}

	public static MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd06 crtMfgInstTblReg_Upd06() {
		MSBCL_MfgInstTblRegService lgc = new MSBCL_MfgInstTblRegService();
		lgc.initMfgInstTblReg_Upd06();
		return lgc.aMfgInstTblReg_Upd06;
	}

	protected void paramMfgInstTblReg_Upd06(MCParam p) {
		if (this.aMfgInstTblReg_Upd06 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstTblReg_Upd06.up0());
		p.addDownBlock(aMfgInstTblReg_Upd06.down0());
	}

	protected void doMfgInstTblReg_Upd06() {
		aMfgInstTblReg_Upd06.call();
	};

	/**
	 * MfgInstTblReg_Upd06_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR createMfgInstTblReg_Upd06_DtlWkR(){
		return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR.create();
	}

	/**
	 * MfgInstTblReg_Upd06_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR> createMfgInstTblReg_Upd06_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR.class);
	}
	protected MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd07 aMfgInstTblReg_Upd07;

	protected void initMfgInstTblReg_Upd07() {
		this.info = PDef.MS_MSBCL6010_MfgInstTblReg_Upd07_INFO;
		this.aMfgInstTblReg_Upd07 = ((MSBCL_MfgInstTblRegService)this).new MfgInstTblReg_Upd07();
	}

	public static MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd07 crtMfgInstTblReg_Upd07() {
		MSBCL_MfgInstTblRegService lgc = new MSBCL_MfgInstTblRegService();
		lgc.initMfgInstTblReg_Upd07();
		return lgc.aMfgInstTblReg_Upd07;
	}

	protected void paramMfgInstTblReg_Upd07(MCParam p) {
		if (this.aMfgInstTblReg_Upd07 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstTblReg_Upd07.up0());
		p.addDownBlock(aMfgInstTblReg_Upd07.down0());
	}

	protected void doMfgInstTblReg_Upd07() {
		aMfgInstTblReg_Upd07.call();
	};

	/**
	 * MfgInstTblReg_Upd07_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR createMfgInstTblReg_Upd07_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR.create();
	}

	/**
	 * MfgInstTblReg_Upd07_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR> createMfgInstTblReg_Upd07_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR.class);
	}
	protected MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd08 aMfgInstTblReg_Upd08;

	protected void initMfgInstTblReg_Upd08() {
		this.info = PDef.MS_MSBCL6010_MfgInstTblReg_Upd08_INFO;
		this.aMfgInstTblReg_Upd08 = ((MSBCL_MfgInstTblRegService)this).new MfgInstTblReg_Upd08();
	}

	public static MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd08 crtMfgInstTblReg_Upd08() {
		MSBCL_MfgInstTblRegService lgc = new MSBCL_MfgInstTblRegService();
		lgc.initMfgInstTblReg_Upd08();
		return lgc.aMfgInstTblReg_Upd08;
	}

	protected void paramMfgInstTblReg_Upd08(MCParam p) {
		if (this.aMfgInstTblReg_Upd08 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstTblReg_Upd08.up0());
		p.addUpBlock(aMfgInstTblReg_Upd08.up1());
		p.addDownBlock(aMfgInstTblReg_Upd08.down0());
	}

	protected void doMfgInstTblReg_Upd08() {
		aMfgInstTblReg_Upd08.call();
	};

	/**
	 * MfgInstTblReg_Upd08_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl1R createMfgInstTblReg_Upd08_Dtl1R(){
		return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl1R.create();
	}

	/**
	 * MfgInstTblReg_Upd08_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl1R> createMfgInstTblReg_Upd08_Dtl1L(){
		return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl1R.class);
	}

	/**
	 * MfgInstTblReg_Upd08_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl2R createMfgInstTblReg_Upd08_Dtl2R(){
		return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl2R.create();
	}

	/**
	 * MfgInstTblReg_Upd08_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl2R> createMfgInstTblReg_Upd08_Dtl2L(){
		return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl2R.class);
	}
	protected MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd09 aMfgInstTblReg_Upd09;

	protected void initMfgInstTblReg_Upd09() {
		this.info = PDef.MS_MSBCL6010_MfgInstTblReg_Upd09_INFO;
		this.aMfgInstTblReg_Upd09 = ((MSBCL_MfgInstTblRegService)this).new MfgInstTblReg_Upd09();
	}

	public static MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd09 crtMfgInstTblReg_Upd09() {
		MSBCL_MfgInstTblRegService lgc = new MSBCL_MfgInstTblRegService();
		lgc.initMfgInstTblReg_Upd09();
		return lgc.aMfgInstTblReg_Upd09;
	}

	protected void paramMfgInstTblReg_Upd09(MCParam p) {
		if (this.aMfgInstTblReg_Upd09 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstTblReg_Upd09.up0());
	}

	protected void doMfgInstTblReg_Upd09() {
		aMfgInstTblReg_Upd09.call();
	};

	/**
	 * MfgInstTblReg_Upd09_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd09_DtlInptR createMfgInstTblReg_Upd09_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd09_DtlInptR.create();
	}

	/**
	 * MfgInstTblReg_Upd09_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd09_DtlInptR> createMfgInstTblReg_Upd09_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd09_DtlInptR.class);
	}
	protected MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd10 aMfgInstTblReg_Upd10;

	protected void initMfgInstTblReg_Upd10() {
		this.info = PDef.MS_MSBCL6010_MfgInstTblReg_Upd10_INFO;
		this.aMfgInstTblReg_Upd10 = ((MSBCL_MfgInstTblRegService)this).new MfgInstTblReg_Upd10();
	}

	public static MSBCL_MfgInstTblRegService.MfgInstTblReg_Upd10 crtMfgInstTblReg_Upd10() {
		MSBCL_MfgInstTblRegService lgc = new MSBCL_MfgInstTblRegService();
		lgc.initMfgInstTblReg_Upd10();
		return lgc.aMfgInstTblReg_Upd10;
	}

	protected void paramMfgInstTblReg_Upd10(MCParam p) {
		if (this.aMfgInstTblReg_Upd10 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMfgInstTblReg_Upd10.up0());
	}

	protected void doMfgInstTblReg_Upd10() {
		aMfgInstTblReg_Upd10.call();
	};

	/**
	 * MfgInstTblReg_Upd10_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd10_DtlYieldR createMfgInstTblReg_Upd10_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd10_DtlYieldR.create();
	}

	/**
	 * MfgInstTblReg_Upd10_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd10_DtlYieldR> createMfgInstTblReg_Upd10_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd10_DtlYieldR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * MfgInstTblReg_Upd01オペレーション.<p>
	 *
	 * 製造指図の追加・更新・削除を行う<br>
	 */
	abstract public class MfgInstTblReg_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstTblReg_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR> up0;
		
		
		// コンストラクタ
		protected MfgInstTblReg_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MfgInstTblReg_Upd01_DtlMfgブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR createMfgInstTblReg_Upd01_DtlMfgR(){
			return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR.create();
		}

		/**
		 * MfgInstTblReg_Upd01_DtlMfgブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR> createMfgInstTblReg_Upd01_DtlMfgL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR.class);
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
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * 	<tr><td><br></td><td>rem_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rem_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rem_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.mfg_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.po_d_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.base_unit_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.rqst_dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.inst_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.inst_prnt_tm</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.aprv_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.aprv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.aprv_tm</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.aprv_rsn</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.mfg_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.disp_pd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.schd_chg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.po_locked_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.po_auto_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.inst_po_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd01_DtlMfgR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstTblReg_Upd02オペレーション.<p>
	 *
	 * 品目製造指図の追加・更新・削除を行う<br>
	 */
	abstract public class MfgInstTblReg_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstTblReg_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR> up0;
		
		
		// コンストラクタ
		protected MfgInstTblReg_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MfgInstTblReg_Upd02_DtlItmMfgブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR createMfgInstTblReg_Upd02_DtlItmMfgR(){
			return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR.create();
		}

		/**
		 * MfgInstTblReg_Upd02_DtlItmMfgブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR> createMfgInstTblReg_Upd02_DtlItmMfgL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR.class);
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
		 * 	<tr><td><br></td><td>inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.frst_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.base_unit_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.master_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.lot_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.sno1</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.sno2</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.sno3</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.sno4</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.unschd_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.unschd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.mfg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.site_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.itm_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.itm_std_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.itm_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd02_DtlItmMfgR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstTblReg_Upd03オペレーション.<p>
	 *
	 * 工程指図の追加・更新・削除を行う<br>
	 */
	abstract public class MfgInstTblReg_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstTblReg_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR> up0;
		
		
		// コンストラクタ
		protected MfgInstTblReg_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MfgInstTblReg_Upd03_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR createMfgInstTblReg_Upd03_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR.create();
		}

		/**
		 * MfgInstTblReg_Upd03_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR> createMfgInstTblReg_Upd03_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>not_header_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>rem_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rem_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rem_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.unschd_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.unschd_act_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.bkf_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_inst_grp</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.usr_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.lmt_fr_dt_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_offst_add_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_std_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.wip_rate</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.yield_oper_ratio</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.mes_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.oper_rsrc</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>oper_inst.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd03_DtlOperR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstTblReg_Upd04オペレーション.<p>
	 *
	 * 出来高予定の追加・更新・削除を行う<br>
	 */
	abstract public class MfgInstTblReg_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstTblReg_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR> down0;
		
		
		// コンストラクタ
		protected MfgInstTblReg_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgInstTblReg_Upd04_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR createMfgInstTblReg_Upd04_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR.create();
		}

		/**
		 * MfgInstTblReg_Upd04_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR> createMfgInstTblReg_Upd04_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * 	<tr><td><br></td><td>not_header_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>rem_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rem_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rem_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.schd_tm</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.trd_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.lot_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.sno1</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.sno2</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.sno3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.sno4</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.yield_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd04_DtlYieldR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstTblReg_Upd05オペレーション.<p>
	 *
	 * 投入予定・投入引当状況の追加・更新・削除を行う<br>
	 */
	abstract public class MfgInstTblReg_Upd05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstTblReg_Upd05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_HdrR> down1;
		/** [MfgInstTblReg_Upd05_DtlInptAllocSts]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptAllocStsR> aMfgInstTblReg_Upd05_DtlInptAllocSts;
		
		
		// コンストラクタ
		protected MfgInstTblReg_Upd05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_HdrR.class);
			aMfgInstTblReg_Upd05_DtlInptAllocSts = MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptAllocStsR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * MfgInstTblReg_Upd05_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR createMfgInstTblReg_Upd05_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR.create();
		}

		/**
		 * MfgInstTblReg_Upd05_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR> createMfgInstTblReg_Upd05_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR.class);
		}

		/**
		 * MfgInstTblReg_Upd05_DtlInptAllocStsブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptAllocStsR createMfgInstTblReg_Upd05_DtlInptAllocStsR(){
			return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptAllocStsR.create();
		}

		/**
		 * MfgInstTblReg_Upd05_DtlInptAllocStsブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptAllocStsR> createMfgInstTblReg_Upd05_DtlInptAllocStsL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptAllocStsR.class);
		}

		/**
		 * MfgInstTblReg_Upd05_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_HdrR createMfgInstTblReg_Upd05_HdrR(){
			return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_HdrR.create();
		}

		/**
		 * MfgInstTblReg_Upd05_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_HdrR> createMfgInstTblReg_Upd05_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_HdrR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>no_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>disp_seq_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>xfr_inst_err_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_outsrc_srv_flg</td></tr>
		 * 	<tr><td><br></td><td>lst_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * 	<tr><td><br></td><td>not_header_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>rem_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rem_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rem_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>inst_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>set_stk_str_ln_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.schd_tm</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.ver_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.base_unit_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.base_unit_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.base_unit_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.inpt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.lot_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.sno1</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.sno2</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.sno3</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.sno4</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.prov_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.bom_memo1</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.bom_memo2</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.bom_memo3</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.yield_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.base_unit_alt_qty</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.alt_itm_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.in_offst</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.bom_id_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.chd_itm_seq</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd.ver_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>sts_sav_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_tgt_cnt</td></tr>
		 * 	<tr><td><br></td><td>alloc_success_cnt</td></tr>
		 * 	<tr><td><br></td><td>alloc_failure_cnt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_HdrR> down1() {
			return down1;
		}


		/**
		 * [MfgInstTblReg_Upd05_DtlInptAllocSts]ブロックのコンテナaMfgInstTblReg_Upd05_DtlInptAllocStsLを返します。
		 *
		 * @return MfgInstTblReg_Upd05_DtlInptAllocStsL
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd05_DtlInptAllocStsR> MfgInstTblReg_Upd05_DtlInptAllocSts() {
			return aMfgInstTblReg_Upd05_DtlInptAllocSts;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstTblReg_Upd06オペレーション.<p>
	 *
	 * 工数予定の追加・更新・削除を行う<br>
	 */
	abstract public class MfgInstTblReg_Upd06 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstTblReg_Upd06";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR> down0;
		
		
		// コンストラクタ
		protected MfgInstTblReg_Upd06() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgInstTblReg_Upd06_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR createMfgInstTblReg_Upd06_DtlWkR(){
			return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR.create();
		}

		/**
		 * MfgInstTblReg_Upd06_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR> createMfgInstTblReg_Upd06_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>not_header_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>rem_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rem_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rem_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>wk_schd.wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd.oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd.wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_schd.wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_schd.fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_schd.wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_schd.mst_fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_schd.mst_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_schd.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>wk_schd.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>wk_schd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>wk_schd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>wk_schd.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd.wk_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd06_DtlWkR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstTblReg_Upd07オペレーション.<p>
	 *
	 * 副産品予定の追加・更新・削除を行う<br>
	 */
	abstract public class MfgInstTblReg_Upd07 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstTblReg_Upd07";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR> down0;
		
		
		// コンストラクタ
		protected MfgInstTblReg_Upd07() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgInstTblReg_Upd07_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR createMfgInstTblReg_Upd07_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR.create();
		}

		/**
		 * MfgInstTblReg_Upd07_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR> createMfgInstTblReg_Upd07_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>hdr_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>old_mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>old_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>not_frst_inst_can_flg</td></tr>
		 * 	<tr><td><br></td><td>not_header_inst_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>rem_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>rem_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>rem_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.schd_tm</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.trd_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.base_unit_yield_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.lot_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.sno1</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.sno2</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.sno3</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.sno4</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.disp_seq</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.inst_rpt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>yield_schd.sub_char3</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd07_DtlByProdR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstTblReg_Upd08オペレーション.<p>
	 *
	 */
	abstract public class MfgInstTblReg_Upd08 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstTblReg_Upd08";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl1R> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl2R> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl1R> down0;
		
		
		// コンストラクタ
		protected MfgInstTblReg_Upd08() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl1R.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl2R.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl1R.class);

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
			invoke((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * MfgInstTblReg_Upd08_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl1R createMfgInstTblReg_Upd08_Dtl1R(){
			return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl1R.create();
		}

		/**
		 * MfgInstTblReg_Upd08_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl1R> createMfgInstTblReg_Upd08_Dtl1L(){
			return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl1R.class);
		}

		/**
		 * MfgInstTblReg_Upd08_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl2R createMfgInstTblReg_Upd08_Dtl2R(){
			return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl2R.create();
		}

		/**
		 * MfgInstTblReg_Upd08_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl2R> createMfgInstTblReg_Upd08_Dtl2L(){
			return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>inst_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>unschd_flg</td></tr>
		 * 	<tr><td><br></td><td>not_inst_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl1R> up0() {
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
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oper_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>not_inst_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl2R> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd08_Dtl1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstTblReg_Upd09オペレーション.<p>
	 *
	 * 投入の受払予定を作成する。投入予定、投入引当状況、投入実績残テーブルの更新がすべて完了した後に呼ばれることを前提とする。<br>
	 */
	abstract public class MfgInstTblReg_Upd09 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstTblReg_Upd09";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd09_DtlInptR> up0;
		
		
		// コンストラクタ
		protected MfgInstTblReg_Upd09() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd09_DtlInptR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MfgInstTblReg_Upd09_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd09_DtlInptR createMfgInstTblReg_Upd09_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd09_DtlInptR.create();
		}

		/**
		 * MfgInstTblReg_Upd09_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd09_DtlInptR> createMfgInstTblReg_Upd09_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd09_DtlInptR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd09_DtlInptR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this).info;
		}


	}
	/**
	 * MfgInstTblReg_Upd10オペレーション.<p>
	 *
	 * 出来高・副産品の受払予定を作成する。出来高予定、出来高実績残テーブルの更新がすべて完了した後に呼ばれることを前提とする。<br>
	 */
	abstract public class MfgInstTblReg_Upd10 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MfgInstTblReg_Upd10";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd10_DtlYieldR> up0;
		
		
		// コンストラクタ
		protected MfgInstTblReg_Upd10() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd10_DtlYieldR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MfgInstTblReg_Upd10_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd10_DtlYieldR createMfgInstTblReg_Upd10_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd10_DtlYieldR.create();
		}

		/**
		 * MfgInstTblReg_Upd10_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd10_DtlYieldR> createMfgInstTblReg_Upd10_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd10_DtlYieldR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6010.MfgInstTblReg_Upd10_DtlYieldR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_MfgInstTblRegService)MSBCL_MfgInstTblRegService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}