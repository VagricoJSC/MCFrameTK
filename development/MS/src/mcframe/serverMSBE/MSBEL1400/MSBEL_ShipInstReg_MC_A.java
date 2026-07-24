package mcframe.serverMSBE.MSBEL1400;

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
 * "MSBEL_ShipInstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ShipInstReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBEL1400";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ShipInstReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBEL1400_Srch01_INFO;
		this.aSrch01 = ((MSBEL_ShipInstReg)this).new Srch01();
	}

	public static MSBEL_ShipInstReg.Srch01 crtSrch01() {
		MSBEL_ShipInstReg lgc = new MSBEL_ShipInstReg();
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
	public mcframe.serverMSBE.MSBEL1400.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBE.MSBEL1400.Srch01_CndR.create();
	}

	/**
	 * Srch01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Srch01_HdrR createSrch01_HdrR(){
		return mcframe.serverMSBE.MSBEL1400.Srch01_HdrR.create();
	}

	/**
	 * Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Srch01_DtlR createSrch01_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Srch01_DtlR.create();
	}

	/**
	 * Srch01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_DtlR> createSrch01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_DtlR.class);
	}

	/**
	 * Srch01_ShipSchd_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR createSrch01_ShipSchd_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.create();
	}

	/**
	 * Srch01_ShipSchd_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> createSrch01_ShipSchd_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
	}
	protected MSBEL_ShipInstReg.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBEL1400_Srch02_INFO;
		this.aSrch02 = ((MSBEL_ShipInstReg)this).new Srch02();
	}

	public static MSBEL_ShipInstReg.Srch02 crtSrch02() {
		MSBEL_ShipInstReg lgc = new MSBEL_ShipInstReg();
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
	 * Srch02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Srch01_HdrR createSrch02_HdrR(){
		return mcframe.serverMSBE.MSBEL1400.Srch01_HdrR.create();
	}

	/**
	 * Srch02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Srch01_DtlR createSrch02_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Srch01_DtlR.create();
	}

	/**
	 * Srch02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_DtlR> createSrch02_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_DtlR.class);
	}

	/**
	 * Srch02_ShipSchd_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR createSrch02_ShipSchd_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.create();
	}

	/**
	 * Srch02_ShipSchd_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> createSrch02_ShipSchd_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
	}
	protected MSBEL_ShipInstReg.Sprt01 aSprt01;

	protected void initSprt01() {
		this.info = PDef.MS_MSBEL1400_Sprt01_INFO;
		this.aSprt01 = ((MSBEL_ShipInstReg)this).new Sprt01();
	}

	public static MSBEL_ShipInstReg.Sprt01 crtSprt01() {
		MSBEL_ShipInstReg lgc = new MSBEL_ShipInstReg();
		lgc.initSprt01();
		return lgc.aSprt01;
	}

	protected void paramSprt01(MCParam p) {
		if (this.aSprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt01.up0());
		p.addUpBlock(aSprt01.up1());
		p.addUpBlock(aSprt01.up2());
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
	public mcframe.serverMSBE.MSBEL1400.Sprt01_DtlR createSprt01_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Sprt01_DtlR.create();
	}

	/**
	 * Sprt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Sprt01_DtlR> createSprt01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Sprt01_DtlR.class);
	}

	/**
	 * Sprt01_ShipSchd_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR createSprt01_ShipSchd_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.create();
	}

	/**
	 * Sprt01_ShipSchd_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> createSprt01_ShipSchd_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
	}

	/**
	 * Sprt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Sprt01_CndR createSprt01_CndR(){
		return mcframe.serverMSBE.MSBEL1400.Sprt01_CndR.create();
	}
	protected MSBEL_ShipInstReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBEL1400_Chk01_INFO;
		this.aChk01 = ((MSBEL_ShipInstReg)this).new Chk01();
	}

	public static MSBEL_ShipInstReg.Chk01 crtChk01() {
		MSBEL_ShipInstReg lgc = new MSBEL_ShipInstReg();
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
	}

	protected void doChk01() {
		aChk01.call();
	};

	/**
	 * Chk01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Chk01_HdrR createChk01_HdrR(){
		return mcframe.serverMSBE.MSBEL1400.Chk01_HdrR.create();
	}

	/**
	 * Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Chk01_DtlR createChk01_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.create();
	}

	/**
	 * Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> createChk01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.class);
	}

	/**
	 * Chk01_ShipSchd_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR createChk01_ShipSchd_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.create();
	}

	/**
	 * Chk01_ShipSchd_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> createChk01_ShipSchd_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
	}
	protected MSBEL_ShipInstReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBEL1400_Ins01_INFO;
		this.aIns01 = ((MSBEL_ShipInstReg)this).new Ins01();
	}

	public static MSBEL_ShipInstReg.Ins01 crtIns01() {
		MSBEL_ShipInstReg lgc = new MSBEL_ShipInstReg();
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
		p.addUpBlock(aIns01.up3());
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
	public mcframe.serverMSBE.MSBEL1400.Chk01_HdrR createIns01_HdrR(){
		return mcframe.serverMSBE.MSBEL1400.Chk01_HdrR.create();
	}

	/**
	 * Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Chk01_DtlR createIns01_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.create();
	}

	/**
	 * Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> createIns01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.class);
	}

	/**
	 * Ins01_ShipSchd_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR createIns01_ShipSchd_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.create();
	}

	/**
	 * Ins01_ShipSchd_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> createIns01_ShipSchd_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
	}

	/**
	 * Ins01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Ins01_CndR createIns01_CndR(){
		return mcframe.serverMSBE.MSBEL1400.Ins01_CndR.create();
	}
	protected MSBEL_ShipInstReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBEL1400_Chk02_INFO;
		this.aChk02 = ((MSBEL_ShipInstReg)this).new Chk02();
	}

	public static MSBEL_ShipInstReg.Chk02 crtChk02() {
		MSBEL_ShipInstReg lgc = new MSBEL_ShipInstReg();
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
	}

	protected void doChk02() {
		aChk02.call();
	};

	/**
	 * Chk02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Chk01_HdrR createChk02_HdrR(){
		return mcframe.serverMSBE.MSBEL1400.Chk01_HdrR.create();
	}

	/**
	 * Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Chk01_DtlR createChk02_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.create();
	}

	/**
	 * Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> createChk02_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.class);
	}

	/**
	 * Chk02_ShipSchd_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR createChk02_ShipSchd_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.create();
	}

	/**
	 * Chk02_ShipSchd_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> createChk02_ShipSchd_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
	}
	protected MSBEL_ShipInstReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBEL1400_Upd01_INFO;
		this.aUpd01 = ((MSBEL_ShipInstReg)this).new Upd01();
	}

	public static MSBEL_ShipInstReg.Upd01 crtUpd01() {
		MSBEL_ShipInstReg lgc = new MSBEL_ShipInstReg();
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
		p.addUpBlock(aUpd01.up3());
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
	public mcframe.serverMSBE.MSBEL1400.Chk01_HdrR createUpd01_HdrR(){
		return mcframe.serverMSBE.MSBEL1400.Chk01_HdrR.create();
	}

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Chk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.class);
	}

	/**
	 * Upd01_ShipSchd_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR createUpd01_ShipSchd_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.create();
	}

	/**
	 * Upd01_ShipSchd_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> createUpd01_ShipSchd_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
	}

	/**
	 * Upd01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Upd01_CndR createUpd01_CndR(){
		return mcframe.serverMSBE.MSBEL1400.Upd01_CndR.create();
	}
	protected MSBEL_ShipInstReg.Chk03 aChk03;

	protected void initChk03() {
		this.info = PDef.MS_MSBEL1400_Chk03_INFO;
		this.aChk03 = ((MSBEL_ShipInstReg)this).new Chk03();
	}

	public static MSBEL_ShipInstReg.Chk03 crtChk03() {
		MSBEL_ShipInstReg lgc = new MSBEL_ShipInstReg();
		lgc.initChk03();
		return lgc.aChk03;
	}

	protected void paramChk03(MCParam p) {
		if (this.aChk03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aChk03.up0());
		p.addUpBlock(aChk03.up1());
		p.addUpBlock(aChk03.up2());
		p.addDownBlock(aChk03.down0());
		p.addDownBlock(aChk03.down1());
	}

	protected void doChk03() {
		aChk03.call();
	};

	/**
	 * Chk03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Chk03_HdrR createChk03_HdrR(){
		return mcframe.serverMSBE.MSBEL1400.Chk03_HdrR.create();
	}

	/**
	 * Chk03_ShipSchd_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR createChk03_ShipSchd_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.create();
	}

	/**
	 * Chk03_ShipSchd_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> createChk03_ShipSchd_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
	}

	/**
	 * Chk03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Chk03_DtlR createChk03_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Chk03_DtlR.create();
	}

	/**
	 * Chk03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Chk03_DtlR> createChk03_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Chk03_DtlR.class);
	}
	protected MSBEL_ShipInstReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBEL1400_Del01_INFO;
		this.aDel01 = ((MSBEL_ShipInstReg)this).new Del01();
	}

	public static MSBEL_ShipInstReg.Del01 crtDel01() {
		MSBEL_ShipInstReg lgc = new MSBEL_ShipInstReg();
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
		p.addUpBlock(aDel01.up2());
		p.addUpBlock(aDel01.up3());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Chk03_HdrR createDel01_HdrR(){
		return mcframe.serverMSBE.MSBEL1400.Chk03_HdrR.create();
	}

	/**
	 * Del01_ShipSchd_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR createDel01_ShipSchd_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.create();
	}

	/**
	 * Del01_ShipSchd_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> createDel01_ShipSchd_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
	}

	/**
	 * Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Chk03_DtlR createDel01_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Chk03_DtlR.create();
	}

	/**
	 * Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Chk03_DtlR> createDel01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Chk03_DtlR.class);
	}

	/**
	 * Del01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Del01_CndR createDel01_CndR(){
		return mcframe.serverMSBE.MSBEL1400.Del01_CndR.create();
	}
	protected MSBEL_ShipInstReg.Chk04 aChk04;

	protected void initChk04() {
		this.info = PDef.MS_MSBEL1400_Chk04_INFO;
		this.aChk04 = ((MSBEL_ShipInstReg)this).new Chk04();
	}

	public static MSBEL_ShipInstReg.Chk04 crtChk04() {
		MSBEL_ShipInstReg lgc = new MSBEL_ShipInstReg();
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
	}

	protected void doChk04() {
		aChk04.call();
	};

	/**
	 * Chk04_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Chk04_HdrR createChk04_HdrR(){
		return mcframe.serverMSBE.MSBEL1400.Chk04_HdrR.create();
	}

	/**
	 * Chk04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Chk04_DtlR createChk04_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Chk04_DtlR.create();
	}

	/**
	 * Chk04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Chk04_DtlR> createChk04_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Chk04_DtlR.class);
	}
	protected MSBEL_ShipInstReg.Prnt01 aPrnt01;

	protected void initPrnt01() {
		this.info = PDef.MS_MSBEL1400_Prnt01_INFO;
		this.aPrnt01 = ((MSBEL_ShipInstReg)this).new Prnt01();
	}

	public static MSBEL_ShipInstReg.Prnt01 crtPrnt01() {
		MSBEL_ShipInstReg lgc = new MSBEL_ShipInstReg();
		lgc.initPrnt01();
		return lgc.aPrnt01;
	}

	protected void paramPrnt01(MCParam p) {
		if (this.aPrnt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aPrnt01.up0());
		p.addUpBlock(aPrnt01.up1());
		p.addUpBlock(aPrnt01.up2());
	}

	protected void doPrnt01() {
		aPrnt01.call();
	};

	/**
	 * Prnt01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Chk04_HdrR createPrnt01_HdrR(){
		return mcframe.serverMSBE.MSBEL1400.Chk04_HdrR.create();
	}

	/**
	 * Prnt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Prnt01_CndR createPrnt01_CndR(){
		return mcframe.serverMSBE.MSBEL1400.Prnt01_CndR.create();
	}

	/**
	 * Prnt01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Prnt01_DtlR createPrnt01_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Prnt01_DtlR.create();
	}

	/**
	 * Prnt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Prnt01_DtlR> createPrnt01_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Prnt01_DtlR.class);
	}
	protected MSBEL_ShipInstReg.Sprt02 aSprt02;

	protected void initSprt02() {
		this.info = PDef.MS_MSBEL1400_Sprt02_INFO;
		this.aSprt02 = ((MSBEL_ShipInstReg)this).new Sprt02();
	}

	public static MSBEL_ShipInstReg.Sprt02 crtSprt02() {
		MSBEL_ShipInstReg lgc = new MSBEL_ShipInstReg();
		lgc.initSprt02();
		return lgc.aSprt02;
	}

	protected void paramSprt02(MCParam p) {
		if (this.aSprt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt02.up0());
		p.addDownBlock(aSprt02.down0());
	}

	protected void doSprt02() {
		aSprt02.call();
	};

	/**
	 * Sprt02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL1400.Sprt02_DtlR createSprt02_DtlR(){
		return mcframe.serverMSBE.MSBEL1400.Sprt02_DtlR.create();
	}

	/**
	 * Sprt02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL1400.Sprt02_DtlR> createSprt02_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL1400.Sprt02_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 登録済みの出荷指図を検索する。<br>
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
		private final mcframe.serverMSBE.MSBEL1400.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1400.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Srch01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> down2;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1400.Srch01_CndR.create();
			down0 = mcframe.serverMSBE.MSBEL1400.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);

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
			invoke((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this);
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
		public mcframe.serverMSBE.MSBEL1400.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBE.MSBEL1400.Srch01_CndR.create();
		}

		/**
		 * Srch01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Srch01_HdrR createSrch01_HdrR(){
			return mcframe.serverMSBE.MSBEL1400.Srch01_HdrR.create();
		}

		/**
		 * Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Srch01_DtlR createSrch01_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Srch01_DtlR.create();
		}

		/**
		 * Srch01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_DtlR> createSrch01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_DtlR.class);
		}

		/**
		 * Srch01_ShipSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR createSrch01_ShipSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.create();
		}

		/**
		 * Srch01_ShipSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> createSrch01_ShipSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>screen_ope</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Srch01_CndR
		 */
		public mcframe.serverMSBE.MSBEL1400.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_hm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_time</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wt</td></tr>
		 * 	<tr><td><br></td><td>ship_dim</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>immd_pick_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_ship_inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_ship_adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>pick_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_adv_prnt_flg</td></tr>
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
		 * 	<tr><td><br></td><td>ship_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>non_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>non_adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * 	<tr><td><br></td><td>can_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Srch01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1400.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_ver_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>iv_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ship_act_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>act_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>grp_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_site_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>def_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>def_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>last_wms_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>xfr_src_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>loan_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_wt</td></tr>
		 * 	<tr><td><br></td><td>ship_dim</td></tr>
		 * 	<tr><td><br></td><td>unit_wt</td></tr>
		 * 	<tr><td><br></td><td>unit_dim</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_loc_sppl_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this).info;
		}


	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * 出荷指図前に実行する検索処理。<br>
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
		private final mcframe.serverMSBE.MSBEL1400.Srch01_HdrR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1400.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Srch01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> down2;
		
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1400.Srch01_HdrR.create();
			down0 = mcframe.serverMSBE.MSBEL1400.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);

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
			invoke((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
		}
		/**
		 * Srch02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Srch01_HdrR createSrch02_HdrR(){
			return mcframe.serverMSBE.MSBEL1400.Srch01_HdrR.create();
		}

		/**
		 * Srch02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Srch01_DtlR createSrch02_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Srch01_DtlR.create();
		}

		/**
		 * Srch02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_DtlR> createSrch02_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_DtlR.class);
		}

		/**
		 * Srch02_ShipSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR createSrch02_ShipSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.create();
		}

		/**
		 * Srch02_ShipSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> createSrch02_ShipSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>linked_ship_schd_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Srch01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1400.Srch01_HdrR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_time</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_hm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_wt</td></tr>
		 * 	<tr><td><br></td><td>ship_dim</td></tr>
		 * 	<tr><td><br></td><td>immd_pick_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_ship_inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_ship_adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>latest_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Srch01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1400.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_ver_no</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>schd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>iv_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>act_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>cont_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>grp_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_site_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>quality_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>def_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>def_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_typ</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ret_prov_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>pick_peg_no</td></tr>
		 * 	<tr><td><br></td><td>xfr_src_typ</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>cststk_flg</td></tr>
		 * 	<tr><td><br></td><td>loan_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_wt</td></tr>
		 * 	<tr><td><br></td><td>ship_dim</td></tr>
		 * 	<tr><td><br></td><td>unit_wt</td></tr>
		 * 	<tr><td><br></td><td>unit_dim</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_loc_sppl_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * ロット提案処理を行う。<br>
	 */
	abstract public class Sprt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
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
		private final MCList<mcframe.serverMSBE.MSBEL1400.Sprt01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1400.Sprt01_CndR up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Sprt01_DtlR> down0;
		
		
		// コンストラクタ
		protected Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL1400.Sprt01_DtlR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
			up2 = mcframe.serverMSBE.MSBEL1400.Sprt01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1400.Sprt01_DtlR.class);

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
			invoke((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Sprt01_DtlR createSprt01_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Sprt01_DtlR.create();
		}

		/**
		 * Sprt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Sprt01_DtlR> createSprt01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Sprt01_DtlR.class);
		}

		/**
		 * Sprt01_ShipSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR createSprt01_ShipSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.create();
		}

		/**
		 * Sprt01_ShipSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> createSprt01_ShipSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
		}

		/**
		 * Sprt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Sprt01_CndR createSprt01_CndR(){
			return mcframe.serverMSBE.MSBEL1400.Sprt01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_peg_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>act_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Sprt01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Sprt01_CndR
		 */
		public mcframe.serverMSBE.MSBEL1400.Sprt01_CndR up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_peg_no</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>gi_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pckg_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>act_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>std_cont_qty</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>no_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_tgt_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Sprt01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 出荷指図を登録する前に、チェックを実行します。<br>
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
		private final mcframe.serverMSBE.MSBEL1400.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1400.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1400.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
			down0 = mcframe.serverMSBE.MSBEL1400.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.class);

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
			invoke((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk01_HdrR createChk01_HdrR(){
			return mcframe.serverMSBE.MSBEL1400.Chk01_HdrR.create();
		}

		/**
		 * Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk01_DtlR createChk01_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.create();
		}

		/**
		 * Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> createChk01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.class);
		}

		/**
		 * Chk01_ShipSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR createChk01_ShipSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.create();
		}

		/**
		 * Chk01_ShipSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> createChk01_ShipSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>immd_pick_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_ship_inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_ship_adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>grp_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>alloc_ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>immd_pick_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_ship_inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_ship_adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>grp_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>alloc_lot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_from</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_to</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 出荷指図を新規登録する。<br>
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
		private final mcframe.serverMSBE.MSBEL1400.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1400.Ins01_CndR up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1400.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1400.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
			up3 = mcframe.serverMSBE.MSBEL1400.Ins01_CndR.create();
			down0 = mcframe.serverMSBE.MSBEL1400.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.class);

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
			invoke((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this);
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
		public mcframe.serverMSBE.MSBEL1400.Chk01_HdrR createIns01_HdrR(){
			return mcframe.serverMSBE.MSBEL1400.Chk01_HdrR.create();
		}

		/**
		 * Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk01_DtlR createIns01_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.create();
		}

		/**
		 * Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> createIns01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.class);
		}

		/**
		 * Ins01_ShipSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR createIns01_ShipSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.create();
		}

		/**
		 * Ins01_ShipSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> createIns01_ShipSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
		}

		/**
		 * Ins01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Ins01_CndR createIns01_CndR(){
			return mcframe.serverMSBE.MSBEL1400.Ins01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>immd_pick_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_ship_inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_ship_adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>grp_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>alloc_ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Ins01_CndR
		 */
		public mcframe.serverMSBE.MSBEL1400.Ins01_CndR up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 出荷指図を訂正する前に、チェックを実行します。<br>
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
		private final mcframe.serverMSBE.MSBEL1400.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1400.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> down1;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1400.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
			down0 = mcframe.serverMSBE.MSBEL1400.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.class);

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
			invoke((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk01_HdrR createChk02_HdrR(){
			return mcframe.serverMSBE.MSBEL1400.Chk01_HdrR.create();
		}

		/**
		 * Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk01_DtlR createChk02_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.create();
		}

		/**
		 * Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> createChk02_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.class);
		}

		/**
		 * Chk02_ShipSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR createChk02_ShipSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.create();
		}

		/**
		 * Chk02_ShipSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> createChk02_ShipSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>immd_pick_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_ship_inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_ship_adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>grp_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>alloc_ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>immd_pick_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_ship_inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_ship_adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>grp_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>alloc_lot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_sublot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_ver_no</td></tr>
		 * 	<tr><td><br></td><td>stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc_base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_from</td></tr>
		 * 	<tr><td><br></td><td>valid_dt_to</td></tr>
		 * 	<tr><td><br></td><td>iv_trd_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>dlv_lg_grp_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録済みの出荷指図を更新する。<br>
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
		private final mcframe.serverMSBE.MSBEL1400.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1400.Upd01_CndR up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> down0;
		
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1400.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
			up3 = mcframe.serverMSBE.MSBEL1400.Upd01_CndR.create();
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Upd01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk01_HdrR createUpd01_HdrR(){
			return mcframe.serverMSBE.MSBEL1400.Chk01_HdrR.create();
		}

		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Chk01_DtlR.class);
		}

		/**
		 * Upd01_ShipSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR createUpd01_ShipSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.create();
		}

		/**
		 * Upd01_ShipSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> createUpd01_ShipSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
		}

		/**
		 * Upd01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Upd01_CndR createUpd01_CndR(){
			return mcframe.serverMSBE.MSBEL1400.Upd01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>inst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>immd_pick_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_ship_inst_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>immd_ship_adv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>lot_chk_off_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Chk01_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>grp_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>inst_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>tmp_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>iv_d_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc_sno4</td></tr>
		 * 	<tr><td><br></td><td>alloc_ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Upd01_CndR
		 */
		public mcframe.serverMSBE.MSBEL1400.Upd01_CndR up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk03オペレーション.<p>
	 *
	 * 出荷指図を取り消す前に、チェックを実行します。<br>
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
		private final mcframe.serverMSBE.MSBEL1400.Chk03_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Chk03_DtlR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1400.Chk03_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Chk03_DtlR> down1;
		
		
		// コンストラクタ
		protected Chk03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1400.Chk03_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL1400.Chk03_DtlR.class);
			down0 = mcframe.serverMSBE.MSBEL1400.Chk03_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBE.MSBEL1400.Chk03_DtlR.class);

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
			invoke((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Chk03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk03_HdrR createChk03_HdrR(){
			return mcframe.serverMSBE.MSBEL1400.Chk03_HdrR.create();
		}

		/**
		 * Chk03_ShipSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR createChk03_ShipSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.create();
		}

		/**
		 * Chk03_ShipSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> createChk03_ShipSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
		}

		/**
		 * Chk03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk03_DtlR createChk03_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Chk03_DtlR.create();
		}

		/**
		 * Chk03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk03_DtlR> createChk03_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Chk03_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Chk03_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk03_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk03_DtlR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Chk03_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk03_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk03_DtlR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this).info;
		}


	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 登録済みの出荷指図を取消す。<br>
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
		private final mcframe.serverMSBE.MSBEL1400.Chk03_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Chk03_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1400.Del01_CndR up3;
		
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1400.Chk03_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL1400.Chk03_DtlR.class);
			up3 = mcframe.serverMSBE.MSBEL1400.Del01_CndR.create();

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk03_HdrR createDel01_HdrR(){
			return mcframe.serverMSBE.MSBEL1400.Chk03_HdrR.create();
		}

		/**
		 * Del01_ShipSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR createDel01_ShipSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.create();
		}

		/**
		 * Del01_ShipSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> createDel01_ShipSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR.class);
		}

		/**
		 * Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk03_DtlR createDel01_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Chk03_DtlR.create();
		}

		/**
		 * Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk03_DtlR> createDel01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Chk03_DtlR.class);
		}

		/**
		 * Del01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Del01_CndR createDel01_CndR(){
			return mcframe.serverMSBE.MSBEL1400.Del01_CndR.create();
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>immd_dlv_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Chk03_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk03_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Srch01_ShipSchd_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk03_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Del01_CndR
		 */
		public mcframe.serverMSBE.MSBEL1400.Del01_CndR up3() {
			return up3;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this).info;
		}


	}
	/**
	 * Chk04オペレーション.<p>
	 *
	 * 帳票を発行する前に、チェックを実行します。<br>
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
		private final mcframe.serverMSBE.MSBEL1400.Chk04_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Chk04_DtlR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1400.Chk04_HdrR down0;
		
		
		// コンストラクタ
		protected Chk04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1400.Chk04_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL1400.Chk04_DtlR.class);
			down0 = mcframe.serverMSBE.MSBEL1400.Chk04_HdrR.create();

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
			invoke((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Chk04_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk04_HdrR createChk04_HdrR(){
			return mcframe.serverMSBE.MSBEL1400.Chk04_HdrR.create();
		}

		/**
		 * Chk04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk04_DtlR createChk04_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Chk04_DtlR.create();
		}

		/**
		 * Chk04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk04_DtlR> createChk04_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Chk04_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_btn_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_prnt_btn_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_prnt_btn_flg</td></tr>
		 * 	<tr><td><br></td><td>pick_prnt_btn_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Chk04_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk04_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Chk04_DtlR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_btn_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_prnt_btn_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_prnt_btn_flg</td></tr>
		 * 	<tr><td><br></td><td>pick_prnt_btn_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Chk04_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk04_HdrR down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this).info;
		}


	}
	/**
	 * Prnt01オペレーション.<p>
	 *
	 * 帳票を発行する。<br>
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
		private final mcframe.serverMSBE.MSBEL1400.Chk04_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL1400.Prnt01_CndR up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Prnt01_DtlR> up2;
		
		
		// コンストラクタ
		protected Prnt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL1400.Chk04_HdrR.create();
			up1 = mcframe.serverMSBE.MSBEL1400.Prnt01_CndR.create();
			up2 = MCList.create(mcframe.serverMSBE.MSBEL1400.Prnt01_DtlR.class);

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
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Prnt01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk04_HdrR createPrnt01_HdrR(){
			return mcframe.serverMSBE.MSBEL1400.Chk04_HdrR.create();
		}

		/**
		 * Prnt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Prnt01_CndR createPrnt01_CndR(){
			return mcframe.serverMSBE.MSBEL1400.Prnt01_CndR.create();
		}

		/**
		 * Prnt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Prnt01_DtlR createPrnt01_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Prnt01_DtlR.create();
		}

		/**
		 * Prnt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Prnt01_DtlR> createPrnt01_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Prnt01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_inst_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_rev</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dlv_prnt_btn_flg</td></tr>
		 * 	<tr><td><br></td><td>adv_prnt_btn_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_prnt_btn_flg</td></tr>
		 * 	<tr><td><br></td><td>pick_prnt_btn_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Chk04_HdrR
		 */
		public mcframe.serverMSBE.MSBEL1400.Chk04_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>indiv_prnt_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL1400.Prnt01_CndR
		 */
		public mcframe.serverMSBE.MSBEL1400.Prnt01_CndR up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Prnt01_DtlR> up2() {
			return up2;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this).info;
		}


	}
	/**
	 * Sprt02オペレーション.<p>
	 *
	 * 支給元の支給計上日を取得する。<br>
	 */
	abstract public class Sprt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Sprt02_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL1400.Sprt02_DtlR> down0;
		
		
		// コンストラクタ
		protected Sprt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL1400.Sprt02_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL1400.Sprt02_DtlR.class);

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
			invoke((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL1400.Sprt02_DtlR createSprt02_DtlR(){
			return mcframe.serverMSBE.MSBEL1400.Sprt02_DtlR.create();
		}

		/**
		 * Sprt02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Sprt02_DtlR> createSprt02_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL1400.Sprt02_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Sprt02_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>base_ac_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL1400.Sprt02_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipInstReg)MSBEL_ShipInstReg_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}