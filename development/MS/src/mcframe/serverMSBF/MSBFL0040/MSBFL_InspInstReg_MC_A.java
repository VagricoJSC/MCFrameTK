package mcframe.serverMSBF.MSBFL0040;

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
 * "MSBFL_InspInstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFL_InspInstReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBF";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBFL0040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBFL_InspInstReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBFL0040_Srch01_INFO;
		this.aSrch01 = ((MSBFL_InspInstReg)this).new Srch01();
	}

	public static MSBFL_InspInstReg.Srch01 crtSrch01() {
		MSBFL_InspInstReg lgc = new MSBFL_InspInstReg();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
		p.addDownBlock(aSrch01.down1());
		p.addDownBlock(aSrch01.down2());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBF.MSBFL0040.Srch01_CndR.create();
	}

	/**
	 * Srch01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_CndR> createSrch01_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_CndR.class);
	}

	/**
	 * Srch01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Srch01_HdrR createSrch01_HdrR(){
		return mcframe.serverMSBF.MSBFL0040.Srch01_HdrR.create();
	}

	/**
	 * Srch01_DtlSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR createSrch01_DtlSchdR(){
		return mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR.create();
	}

	/**
	 * Srch01_DtlSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR> createSrch01_DtlSchdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR.class);
	}

	/**
	 * Srch01_DtlStdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR createSrch01_DtlStdR(){
		return mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.create();
	}

	/**
	 * Srch01_DtlStdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR> createSrch01_DtlStdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.class);
	}
	protected MSBFL_InspInstReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBFL0040_Srch02_INFO;
		this.aSrch02 = ((MSBFL_InspInstReg)this).new Srch02();
	}

	public static MSBFL_InspInstReg.Srch02 crtSrch02() {
		MSBFL_InspInstReg lgc = new MSBFL_InspInstReg();
		lgc.initSrch02();
		return lgc.aSrch02;
	}

	protected void paramSrch02(MCParam p) {
		if (this.aSrch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch02.up0());
		p.addDownBlock(aSrch02.down0());
		p.addDownBlock(aSrch02.down1());
		p.addDownBlock(aSrch02.down2());
	}

	protected void doSrch02() {
		aSrch02.call();
	};

	/**
	 * Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Srch02_CndR createSrch02_CndR(){
		return mcframe.serverMSBF.MSBFL0040.Srch02_CndR.create();
	}

	/**
	 * Srch02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Srch01_HdrR createSrch02_HdrR(){
		return mcframe.serverMSBF.MSBFL0040.Srch01_HdrR.create();
	}

	/**
	 * Srch02_DtlSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR createSrch02_DtlSchdR(){
		return mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR.create();
	}

	/**
	 * Srch02_DtlSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR> createSrch02_DtlSchdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR.class);
	}

	/**
	 * Srch02_DtlStdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR createSrch02_DtlStdR(){
		return mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.create();
	}

	/**
	 * Srch02_DtlStdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR> createSrch02_DtlStdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.class);
	}
	protected MSBFL_InspInstReg.Srch03 aSrch03;

	protected void initSrch03() {
		this.info = PDef.MS_MSBFL0040_Srch03_INFO;
		this.aSrch03 = ((MSBFL_InspInstReg)this).new Srch03();
	}

	public static MSBFL_InspInstReg.Srch03 crtSrch03() {
		MSBFL_InspInstReg lgc = new MSBFL_InspInstReg();
		lgc.initSrch03();
		return lgc.aSrch03;
	}

	protected void paramSrch03(MCParam p) {
		if (this.aSrch03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch03.up0());
		p.addDownBlock(aSrch03.down0());
		p.addDownBlock(aSrch03.down1());
	}

	protected void doSrch03() {
		aSrch03.call();
	};

	/**
	 * Srch03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Srch03_CndR createSrch03_CndR(){
		return mcframe.serverMSBF.MSBFL0040.Srch03_CndR.create();
	}

	/**
	 * Srch03_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Srch03_RsltR createSrch03_RsltR(){
		return mcframe.serverMSBF.MSBFL0040.Srch03_RsltR.create();
	}

	/**
	 * Srch03_DtlStdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR createSrch03_DtlStdR(){
		return mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.create();
	}

	/**
	 * Srch03_DtlStdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR> createSrch03_DtlStdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.class);
	}
	protected MSBFL_InspInstReg.Srch04 aSrch04;

	protected void initSrch04() {
		this.info = PDef.MS_MSBFL0040_Srch04_INFO;
		this.aSrch04 = ((MSBFL_InspInstReg)this).new Srch04();
	}

	public static MSBFL_InspInstReg.Srch04 crtSrch04() {
		MSBFL_InspInstReg lgc = new MSBFL_InspInstReg();
		lgc.initSrch04();
		return lgc.aSrch04;
	}

	protected void paramSrch04(MCParam p) {
		if (this.aSrch04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch04.up0());
		p.addDownBlock(aSrch04.down0());
		p.addDownBlock(aSrch04.down1());
	}

	protected void doSrch04() {
		aSrch04.call();
	};

	/**
	 * Srch04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Srch03_CndR createSrch04_CndR(){
		return mcframe.serverMSBF.MSBFL0040.Srch03_CndR.create();
	}

	/**
	 * Srch04_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Srch03_RsltR createSrch04_RsltR(){
		return mcframe.serverMSBF.MSBFL0040.Srch03_RsltR.create();
	}

	/**
	 * Srch04_DtlStdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR createSrch04_DtlStdR(){
		return mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.create();
	}

	/**
	 * Srch04_DtlStdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR> createSrch04_DtlStdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.class);
	}
	protected MSBFL_InspInstReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBFL0040_Chk01_INFO;
		this.aChk01 = ((MSBFL_InspInstReg)this).new Chk01();
	}

	public static MSBFL_InspInstReg.Chk01 crtChk01() {
		MSBFL_InspInstReg lgc = new MSBFL_InspInstReg();
		lgc.initChk01();
		return lgc.aChk01;
	}

	protected void paramChk01(MCParam p) {
		if (this.aChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk01.up0());
		p.addUpBlock(aChk01.up1());
		p.addUpBlock(aChk01.up2());
		p.addDownBlock(aChk01.down0());
		p.addDownBlock(aChk01.down1());
		p.addDownBlock(aChk01.down2());
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk01_HdrR createChk01_HdrR(){
		return mcframe.serverMSBF.MSBFL0040.Chk01_HdrR.create();
	}

	/**
	 * Chk01_DtlStdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR createChk01_DtlStdR(){
		return mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR.create();
	}

	/**
	 * Chk01_DtlStdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR> createChk01_DtlStdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR.class);
	}

	/**
	 * Chk01_DtlSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR createChk01_DtlSchdR(){
		return mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR.create();
	}

	/**
	 * Chk01_DtlSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR> createChk01_DtlSchdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR.class);
	}
	protected MSBFL_InspInstReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBFL0040_Chk02_INFO;
		this.aChk02 = ((MSBFL_InspInstReg)this).new Chk02();
	}

	public static MSBFL_InspInstReg.Chk02 crtChk02() {
		MSBFL_InspInstReg lgc = new MSBFL_InspInstReg();
		lgc.initChk02();
		return lgc.aChk02;
	}

	protected void paramChk02(MCParam p) {
		if (this.aChk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk02.up0());
		p.addUpBlock(aChk02.up1());
		p.addUpBlock(aChk02.up2());
		p.addDownBlock(aChk02.down0());
		p.addDownBlock(aChk02.down1());
		p.addDownBlock(aChk02.down2());
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk02_HdrR createChk02_HdrR(){
		return mcframe.serverMSBF.MSBFL0040.Chk02_HdrR.create();
	}

	/**
	 * Chk02_DtlStdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR createChk02_DtlStdR(){
		return mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR.create();
	}

	/**
	 * Chk02_DtlStdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR> createChk02_DtlStdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR.class);
	}

	/**
	 * Chk02_DtlSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR createChk02_DtlSchdR(){
		return mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR.create();
	}

	/**
	 * Chk02_DtlSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR> createChk02_DtlSchdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR.class);
	}
	protected MSBFL_InspInstReg.Chk03 aChk03;

	protected void initChk03() {
		this.info = PDef.MS_MSBFL0040_Chk03_INFO;
		this.aChk03 = ((MSBFL_InspInstReg)this).new Chk03();
	}

	public static MSBFL_InspInstReg.Chk03 crtChk03() {
		MSBFL_InspInstReg lgc = new MSBFL_InspInstReg();
		lgc.initChk03();
		return lgc.aChk03;
	}

	protected void paramChk03(MCParam p) {
		if (this.aChk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk03.up0());
		p.addDownBlock(aChk03.down0());
	}

	protected void doChk03() {
		aChk03.call();
	};

	/**
	 * Chk03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk03_HdrR createChk03_HdrR(){
		return mcframe.serverMSBF.MSBFL0040.Chk03_HdrR.create();
	}
	protected MSBFL_InspInstReg.Chk04 aChk04;

	protected void initChk04() {
		this.info = PDef.MS_MSBFL0040_Chk04_INFO;
		this.aChk04 = ((MSBFL_InspInstReg)this).new Chk04();
	}

	public static MSBFL_InspInstReg.Chk04 crtChk04() {
		MSBFL_InspInstReg lgc = new MSBFL_InspInstReg();
		lgc.initChk04();
		return lgc.aChk04;
	}

	protected void paramChk04(MCParam p) {
		if (this.aChk04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk04.up0());
		p.addUpBlock(aChk04.up1());
		p.addDownBlock(aChk04.down0());
		p.addDownBlock(aChk04.down1());
	}

	protected void doChk04() {
		aChk04.call();
	};

	/**
	 * Chk04_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk04_HdrR createChk04_HdrR(){
		return mcframe.serverMSBF.MSBFL0040.Chk04_HdrR.create();
	}

	/**
	 * Chk04_DtlSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR createChk04_DtlSchdR(){
		return mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR.create();
	}

	/**
	 * Chk04_DtlSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR> createChk04_DtlSchdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR.class);
	}
	protected MSBFL_InspInstReg.Chk05 aChk05;

	protected void initChk05() {
		this.info = PDef.MS_MSBFL0040_Chk05_INFO;
		this.aChk05 = ((MSBFL_InspInstReg)this).new Chk05();
	}

	public static MSBFL_InspInstReg.Chk05 crtChk05() {
		MSBFL_InspInstReg lgc = new MSBFL_InspInstReg();
		lgc.initChk05();
		return lgc.aChk05;
	}

	protected void paramChk05(MCParam p) {
		if (this.aChk05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk05.up0());
		p.addDownBlock(aChk05.down0());
	}

	protected void doChk05() {
		aChk05.call();
	};

	/**
	 * Chk05_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk05_HdrR createChk05_HdrR(){
		return mcframe.serverMSBF.MSBFL0040.Chk05_HdrR.create();
	}
	protected MSBFL_InspInstReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBFL0040_Ins01_INFO;
		this.aIns01 = ((MSBFL_InspInstReg)this).new Ins01();
	}

	public static MSBFL_InspInstReg.Ins01 crtIns01() {
		MSBFL_InspInstReg lgc = new MSBFL_InspInstReg();
		lgc.initIns01();
		return lgc.aIns01;
	}

	protected void paramIns01(MCParam p) {
		if (this.aIns01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aIns01.up0());
		p.addUpBlock(aIns01.up1());
		p.addUpBlock(aIns01.up2());
		p.addDownBlock(aIns01.down0());
		p.addDownBlock(aIns01.down1());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk01_HdrR createIns01_HdrR(){
		return mcframe.serverMSBF.MSBFL0040.Chk01_HdrR.create();
	}

	/**
	 * Ins01_DtlStdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR createIns01_DtlStdR(){
		return mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR.create();
	}

	/**
	 * Ins01_DtlStdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR> createIns01_DtlStdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR.class);
	}

	/**
	 * Ins01_DtlSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR createIns01_DtlSchdR(){
		return mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR.create();
	}

	/**
	 * Ins01_DtlSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR> createIns01_DtlSchdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR.class);
	}
	protected MSBFL_InspInstReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBFL0040_Upd01_INFO;
		this.aUpd01 = ((MSBFL_InspInstReg)this).new Upd01();
	}

	public static MSBFL_InspInstReg.Upd01 crtUpd01() {
		MSBFL_InspInstReg lgc = new MSBFL_InspInstReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addUpBlock(aUpd01.up1());
		p.addUpBlock(aUpd01.up2());
		p.addDownBlock(aUpd01.down0());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk02_HdrR createUpd01_HdrR(){
		return mcframe.serverMSBF.MSBFL0040.Chk02_HdrR.create();
	}

	/**
	 * Upd01_DtlStdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR createUpd01_DtlStdR(){
		return mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR.create();
	}

	/**
	 * Upd01_DtlStdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR> createUpd01_DtlStdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR.class);
	}

	/**
	 * Upd01_DtlSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR createUpd01_DtlSchdR(){
		return mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR.create();
	}

	/**
	 * Upd01_DtlSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR> createUpd01_DtlSchdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR.class);
	}
	protected MSBFL_InspInstReg.Upd02 aUpd02;

	protected void initUpd02() {
		this.info = PDef.MS_MSBFL0040_Upd02_INFO;
		this.aUpd02 = ((MSBFL_InspInstReg)this).new Upd02();
	}

	public static MSBFL_InspInstReg.Upd02 crtUpd02() {
		MSBFL_InspInstReg lgc = new MSBFL_InspInstReg();
		lgc.initUpd02();
		return lgc.aUpd02;
	}

	protected void paramUpd02(MCParam p) {
		if (this.aUpd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd02.up0());
		p.addDownBlock(aUpd02.down0());
	}

	protected void doUpd02() {
		aUpd02.call();
	};

	/**
	 * Upd02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk03_HdrR createUpd02_HdrR(){
		return mcframe.serverMSBF.MSBFL0040.Chk03_HdrR.create();
	}
	protected MSBFL_InspInstReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBFL0040_Del01_INFO;
		this.aDel01 = ((MSBFL_InspInstReg)this).new Del01();
	}

	public static MSBFL_InspInstReg.Del01 crtDel01() {
		MSBFL_InspInstReg lgc = new MSBFL_InspInstReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
		p.addUpBlock(aDel01.up1());
		p.addDownBlock(aDel01.down0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk04_HdrR createDel01_HdrR(){
		return mcframe.serverMSBF.MSBFL0040.Chk04_HdrR.create();
	}

	/**
	 * Del01_DtlSchdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR createDel01_DtlSchdR(){
		return mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR.create();
	}

	/**
	 * Del01_DtlSchdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR> createDel01_DtlSchdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR.class);
	}
	protected MSBFL_InspInstReg.Del02 aDel02;

	protected void initDel02() {
		this.info = PDef.MS_MSBFL0040_Del02_INFO;
		this.aDel02 = ((MSBFL_InspInstReg)this).new Del02();
	}

	public static MSBFL_InspInstReg.Del02 crtDel02() {
		MSBFL_InspInstReg lgc = new MSBFL_InspInstReg();
		lgc.initDel02();
		return lgc.aDel02;
	}

	protected void paramDel02(MCParam p) {
		if (this.aDel02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel02.up0());
		p.addDownBlock(aDel02.down0());
	}

	protected void doDel02() {
		aDel02.call();
	};

	/**
	 * Del02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Chk05_HdrR createDel02_HdrR(){
		return mcframe.serverMSBF.MSBFL0040.Chk05_HdrR.create();
	}
	protected MSBFL_InspInstReg.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBFL0040_Prnt01_INFO;
		this.aPrnt01 = ((MSBFL_InspInstReg)this).new Prnt01();
	}

	public static MSBFL_InspInstReg.Prnt01 crtPrnt01() {
		MSBFL_InspInstReg lgc = new MSBFL_InspInstReg();
		lgc.initPrnt01();
		return lgc.aPrnt01;
	}

	protected void paramPrnt01(MCParam p) {
		if (this.aPrnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt01.up0());
	}

	protected void doPrnt01() {
		aPrnt01.call();
	};

	/**
	 * Prnt01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL0040.Prnt01_HdrR createPrnt01_HdrR(){
		return mcframe.serverMSBF.MSBFL0040.Prnt01_HdrR.create();
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検査予定、品目検査規格マスタを検索する<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Srch01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR> down2;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_CndR.class);
			down0 = mcframe.serverMSBF.MSBFL0040.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR.class);
			down2 = MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.class);

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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBF.MSBFL0040.Srch01_CndR.create();
		}

		/**
		 * Srch01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_CndR> createSrch01_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_CndR.class);
		}

		/**
		 * Srch01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch01_HdrR createSrch01_HdrR(){
			return mcframe.serverMSBF.MSBFL0040.Srch01_HdrR.create();
		}

		/**
		 * Srch01_DtlSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR createSrch01_DtlSchdR(){
			return mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR.create();
		}

		/**
		 * Srch01_DtlSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR> createSrch01_DtlSchdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR.class);
		}

		/**
		 * Srch01_DtlStdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR createSrch01_DtlStdR(){
			return mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.create();
		}

		/**
		 * Srch01_DtlStdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR> createSrch01_DtlStdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>insp_freq</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lmt_up_flg</td></tr>
		 * 	<tr><td><br></td><td>in_prmt_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>to_site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_dt</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>st_hm</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>end_hm</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_std_no</td></tr>
		 * 	<tr><td><br></td><td>std_req_flg</td></tr>
		 * 	<tr><td><br></td><td>std_cnf_req_flg</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>lims_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_bind_typ</td></tr>
		 * 	<tr><td><br></td><td>is_invalid_insp_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>spl_qty</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Srch01_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>pack_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>smpl_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>smpl_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>st_hm</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>end_hm</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>src_no1</td></tr>
		 * 	<tr><td><br></td><td>src_no2</td></tr>
		 * 	<tr><td><br></td><td>src_no3</td></tr>
		 * 	<tr><td><br></td><td>src_no4</td></tr>
		 * 	<tr><td><br></td><td>insp_inst_issue_typ</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_seq</td></tr>
		 * 	<tr><td><br></td><td>insp_point_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_point_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_qlqn_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_qlqn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ql_std_val</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_int_digit</td></tr>
		 * 	<tr><td><br></td><td>qn_int_frac</td></tr>
		 * 	<tr><td><br></td><td>qn_out_min</td></tr>
		 * 	<tr><td><br></td><td>sign_out_min_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_out_min_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_in_min</td></tr>
		 * 	<tr><td><br></td><td>sign_in_min_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_in_min_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sign_in_max_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_in_max_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_in_max</td></tr>
		 * 	<tr><td><br></td><td>sign_out_max_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_out_max_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_out_max</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 検査指図、検査予定、規格検査指図を検索する<br>
	 */
	abstract public class Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Srch02_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR> down2;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0040.Srch02_CndR.create();
			down0 = mcframe.serverMSBF.MSBFL0040.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR.class);
			down2 = MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.class);

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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch02_CndR createSrch02_CndR(){
			return mcframe.serverMSBF.MSBFL0040.Srch02_CndR.create();
		}

		/**
		 * Srch02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch01_HdrR createSrch02_HdrR(){
			return mcframe.serverMSBF.MSBFL0040.Srch01_HdrR.create();
		}

		/**
		 * Srch02_DtlSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR createSrch02_DtlSchdR(){
			return mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR.create();
		}

		/**
		 * Srch02_DtlSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR> createSrch02_DtlSchdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR.class);
		}

		/**
		 * Srch02_DtlStdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR createSrch02_DtlStdR(){
			return mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.create();
		}

		/**
		 * Srch02_DtlStdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR> createSrch02_DtlStdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ope</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Srch02_CndR
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch02_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_freq</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lmt_up_flg</td></tr>
		 * 	<tr><td><br></td><td>in_prmt_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>to_site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_dt</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>st_hm</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>end_hm</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_std_no</td></tr>
		 * 	<tr><td><br></td><td>std_req_flg</td></tr>
		 * 	<tr><td><br></td><td>std_cnf_req_flg</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>master_plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_dt</td></tr>
		 * 	<tr><td><br></td><td>aprv_tm</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>aprv_rsn</td></tr>
		 * 	<tr><td><br></td><td>lims_flg</td></tr>
		 * 	<tr><td><br></td><td>last_lims_flg</td></tr>
		 * 	<tr><td><br></td><td>aprv_lims_flg</td></tr>
		 * 	<tr><td><br></td><td>last_aprv_lims_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>is_invalid_insp_ptn_flg</td></tr>
		 * 	<tr><td><br></td><td>spl_qty</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Srch01_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pack_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>pack_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>smpl_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>smpl_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>st_hm</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>end_hm</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>src_no1</td></tr>
		 * 	<tr><td><br></td><td>src_no2</td></tr>
		 * 	<tr><td><br></td><td>src_no3</td></tr>
		 * 	<tr><td><br></td><td>src_no4</td></tr>
		 * 	<tr><td><br></td><td>insp_inst_issue_typ</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlSchdR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>std_insp_inst_no</td></tr>
		 * 	<tr><td><br></td><td>insp_seq</td></tr>
		 * 	<tr><td><br></td><td>insp_point_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_point_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_qlqn_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_qlqn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ql_std_val</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_int_digit</td></tr>
		 * 	<tr><td><br></td><td>qn_int_frac</td></tr>
		 * 	<tr><td><br></td><td>qn_out_min</td></tr>
		 * 	<tr><td><br></td><td>sign_out_min_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_out_min_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_in_min</td></tr>
		 * 	<tr><td><br></td><td>sign_in_min_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_in_min_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sign_in_max_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_in_max_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_in_max</td></tr>
		 * 	<tr><td><br></td><td>sign_out_max_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_out_max_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_out_max</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>add_point_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this).info;
		}


	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * マスタ適用日変更時に、品目検査、品目パタン、品目規格情報を再検索する<br>
	 */
	abstract public class Srch03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Srch03_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Srch03_RsltR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR> down1;
		
		
		// コンストラクタ
		protected Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0040.Srch03_CndR.create();
			down0 = mcframe.serverMSBF.MSBFL0040.Srch03_RsltR.create();
			down1 = MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.class);

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
			invoke((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch03_CndR createSrch03_CndR(){
			return mcframe.serverMSBF.MSBFL0040.Srch03_CndR.create();
		}

		/**
		 * Srch03_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch03_RsltR createSrch03_RsltR(){
			return mcframe.serverMSBF.MSBFL0040.Srch03_RsltR.create();
		}

		/**
		 * Srch03_DtlStdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR createSrch03_DtlStdR(){
			return mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.create();
		}

		/**
		 * Srch03_DtlStdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR> createSrch03_DtlStdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>to_site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Srch03_CndR
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch03_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_std_no</td></tr>
		 * 	<tr><td><br></td><td>insp_bind_typ</td></tr>
		 * 	<tr><td><br></td><td>std_req_flg</td></tr>
		 * 	<tr><td><br></td><td>std_cnf_req_flg</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>spl_qty</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Srch03_RsltR
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch03_RsltR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_seq</td></tr>
		 * 	<tr><td><br></td><td>insp_point_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_point_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_qlqn_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_qlqn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ql_std_val</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_int_digit</td></tr>
		 * 	<tr><td><br></td><td>qn_int_frac</td></tr>
		 * 	<tr><td><br></td><td>qn_out_min</td></tr>
		 * 	<tr><td><br></td><td>sign_out_min_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_out_min_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_in_min</td></tr>
		 * 	<tr><td><br></td><td>sign_in_min_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_in_min_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sign_in_max_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_in_max_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_in_max</td></tr>
		 * 	<tr><td><br></td><td>sign_out_max_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_out_max_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_out_max</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this).info;
		}


	}
	/**
	 * Srch04オペレーション.<p>
	 *
	 * 検査パタン変更時に、品目検査、品目パタン、品目規格情報を再検索する<br>
	 */
	abstract public class Srch04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Srch03_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Srch03_RsltR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR> down1;
		
		
		// コンストラクタ
		protected Srch04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0040.Srch03_CndR.create();
			down0 = mcframe.serverMSBF.MSBFL0040.Srch03_RsltR.create();
			down1 = MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.class);

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
			invoke((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch03_CndR createSrch04_CndR(){
			return mcframe.serverMSBF.MSBFL0040.Srch03_CndR.create();
		}

		/**
		 * Srch04_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch03_RsltR createSrch04_RsltR(){
			return mcframe.serverMSBF.MSBFL0040.Srch03_RsltR.create();
		}

		/**
		 * Srch04_DtlStdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR createSrch04_DtlStdR(){
			return mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.create();
		}

		/**
		 * Srch04_DtlStdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR> createSrch04_DtlStdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>to_site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Srch03_CndR
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch03_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_std_no</td></tr>
		 * 	<tr><td><br></td><td>std_req_flg</td></tr>
		 * 	<tr><td><br></td><td>std_cnf_req_flg</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>spl_qty</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Srch03_RsltR
		 */
		public mcframe.serverMSBF.MSBFL0040.Srch03_RsltR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_seq</td></tr>
		 * 	<tr><td><br></td><td>insp_point_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_point_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_qlqn_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_qlqn_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ql_std_val</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_int_digit</td></tr>
		 * 	<tr><td><br></td><td>qn_int_frac</td></tr>
		 * 	<tr><td><br></td><td>qn_out_min</td></tr>
		 * 	<tr><td><br></td><td>sign_out_min_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_out_min_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_in_min</td></tr>
		 * 	<tr><td><br></td><td>sign_in_min_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_in_min_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sign_in_max_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_in_max_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_in_max</td></tr>
		 * 	<tr><td><br></td><td>sign_out_max_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_out_max_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>qn_out_max</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Srch01_DtlStdR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 検査指図を登録する前に、チェックを実行する<br>
	 */
	abstract public class Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR> down2;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0040.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR.class);
			up2 = MCList.create(mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR.class);
			down0 = mcframe.serverMSBF.MSBFL0040.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR.class);
			down2 = MCList.create(mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR.class);

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
			invoke((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk01_HdrR createChk01_HdrR(){
			return mcframe.serverMSBF.MSBFL0040.Chk01_HdrR.create();
		}

		/**
		 * Chk01_DtlStdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR createChk01_DtlStdR(){
			return mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR.create();
		}

		/**
		 * Chk01_DtlStdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR> createChk01_DtlStdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR.class);
		}

		/**
		 * Chk01_DtlSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR createChk01_DtlSchdR(){
			return mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR.create();
		}

		/**
		 * Chk01_DtlSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR> createChk01_DtlSchdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_std_no</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>in_prmt_insp_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk01_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>smpl_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>insp_inst_issue_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk01_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk01_HdrR down0() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 検査指図を更新する前に、チェックを実行する<br>
	 */
	abstract public class Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk02_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk02_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR> down2;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0040.Chk02_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR.class);
			up2 = MCList.create(mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR.class);
			down0 = mcframe.serverMSBF.MSBFL0040.Chk02_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR.class);
			down2 = MCList.create(mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR.class);

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
			invoke((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk02_HdrR createChk02_HdrR(){
			return mcframe.serverMSBF.MSBFL0040.Chk02_HdrR.create();
		}

		/**
		 * Chk02_DtlStdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR createChk02_DtlStdR(){
			return mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR.create();
		}

		/**
		 * Chk02_DtlStdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR> createChk02_DtlStdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR.class);
		}

		/**
		 * Chk02_DtlSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR createChk02_DtlSchdR(){
			return mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR.create();
		}

		/**
		 * Chk02_DtlSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR> createChk02_DtlSchdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_dt</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_std_no</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_freq</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>in_prmt_insp_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk02_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk02_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>insp_inst_issue_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk02_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk02_HdrR down0() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 検査指図を承認する前に、チェックを実行する<br>
	 */
	abstract public class Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk03_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk03_HdrR down0;
		
		
		// コンストラクタ
		protected Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0040.Chk03_HdrR.create();
			down0 = mcframe.serverMSBF.MSBFL0040.Chk03_HdrR.create();

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
			invoke((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk03_HdrR createChk03_HdrR(){
			return mcframe.serverMSBF.MSBFL0040.Chk03_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_dt</td></tr>
		 * 	<tr><td><br></td><td>aprv_tm</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_rsn</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk03_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk03_HdrR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk03_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk03_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk04オペレーション.<p>
	 *
	 * 検査指図を取り消す前に、チェックを実行する<br>
	 */
	abstract public class Chk04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk04_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk04_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR> down1;
		
		
		// コンストラクタ
		protected Chk04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0040.Chk04_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR.class);
			down0 = mcframe.serverMSBF.MSBFL0040.Chk04_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR.class);

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
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk04_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk04_HdrR createChk04_HdrR(){
			return mcframe.serverMSBF.MSBFL0040.Chk04_HdrR.create();
		}

		/**
		 * Chk04_DtlSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR createChk04_DtlSchdR(){
			return mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR.create();
		}

		/**
		 * Chk04_DtlSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR> createChk04_DtlSchdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>insp_freq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk04_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk04_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR> up1() {
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
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk04_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk04_HdrR down0() {
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk05オペレーション.<p>
	 *
	 * 検査指図の承認を取り消す前に、チェックを実行する<br>
	 */
	abstract public class Chk05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Chk05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk05_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk05_HdrR down0;
		
		
		// コンストラクタ
		protected Chk05() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0040.Chk05_HdrR.create();
			down0 = mcframe.serverMSBF.MSBFL0040.Chk05_HdrR.create();

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
			invoke((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk05_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk05_HdrR createChk05_HdrR(){
			return mcframe.serverMSBF.MSBFL0040.Chk05_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>insp_freq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk05_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk05_HdrR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk05_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk05_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 検査指図の登録を行う<br>
	 */
	abstract public class Ins01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Ins01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR> down1;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0040.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR.class);
			up2 = MCList.create(mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR.class);
			down0 = mcframe.serverMSBF.MSBFL0040.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk01_HdrR createIns01_HdrR(){
			return mcframe.serverMSBF.MSBFL0040.Chk01_HdrR.create();
		}

		/**
		 * Ins01_DtlStdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR createIns01_DtlStdR(){
			return mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR.create();
		}

		/**
		 * Ins01_DtlStdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR> createIns01_DtlStdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR.class);
		}

		/**
		 * Ins01_DtlSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR createIns01_DtlSchdR(){
			return mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR.create();
		}

		/**
		 * Ins01_DtlSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR> createIns01_DtlSchdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>inst_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_std_no</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>in_prmt_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>lims_flg</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk01_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_seq</td></tr>
		 * 	<tr><td><br></td><td>insp_point_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_qlqn_typ</td></tr>
		 * 	<tr><td><br></td><td>ql_std_val</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>qn_int_digit</td></tr>
		 * 	<tr><td><br></td><td>qn_int_frac</td></tr>
		 * 	<tr><td><br></td><td>qn_out_min</td></tr>
		 * 	<tr><td><br></td><td>sign_out_min_typ</td></tr>
		 * 	<tr><td><br></td><td>qn_in_min</td></tr>
		 * 	<tr><td><br></td><td>sign_in_min_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_in_max_typ</td></tr>
		 * 	<tr><td><br></td><td>qn_in_max</td></tr>
		 * 	<tr><td><br></td><td>sign_out_max_typ</td></tr>
		 * 	<tr><td><br></td><td>qn_out_max</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>add_point_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>smpl_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>insp_inst_issue_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlSchdR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk01_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>std_insp_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk01_DtlStdR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 検査指図の更新を行う<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk02_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR> down0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0040.Chk02_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR.class);
			up2 = MCList.create(mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR.class);

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
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk02_HdrR createUpd01_HdrR(){
			return mcframe.serverMSBF.MSBFL0040.Chk02_HdrR.create();
		}

		/**
		 * Upd01_DtlStdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR createUpd01_DtlStdR(){
			return mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR.create();
		}

		/**
		 * Upd01_DtlStdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR> createUpd01_DtlStdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR.class);
		}

		/**
		 * Upd01_DtlSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR createUpd01_DtlSchdR(){
			return mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR.create();
		}

		/**
		 * Upd01_DtlSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR> createUpd01_DtlSchdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>inst_dt</td></tr>
		 * 	<tr><td><br></td><td>st_tm</td></tr>
		 * 	<tr><td><br></td><td>end_tm</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_std_no</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>in_prmt_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>lims_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_freq</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk02_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk02_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>std_insp_inst_no</td></tr>
		 * 	<tr><td><br></td><td>insp_seq</td></tr>
		 * 	<tr><td><br></td><td>insp_point_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_qlqn_typ</td></tr>
		 * 	<tr><td><br></td><td>ql_std_val</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>qn_int_digit</td></tr>
		 * 	<tr><td><br></td><td>qn_int_frac</td></tr>
		 * 	<tr><td><br></td><td>qn_out_min</td></tr>
		 * 	<tr><td><br></td><td>sign_out_min_typ</td></tr>
		 * 	<tr><td><br></td><td>qn_in_min</td></tr>
		 * 	<tr><td><br></td><td>sign_in_min_typ</td></tr>
		 * 	<tr><td><br></td><td>sign_in_max_typ</td></tr>
		 * 	<tr><td><br></td><td>qn_in_max</td></tr>
		 * 	<tr><td><br></td><td>sign_out_max_typ</td></tr>
		 * 	<tr><td><br></td><td>qn_out_max</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>add_point_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>smpl_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>insp_inst_issue_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlSchdR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>std_insp_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk02_DtlStdR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this).info;
		}


	}
	/**
	 * Upd02オペレーション.<p>
	 *
	 * 検査指図の承認を行う<br>
	 */
	abstract public class Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk03_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk03_HdrR down0;
		
		
		// コンストラクタ
		protected Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0040.Chk03_HdrR.create();
			down0 = mcframe.serverMSBF.MSBFL0040.Chk03_HdrR.create();

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
			invoke((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk03_HdrR createUpd02_HdrR(){
			return mcframe.serverMSBF.MSBFL0040.Chk03_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_dt</td></tr>
		 * 	<tr><td><br></td><td>aprv_tm</td></tr>
		 * 	<tr><td><br></td><td>aprv_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>aprv_rsn</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>lims_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk03_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk03_HdrR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk03_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk03_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 検査指図の取消を行う<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk04_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk04_HdrR down0;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0040.Chk04_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR.class);
			down0 = mcframe.serverMSBF.MSBFL0040.Chk04_HdrR.create();

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
			invoke((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk04_HdrR createDel01_HdrR(){
			return mcframe.serverMSBF.MSBFL0040.Chk04_HdrR.create();
		}

		/**
		 * Del01_DtlSchdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR createDel01_DtlSchdR(){
			return mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR.create();
		}

		/**
		 * Del01_DtlSchdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR> createDel01_DtlSchdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>lims_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_freq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk04_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk04_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_schd_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL0040.Chk04_DtlSchdR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk04_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk04_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this).info;
		}


	}
	/**
	 * Del02オペレーション.<p>
	 *
	 * 検査指図の承認取消を行う<br>
	 */
	abstract public class Del02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk05_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Chk05_HdrR down0;
		
		
		// コンストラクタ
		protected Del02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0040.Chk05_HdrR.create();
			down0 = mcframe.serverMSBF.MSBFL0040.Chk05_HdrR.create();

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
			invoke((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Del02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk05_HdrR createDel02_HdrR(){
			return mcframe.serverMSBF.MSBFL0040.Chk05_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>aprv_rsn</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>lims_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_freq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk05_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk05_HdrR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_aprv_sts_typ_nm</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Chk05_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Chk05_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this).info;
		}


	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 検査成績書を発行する<br>
	 */
	abstract public class Prnt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prnt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBF.MSBFL0040.Prnt01_HdrR up0;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBF.MSBFL0040.Prnt01_HdrR.create();

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
			invoke((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Prnt01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL0040.Prnt01_HdrR createPrnt01_HdrR(){
			return mcframe.serverMSBF.MSBFL0040.Prnt01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBF.MSBFL0040.Prnt01_HdrR
		 */
		public mcframe.serverMSBF.MSBFL0040.Prnt01_HdrR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_InspInstReg)MSBFL_InspInstReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}