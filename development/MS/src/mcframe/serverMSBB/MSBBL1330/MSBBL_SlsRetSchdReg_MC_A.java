package mcframe.serverMSBB.MSBBL1330;

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
 * "MSBBL_SlsRetSchdReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBBL_SlsRetSchdReg_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBBL1330";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBBL_SlsRetSchdReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBBL1330_Srch01_INFO;
		this.aSrch01 = ((MSBBL_SlsRetSchdReg)this).new Srch01();
	}

	public static MSBBL_SlsRetSchdReg.Srch01 crtSrch01() {
		MSBBL_SlsRetSchdReg lgc = new MSBBL_SlsRetSchdReg();
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
	public mcframe.serverMSBB.MSBBL1330.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBB.MSBBL1330.Srch01_CndR.create();
	}

	/**
	 * Srch01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Srch01_HdrR createSrch01_HdrR(){
		return mcframe.serverMSBB.MSBBL1330.Srch01_HdrR.create();
	}

	/**
	 * Srch01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Srch01_DtlR createSrch01_DtlR(){
		return mcframe.serverMSBB.MSBBL1330.Srch01_DtlR.create();
	}

	/**
	 * Srch01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1330.Srch01_DtlR> createSrch01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1330.Srch01_DtlR.class);
	}

	/**
	 * Srch01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Srch01_IoR createSrch01_IoR(){
		return mcframe.serverMSBB.MSBBL1330.Srch01_IoR.create();
	}

	/**
	 * Srch01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1330.Srch01_IoR> createSrch01_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1330.Srch01_IoR.class);
	}
	protected MSBBL_SlsRetSchdReg.Srch03 aSrch03;

	protected void initSrch03() {
		this.info = PDef.MS_MSBBL1330_Srch03_INFO;
		this.aSrch03 = ((MSBBL_SlsRetSchdReg)this).new Srch03();
	}

	public static MSBBL_SlsRetSchdReg.Srch03 crtSrch03() {
		MSBBL_SlsRetSchdReg lgc = new MSBBL_SlsRetSchdReg();
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
	public mcframe.serverMSBB.MSBBL1330.Srch01_CndR createSrch03_CndR(){
		return mcframe.serverMSBB.MSBBL1330.Srch01_CndR.create();
	}

	/**
	 * Srch03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Srch01_HdrR createSrch03_HdrR(){
		return mcframe.serverMSBB.MSBBL1330.Srch01_HdrR.create();
	}

	/**
	 * Srch03_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Srch01_DtlR createSrch03_DtlR(){
		return mcframe.serverMSBB.MSBBL1330.Srch01_DtlR.create();
	}

	/**
	 * Srch03_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1330.Srch01_DtlR> createSrch03_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1330.Srch01_DtlR.class);
	}

	/**
	 * Srch03_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Srch01_IoR createSrch03_IoR(){
		return mcframe.serverMSBB.MSBBL1330.Srch01_IoR.create();
	}

	/**
	 * Srch03_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1330.Srch01_IoR> createSrch03_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1330.Srch01_IoR.class);
	}
	protected MSBBL_SlsRetSchdReg.Srch04 aSrch04;

	protected void initSrch04() {
		this.info = PDef.MS_MSBBL1330_Srch04_INFO;
		this.aSrch04 = ((MSBBL_SlsRetSchdReg)this).new Srch04();
	}

	public static MSBBL_SlsRetSchdReg.Srch04 crtSrch04() {
		MSBBL_SlsRetSchdReg lgc = new MSBBL_SlsRetSchdReg();
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
	public mcframe.serverMSBB.MSBBL1330.Srch01_CndR createSrch04_CndR(){
		return mcframe.serverMSBB.MSBBL1330.Srch01_CndR.create();
	}

	/**
	 * Srch04_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Srch01_HdrR createSrch04_HdrR(){
		return mcframe.serverMSBB.MSBBL1330.Srch01_HdrR.create();
	}

	/**
	 * Srch04_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Srch01_DtlR createSrch04_DtlR(){
		return mcframe.serverMSBB.MSBBL1330.Srch01_DtlR.create();
	}

	/**
	 * Srch04_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1330.Srch01_DtlR> createSrch04_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1330.Srch01_DtlR.class);
	}

	/**
	 * Srch04_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Srch01_IoR createSrch04_IoR(){
		return mcframe.serverMSBB.MSBBL1330.Srch01_IoR.create();
	}

	/**
	 * Srch04_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1330.Srch01_IoR> createSrch04_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1330.Srch01_IoR.class);
	}
	protected MSBBL_SlsRetSchdReg.Chk01 aChk01;

	protected void initChk01() {
		this.info = PDef.MS_MSBBL1330_Chk01_INFO;
		this.aChk01 = ((MSBBL_SlsRetSchdReg)this).new Chk01();
	}

	public static MSBBL_SlsRetSchdReg.Chk01 crtChk01() {
		MSBBL_SlsRetSchdReg lgc = new MSBBL_SlsRetSchdReg();
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
	public mcframe.serverMSBB.MSBBL1330.Chk01_HdrR createChk01_HdrR(){
		return mcframe.serverMSBB.MSBBL1330.Chk01_HdrR.create();
	}

	/**
	 * Chk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Chk01_DtlR createChk01_DtlR(){
		return mcframe.serverMSBB.MSBBL1330.Chk01_DtlR.create();
	}

	/**
	 * Chk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> createChk01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR.class);
	}

	/**
	 * Chk01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Chk01_IoR createChk01_IoR(){
		return mcframe.serverMSBB.MSBBL1330.Chk01_IoR.create();
	}

	/**
	 * Chk01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> createChk01_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_IoR.class);
	}
	protected MSBBL_SlsRetSchdReg.Ins01 aIns01;

	protected void initIns01() {
		this.info = PDef.MS_MSBBL1330_Ins01_INFO;
		this.aIns01 = ((MSBBL_SlsRetSchdReg)this).new Ins01();
	}

	public static MSBBL_SlsRetSchdReg.Ins01 crtIns01() {
		MSBBL_SlsRetSchdReg lgc = new MSBBL_SlsRetSchdReg();
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
	public mcframe.serverMSBB.MSBBL1330.Chk01_HdrR createIns01_HdrR(){
		return mcframe.serverMSBB.MSBBL1330.Chk01_HdrR.create();
	}

	/**
	 * Ins01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Chk01_DtlR createIns01_DtlR(){
		return mcframe.serverMSBB.MSBBL1330.Chk01_DtlR.create();
	}

	/**
	 * Ins01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> createIns01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR.class);
	}

	/**
	 * Ins01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Chk01_IoR createIns01_IoR(){
		return mcframe.serverMSBB.MSBBL1330.Chk01_IoR.create();
	}

	/**
	 * Ins01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> createIns01_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_IoR.class);
	}
	protected MSBBL_SlsRetSchdReg.Chk02 aChk02;

	protected void initChk02() {
		this.info = PDef.MS_MSBBL1330_Chk02_INFO;
		this.aChk02 = ((MSBBL_SlsRetSchdReg)this).new Chk02();
	}

	public static MSBBL_SlsRetSchdReg.Chk02 crtChk02() {
		MSBBL_SlsRetSchdReg lgc = new MSBBL_SlsRetSchdReg();
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
	public mcframe.serverMSBB.MSBBL1330.Chk02_HdrR createChk02_HdrR(){
		return mcframe.serverMSBB.MSBBL1330.Chk02_HdrR.create();
	}

	/**
	 * Chk02_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Chk02_DtlR createChk02_DtlR(){
		return mcframe.serverMSBB.MSBBL1330.Chk02_DtlR.create();
	}

	/**
	 * Chk02_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> createChk02_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk02_DtlR.class);
	}

	/**
	 * Chk02_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Chk02_IoR createChk02_IoR(){
		return mcframe.serverMSBB.MSBBL1330.Chk02_IoR.create();
	}

	/**
	 * Chk02_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> createChk02_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk02_IoR.class);
	}
	protected MSBBL_SlsRetSchdReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MS_MSBBL1330_Upd01_INFO;
		this.aUpd01 = ((MSBBL_SlsRetSchdReg)this).new Upd01();
	}

	public static MSBBL_SlsRetSchdReg.Upd01 crtUpd01() {
		MSBBL_SlsRetSchdReg lgc = new MSBBL_SlsRetSchdReg();
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
	public mcframe.serverMSBB.MSBBL1330.Chk01_HdrR createUpd01_HdrR(){
		return mcframe.serverMSBB.MSBBL1330.Chk01_HdrR.create();
	}

	/**
	 * Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Chk01_DtlR createUpd01_DtlR(){
		return mcframe.serverMSBB.MSBBL1330.Chk01_DtlR.create();
	}

	/**
	 * Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> createUpd01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR.class);
	}

	/**
	 * Upd01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Chk01_IoR createUpd01_IoR(){
		return mcframe.serverMSBB.MSBBL1330.Chk01_IoR.create();
	}

	/**
	 * Upd01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> createUpd01_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_IoR.class);
	}
	protected MSBBL_SlsRetSchdReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MS_MSBBL1330_Del01_INFO;
		this.aDel01 = ((MSBBL_SlsRetSchdReg)this).new Del01();
	}

	public static MSBBL_SlsRetSchdReg.Del01 crtDel01() {
		MSBBL_SlsRetSchdReg lgc = new MSBBL_SlsRetSchdReg();
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
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Chk02_HdrR createDel01_HdrR(){
		return mcframe.serverMSBB.MSBBL1330.Chk02_HdrR.create();
	}

	/**
	 * Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Chk02_DtlR createDel01_DtlR(){
		return mcframe.serverMSBB.MSBBL1330.Chk02_DtlR.create();
	}

	/**
	 * Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> createDel01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk02_DtlR.class);
	}

	/**
	 * Del01_IoブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBB.MSBBL1330.Chk02_IoR createDel01_IoR(){
		return mcframe.serverMSBB.MSBBL1330.Chk02_IoR.create();
	}

	/**
	 * Del01_IoブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> createDel01_IoL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk02_IoR.class);
	}
	protected MSBBL_SlsRetSchdReg.Sprt01 aSprt01;

	protected void initSprt01() {
		this.info = PDef.MS_MSBBL1330_Sprt01_INFO;
		this.aSprt01 = ((MSBBL_SlsRetSchdReg)this).new Sprt01();
	}

	public static MSBBL_SlsRetSchdReg.Sprt01 crtSprt01() {
		MSBBL_SlsRetSchdReg lgc = new MSBBL_SlsRetSchdReg();
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
	public mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR createSprt01_DtlR(){
		return mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR.create();
	}

	/**
	 * Sprt01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR> createSprt01_DtlL(){
		return MCList.create(mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 納品書ＮＯから納品伝票情報または売上実績情報を検索する<br>
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
		private final mcframe.serverMSBB.MSBBL1330.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1330.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Srch01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Srch01_IoR> down2;
		
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1330.Srch01_CndR.create();
			down0 = mcframe.serverMSBB.MSBBL1330.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1330.Srch01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1330.Srch01_IoR.class);

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
			invoke((MSBBL_SlsRetSchdReg)MSBBL_SlsRetSchdReg_MC_A.this);
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
		public mcframe.serverMSBB.MSBBL1330.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBB.MSBBL1330.Srch01_CndR.create();
		}

		/**
		 * Srch01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Srch01_HdrR createSrch01_HdrR(){
			return mcframe.serverMSBB.MSBBL1330.Srch01_HdrR.create();
		}

		/**
		 * Srch01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Srch01_DtlR createSrch01_DtlR(){
			return mcframe.serverMSBB.MSBBL1330.Srch01_DtlR.create();
		}

		/**
		 * Srch01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Srch01_DtlR> createSrch01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1330.Srch01_DtlR.class);
		}

		/**
		 * Srch01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Srch01_IoR createSrch01_IoR(){
			return mcframe.serverMSBB.MSBBL1330.Srch01_IoR.create();
		}

		/**
		 * Srch01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Srch01_IoR> createSrch01_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1330.Srch01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>screen_ope</td></tr>
		 * 	<tr><td><br></td><td>srch_tgt_typ</td></tr>
		 * 	<tr><td><br></td><td>srch_tgt_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1330.Srch01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1330.Srch01_CndR up0() {
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
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>num_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt_no_cost</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
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
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>lnk_ar_dpt_cd</td></tr>
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
		 * @see mcframe.serverMSBB.MSBBL1330.Srch01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1330.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sret_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sret_schd_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
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
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>cost_amt</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
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
		 * 	<tr><td><br></td><td>cnsgn_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_gd_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ref_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_sls_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_site_cd</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>itm_sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>init_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>init_schd_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>init_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Srch01_DtlR> down1() {
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
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_gd_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Srch01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsRetSchdReg)MSBBL_SlsRetSchdReg_MC_A.this).info;
		}


	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * 売上実績情報を検索する<br>
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
		private final mcframe.serverMSBB.MSBBL1330.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1330.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Srch01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Srch01_IoR> down2;
		
		
		// コンストラクタ
		protected Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1330.Srch01_CndR.create();
			down0 = mcframe.serverMSBB.MSBBL1330.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1330.Srch01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1330.Srch01_IoR.class);

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
			invoke((MSBBL_SlsRetSchdReg)MSBBL_SlsRetSchdReg_MC_A.this);
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
		public mcframe.serverMSBB.MSBBL1330.Srch01_CndR createSrch03_CndR(){
			return mcframe.serverMSBB.MSBBL1330.Srch01_CndR.create();
		}

		/**
		 * Srch03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Srch01_HdrR createSrch03_HdrR(){
			return mcframe.serverMSBB.MSBBL1330.Srch01_HdrR.create();
		}

		/**
		 * Srch03_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Srch01_DtlR createSrch03_DtlR(){
			return mcframe.serverMSBB.MSBBL1330.Srch01_DtlR.create();
		}

		/**
		 * Srch03_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Srch01_DtlR> createSrch03_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1330.Srch01_DtlR.class);
		}

		/**
		 * Srch03_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Srch01_IoR createSrch03_IoR(){
			return mcframe.serverMSBB.MSBBL1330.Srch01_IoR.create();
		}

		/**
		 * Srch03_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Srch01_IoR> createSrch03_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1330.Srch01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>screen_ope</td></tr>
		 * 	<tr><td><br></td><td>srch_tgt_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1330.Srch01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1330.Srch01_CndR up0() {
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
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>num_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt_no_cost</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
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
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>lnk_ar_dpt_cd</td></tr>
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
		 * @see mcframe.serverMSBB.MSBBL1330.Srch01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1330.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sret_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sret_schd_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
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
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>cost_amt</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
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
		 * 	<tr><td><br></td><td>cnsgn_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_gd_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ref_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_sls_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_site_cd</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>itm_sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>init_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>init_schd_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>init_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Srch01_DtlR> down1() {
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
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_gd_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Srch01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsRetSchdReg)MSBBL_SlsRetSchdReg_MC_A.this).info;
		}


	}
	/**
	 * Srch04オペレーション.<p>
	 *
	 * 売上返品予定情報を検索する<br>
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
		private final mcframe.serverMSBB.MSBBL1330.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1330.Srch01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Srch01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Srch01_IoR> down2;
		
		
		// コンストラクタ
		protected Srch04() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1330.Srch01_CndR.create();
			down0 = mcframe.serverMSBB.MSBBL1330.Srch01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1330.Srch01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1330.Srch01_IoR.class);

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
			invoke((MSBBL_SlsRetSchdReg)MSBBL_SlsRetSchdReg_MC_A.this);
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
		public mcframe.serverMSBB.MSBBL1330.Srch01_CndR createSrch04_CndR(){
			return mcframe.serverMSBB.MSBBL1330.Srch01_CndR.create();
		}

		/**
		 * Srch04_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Srch01_HdrR createSrch04_HdrR(){
			return mcframe.serverMSBB.MSBBL1330.Srch01_HdrR.create();
		}

		/**
		 * Srch04_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Srch01_DtlR createSrch04_DtlR(){
			return mcframe.serverMSBB.MSBBL1330.Srch01_DtlR.create();
		}

		/**
		 * Srch04_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Srch01_DtlR> createSrch04_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1330.Srch01_DtlR.class);
		}

		/**
		 * Srch04_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Srch01_IoR createSrch04_IoR(){
			return mcframe.serverMSBB.MSBBL1330.Srch01_IoR.create();
		}

		/**
		 * Srch04_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Srch01_IoR> createSrch04_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1330.Srch01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>screen_ope</td></tr>
		 * 	<tr><td><br></td><td>srch_tgt_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1330.Srch01_CndR
		 */
		public mcframe.serverMSBB.MSBBL1330.Srch01_CndR up0() {
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
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>num_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt</td></tr>
		 * 	<tr><td><br></td><td>ttl_amt_no_cost</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
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
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>ptax_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_cl_typ</td></tr>
		 * 	<tr><td><br></td><td>lnk_ar_dpt_cd</td></tr>
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
		 * @see mcframe.serverMSBB.MSBBL1330.Srch01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1330.Srch01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sret_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sret_schd_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
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
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>tdlv_nm</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_qty</td></tr>
		 * 	<tr><td><br></td><td>arr_cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>cost_amt</td></tr>
		 * 	<tr><td><br></td><td>prof_rate</td></tr>
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
		 * 	<tr><td><br></td><td>cnsgn_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_gd_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>ret_rsn_nm</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ref_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_sls_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>dscnt_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_site_cd</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_typ</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dlv_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_acxfr_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>itm_sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>prnt_lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>init_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>init_schd_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>init_schd_amt</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>schd_trd_unit_conv_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Srch01_DtlR> down1() {
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
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_qty</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_abort_qty</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_gd_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Srch01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsRetSchdReg)MSBBL_SlsRetSchdReg_MC_A.this).info;
		}


	}
	/**
	 * Chk01オペレーション.<p>
	 *
	 * 売上返品予定情報を登録・訂正前チェックする<br>
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
		private final mcframe.serverMSBB.MSBBL1330.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1330.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> down2;
		
		
		// コンストラクタ
		protected Chk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1330.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_IoR.class);
			down0 = mcframe.serverMSBB.MSBBL1330.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_IoR.class);

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
			invoke((MSBBL_SlsRetSchdReg)MSBBL_SlsRetSchdReg_MC_A.this);
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
		public mcframe.serverMSBB.MSBBL1330.Chk01_HdrR createChk01_HdrR(){
			return mcframe.serverMSBB.MSBBL1330.Chk01_HdrR.create();
		}

		/**
		 * Chk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk01_DtlR createChk01_DtlR(){
			return mcframe.serverMSBB.MSBBL1330.Chk01_DtlR.create();
		}

		/**
		 * Chk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> createChk01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR.class);
		}

		/**
		 * Chk01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk01_IoR createChk01_IoR(){
			return mcframe.serverMSBB.MSBBL1330.Chk01_IoR.create();
		}

		/**
		 * Chk01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> createChk01_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_IoR.class);
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
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>num_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
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
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1330.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
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
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ref_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_sls_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> up2() {
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
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>old_iv_no</td></tr>
		 * 	<tr><td><br></td><td>num_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
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
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1330.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk01_HdrR down0() {
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
		 * 	<tr><td><br></td><td>cmpl_flg</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sret_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
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
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ref_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_sls_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>old_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> down1() {
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
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>old_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>old_sls_ret_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsRetSchdReg)MSBBL_SlsRetSchdReg_MC_A.this).info;
		}


	}
	/**
	 * Ins01オペレーション.<p>
	 *
	 * 売上返品予定情報を登録する<br>
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
		private final mcframe.serverMSBB.MSBBL1330.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1330.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> down2;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverMSBB.MSBBL1330.MSBBL_SlsRetSchdReg.Chk01 （{@link #chk01}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBB.MSBBL1330.MSBBL_SlsRetSchdReg.Chk01}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBB.MSBBL1330.Chk01_HdrR （{@link #chk01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk01_DtlR&gt; （{@link #chk01_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk01_IoR&gt; （{@link #chk01_up2}）<br>
		 * 第1 下りブロッククラス mcframe.serverMSBB.MSBBL1330.Chk01_HdrR （{@link #chk01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk01_DtlR&gt; （{@link #chk01_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk01_IoR&gt; （{@link #chk01_down2}）<br>
		 */
		public final mcframe.serverMSBB.MSBBL1330.MSBBL_SlsRetSchdReg.Chk01 chk01;
		// 連携ロジック上り
		public final mcframe.serverMSBB.MSBBL1330.Chk01_HdrR chk01_up0;
		public final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> chk01_up1;
		public final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> chk01_up2;
		// 連携ロジック下り
		public final mcframe.serverMSBB.MSBBL1330.Chk01_HdrR chk01_down0;
		public final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> chk01_down1;
		public final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> chk01_down2;
		
		// コンストラクタ
		protected Ins01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1330.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_IoR.class);
			down0 = mcframe.serverMSBB.MSBBL1330.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_IoR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMSBB.MSBBL1330.MSBBL_SlsRetSchdReg.crtChk01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (mcframe.serverMSBB.MSBBL1330.Chk01_HdrR)chk01.up(0);
			chk01_up1 = (MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR>)chk01.up(1);
			chk01_up2 = (MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR>)chk01.up(2);
			chk01_down0 = (mcframe.serverMSBB.MSBBL1330.Chk01_HdrR)chk01.down(0);
			chk01_down1 = (MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR>)chk01.down(1);
			chk01_down2 = (MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR>)chk01.down(2);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => mcframe.serverMSBB.MSBBL1330.Chk01_HdrR （{@link #chk01_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk01_DtlR&gt; （{@link #chk01_up1}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk01_IoR&gt; （{@link #chk01_up2}）<br>
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
		 * mcframe.serverMSBB.MSBBL1330.Chk01_HdrR（{@link #chk01_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk01_DtlR&gt;（{@link #chk01_down1}）=> down1()<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk01_IoR&gt;（{@link #chk01_down2}）=> down2()<br>
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
			invoke((MSBBL_SlsRetSchdReg)MSBBL_SlsRetSchdReg_MC_A.this);
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
		public mcframe.serverMSBB.MSBBL1330.Chk01_HdrR createIns01_HdrR(){
			return mcframe.serverMSBB.MSBBL1330.Chk01_HdrR.create();
		}

		/**
		 * Ins01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk01_DtlR createIns01_DtlR(){
			return mcframe.serverMSBB.MSBBL1330.Chk01_DtlR.create();
		}

		/**
		 * Ins01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> createIns01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR.class);
		}

		/**
		 * Ins01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk01_IoR createIns01_IoR(){
			return mcframe.serverMSBB.MSBBL1330.Chk01_IoR.create();
		}

		/**
		 * Ins01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> createIns01_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>num_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
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
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1330.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
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
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ref_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_sls_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> up1() {
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
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1330.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sret_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sret_schd_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsRetSchdReg)MSBBL_SlsRetSchdReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(mcframe.serverMSBB.MSBBL1330.Chk01_HdrR dest0_0, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> dest0_1, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> dest0_2, mcframe.serverMSBB.MSBBL1330.Chk01_HdrR src_Ins01_Hdr, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> src_Ins01_Dtl, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> src_Ins01_Io){
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
				addColumnPathMap("reg_dt", "reg_dt");
				addColumnPathMap("sls_ret_schd_dt", "sls_ret_schd_dt");
				addColumnPathMap("sls_ret_schd_no", "sls_ret_schd_no");
				addColumnPathMap("sync_flg", "sync_flg");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("sls_usr_cd", "sls_usr_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("num_flg", "num_flg");
				addColumnPathMap("ref_iv_no", "ref_iv_no");
				addColumnPathMap("rcv_schd_dt", "rcv_schd_dt");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("xrate_inpt_flg", "xrate_inpt_flg");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg");
				addColumnPathMap("ptax_xrate", "ptax_xrate");
				addColumnPathMap("cst_po_no", "cst_po_no");
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
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_0(mcframe.serverMSBB.MSBBL1330.Chk01_HdrR dest, mcframe.serverMSBB.MSBBL1330.Chk01_HdrR src) {
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
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("iv_itm_nm", "iv_itm_nm");
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
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("dest_cd1", "dest_cd1");
				addColumnPathMap("dest_cd2", "dest_cd2");
				addColumnPathMap("dest_cd3", "dest_cd3");
				addColumnPathMap("tdlv_cd", "tdlv_cd");
				addColumnPathMap("cntry_org_cd", "cntry_org_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("upri_not_tgt_flg", "upri_not_tgt_flg");
				addColumnPathMap("interim_flg", "interim_flg");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("dscnt_rsn_cd", "dscnt_rsn_cd");
				addColumnPathMap("cost_upri", "cost_upri");
				addColumnPathMap("tax_fix_flg", "tax_fix_flg");
				addColumnPathMap("tax_cd", "tax_cd");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("cnsgn_gd_cd", "cnsgn_gd_cd");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_cd_none_flg", "str_ln_cd_none_flg");
				addColumnPathMap("cnsgn_loc_cd", "cnsgn_loc_cd");
				addColumnPathMap("cnsgn_str_ln_cd", "cnsgn_str_ln_cd");
				addColumnPathMap("cnsgn_str_ln_cd_none_flg", "cnsgn_str_ln_cd_none_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("vmi_flg", "vmi_flg");
				addColumnPathMap("cst_po_d_no", "cst_po_d_no");
				addColumnPathMap("cst_itm_cd", "cst_itm_cd");
				addColumnPathMap("cst_itm_nm", "cst_itm_nm");
				addColumnPathMap("ret_rsn_cd", "ret_rsn_cd");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("arr_cnt_rmrks", "arr_cnt_rmrks");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("sls_ret_schd_d_no", "sls_ret_schd_d_no");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("ref_dlv_slip_no", "ref_dlv_slip_no");
				addColumnPathMap("ref_dlv_slip_d_no", "ref_dlv_slip_d_no");
				addColumnPathMap("ref_sls_act_no", "ref_sls_act_no");
				addColumnPathMap("ref_sls_act_d_no", "ref_sls_act_d_no");
				addColumnPathMap("base_sls_ac_dt", "base_sls_ac_dt");
				addColumnPathMap("ref_sls_act_seq", "ref_sls_act_seq");
				addColumnPathMap("ref_sls_act_d_seq", "ref_sls_act_d_seq");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_1(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR r_dest, mcframe.serverMSBB.MSBBL1330.Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk01_1(MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> dest, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk01_1();
			for(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR r_src : src){
				mcframe.serverMSBB.MSBBL1330.Chk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("sls_ret_schd_abort_flg", "sls_ret_schd_abort_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("cnsgn_gd_cd", "cnsgn_gd_cd");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("cnsgn_loc_cd", "cnsgn_loc_cd");
				addColumnPathMap("cnsgn_str_ln_cd", "cnsgn_str_ln_cd");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("arr_cnt_rmrks", "arr_cnt_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("arr_schd_no", "arr_schd_no");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_2(mcframe.serverMSBB.MSBBL1330.Chk01_IoR r_dest, mcframe.serverMSBB.MSBBL1330.Chk01_IoR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk01_2(MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> dest, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk01_2();
			for(mcframe.serverMSBB.MSBBL1330.Chk01_IoR r_src : src){
				mcframe.serverMSBB.MSBBL1330.Chk01_IoR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(mcframe.serverMSBB.MSBBL1330.Chk01_HdrR dest_Ins01_Hdr, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> dest_Ins01_Dtl, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> dest_Ins01_Io, mcframe.serverMSBB.MSBBL1330.Chk01_HdrR src0_0, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> src0_1, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> src0_2){
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
				addColumnPathMap("reg_dt", "reg_dt");
				addColumnPathMap("sls_ret_schd_dt", "sls_ret_schd_dt");
				addColumnPathMap("sync_flg", "sync_flg");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("sls_usr_cd", "sls_usr_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("num_flg", "num_flg");
				addColumnPathMap("ref_iv_no", "ref_iv_no");
				addColumnPathMap("rcv_schd_dt", "rcv_schd_dt");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("xrate_inpt_flg", "xrate_inpt_flg");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg");
				addColumnPathMap("ptax_xrate", "ptax_xrate");
				addColumnPathMap("cst_po_no", "cst_po_no");
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
				addColumnPathMap("trd_cur_amt_dec_place", "trd_cur_amt_dec_place");
				addColumnPathMap("trd_cur_upri_dec_place", "trd_cur_upri_dec_place");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のRowをコピーする。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_0(mcframe.serverMSBB.MSBBL1330.Chk01_HdrR r_dest, mcframe.serverMSBB.MSBBL1330.Chk01_HdrR r_src) {
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
				addColumnPathMap("cmpl_flg", "cmpl_flg");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("sret_schd_sts_typ", "sret_schd_sts_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("iv_itm_nm", "iv_itm_nm");
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
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("dest_cd1", "dest_cd1");
				addColumnPathMap("dest_cd2", "dest_cd2");
				addColumnPathMap("dest_cd3", "dest_cd3");
				addColumnPathMap("tdlv_cd", "tdlv_cd");
				addColumnPathMap("cntry_org_cd", "cntry_org_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("upri_not_tgt_flg", "upri_not_tgt_flg");
				addColumnPathMap("interim_flg", "interim_flg");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("dscnt_rsn_cd", "dscnt_rsn_cd");
				addColumnPathMap("cost_upri", "cost_upri");
				addColumnPathMap("tax_fix_flg", "tax_fix_flg");
				addColumnPathMap("tax_cd", "tax_cd");
				addColumnPathMap("tax_rate", "tax_rate");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("cnsgn_gd_cd", "cnsgn_gd_cd");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_cd_none_flg", "str_ln_cd_none_flg");
				addColumnPathMap("cnsgn_loc_cd", "cnsgn_loc_cd");
				addColumnPathMap("cnsgn_str_ln_cd", "cnsgn_str_ln_cd");
				addColumnPathMap("cnsgn_str_ln_cd_none_flg", "cnsgn_str_ln_cd_none_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("vmi_flg", "vmi_flg");
				addColumnPathMap("cst_po_d_no", "cst_po_d_no");
				addColumnPathMap("cst_itm_cd", "cst_itm_cd");
				addColumnPathMap("cst_itm_nm", "cst_itm_nm");
				addColumnPathMap("ret_rsn_cd", "ret_rsn_cd");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("arr_cnt_rmrks", "arr_cnt_rmrks");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("sls_ret_schd_d_no", "sls_ret_schd_d_no");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("ref_dlv_slip_no", "ref_dlv_slip_no");
				addColumnPathMap("ref_dlv_slip_d_no", "ref_dlv_slip_d_no");
				addColumnPathMap("ref_sls_act_no", "ref_sls_act_no");
				addColumnPathMap("ref_sls_act_d_no", "ref_sls_act_d_no");
				addColumnPathMap("base_sls_ac_dt", "base_sls_ac_dt");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("trd_unit_conv_base_qty", "trd_unit_conv_base_qty");
				addColumnPathMap("trd_unit_conv_qty", "trd_unit_conv_qty");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_rnd_typ", "base_unit_rnd_typ");
				addColumnPathMap("inc_tax_flg", "inc_tax_flg");
				addColumnPathMap("ref_sls_act_seq", "ref_sls_act_seq");
				addColumnPathMap("ref_sls_act_d_seq", "ref_sls_act_d_seq");
				addColumnPathMap("sls_ret_schd_no", "sls_ret_schd_no");
				addColumnPathMap("arr_pr_no", "arr_pr_no");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_1(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR r_dest, mcframe.serverMSBB.MSBBL1330.Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk01_1(MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> dest, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk01_1();
			for(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR r_src : src){
				mcframe.serverMSBB.MSBBL1330.Chk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("sls_ret_schd_abort_flg", "sls_ret_schd_abort_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("cnsgn_gd_cd", "cnsgn_gd_cd");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("cnsgn_loc_cd", "cnsgn_loc_cd");
				addColumnPathMap("cnsgn_str_ln_cd", "cnsgn_str_ln_cd");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("arr_cnt_rmrks", "arr_cnt_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("arr_schd_no", "arr_schd_no");
				addColumnPathMap("trd_unit_conv_base_qty", "trd_unit_conv_base_qty");
				addColumnPathMap("trd_unit_conv_qty", "trd_unit_conv_qty");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_rnd_typ", "base_unit_rnd_typ");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
				addColumnPathMap("wg_cd", "wg_cd");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_2(mcframe.serverMSBB.MSBBL1330.Chk01_IoR r_dest, mcframe.serverMSBB.MSBBL1330.Chk01_IoR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk01_2(MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> dest, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk01_2();
			for(mcframe.serverMSBB.MSBBL1330.Chk01_IoR r_src : src){
				mcframe.serverMSBB.MSBBL1330.Chk01_IoR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Chk02オペレーション.<p>
	 *
	 * 売上返品予定情報を取消前チェックする<br>
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
		private final mcframe.serverMSBB.MSBBL1330.Chk02_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1330.Chk02_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> down2;
		
		
		// コンストラクタ
		protected Chk02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1330.Chk02_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk02_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk02_IoR.class);
			down0 = mcframe.serverMSBB.MSBBL1330.Chk02_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk02_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk02_IoR.class);

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
			invoke((MSBBL_SlsRetSchdReg)MSBBL_SlsRetSchdReg_MC_A.this);
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
		public mcframe.serverMSBB.MSBBL1330.Chk02_HdrR createChk02_HdrR(){
			return mcframe.serverMSBB.MSBBL1330.Chk02_HdrR.create();
		}

		/**
		 * Chk02_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk02_DtlR createChk02_DtlR(){
			return mcframe.serverMSBB.MSBBL1330.Chk02_DtlR.create();
		}

		/**
		 * Chk02_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> createChk02_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk02_DtlR.class);
		}

		/**
		 * Chk02_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk02_IoR createChk02_IoR(){
			return mcframe.serverMSBB.MSBBL1330.Chk02_IoR.create();
		}

		/**
		 * Chk02_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> createChk02_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk02_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1330.Chk02_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk02_HdrR up0() {
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
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> up1() {
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
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> up2() {
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
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1330.Chk02_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk02_HdrR down0() {
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
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> down1() {
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
		 * 	<tr><td><br></td><td>err_flg</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsRetSchdReg)MSBBL_SlsRetSchdReg_MC_A.this).info;
		}


	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 売上返品予定情報を訂正する<br>
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
		private final mcframe.serverMSBB.MSBBL1330.Chk01_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1330.Chk01_HdrR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> down2;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverMSBB.MSBBL1330.MSBBL_SlsRetSchdReg.Chk01 （{@link #chk01}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBB.MSBBL1330.MSBBL_SlsRetSchdReg.Chk01}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBB.MSBBL1330.Chk01_HdrR （{@link #chk01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk01_DtlR&gt; （{@link #chk01_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk01_IoR&gt; （{@link #chk01_up2}）<br>
		 * 第1 下りブロッククラス mcframe.serverMSBB.MSBBL1330.Chk01_HdrR （{@link #chk01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk01_DtlR&gt; （{@link #chk01_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk01_IoR&gt; （{@link #chk01_down2}）<br>
		 */
		public final mcframe.serverMSBB.MSBBL1330.MSBBL_SlsRetSchdReg.Chk01 chk01;
		// 連携ロジック上り
		public final mcframe.serverMSBB.MSBBL1330.Chk01_HdrR chk01_up0;
		public final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> chk01_up1;
		public final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> chk01_up2;
		// 連携ロジック下り
		public final mcframe.serverMSBB.MSBBL1330.Chk01_HdrR chk01_down0;
		public final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> chk01_down1;
		public final MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> chk01_down2;
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1330.Chk01_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_IoR.class);
			down0 = mcframe.serverMSBB.MSBBL1330.Chk01_HdrR.create();
			down1 = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR.class);
			down2 = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_IoR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMSBB.MSBBL1330.MSBBL_SlsRetSchdReg.crtChk01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (mcframe.serverMSBB.MSBBL1330.Chk01_HdrR)chk01.up(0);
			chk01_up1 = (MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR>)chk01.up(1);
			chk01_up2 = (MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR>)chk01.up(2);
			chk01_down0 = (mcframe.serverMSBB.MSBBL1330.Chk01_HdrR)chk01.down(0);
			chk01_down1 = (MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR>)chk01.down(1);
			chk01_down2 = (MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR>)chk01.down(2);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => mcframe.serverMSBB.MSBBL1330.Chk01_HdrR （{@link #chk01_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk01_DtlR&gt; （{@link #chk01_up1}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk01_IoR&gt; （{@link #chk01_up2}）<br>
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
		 * mcframe.serverMSBB.MSBBL1330.Chk01_HdrR（{@link #chk01_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk01_DtlR&gt;（{@link #chk01_down1}）=> down1()<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk01_IoR&gt;（{@link #chk01_down2}）=> down2()<br>
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
			invoke((MSBBL_SlsRetSchdReg)MSBBL_SlsRetSchdReg_MC_A.this);
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
		public mcframe.serverMSBB.MSBBL1330.Chk01_HdrR createUpd01_HdrR(){
			return mcframe.serverMSBB.MSBBL1330.Chk01_HdrR.create();
		}

		/**
		 * Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk01_DtlR createUpd01_DtlR(){
			return mcframe.serverMSBB.MSBBL1330.Chk01_DtlR.create();
		}

		/**
		 * Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> createUpd01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR.class);
		}

		/**
		 * Upd01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk01_IoR createUpd01_IoR(){
			return mcframe.serverMSBB.MSBBL1330.Chk01_IoR.create();
		}

		/**
		 * Upd01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> createUpd01_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk01_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>reg_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sync_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * 	<tr><td><br></td><td>num_flg</td></tr>
		 * 	<tr><td><br></td><td>ref_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcv_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate_inpt_flg</td></tr>
		 * 	<tr><td><br></td><td>ptax_xrate</td></tr>
		 * 	<tr><td><br></td><td>cst_po_no</td></tr>
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
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1330.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk01_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>iv_itm_nm</td></tr>
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
		 * 	<tr><td><br></td><td>pri_prnt_flg</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>tdlv_cd</td></tr>
		 * 	<tr><td><br></td><td>cntry_org_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>upri_not_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>dscnt_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>cost_upri</td></tr>
		 * 	<tr><td><br></td><td>tax_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>vmi_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_po_d_no</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ret_rsn_cd</td></tr>
		 * 	<tr><td><br></td><td>bd_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>trd_d_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>slo_no</td></tr>
		 * 	<tr><td><br></td><td>slo_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>ref_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_no</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>base_sls_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_seq</td></tr>
		 * 	<tr><td><br></td><td>ref_sls_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> up1() {
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
		 * 	<tr><td><br></td><td>abort_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_abort_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_gd_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>cnsgn_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>arr_cnt_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>iv_no</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1330.Chk01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk01_HdrR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sret_schd_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>sret_schd_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_d_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>io_schd_pr_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> down2() {
			return down2;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsRetSchdReg)MSBBL_SlsRetSchdReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(mcframe.serverMSBB.MSBBL1330.Chk01_HdrR dest0_0, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> dest0_1, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> dest0_2, mcframe.serverMSBB.MSBBL1330.Chk01_HdrR src_Upd01_Hdr, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> src_Upd01_Dtl, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> src_Upd01_Io){
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
				addColumnPathMap("reg_dt", "reg_dt");
				addColumnPathMap("sls_ret_schd_dt", "sls_ret_schd_dt");
				addColumnPathMap("sls_ret_schd_no", "sls_ret_schd_no");
				addColumnPathMap("sync_flg", "sync_flg");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("sls_usr_cd", "sls_usr_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("num_flg", "num_flg");
				addColumnPathMap("ref_iv_no", "ref_iv_no");
				addColumnPathMap("rcv_schd_dt", "rcv_schd_dt");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("xrate_inpt_flg", "xrate_inpt_flg");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg");
				addColumnPathMap("ptax_xrate", "ptax_xrate");
				addColumnPathMap("cst_po_no", "cst_po_no");
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
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_0(mcframe.serverMSBB.MSBBL1330.Chk01_HdrR dest, mcframe.serverMSBB.MSBBL1330.Chk01_HdrR src) {
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
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("iv_itm_nm", "iv_itm_nm");
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
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("dest_cd1", "dest_cd1");
				addColumnPathMap("dest_cd2", "dest_cd2");
				addColumnPathMap("dest_cd3", "dest_cd3");
				addColumnPathMap("tdlv_cd", "tdlv_cd");
				addColumnPathMap("cntry_org_cd", "cntry_org_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("upri_not_tgt_flg", "upri_not_tgt_flg");
				addColumnPathMap("interim_flg", "interim_flg");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("dscnt_rsn_cd", "dscnt_rsn_cd");
				addColumnPathMap("cost_upri", "cost_upri");
				addColumnPathMap("tax_fix_flg", "tax_fix_flg");
				addColumnPathMap("tax_cd", "tax_cd");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("cnsgn_gd_cd", "cnsgn_gd_cd");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_cd_none_flg", "str_ln_cd_none_flg");
				addColumnPathMap("cnsgn_loc_cd", "cnsgn_loc_cd");
				addColumnPathMap("cnsgn_str_ln_cd", "cnsgn_str_ln_cd");
				addColumnPathMap("cnsgn_str_ln_cd_none_flg", "cnsgn_str_ln_cd_none_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("vmi_flg", "vmi_flg");
				addColumnPathMap("cst_po_d_no", "cst_po_d_no");
				addColumnPathMap("cst_itm_cd", "cst_itm_cd");
				addColumnPathMap("cst_itm_nm", "cst_itm_nm");
				addColumnPathMap("ret_rsn_cd", "ret_rsn_cd");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("arr_cnt_rmrks", "arr_cnt_rmrks");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("sls_ret_schd_d_no", "sls_ret_schd_d_no");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("ref_dlv_slip_no", "ref_dlv_slip_no");
				addColumnPathMap("ref_dlv_slip_d_no", "ref_dlv_slip_d_no");
				addColumnPathMap("ref_sls_act_no", "ref_sls_act_no");
				addColumnPathMap("ref_sls_act_d_no", "ref_sls_act_d_no");
				addColumnPathMap("base_sls_ac_dt", "base_sls_ac_dt");
				addColumnPathMap("ref_sls_act_seq", "ref_sls_act_seq");
				addColumnPathMap("ref_sls_act_d_seq", "ref_sls_act_d_seq");
				addColumnPathMap("sls_ret_schd_no", "sls_ret_schd_no");
				addColumnPathMap("arr_pr_no", "arr_pr_no");
				addColumnPathMap("arr_pr_upd_cntr", "arr_pr_upd_cntr");
				addColumnPathMap("io_schd_pr_no", "io_schd_pr_no");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_1(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR r_dest, mcframe.serverMSBB.MSBBL1330.Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk01_1(MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> dest, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk01_1();
			for(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR r_src : src){
				mcframe.serverMSBB.MSBBL1330.Chk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("sls_ret_schd_abort_flg", "sls_ret_schd_abort_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("cnsgn_gd_cd", "cnsgn_gd_cd");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("cnsgn_loc_cd", "cnsgn_loc_cd");
				addColumnPathMap("cnsgn_str_ln_cd", "cnsgn_str_ln_cd");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("arr_cnt_rmrks", "arr_cnt_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("arr_schd_no", "arr_schd_no");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk01_2(mcframe.serverMSBB.MSBBL1330.Chk01_IoR r_dest, mcframe.serverMSBB.MSBBL1330.Chk01_IoR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk01_2(MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> dest, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk01_2();
			for(mcframe.serverMSBB.MSBBL1330.Chk01_IoR r_src : src){
				mcframe.serverMSBB.MSBBL1330.Chk01_IoR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(mcframe.serverMSBB.MSBBL1330.Chk01_HdrR dest_Upd01_Hdr, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> dest_Upd01_Dtl, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> dest_Upd01_Io, mcframe.serverMSBB.MSBBL1330.Chk01_HdrR src0_0, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> src0_1, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> src0_2){
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
				addColumnPathMap("reg_dt", "reg_dt");
				addColumnPathMap("sls_ret_schd_dt", "sls_ret_schd_dt");
				addColumnPathMap("sync_flg", "sync_flg");
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("sls_usr_cd", "sls_usr_cd");
				addColumnPathMap("sls_dpt_cd", "sls_dpt_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("old_iv_no", "old_iv_no");
				addColumnPathMap("num_flg", "num_flg");
				addColumnPathMap("ref_iv_no", "ref_iv_no");
				addColumnPathMap("rcv_schd_dt", "rcv_schd_dt");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("xrate_inpt_flg", "xrate_inpt_flg");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("ptax_xrate_inpt_flg", "ptax_xrate_inpt_flg");
				addColumnPathMap("ptax_xrate", "ptax_xrate");
				addColumnPathMap("cst_po_no", "cst_po_no");
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
				addColumnPathMap("trd_cur_amt_dec_place", "trd_cur_amt_dec_place");
				addColumnPathMap("trd_cur_upri_dec_place", "trd_cur_upri_dec_place");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック0のRowをコピーする。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_0(mcframe.serverMSBB.MSBBL1330.Chk01_HdrR r_dest, mcframe.serverMSBB.MSBBL1330.Chk01_HdrR r_src) {
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
				addColumnPathMap("cmpl_flg", "cmpl_flg");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("sret_schd_sts_typ", "sret_schd_sts_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("iv_itm_nm", "iv_itm_nm");
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
				addColumnPathMap("pri_prnt_flg", "pri_prnt_flg");
				addColumnPathMap("dest_cd1", "dest_cd1");
				addColumnPathMap("dest_cd2", "dest_cd2");
				addColumnPathMap("dest_cd3", "dest_cd3");
				addColumnPathMap("tdlv_cd", "tdlv_cd");
				addColumnPathMap("cntry_org_cd", "cntry_org_cd");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("upri_not_tgt_flg", "upri_not_tgt_flg");
				addColumnPathMap("interim_flg", "interim_flg");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("dscnt_rsn_cd", "dscnt_rsn_cd");
				addColumnPathMap("cost_upri", "cost_upri");
				addColumnPathMap("tax_fix_flg", "tax_fix_flg");
				addColumnPathMap("tax_cd", "tax_cd");
				addColumnPathMap("tax_rate", "tax_rate");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("cnsgn_gd_cd", "cnsgn_gd_cd");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("str_ln_cd_none_flg", "str_ln_cd_none_flg");
				addColumnPathMap("cnsgn_loc_cd", "cnsgn_loc_cd");
				addColumnPathMap("cnsgn_str_ln_cd", "cnsgn_str_ln_cd");
				addColumnPathMap("cnsgn_str_ln_cd_none_flg", "cnsgn_str_ln_cd_none_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("vmi_flg", "vmi_flg");
				addColumnPathMap("cst_po_d_no", "cst_po_d_no");
				addColumnPathMap("cst_itm_cd", "cst_itm_cd");
				addColumnPathMap("cst_itm_nm", "cst_itm_nm");
				addColumnPathMap("ret_rsn_cd", "ret_rsn_cd");
				addColumnPathMap("bd_dpt_cd", "bd_dpt_cd");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("arr_cnt_rmrks", "arr_cnt_rmrks");
				addColumnPathMap("trd_d_rmrks", "trd_d_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("sls_ret_schd_d_no", "sls_ret_schd_d_no");
				addColumnPathMap("slo_no", "slo_no");
				addColumnPathMap("slo_d_no", "slo_d_no");
				addColumnPathMap("ref_dlv_slip_no", "ref_dlv_slip_no");
				addColumnPathMap("ref_dlv_slip_d_no", "ref_dlv_slip_d_no");
				addColumnPathMap("ref_sls_act_no", "ref_sls_act_no");
				addColumnPathMap("ref_sls_act_d_no", "ref_sls_act_d_no");
				addColumnPathMap("base_sls_ac_dt", "base_sls_ac_dt");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("trd_unit_conv_base_qty", "trd_unit_conv_base_qty");
				addColumnPathMap("trd_unit_conv_qty", "trd_unit_conv_qty");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_rnd_typ", "base_unit_rnd_typ");
				addColumnPathMap("inc_tax_flg", "inc_tax_flg");
				addColumnPathMap("ref_sls_act_seq", "ref_sls_act_seq");
				addColumnPathMap("ref_sls_act_d_seq", "ref_sls_act_d_seq");
				addColumnPathMap("sls_ret_schd_no", "sls_ret_schd_no");
				addColumnPathMap("arr_pr_no", "arr_pr_no");
				addColumnPathMap("arr_pr_upd_cntr", "arr_pr_upd_cntr");
				addColumnPathMap("io_schd_pr_no", "io_schd_pr_no");
				addColumnPathMap("old_abort_flg", "old_abort_flg");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_1(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR r_dest, mcframe.serverMSBB.MSBBL1330.Chk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk01_1(MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> dest, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_DtlR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk01_1();
			for(mcframe.serverMSBB.MSBBL1330.Chk01_DtlR r_src : src){
				mcframe.serverMSBB.MSBBL1330.Chk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("abort_flg", "abort_flg");
				addColumnPathMap("sls_ret_schd_abort_flg", "sls_ret_schd_abort_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("cnsgn_gd_cd", "cnsgn_gd_cd");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("str_ln_cd", "str_ln_cd");
				addColumnPathMap("cnsgn_loc_cd", "cnsgn_loc_cd");
				addColumnPathMap("cnsgn_str_ln_cd", "cnsgn_str_ln_cd");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("arr_cnt_rmrks", "arr_cnt_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("arr_schd_no", "arr_schd_no");
				addColumnPathMap("trd_unit_conv_base_qty", "trd_unit_conv_base_qty");
				addColumnPathMap("trd_unit_conv_qty", "trd_unit_conv_qty");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_rnd_typ", "base_unit_rnd_typ");
				addColumnPathMap("old_abort_flg", "old_abort_flg");
				addColumnPathMap("old_sls_ret_schd_abort_flg", "old_sls_ret_schd_abort_flg");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
				addColumnPathMap("wg_cd", "wg_cd");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk01_2(mcframe.serverMSBB.MSBBL1330.Chk01_IoR r_dest, mcframe.serverMSBB.MSBBL1330.Chk01_IoR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk01の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk01_2(MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> dest, MCList<mcframe.serverMSBB.MSBBL1330.Chk01_IoR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk01_2();
			for(mcframe.serverMSBB.MSBBL1330.Chk01_IoR r_src : src){
				mcframe.serverMSBB.MSBBL1330.Chk01_IoR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk01_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 売上予定情報を取り消す<br>
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
		private final mcframe.serverMSBB.MSBBL1330.Chk02_HdrR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> up2;
		/** [Del01_Dtl]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> aDel01_Dtl;
		/** [Del01_Hdr]ブロックのコンテナField定義 */
		private final mcframe.serverMSBB.MSBBL1330.Chk02_HdrR aDel01_Hdr;
		/** [Del01_Io]ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> aDel01_Io;
		
		/**
		 * 連携情報 CALL_OPE<p>
		 *
		 * 連携先 mcframe.serverMSBB.MSBBL1330.MSBBL_SlsRetSchdReg.Chk02 （{@link #chk02}）<br>
		 */
		public final String CALL_OPE = "CALL_OPE";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBB.MSBBL1330.MSBBL_SlsRetSchdReg.Chk02}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBB.MSBBL1330.Chk02_HdrR （{@link #chk02_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk02_DtlR&gt; （{@link #chk02_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk02_IoR&gt; （{@link #chk02_up2}）<br>
		 * 第1 下りブロッククラス mcframe.serverMSBB.MSBBL1330.Chk02_HdrR （{@link #chk02_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk02_DtlR&gt; （{@link #chk02_down1}）<br>
		 * 第3 下りブロッククラス MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk02_IoR&gt; （{@link #chk02_down2}）<br>
		 */
		public final mcframe.serverMSBB.MSBBL1330.MSBBL_SlsRetSchdReg.Chk02 chk02;
		// 連携ロジック上り
		public final mcframe.serverMSBB.MSBBL1330.Chk02_HdrR chk02_up0;
		public final MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> chk02_up1;
		public final MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> chk02_up2;
		// 連携ロジック下り
		public final mcframe.serverMSBB.MSBBL1330.Chk02_HdrR chk02_down0;
		public final MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> chk02_down1;
		public final MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> chk02_down2;
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBB.MSBBL1330.Chk02_HdrR.create();
			up1 = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk02_DtlR.class);
			up2 = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk02_IoR.class);
			aDel01_Dtl = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk02_DtlR.class);
			aDel01_Hdr = mcframe.serverMSBB.MSBBL1330.Chk02_HdrR.create();
			aDel01_Io = MCList.create(mcframe.serverMSBB.MSBBL1330.Chk02_IoR.class);

			// 連携オペレーションの初期化
			chk02 = mcframe.serverMSBB.MSBBL1330.MSBBL_SlsRetSchdReg.crtChk02();
			
			// 連携オペレーションのコンテナ取得
			chk02_up0 = (mcframe.serverMSBB.MSBBL1330.Chk02_HdrR)chk02.up(0);
			chk02_up1 = (MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR>)chk02.up(1);
			chk02_up2 = (MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR>)chk02.up(2);
			chk02_down0 = (mcframe.serverMSBB.MSBBL1330.Chk02_HdrR)chk02.down(0);
			chk02_down1 = (MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR>)chk02.down(1);
			chk02_down2 = (MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR>)chk02.down(2);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE, chk02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE<br>
		 * up0() => mcframe.serverMSBB.MSBBL1330.Chk02_HdrR （{@link #chk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk02_DtlR&gt; （{@link #chk02_up1}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk02_IoR&gt; （{@link #chk02_up2}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE)) {
				up_CALL_OPE(chk02_up0, chk02_up1, chk02_up2, up0(), up1(), up2());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE<br>
		 * mcframe.serverMSBB.MSBBL1330.Chk02_HdrR（{@link #chk02_down0}）=> aDel01_Hdr<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk02_DtlR&gt;（{@link #chk02_down1}）=> aDel01_Dtl<br>
		 * MCList&lt;mcframe.serverMSBB.MSBBL1330.Chk02_IoR&gt;（{@link #chk02_down2}）=> aDel01_Io<br>
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
			if (i == 2) return up2();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBBL_SlsRetSchdReg)MSBBL_SlsRetSchdReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk02_HdrR createDel01_HdrR(){
			return mcframe.serverMSBB.MSBBL1330.Chk02_HdrR.create();
		}

		/**
		 * Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk02_DtlR createDel01_DtlR(){
			return mcframe.serverMSBB.MSBBL1330.Chk02_DtlR.create();
		}

		/**
		 * Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> createDel01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk02_DtlR.class);
		}

		/**
		 * Del01_IoブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk02_IoR createDel01_IoR(){
			return mcframe.serverMSBB.MSBBL1330.Chk02_IoR.create();
		}

		/**
		 * Del01_IoブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> createDel01_IoL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1330.Chk02_IoR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBB.MSBBL1330.Chk02_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk02_HdrR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sls_ret_schd_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_no</td></tr>
		 * 	<tr><td><br></td><td>arr_pr_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>arr_schd_no</td></tr>
		 * 	<tr><td><br></td><td>dtl_row_id</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> up2() {
			return up2;
		}



		/**
		 * [Del01_Dtl]ブロックのコンテナaDel01_DtlLを返します。
		 *
		 * @return Del01_DtlL
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> Del01_Dtl() {
			return aDel01_Dtl;
		}

		/**
		 * [Del01_Hdr]ブロックのコンテナaDel01_HdrRを返します。
		 *
		 * @return Del01_HdrR
		 */
		public mcframe.serverMSBB.MSBBL1330.Chk02_HdrR Del01_Hdr() {
			return aDel01_Hdr;
		}

		/**
		 * [Del01_Io]ブロックのコンテナaDel01_IoLを返します。
		 *
		 * @return Del01_IoL
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> Del01_Io() {
			return aDel01_Io;
		}


		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsRetSchdReg)MSBBL_SlsRetSchdReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(mcframe.serverMSBB.MSBBL1330.Chk02_HdrR dest0_0, MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> dest0_1, MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> dest0_2, mcframe.serverMSBB.MSBBL1330.Chk02_HdrR src_Del01_Hdr, MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> src_Del01_Dtl, MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> src_Del01_Io){
			up_CALL_OPE_chk02_0(dest0_0, src_Del01_Hdr);
			up_CALL_OPE_chk02_1(dest0_1, src_Del01_Dtl);
			up_CALL_OPE_chk02_2(dest0_2, src_Del01_Io);
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
				addColumnPathMap("sls_ret_schd_no", "sls_ret_schd_no");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_CALL_OPE_chk02_0(mcframe.serverMSBB.MSBBL1330.Chk02_HdrR dest, mcframe.serverMSBB.MSBBL1330.Chk02_HdrR src) {
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
				addColumnPathMap("arr_pr_no", "arr_pr_no");
				addColumnPathMap("arr_pr_upd_cntr", "arr_pr_upd_cntr");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk02_1(mcframe.serverMSBB.MSBBL1330.Chk02_DtlR r_dest, mcframe.serverMSBB.MSBBL1330.Chk02_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk02の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk02_1(MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> dest, MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk02_1();
			for(mcframe.serverMSBB.MSBBL1330.Chk02_DtlR r_src : src){
				mcframe.serverMSBB.MSBBL1330.Chk02_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk02_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE_chk02の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE_chk02_2() {
			MCRowMapper map = new Map_up_CALL_OPE_chk02_2();
			return map;
		}

		/**
		 * 連携処理CALL_OPE_chk02の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE_chk02_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("dtl_peg_no", "dtl_peg_no");
				addColumnPathMap("arr_schd_no", "arr_schd_no");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE_chk02_2(mcframe.serverMSBB.MSBBL1330.Chk02_IoR r_dest, mcframe.serverMSBB.MSBBL1330.Chk02_IoR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk02の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_chk02_2(MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> dest, MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_chk02_2();
			for(mcframe.serverMSBB.MSBBL1330.Chk02_IoR r_src : src){
				mcframe.serverMSBB.MSBBL1330.Chk02_IoR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE_chk02_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE(mcframe.serverMSBB.MSBBL1330.Chk02_HdrR dest_Del01_Hdr, MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> dest_Del01_Dtl, MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> dest_Del01_Io, mcframe.serverMSBB.MSBBL1330.Chk02_HdrR src0_0, MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> src0_1, MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> src0_2){
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
				addColumnPathMap("sls_ret_schd_no", "sls_ret_schd_no");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("iv_no", "iv_no");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック0のRowをコピーする。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk02_0(mcframe.serverMSBB.MSBBL1330.Chk02_HdrR r_dest, mcframe.serverMSBB.MSBBL1330.Chk02_HdrR r_src) {
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
				addColumnPathMap("arr_pr_no", "arr_pr_no");
				addColumnPathMap("arr_pr_upd_cntr", "arr_pr_upd_cntr");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk02_1(mcframe.serverMSBB.MSBBL1330.Chk02_DtlR r_dest, mcframe.serverMSBB.MSBBL1330.Chk02_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk02_1(MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> dest, MCList<mcframe.serverMSBB.MSBBL1330.Chk02_DtlR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk02_1();
			for(mcframe.serverMSBB.MSBBL1330.Chk02_DtlR r_src : src){
				mcframe.serverMSBB.MSBBL1330.Chk02_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("err_flg", "err_flg");
				addColumnPathMap("arr_schd_no", "arr_schd_no");
				addColumnPathMap("dtl_row_id", "dtl_row_id");
			}
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_CALL_OPE_chk02_2(mcframe.serverMSBB.MSBBL1330.Chk02_IoR r_dest, mcframe.serverMSBB.MSBBL1330.Chk02_IoR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_chk02の下りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_chk02_2(MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> dest, MCList<mcframe.serverMSBB.MSBBL1330.Chk02_IoR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_chk02_2();
			for(mcframe.serverMSBB.MSBBL1330.Chk02_IoR r_src : src){
				mcframe.serverMSBB.MSBBL1330.Chk02_IoR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_chk02_2(r_dest, r_src);
				dest.add(r_dest);
			}
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
		private final MCList<mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR> up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR> down0;
		
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
			up0 = MCList.create(mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR.class);
			down0 = MCList.create(mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR.class);

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
			invoke((MSBBL_SlsRetSchdReg)MSBBL_SlsRetSchdReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR createSprt01_DtlR(){
			return mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR.create();
		}

		/**
		 * Sprt01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR> createSprt01_DtlL(){
			return MCList.create(mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR.class);
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
		public MCList<mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR> up0() {
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
		public MCList<mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBBL_SlsRetSchdReg)MSBBL_SlsRetSchdReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE(MCList<mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR> dest0_0, MCList<mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR> src_Sprt01_Dtl){
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
		protected void up_CALL_OPE_sprt01_0(mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR r_dest, mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_sprt01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE_sprt01_0(MCList<mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR> dest, MCList<mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE_sprt01_0();
			for(mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR r_src : src){
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
		protected void down_CALL_OPE(MCList<mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR> dest_Sprt01_Dtl, MCList<mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR> src0_0){
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
		protected void down_CALL_OPE_sprt01_0(mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR r_dest, mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE_sprt01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_CALL_OPE_sprt01_0(MCList<mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR> dest, MCList<mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR> src) {
			MCRowMapper _rm = createMap_down_CALL_OPE_sprt01_0();
			for(mcframe.serverMABS.MABSL5010.SlsUpri_Sprt01_DtlR r_src : src){
				mcframe.serverMSBB.MSBBL1330.Sprt01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_CALL_OPE_sprt01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}

	//FMCB LOGIC_CONTROLLER END
}