package mcframe.serverMSBE.MSBEL5500;

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
 * "MSBEL_ShipSchdService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEL_ShipSchdService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBEL5500";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBEL_ShipSchdService.ShipSchd_Upd01 aShipSchd_Upd01;

	protected void initShipSchd_Upd01() {
		this.info = PDef.MS_MSBEL5500_ShipSchd_Upd01_INFO;
		this.aShipSchd_Upd01 = ((MSBEL_ShipSchdService)this).new ShipSchd_Upd01();
	}

	public static MSBEL_ShipSchdService.ShipSchd_Upd01 crtShipSchd_Upd01() {
		MSBEL_ShipSchdService lgc = new MSBEL_ShipSchdService();
		lgc.initShipSchd_Upd01();
		return lgc.aShipSchd_Upd01;
	}

	protected void paramShipSchd_Upd01(MCParam p) {
		if (this.aShipSchd_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipSchd_Upd01.up0());
		p.addUpBlock(aShipSchd_Upd01.up1());
		p.addDownBlock(aShipSchd_Upd01.down0());
	}

	protected void doShipSchd_Upd01() {
		aShipSchd_Upd01.call();
	};

	/**
	 * ShipPr_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR createShipPr_DtlR(){
		return mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR.create();
	}

	/**
	 * ShipPr_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR> createShipPr_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR.class);
	}

	/**
	 * Alloc_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5500.Alloc_RsltR createAlloc_RsltR(){
		return mcframe.serverMSBE.MSBEL5500.Alloc_RsltR.create();
	}

	/**
	 * Alloc_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5500.Alloc_RsltR> createAlloc_RsltL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5500.Alloc_RsltR.class);
	}
	protected MSBEL_ShipSchdService.ShipSchd_Upd02 aShipSchd_Upd02;

	protected void initShipSchd_Upd02() {
		this.info = PDef.MS_MSBEL5500_ShipSchd_Upd02_INFO;
		this.aShipSchd_Upd02 = ((MSBEL_ShipSchdService)this).new ShipSchd_Upd02();
	}

	public static MSBEL_ShipSchdService.ShipSchd_Upd02 crtShipSchd_Upd02() {
		MSBEL_ShipSchdService lgc = new MSBEL_ShipSchdService();
		lgc.initShipSchd_Upd02();
		return lgc.aShipSchd_Upd02;
	}

	protected void paramShipSchd_Upd02(MCParam p) {
		if (this.aShipSchd_Upd02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipSchd_Upd02.up0());
		p.addUpBlock(aShipSchd_Upd02.up1());
		p.addUpBlock(aShipSchd_Upd02.up2());
		p.addUpBlock(aShipSchd_Upd02.up3());
		p.addDownBlock(aShipSchd_Upd02.down0());
	}

	protected void doShipSchd_Upd02() {
		aShipSchd_Upd02.call();
	};

	/**
	 * ShipSchd_CtrlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5500.ShipSchd_CtrlR createShipSchd_CtrlR(){
		return mcframe.serverMSBE.MSBEL5500.ShipSchd_CtrlR.create();
	}

	/**
	 * ShipSchd_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR createShipSchd_DtlR(){
		return mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR.create();
	}

	/**
	 * ShipSchd_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR> createShipSchd_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR.class);
	}

	/**
	 * ShipSchd_Upd02_RdelブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd02_RdelR createShipSchd_Upd02_RdelR(){
		return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd02_RdelR.create();
	}

	/**
	 * ShipSchd_Upd02_RdelブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd02_RdelR> createShipSchd_Upd02_RdelL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd02_RdelR.class);
	}
	protected MSBEL_ShipSchdService.ShipSchd_Upd03 aShipSchd_Upd03;

	protected void initShipSchd_Upd03() {
		this.info = PDef.MS_MSBEL5500_ShipSchd_Upd03_INFO;
		this.aShipSchd_Upd03 = ((MSBEL_ShipSchdService)this).new ShipSchd_Upd03();
	}

	public static MSBEL_ShipSchdService.ShipSchd_Upd03 crtShipSchd_Upd03() {
		MSBEL_ShipSchdService lgc = new MSBEL_ShipSchdService();
		lgc.initShipSchd_Upd03();
		return lgc.aShipSchd_Upd03;
	}

	protected void paramShipSchd_Upd03(MCParam p) {
		if (this.aShipSchd_Upd03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipSchd_Upd03.up0());
		p.addUpBlock(aShipSchd_Upd03.up1());
	}

	protected void doShipSchd_Upd03() {
		aShipSchd_Upd03.call();
	};

	/**
	 * ShipSchd_Upd03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_DtlR createShipSchd_Upd03_DtlR(){
		return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_DtlR.create();
	}

	/**
	 * ShipSchd_Upd03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_DtlR> createShipSchd_Upd03_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_DtlR.class);
	}

	/**
	 * ShipSchd_Upd03_ActDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_ActDtlR createShipSchd_Upd03_ActDtlR(){
		return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_ActDtlR.create();
	}

	/**
	 * ShipSchd_Upd03_ActDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_ActDtlR> createShipSchd_Upd03_ActDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_ActDtlR.class);
	}
	protected MSBEL_ShipSchdService.ShipSchd_Upd04 aShipSchd_Upd04;

	protected void initShipSchd_Upd04() {
		this.info = PDef.MS_MSBEL5500_ShipSchd_Upd04_INFO;
		this.aShipSchd_Upd04 = ((MSBEL_ShipSchdService)this).new ShipSchd_Upd04();
	}

	public static MSBEL_ShipSchdService.ShipSchd_Upd04 crtShipSchd_Upd04() {
		MSBEL_ShipSchdService lgc = new MSBEL_ShipSchdService();
		lgc.initShipSchd_Upd04();
		return lgc.aShipSchd_Upd04;
	}

	protected void paramShipSchd_Upd04(MCParam p) {
		if (this.aShipSchd_Upd04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipSchd_Upd04.up0());
		p.addUpBlock(aShipSchd_Upd04.up1());
	}

	protected void doShipSchd_Upd04() {
		aShipSchd_Upd04.call();
	};

	/**
	 * ShipSchd_Upd04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_DtlR createShipSchd_Upd04_DtlR(){
		return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_DtlR.create();
	}

	/**
	 * ShipSchd_Upd04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_DtlR> createShipSchd_Upd04_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_DtlR.class);
	}

	/**
	 * ShipSchd_Upd04_ActDtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_ActDtlR createShipSchd_Upd04_ActDtlR(){
		return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_ActDtlR.create();
	}

	/**
	 * ShipSchd_Upd04_ActDtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_ActDtlR> createShipSchd_Upd04_ActDtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_ActDtlR.class);
	}
	protected MSBEL_ShipSchdService.ShipSchd_Upd05 aShipSchd_Upd05;

	protected void initShipSchd_Upd05() {
		this.info = PDef.MS_MSBEL5500_ShipSchd_Upd05_INFO;
		this.aShipSchd_Upd05 = ((MSBEL_ShipSchdService)this).new ShipSchd_Upd05();
	}

	public static MSBEL_ShipSchdService.ShipSchd_Upd05 crtShipSchd_Upd05() {
		MSBEL_ShipSchdService lgc = new MSBEL_ShipSchdService();
		lgc.initShipSchd_Upd05();
		return lgc.aShipSchd_Upd05;
	}

	protected void paramShipSchd_Upd05(MCParam p) {
		if (this.aShipSchd_Upd05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipSchd_Upd05.up0());
	}

	protected void doShipSchd_Upd05() {
		aShipSchd_Upd05.call();
	};

	/**
	 * ShipSchd_Upd05_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd05_DtlR createShipSchd_Upd05_DtlR(){
		return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd05_DtlR.create();
	}

	/**
	 * ShipSchd_Upd05_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd05_DtlR> createShipSchd_Upd05_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd05_DtlR.class);
	}
	protected MSBEL_ShipSchdService.ShipSchd_Upd06 aShipSchd_Upd06;

	protected void initShipSchd_Upd06() {
		this.info = PDef.MS_MSBEL5500_ShipSchd_Upd06_INFO;
		this.aShipSchd_Upd06 = ((MSBEL_ShipSchdService)this).new ShipSchd_Upd06();
	}

	public static MSBEL_ShipSchdService.ShipSchd_Upd06 crtShipSchd_Upd06() {
		MSBEL_ShipSchdService lgc = new MSBEL_ShipSchdService();
		lgc.initShipSchd_Upd06();
		return lgc.aShipSchd_Upd06;
	}

	protected void paramShipSchd_Upd06(MCParam p) {
		if (this.aShipSchd_Upd06 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipSchd_Upd06.up0());
	}

	protected void doShipSchd_Upd06() {
		aShipSchd_Upd06.call();
	};

	/**
	 * ShipSchd_Upd06_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR createShipSchd_Upd06_DtlR(){
		return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR.create();
	}

	/**
	 * ShipSchd_Upd06_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR> createShipSchd_Upd06_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR.class);
	}
	protected MSBEL_ShipSchdService.ShipSchd_Upd07 aShipSchd_Upd07;

	protected void initShipSchd_Upd07() {
		this.info = PDef.MS_MSBEL5500_ShipSchd_Upd07_INFO;
		this.aShipSchd_Upd07 = ((MSBEL_ShipSchdService)this).new ShipSchd_Upd07();
	}

	public static MSBEL_ShipSchdService.ShipSchd_Upd07 crtShipSchd_Upd07() {
		MSBEL_ShipSchdService lgc = new MSBEL_ShipSchdService();
		lgc.initShipSchd_Upd07();
		return lgc.aShipSchd_Upd07;
	}

	protected void paramShipSchd_Upd07(MCParam p) {
		if (this.aShipSchd_Upd07 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipSchd_Upd07.up0());
	}

	protected void doShipSchd_Upd07() {
		aShipSchd_Upd07.call();
	};

	/**
	 * ShipSchd_Upd07_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd07_DtlR createShipSchd_Upd07_DtlR(){
		return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd07_DtlR.create();
	}

	/**
	 * ShipSchd_Upd07_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd07_DtlR> createShipSchd_Upd07_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd07_DtlR.class);
	}
	protected MSBEL_ShipSchdService.ShipSchd_Upd08 aShipSchd_Upd08;

	protected void initShipSchd_Upd08() {
		this.info = PDef.MS_MSBEL5500_ShipSchd_Upd08_INFO;
		this.aShipSchd_Upd08 = ((MSBEL_ShipSchdService)this).new ShipSchd_Upd08();
	}

	public static MSBEL_ShipSchdService.ShipSchd_Upd08 crtShipSchd_Upd08() {
		MSBEL_ShipSchdService lgc = new MSBEL_ShipSchdService();
		lgc.initShipSchd_Upd08();
		return lgc.aShipSchd_Upd08;
	}

	protected void paramShipSchd_Upd08(MCParam p) {
		if (this.aShipSchd_Upd08 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipSchd_Upd08.up0());
	}

	protected void doShipSchd_Upd08() {
		aShipSchd_Upd08.call();
	};

	/**
	 * ShipSchd_Upd08_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd08_DtlR createShipSchd_Upd08_DtlR(){
		return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd08_DtlR.create();
	}

	/**
	 * ShipSchd_Upd08_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd08_DtlR> createShipSchd_Upd08_DtlL(){
		return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd08_DtlR.class);
	}
	protected MSBEL_ShipSchdService.ShipSchd_Chk01 aShipSchd_Chk01;

	protected void initShipSchd_Chk01() {
		this.info = PDef.MS_MSBEL5500_ShipSchd_Chk01_INFO;
		this.aShipSchd_Chk01 = ((MSBEL_ShipSchdService)this).new ShipSchd_Chk01();
	}

	public static MSBEL_ShipSchdService.ShipSchd_Chk01 crtShipSchd_Chk01() {
		MSBEL_ShipSchdService lgc = new MSBEL_ShipSchdService();
		lgc.initShipSchd_Chk01();
		return lgc.aShipSchd_Chk01;
	}

	protected void paramShipSchd_Chk01(MCParam p) {
		if (this.aShipSchd_Chk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipSchd_Chk01.up0());
		p.addDownBlock(aShipSchd_Chk01.down0());
	}

	protected void doShipSchd_Chk01() {
		aShipSchd_Chk01.call();
	};
	protected MSBEL_ShipSchdService.ShipSchd_Chk02 aShipSchd_Chk02;

	protected void initShipSchd_Chk02() {
		this.info = PDef.MS_MSBEL5500_ShipSchd_Chk02_INFO;
		this.aShipSchd_Chk02 = ((MSBEL_ShipSchdService)this).new ShipSchd_Chk02();
	}

	public static MSBEL_ShipSchdService.ShipSchd_Chk02 crtShipSchd_Chk02() {
		MSBEL_ShipSchdService lgc = new MSBEL_ShipSchdService();
		lgc.initShipSchd_Chk02();
		return lgc.aShipSchd_Chk02;
	}

	protected void paramShipSchd_Chk02(MCParam p) {
		if (this.aShipSchd_Chk02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipSchd_Chk02.up0());
		p.addDownBlock(aShipSchd_Chk02.down0());
	}

	protected void doShipSchd_Chk02() {
		aShipSchd_Chk02.call();
	};
	protected MSBEL_ShipSchdService.ShipSchd_Chk06 aShipSchd_Chk06;

	protected void initShipSchd_Chk06() {
		this.info = PDef.MS_MSBEL5500_ShipSchd_Chk06_INFO;
		this.aShipSchd_Chk06 = ((MSBEL_ShipSchdService)this).new ShipSchd_Chk06();
	}

	public static MSBEL_ShipSchdService.ShipSchd_Chk06 crtShipSchd_Chk06() {
		MSBEL_ShipSchdService lgc = new MSBEL_ShipSchdService();
		lgc.initShipSchd_Chk06();
		return lgc.aShipSchd_Chk06;
	}

	protected void paramShipSchd_Chk06(MCParam p) {
		if (this.aShipSchd_Chk06 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aShipSchd_Chk06.up0());
		p.addDownBlock(aShipSchd_Chk06.down0());
	}

	protected void doShipSchd_Chk06() {
		aShipSchd_Chk06.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ShipSchd_Upd01オペレーション.<p>
	 *
	 * 受注、移送、支給予定に対応する出荷進捗情報および出荷予定情報を作成する。<br>
	 */
	abstract public class ShipSchd_Upd01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipSchd_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.Alloc_RsltR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR> down0;
		
		
		// コンストラクタ
		protected ShipSchd_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5500.Alloc_RsltR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR.class);

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
			invoke((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipPr_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR createShipPr_DtlR(){
			return mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR.create();
		}

		/**
		 * ShipPr_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR> createShipPr_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR.class);
		}

		/**
		 * Alloc_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5500.Alloc_RsltR createAlloc_RsltR(){
			return mcframe.serverMSBE.MSBEL5500.Alloc_RsltR.create();
		}

		/**
		 * Alloc_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.Alloc_RsltR> createAlloc_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5500.Alloc_RsltR.class);
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
		 * 	<tr><td><br></td><td>sp.ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>sp.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sp.slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>sp.xfr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sp.rqst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.rqst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>sp.prms_dt</td></tr>
		 * 	<tr><td><br></td><td>sp.prms_dlv_dt</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_inst_rcpt_dt</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_inst_prms_dt</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_to_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_id_typ</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_id_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_id_nm</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_to_id_typ</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_to_id_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_to_id_nm</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_to_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_to_addr1</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_to_addr2</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_to_addr3</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_to_addr4</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_to_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_to_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_to_tel</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_to_fax</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_to_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sp.via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>sp.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sp.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sp.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.prms_qty</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_inst_rcpt_qty</td></tr>
		 * 	<tr><td><br></td><td>sp.dlv_inst_prms_qty</td></tr>
		 * 	<tr><td><br></td><td>sp.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sp.rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>sp.purc_ddlv_flg</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>sp.alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>sp.not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sp.alloc_typ</td></tr>
		 * 	<tr><td><br></td><td>sp.alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.def_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.period_block_flg</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sp.io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>sp.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sp.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sp.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ss.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ss.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ss.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ss.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ss.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.sno1</td></tr>
		 * 	<tr><td><br></td><td>ss.sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.sno2</td></tr>
		 * 	<tr><td><br></td><td>ss.sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.sno3</td></tr>
		 * 	<tr><td><br></td><td>ss.sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.sno4</td></tr>
		 * 	<tr><td><br></td><td>ss.sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.lot_no</td></tr>
		 * 	<tr><td><br></td><td>ss.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ss.ver_no</td></tr>
		 * 	<tr><td><br></td><td>ss.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>ss.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ss.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.not_dt_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ss.vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ss.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ss.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>ss.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ss.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ss.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ss.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ss.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ss.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ss.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_schd_qty_upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>alloc.peg_no</td></tr>
		 * 	<tr><td><br></td><td>alloc.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>alloc.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>alloc.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.lot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc.sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc.sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc.sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc.sno4</td></tr>
		 * 	<tr><td><br></td><td>alloc.ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc.vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>alloc.vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_wait_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.Alloc_RsltR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>sp.ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_schd_tm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this).info;
		}


	}
	/**
	 * ShipSchd_Upd02オペレーション.<p>
	 *
	 * 出荷進捗が存在する出荷に対して出荷予定の追加・更新・削除を行う。<br>
	 */
	abstract public class ShipSchd_Upd02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipSchd_Upd02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBE.MSBEL5500.ShipSchd_CtrlR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.Alloc_RsltR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd02_RdelR> up3;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR> down0;
		
		
		// コンストラクタ
		protected ShipSchd_Upd02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBE.MSBEL5500.ShipSchd_CtrlR.create();
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBE.MSBEL5500.Alloc_RsltR.class);
			up3 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd02_RdelR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR.class);

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
			invoke((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipSchd_CtrlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5500.ShipSchd_CtrlR createShipSchd_CtrlR(){
			return mcframe.serverMSBE.MSBEL5500.ShipSchd_CtrlR.create();
		}

		/**
		 * ShipSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR createShipSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR.create();
		}

		/**
		 * ShipSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR> createShipSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR.class);
		}

		/**
		 * Alloc_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5500.Alloc_RsltR createAlloc_RsltR(){
			return mcframe.serverMSBE.MSBEL5500.Alloc_RsltR.create();
		}

		/**
		 * Alloc_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.Alloc_RsltR> createAlloc_RsltL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5500.Alloc_RsltR.class);
		}

		/**
		 * ShipSchd_Upd02_RdelブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd02_RdelR createShipSchd_Upd02_RdelR(){
			return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd02_RdelR.create();
		}

		/**
		 * ShipSchd_Upd02_RdelブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd02_RdelR> createShipSchd_Upd02_RdelL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd02_RdelR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>lot_chk_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBE.MSBEL5500.ShipSchd_CtrlR
		 */
		public mcframe.serverMSBE.MSBEL5500.ShipSchd_CtrlR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>data_crud_typ</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_inst_rcpt_no</td></tr>
		 * 	<tr><td><br></td><td>ss.slo_prms_no</td></tr>
		 * 	<tr><td><br></td><td>ss.sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_fr_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.wg_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.pd_inst_dlv_tm</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_rqst_tm</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_wk_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ss.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ss.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ss.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ss.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ss.sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.sno1</td></tr>
		 * 	<tr><td><br></td><td>ss.sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.sno2</td></tr>
		 * 	<tr><td><br></td><td>ss.sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.sno3</td></tr>
		 * 	<tr><td><br></td><td>ss.sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.sno4</td></tr>
		 * 	<tr><td><br></td><td>ss.sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.lot_no</td></tr>
		 * 	<tr><td><br></td><td>ss.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ss.ver_no</td></tr>
		 * 	<tr><td><br></td><td>ss.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>ss.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ss.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ss.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>ss.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.iv_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>ss.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.not_dt_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_block_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.inst_bndl_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.not_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ss.vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ss.re_ship_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ss.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>ss.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ss.intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ss.trd_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ss.trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>dlv_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_tel</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_fax</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.tdlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>ss.via_dlv_typ</td></tr>
		 * 	<tr><td><br></td><td>ss.tdlv_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>ss.tdlv_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>ss.tdlv_zip_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.tdlv_addr1</td></tr>
		 * 	<tr><td><br></td><td>ss.tdlv_addr2</td></tr>
		 * 	<tr><td><br></td><td>ss.tdlv_addr3</td></tr>
		 * 	<tr><td><br></td><td>ss.tdlv_addr4</td></tr>
		 * 	<tr><td><br></td><td>ss.tdlv_tel</td></tr>
		 * 	<tr><td><br></td><td>ss.tdlv_fax</td></tr>
		 * 	<tr><td><br></td><td>ss.tdlv_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>ss.sub_char1</td></tr>
		 * 	<tr><td><br></td><td>ss.sub_char2</td></tr>
		 * 	<tr><td><br></td><td>ss.sub_char3</td></tr>
		 * 	<tr><td><br></td><td>is_src_ship_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_ship_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_sls_dlv_dt_adjst_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_schd_qty_upd_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_qty</td></tr>
		 * 	<tr><td><br></td><td>inst_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>inst_ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>inst_dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_judge_flg</td></tr>
		 * 	<tr><td><br></td><td>cred_no_up_flg</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * 	<tr><td><br></td><td>rem_abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>alloc.peg_no</td></tr>
		 * 	<tr><td><br></td><td>alloc.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>alloc.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>alloc.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_insp_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.lot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>alloc.sno1</td></tr>
		 * 	<tr><td><br></td><td>alloc.sno2</td></tr>
		 * 	<tr><td><br></td><td>alloc.sno3</td></tr>
		 * 	<tr><td><br></td><td>alloc.sno4</td></tr>
		 * 	<tr><td><br></td><td>alloc.ver_no</td></tr>
		 * 	<tr><td><br></td><td>alloc.pack_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.pack_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>alloc.vld_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>alloc.vld_dt_to</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_wait_flg</td></tr>
		 * 	<tr><td><br></td><td>alloc_scope_typ</td></tr>
		 * 	<tr><td><br></td><td>ent_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>wms_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.Alloc_RsltR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd02_RdelR> up3() {
			return up3;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_schd_tm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this).info;
		}


	}
	/**
	 * ShipSchd_Upd03オペレーション.<p>
	 *
	 * 出荷引当状況に対する出荷実績を更新する。<br>
	 */
	abstract public class ShipSchd_Upd03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipSchd_Upd03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_ActDtlR> up1;
		
		
		// コンストラクタ
		protected ShipSchd_Upd03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_DtlR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_ActDtlR.class);

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
			invoke((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ShipSchd_Upd03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_DtlR createShipSchd_Upd03_DtlR(){
			return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_DtlR.create();
		}

		/**
		 * ShipSchd_Upd03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_DtlR> createShipSchd_Upd03_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_DtlR.class);
		}

		/**
		 * ShipSchd_Upd03_ActDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_ActDtlR createShipSchd_Upd03_ActDtlR(){
			return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_ActDtlR.create();
		}

		/**
		 * ShipSchd_Upd03_ActDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_ActDtlR> createShipSchd_Upd03_ActDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_ActDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_d_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd03_ActDtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this).info;
		}


	}
	/**
	 * ShipSchd_Upd04オペレーション.<p>
	 *
	 * 出荷進捗、出荷予定のインボイス予定・実績数を更新する。<br>
	 */
	abstract public class ShipSchd_Upd04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipSchd_Upd04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_ActDtlR> up1;
		
		
		// コンストラクタ
		protected ShipSchd_Upd04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_DtlR.class);
			up1 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_ActDtlR.class);

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
			invoke((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ShipSchd_Upd04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_DtlR createShipSchd_Upd04_DtlR(){
			return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_DtlR.create();
		}

		/**
		 * ShipSchd_Upd04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_DtlR> createShipSchd_Upd04_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_DtlR.class);
		}

		/**
		 * ShipSchd_Upd04_ActDtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_ActDtlR createShipSchd_Upd04_ActDtlR(){
			return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_ActDtlR.create();
		}

		/**
		 * ShipSchd_Upd04_ActDtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_ActDtlR> createShipSchd_Upd04_ActDtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_ActDtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>iv_ship_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd04_ActDtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this).info;
		}


	}
	/**
	 * ShipSchd_Upd05オペレーション.<p>
	 *
	 * 出荷進捗、出荷予定の売上数、出荷返品数および納品数量を更新する。<br>
	 */
	abstract public class ShipSchd_Upd05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipSchd_Upd05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd05_DtlR> up0;
		
		
		// コンストラクタ
		protected ShipSchd_Upd05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd05_DtlR.class);

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
			invoke((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ShipSchd_Upd05_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd05_DtlR createShipSchd_Upd05_DtlR(){
			return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd05_DtlR.create();
		}

		/**
		 * ShipSchd_Upd05_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd05_DtlR> createShipSchd_Upd05_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd05_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ship_ret_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd05_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this).info;
		}


	}
	/**
	 * ShipSchd_Upd06オペレーション.<p>
	 *
	 * 出荷予定、または出荷引当状況ごとに引当解除を行う。<br>
	 */
	abstract public class ShipSchd_Upd06 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipSchd_Upd06";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR> up0;
		
		
		// コンストラクタ
		protected ShipSchd_Upd06() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR.class);

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
			invoke((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ShipSchd_Upd06_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR createShipSchd_Upd06_DtlR(){
			return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR.create();
		}

		/**
		 * ShipSchd_Upd06_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR> createShipSchd_Upd06_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>alloc_rel_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this).info;
		}


	}
	/**
	 * ShipSchd_Upd07オペレーション.<p>
	 *
	 * 出荷引当状況の現品票発行済フラグをオン(発行済)に更新する。<br>
	 */
	abstract public class ShipSchd_Upd07 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipSchd_Upd07";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd07_DtlR> up0;
		
		
		// コンストラクタ
		protected ShipSchd_Upd07() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd07_DtlR.class);

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
			invoke((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ShipSchd_Upd07_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd07_DtlR createShipSchd_Upd07_DtlR(){
			return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd07_DtlR.create();
		}

		/**
		 * ShipSchd_Upd07_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd07_DtlR> createShipSchd_Upd07_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd07_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd07_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this).info;
		}


	}
	/**
	 * ShipSchd_Upd08オペレーション.<p>
	 *
	 * 売上明細訂正画面で預り売上を訂正した場合、売上実績明細ＮＯを出荷予定に反映する。<br>
	 */
	abstract public class ShipSchd_Upd08 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipSchd_Upd08";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd08_DtlR> up0;
		
		
		// コンストラクタ
		protected ShipSchd_Upd08() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd08_DtlR.class);

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
			invoke((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ShipSchd_Upd08_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd08_DtlR createShipSchd_Upd08_DtlR(){
			return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd08_DtlR.create();
		}

		/**
		 * ShipSchd_Upd08_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd08_DtlR> createShipSchd_Upd08_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd08_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ss.ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ss.sls_act_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd08_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this).info;
		}


	}
	/**
	 * ShipSchd_Chk01オペレーション.<p>
	 *
	 * 更新（出荷進捗・予定）を実行する前のチェック処理を行う。<br>
	 */
	abstract public class ShipSchd_Chk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipSchd_Chk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR> down0;
		
		
		// コンストラクタ
		protected ShipSchd_Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR.class);

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
			invoke((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipPr_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR createShipPr_DtlR(){
			return mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR.create();
		}

		/**
		 * ShipPr_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR> createShipPr_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR.class);
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
		 * 	<tr><td><br></td><td>sp.ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>sp.trd_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>sp.trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sp.trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>sp.base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>sp.base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.itm_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>ss.itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>ss.itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ss.itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ss.iv_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ss.sno1</td></tr>
		 * 	<tr><td><br></td><td>ss.sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.sno2</td></tr>
		 * 	<tr><td><br></td><td>ss.sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.sno3</td></tr>
		 * 	<tr><td><br></td><td>ss.sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.sno4</td></tr>
		 * 	<tr><td><br></td><td>ss.sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.lot_no</td></tr>
		 * 	<tr><td><br></td><td>ss.sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ss.ver_no</td></tr>
		 * 	<tr><td><br></td><td>ss.stk_arrv_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.gd_cd</td></tr>
		 * 	<tr><td><br></td><td>ss.quality_typ</td></tr>
		 * 	<tr><td><br></td><td>ss.stk_id_typ</td></tr>
		 * 	<tr><td><br></td><td>ss.stk_bp_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_act_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipPr_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this).info;
		}


	}
	/**
	 * ShipSchd_Chk02オペレーション.<p>
	 *
	 * 更新（出荷予定）を実行する前のチェック処理を行う。<br>
	 */
	abstract public class ShipSchd_Chk02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipSchd_Chk02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR> down0;
		
		
		// コンストラクタ
		protected ShipSchd_Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR.class);

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
			invoke((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipSchd_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR createShipSchd_DtlR(){
			return mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR.create();
		}

		/**
		 * ShipSchd_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR> createShipSchd_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR.class);
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
		 * 	<tr><td><br></td><td>ss.ship_schd_no</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_pr_no</td></tr>
		 * 	<tr><td><br></td><td>ss.ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ss.dlv_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>ss.abort_flg</td></tr>
		 * 	<tr><td><br></td><td>ss.base_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ss.base_prov_act_no</td></tr>
		 * 	<tr><td><br></td><td>ss.base_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>is_src_ship_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_ship_schd_flg</td></tr>
		 * 	<tr><td><br></td><td>is_src_sls_dlv_dt_adjst_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_chk_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>inst_ship_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>inst_dlv_schd_tm</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ship_inst_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_act_flg</td></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this).info;
		}


	}
	/**
	 * ShipSchd_Chk06オペレーション.<p>
	 *
	 * 更新（引当解除）を実行する前のチェック処理を行う。<br>
	 */
	abstract public class ShipSchd_Chk06 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ShipSchd_Chk06";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR> down0;
		
		
		// コンストラクタ
		protected ShipSchd_Chk06() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR.class);

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
			invoke((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ShipSchd_Upd06_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR createShipSchd_Upd06_DtlR(){
			return mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR.create();
		}

		/**
		 * ShipSchd_Upd06_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR> createShipSchd_Upd06_DtlL(){
			return MCList.create(mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>ship_alloc_sts_no</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR> up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBE.MSBEL5500.ShipSchd_Upd06_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBEL_ShipSchdService)MSBEL_ShipSchdService_MC_A.this).info;
		}


	}

	//FMCB LOGIC_CONTROLLER END
}