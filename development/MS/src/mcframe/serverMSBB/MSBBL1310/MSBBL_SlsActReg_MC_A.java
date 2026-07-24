package mcframe.serverMSBB.MSBBL1310;

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
 * "MSBBL_SlsActReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBL_SlsActReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBB";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBBL1310";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBL_SlsActReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBBL1310_Srch01_INFO;
		this.aSrch01 = ((MSBBL_SlsActReg)this).new Srch01();
	}

	public static MSBBL_SlsActReg.Srch01 crtSrch01() {
		MSBBL_SlsActReg lgc = new MSBBL_SlsActReg();
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
	public mcframe.serverMSBB.MSBBL1310.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_CndR.create();
	}

	/**
	 * Srch01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_HdrR createSrch01_HdrR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_HdrR.create();
	}

	/**
	 * Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_DtlR createSrch01_DtlR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.create();
	}

	/**
	 * Srch01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> createSrch01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.class);
	}

	/**
	 * Srch01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_IoR createSrch01_IoR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_IoR.create();
	}

	/**
	 * Srch01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> createSrch01_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_IoR.class);
	}
	protected MSBBL_SlsActReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBBL1310_Srch02_INFO;
		this.aSrch02 = ((MSBBL_SlsActReg)this).new Srch02();
	}

	public static MSBBL_SlsActReg.Srch02 crtSrch02() {
		MSBBL_SlsActReg lgc = new MSBBL_SlsActReg();
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
	public mcframe.serverMSBB.MSBBL1310.Srch01_CndR createSrch02_CndR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_CndR.create();
	}

	/**
	 * Srch02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_HdrR createSrch02_HdrR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_HdrR.create();
	}

	/**
	 * Srch02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_DtlR createSrch02_DtlR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.create();
	}

	/**
	 * Srch02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> createSrch02_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.class);
	}

	/**
	 * Srch02_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_IoR createSrch02_IoR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_IoR.create();
	}

	/**
	 * Srch02_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> createSrch02_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_IoR.class);
	}
	protected MSBBL_SlsActReg.Srch03 aSrch03;

	protected void initSrch03() {
		this.info = PDef.MS_MSBBL1310_Srch03_INFO;
		this.aSrch03 = ((MSBBL_SlsActReg)this).new Srch03();
	}

	public static MSBBL_SlsActReg.Srch03 crtSrch03() {
		MSBBL_SlsActReg lgc = new MSBBL_SlsActReg();
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
		p.addDownBlock(aSrch03.down2());
	}

	protected void doSrch03() {
		aSrch03.call();
	};

	/**
	 * Srch03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_CndR createSrch03_CndR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_CndR.create();
	}

	/**
	 * Srch03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_HdrR createSrch03_HdrR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_HdrR.create();
	}

	/**
	 * Srch03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_DtlR createSrch03_DtlR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.create();
	}

	/**
	 * Srch03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> createSrch03_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.class);
	}

	/**
	 * Srch03_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_IoR createSrch03_IoR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_IoR.create();
	}

	/**
	 * Srch03_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> createSrch03_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_IoR.class);
	}
	protected MSBBL_SlsActReg.Srch04 aSrch04;

	protected void initSrch04() {
		this.info = PDef.MS_MSBBL1310_Srch04_INFO;
		this.aSrch04 = ((MSBBL_SlsActReg)this).new Srch04();
	}

	public static MSBBL_SlsActReg.Srch04 crtSrch04() {
		MSBBL_SlsActReg lgc = new MSBBL_SlsActReg();
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
		p.addDownBlock(aSrch04.down2());
	}

	protected void doSrch04() {
		aSrch04.call();
	};

	/**
	 * Srch04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_CndR createSrch04_CndR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_CndR.create();
	}

	/**
	 * Srch04_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_HdrR createSrch04_HdrR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_HdrR.create();
	}

	/**
	 * Srch04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_DtlR createSrch04_DtlR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.create();
	}

	/**
	 * Srch04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> createSrch04_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.class);
	}

	/**
	 * Srch04_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_IoR createSrch04_IoR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_IoR.create();
	}

	/**
	 * Srch04_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> createSrch04_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_IoR.class);
	}
	protected MSBBL_SlsActReg.Srch05 aSrch05;

	protected void initSrch05() {
		this.info = PDef.MS_MSBBL1310_Srch05_INFO;
		this.aSrch05 = ((MSBBL_SlsActReg)this).new Srch05();
	}

	public static MSBBL_SlsActReg.Srch05 crtSrch05() {
		MSBBL_SlsActReg lgc = new MSBBL_SlsActReg();
		lgc.initSrch05();
		return lgc.aSrch05;
	}

	protected void paramSrch05(MCParam p) {
		if (this.aSrch05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch05.up0());
		p.addDownBlock(aSrch05.down0());
		p.addDownBlock(aSrch05.down1());
		p.addDownBlock(aSrch05.down2());
	}

	protected void doSrch05() {
		aSrch05.call();
	};

	/**
	 * Srch05_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_CndR createSrch05_CndR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_CndR.create();
	}

	/**
	 * Srch05_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_HdrR createSrch05_HdrR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_HdrR.create();
	}

	/**
	 * Srch05_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_DtlR createSrch05_DtlR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.create();
	}

	/**
	 * Srch05_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> createSrch05_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.class);
	}

	/**
	 * Srch05_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_IoR createSrch05_IoR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_IoR.create();
	}

	/**
	 * Srch05_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> createSrch05_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_IoR.class);
	}
	protected MSBBL_SlsActReg.Srch06 aSrch06;

	protected void initSrch06() {
		this.info = PDef.MS_MSBBL1310_Srch06_INFO;
		this.aSrch06 = ((MSBBL_SlsActReg)this).new Srch06();
	}

	public static MSBBL_SlsActReg.Srch06 crtSrch06() {
		MSBBL_SlsActReg lgc = new MSBBL_SlsActReg();
		lgc.initSrch06();
		return lgc.aSrch06;
	}

	protected void paramSrch06(MCParam p) {
		if (this.aSrch06 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch06.up0());
		p.addDownBlock(aSrch06.down0());
		p.addDownBlock(aSrch06.down1());
		p.addDownBlock(aSrch06.down2());
	}

	protected void doSrch06() {
		aSrch06.call();
	};

	/**
	 * Srch06_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_CndR createSrch06_CndR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_CndR.create();
	}

	/**
	 * Srch06_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_HdrR createSrch06_HdrR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_HdrR.create();
	}

	/**
	 * Srch06_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_DtlR createSrch06_DtlR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.create();
	}

	/**
	 * Srch06_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> createSrch06_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.class);
	}

	/**
	 * Srch06_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Srch01_IoR createSrch06_IoR(){
		return mcframe.serverMSBB.MSBBL1310.Srch01_IoR.create();
	}

	/**
	 * Srch06_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> createSrch06_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_IoR.class);
	}
	protected MSBBL_SlsActReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBBL1310_Chk01_INFO;
		this.aChk01 = ((MSBBL_SlsActReg)this).new Chk01();
	}

	public static MSBBL_SlsActReg.Chk01 crtChk01() {
		MSBBL_SlsActReg lgc = new MSBBL_SlsActReg();
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
	public mcframe.serverMSBB.MSBBL1310.Chk01_HdrR createChk01_HdrR(){
		return mcframe.serverMSBB.MSBBL1310.Chk01_HdrR.create();
	}

	/**
	 * Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Chk01_DtlR createChk01_DtlR(){
		return mcframe.serverMSBB.MSBBL1310.Chk01_DtlR.create();
	}

	/**
	 * Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> createChk01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR.class);
	}

	/**
	 * Chk01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Chk01_IoR createChk01_IoR(){
		return mcframe.serverMSBB.MSBBL1310.Chk01_IoR.create();
	}

	/**
	 * Chk01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> createChk01_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_IoR.class);
	}
	protected MSBBL_SlsActReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBBL1310_Ins01_INFO;
		this.aIns01 = ((MSBBL_SlsActReg)this).new Ins01();
	}

	public static MSBBL_SlsActReg.Ins01 crtIns01() {
		MSBBL_SlsActReg lgc = new MSBBL_SlsActReg();
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
		p.addDownBlock(aIns01.down2());
	}

	protected void doIns01() {
		aIns01.call();
	};

	/**
	 * Ins01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Chk01_HdrR createIns01_HdrR(){
		return mcframe.serverMSBB.MSBBL1310.Chk01_HdrR.create();
	}

	/**
	 * Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Chk01_DtlR createIns01_DtlR(){
		return mcframe.serverMSBB.MSBBL1310.Chk01_DtlR.create();
	}

	/**
	 * Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> createIns01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR.class);
	}

	/**
	 * Ins01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Chk01_IoR createIns01_IoR(){
		return mcframe.serverMSBB.MSBBL1310.Chk01_IoR.create();
	}

	/**
	 * Ins01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> createIns01_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_IoR.class);
	}
	protected MSBBL_SlsActReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBBL1310_Upd01_INFO;
		this.aUpd01 = ((MSBBL_SlsActReg)this).new Upd01();
	}

	public static MSBBL_SlsActReg.Upd01 crtUpd01() {
		MSBBL_SlsActReg lgc = new MSBBL_SlsActReg();
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
		p.addDownBlock(aUpd01.down1());
		p.addDownBlock(aUpd01.down2());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Chk01_HdrR createUpd01_HdrR(){
		return mcframe.serverMSBB.MSBBL1310.Chk01_HdrR.create();
	}

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Chk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMSBB.MSBBL1310.Chk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR.class);
	}

	/**
	 * Upd01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Chk01_IoR createUpd01_IoR(){
		return mcframe.serverMSBB.MSBBL1310.Chk01_IoR.create();
	}

	/**
	 * Upd01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> createUpd01_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_IoR.class);
	}
	protected MSBBL_SlsActReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBBL1310_Chk02_INFO;
		this.aChk02 = ((MSBBL_SlsActReg)this).new Chk02();
	}

	public static MSBBL_SlsActReg.Chk02 crtChk02() {
		MSBBL_SlsActReg lgc = new MSBBL_SlsActReg();
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
	public mcframe.serverMSBB.MSBBL1310.Chk02_HdrR createChk02_HdrR(){
		return mcframe.serverMSBB.MSBBL1310.Chk02_HdrR.create();
	}

	/**
	 * Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Chk02_DtlR createChk02_DtlR(){
		return mcframe.serverMSBB.MSBBL1310.Chk02_DtlR.create();
	}

	/**
	 * Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> createChk02_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk02_DtlR.class);
	}

	/**
	 * Chk02_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Chk02_IoR createChk02_IoR(){
		return mcframe.serverMSBB.MSBBL1310.Chk02_IoR.create();
	}

	/**
	 * Chk02_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Chk02_IoR> createChk02_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk02_IoR.class);
	}
	protected MSBBL_SlsActReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBBL1310_Del01_INFO;
		this.aDel01 = ((MSBBL_SlsActReg)this).new Del01();
	}

	public static MSBBL_SlsActReg.Del01 crtDel01() {
		MSBBL_SlsActReg lgc = new MSBBL_SlsActReg();
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
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Chk02_HdrR createDel01_HdrR(){
		return mcframe.serverMSBB.MSBBL1310.Chk02_HdrR.create();
	}

	/**
	 * Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Chk02_DtlR createDel01_DtlR(){
		return mcframe.serverMSBB.MSBBL1310.Chk02_DtlR.create();
	}

	/**
	 * Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> createDel01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk02_DtlR.class);
	}

	/**
	 * Del01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Chk02_IoR createDel01_IoR(){
		return mcframe.serverMSBB.MSBBL1310.Chk02_IoR.create();
	}

	/**
	 * Del01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Chk02_IoR> createDel01_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk02_IoR.class);
	}
	protected MSBBL_SlsActReg.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBBL1310_Prnt01_INFO;
		this.aPrnt01 = ((MSBBL_SlsActReg)this).new Prnt01();
	}

	public static MSBBL_SlsActReg.Prnt01 crtPrnt01() {
		MSBBL_SlsActReg lgc = new MSBBL_SlsActReg();
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
	public mcframe.serverMSBB.MSBBL1310.Prnt01_HdrR createPrnt01_HdrR(){
		return mcframe.serverMSBB.MSBBL1310.Prnt01_HdrR.create();
	}
	protected MSBBL_SlsActReg.Prnt02 aPrnt02;

	protected void initPrnt02() {
		this.info = PDef.MS_MSBBL1310_Prnt02_INFO;
		this.aPrnt02 = ((MSBBL_SlsActReg)this).new Prnt02();
	}

	public static MSBBL_SlsActReg.Prnt02 crtPrnt02() {
		MSBBL_SlsActReg lgc = new MSBBL_SlsActReg();
		lgc.initPrnt02();
		return lgc.aPrnt02;
	}

	protected void paramPrnt02(MCParam p) {
		if (this.aPrnt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt02.up0());
	}

	protected void doPrnt02() {
		aPrnt02.call();
	};

	/**
	 * Prnt02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Prnt02_HdrR createPrnt02_HdrR(){
		return mcframe.serverMSBB.MSBBL1310.Prnt02_HdrR.create();
	}
	protected MSBBL_SlsActReg.Sprt01 aSprt01;

	protected void initSprt01() {
		this.info = PDef.MS_MSBBL1310_Sprt01_INFO;
		this.aSprt01 = ((MSBBL_SlsActReg)this).new Sprt01();
	}

	public static MSBBL_SlsActReg.Sprt01 crtSprt01() {
		MSBBL_SlsActReg lgc = new MSBBL_SlsActReg();
		lgc.initSprt01();
		return lgc.aSprt01;
	}

	protected void paramSprt01(MCParam p) {
		if (this.aSprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt01.up0());
		p.addDownBlock(aSprt01.down0());
	}

	protected void doSprt01() {
		aSprt01.call();
	};

	/**
	 * Sprt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR createSprt01_DtlR(){
		return mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR.create();
	}

	/**
	 * Sprt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR> createSprt01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 売上実績情報を検索する<br>
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
		private final mcframe.serverMSBB.MSBBL1310.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1310.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> down2;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1310.Srch01_CndR.create();
			down0 = mcframe.serverMSBB.MSBBL1310.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_IoR.class);

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
			invoke((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this);
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
		public mcframe.serverMSBB.MSBBL1310.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_CndR.create();
		}

		/**
		 * Srch01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_HdrR createSrch01_HdrR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_HdrR.create();
		}

		/**
		 * Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_DtlR createSrch01_DtlR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.create();
		}

		/**
		 * Srch01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> createSrch01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.class);
		}

		/**
		 * Srch01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_IoR createSrch01_IoR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_IoR.create();
		}

		/**
		 * Srch01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> createSrch01_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>srch_tgt_no</td></tr>
		 * 	<tr><td><br></td><td>srch_tgt_rev</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Srch01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_hm</td></tr>
		 * 	<tr><td><br></td><td>dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_hm</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt_no_cost</td></tr>
		 * 	<tr><td><br></td><td>cred_bal</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prntd_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * 	<tr><td><br></td><td>iv_latest_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>trnspt_nm</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>load_port_nm</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_nm</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_port_nm</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_no</td></tr>
		 * 	<tr><td><br></td><td>lc_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bl_no</td></tr>
		 * 	<tr><td><br></td><td>bl_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>case_mrk1</td></tr>
		 * 	<tr><td><br></td><td>case_mrk2</td></tr>
		 * 	<tr><td><br></td><td>case_mrk3</td></tr>
		 * 	<tr><td><br></td><td>case_mrk4</td></tr>
		 * 	<tr><td><br></td><td>case_mrk5</td></tr>
		 * 	<tr><td><br></td><td>case_mrk6</td></tr>
		 * 	<tr><td><br></td><td>iv_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char3</td></tr>
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
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Srch01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>cost_amt</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>iv_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_acxfr_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>init_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>init_schd_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>init_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>init_trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>init_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>init_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>init_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>init_inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>init_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>init_trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>exim_xpns_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty_bef</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 売上の見積情報を検索する<br>
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
		private final mcframe.serverMSBB.MSBBL1310.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1310.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> down2;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1310.Srch01_CndR.create();
			down0 = mcframe.serverMSBB.MSBBL1310.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_IoR.class);

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
			invoke((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this);
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
		public mcframe.serverMSBB.MSBBL1310.Srch01_CndR createSrch02_CndR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_CndR.create();
		}

		/**
		 * Srch02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_HdrR createSrch02_HdrR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_HdrR.create();
		}

		/**
		 * Srch02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_DtlR createSrch02_DtlR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.create();
		}

		/**
		 * Srch02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> createSrch02_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.class);
		}

		/**
		 * Srch02_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_IoR createSrch02_IoR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_IoR.create();
		}

		/**
		 * Srch02_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> createSrch02_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>srch_tgt_no</td></tr>
		 * 	<tr><td><br></td><td>srch_tgt_rev</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Srch01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt_no_cost</td></tr>
		 * 	<tr><td><br></td><td>cred_bal</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prntd_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>valid_dt</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Srch01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>cost_amt</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>init_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>init_schd_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>init_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this).info;
		}


	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 売上の受注情報を検索する<br>
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
		private final mcframe.serverMSBB.MSBBL1310.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1310.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> down2;
		
		
		// コンストラクタ
		protected Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1310.Srch01_CndR.create();
			down0 = mcframe.serverMSBB.MSBBL1310.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_IoR.class);

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
			invoke((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_CndR createSrch03_CndR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_CndR.create();
		}

		/**
		 * Srch03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_HdrR createSrch03_HdrR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_HdrR.create();
		}

		/**
		 * Srch03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_DtlR createSrch03_DtlR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.create();
		}

		/**
		 * Srch03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> createSrch03_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.class);
		}

		/**
		 * Srch03_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_IoR createSrch03_IoR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_IoR.create();
		}

		/**
		 * Srch03_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> createSrch03_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>srch_tgt_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Srch01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_hm</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt_no_cost</td></tr>
		 * 	<tr><td><br></td><td>cred_bal</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prntd_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>valid_dt</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Srch01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>cost_amt</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_acxfr_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>init_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>init_schd_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>init_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty_bef</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this).info;
		}


	}
	/**
	 * Srch04オペレーション.<p>
	 *
	 * 納品伝票情報を検索する<br>
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
		private final mcframe.serverMSBB.MSBBL1310.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1310.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> down2;
		
		
		// コンストラクタ
		protected Srch04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1310.Srch01_CndR.create();
			down0 = mcframe.serverMSBB.MSBBL1310.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_IoR.class);

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
			invoke((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_CndR createSrch04_CndR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_CndR.create();
		}

		/**
		 * Srch04_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_HdrR createSrch04_HdrR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_HdrR.create();
		}

		/**
		 * Srch04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_DtlR createSrch04_DtlR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.create();
		}

		/**
		 * Srch04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> createSrch04_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.class);
		}

		/**
		 * Srch04_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_IoR createSrch04_IoR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_IoR.create();
		}

		/**
		 * Srch04_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> createSrch04_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>srch_tgt_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Srch01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_hm</td></tr>
		 * 	<tr><td><br></td><td>dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_hm</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt_no_cost</td></tr>
		 * 	<tr><td><br></td><td>cred_bal</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prntd_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>valid_dt</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Srch01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>cost_amt</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_acxfr_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>init_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>init_schd_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>init_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty_bef</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this).info;
		}


	}
	/**
	 * Srch05オペレーション.<p>
	 *
	 * インボイス情報（売上実績）を検索する<br>
	 */
	abstract public class Srch05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1310.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1310.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> down2;
		
		
		// コンストラクタ
		protected Srch05() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1310.Srch01_CndR.create();
			down0 = mcframe.serverMSBB.MSBBL1310.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_IoR.class);

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
			invoke((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch05_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_CndR createSrch05_CndR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_CndR.create();
		}

		/**
		 * Srch05_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_HdrR createSrch05_HdrR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_HdrR.create();
		}

		/**
		 * Srch05_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_DtlR createSrch05_DtlR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.create();
		}

		/**
		 * Srch05_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> createSrch05_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.class);
		}

		/**
		 * Srch05_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_IoR createSrch05_IoR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_IoR.create();
		}

		/**
		 * Srch05_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> createSrch05_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>srch_tgt_no</td></tr>
		 * 	<tr><td><br></td><td>srch_tgt_rev</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Srch01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_hm</td></tr>
		 * 	<tr><td><br></td><td>dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_hm</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt_no_cost</td></tr>
		 * 	<tr><td><br></td><td>cred_bal</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prntd_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * 	<tr><td><br></td><td>iv_latest_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>trnspt_nm</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>load_port_nm</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_nm</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_port_nm</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_no</td></tr>
		 * 	<tr><td><br></td><td>lc_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bl_no</td></tr>
		 * 	<tr><td><br></td><td>bl_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>case_mrk1</td></tr>
		 * 	<tr><td><br></td><td>case_mrk2</td></tr>
		 * 	<tr><td><br></td><td>case_mrk3</td></tr>
		 * 	<tr><td><br></td><td>case_mrk4</td></tr>
		 * 	<tr><td><br></td><td>case_mrk5</td></tr>
		 * 	<tr><td><br></td><td>case_mrk6</td></tr>
		 * 	<tr><td><br></td><td>iv_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char3</td></tr>
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
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Srch01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>cost_amt</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>iv_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>ext_purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_acxfr_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>init_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>init_schd_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>init_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_dtl_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>init_trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>init_trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>init_trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>init_trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>init_inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>init_tax_rate</td></tr>
		 * 	<tr><td><br></td><td>init_trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>exim_xpns_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty_bef</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this).info;
		}


	}
	/**
	 * Srch06オペレーション.<p>
	 *
	 * インボイス情報（売上予定）を検索する<br>
	 */
	abstract public class Srch06 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch06";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1310.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1310.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> down2;
		
		
		// コンストラクタ
		protected Srch06() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1310.Srch01_CndR.create();
			down0 = mcframe.serverMSBB.MSBBL1310.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_IoR.class);

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
			invoke((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch06_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_CndR createSrch06_CndR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_CndR.create();
		}

		/**
		 * Srch06_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_HdrR createSrch06_HdrR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_HdrR.create();
		}

		/**
		 * Srch06_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_DtlR createSrch06_DtlR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.create();
		}

		/**
		 * Srch06_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> createSrch06_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_DtlR.class);
		}

		/**
		 * Srch06_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_IoR createSrch06_IoR(){
			return mcframe.serverMSBB.MSBBL1310.Srch01_IoR.create();
		}

		/**
		 * Srch06_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> createSrch06_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Srch01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>srch_tgt_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Srch01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>edi_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_hm</td></tr>
		 * 	<tr><td><br></td><td>dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_hm</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt_no_cost</td></tr>
		 * 	<tr><td><br></td><td>cred_bal</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_prntd_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>xrate_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>wtax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>valid_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * 	<tr><td><br></td><td>iv_latest_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_reg_flg</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>trnspt_nm</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>load_port_nm</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_nm</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_port_nm</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_no</td></tr>
		 * 	<tr><td><br></td><td>lc_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bl_no</td></tr>
		 * 	<tr><td><br></td><td>bl_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>case_mrk1</td></tr>
		 * 	<tr><td><br></td><td>case_mrk2</td></tr>
		 * 	<tr><td><br></td><td>case_mrk3</td></tr>
		 * 	<tr><td><br></td><td>case_mrk4</td></tr>
		 * 	<tr><td><br></td><td>case_mrk5</td></tr>
		 * 	<tr><td><br></td><td>case_mrk6</td></tr>
		 * 	<tr><td><br></td><td>iv_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Srch01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1310.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>asset_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_nm</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_qty</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>cost_amt</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>iv_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_acxfr_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>init_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>init_schd_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>init_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>exim_xpns_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty_bef</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Srch01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 売上実績情報の新規登録・訂正前チェックをする<br>
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
		private final mcframe.serverMSBB.MSBBL1310.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1310.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> down2;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1310.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_IoR.class);
			down0 = mcframe.serverMSBB.MSBBL1310.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_IoR.class);

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
			invoke((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this);
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
		public mcframe.serverMSBB.MSBBL1310.Chk01_HdrR createChk01_HdrR(){
			return mcframe.serverMSBB.MSBBL1310.Chk01_HdrR.create();
		}

		/**
		 * Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk01_DtlR createChk01_DtlR(){
			return mcframe.serverMSBB.MSBBL1310.Chk01_DtlR.create();
		}

		/**
		 * Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> createChk01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR.class);
		}

		/**
		 * Chk01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk01_IoR createChk01_IoR(){
			return mcframe.serverMSBB.MSBBL1310.Chk01_IoR.create();
		}

		/**
		 * Chk01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> createChk01_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_out_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>num_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_no</td></tr>
		 * 	<tr><td><br></td><td>lc_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bl_no</td></tr>
		 * 	<tr><td><br></td><td>bl_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>case_mrk1</td></tr>
		 * 	<tr><td><br></td><td>case_mrk2</td></tr>
		 * 	<tr><td><br></td><td>case_mrk3</td></tr>
		 * 	<tr><td><br></td><td>case_mrk4</td></tr>
		 * 	<tr><td><br></td><td>case_mrk5</td></tr>
		 * 	<tr><td><br></td><td>case_mrk6</td></tr>
		 * 	<tr><td><br></td><td>iv_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>iv_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>io_peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> up2() {
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
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_out_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>cred_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_cd</td></tr>
		 * 	<tr><td><br></td><td>slo_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_aprv_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>qtn_aprv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>num_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_no</td></tr>
		 * 	<tr><td><br></td><td>lc_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bl_no</td></tr>
		 * 	<tr><td><br></td><td>bl_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>case_mrk1</td></tr>
		 * 	<tr><td><br></td><td>case_mrk2</td></tr>
		 * 	<tr><td><br></td><td>case_mrk3</td></tr>
		 * 	<tr><td><br></td><td>case_mrk4</td></tr>
		 * 	<tr><td><br></td><td>case_mrk5</td></tr>
		 * 	<tr><td><br></td><td>case_mrk6</td></tr>
		 * 	<tr><td><br></td><td>iv_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>cost_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>iv_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>old_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_sls_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_slo_trnst_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_sls_trnst_qty</td></tr>
		 * 	<tr><td><br></td><td>qtn_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>old_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>io_peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>pack_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 売上実績情報を新規登録する<br>
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
		private final mcframe.serverMSBB.MSBBL1310.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1310.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> down2;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverMSBB.MSBBL1310.MSBBL_SlsActReg.Chk01 （{@link #chk01}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBB.MSBBL1310.MSBBL_SlsActReg.Chk01}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBB.MSBBL1310.Chk01_HdrR （{@link #chk01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk01_DtlR&gt; （{@link #chk01_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk01_IoR&gt; （{@link #chk01_up2}）<br>
		 * 第1 下りブロッククラス mcframe.serverMSBB.MSBBL1310.Chk01_HdrR （{@link #chk01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk01_DtlR&gt; （{@link #chk01_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk01_IoR&gt; （{@link #chk01_down2}）<br>
		 */
		public final mcframe.serverMSBB.MSBBL1310.MSBBL_SlsActReg.Chk01 chk01;
		// 連携ロジック上り
		public final mcframe.serverMSBB.MSBBL1310.Chk01_HdrR chk01_up0;
		public final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> chk01_up1;
		public final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> chk01_up2;
		// 連携ロジック下り
		public final mcframe.serverMSBB.MSBBL1310.Chk01_HdrR chk01_down0;
		public final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> chk01_down1;
		public final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> chk01_down2;
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1310.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_IoR.class);
			down0 = mcframe.serverMSBB.MSBBL1310.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_IoR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMSBB.MSBBL1310.MSBBL_SlsActReg.crtChk01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (mcframe.serverMSBB.MSBBL1310.Chk01_HdrR)chk01.up(0);
			chk01_up1 = (MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR>)chk01.up(1);
			chk01_up2 = (MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR>)chk01.up(2);
			chk01_down0 = (mcframe.serverMSBB.MSBBL1310.Chk01_HdrR)chk01.down(0);
			chk01_down1 = (MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR>)chk01.down(1);
			chk01_down2 = (MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR>)chk01.down(2);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => mcframe.serverMSBB.MSBBL1310.Chk01_HdrR （{@link #chk01_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk01_DtlR&gt; （{@link #chk01_up1}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk01_IoR&gt; （{@link #chk01_up2}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE)) {
				up_CALL_OPE(chk01_up0, chk01_up1, chk01_up2, up0(), up1(), up2());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE<br>
		 * mcframe.serverMSBB.MSBBL1310.Chk01_HdrR（{@link #chk01_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk01_DtlR&gt;（{@link #chk01_down1}）=> down1()<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk01_IoR&gt;（{@link #chk01_down2}）=> down2()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE)) {
				down_CALL_OPE(down0(), down1(), down2(), chk01_down0, chk01_down1, chk01_down2);
			}
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
			invoke((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Ins01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk01_HdrR createIns01_HdrR(){
			return mcframe.serverMSBB.MSBBL1310.Chk01_HdrR.create();
		}

		/**
		 * Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk01_DtlR createIns01_DtlR(){
			return mcframe.serverMSBB.MSBBL1310.Chk01_DtlR.create();
		}

		/**
		 * Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> createIns01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR.class);
		}

		/**
		 * Ins01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk01_IoR createIns01_IoR(){
			return mcframe.serverMSBB.MSBBL1310.Chk01_IoR.create();
		}

		/**
		 * Ins01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> createIns01_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_out_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>num_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_no</td></tr>
		 * 	<tr><td><br></td><td>lc_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bl_no</td></tr>
		 * 	<tr><td><br></td><td>bl_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>case_mrk1</td></tr>
		 * 	<tr><td><br></td><td>case_mrk2</td></tr>
		 * 	<tr><td><br></td><td>case_mrk3</td></tr>
		 * 	<tr><td><br></td><td>case_mrk4</td></tr>
		 * 	<tr><td><br></td><td>case_mrk5</td></tr>
		 * 	<tr><td><br></td><td>case_mrk6</td></tr>
		 * 	<tr><td><br></td><td>iv_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>iv_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cred_bal</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * 	<tr><td><br></td><td>iv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(mcframe.serverMSBB.MSBBL1310.Chk01_HdrR dest0_0, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> dest0_1, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> dest0_2, mcframe.serverMSBB.MSBBL1310.Chk01_HdrR src_Ins01_Hdr, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> src_Ins01_Dtl, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> src_Ins01_Io){
			up_CALL_OPE_chk01_0(dest0_0, src_Ins01_Hdr);
			up_CALL_OPE_chk01_1(dest0_1, src_Ins01_Dtl);
			up_CALL_OPE_chk01_2(dest0_2, src_Ins01_Io);
		}
		
		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("dlv_slip_no", "dlv_slip_no");
				addColumnPathMap("ship_dlv_slip_no", "ship_dlv_slip_no");
				addColumnPathMap("ship_act_no", "ship_act_no");
				addColumnPathMap("sls_dt", "sls_dt");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("ship_tm", "ship_tm");
				addColumnPathMap("dlv_tm", "dlv_tm");
				addColumnPathMap("bill_basis_dt", "bill_basis_dt");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("iv_src_typ", "iv_src_typ");
				addColumnPathMap("sls_usr_cd", "sls_usr_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("ptax_xrate", "ptax_xrate");
				addColumnPathMap("lot_chk_off_flg", "lot_chk_off_flg");
				addColumnPathMap("qtn_no", "qtn_no");
				addColumnPathMap("qtn_rev", "qtn_rev");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("cst_po_no", "cst_po_no");
				addColumnPathMap("dlv_slip_out_flg", "dlv_slip_out_flg");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("tterm_cd1", "tterm_cd1");
				addColumnPathMap("tterm_rmrks1", "tterm_rmrks1");
				addColumnPathMap("tterm_cd2", "tterm_cd2");
				addColumnPathMap("tterm_rmrks2", "tterm_rmrks2");
				addColumnPathMap("tterm_cd3", "tterm_cd3");
				addColumnPathMap("tterm_rmrks3", "tterm_rmrks3");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("iv_mng_no", "iv_mng_no");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("num_flg", "num_flg");
				addColumnPathMap("iv_dt", "iv_dt");
				addColumnPathMap("iv_immed_prnt_flg", "iv_immed_prnt_flg");
				addColumnPathMap("iv_prnt_flg", "iv_prnt_flg");
				addColumnPathMap("pl_skip_flg", "pl_skip_flg");
				addColumnPathMap("trnspt_cd", "trnspt_cd");
				addColumnPathMap("vssl_flght", "vssl_flght");
				addColumnPathMap("load_port_cd", "load_port_cd");
				addColumnPathMap("etd_dt", "etd_dt");
				addColumnPathMap("dschrg_port_cd", "dschrg_port_cd");
				addColumnPathMap("eta_dt", "eta_dt");
				addColumnPathMap("via_port_cd", "via_port_cd");
				addColumnPathMap("via_schd_dt", "via_schd_dt");
				addColumnPathMap("iv_tterm_cd1", "iv_tterm_cd1");
				addColumnPathMap("iv_tterm_rmrks1", "iv_tterm_rmrks1");
				addColumnPathMap("iv_tterm_cd2", "iv_tterm_cd2");
				addColumnPathMap("iv_tterm_rmrks2", "iv_tterm_rmrks2");
				addColumnPathMap("iv_tterm_cd3", "iv_tterm_cd3");
				addColumnPathMap("iv_tterm_rmrks3", "iv_tterm_rmrks3");
				addColumnPathMap("rcv_schd_dt", "rcv_schd_dt");
				addColumnPathMap("lc_no", "lc_no");
				addColumnPathMap("lc_dt", "lc_dt");
				addColumnPathMap("lc_rmrks", "lc_rmrks");
				addColumnPathMap("bl_no", "bl_no");
				addColumnPathMap("bl_dt", "bl_dt");
				addColumnPathMap("bl_rmrks", "bl_rmrks");
				addColumnPathMap("iv_rmrks", "iv_rmrks");
				addColumnPathMap("case_mrk1", "case_mrk1");
				addColumnPathMap("case_mrk2", "case_mrk2");
				addColumnPathMap("case_mrk3", "case_mrk3");
				addColumnPathMap("case_mrk4", "case_mrk4");
				addColumnPathMap("case_mrk5", "case_mrk5");
				addColumnPathMap("case_mrk6", "case_mrk6");
				addColumnPathMap("iv_intr_rmrks", "iv_intr_rmrks");
				addColumnPathMap("iv_sub_char1", "iv_sub_char1");
				addColumnPathMap("iv_sub_char2", "iv_sub_char2");
				addColumnPathMap("iv_sub_char3", "iv_sub_char3");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("qtn_upd_cntr", "qtn_upd_cntr");
				addColumnPathMap("slo_upd_cntr", "slo_upd_cntr");
				addColumnPathMap("iv_upd_cntr", "iv_upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_0(mcframe.serverMSBB.MSBBL1310.Chk01_HdrR dest, mcframe.serverMSBB.MSBBL1310.Chk01_HdrR src) {
			createMap_up_CALL_OPE_chk01_0().copy(dest, src);
		}
		
		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk01_1() {
			MCRowMapper map = new Map_up_CALL_OPE_chk01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("sls_cststk_flg", "sls_cststk_flg");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("dlv_nm", "dlv_nm");
				addColumnPathMap("dlv_zip_cd", "dlv_zip_cd");
				addColumnPathMap("dlv_addr1", "dlv_addr1");
				addColumnPathMap("dlv_addr2", "dlv_addr2");
				addColumnPathMap("dlv_addr3", "dlv_addr3");
				addColumnPathMap("dlv_addr4", "dlv_addr4");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_tel", "dlv_tel");
				addColumnPathMap("dlv_fax", "dlv_fax");
				addColumnPathMap("dlv_cntry_cd", "dlv_cntry_cd");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("dest_cd1", "dest_cd1");
				addColumnPathMap("dest_cd2", "dest_cd2");
				addColumnPathMap("dest_cd3", "dest_cd3");
				addColumnPathMap("sls_usr_cd", "sls_usr_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("cntry_org_cd", "cntry_org_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("upri_not_tgt_flg", "upri_not_tgt_flg");
				addColumnPathMap("interim_flg", "interim_flg");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("dscnt_rsn_cd", "dscnt_rsn_cd");
				addColumnPathMap("tax_fix_flg", "tax_fix_flg");
				addColumnPathMap("tax_cd", "tax_cd");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("cost_upri", "cost_upri");
				addColumnPathMap("base_cur_upri", "base_cur_upri");
				addColumnPathMap("base_cur_amt", "base_cur_amt");
				addColumnPathMap("base_cur_tax_amt", "base_cur_tax_amt");
				addColumnPathMap("base_cur_dscnt_amt", "base_cur_dscnt_amt");
				addColumnPathMap("ptax_cur_upri", "ptax_cur_upri");
				addColumnPathMap("ptax_cur_amt", "ptax_cur_amt");
				addColumnPathMap("ptax_cur_tax_amt", "ptax_cur_tax_amt");
				addColumnPathMap("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt");
				addColumnPathMap("iv_upri", "iv_upri");
				addColumnPathMap("iv_amt", "iv_amt");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_cd_none_flg", "str_ln_cd_none_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("not_lot_mix_flg", "not_lot_mix_flg");
				addColumnPathMap("not_sublot_mix_flg", "not_sublot_mix_flg");
				addColumnPathMap("cst_po_d_no", "cst_po_d_no");
				addColumnPathMap("cst_itm_cd", "cst_itm_cd");
				addColumnPathMap("cst_itm_nm", "cst_itm_nm");
				addColumnPathMap("iv_itm_nm", "iv_itm_nm");
				addColumnPathMap("sls_rsn_cd", "sls_rsn_cd");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("wtax_amt", "wtax_amt");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("iv_d_rmrks", "iv_d_rmrks");
				addColumnPathMap("iv_trd_rmrks", "iv_trd_rmrks");
				addColumnPathMap("iv_trd_d_rmrks", "iv_trd_d_rmrks");
				addColumnPathMap("iv_intr_d_rmrks", "iv_intr_d_rmrks");
				addColumnPathMap("iv_sub_char1", "iv_sub_char1");
				addColumnPathMap("iv_sub_char2", "iv_sub_char2");
				addColumnPathMap("iv_sub_char3", "iv_sub_char3");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("qtn_no", "qtn_no");
				addColumnPathMap("qtn_rev", "qtn_rev");
				addColumnPathMap("qtn_d_no", "qtn_d_no");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("dlv_slip_d_no", "dlv_slip_d_no");
				addColumnPathMap("dlv_slip_d_seq", "dlv_slip_d_seq");
				addColumnPathMap("ship_dlv_slip_d_no", "ship_dlv_slip_d_no");
				addColumnPathMap("iv_d_no", "iv_d_no");
				addColumnPathMap("sls_schd_no", "sls_schd_no");
				addColumnPathMap("sls_schd_upd_cntr", "sls_schd_upd_cntr");
				addColumnPathMap("ship_pr_upd_cntr", "ship_pr_upd_cntr");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("qtn_upd_cntr", "qtn_upd_cntr");
				addColumnPathMap("slo_upd_cntr", "slo_upd_cntr");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_1(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR r_dest, mcframe.serverMSBB.MSBBL1310.Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk01_1(MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> dest, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk01_1();
			for(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR r_src : src){
				mcframe.serverMSBB.MSBBL1310.Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE_chk01の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk01_2() {
			MCRowMapper map = new Map_up_CALL_OPE_chk01_2();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("io_peg_no", "io_peg_no");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_cd_none_flg", "str_ln_cd_none_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("ship_act_d_no", "ship_act_d_no");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
				addColumnPathMap("ship_alloc_sts_no", "ship_alloc_sts_no");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_2(mcframe.serverMSBB.MSBBL1310.Chk01_IoR r_dest, mcframe.serverMSBB.MSBBL1310.Chk01_IoR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk01_2(MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> dest, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk01_2();
			for(mcframe.serverMSBB.MSBBL1310.Chk01_IoR r_src : src){
				mcframe.serverMSBB.MSBBL1310.Chk01_IoR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(mcframe.serverMSBB.MSBBL1310.Chk01_HdrR dest_Ins01_Hdr, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> dest_Ins01_Dtl, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> dest_Ins01_Io, mcframe.serverMSBB.MSBBL1310.Chk01_HdrR src0_0, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> src0_1, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> src0_2){
			down_CALL_OPE_chk01_0(dest_Ins01_Hdr, src0_0);
			down_CALL_OPE_chk01_1(dest_Ins01_Dtl, src0_1);
			down_CALL_OPE_chk01_2(dest_Ins01_Io, src0_2);
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk01_0() {
			MCRowMapper map = new Map_down_CALL_OPE_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("ac_ym", "ac_ym");
				addColumnPathMap("dlv_slip_no", "dlv_slip_no");
				addColumnPathMap("ship_dlv_slip_no", "ship_dlv_slip_no");
				addColumnPathMap("ship_act_no", "ship_act_no");
				addColumnPathMap("sls_dt", "sls_dt");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("ship_tm", "ship_tm");
				addColumnPathMap("dlv_tm", "dlv_tm");
				addColumnPathMap("bill_basis_dt", "bill_basis_dt");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("iv_src_typ", "iv_src_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("sls_usr_cd", "sls_usr_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("sls_dpt_nm", "sls_dpt_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("base_cur_cd", "base_cur_cd");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("ptax_cur_cd", "ptax_cur_cd");
				addColumnPathMap("ptax_xrate", "ptax_xrate");
				addColumnPathMap("lot_chk_off_flg", "lot_chk_off_flg");
				addColumnPathMap("qtn_no", "qtn_no");
				addColumnPathMap("qtn_rev", "qtn_rev");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("cst_po_no", "cst_po_no");
				addColumnPathMap("dlv_slip_out_flg", "dlv_slip_out_flg");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("ar_dpt_nm", "ar_dpt_nm");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("tterm_cd1", "tterm_cd1");
				addColumnPathMap("tterm_rmrks1", "tterm_rmrks1");
				addColumnPathMap("tterm_cd2", "tterm_cd2");
				addColumnPathMap("tterm_rmrks2", "tterm_rmrks2");
				addColumnPathMap("tterm_cd3", "tterm_cd3");
				addColumnPathMap("tterm_rmrks3", "tterm_rmrks3");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("sls_amt_rnd_typ", "sls_amt_rnd_typ");
				addColumnPathMap("sls_upri_rnd_typ", "sls_upri_rnd_typ");
				addColumnPathMap("sls_tax_rnd_typ", "sls_tax_rnd_typ");
				addColumnPathMap("trd_cur_amt_dec_place", "trd_cur_amt_dec_place");
				addColumnPathMap("trd_cur_upri_dec_place", "trd_cur_upri_dec_place");
				addColumnPathMap("base_cur_amt_dec_place", "base_cur_amt_dec_place");
				addColumnPathMap("base_cur_upri_dec_place", "base_cur_upri_dec_place");
				addColumnPathMap("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place");
				addColumnPathMap("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place");
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("cred_cd", "cred_cd");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("xrate_cd", "xrate_cd");
				addColumnPathMap("slo_aprv_flg", "slo_aprv_flg");
				addColumnPathMap("slo_aprv_no", "slo_aprv_no");
				addColumnPathMap("qtn_aprv_flg", "qtn_aprv_flg");
				addColumnPathMap("qtn_aprv_no", "qtn_aprv_no");
				addColumnPathMap("iv_mng_no", "iv_mng_no");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("num_flg", "num_flg");
				addColumnPathMap("iv_dt", "iv_dt");
				addColumnPathMap("iv_immed_prnt_flg", "iv_immed_prnt_flg");
				addColumnPathMap("iv_prnt_flg", "iv_prnt_flg");
				addColumnPathMap("pl_skip_flg", "pl_skip_flg");
				addColumnPathMap("trnspt_cd", "trnspt_cd");
				addColumnPathMap("vssl_flght", "vssl_flght");
				addColumnPathMap("load_port_cd", "load_port_cd");
				addColumnPathMap("etd_dt", "etd_dt");
				addColumnPathMap("dschrg_port_cd", "dschrg_port_cd");
				addColumnPathMap("eta_dt", "eta_dt");
				addColumnPathMap("via_port_cd", "via_port_cd");
				addColumnPathMap("via_schd_dt", "via_schd_dt");
				addColumnPathMap("iv_tterm_cd1", "iv_tterm_cd1");
				addColumnPathMap("iv_tterm_rmrks1", "iv_tterm_rmrks1");
				addColumnPathMap("iv_tterm_cd2", "iv_tterm_cd2");
				addColumnPathMap("iv_tterm_rmrks2", "iv_tterm_rmrks2");
				addColumnPathMap("iv_tterm_cd3", "iv_tterm_cd3");
				addColumnPathMap("iv_tterm_rmrks3", "iv_tterm_rmrks3");
				addColumnPathMap("rcv_schd_dt", "rcv_schd_dt");
				addColumnPathMap("lc_no", "lc_no");
				addColumnPathMap("lc_dt", "lc_dt");
				addColumnPathMap("lc_rmrks", "lc_rmrks");
				addColumnPathMap("bl_no", "bl_no");
				addColumnPathMap("bl_dt", "bl_dt");
				addColumnPathMap("bl_rmrks", "bl_rmrks");
				addColumnPathMap("iv_rmrks", "iv_rmrks");
				addColumnPathMap("case_mrk1", "case_mrk1");
				addColumnPathMap("case_mrk2", "case_mrk2");
				addColumnPathMap("case_mrk3", "case_mrk3");
				addColumnPathMap("case_mrk4", "case_mrk4");
				addColumnPathMap("case_mrk5", "case_mrk5");
				addColumnPathMap("case_mrk6", "case_mrk6");
				addColumnPathMap("iv_intr_rmrks", "iv_intr_rmrks");
				addColumnPathMap("iv_sub_char1", "iv_sub_char1");
				addColumnPathMap("iv_sub_char2", "iv_sub_char2");
				addColumnPathMap("iv_sub_char3", "iv_sub_char3");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("qtn_upd_cntr", "qtn_upd_cntr");
				addColumnPathMap("slo_upd_cntr", "slo_upd_cntr");
				addColumnPathMap("iv_upd_cntr", "iv_upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のRowをコピーする。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_0(mcframe.serverMSBB.MSBBL1310.Chk01_HdrR r_dest, mcframe.serverMSBB.MSBBL1310.Chk01_HdrR r_src) {
			createMap_down_CALL_OPE_chk01_0().copy(r_dest, r_src);
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk01_1() {
			MCRowMapper map = new Map_down_CALL_OPE_chk01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("sls_cststk_flg", "sls_cststk_flg");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("dlv_nm", "dlv_nm");
				addColumnPathMap("dlv_zip_cd", "dlv_zip_cd");
				addColumnPathMap("dlv_addr1", "dlv_addr1");
				addColumnPathMap("dlv_addr2", "dlv_addr2");
				addColumnPathMap("dlv_addr3", "dlv_addr3");
				addColumnPathMap("dlv_addr4", "dlv_addr4");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_tel", "dlv_tel");
				addColumnPathMap("dlv_fax", "dlv_fax");
				addColumnPathMap("dlv_cntry_cd", "dlv_cntry_cd");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("dest_cd1", "dest_cd1");
				addColumnPathMap("dest_cd2", "dest_cd2");
				addColumnPathMap("dest_cd3", "dest_cd3");
				addColumnPathMap("sls_usr_cd", "sls_usr_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("sls_dpt_nm", "sls_dpt_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("cntry_org_cd", "cntry_org_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("upri_not_tgt_flg", "upri_not_tgt_flg");
				addColumnPathMap("interim_flg", "interim_flg");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("dscnt_rsn_cd", "dscnt_rsn_cd");
				addColumnPathMap("tax_fix_flg", "tax_fix_flg");
				addColumnPathMap("tax_cd", "tax_cd");
				addColumnPathMap("tax_rate", "tax_rate");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("cost_upri", "cost_upri");
				addColumnPathMap("cost_amt", "cost_amt");
				addColumnPathMap("base_cur_upri", "base_cur_upri");
				addColumnPathMap("base_cur_amt", "base_cur_amt");
				addColumnPathMap("base_cur_inc_tax_amt", "base_cur_inc_tax_amt");
				addColumnPathMap("base_cur_tax_amt", "base_cur_tax_amt");
				addColumnPathMap("base_cur_dscnt_amt", "base_cur_dscnt_amt");
				addColumnPathMap("ptax_cur_upri", "ptax_cur_upri");
				addColumnPathMap("ptax_cur_amt", "ptax_cur_amt");
				addColumnPathMap("ptax_cur_inc_tax_amt", "ptax_cur_inc_tax_amt");
				addColumnPathMap("ptax_cur_tax_amt", "ptax_cur_tax_amt");
				addColumnPathMap("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt");
				addColumnPathMap("iv_upri", "iv_upri");
				addColumnPathMap("iv_amt", "iv_amt");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sno1_null_flg", "sno1_null_flg");
				addColumnPathMap("sno2_null_flg", "sno2_null_flg");
				addColumnPathMap("sno3_null_flg", "sno3_null_flg");
				addColumnPathMap("sno4_null_flg", "sno4_null_flg");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_cd_none_flg", "str_ln_cd_none_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("cst_po_d_no", "cst_po_d_no");
				addColumnPathMap("cst_itm_cd", "cst_itm_cd");
				addColumnPathMap("cst_itm_nm", "cst_itm_nm");
				addColumnPathMap("iv_itm_nm", "iv_itm_nm");
				addColumnPathMap("sls_rsn_cd", "sls_rsn_cd");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("bd_dpt_nm", "bd_dpt_nm");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("wtax_amt", "wtax_amt");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("ar_dpt_nm", "ar_dpt_nm");
				addColumnPathMap("iv_d_rmrks", "iv_d_rmrks");
				addColumnPathMap("iv_trd_rmrks", "iv_trd_rmrks");
				addColumnPathMap("iv_trd_d_rmrks", "iv_trd_d_rmrks");
				addColumnPathMap("iv_intr_d_rmrks", "iv_intr_d_rmrks");
				addColumnPathMap("iv_sub_char1", "iv_sub_char1");
				addColumnPathMap("iv_sub_char2", "iv_sub_char2");
				addColumnPathMap("iv_sub_char3", "iv_sub_char3");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("qtn_no", "qtn_no");
				addColumnPathMap("qtn_rev", "qtn_rev");
				addColumnPathMap("qtn_d_no", "qtn_d_no");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("dlv_slip_d_no", "dlv_slip_d_no");
				addColumnPathMap("dlv_slip_d_seq", "dlv_slip_d_seq");
				addColumnPathMap("ship_dlv_slip_d_no", "ship_dlv_slip_d_no");
				addColumnPathMap("iv_d_no", "iv_d_no");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("itm_jnl_cd", "itm_jnl_cd");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("trd_unit_dec_place", "trd_unit_dec_place");
				addColumnPathMap("trd_unit_rnd_typ", "trd_unit_rnd_typ");
				addColumnPathMap("trd_unit_conv_base_qty", "trd_unit_conv_base_qty");
				addColumnPathMap("trd_unit_conv_qty", "trd_unit_conv_qty");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_rnd_typ", "base_unit_rnd_typ");
				addColumnPathMap("str_ln_tgt_flg", "str_ln_tgt_flg");
				addColumnPathMap("inc_tax_flg", "inc_tax_flg");
				addColumnPathMap("tax_typ", "tax_typ");
				addColumnPathMap("dlv_sundry_flg", "dlv_sundry_flg");
				addColumnPathMap("old_base_unit_qty", "old_base_unit_qty");
				addColumnPathMap("sls_schd_no", "sls_schd_no");
				addColumnPathMap("sls_schd_base_unit_qty", "sls_schd_base_unit_qty");
				addColumnPathMap("base_unit_abort_qty", "base_unit_abort_qty");
				addColumnPathMap("base_unit_sls_qty", "base_unit_sls_qty");
				addColumnPathMap("base_unit_slo_trnst_qty", "base_unit_slo_trnst_qty");
				addColumnPathMap("base_unit_sls_trnst_qty", "base_unit_sls_trnst_qty");
				addColumnPathMap("qtn_base_unit_qty", "qtn_base_unit_qty");
				addColumnPathMap("dlv_slip_no", "dlv_slip_no");
				addColumnPathMap("sls_schd_upd_cntr", "sls_schd_upd_cntr");
				addColumnPathMap("ship_pr_upd_cntr", "ship_pr_upd_cntr");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("qtn_upd_cntr", "qtn_upd_cntr");
				addColumnPathMap("slo_upd_cntr", "slo_upd_cntr");
				addColumnPathMap("ship_schd_no", "ship_schd_no");
				addColumnPathMap("ship_pr_no", "ship_pr_no");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
				addColumnPathMap("dscnt_itm_flg", "dscnt_itm_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_1(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR r_dest, mcframe.serverMSBB.MSBBL1310.Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk01_1(MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> dest, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk01_1();
			for(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR r_src : src){
				mcframe.serverMSBB.MSBBL1310.Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック2のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk01_2() {
			MCRowMapper map = new Map_down_CALL_OPE_chk01_2();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("io_peg_no", "io_peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("pack_flg", "pack_flg");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_cd_none_flg", "str_ln_cd_none_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("ship_act_d_no", "ship_act_d_no");
				addColumnPathMap("trd_unit_dec_place", "trd_unit_dec_place");
				addColumnPathMap("trd_unit_conv_base_qty", "trd_unit_conv_base_qty");
				addColumnPathMap("trd_unit_conv_qty", "trd_unit_conv_qty");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_rnd_typ", "base_unit_rnd_typ");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("str_ln_tgt_flg", "str_ln_tgt_flg");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
				addColumnPathMap("ship_alloc_sts_no", "ship_alloc_sts_no");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_2(mcframe.serverMSBB.MSBBL1310.Chk01_IoR r_dest, mcframe.serverMSBB.MSBBL1310.Chk01_IoR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk01_2(MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> dest, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk01_2();
			for(mcframe.serverMSBB.MSBBL1310.Chk01_IoR r_src : src){
				mcframe.serverMSBB.MSBBL1310.Chk01_IoR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 売上実績情報を訂正する<br>
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
		private final mcframe.serverMSBB.MSBBL1310.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1310.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> down2;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverMSBB.MSBBL1310.MSBBL_SlsActReg.Chk01 （{@link #chk01}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBB.MSBBL1310.MSBBL_SlsActReg.Chk01}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBB.MSBBL1310.Chk01_HdrR （{@link #chk01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk01_DtlR&gt; （{@link #chk01_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk01_IoR&gt; （{@link #chk01_up2}）<br>
		 * 第1 下りブロッククラス mcframe.serverMSBB.MSBBL1310.Chk01_HdrR （{@link #chk01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk01_DtlR&gt; （{@link #chk01_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk01_IoR&gt; （{@link #chk01_down2}）<br>
		 */
		public final mcframe.serverMSBB.MSBBL1310.MSBBL_SlsActReg.Chk01 chk01;
		// 連携ロジック上り
		public final mcframe.serverMSBB.MSBBL1310.Chk01_HdrR chk01_up0;
		public final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> chk01_up1;
		public final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> chk01_up2;
		// 連携ロジック下り
		public final mcframe.serverMSBB.MSBBL1310.Chk01_HdrR chk01_down0;
		public final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> chk01_down1;
		public final MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> chk01_down2;
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1310.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_IoR.class);
			down0 = mcframe.serverMSBB.MSBBL1310.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_IoR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMSBB.MSBBL1310.MSBBL_SlsActReg.crtChk01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (mcframe.serverMSBB.MSBBL1310.Chk01_HdrR)chk01.up(0);
			chk01_up1 = (MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR>)chk01.up(1);
			chk01_up2 = (MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR>)chk01.up(2);
			chk01_down0 = (mcframe.serverMSBB.MSBBL1310.Chk01_HdrR)chk01.down(0);
			chk01_down1 = (MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR>)chk01.down(1);
			chk01_down2 = (MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR>)chk01.down(2);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => mcframe.serverMSBB.MSBBL1310.Chk01_HdrR （{@link #chk01_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk01_DtlR&gt; （{@link #chk01_up1}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk01_IoR&gt; （{@link #chk01_up2}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE)) {
				up_CALL_OPE(chk01_up0, chk01_up1, chk01_up2, up0(), up1(), up2());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE<br>
		 * mcframe.serverMSBB.MSBBL1310.Chk01_HdrR（{@link #chk01_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk01_DtlR&gt;（{@link #chk01_down1}）=> down1()<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk01_IoR&gt;（{@link #chk01_down2}）=> down2()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE)) {
				down_CALL_OPE(down0(), down1(), down2(), chk01_down0, chk01_down1, chk01_down2);
			}
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
			invoke((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk01_HdrR createUpd01_HdrR(){
			return mcframe.serverMSBB.MSBBL1310.Chk01_HdrR.create();
		}

		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMSBB.MSBBL1310.Chk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR.class);
		}

		/**
		 * Upd01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk01_IoR createUpd01_IoR(){
			return mcframe.serverMSBB.MSBBL1310.Chk01_IoR.create();
		}

		/**
		 * Upd01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> createUpd01_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_out_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_immed_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pl_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>trnspt_cd</td></tr>
		 * 	<tr><td><br></td><td>vssl_flght</td></tr>
		 * 	<tr><td><br></td><td>load_port_cd</td></tr>
		 * 	<tr><td><br></td><td>etd_dt</td></tr>
		 * 	<tr><td><br></td><td>dschrg_port_cd</td></tr>
		 * 	<tr><td><br></td><td>eta_dt</td></tr>
		 * 	<tr><td><br></td><td>via_port_cd</td></tr>
		 * 	<tr><td><br></td><td>via_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks1</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks2</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>iv_tterm_rmrks3</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_no</td></tr>
		 * 	<tr><td><br></td><td>lc_dt</td></tr>
		 * 	<tr><td><br></td><td>lc_rmrks</td></tr>
		 * 	<tr><td><br></td><td>bl_no</td></tr>
		 * 	<tr><td><br></td><td>bl_dt</td></tr>
		 * 	<tr><td><br></td><td>bl_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_rmrks</td></tr>
		 * 	<tr><td><br></td><td>case_mrk1</td></tr>
		 * 	<tr><td><br></td><td>case_mrk2</td></tr>
		 * 	<tr><td><br></td><td>case_mrk3</td></tr>
		 * 	<tr><td><br></td><td>case_mrk4</td></tr>
		 * 	<tr><td><br></td><td>case_mrk5</td></tr>
		 * 	<tr><td><br></td><td>case_mrk6</td></tr>
		 * 	<tr><td><br></td><td>iv_intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>dlv_cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>iv_upri</td></tr>
		 * 	<tr><td><br></td><td>iv_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>iv_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_act_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_seq</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_ym</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ship_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cred_bal</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * 	<tr><td><br></td><td>iv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(mcframe.serverMSBB.MSBBL1310.Chk01_HdrR dest0_0, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> dest0_1, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> dest0_2, mcframe.serverMSBB.MSBBL1310.Chk01_HdrR src_Upd01_Hdr, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> src_Upd01_Dtl, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> src_Upd01_Io){
			up_CALL_OPE_chk01_0(dest0_0, src_Upd01_Hdr);
			up_CALL_OPE_chk01_1(dest0_1, src_Upd01_Dtl);
			up_CALL_OPE_chk01_2(dest0_2, src_Upd01_Io);
		}
		
		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("sls_act_no", "sls_act_no");
				addColumnPathMap("sls_act_seq", "sls_act_seq");
				addColumnPathMap("ship_dlv_slip_no", "ship_dlv_slip_no");
				addColumnPathMap("ship_act_no", "ship_act_no");
				addColumnPathMap("sls_dt", "sls_dt");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("ship_tm", "ship_tm");
				addColumnPathMap("dlv_tm", "dlv_tm");
				addColumnPathMap("bill_basis_dt", "bill_basis_dt");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("iv_src_typ", "iv_src_typ");
				addColumnPathMap("sls_usr_cd", "sls_usr_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("ptax_xrate", "ptax_xrate");
				addColumnPathMap("lot_chk_off_flg", "lot_chk_off_flg");
				addColumnPathMap("qtn_no", "qtn_no");
				addColumnPathMap("qtn_rev", "qtn_rev");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("cst_po_no", "cst_po_no");
				addColumnPathMap("dlv_slip_out_flg", "dlv_slip_out_flg");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("tterm_cd1", "tterm_cd1");
				addColumnPathMap("tterm_rmrks1", "tterm_rmrks1");
				addColumnPathMap("tterm_cd2", "tterm_cd2");
				addColumnPathMap("tterm_rmrks2", "tterm_rmrks2");
				addColumnPathMap("tterm_cd3", "tterm_cd3");
				addColumnPathMap("tterm_rmrks3", "tterm_rmrks3");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("iv_mng_no", "iv_mng_no");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("iv_dt", "iv_dt");
				addColumnPathMap("iv_immed_prnt_flg", "iv_immed_prnt_flg");
				addColumnPathMap("iv_prnt_flg", "iv_prnt_flg");
				addColumnPathMap("pl_skip_flg", "pl_skip_flg");
				addColumnPathMap("trnspt_cd", "trnspt_cd");
				addColumnPathMap("vssl_flght", "vssl_flght");
				addColumnPathMap("load_port_cd", "load_port_cd");
				addColumnPathMap("etd_dt", "etd_dt");
				addColumnPathMap("dschrg_port_cd", "dschrg_port_cd");
				addColumnPathMap("eta_dt", "eta_dt");
				addColumnPathMap("via_port_cd", "via_port_cd");
				addColumnPathMap("via_schd_dt", "via_schd_dt");
				addColumnPathMap("iv_tterm_cd1", "iv_tterm_cd1");
				addColumnPathMap("iv_tterm_rmrks1", "iv_tterm_rmrks1");
				addColumnPathMap("iv_tterm_cd2", "iv_tterm_cd2");
				addColumnPathMap("iv_tterm_rmrks2", "iv_tterm_rmrks2");
				addColumnPathMap("iv_tterm_cd3", "iv_tterm_cd3");
				addColumnPathMap("iv_tterm_rmrks3", "iv_tterm_rmrks3");
				addColumnPathMap("rcv_schd_dt", "rcv_schd_dt");
				addColumnPathMap("lc_no", "lc_no");
				addColumnPathMap("lc_dt", "lc_dt");
				addColumnPathMap("lc_rmrks", "lc_rmrks");
				addColumnPathMap("bl_no", "bl_no");
				addColumnPathMap("bl_dt", "bl_dt");
				addColumnPathMap("bl_rmrks", "bl_rmrks");
				addColumnPathMap("iv_rmrks", "iv_rmrks");
				addColumnPathMap("case_mrk1", "case_mrk1");
				addColumnPathMap("case_mrk2", "case_mrk2");
				addColumnPathMap("case_mrk3", "case_mrk3");
				addColumnPathMap("case_mrk4", "case_mrk4");
				addColumnPathMap("case_mrk5", "case_mrk5");
				addColumnPathMap("case_mrk6", "case_mrk6");
				addColumnPathMap("iv_intr_rmrks", "iv_intr_rmrks");
				addColumnPathMap("iv_sub_char1", "iv_sub_char1");
				addColumnPathMap("iv_sub_char2", "iv_sub_char2");
				addColumnPathMap("iv_sub_char3", "iv_sub_char3");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("qtn_upd_cntr", "qtn_upd_cntr");
				addColumnPathMap("slo_upd_cntr", "slo_upd_cntr");
				addColumnPathMap("iv_upd_cntr", "iv_upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_0(mcframe.serverMSBB.MSBBL1310.Chk01_HdrR dest, mcframe.serverMSBB.MSBBL1310.Chk01_HdrR src) {
			createMap_up_CALL_OPE_chk01_0().copy(dest, src);
		}
		
		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk01_1() {
			MCRowMapper map = new Map_up_CALL_OPE_chk01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("sls_cststk_flg", "sls_cststk_flg");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("dlv_nm", "dlv_nm");
				addColumnPathMap("dlv_zip_cd", "dlv_zip_cd");
				addColumnPathMap("dlv_addr1", "dlv_addr1");
				addColumnPathMap("dlv_addr2", "dlv_addr2");
				addColumnPathMap("dlv_addr3", "dlv_addr3");
				addColumnPathMap("dlv_addr4", "dlv_addr4");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_tel", "dlv_tel");
				addColumnPathMap("dlv_fax", "dlv_fax");
				addColumnPathMap("dlv_cntry_cd", "dlv_cntry_cd");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("dest_cd1", "dest_cd1");
				addColumnPathMap("dest_cd2", "dest_cd2");
				addColumnPathMap("dest_cd3", "dest_cd3");
				addColumnPathMap("sls_usr_cd", "sls_usr_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("cntry_org_cd", "cntry_org_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("upri_not_tgt_flg", "upri_not_tgt_flg");
				addColumnPathMap("interim_flg", "interim_flg");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("dscnt_rsn_cd", "dscnt_rsn_cd");
				addColumnPathMap("tax_fix_flg", "tax_fix_flg");
				addColumnPathMap("tax_cd", "tax_cd");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("cost_upri", "cost_upri");
				addColumnPathMap("base_cur_upri", "base_cur_upri");
				addColumnPathMap("base_cur_amt", "base_cur_amt");
				addColumnPathMap("base_cur_tax_amt", "base_cur_tax_amt");
				addColumnPathMap("base_cur_dscnt_amt", "base_cur_dscnt_amt");
				addColumnPathMap("ptax_cur_upri", "ptax_cur_upri");
				addColumnPathMap("ptax_cur_amt", "ptax_cur_amt");
				addColumnPathMap("ptax_cur_tax_amt", "ptax_cur_tax_amt");
				addColumnPathMap("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt");
				addColumnPathMap("iv_upri", "iv_upri");
				addColumnPathMap("iv_amt", "iv_amt");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_cd_none_flg", "str_ln_cd_none_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("not_lot_mix_flg", "not_lot_mix_flg");
				addColumnPathMap("not_sublot_mix_flg", "not_sublot_mix_flg");
				addColumnPathMap("cst_po_d_no", "cst_po_d_no");
				addColumnPathMap("cst_itm_cd", "cst_itm_cd");
				addColumnPathMap("cst_itm_nm", "cst_itm_nm");
				addColumnPathMap("iv_itm_nm", "iv_itm_nm");
				addColumnPathMap("sls_rsn_cd", "sls_rsn_cd");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("wtax_amt", "wtax_amt");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("iv_d_rmrks", "iv_d_rmrks");
				addColumnPathMap("iv_trd_rmrks", "iv_trd_rmrks");
				addColumnPathMap("iv_trd_d_rmrks", "iv_trd_d_rmrks");
				addColumnPathMap("iv_intr_d_rmrks", "iv_intr_d_rmrks");
				addColumnPathMap("iv_sub_char1", "iv_sub_char1");
				addColumnPathMap("iv_sub_char2", "iv_sub_char2");
				addColumnPathMap("iv_sub_char3", "iv_sub_char3");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("qtn_no", "qtn_no");
				addColumnPathMap("qtn_rev", "qtn_rev");
				addColumnPathMap("qtn_d_no", "qtn_d_no");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("dlv_slip_d_no", "dlv_slip_d_no");
				addColumnPathMap("dlv_slip_d_seq", "dlv_slip_d_seq");
				addColumnPathMap("ship_act_no", "ship_act_no");
				addColumnPathMap("ship_dlv_slip_d_no", "ship_dlv_slip_d_no");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("iv_d_no", "iv_d_no");
				addColumnPathMap("sls_act_no", "sls_act_no");
				addColumnPathMap("sls_act_seq", "sls_act_seq");
				addColumnPathMap("sls_act_rev", "sls_act_rev");
				addColumnPathMap("sls_act_d_seq", "sls_act_d_seq");
				addColumnPathMap("sls_schd_no", "sls_schd_no");
				addColumnPathMap("sls_schd_upd_cntr", "sls_schd_upd_cntr");
				addColumnPathMap("ship_pr_upd_cntr", "ship_pr_upd_cntr");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("qtn_upd_cntr", "qtn_upd_cntr");
				addColumnPathMap("slo_upd_cntr", "slo_upd_cntr");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_1(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR r_dest, mcframe.serverMSBB.MSBBL1310.Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk01_1(MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> dest, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk01_1();
			for(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR r_src : src){
				mcframe.serverMSBB.MSBBL1310.Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE_chk01の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk01_2() {
			MCRowMapper map = new Map_up_CALL_OPE_chk01_2();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("io_peg_no", "io_peg_no");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_cd_none_flg", "str_ln_cd_none_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("ship_act_d_no", "ship_act_d_no");
				addColumnPathMap("sls_act_io_no", "sls_act_io_no");
				addColumnPathMap("sls_act_no", "sls_act_no");
				addColumnPathMap("sls_act_seq", "sls_act_seq");
				addColumnPathMap("sls_act_d_seq", "sls_act_d_seq");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("sls_act_io_seq", "sls_act_io_seq");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
				addColumnPathMap("iv_d_no", "iv_d_no");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_2(mcframe.serverMSBB.MSBBL1310.Chk01_IoR r_dest, mcframe.serverMSBB.MSBBL1310.Chk01_IoR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk01_2(MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> dest, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk01_2();
			for(mcframe.serverMSBB.MSBBL1310.Chk01_IoR r_src : src){
				mcframe.serverMSBB.MSBBL1310.Chk01_IoR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(mcframe.serverMSBB.MSBBL1310.Chk01_HdrR dest_Upd01_Hdr, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> dest_Upd01_Dtl, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> dest_Upd01_Io, mcframe.serverMSBB.MSBBL1310.Chk01_HdrR src0_0, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> src0_1, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> src0_2){
			down_CALL_OPE_chk01_0(dest_Upd01_Hdr, src0_0);
			down_CALL_OPE_chk01_1(dest_Upd01_Dtl, src0_1);
			down_CALL_OPE_chk01_2(dest_Upd01_Io, src0_2);
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk01_0() {
			MCRowMapper map = new Map_down_CALL_OPE_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("ac_ym", "ac_ym");
				addColumnPathMap("sls_act_no", "sls_act_no");
				addColumnPathMap("sls_act_seq", "sls_act_seq");
				addColumnPathMap("sls_act_rev", "sls_act_rev");
				addColumnPathMap("dlv_slip_no", "dlv_slip_no");
				addColumnPathMap("ship_dlv_slip_no", "ship_dlv_slip_no");
				addColumnPathMap("ship_act_no", "ship_act_no");
				addColumnPathMap("sls_dt", "sls_dt");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("ship_tm", "ship_tm");
				addColumnPathMap("dlv_tm", "dlv_tm");
				addColumnPathMap("bill_basis_dt", "bill_basis_dt");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("iv_src_typ", "iv_src_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("sls_usr_cd", "sls_usr_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("sls_dpt_nm", "sls_dpt_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("base_cur_cd", "base_cur_cd");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("ptax_cur_cd", "ptax_cur_cd");
				addColumnPathMap("ptax_xrate", "ptax_xrate");
				addColumnPathMap("lot_chk_off_flg", "lot_chk_off_flg");
				addColumnPathMap("qtn_no", "qtn_no");
				addColumnPathMap("qtn_rev", "qtn_rev");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("cst_po_no", "cst_po_no");
				addColumnPathMap("dlv_slip_out_flg", "dlv_slip_out_flg");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("ar_dpt_nm", "ar_dpt_nm");
				addColumnPathMap("trd_rmrks", "trd_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("tterm_cd1", "tterm_cd1");
				addColumnPathMap("tterm_rmrks1", "tterm_rmrks1");
				addColumnPathMap("tterm_cd2", "tterm_cd2");
				addColumnPathMap("tterm_rmrks2", "tterm_rmrks2");
				addColumnPathMap("tterm_cd3", "tterm_cd3");
				addColumnPathMap("tterm_rmrks3", "tterm_rmrks3");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("sls_amt_rnd_typ", "sls_amt_rnd_typ");
				addColumnPathMap("sls_upri_rnd_typ", "sls_upri_rnd_typ");
				addColumnPathMap("sls_tax_rnd_typ", "sls_tax_rnd_typ");
				addColumnPathMap("trd_cur_amt_dec_place", "trd_cur_amt_dec_place");
				addColumnPathMap("trd_cur_upri_dec_place", "trd_cur_upri_dec_place");
				addColumnPathMap("base_cur_amt_dec_place", "base_cur_amt_dec_place");
				addColumnPathMap("base_cur_upri_dec_place", "base_cur_upri_dec_place");
				addColumnPathMap("ptax_cur_amt_dec_place", "ptax_cur_amt_dec_place");
				addColumnPathMap("ptax_cur_upri_dec_place", "ptax_cur_upri_dec_place");
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("cred_cd", "cred_cd");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("xrate_cd", "xrate_cd");
				addColumnPathMap("slo_aprv_flg", "slo_aprv_flg");
				addColumnPathMap("slo_aprv_no", "slo_aprv_no");
				addColumnPathMap("qtn_aprv_flg", "qtn_aprv_flg");
				addColumnPathMap("qtn_aprv_no", "qtn_aprv_no");
				addColumnPathMap("iv_mng_no", "iv_mng_no");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("iv_dt", "iv_dt");
				addColumnPathMap("iv_immed_prnt_flg", "iv_immed_prnt_flg");
				addColumnPathMap("iv_prnt_flg", "iv_prnt_flg");
				addColumnPathMap("pl_skip_flg", "pl_skip_flg");
				addColumnPathMap("trnspt_cd", "trnspt_cd");
				addColumnPathMap("vssl_flght", "vssl_flght");
				addColumnPathMap("load_port_cd", "load_port_cd");
				addColumnPathMap("etd_dt", "etd_dt");
				addColumnPathMap("dschrg_port_cd", "dschrg_port_cd");
				addColumnPathMap("eta_dt", "eta_dt");
				addColumnPathMap("via_port_cd", "via_port_cd");
				addColumnPathMap("via_schd_dt", "via_schd_dt");
				addColumnPathMap("iv_tterm_cd1", "iv_tterm_cd1");
				addColumnPathMap("iv_tterm_rmrks1", "iv_tterm_rmrks1");
				addColumnPathMap("iv_tterm_cd2", "iv_tterm_cd2");
				addColumnPathMap("iv_tterm_rmrks2", "iv_tterm_rmrks2");
				addColumnPathMap("iv_tterm_cd3", "iv_tterm_cd3");
				addColumnPathMap("iv_tterm_rmrks3", "iv_tterm_rmrks3");
				addColumnPathMap("rcv_schd_dt", "rcv_schd_dt");
				addColumnPathMap("lc_no", "lc_no");
				addColumnPathMap("lc_dt", "lc_dt");
				addColumnPathMap("lc_rmrks", "lc_rmrks");
				addColumnPathMap("bl_no", "bl_no");
				addColumnPathMap("bl_dt", "bl_dt");
				addColumnPathMap("bl_rmrks", "bl_rmrks");
				addColumnPathMap("iv_rmrks", "iv_rmrks");
				addColumnPathMap("case_mrk1", "case_mrk1");
				addColumnPathMap("case_mrk2", "case_mrk2");
				addColumnPathMap("case_mrk3", "case_mrk3");
				addColumnPathMap("case_mrk4", "case_mrk4");
				addColumnPathMap("case_mrk5", "case_mrk5");
				addColumnPathMap("case_mrk6", "case_mrk6");
				addColumnPathMap("iv_intr_rmrks", "iv_intr_rmrks");
				addColumnPathMap("iv_sub_char1", "iv_sub_char1");
				addColumnPathMap("iv_sub_char2", "iv_sub_char2");
				addColumnPathMap("iv_sub_char3", "iv_sub_char3");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("qtn_upd_cntr", "qtn_upd_cntr");
				addColumnPathMap("slo_upd_cntr", "slo_upd_cntr");
				addColumnPathMap("iv_upd_cntr", "iv_upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のRowをコピーする。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_0(mcframe.serverMSBB.MSBBL1310.Chk01_HdrR r_dest, mcframe.serverMSBB.MSBBL1310.Chk01_HdrR r_src) {
			createMap_down_CALL_OPE_chk01_0().copy(r_dest, r_src);
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk01_1() {
			MCRowMapper map = new Map_down_CALL_OPE_chk01_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("sls_cststk_flg", "sls_cststk_flg");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("dlv_nm", "dlv_nm");
				addColumnPathMap("dlv_zip_cd", "dlv_zip_cd");
				addColumnPathMap("dlv_addr1", "dlv_addr1");
				addColumnPathMap("dlv_addr2", "dlv_addr2");
				addColumnPathMap("dlv_addr3", "dlv_addr3");
				addColumnPathMap("dlv_addr4", "dlv_addr4");
				addColumnPathMap("dlv_cntct_dpt", "dlv_cntct_dpt");
				addColumnPathMap("dlv_cntct_psn", "dlv_cntct_psn");
				addColumnPathMap("dlv_tel", "dlv_tel");
				addColumnPathMap("dlv_fax", "dlv_fax");
				addColumnPathMap("dlv_cntry_cd", "dlv_cntry_cd");
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("dest_cd1", "dest_cd1");
				addColumnPathMap("dest_cd2", "dest_cd2");
				addColumnPathMap("dest_cd3", "dest_cd3");
				addColumnPathMap("sls_usr_cd", "sls_usr_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("sls_dpt_nm", "sls_dpt_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("cntry_org_cd", "cntry_org_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("upri_not_tgt_flg", "upri_not_tgt_flg");
				addColumnPathMap("interim_flg", "interim_flg");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("dscnt_rsn_cd", "dscnt_rsn_cd");
				addColumnPathMap("tax_fix_flg", "tax_fix_flg");
				addColumnPathMap("tax_cd", "tax_cd");
				addColumnPathMap("tax_rate", "tax_rate");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("cost_upri", "cost_upri");
				addColumnPathMap("cost_amt", "cost_amt");
				addColumnPathMap("base_cur_upri", "base_cur_upri");
				addColumnPathMap("base_cur_amt", "base_cur_amt");
				addColumnPathMap("base_cur_inc_tax_amt", "base_cur_inc_tax_amt");
				addColumnPathMap("base_cur_tax_amt", "base_cur_tax_amt");
				addColumnPathMap("base_cur_dscnt_amt", "base_cur_dscnt_amt");
				addColumnPathMap("ptax_cur_upri", "ptax_cur_upri");
				addColumnPathMap("ptax_cur_amt", "ptax_cur_amt");
				addColumnPathMap("ptax_cur_inc_tax_amt", "ptax_cur_inc_tax_amt");
				addColumnPathMap("ptax_cur_tax_amt", "ptax_cur_tax_amt");
				addColumnPathMap("ptax_cur_dscnt_amt", "ptax_cur_dscnt_amt");
				addColumnPathMap("iv_upri", "iv_upri");
				addColumnPathMap("iv_amt", "iv_amt");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_cd_none_flg", "str_ln_cd_none_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("cst_po_d_no", "cst_po_d_no");
				addColumnPathMap("cst_itm_cd", "cst_itm_cd");
				addColumnPathMap("cst_itm_nm", "cst_itm_nm");
				addColumnPathMap("iv_itm_nm", "iv_itm_nm");
				addColumnPathMap("sls_rsn_cd", "sls_rsn_cd");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("bd_dpt_nm", "bd_dpt_nm");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("wtax_amt", "wtax_amt");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("ar_dpt_nm", "ar_dpt_nm");
				addColumnPathMap("iv_d_rmrks", "iv_d_rmrks");
				addColumnPathMap("iv_trd_rmrks", "iv_trd_rmrks");
				addColumnPathMap("iv_trd_d_rmrks", "iv_trd_d_rmrks");
				addColumnPathMap("iv_intr_d_rmrks", "iv_intr_d_rmrks");
				addColumnPathMap("iv_sub_char1", "iv_sub_char1");
				addColumnPathMap("iv_sub_char2", "iv_sub_char2");
				addColumnPathMap("iv_sub_char3", "iv_sub_char3");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("qtn_no", "qtn_no");
				addColumnPathMap("qtn_rev", "qtn_rev");
				addColumnPathMap("qtn_d_no", "qtn_d_no");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("dlv_slip_d_no", "dlv_slip_d_no");
				addColumnPathMap("dlv_slip_d_seq", "dlv_slip_d_seq");
				addColumnPathMap("ship_act_no", "ship_act_no");
				addColumnPathMap("ship_dlv_slip_d_no", "ship_dlv_slip_d_no");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("iv_d_no", "iv_d_no");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("itm_jnl_cd", "itm_jnl_cd");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("trd_unit_dec_place", "trd_unit_dec_place");
				addColumnPathMap("trd_unit_rnd_typ", "trd_unit_rnd_typ");
				addColumnPathMap("trd_unit_conv_base_qty", "trd_unit_conv_base_qty");
				addColumnPathMap("trd_unit_conv_qty", "trd_unit_conv_qty");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_rnd_typ", "base_unit_rnd_typ");
				addColumnPathMap("str_ln_tgt_flg", "str_ln_tgt_flg");
				addColumnPathMap("inc_tax_flg", "inc_tax_flg");
				addColumnPathMap("tax_typ", "tax_typ");
				addColumnPathMap("dlv_sundry_flg", "dlv_sundry_flg");
				addColumnPathMap("sls_act_no", "sls_act_no");
				addColumnPathMap("sls_act_seq", "sls_act_seq");
				addColumnPathMap("sls_act_rev", "sls_act_rev");
				addColumnPathMap("sls_act_d_seq", "sls_act_d_seq");
				addColumnPathMap("old_base_unit_qty", "old_base_unit_qty");
				addColumnPathMap("sls_schd_no", "sls_schd_no");
				addColumnPathMap("sls_schd_base_unit_qty", "sls_schd_base_unit_qty");
				addColumnPathMap("base_unit_abort_qty", "base_unit_abort_qty");
				addColumnPathMap("base_unit_sls_qty", "base_unit_sls_qty");
				addColumnPathMap("base_unit_slo_trnst_qty", "base_unit_slo_trnst_qty");
				addColumnPathMap("base_unit_sls_trnst_qty", "base_unit_sls_trnst_qty");
				addColumnPathMap("qtn_base_unit_qty", "qtn_base_unit_qty");
				addColumnPathMap("dlv_slip_no", "dlv_slip_no");
				addColumnPathMap("sls_schd_upd_cntr", "sls_schd_upd_cntr");
				addColumnPathMap("ship_pr_upd_cntr", "ship_pr_upd_cntr");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("qtn_upd_cntr", "qtn_upd_cntr");
				addColumnPathMap("slo_upd_cntr", "slo_upd_cntr");
				addColumnPathMap("ship_schd_no", "ship_schd_no");
				addColumnPathMap("ship_pr_no", "ship_pr_no");
				addColumnPathMap("old_abort_flg", "old_abort_flg");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
				addColumnPathMap("dscnt_itm_flg", "dscnt_itm_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_1(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR r_dest, mcframe.serverMSBB.MSBBL1310.Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk01_1(MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> dest, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk01_1();
			for(mcframe.serverMSBB.MSBBL1310.Chk01_DtlR r_src : src){
				mcframe.serverMSBB.MSBBL1310.Chk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック2のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk01_2() {
			MCRowMapper map = new Map_down_CALL_OPE_chk01_2();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk01_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("io_peg_no", "io_peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("pack_flg", "pack_flg");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_cd_none_flg", "str_ln_cd_none_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("ship_act_d_no", "ship_act_d_no");
				addColumnPathMap("sls_act_io_no", "sls_act_io_no");
				addColumnPathMap("trd_unit_dec_place", "trd_unit_dec_place");
				addColumnPathMap("trd_unit_conv_base_qty", "trd_unit_conv_base_qty");
				addColumnPathMap("trd_unit_conv_qty", "trd_unit_conv_qty");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_rnd_typ", "base_unit_rnd_typ");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("lot_mng_typ", "lot_mng_typ");
				addColumnPathMap("sublot_mng_typ", "sublot_mng_typ");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("str_ln_tgt_flg", "str_ln_tgt_flg");
				addColumnPathMap("sls_act_no", "sls_act_no");
				addColumnPathMap("sls_act_seq", "sls_act_seq");
				addColumnPathMap("sls_act_d_seq", "sls_act_d_seq");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("sls_act_io_seq", "sls_act_io_seq");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
				addColumnPathMap("iv_d_no", "iv_d_no");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_2(mcframe.serverMSBB.MSBBL1310.Chk01_IoR r_dest, mcframe.serverMSBB.MSBBL1310.Chk01_IoR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk01_2(MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> dest, MCList<mcframe.serverMSBB.MSBBL1310.Chk01_IoR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk01_2();
			for(mcframe.serverMSBB.MSBBL1310.Chk01_IoR r_src : src){
				mcframe.serverMSBB.MSBBL1310.Chk01_IoR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 売上実績情報の取消前チェックをする<br>
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
		private final mcframe.serverMSBB.MSBBL1310.Chk02_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1310.Chk02_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Chk02_IoR> down2;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1310.Chk02_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL1310.Chk02_DtlR.class);
			down0 = mcframe.serverMSBB.MSBBL1310.Chk02_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1310.Chk02_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1310.Chk02_IoR.class);

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
			if (i == 2) return down2();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this);
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
		public mcframe.serverMSBB.MSBBL1310.Chk02_HdrR createChk02_HdrR(){
			return mcframe.serverMSBB.MSBBL1310.Chk02_HdrR.create();
		}

		/**
		 * Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk02_DtlR createChk02_DtlR(){
			return mcframe.serverMSBB.MSBBL1310.Chk02_DtlR.create();
		}

		/**
		 * Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> createChk02_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk02_DtlR.class);
		}

		/**
		 * Chk02_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk02_IoR createChk02_IoR(){
			return mcframe.serverMSBB.MSBBL1310.Chk02_IoR.create();
		}

		/**
		 * Chk02_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk02_IoR> createChk02_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk02_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_out_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Chk02_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk02_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> up1() {
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
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_rev</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>qtn_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_rev</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>slo_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>slo_aprv_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>qtn_aprv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_out_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Chk02_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk02_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>qtn_d_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_peg_no</td></tr>
		 * 	<tr><td><br></td><td>io_peg_no</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_io_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk02_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 売上実績情報を取り消す<br>
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
		private final mcframe.serverMSBB.MSBBL1310.Chk02_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> up1;
		/** [Del01_Dtl]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> aDel01_Dtl;
		/** [Del01_Hdr]ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1310.Chk02_HdrR aDel01_Hdr;
		/** [Del01_Io]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Chk02_IoR> aDel01_Io;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverMSBB.MSBBL1310.MSBBL_SlsActReg.Chk02 （{@link #chk02}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBB.MSBBL1310.MSBBL_SlsActReg.Chk02}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBB.MSBBL1310.Chk02_HdrR （{@link #chk02_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk02_DtlR&gt; （{@link #chk02_up1}）<br>
		 * 第1 下りブロッククラス mcframe.serverMSBB.MSBBL1310.Chk02_HdrR （{@link #chk02_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk02_DtlR&gt; （{@link #chk02_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk02_IoR&gt; （{@link #chk02_down2}）<br>
		 */
		public final mcframe.serverMSBB.MSBBL1310.MSBBL_SlsActReg.Chk02 chk02;
		// 連携ロジック上り
		public final mcframe.serverMSBB.MSBBL1310.Chk02_HdrR chk02_up0;
		public final MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> chk02_up1;
		// 連携ロジック下り
		public final mcframe.serverMSBB.MSBBL1310.Chk02_HdrR chk02_down0;
		public final MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> chk02_down1;
		public final MCList<mcframe.serverMSBB.MSBBL1310.Chk02_IoR> chk02_down2;
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1310.Chk02_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL1310.Chk02_DtlR.class);
			aDel01_Dtl = MCList.create(mcframe.serverMSBB.MSBBL1310.Chk02_DtlR.class);
			aDel01_Hdr = mcframe.serverMSBB.MSBBL1310.Chk02_HdrR.create();
			aDel01_Io = MCList.create(mcframe.serverMSBB.MSBBL1310.Chk02_IoR.class);

			// 連携オペレーションの初期化
			chk02 = mcframe.serverMSBB.MSBBL1310.MSBBL_SlsActReg.crtChk02();
			
			// 連携オペレーションのコンテナ取得
			chk02_up0 = (mcframe.serverMSBB.MSBBL1310.Chk02_HdrR)chk02.up(0);
			chk02_up1 = (MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR>)chk02.up(1);
			chk02_down0 = (mcframe.serverMSBB.MSBBL1310.Chk02_HdrR)chk02.down(0);
			chk02_down1 = (MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR>)chk02.down(1);
			chk02_down2 = (MCList<mcframe.serverMSBB.MSBBL1310.Chk02_IoR>)chk02.down(2);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, chk02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => mcframe.serverMSBB.MSBBL1310.Chk02_HdrR （{@link #chk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk02_DtlR&gt; （{@link #chk02_up1}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE)) {
				up_CALL_OPE(chk02_up0, chk02_up1, up0(), up1());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE<br>
		 * mcframe.serverMSBB.MSBBL1310.Chk02_HdrR（{@link #chk02_down0}）=> aDel01_Hdr<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk02_DtlR&gt;（{@link #chk02_down1}）=> aDel01_Dtl<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1310.Chk02_IoR&gt;（{@link #chk02_down2}）=> aDel01_Io<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE)) {
				down_CALL_OPE(aDel01_Hdr, aDel01_Dtl, aDel01_Io, chk02_down0, chk02_down1, chk02_down2);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk02_HdrR createDel01_HdrR(){
			return mcframe.serverMSBB.MSBBL1310.Chk02_HdrR.create();
		}

		/**
		 * Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk02_DtlR createDel01_DtlR(){
			return mcframe.serverMSBB.MSBBL1310.Chk02_DtlR.create();
		}

		/**
		 * Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> createDel01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk02_DtlR.class);
		}

		/**
		 * Del01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk02_IoR createDel01_IoR(){
			return mcframe.serverMSBB.MSBBL1310.Chk02_IoR.create();
		}

		/**
		 * Del01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk02_IoR> createDel01_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Chk02_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>can_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_src_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_out_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>iv_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Chk02_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk02_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sls_schd_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>qtn_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>slo_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> up1() {
			return up1;
		}



		/**
		 * [Del01_Dtl]ブロックのコンテナaDel01_DtlLを返します。
		 *
		 * @return Del01_DtlL
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> Del01_Dtl() {
			return aDel01_Dtl;
		}

		/**
		 * [Del01_Hdr]ブロックのコンテナaDel01_HdrRを返します。
		 *
		 * @return Del01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1310.Chk02_HdrR Del01_Hdr() {
			return aDel01_Hdr;
		}

		/**
		 * [Del01_Io]ブロックのコンテナaDel01_IoLを返します。
		 *
		 * @return Del01_IoL
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Chk02_IoR> Del01_Io() {
			return aDel01_Io;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(mcframe.serverMSBB.MSBBL1310.Chk02_HdrR dest0_0, MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> dest0_1, mcframe.serverMSBB.MSBBL1310.Chk02_HdrR src_Del01_Hdr, MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> src_Del01_Dtl){
			up_CALL_OPE_chk02_0(dest0_0, src_Del01_Hdr);
			up_CALL_OPE_chk02_1(dest0_1, src_Del01_Dtl);
		}
		
		/**
		 * 連携処理CALL_OPE_chk02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk02_0() {
			MCRowMapper map = new Map_up_CALL_OPE_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("sls_act_no", "sls_act_no");
				addColumnPathMap("sls_act_seq", "sls_act_seq");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("iv_src_typ", "iv_src_typ");
				addColumnPathMap("iv_mng_no", "iv_mng_no");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("iv_dt", "iv_dt");
				addColumnPathMap("dlv_slip_out_flg", "dlv_slip_out_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("qtn_upd_cntr", "qtn_upd_cntr");
				addColumnPathMap("slo_upd_cntr", "slo_upd_cntr");
				addColumnPathMap("iv_upd_cntr", "iv_upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE_chk02_0(mcframe.serverMSBB.MSBBL1310.Chk02_HdrR dest, mcframe.serverMSBB.MSBBL1310.Chk02_HdrR src) {
			createMap_up_CALL_OPE_chk02_0().copy(dest, src);
		}
		
		/**
		 * 連携処理CALL_OPE_chk02の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk02_1() {
			MCRowMapper map = new Map_up_CALL_OPE_chk02_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk02の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk02_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("sls_act_no", "sls_act_no");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("sls_act_d_seq", "sls_act_d_seq");
				addColumnPathMap("sls_schd_no", "sls_schd_no");
				addColumnPathMap("sls_schd_upd_cntr", "sls_schd_upd_cntr");
				addColumnPathMap("ship_pr_upd_cntr", "ship_pr_upd_cntr");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("qtn_upd_cntr", "qtn_upd_cntr");
				addColumnPathMap("slo_upd_cntr", "slo_upd_cntr");
				addColumnPathMap("iv_d_no", "iv_d_no");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk02_1(mcframe.serverMSBB.MSBBL1310.Chk02_DtlR r_dest, mcframe.serverMSBB.MSBBL1310.Chk02_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk02の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk02_1(MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> dest, MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk02_1();
			for(mcframe.serverMSBB.MSBBL1310.Chk02_DtlR r_src : src){
				mcframe.serverMSBB.MSBBL1310.Chk02_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk02_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(mcframe.serverMSBB.MSBBL1310.Chk02_HdrR dest_Del01_Hdr, MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> dest_Del01_Dtl, MCList<mcframe.serverMSBB.MSBBL1310.Chk02_IoR> dest_Del01_Io, mcframe.serverMSBB.MSBBL1310.Chk02_HdrR src0_0, MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> src0_1, MCList<mcframe.serverMSBB.MSBBL1310.Chk02_IoR> src0_2){
			down_CALL_OPE_chk02_0(dest_Del01_Hdr, src0_0);
			down_CALL_OPE_chk02_1(dest_Del01_Dtl, src0_1);
			down_CALL_OPE_chk02_2(dest_Del01_Io, src0_2);
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk02_0() {
			MCRowMapper map = new Map_down_CALL_OPE_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("sls_act_no", "sls_act_no");
				addColumnPathMap("sls_act_seq", "sls_act_seq");
				addColumnPathMap("sls_act_rev", "sls_act_rev");
				addColumnPathMap("can_ac_dt", "can_ac_dt");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("iv_src_typ", "iv_src_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("qtn_no", "qtn_no");
				addColumnPathMap("qtn_rev", "qtn_rev");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("sls_amt_rnd_typ", "sls_amt_rnd_typ");
				addColumnPathMap("sls_upri_rnd_typ", "sls_upri_rnd_typ");
				addColumnPathMap("trd_cur_amt_dec_place", "trd_cur_amt_dec_place");
				addColumnPathMap("slo_aprv_flg", "slo_aprv_flg");
				addColumnPathMap("slo_aprv_no", "slo_aprv_no");
				addColumnPathMap("qtn_aprv_flg", "qtn_aprv_flg");
				addColumnPathMap("qtn_aprv_no", "qtn_aprv_no");
				addColumnPathMap("iv_mng_no", "iv_mng_no");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("iv_dt", "iv_dt");
				addColumnPathMap("dlv_slip_out_flg", "dlv_slip_out_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("qtn_upd_cntr", "qtn_upd_cntr");
				addColumnPathMap("slo_upd_cntr", "slo_upd_cntr");
				addColumnPathMap("iv_upd_cntr", "iv_upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック0のRowをコピーする。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk02_0(mcframe.serverMSBB.MSBBL1310.Chk02_HdrR r_dest, mcframe.serverMSBB.MSBBL1310.Chk02_HdrR r_src) {
			createMap_down_CALL_OPE_chk02_0().copy(r_dest, r_src);
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk02_1() {
			MCRowMapper map = new Map_down_CALL_OPE_chk02_1();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk02_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("sls_cststk_flg", "sls_cststk_flg");
				addColumnPathMap("sls_act_no", "sls_act_no");
				addColumnPathMap("sls_act_seq", "sls_act_seq");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("sls_act_d_seq", "sls_act_d_seq");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("sls_schd_no", "sls_schd_no");
				addColumnPathMap("ship_schd_no", "ship_schd_no");
				addColumnPathMap("ship_pr_no", "ship_pr_no");
				addColumnPathMap("sls_schd_upd_cntr", "sls_schd_upd_cntr");
				addColumnPathMap("ship_pr_upd_cntr", "ship_pr_upd_cntr");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("qtn_upd_cntr", "qtn_upd_cntr");
				addColumnPathMap("slo_upd_cntr", "slo_upd_cntr");
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("qtn_d_no", "qtn_d_no");
				addColumnPathMap("iv_d_no", "iv_d_no");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("tax_rate", "tax_rate");
				addColumnPathMap("inc_tax_flg", "inc_tax_flg");
				addColumnPathMap("dscnt_itm_flg", "dscnt_itm_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk02_1(mcframe.serverMSBB.MSBBL1310.Chk02_DtlR r_dest, mcframe.serverMSBB.MSBBL1310.Chk02_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk02_1(MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> dest, MCList<mcframe.serverMSBB.MSBBL1310.Chk02_DtlR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk02_1();
			for(mcframe.serverMSBB.MSBBL1310.Chk02_DtlR r_src : src){
				mcframe.serverMSBB.MSBBL1310.Chk02_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk02_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック2のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_chk02_2() {
			MCRowMapper map = new Map_down_CALL_OPE_chk02_2();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_chk02_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("io_peg_no", "io_peg_no");
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("sls_act_d_no", "sls_act_d_no");
				addColumnPathMap("sls_act_io_no", "sls_act_io_no");
				addColumnPathMap("sls_act_io_seq", "sls_act_io_seq");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk02_2(mcframe.serverMSBB.MSBBL1310.Chk02_IoR r_dest, mcframe.serverMSBB.MSBBL1310.Chk02_IoR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk02_2(MCList<mcframe.serverMSBB.MSBBL1310.Chk02_IoR> dest, MCList<mcframe.serverMSBB.MSBBL1310.Chk02_IoR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk02_2();
			for(mcframe.serverMSBB.MSBBL1310.Chk02_IoR r_src : src){
				mcframe.serverMSBB.MSBBL1310.Chk02_IoR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk02_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 納品書を発行する<br>
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
		private final mcframe.serverMSBB.MSBBL1310.Prnt01_HdrR up0;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1310.Prnt01_HdrR.create();

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
			invoke((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Prnt01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Prnt01_HdrR createPrnt01_HdrR(){
			return mcframe.serverMSBB.MSBBL1310.Prnt01_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>sls_act_seq</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Prnt01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1310.Prnt01_HdrR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this).info;
		}


	}
	/**
	 * Prnt02オペレーション.<p>
	 *
	 * インボイスを発行する<br>
	 */
	abstract public class Prnt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Prnt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1310.Prnt02_HdrR up0;
		
		
		// コンストラクタ
		protected Prnt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1310.Prnt02_HdrR.create();

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
			invoke((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Prnt02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Prnt02_HdrR createPrnt02_HdrR(){
			return mcframe.serverMSBB.MSBBL1310.Prnt02_HdrR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_rev</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1310.Prnt02_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1310.Prnt02_HdrR up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 単価を再取得する<br>
	 */
	abstract public class Sprt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR> down0;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL5010.MABSL_SlsUpriService.SlsUpri_Sprt01 （{@link #sprt01}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション sprt01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL5010.MABSL_SlsUpriService.SlsUpri_Sprt01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR&gt; （{@link #sprt01_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR&gt; （{@link #sprt01_down0}）<br>
		 */
		public final mcframe.serverMABS.MABSL5010.MABSL_SlsUpriService.SlsUpri_Sprt01 sprt01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR> sprt01_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR> sprt01_down0;
		
		// コンストラクタ
		protected Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR.class);

			// 連携オペレーションの初期化
			sprt01 = mcframe.serverMABS.MABSL5010.MABSL_SlsUpriService.crtSlsUpri_Sprt01();
			
			// 連携オペレーションのコンテナ取得
			sprt01_up0 = (MCList<mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR>)sprt01.up(0);
			sprt01_down0 = (MCList<mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR>)sprt01.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, sprt01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR&gt; （{@link #sprt01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE)) {
				up_CALL_OPE(sprt01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE<br>
		 * MCList&lt;mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR&gt;（{@link #sprt01_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE)) {
				down_CALL_OPE(down0(), sprt01_down0);
			}
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
			invoke((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR createSprt01_DtlR(){
			return mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR.create();
		}

		/**
		 * Sprt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR> createSprt01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR.class);
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
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>qty</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsActReg)MSBBL_SlsActReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(MCList<mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR> dest0_0, MCList<mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR> src_Sprt01_Dtl){
			up_CALL_OPE_sprt01_0(dest0_0, src_Sprt01_Dtl);
		}
		
		/**
		 * 連携処理CALL_OPE_sprt01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_sprt01_0() {
			MCRowMapper map = new Map_up_CALL_OPE_sprt01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_sprt01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_sprt01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("dest_cd1", "dest_cd1");
				addColumnPathMap("dest_cd2", "dest_cd2");
				addColumnPathMap("dest_cd3", "dest_cd3");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("qty", "qty");
				addColumnPathMap("cur_cd", "cur_cd");
				addColumnPathMap("dt", "dt");
				addColumnPathMap("wg_cd", "wg_cd");
			}
		}

		/**
		 * 連携処理CALL_OPE_sprt01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_sprt01_0(mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR r_dest, mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_sprt01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_sprt01_0(MCList<mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR> dest, MCList<mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_sprt01_0();
			for(mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR r_src : src){
				mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_sprt01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(MCList<mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR> dest_Sprt01_Dtl, MCList<mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR> src0_0){
			down_CALL_OPE_sprt01_0(dest_Sprt01_Dtl, src0_0);
		}

		/**
		 * 連携処理CALL_OPE_sprt01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_CALL_OPE_sprt01_0() {
			MCRowMapper map = new Map_down_CALL_OPE_sprt01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_sprt01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_CALL_OPE_sprt01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sls_upri", "sls_upri");
				addColumnPathMap("interim_flg", "interim_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE_sprt01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_sprt01_0(mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR r_dest, mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_sprt01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_sprt01_0(MCList<mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR> dest, MCList<mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_sprt01_0();
			for(mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR r_src : src){
				mcframe.serverMSBB.MSBBL1310.Sprt01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_sprt01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}

	//FMCB LOGIC_CONTROLLER END
}