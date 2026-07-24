package mcframe.serverMSBF.MSBFL5210;

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
 * "MSBFL_LotService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFL_LotService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBFL5210";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBFL_LotService.Lot_Chk01 aLot_Chk01;

	protected void initLot_Chk01() {
		this.info = PDef.MS_MSBFL5210_Lot_Chk01_INFO;
		this.aLot_Chk01 = ((MSBFL_LotService)this).new Lot_Chk01();
	}

	public static MSBFL_LotService.Lot_Chk01 crtLot_Chk01() {
		MSBFL_LotService lgc = new MSBFL_LotService();
		lgc.initLot_Chk01();
		return lgc.aLot_Chk01;
	}

	protected void paramLot_Chk01(MCParam p) {
		if (this.aLot_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLot_Chk01.up0());
		p.addDownBlock(aLot_Chk01.down0());
	}

	protected void doLot_Chk01() {
		aLot_Chk01.call();
	};

	/**
	 * Lot_Chk01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5210.Lot_Chk01_CndR createLot_Chk01_CndR(){
		return mcframe.serverMSBF.MSBFL5210.Lot_Chk01_CndR.create();
	}

	/**
	 * Lot_Chk01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Chk01_CndR> createLot_Chk01_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Chk01_CndR.class);
	}
	protected MSBFL_LotService.Lot_Chk02 aLot_Chk02;

	protected void initLot_Chk02() {
		this.info = PDef.MS_MSBFL5210_Lot_Chk02_INFO;
		this.aLot_Chk02 = ((MSBFL_LotService)this).new Lot_Chk02();
	}

	public static MSBFL_LotService.Lot_Chk02 crtLot_Chk02() {
		MSBFL_LotService lgc = new MSBFL_LotService();
		lgc.initLot_Chk02();
		return lgc.aLot_Chk02;
	}

	protected void paramLot_Chk02(MCParam p) {
		if (this.aLot_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLot_Chk02.up0());
		p.addDownBlock(aLot_Chk02.down0());
	}

	protected void doLot_Chk02() {
		aLot_Chk02.call();
	};

	/**
	 * Lot_Chk02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5210.Lot_Chk02_CndR createLot_Chk02_CndR(){
		return mcframe.serverMSBF.MSBFL5210.Lot_Chk02_CndR.create();
	}

	/**
	 * Lot_Chk02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Chk02_CndR> createLot_Chk02_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Chk02_CndR.class);
	}
	protected MSBFL_LotService.Lot_Chk03 aLot_Chk03;

	protected void initLot_Chk03() {
		this.info = PDef.MS_MSBFL5210_Lot_Chk03_INFO;
		this.aLot_Chk03 = ((MSBFL_LotService)this).new Lot_Chk03();
	}

	public static MSBFL_LotService.Lot_Chk03 crtLot_Chk03() {
		MSBFL_LotService lgc = new MSBFL_LotService();
		lgc.initLot_Chk03();
		return lgc.aLot_Chk03;
	}

	protected void paramLot_Chk03(MCParam p) {
		if (this.aLot_Chk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLot_Chk03.up0());
		p.addDownBlock(aLot_Chk03.down0());
	}

	protected void doLot_Chk03() {
		aLot_Chk03.call();
	};

	/**
	 * Lot_Chk03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5210.Lot_Chk03_CndR createLot_Chk03_CndR(){
		return mcframe.serverMSBF.MSBFL5210.Lot_Chk03_CndR.create();
	}

	/**
	 * Lot_Chk03_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Chk03_CndR> createLot_Chk03_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Chk03_CndR.class);
	}
	protected MSBFL_LotService.Lot_Srch01 aLot_Srch01;

	protected void initLot_Srch01() {
		this.info = PDef.MS_MSBFL5210_Lot_Srch01_INFO;
		this.aLot_Srch01 = ((MSBFL_LotService)this).new Lot_Srch01();
	}

	public static MSBFL_LotService.Lot_Srch01 crtLot_Srch01() {
		MSBFL_LotService lgc = new MSBFL_LotService();
		lgc.initLot_Srch01();
		return lgc.aLot_Srch01;
	}

	protected void paramLot_Srch01(MCParam p) {
		if (this.aLot_Srch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLot_Srch01.up0());
		p.addDownBlock(aLot_Srch01.down0());
	}

	protected void doLot_Srch01() {
		aLot_Srch01.call();
	};

	/**
	 * Lot_Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5210.Lot_Srch01_CndR createLot_Srch01_CndR(){
		return mcframe.serverMSBF.MSBFL5210.Lot_Srch01_CndR.create();
	}

	/**
	 * Lot_Srch01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Srch01_CndR> createLot_Srch01_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Srch01_CndR.class);
	}

	/**
	 * Lot_Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5210.Lot_Srch01_RsltR createLot_Srch01_RsltR(){
		return mcframe.serverMSBF.MSBFL5210.Lot_Srch01_RsltR.create();
	}

	/**
	 * Lot_Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Srch01_RsltR> createLot_Srch01_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Srch01_RsltR.class);
	}
	protected MSBFL_LotService.Lot_Srch02 aLot_Srch02;

	protected void initLot_Srch02() {
		this.info = PDef.MS_MSBFL5210_Lot_Srch02_INFO;
		this.aLot_Srch02 = ((MSBFL_LotService)this).new Lot_Srch02();
	}

	public static MSBFL_LotService.Lot_Srch02 crtLot_Srch02() {
		MSBFL_LotService lgc = new MSBFL_LotService();
		lgc.initLot_Srch02();
		return lgc.aLot_Srch02;
	}

	protected void paramLot_Srch02(MCParam p) {
		if (this.aLot_Srch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLot_Srch02.up0());
		p.addDownBlock(aLot_Srch02.down0());
	}

	protected void doLot_Srch02() {
		aLot_Srch02.call();
	};

	/**
	 * Lot_Srch02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5210.Lot_Srch02_CndR createLot_Srch02_CndR(){
		return mcframe.serverMSBF.MSBFL5210.Lot_Srch02_CndR.create();
	}

	/**
	 * Lot_Srch02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Srch02_CndR> createLot_Srch02_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Srch02_CndR.class);
	}

	/**
	 * Lot_Srch02_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5210.Lot_Srch02_RsltR createLot_Srch02_RsltR(){
		return mcframe.serverMSBF.MSBFL5210.Lot_Srch02_RsltR.create();
	}

	/**
	 * Lot_Srch02_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Srch02_RsltR> createLot_Srch02_RsltL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Srch02_RsltR.class);
	}
	protected MSBFL_LotService.Lot_Upd01 aLot_Upd01;

	protected void initLot_Upd01() {
		this.info = PDef.MS_MSBFL5210_Lot_Upd01_INFO;
		this.aLot_Upd01 = ((MSBFL_LotService)this).new Lot_Upd01();
	}

	public static MSBFL_LotService.Lot_Upd01 crtLot_Upd01() {
		MSBFL_LotService lgc = new MSBFL_LotService();
		lgc.initLot_Upd01();
		return lgc.aLot_Upd01;
	}

	protected void paramLot_Upd01(MCParam p) {
		if (this.aLot_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLot_Upd01.up0());
	}

	protected void doLot_Upd01() {
		aLot_Upd01.call();
	};

	/**
	 * Lot_Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5210.Lot_Upd01_CndR createLot_Upd01_CndR(){
		return mcframe.serverMSBF.MSBFL5210.Lot_Upd01_CndR.create();
	}

	/**
	 * Lot_Upd01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd01_CndR> createLot_Upd01_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd01_CndR.class);
	}
	protected MSBFL_LotService.Lot_Upd02 aLot_Upd02;

	protected void initLot_Upd02() {
		this.info = PDef.MS_MSBFL5210_Lot_Upd02_INFO;
		this.aLot_Upd02 = ((MSBFL_LotService)this).new Lot_Upd02();
	}

	public static MSBFL_LotService.Lot_Upd02 crtLot_Upd02() {
		MSBFL_LotService lgc = new MSBFL_LotService();
		lgc.initLot_Upd02();
		return lgc.aLot_Upd02;
	}

	protected void paramLot_Upd02(MCParam p) {
		if (this.aLot_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLot_Upd02.up0());
	}

	protected void doLot_Upd02() {
		aLot_Upd02.call();
	};

	/**
	 * Lot_Upd02_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5210.Lot_Upd02_CndR createLot_Upd02_CndR(){
		return mcframe.serverMSBF.MSBFL5210.Lot_Upd02_CndR.create();
	}

	/**
	 * Lot_Upd02_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd02_CndR> createLot_Upd02_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd02_CndR.class);
	}
	protected MSBFL_LotService.Lot_Upd03 aLot_Upd03;

	protected void initLot_Upd03() {
		this.info = PDef.MS_MSBFL5210_Lot_Upd03_INFO;
		this.aLot_Upd03 = ((MSBFL_LotService)this).new Lot_Upd03();
	}

	public static MSBFL_LotService.Lot_Upd03 crtLot_Upd03() {
		MSBFL_LotService lgc = new MSBFL_LotService();
		lgc.initLot_Upd03();
		return lgc.aLot_Upd03;
	}

	protected void paramLot_Upd03(MCParam p) {
		if (this.aLot_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLot_Upd03.up0());
	}

	protected void doLot_Upd03() {
		aLot_Upd03.call();
	};

	/**
	 * Lot_Upd03_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5210.Lot_Upd03_CndR createLot_Upd03_CndR(){
		return mcframe.serverMSBF.MSBFL5210.Lot_Upd03_CndR.create();
	}

	/**
	 * Lot_Upd03_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd03_CndR> createLot_Upd03_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd03_CndR.class);
	}
	protected MSBFL_LotService.Lot_Upd04 aLot_Upd04;

	protected void initLot_Upd04() {
		this.info = PDef.MS_MSBFL5210_Lot_Upd04_INFO;
		this.aLot_Upd04 = ((MSBFL_LotService)this).new Lot_Upd04();
	}

	public static MSBFL_LotService.Lot_Upd04 crtLot_Upd04() {
		MSBFL_LotService lgc = new MSBFL_LotService();
		lgc.initLot_Upd04();
		return lgc.aLot_Upd04;
	}

	protected void paramLot_Upd04(MCParam p) {
		if (this.aLot_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLot_Upd04.up0());
	}

	protected void doLot_Upd04() {
		aLot_Upd04.call();
	};

	/**
	 * Lot_Upd04_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5210.Lot_Upd04_CndR createLot_Upd04_CndR(){
		return mcframe.serverMSBF.MSBFL5210.Lot_Upd04_CndR.create();
	}

	/**
	 * Lot_Upd04_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd04_CndR> createLot_Upd04_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd04_CndR.class);
	}
	protected MSBFL_LotService.Lot_Upd05 aLot_Upd05;

	protected void initLot_Upd05() {
		this.info = PDef.MS_MSBFL5210_Lot_Upd05_INFO;
		this.aLot_Upd05 = ((MSBFL_LotService)this).new Lot_Upd05();
	}

	public static MSBFL_LotService.Lot_Upd05 crtLot_Upd05() {
		MSBFL_LotService lgc = new MSBFL_LotService();
		lgc.initLot_Upd05();
		return lgc.aLot_Upd05;
	}

	protected void paramLot_Upd05(MCParam p) {
		if (this.aLot_Upd05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLot_Upd05.up0());
	}

	protected void doLot_Upd05() {
		aLot_Upd05.call();
	};

	/**
	 * Lot_Upd05_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5210.Lot_Upd05_CndR createLot_Upd05_CndR(){
		return mcframe.serverMSBF.MSBFL5210.Lot_Upd05_CndR.create();
	}

	/**
	 * Lot_Upd05_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd05_CndR> createLot_Upd05_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd05_CndR.class);
	}
	protected MSBFL_LotService.Lot_Upd06 aLot_Upd06;

	protected void initLot_Upd06() {
		this.info = PDef.MS_MSBFL5210_Lot_Upd06_INFO;
		this.aLot_Upd06 = ((MSBFL_LotService)this).new Lot_Upd06();
	}

	public static MSBFL_LotService.Lot_Upd06 crtLot_Upd06() {
		MSBFL_LotService lgc = new MSBFL_LotService();
		lgc.initLot_Upd06();
		return lgc.aLot_Upd06;
	}

	protected void paramLot_Upd06(MCParam p) {
		if (this.aLot_Upd06 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLot_Upd06.up0());
		p.addUpBlock(aLot_Upd06.up1());
	}

	protected void doLot_Upd06() {
		aLot_Upd06.call();
	};

	/**
	 * Lot_Upd06_DtlChdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlChdR createLot_Upd06_DtlChdR(){
		return mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlChdR.create();
	}

	/**
	 * Lot_Upd06_DtlChdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlChdR> createLot_Upd06_DtlChdL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlChdR.class);
	}

	/**
	 * Lot_Upd06_DtlParブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlParR createLot_Upd06_DtlParR(){
		return mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlParR.create();
	}

	/**
	 * Lot_Upd06_DtlParブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlParR> createLot_Upd06_DtlParL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlParR.class);
	}
	protected MSBFL_LotService.Lot_Upd07 aLot_Upd07;

	protected void initLot_Upd07() {
		this.info = PDef.MS_MSBFL5210_Lot_Upd07_INFO;
		this.aLot_Upd07 = ((MSBFL_LotService)this).new Lot_Upd07();
	}

	public static MSBFL_LotService.Lot_Upd07 crtLot_Upd07() {
		MSBFL_LotService lgc = new MSBFL_LotService();
		lgc.initLot_Upd07();
		return lgc.aLot_Upd07;
	}

	protected void paramLot_Upd07(MCParam p) {
		if (this.aLot_Upd07 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLot_Upd07.up0());
	}

	protected void doLot_Upd07() {
		aLot_Upd07.call();
	};

	/**
	 * Lot_Upd07_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5210.Lot_Upd07_CndR createLot_Upd07_CndR(){
		return mcframe.serverMSBF.MSBFL5210.Lot_Upd07_CndR.create();
	}

	/**
	 * Lot_Upd07_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd07_CndR> createLot_Upd07_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd07_CndR.class);
	}
	protected MSBFL_LotService.Lot_Upd08 aLot_Upd08;

	protected void initLot_Upd08() {
		this.info = PDef.MS_MSBFL5210_Lot_Upd08_INFO;
		this.aLot_Upd08 = ((MSBFL_LotService)this).new Lot_Upd08();
	}

	public static MSBFL_LotService.Lot_Upd08 crtLot_Upd08() {
		MSBFL_LotService lgc = new MSBFL_LotService();
		lgc.initLot_Upd08();
		return lgc.aLot_Upd08;
	}

	protected void paramLot_Upd08(MCParam p) {
		if (this.aLot_Upd08 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLot_Upd08.up0());
	}

	protected void doLot_Upd08() {
		aLot_Upd08.call();
	};

	/**
	 * Lot_Upd08_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5210.Lot_Upd08_CndR createLot_Upd08_CndR(){
		return mcframe.serverMSBF.MSBFL5210.Lot_Upd08_CndR.create();
	}

	/**
	 * Lot_Upd08_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd08_CndR> createLot_Upd08_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd08_CndR.class);
	}
	protected MSBFL_LotService.Lot_Del01 aLot_Del01;

	protected void initLot_Del01() {
		this.info = PDef.MS_MSBFL5210_Lot_Del01_INFO;
		this.aLot_Del01 = ((MSBFL_LotService)this).new Lot_Del01();
	}

	public static MSBFL_LotService.Lot_Del01 crtLot_Del01() {
		MSBFL_LotService lgc = new MSBFL_LotService();
		lgc.initLot_Del01();
		return lgc.aLot_Del01;
	}

	protected void paramLot_Del01(MCParam p) {
		if (this.aLot_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLot_Del01.up0());
	}

	protected void doLot_Del01() {
		aLot_Del01.call();
	};

	/**
	 * Lot_Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBF.MSBFL5210.Lot_Del01_CndR createLot_Del01_CndR(){
		return mcframe.serverMSBF.MSBFL5210.Lot_Del01_CndR.create();
	}

	/**
	 * Lot_Del01_CndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Del01_CndR> createLot_Del01_CndL(){
		return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Del01_CndR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Lot_Chk01オペレーション.<p>
	 *
	 * ロットの削除前にチェックを行う。<br>
	 */
	abstract public class Lot_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Lot_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Chk01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Chk01_CndR> down0;
		
		
		// コンストラクタ
		protected Lot_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Chk01_CndR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Chk01_CndR.class);

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
			invoke((MSBFL_LotService)MSBFL_LotService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Lot_Chk01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5210.Lot_Chk01_CndR createLot_Chk01_CndR(){
			return mcframe.serverMSBF.MSBFL5210.Lot_Chk01_CndR.create();
		}

		/**
		 * Lot_Chk01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Chk01_CndR> createLot_Chk01_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Chk01_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>exception_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.sublot_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Chk01_CndR> up0() {
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
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Chk01_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotService)MSBFL_LotService_MC_A.this).info;
		}


	}
	/**
	 * Lot_Chk02オペレーション.<p>
	 *
	 * ロットの重複チェックを行う。<br>
	 */
	abstract public class Lot_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Lot_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Chk02_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Chk02_CndR> down0;
		
		
		// コンストラクタ
		protected Lot_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Chk02_CndR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Chk02_CndR.class);

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
			invoke((MSBFL_LotService)MSBFL_LotService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Lot_Chk02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5210.Lot_Chk02_CndR createLot_Chk02_CndR(){
			return mcframe.serverMSBF.MSBFL5210.Lot_Chk02_CndR.create();
		}

		/**
		 * Lot_Chk02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Chk02_CndR> createLot_Chk02_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Chk02_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_not_change_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Chk02_CndR> up0() {
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
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Chk02_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotService)MSBFL_LotService_MC_A.this).info;
		}


	}
	/**
	 * Lot_Chk03オペレーション.<p>
	 *
	 * ロットの存在チェックを行う。<br>
	 */
	abstract public class Lot_Chk03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Lot_Chk03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Chk03_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Chk03_CndR> down0;
		
		
		// コンストラクタ
		protected Lot_Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Chk03_CndR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Chk03_CndR.class);

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
			invoke((MSBFL_LotService)MSBFL_LotService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Lot_Chk03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5210.Lot_Chk03_CndR createLot_Chk03_CndR(){
			return mcframe.serverMSBF.MSBFL5210.Lot_Chk03_CndR.create();
		}

		/**
		 * Lot_Chk03_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Chk03_CndR> createLot_Chk03_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Chk03_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.ver_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Chk03_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_p.vld_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_seq</td></tr>
		 * 	<tr><td><br></td><td>lot_p.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_p.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_p.mfg_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_p.insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_p.plnt_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_p.mrkt_judg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_p.act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Chk03_CndR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotService)MSBFL_LotService_MC_A.this).info;
		}


	}
	/**
	 * Lot_Srch01オペレーション.<p>
	 *
	 * 有効期限・使用期限を取得する。<br>
	 */
	abstract public class Lot_Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Lot_Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Srch01_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Srch01_RsltR> down0;
		
		
		// コンストラクタ
		protected Lot_Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Srch01_CndR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Srch01_RsltR.class);

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
			invoke((MSBFL_LotService)MSBFL_LotService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Lot_Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5210.Lot_Srch01_CndR createLot_Srch01_CndR(){
			return mcframe.serverMSBF.MSBFL5210.Lot_Srch01_CndR.create();
		}

		/**
		 * Lot_Srch01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Srch01_CndR> createLot_Srch01_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Srch01_CndR.class);
		}

		/**
		 * Lot_Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5210.Lot_Srch01_RsltR createLot_Srch01_RsltR(){
			return mcframe.serverMSBF.MSBFL5210.Lot_Srch01_RsltR.create();
		}

		/**
		 * Lot_Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Srch01_RsltR> createLot_Srch01_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>src_no1</td></tr>
		 * 	<tr><td><br></td><td>src_no2</td></tr>
		 * 	<tr><td><br></td><td>src_no3</td></tr>
		 * 	<tr><td><br></td><td>src_no4</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm_typ</td></tr>
		 * 	<tr><td><br></td><td>vld_pd</td></tr>
		 * 	<tr><td><br></td><td>lmt_pd</td></tr>
		 * 	<tr><td><br></td><td>calc_pd_typ</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>base_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Srch01_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotService)MSBFL_LotService_MC_A.this).info;
		}


	}
	/**
	 * Lot_Srch02オペレーション.<p>
	 *
	 * 検査指図単位で、有効期限・使用期限を取得する。<br>
	 */
	abstract public class Lot_Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Lot_Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Srch02_CndR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Srch02_RsltR> down0;
		
		
		// コンストラクタ
		protected Lot_Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Srch02_CndR.class);
			down0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Srch02_RsltR.class);

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
			invoke((MSBFL_LotService)MSBFL_LotService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Lot_Srch02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5210.Lot_Srch02_CndR createLot_Srch02_CndR(){
			return mcframe.serverMSBF.MSBFL5210.Lot_Srch02_CndR.create();
		}

		/**
		 * Lot_Srch02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Srch02_CndR> createLot_Srch02_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Srch02_CndR.class);
		}

		/**
		 * Lot_Srch02_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5210.Lot_Srch02_RsltR createLot_Srch02_RsltR(){
			return mcframe.serverMSBF.MSBFL5210.Lot_Srch02_RsltR.create();
		}

		/**
		 * Lot_Srch02_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Srch02_RsltR> createLot_Srch02_RsltL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Srch02_RsltR.class);
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
		 * 	<tr><td><br></td><td>lmt_dt_frm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Srch02_CndR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm_typ</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Srch02_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotService)MSBFL_LotService_MC_A.this).info;
		}


	}
	/**
	 * Lot_Upd01オペレーション.<p>
	 *
	 * ロットの追加・更新を行う。<br>
	 */
	abstract public class Lot_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Lot_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd01_CndR> up0;
		
		
		// コンストラクタ
		protected Lot_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd01_CndR.class);

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
			invoke((MSBFL_LotService)MSBFL_LotService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Lot_Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5210.Lot_Upd01_CndR createLot_Upd01_CndR(){
			return mcframe.serverMSBF.MSBFL5210.Lot_Upd01_CndR.create();
		}

		/**
		 * Lot_Upd01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd01_CndR> createLot_Upd01_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd01_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>base_dt</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>arr_act_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.schd_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_char1</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_char2</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_char3</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_char4</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_char5</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_num1</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_num2</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_num3</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_num4</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_num5</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_dt1</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_dt2</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_dt3</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_dt4</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_dt5</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_flg1</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_flg2</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_flg3</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_flg4</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_sub_flg5</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd01_CndR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotService)MSBFL_LotService_MC_A.this).info;
		}


	}
	/**
	 * Lot_Upd02オペレーション.<p>
	 *
	 * ロットの備考・予備項目を更新する。<br>
	 */
	abstract public class Lot_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Lot_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd02_CndR> up0;
		
		
		// コンストラクタ
		protected Lot_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd02_CndR.class);

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
			invoke((MSBFL_LotService)MSBFL_LotService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Lot_Upd02_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5210.Lot_Upd02_CndR createLot_Upd02_CndR(){
			return mcframe.serverMSBF.MSBFL5210.Lot_Upd02_CndR.create();
		}

		/**
		 * Lot_Upd02_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd02_CndR> createLot_Upd02_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd02_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_rmrks</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd02_CndR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotService)MSBFL_LotService_MC_A.this).info;
		}


	}
	/**
	 * Lot_Upd03オペレーション.<p>
	 *
	 * ロットの製造承認状況を更新する。<br>
	 */
	abstract public class Lot_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Lot_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd03_CndR> up0;
		
		
		// コンストラクタ
		protected Lot_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd03_CndR.class);

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
			invoke((MSBFL_LotService)MSBFL_LotService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Lot_Upd03_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5210.Lot_Upd03_CndR createLot_Upd03_CndR(){
			return mcframe.serverMSBF.MSBFL5210.Lot_Upd03_CndR.create();
		}

		/**
		 * Lot_Upd03_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd03_CndR> createLot_Upd03_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd03_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_mfg_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd03_CndR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotService)MSBFL_LotService_MC_A.this).info;
		}


	}
	/**
	 * Lot_Upd04オペレーション.<p>
	 *
	 * ロットの有効期限・使用期限・実際有効成分係数を更新する。<br>
	 */
	abstract public class Lot_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Lot_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd04_CndR> up0;
		
		
		// コンストラクタ
		protected Lot_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd04_CndR.class);

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
			invoke((MSBFL_LotService)MSBFL_LotService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Lot_Upd04_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5210.Lot_Upd04_CndR createLot_Upd04_CndR(){
			return mcframe.serverMSBF.MSBFL5210.Lot_Upd04_CndR.create();
		}

		/**
		 * Lot_Upd04_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd04_CndR> createLot_Upd04_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd04_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>vld_dt_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.vld_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lmt_dt_frm_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lmt_dt_frm</td></tr>
		 * 	<tr><td><br></td><td>lot_p.act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>lot_p.base_gr_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd04_CndR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotService)MSBFL_LotService_MC_A.this).info;
		}


	}
	/**
	 * Lot_Upd05オペレーション.<p>
	 *
	 * ロットの在庫検査区分・良品区分・工場出荷承認区分を更新する。<br>
	 */
	abstract public class Lot_Upd05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Lot_Upd05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd05_CndR> up0;
		
		
		// コンストラクタ
		protected Lot_Upd05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd05_CndR.class);

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
			invoke((MSBFL_LotService)MSBFL_LotService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Lot_Upd05_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5210.Lot_Upd05_CndR createLot_Upd05_CndR(){
			return mcframe.serverMSBF.MSBFL5210.Lot_Upd05_CndR.create();
		}

		/**
		 * Lot_Upd05_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd05_CndR> createLot_Upd05_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd05_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>insp_no</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>lmt_up_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_p.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_p.plnt_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_p.insp_aprv_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_p.mrkt_judg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_insp_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_inst_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_act_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>mrkt_judg_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd05_CndR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotService)MSBFL_LotService_MC_A.this).info;
		}


	}
	/**
	 * Lot_Upd06オペレーション.<p>
	 *
	 * ロットの有効期限・使用期限を更新する（子品目期限引継ぎ・子品目起算日引継ぎ）。<br>
	 */
	abstract public class Lot_Upd06 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Lot_Upd06";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlChdR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlParR> up1;
		
		
		// コンストラクタ
		protected Lot_Upd06() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlChdR.class);
			up1 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlParR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBFL_LotService)MSBFL_LotService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Lot_Upd06_DtlChdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlChdR createLot_Upd06_DtlChdR(){
			return mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlChdR.create();
		}

		/**
		 * Lot_Upd06_DtlChdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlChdR> createLot_Upd06_DtlChdL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlChdR.class);
		}

		/**
		 * Lot_Upd06_DtlParブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlParR createLot_Upd06_DtlParR(){
			return mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlParR.create();
		}

		/**
		 * Lot_Upd06_DtlParブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlParR> createLot_Upd06_DtlParL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlParR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>main_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>main_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>main_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>main_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>main_lot_no</td></tr>
		 * 	<tr><td><br></td><td>main_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>vld_dt</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlChdR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>chd_peg_no</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.sublot_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd06_DtlParR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotService)MSBFL_LotService_MC_A.this).info;
		}


	}
	/**
	 * Lot_Upd07オペレーション.<p>
	 *
	 * ロットの有効期限・使用期限を更新する（工程着手実績日・終了実績日起算）。<br>
	 */
	abstract public class Lot_Upd07 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Lot_Upd07";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd07_CndR> up0;
		
		
		// コンストラクタ
		protected Lot_Upd07() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd07_CndR.class);

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
			invoke((MSBFL_LotService)MSBFL_LotService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Lot_Upd07_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5210.Lot_Upd07_CndR createLot_Upd07_CndR(){
			return mcframe.serverMSBF.MSBFL5210.Lot_Upd07_CndR.create();
		}

		/**
		 * Lot_Upd07_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd07_CndR> createLot_Upd07_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd07_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_act_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd07_CndR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotService)MSBFL_LotService_MC_A.this).info;
		}


	}
	/**
	 * Lot_Upd08オペレーション.<p>
	 *
	 * 出来高、入荷実績後にロットを更新する。<br>
	 */
	abstract public class Lot_Upd08 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Lot_Upd08";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd08_CndR> up0;
		
		
		// コンストラクタ
		protected Lot_Upd08() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd08_CndR.class);

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
			invoke((MSBFL_LotService)MSBFL_LotService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Lot_Upd08_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5210.Lot_Upd08_CndR createLot_Upd08_CndR(){
			return mcframe.serverMSBF.MSBFL5210.Lot_Upd08_CndR.create();
		}

		/**
		 * Lot_Upd08_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd08_CndR> createLot_Upd08_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Upd08_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.ver_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.bp_lot_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>from_site_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_typ</td></tr>
		 * 	<tr><td><br></td><td>src_no1</td></tr>
		 * 	<tr><td><br></td><td>src_no2</td></tr>
		 * 	<tr><td><br></td><td>src_no3</td></tr>
		 * 	<tr><td><br></td><td>src_no4</td></tr>
		 * 	<tr><td><br></td><td>base_dt</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Upd08_CndR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotService)MSBFL_LotService_MC_A.this).info;
		}


	}
	/**
	 * Lot_Del01オペレーション.<p>
	 *
	 * ロットを削除する。<br>
	 */
	abstract public class Lot_Del01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Lot_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBF.MSBFL5210.Lot_Del01_CndR> up0;
		
		
		// コンストラクタ
		protected Lot_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Del01_CndR.class);

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
			invoke((MSBFL_LotService)MSBFL_LotService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Lot_Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBF.MSBFL5210.Lot_Del01_CndR createLot_Del01_CndR(){
			return mcframe.serverMSBF.MSBFL5210.Lot_Del01_CndR.create();
		}

		/**
		 * Lot_Del01_CndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Del01_CndR> createLot_Del01_CndL(){
			return MCList.create(mcframe.serverMSBF.MSBFL5210.Lot_Del01_CndR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>lot_p.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lot_p.lot_no</td></tr>
		 * 	<tr><td><br></td><td>lot_p.sublot_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBF.MSBFL5210.Lot_Del01_CndR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBFL_LotService)MSBFL_LotService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}