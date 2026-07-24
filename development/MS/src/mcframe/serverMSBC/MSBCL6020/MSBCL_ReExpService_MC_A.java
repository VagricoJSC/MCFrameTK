package mcframe.serverMSBC.MSBCL6020;

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
 * "MSBCL_ReExpService"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_ReExpService_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String LOGIC_ID = "MSBCL6020";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_ReExpService.ReExp_Sprt01 aReExp_Sprt01;

	protected void initReExp_Sprt01() {
		this.info = PDef.MS_MSBCL6020_ReExp_Sprt01_INFO;
		this.aReExp_Sprt01 = ((MSBCL_ReExpService)this).new ReExp_Sprt01();
	}

	public static MSBCL_ReExpService.ReExp_Sprt01 crtReExp_Sprt01() {
		MSBCL_ReExpService lgc = new MSBCL_ReExpService();
		lgc.initReExp_Sprt01();
		return lgc.aReExp_Sprt01;
	}

	protected void paramReExp_Sprt01(MCParam p) {
		if (this.aReExp_Sprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aReExp_Sprt01.up0());
		p.addUpBlock(aReExp_Sprt01.up1());
		p.addUpBlock(aReExp_Sprt01.up2());
		p.addDownBlock(aReExp_Sprt01.down0());
		p.addDownBlock(aReExp_Sprt01.down1());
	}

	protected void doReExp_Sprt01() {
		aReExp_Sprt01.call();
	};

	/**
	 * ReExp_Sprt01_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_HdrR createReExp_Sprt01_HdrR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_HdrR.create();
	}

	/**
	 * ReExp_Sprt01_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_HdrR> createReExp_Sprt01_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_HdrR.class);
	}

	/**
	 * ReExp_Sprt01_DtlInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR createReExp_Sprt01_DtlInptR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR.create();
	}

	/**
	 * ReExp_Sprt01_DtlInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> createReExp_Sprt01_DtlInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR.class);
	}

	/**
	 * ReExp_Sprt01_RsltInptブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR createReExp_Sprt01_RsltInptR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR.create();
	}

	/**
	 * ReExp_Sprt01_RsltInptブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> createReExp_Sprt01_RsltInptL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR.class);
	}

	/**
	 * ReExp_Sprt01_DtlByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR createReExp_Sprt01_DtlByProdR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR.create();
	}

	/**
	 * ReExp_Sprt01_DtlByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> createReExp_Sprt01_DtlByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR.class);
	}

	/**
	 * ReExp_Sprt01_RsltByProdブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR createReExp_Sprt01_RsltByProdR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR.create();
	}

	/**
	 * ReExp_Sprt01_RsltByProdブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> createReExp_Sprt01_RsltByProdL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR.class);
	}
	protected MSBCL_ReExpService.ReExp_Sprt02 aReExp_Sprt02;

	protected void initReExp_Sprt02() {
		this.info = PDef.MS_MSBCL6020_ReExp_Sprt02_INFO;
		this.aReExp_Sprt02 = ((MSBCL_ReExpService)this).new ReExp_Sprt02();
	}

	public static MSBCL_ReExpService.ReExp_Sprt02 crtReExp_Sprt02() {
		MSBCL_ReExpService lgc = new MSBCL_ReExpService();
		lgc.initReExp_Sprt02();
		return lgc.aReExp_Sprt02;
	}

	protected void paramReExp_Sprt02(MCParam p) {
		if (this.aReExp_Sprt02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aReExp_Sprt02.up0());
		p.addUpBlock(aReExp_Sprt02.up1());
		p.addDownBlock(aReExp_Sprt02.down0());
	}

	protected void doReExp_Sprt02() {
		aReExp_Sprt02.call();
	};

	/**
	 * ReExp_Sprt02_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_HdrR createReExp_Sprt02_HdrR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_HdrR.create();
	}

	/**
	 * ReExp_Sprt02_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_HdrR> createReExp_Sprt02_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_HdrR.class);
	}

	/**
	 * ReExp_Sprt02_DtlWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR createReExp_Sprt02_DtlWkR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR.create();
	}

	/**
	 * ReExp_Sprt02_DtlWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> createReExp_Sprt02_DtlWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR.class);
	}

	/**
	 * ReExp_Sprt02_RsltWkブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR createReExp_Sprt02_RsltWkR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR.create();
	}

	/**
	 * ReExp_Sprt02_RsltWkブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> createReExp_Sprt02_RsltWkL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR.class);
	}
	protected MSBCL_ReExpService.ReExp_Sprt03 aReExp_Sprt03;

	protected void initReExp_Sprt03() {
		this.info = PDef.MS_MSBCL6020_ReExp_Sprt03_INFO;
		this.aReExp_Sprt03 = ((MSBCL_ReExpService)this).new ReExp_Sprt03();
	}

	public static MSBCL_ReExpService.ReExp_Sprt03 crtReExp_Sprt03() {
		MSBCL_ReExpService lgc = new MSBCL_ReExpService();
		lgc.initReExp_Sprt03();
		return lgc.aReExp_Sprt03;
	}

	protected void paramReExp_Sprt03(MCParam p) {
		if (this.aReExp_Sprt03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aReExp_Sprt03.up0());
		p.addUpBlock(aReExp_Sprt03.up1());
		p.addUpBlock(aReExp_Sprt03.up2());
		p.addDownBlock(aReExp_Sprt03.down0());
	}

	protected void doReExp_Sprt03() {
		aReExp_Sprt03.call();
	};

	/**
	 * ReExp_Sprt03_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR createReExp_Sprt03_HdrR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR.create();
	}

	/**
	 * ReExp_Sprt03_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR> createReExp_Sprt03_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR.class);
	}

	/**
	 * ReExp_Sprt03_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR createReExp_Sprt03_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR.create();
	}

	/**
	 * ReExp_Sprt03_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR> createReExp_Sprt03_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR.class);
	}

	/**
	 * ReExp_Sprt03_DtlYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR createReExp_Sprt03_DtlYieldR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR.create();
	}

	/**
	 * ReExp_Sprt03_DtlYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> createReExp_Sprt03_DtlYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR.class);
	}

	/**
	 * ReExp_Sprt03_RsltYieldブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR createReExp_Sprt03_RsltYieldR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR.create();
	}

	/**
	 * ReExp_Sprt03_RsltYieldブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> createReExp_Sprt03_RsltYieldL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR.class);
	}
	protected MSBCL_ReExpService.ReExp_Sprt04 aReExp_Sprt04;

	protected void initReExp_Sprt04() {
		this.info = PDef.MS_MSBCL6020_ReExp_Sprt04_INFO;
		this.aReExp_Sprt04 = ((MSBCL_ReExpService)this).new ReExp_Sprt04();
	}

	public static MSBCL_ReExpService.ReExp_Sprt04 crtReExp_Sprt04() {
		MSBCL_ReExpService lgc = new MSBCL_ReExpService();
		lgc.initReExp_Sprt04();
		return lgc.aReExp_Sprt04;
	}

	protected void paramReExp_Sprt04(MCParam p) {
		if (this.aReExp_Sprt04 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aReExp_Sprt04.up0());
		p.addUpBlock(aReExp_Sprt04.up1());
		p.addDownBlock(aReExp_Sprt04.down0());
		p.addDownBlock(aReExp_Sprt04.down1());
		p.addDownBlock(aReExp_Sprt04.down2());
		p.addDownBlock(aReExp_Sprt04.down3());
	}

	protected void doReExp_Sprt04() {
		aReExp_Sprt04.call();
	};

	/**
	 * ReExp_Sprt04_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_HdrR createReExp_Sprt04_HdrR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_HdrR.create();
	}

	/**
	 * ReExp_Sprt04_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_HdrR> createReExp_Sprt04_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_HdrR.class);
	}

	/**
	 * ReExp_Sprt04_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_DtlOperR createReExp_Sprt04_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_DtlOperR.create();
	}

	/**
	 * ReExp_Sprt04_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_DtlOperR> createReExp_Sprt04_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_DtlOperR.class);
	}
	protected MSBCL_ReExpService.ReExp_Sprt05 aReExp_Sprt05;

	protected void initReExp_Sprt05() {
		this.info = PDef.MS_MSBCL6020_ReExp_Sprt05_INFO;
		this.aReExp_Sprt05 = ((MSBCL_ReExpService)this).new ReExp_Sprt05();
	}

	public static MSBCL_ReExpService.ReExp_Sprt05 crtReExp_Sprt05() {
		MSBCL_ReExpService lgc = new MSBCL_ReExpService();
		lgc.initReExp_Sprt05();
		return lgc.aReExp_Sprt05;
	}

	protected void paramReExp_Sprt05(MCParam p) {
		if (this.aReExp_Sprt05 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aReExp_Sprt05.up0());
		p.addUpBlock(aReExp_Sprt05.up1());
		p.addUpBlock(aReExp_Sprt05.up2());
		p.addUpBlock(aReExp_Sprt05.up3());
		p.addUpBlock(aReExp_Sprt05.up4());
		p.addUpBlock(aReExp_Sprt05.up5());
		p.addDownBlock(aReExp_Sprt05.down0());
		p.addDownBlock(aReExp_Sprt05.down1());
		p.addDownBlock(aReExp_Sprt05.down2());
		p.addDownBlock(aReExp_Sprt05.down3());
		p.addDownBlock(aReExp_Sprt05.down4());
	}

	protected void doReExp_Sprt05() {
		aReExp_Sprt05.call();
	};

	/**
	 * ReExp_Sprt05_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR createReExp_Sprt05_HdrR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR.create();
	}

	/**
	 * ReExp_Sprt05_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR> createReExp_Sprt05_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR.class);
	}

	/**
	 * ReExp_Sprt05_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_DtlOperR createReExp_Sprt05_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_DtlOperR.create();
	}

	/**
	 * ReExp_Sprt05_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_DtlOperR> createReExp_Sprt05_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_DtlOperR.class);
	}

	/**
	 * ReExp_Sprt05_RsltOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR createReExp_Sprt05_RsltOperR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR.create();
	}

	/**
	 * ReExp_Sprt05_RsltOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR> createReExp_Sprt05_RsltOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR.class);
	}
	protected MSBCL_ReExpService.ReExp_Sprt06 aReExp_Sprt06;

	protected void initReExp_Sprt06() {
		this.info = PDef.MS_MSBCL6020_ReExp_Sprt06_INFO;
		this.aReExp_Sprt06 = ((MSBCL_ReExpService)this).new ReExp_Sprt06();
	}

	public static MSBCL_ReExpService.ReExp_Sprt06 crtReExp_Sprt06() {
		MSBCL_ReExpService lgc = new MSBCL_ReExpService();
		lgc.initReExp_Sprt06();
		return lgc.aReExp_Sprt06;
	}

	protected void paramReExp_Sprt06(MCParam p) {
		if (this.aReExp_Sprt06 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aReExp_Sprt06.up0());
		p.addUpBlock(aReExp_Sprt06.up1());
		p.addUpBlock(aReExp_Sprt06.up2());
		p.addUpBlock(aReExp_Sprt06.up3());
		p.addUpBlock(aReExp_Sprt06.up4());
		p.addUpBlock(aReExp_Sprt06.up5());
		p.addDownBlock(aReExp_Sprt06.down0());
		p.addDownBlock(aReExp_Sprt06.down1());
		p.addDownBlock(aReExp_Sprt06.down2());
		p.addDownBlock(aReExp_Sprt06.down3());
	}

	protected void doReExp_Sprt06() {
		aReExp_Sprt06.call();
	};

	/**
	 * ReExp_Sprt06_HdrブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_HdrR createReExp_Sprt06_HdrR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_HdrR.create();
	}

	/**
	 * ReExp_Sprt06_HdrブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_HdrR> createReExp_Sprt06_HdrL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_HdrR.class);
	}

	/**
	 * ReExp_Sprt06_DtlOperブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_DtlOperR createReExp_Sprt06_DtlOperR(){
		return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_DtlOperR.create();
	}

	/**
	 * ReExp_Sprt06_DtlOperブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_DtlOperR> createReExp_Sprt06_DtlOperL(){
		return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_DtlOperR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ReExp_Sprt01オペレーション.<p>
	 *
	 * 製造品の情報を元に構成展開を行い、投入品、副産品の情報を取得する。<br>
	 */
	abstract public class ReExp_Sprt01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ReExp_Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> down1;
		
		
		// コンストラクタ
		protected ReExp_Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR.class);

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
			invoke((MSBCL_ReExpService)MSBCL_ReExpService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * ReExp_Sprt01_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_HdrR createReExp_Sprt01_HdrR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_HdrR.create();
		}

		/**
		 * ReExp_Sprt01_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_HdrR> createReExp_Sprt01_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_HdrR.class);
		}

		/**
		 * ReExp_Sprt01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR createReExp_Sprt01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR.create();
		}

		/**
		 * ReExp_Sprt01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> createReExp_Sprt01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR.class);
		}

		/**
		 * ReExp_Sprt01_RsltInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR createReExp_Sprt01_RsltInptR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR.create();
		}

		/**
		 * ReExp_Sprt01_RsltInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> createReExp_Sprt01_RsltInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR.class);
		}

		/**
		 * ReExp_Sprt01_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR createReExp_Sprt01_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR.create();
		}

		/**
		 * ReExp_Sprt01_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> createReExp_Sprt01_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR.class);
		}

		/**
		 * ReExp_Sprt01_RsltByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR createReExp_Sprt01_RsltByProdR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR.create();
		}

		/**
		 * ReExp_Sprt01_RsltByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> createReExp_Sprt01_RsltByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>total_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>sum_cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>itm_seq</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>total_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>io_schd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>sum_cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bom_id</td></tr>
		 * 	<tr><td><br></td><td>itm_seq</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_memo1</td></tr>
		 * 	<tr><td><br></td><td>bom_memo2</td></tr>
		 * 	<tr><td><br></td><td>bom_memo3</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_upri</td></tr>
		 * 	<tr><td><br></td><td>prov_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_calc_flg</td></tr>
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
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>re_exp_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
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
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>re_exp_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_ReExpService)MSBCL_ReExpService_MC_A.this).info;
		}


	}
	/**
	 * ReExp_Sprt02オペレーション.<p>
	 *
	 * 製造品の情報を元に工数展開を行い、工数の情報を取得する。<br>
	 */
	abstract public class ReExp_Sprt02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ReExp_Sprt02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> down0;
		
		
		// コンストラクタ
		protected ReExp_Sprt02() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR.class);

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
			invoke((MSBCL_ReExpService)MSBCL_ReExpService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ReExp_Sprt02_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_HdrR createReExp_Sprt02_HdrR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_HdrR.create();
		}

		/**
		 * ReExp_Sprt02_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_HdrR> createReExp_Sprt02_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_HdrR.class);
		}

		/**
		 * ReExp_Sprt02_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR createReExp_Sprt02_DtlWkR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR.create();
		}

		/**
		 * ReExp_Sprt02_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> createReExp_Sprt02_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR.class);
		}

		/**
		 * ReExp_Sprt02_RsltWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR createReExp_Sprt02_RsltWkR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR.create();
		}

		/**
		 * ReExp_Sprt02_RsltWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> createReExp_Sprt02_RsltWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_qty</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>mst_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>mst_fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>sum_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>mst_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>mst_fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>base_qty</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>re_exp_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_ReExpService)MSBCL_ReExpService_MC_A.this).info;
		}


	}
	/**
	 * ReExp_Sprt03オペレーション.<p>
	 *
	 * 製造品、出来高計上工程の情報を元に出来高予定の情報を取得する。<br>
	 */
	abstract public class ReExp_Sprt03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ReExp_Sprt03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> up2;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> down0;
		
		
		// コンストラクタ
		protected ReExp_Sprt03() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR.class);

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
			invoke((MSBCL_ReExpService)MSBCL_ReExpService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * ReExp_Sprt03_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR createReExp_Sprt03_HdrR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR.create();
		}

		/**
		 * ReExp_Sprt03_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR> createReExp_Sprt03_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR.class);
		}

		/**
		 * ReExp_Sprt03_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR createReExp_Sprt03_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR.create();
		}

		/**
		 * ReExp_Sprt03_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR> createReExp_Sprt03_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR.class);
		}

		/**
		 * ReExp_Sprt03_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR createReExp_Sprt03_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR.create();
		}

		/**
		 * ReExp_Sprt03_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> createReExp_Sprt03_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR.class);
		}

		/**
		 * ReExp_Sprt03_RsltYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR createReExp_Sprt03_RsltYieldR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR.create();
		}

		/**
		 * ReExp_Sprt03_RsltYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> createReExp_Sprt03_RsltYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR.class);
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
		 * 	<tr><td><br></td><td>mfg_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_ratio</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> up2() {
			return up2;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_ReExpService)MSBCL_ReExpService_MC_A.this).info;
		}


	}
	/**
	 * ReExp_Sprt04オペレーション.<p>
	 *
	 * 製造品、工程の情報を元に構成展開（Sprt01）、工数展開（Sprt02）、出来高予定作成（Sprt03）を実行する。<br>
	 */
	abstract public class ReExp_Sprt04 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ReExp_Sprt04";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_DtlOperR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> down3;
		
		/**
		 * 連携情報 RE1<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt01 （{@link #so01}）<br>
		 */
		public final String RE1 = "RE1";

		/**
		 * 連携オペレーション so01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt01}<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR&gt; （{@link #so01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR&gt; （{@link #so01_down1}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt01 so01;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> so01_down0;
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> so01_down1;
		/**
		 * 連携情報 RE2<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt02 （{@link #so02}）<br>
		 */
		public final String RE2 = "RE2";

		/**
		 * 連携オペレーション so02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt02}<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR&gt; （{@link #so02_down0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt02 so02;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> so02_down0;
		/**
		 * 連携情報 RE3<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt03 （{@link #so03}）<br>
		 */
		public final String RE3 = "RE3";

		/**
		 * 連携オペレーション so03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt03}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR&gt; （{@link #so03_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR&gt; （{@link #so03_up1}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR&gt; （{@link #so03_down0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt03 so03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR> so03_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR> so03_up1;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> so03_down0;
		
		// コンストラクタ
		protected ReExp_Sprt04() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_DtlOperR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR.class);

			// 連携オペレーションの初期化
			so01 = mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.crtReExp_Sprt01();
			so02 = mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.crtReExp_Sprt02();
			so03 = mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.crtReExp_Sprt03();
			
			// 連携オペレーションのコンテナ取得
			so01_down0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR>)so01.down(0);
			so01_down1 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR>)so01.down(1);
			so02_down0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR>)so02.down(0);
			so03_up0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR>)so03.up(0);
			so03_up1 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR>)so03.up(1);
			so03_down0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR>)so03.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(RE1, so01);
			appendOpe(RE2, so02);
			appendOpe(RE3, so03);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * RE1<br>
		 * （上りブロック定義なし）<br>
		 * RE2<br>
		 * （上りブロック定義なし）<br>
		 * RE3<br>
		 * up0() => MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR&gt; （{@link #so03_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR&gt; （{@link #so03_up1}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(RE1)) {
				up_RE1();
			}
			if (key.equals(RE2)) {
				up_RE2();
			}
			if (key.equals(RE3)) {
				up_RE3(so03_up0, so03_up1, up0(), up1());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * RE1<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR&gt;（{@link #so01_down0}）=> down1()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR&gt;（{@link #so01_down1}）=> down2()<br>
		 * RE2<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR&gt;（{@link #so02_down0}）=> down3()<br>
		 * RE3<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR&gt;（{@link #so03_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(RE1)) {
				down_RE1(down1(), down2(), so01_down0, so01_down1);
			}
			if (key.equals(RE2)) {
				down_RE2(down3(), so02_down0);
			}
			if (key.equals(RE3)) {
				down_RE3(down0(), so03_down0);
			}
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
			if (i == 3) return down3();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_ReExpService)MSBCL_ReExpService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
		}
		/**
		 * ReExp_Sprt04_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_HdrR createReExp_Sprt04_HdrR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_HdrR.create();
		}

		/**
		 * ReExp_Sprt04_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_HdrR> createReExp_Sprt04_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_HdrR.class);
		}

		/**
		 * ReExp_Sprt04_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_DtlOperR createReExp_Sprt04_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_DtlOperR.create();
		}

		/**
		 * ReExp_Sprt04_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_DtlOperR> createReExp_Sprt04_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_DtlOperR.class);
		}

		/**
		 * ReExp_Sprt03_RsltYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR createReExp_Sprt03_RsltYieldR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR.create();
		}

		/**
		 * ReExp_Sprt03_RsltYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> createReExp_Sprt03_RsltYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR.class);
		}

		/**
		 * ReExp_Sprt01_RsltInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR createReExp_Sprt01_RsltInptR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR.create();
		}

		/**
		 * ReExp_Sprt01_RsltInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> createReExp_Sprt01_RsltInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR.class);
		}

		/**
		 * ReExp_Sprt01_RsltByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR createReExp_Sprt01_RsltByProdR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR.create();
		}

		/**
		 * ReExp_Sprt01_RsltByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> createReExp_Sprt01_RsltByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR.class);
		}

		/**
		 * ReExp_Sprt02_RsltWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR createReExp_Sprt02_RsltWkR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR.create();
		}

		/**
		 * ReExp_Sprt02_RsltWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> createReExp_Sprt02_RsltWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR.class);
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
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_ratio</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd_none_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_DtlOperR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>total_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>sum_cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bom_id</td></tr>
		 * 	<tr><td><br></td><td>itm_seq</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_memo1</td></tr>
		 * 	<tr><td><br></td><td>bom_memo2</td></tr>
		 * 	<tr><td><br></td><td>bom_memo3</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_upri</td></tr>
		 * 	<tr><td><br></td><td>prov_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_calc_flg</td></tr>
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
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
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
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>sum_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>mst_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>mst_fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>base_qty</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>re_exp_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> down3() {
			return down3;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_ReExpService)MSBCL_ReExpService_MC_A.this).info;
		}

		//-----------------------RE1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループRE1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_RE1(){
		}
		//-----------------------RE2専用up関連メソッド--------------------------
		/**
		 * オペレーショングループRE2の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_RE2(){
		}
		//-----------------------RE3専用up関連メソッド--------------------------
		/**
		 * オペレーショングループRE3の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_RE3(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_HdrR> src_ReExp_Sprt04_Hdr, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_DtlOperR> src_ReExp_Sprt04_DtlOper){
			up_RE3_so03_0(dest0_0, src_ReExp_Sprt04_Hdr);
			up_RE3_so03_1(dest0_1, src_ReExp_Sprt04_DtlOper);
		}
		
		/**
		 * 連携処理RE3_so03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RE3_so03_0() {
			MCRowMapper map = new Map_up_RE3_so03_0();
			return map;
		}

		/**
		 * 連携処理RE3_so03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_RE3_so03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("yield_schd_qty", "yield_schd_qty");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("strg_str_ln_nm", "strg_str_ln_nm");
				addColumnPathMap("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg");
			}
		}

		/**
		 * 連携処理RE3_so03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RE3_so03_0(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_HdrR r_src) {
		}

		/**
		 * 連携処理RE3_so03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RE3_so03_0(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_HdrR> src) {
			MCRowMapper _rm = createMap_up_RE3_so03_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RE3_so03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理RE3_so03の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RE3_so03_1() {
			MCRowMapper map = new Map_up_RE3_so03_1();
			return map;
		}

		/**
		 * 連携処理RE3_so03の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_RE3_so03_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("oper_inst_qty", "oper_inst_qty");
				addColumnPathMap("end_schd_dt", "end_schd_tm");
				addColumnPathMap("yield_oper_flg", "yield_oper_flg");
				addColumnPathMap("yield_oper_ratio", "yield_oper_ratio");
			}
		}

		/**
		 * 連携処理RE3_so03の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RE3_so03_1(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_DtlOperR r_src) {
		}

		/**
		 * 連携処理RE3_so03の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RE3_so03_1(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_DtlOperR> src) {
			MCRowMapper _rm = createMap_up_RE3_so03_1();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt04_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RE3_so03_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------RE1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループRE1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_RE1(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> dest_ReExp_Sprt01_RsltInpt, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> dest_ReExp_Sprt01_RsltByProd, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> src0_0, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> src0_1){
			down_RE1_so01_0(dest_ReExp_Sprt01_RsltInpt, src0_0);
			down_RE1_so01_1(dest_ReExp_Sprt01_RsltByProd, src0_1);
		}

		/**
		 * 連携処理RE1_so01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE1_so01_0() {
			MCRowMapper map = new Map_down_RE1_so01_0();
			return map;
		}

		/**
		 * 連携処理RE1_so01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE1_so01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("inpt_schd_no", "inpt_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_grp_nm", "alt_grp_nm");
				addColumnPathMap("alt_grp_seq", "alt_grp_seq");
				addColumnPathMap("alt_qty", "alt_qty");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("th_image", "th_image");
				addColumnPathMap("inpt_qty", "inpt_qty");
				addColumnPathMap("rqmt_qty", "rqmt_qty");
				addColumnPathMap("fxd_rqmt_qty", "fxd_rqmt_qty");
				addColumnPathMap("total_rqmt_qty", "total_rqmt_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_dec_place", "base_dec_place");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("std_cont_fctr", "std_cont_fctr");
				addColumnPathMap("cont_fctr_flg", "cont_fctr_flg");
				addColumnPathMap("cont_fctr_rnd_typ", "cont_fctr_rnd_typ");
				addColumnPathMap("cont_fctr_dec_place", "cont_fctr_dec_place");
				addColumnPathMap("cont_inpt_qty", "cont_inpt_qty");
				addColumnPathMap("cont_rqmt_qty", "cont_rqmt_qty");
				addColumnPathMap("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty");
				addColumnPathMap("sum_cont_rqmt_qty", "sum_cont_rqmt_qty");
				addColumnPathMap("cont_fctr_unit_cd", "cont_fctr_unit_cd");
				addColumnPathMap("cont_fctr_unit_nm", "cont_fctr_unit_nm");
				addColumnPathMap("inpt_schd_dt", "inpt_schd_dt");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno1_null_flg", "sno1_null_flg");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno2_null_flg", "sno2_null_flg");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno3_null_flg", "sno3_null_flg");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sno4_null_flg", "sno4_null_flg");
				addColumnPathMap("inpt_loc_cd", "inpt_loc_cd");
				addColumnPathMap("inpt_loc_nm", "inpt_loc_nm");
				addColumnPathMap("inpt_str_ln_tgt_flg", "inpt_str_ln_tgt_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("gd_nm", "gd_nm");
				addColumnPathMap("inst_lot_fix_flg", "inst_lot_fix_flg");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("bom_id", "bom_id");
				addColumnPathMap("itm_seq", "itm_seq");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("bkf_typ_nm", "bkf_typ_nm");
				addColumnPathMap("main_itm_flg", "main_itm_flg");
				addColumnPathMap("bom_memo1", "bom_memo1");
				addColumnPathMap("bom_memo2", "bom_memo2");
				addColumnPathMap("bom_memo3", "bom_memo3");
				addColumnPathMap("alloc_ctl_typ", "alloc_ctl_typ");
				addColumnPathMap("inpt_ctl_typ", "inpt_ctl_typ");
				addColumnPathMap("in_offst_typ", "in_offst_typ");
				addColumnPathMap("in_offst", "in_offst");
				addColumnPathMap("lot_mix_flg", "lot_mix_flg");
				addColumnPathMap("sublot_mix_flg", "sublot_mix_flg");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("prov_typ", "prov_typ");
				addColumnPathMap("prov_upri", "prov_upri");
				addColumnPathMap("prov_cur_cd", "prov_cur_cd");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("alt_itm_ratio", "alt_itm_ratio");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("yield_calc_flg", "yield_calc_flg");
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
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("act_cont_fctr", "act_cont_fctr");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("inpt_str_ln_cd", "inpt_str_ln_cd");
				addColumnPathMap("inpt_str_ln_nm", "inpt_str_ln_nm");
				addColumnPathMap("inpt_str_ln_cd_none_flg", "inpt_str_ln_cd_none_flg");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
			}
		}

		/**
		 * 連携処理RE1_so01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE1_so01_0(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR r_src) {
		}

		/**
		 * 連携処理RE1_so01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE1_so01_0(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> src) {
			MCRowMapper _rm = createMap_down_RE1_so01_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE1_so01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理RE1_so01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE1_so01_1() {
			MCRowMapper map = new Map_down_RE1_so01_1();
			return map;
		}

		/**
		 * 連携処理RE1_so01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE1_so01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("th_image", "th_image");
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
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_nm", "trd_unit_nm");
				addColumnPathMap("trd_dec_place", "trd_dec_place");
				addColumnPathMap("trd_unit_conv_rnd_typ", "trd_unit_conv_rnd_typ");
				addColumnPathMap("conv_base_qty", "conv_base_qty");
				addColumnPathMap("conv_qty", "conv_qty");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_dec_place", "base_dec_place");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_loc_nm", "strg_loc_nm");
				addColumnPathMap("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg");
				addColumnPathMap("yield_schd_dt", "yield_schd_dt");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("strg_str_ln_nm", "strg_str_ln_nm");
				addColumnPathMap("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg");
			}
		}

		/**
		 * 連携処理RE1_so01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE1_so01_1(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR r_src) {
		}

		/**
		 * 連携処理RE1_so01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE1_so01_1(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> src) {
			MCRowMapper _rm = createMap_down_RE1_so01_1();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE1_so01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------RE2専用down関連メソッド--------------------------

		/**
		 * オペレーショングループRE2の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_RE2(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> dest_ReExp_Sprt02_RsltWk, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> src0_0){
			down_RE2_so02_0(dest_ReExp_Sprt02_RsltWk, src0_0);
		}

		/**
		 * 連携処理RE2_so02の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE2_so02_0() {
			MCRowMapper map = new Map_down_RE2_so02_0();
			return map;
		}

		/**
		 * 連携処理RE2_so02の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE2_so02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("wk_cost_nm", "wk_cost_nm");
				addColumnPathMap("wk_cost", "wk_cost");
				addColumnPathMap("fxd_wk_cost", "fxd_wk_cost");
				addColumnPathMap("sum_wk_cost", "sum_wk_cost");
				addColumnPathMap("wk_cost_unit_nm", "wk_cost_unit_nm");
				addColumnPathMap("wk_cost_calc_flg", "wk_cost_calc_flg");
				addColumnPathMap("mst_wk_cost", "mst_wk_cost");
				addColumnPathMap("mst_fxd_wk_cost", "mst_fxd_wk_cost");
				addColumnPathMap("base_qty", "base_qty");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("rnd_typ", "rnd_typ");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_nm", "oper_nm");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("re_exp_flg", "re_exp_flg");
			}
		}

		/**
		 * 連携処理RE2_so02の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE2_so02_0(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR r_src) {
		}

		/**
		 * 連携処理RE2_so02の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE2_so02_0(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> src) {
			MCRowMapper _rm = createMap_down_RE2_so02_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE2_so02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------RE3専用down関連メソッド--------------------------

		/**
		 * オペレーショングループRE3の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_RE3(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> dest_ReExp_Sprt03_RsltYield, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> src0_0){
			down_RE3_so03_0(dest_ReExp_Sprt03_RsltYield, src0_0);
		}

		/**
		 * 連携処理RE3_so03の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE3_so03_0() {
			MCRowMapper map = new Map_down_RE3_so03_0();
			return map;
		}

		/**
		 * 連携処理RE3_so03の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE3_so03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_nm", "trd_unit_nm");
				addColumnPathMap("trd_dec_place", "trd_dec_place");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_dec_place", "base_dec_place");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("conv_base_qty", "conv_base_qty");
				addColumnPathMap("conv_qty", "conv_qty");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_loc_nm", "strg_loc_nm");
				addColumnPathMap("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("strg_str_ln_nm", "strg_str_ln_nm");
				addColumnPathMap("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg");
				addColumnPathMap("yield_schd_dt", "yield_schd_dt");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
			}
		}

		/**
		 * 連携処理RE3_so03の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE3_so03_0(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR r_src) {
		}

		/**
		 * 連携処理RE3_so03の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE3_so03_0(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> src) {
			MCRowMapper _rm = createMap_down_RE3_so03_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE3_so03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * ReExp_Sprt05オペレーション.<p>
	 *
	 * 製造品の情報を元に工程オーダを展開し、構成展開（Sprt01）、工数展開（Sprt02）、出来高予定作成（Sprt03）を実行する。<br>
	 */
	abstract public class ReExp_Sprt05 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ReExp_Sprt05";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_DtlOperR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> up4;
		/** このオペレーションへの上り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> up5;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> down4;
		
		/**
		 * 連携情報 RE1<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt01 （{@link #so01}）<br>
		 */
		public final String RE1 = "RE1";

		/**
		 * 連携オペレーション so01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR&gt; （{@link #so01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR&gt; （{@link #so01_up1}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR&gt; （{@link #so01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR&gt; （{@link #so01_down1}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt01 so01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> so01_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> so01_up1;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> so01_down0;
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> so01_down1;
		/**
		 * 連携情報 RE2<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt02 （{@link #so02}）<br>
		 */
		public final String RE2 = "RE2";

		/**
		 * 連携オペレーション so02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR&gt; （{@link #so02_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR&gt; （{@link #so02_down0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt02 so02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> so02_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> so02_down0;
		/**
		 * 連携情報 RE3<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt03 （{@link #so03}）<br>
		 */
		public final String RE3 = "RE3";

		/**
		 * 連携オペレーション so03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt03}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR&gt; （{@link #so03_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR&gt; （{@link #so03_up1}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR&gt; （{@link #so03_down0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt03 so03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR> so03_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> so03_up1;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> so03_down0;
		/**
		 * 連携情報 RE4<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL5010.MSBCL_OrdRegService.Ord_Sprt01 （{@link #so04}）<br>
		 */
		public final String RE4 = "RE4";

		/**
		 * 連携オペレーション so04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL5010.MSBCL_OrdRegService.Ord_Sprt01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR&gt; （{@link #so04_up0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL5010.MSBCL_OrdRegService.Ord_Sprt01 so04;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR> so04_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ReExp_Sprt05() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_DtlOperR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR.class);
			up4 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR.class);
			up5 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR.class);
			down4 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR.class);

			// 連携オペレーションの初期化
			so01 = mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.crtReExp_Sprt01();
			so02 = mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.crtReExp_Sprt02();
			so03 = mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.crtReExp_Sprt03();
			so04 = mcframe.serverMSBC.MSBCL5010.MSBCL_OrdRegService.crtOrd_Sprt01();
			
			// 連携オペレーションのコンテナ取得
			so01_up0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR>)so01.up(1);
			so01_up1 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR>)so01.up(2);
			so01_down0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR>)so01.down(0);
			so01_down1 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR>)so01.down(1);
			so02_up0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR>)so02.up(1);
			so02_down0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR>)so02.down(0);
			so03_up0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR>)so03.up(0);
			so03_up1 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR>)so03.up(2);
			so03_down0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR>)so03.down(0);
			so04_up0 = (MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR>)so04.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(RE1, so01);
			appendOpe(RE2, so02);
			appendOpe(RE3, so03);
			appendOpe(RE4, so04);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * RE1<br>
		 * up3() => MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR&gt; （{@link #so01_up0}）<br>
		 * up4() => MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR&gt; （{@link #so01_up1}）<br>
		 * RE2<br>
		 * up5() => MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR&gt; （{@link #so02_up0}）<br>
		 * RE3<br>
		 * up0() => MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR&gt; （{@link #so03_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR&gt; （{@link #so03_up1}）<br>
		 * RE4<br>
		 * up0() => MCList&lt;mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR&gt; （{@link #so04_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(RE1)) {
				up_RE1(so01_up0, so01_up1, up3(), up4());
			}
			if (key.equals(RE2)) {
				up_RE2(so02_up0, up5());
			}
			if (key.equals(RE3)) {
				up_RE3(so03_up0, so03_up1, up0(), up2());
			}
			if (key.equals(RE4)) {
				up_RE4(so04_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * RE1<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR&gt;（{@link #so01_down0}）=> down2()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR&gt;（{@link #so01_down1}）=> down3()<br>
		 * RE2<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR&gt;（{@link #so02_down0}）=> down4()<br>
		 * RE3<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR&gt;（{@link #so03_down0}）=> down1()<br>
		 * RE4<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(RE1)) {
				down_RE1(down2(), down3(), so01_down0, so01_down1);
			}
			if (key.equals(RE2)) {
				down_RE2(down4(), so02_down0);
			}
			if (key.equals(RE3)) {
				down_RE3(down1(), so03_down0);
			}
			if (key.equals(RE4)) {
				down_RE4();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			if (i == 4) return up4();
			if (i == 5) return up5();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_ReExpService)MSBCL_ReExpService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
		}
		/**
		 * ReExp_Sprt05_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR createReExp_Sprt05_HdrR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR.create();
		}

		/**
		 * ReExp_Sprt05_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR> createReExp_Sprt05_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR.class);
		}

		/**
		 * ReExp_Sprt05_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_DtlOperR createReExp_Sprt05_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_DtlOperR.create();
		}

		/**
		 * ReExp_Sprt05_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_DtlOperR> createReExp_Sprt05_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_DtlOperR.class);
		}

		/**
		 * ReExp_Sprt05_RsltOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR createReExp_Sprt05_RsltOperR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR.create();
		}

		/**
		 * ReExp_Sprt05_RsltOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR> createReExp_Sprt05_RsltOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR.class);
		}

		/**
		 * ReExp_Sprt03_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR createReExp_Sprt03_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR.create();
		}

		/**
		 * ReExp_Sprt03_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> createReExp_Sprt03_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR.class);
		}

		/**
		 * ReExp_Sprt03_RsltYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR createReExp_Sprt03_RsltYieldR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR.create();
		}

		/**
		 * ReExp_Sprt03_RsltYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> createReExp_Sprt03_RsltYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR.class);
		}

		/**
		 * ReExp_Sprt01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR createReExp_Sprt01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR.create();
		}

		/**
		 * ReExp_Sprt01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> createReExp_Sprt01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR.class);
		}

		/**
		 * ReExp_Sprt01_RsltInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR createReExp_Sprt01_RsltInptR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR.create();
		}

		/**
		 * ReExp_Sprt01_RsltInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> createReExp_Sprt01_RsltInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR.class);
		}

		/**
		 * ReExp_Sprt01_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR createReExp_Sprt01_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR.create();
		}

		/**
		 * ReExp_Sprt01_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> createReExp_Sprt01_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR.class);
		}

		/**
		 * ReExp_Sprt01_RsltByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR createReExp_Sprt01_RsltByProdR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR.create();
		}

		/**
		 * ReExp_Sprt01_RsltByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> createReExp_Sprt01_RsltByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR.class);
		}

		/**
		 * ReExp_Sprt02_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR createReExp_Sprt02_DtlWkR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR.create();
		}

		/**
		 * ReExp_Sprt02_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> createReExp_Sprt02_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR.class);
		}

		/**
		 * ReExp_Sprt02_RsltWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR createReExp_Sprt02_RsltWkR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR.create();
		}

		/**
		 * ReExp_Sprt02_RsltWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> createReExp_Sprt02_RsltWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_end_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_no</td></tr>
		 * 	<tr><td><br></td><td>not_bom_exp_flg</td></tr>
		 * 	<tr><td><br></td><td>not_wk_exp_flg</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>mfg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oper_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_add_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_ratio</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_DtlOperR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> up2() {
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
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>total_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>sum_cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>itm_seq</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> up4() {
			return up4;
		}

		/**
		 * 上り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>mst_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>mst_fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> up5() {
			return up5;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>bkf_flg</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_grp</td></tr>
		 * 	<tr><td><br></td><td>wip_rate</td></tr>
		 * 	<tr><td><br></td><td>oper_std_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_conv_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_lower_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_std_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_upper_yield</td></tr>
		 * 	<tr><td><br></td><td>oper_lt</td></tr>
		 * 	<tr><td><br></td><td>oper_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>oper_offst</td></tr>
		 * 	<tr><td><br></td><td>oper_offst_add_qty</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_ratio</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>lmt_fr_dt_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_RsltOperR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>total_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>sum_cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bom_id</td></tr>
		 * 	<tr><td><br></td><td>itm_seq</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_memo1</td></tr>
		 * 	<tr><td><br></td><td>bom_memo2</td></tr>
		 * 	<tr><td><br></td><td>bom_memo3</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_upri</td></tr>
		 * 	<tr><td><br></td><td>prov_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_calc_flg</td></tr>
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
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>re_exp_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
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
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>re_exp_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>sum_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>mst_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>mst_fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>base_qty</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>re_exp_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> down4() {
			return down4;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_ReExpService)MSBCL_ReExpService_MC_A.this).info;
		}

		//-----------------------RE1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループRE1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_RE1(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> src_ReExp_Sprt01_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> src_ReExp_Sprt01_DtlByProd){
			up_RE1_so01_0(dest0_0, src_ReExp_Sprt01_DtlInpt);
			up_RE1_so01_1(dest0_1, src_ReExp_Sprt01_DtlByProd);
		}
		
		/**
		 * 連携処理RE1_so01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RE1_so01_0() {
			MCRowMapper map = new Map_up_RE1_so01_0();
			return map;
		}

		/**
		 * 連携処理RE1_so01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_RE1_so01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("inpt_schd_no", "inpt_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_grp_seq", "alt_grp_seq");
				addColumnPathMap("alt_qty", "alt_qty");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("inpt_qty", "inpt_qty");
				addColumnPathMap("rqmt_qty", "rqmt_qty");
				addColumnPathMap("fxd_rqmt_qty", "fxd_rqmt_qty");
				addColumnPathMap("total_rqmt_qty", "total_rqmt_qty");
				addColumnPathMap("cont_inpt_qty", "cont_inpt_qty");
				addColumnPathMap("cont_rqmt_qty", "cont_rqmt_qty");
				addColumnPathMap("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty");
				addColumnPathMap("sum_cont_rqmt_qty", "sum_cont_rqmt_qty");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("itm_seq", "itm_seq");
				addColumnPathMap("in_offst_typ", "in_offst_typ");
				addColumnPathMap("in_offst", "in_offst");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("alloc_flg", "alloc_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("act_cont_fctr", "act_cont_fctr");
				addColumnPathMap("first_gr_dt", "first_gr_dt");
				addColumnPathMap("lot_seq", "lot_seq");
			}
		}

		/**
		 * 連携処理RE1_so01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RE1_so01_0(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR r_src) {
		}

		/**
		 * 連携処理RE1_so01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RE1_so01_0(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> src) {
			MCRowMapper _rm = createMap_up_RE1_so01_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RE1_so01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理RE1_so01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RE1_so01_1() {
			MCRowMapper map = new Map_up_RE1_so01_1();
			return map;
		}

		/**
		 * 連携処理RE1_so01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_RE1_so01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
			}
		}

		/**
		 * 連携処理RE1_so01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RE1_so01_1(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理RE1_so01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RE1_so01_1(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_up_RE1_so01_1();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RE1_so01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------RE2専用up関連メソッド--------------------------
		/**
		 * オペレーショングループRE2の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_RE2(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> src_ReExp_Sprt02_DtlWk){
			up_RE2_so02_0(dest0_0, src_ReExp_Sprt02_DtlWk);
		}
		
		/**
		 * 連携処理RE2_so02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RE2_so02_0() {
			MCRowMapper map = new Map_up_RE2_so02_0();
			return map;
		}

		/**
		 * 連携処理RE2_so02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_RE2_so02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("mst_wk_cost", "mst_wk_cost");
				addColumnPathMap("mst_fxd_wk_cost", "mst_fxd_wk_cost");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
			}
		}

		/**
		 * 連携処理RE2_so02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RE2_so02_0(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR r_src) {
		}

		/**
		 * 連携処理RE2_so02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RE2_so02_0(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> src) {
			MCRowMapper _rm = createMap_up_RE2_so02_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RE2_so02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------RE3専用up関連メソッド--------------------------
		/**
		 * オペレーショングループRE3の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_RE3(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR> src_ReExp_Sprt05_Hdr, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> src_ReExp_Sprt03_DtlYield){
			up_RE3_so03_0(dest0_0, src_ReExp_Sprt05_Hdr);
			up_RE3_so03_1(dest0_1, src_ReExp_Sprt03_DtlYield);
		}
		
		/**
		 * 連携処理RE3_so03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RE3_so03_0() {
			MCRowMapper map = new Map_up_RE3_so03_0();
			return map;
		}

		/**
		 * 連携処理RE3_so03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_RE3_so03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("yield_schd_qty", "yield_schd_qty");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("strg_str_ln_nm", "strg_str_ln_nm");
				addColumnPathMap("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg");
			}
		}

		/**
		 * 連携処理RE3_so03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RE3_so03_0(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR r_src) {
		}

		/**
		 * 連携処理RE3_so03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RE3_so03_0(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR> src) {
			MCRowMapper _rm = createMap_up_RE3_so03_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RE3_so03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理RE3_so03の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RE3_so03_1() {
			MCRowMapper map = new Map_up_RE3_so03_1();
			return map;
		}

		/**
		 * 連携処理RE3_so03の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_RE3_so03_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("yield_schd_dt", "yield_schd_dt");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
			}
		}

		/**
		 * 連携処理RE3_so03の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RE3_so03_1(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR r_src) {
		}

		/**
		 * 連携処理RE3_so03の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RE3_so03_1(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> src) {
			MCRowMapper _rm = createMap_up_RE3_so03_1();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RE3_so03_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------RE4専用up関連メソッド--------------------------
		/**
		 * オペレーショングループRE4の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_RE4(MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR> src_ReExp_Sprt05_Hdr){
			up_RE4_so04_0(dest0_0, src_ReExp_Sprt05_Hdr);
		}
		
		/**
		 * 連携処理RE4_so04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RE4_so04_0() {
			MCRowMapper map = new Map_up_RE4_so04_0();
			return map;
		}

		/**
		 * 連携処理RE4_so04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_RE4_so04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("oper_ptn", "oper_ptn");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("inst_qty", "mfg_inst_qty");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("itm_ord_typ", "itm_ord_typ");
				addColumnPathMap("mfg_st_schd_dt", "mfg_st_schd_dt");
				addColumnPathMap("mfg_end_schd_dt", "mfg_end_schd_dt");
				addColumnPathMap("master_dt", "master_dt");
			}
		}

		/**
		 * 連携処理RE4_so04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RE4_so04_0(mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR r_src) {
		}

		/**
		 * 連携処理RE4_so04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RE4_so04_0(MCList<mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR> src) {
			MCRowMapper _rm = createMap_up_RE4_so04_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt05_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL5010.Ord_Sprt01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RE4_so04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------RE1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループRE1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_RE1(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> dest_ReExp_Sprt01_RsltInpt, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> dest_ReExp_Sprt01_RsltByProd, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> src0_0, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> src0_1){
			down_RE1_so01_0(dest_ReExp_Sprt01_RsltInpt, src0_0);
			down_RE1_so01_1(dest_ReExp_Sprt01_RsltByProd, src0_1);
		}

		/**
		 * 連携処理RE1_so01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE1_so01_0() {
			MCRowMapper map = new Map_down_RE1_so01_0();
			return map;
		}

		/**
		 * 連携処理RE1_so01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE1_so01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("inpt_schd_no", "inpt_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_grp_nm", "alt_grp_nm");
				addColumnPathMap("alt_grp_seq", "alt_grp_seq");
				addColumnPathMap("alt_qty", "alt_qty");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("th_image", "th_image");
				addColumnPathMap("inpt_qty", "inpt_qty");
				addColumnPathMap("rqmt_qty", "rqmt_qty");
				addColumnPathMap("fxd_rqmt_qty", "fxd_rqmt_qty");
				addColumnPathMap("total_rqmt_qty", "total_rqmt_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_dec_place", "base_dec_place");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("std_cont_fctr", "std_cont_fctr");
				addColumnPathMap("cont_fctr_flg", "cont_fctr_flg");
				addColumnPathMap("cont_fctr_rnd_typ", "cont_fctr_rnd_typ");
				addColumnPathMap("cont_fctr_dec_place", "cont_fctr_dec_place");
				addColumnPathMap("cont_inpt_qty", "cont_inpt_qty");
				addColumnPathMap("cont_rqmt_qty", "cont_rqmt_qty");
				addColumnPathMap("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty");
				addColumnPathMap("sum_cont_rqmt_qty", "sum_cont_rqmt_qty");
				addColumnPathMap("cont_fctr_unit_cd", "cont_fctr_unit_cd");
				addColumnPathMap("cont_fctr_unit_nm", "cont_fctr_unit_nm");
				addColumnPathMap("inpt_schd_dt", "inpt_schd_dt");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno1_null_flg", "sno1_null_flg");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno2_null_flg", "sno2_null_flg");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno3_null_flg", "sno3_null_flg");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sno4_null_flg", "sno4_null_flg");
				addColumnPathMap("inpt_loc_cd", "inpt_loc_cd");
				addColumnPathMap("inpt_loc_nm", "inpt_loc_nm");
				addColumnPathMap("inpt_str_ln_tgt_flg", "inpt_str_ln_tgt_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("gd_nm", "gd_nm");
				addColumnPathMap("inst_lot_fix_flg", "inst_lot_fix_flg");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("bom_id", "bom_id");
				addColumnPathMap("itm_seq", "itm_seq");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("bkf_typ_nm", "bkf_typ_nm");
				addColumnPathMap("main_itm_flg", "main_itm_flg");
				addColumnPathMap("bom_memo1", "bom_memo1");
				addColumnPathMap("bom_memo2", "bom_memo2");
				addColumnPathMap("bom_memo3", "bom_memo3");
				addColumnPathMap("alloc_ctl_typ", "alloc_ctl_typ");
				addColumnPathMap("inpt_ctl_typ", "inpt_ctl_typ");
				addColumnPathMap("in_offst_typ", "in_offst_typ");
				addColumnPathMap("in_offst", "in_offst");
				addColumnPathMap("lot_mix_flg", "lot_mix_flg");
				addColumnPathMap("sublot_mix_flg", "sublot_mix_flg");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("prov_typ", "prov_typ");
				addColumnPathMap("prov_upri", "prov_upri");
				addColumnPathMap("prov_cur_cd", "prov_cur_cd");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("alt_itm_ratio", "alt_itm_ratio");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("yield_calc_flg", "yield_calc_flg");
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
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("act_cont_fctr", "act_cont_fctr");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("inpt_str_ln_cd", "inpt_str_ln_cd");
				addColumnPathMap("inpt_str_ln_nm", "inpt_str_ln_nm");
				addColumnPathMap("inpt_str_ln_cd_none_flg", "inpt_str_ln_cd_none_flg");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("re_exp_flg", "re_exp_flg");
			}
		}

		/**
		 * 連携処理RE1_so01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE1_so01_0(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR r_src) {
		}

		/**
		 * 連携処理RE1_so01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE1_so01_0(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> src) {
			MCRowMapper _rm = createMap_down_RE1_so01_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE1_so01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理RE1_so01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE1_so01_1() {
			MCRowMapper map = new Map_down_RE1_so01_1();
			return map;
		}

		/**
		 * 連携処理RE1_so01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE1_so01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("th_image", "th_image");
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
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_nm", "trd_unit_nm");
				addColumnPathMap("trd_dec_place", "trd_dec_place");
				addColumnPathMap("trd_unit_conv_rnd_typ", "trd_unit_conv_rnd_typ");
				addColumnPathMap("conv_base_qty", "conv_base_qty");
				addColumnPathMap("conv_qty", "conv_qty");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_dec_place", "base_dec_place");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_loc_nm", "strg_loc_nm");
				addColumnPathMap("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg");
				addColumnPathMap("yield_schd_dt", "yield_schd_dt");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("strg_str_ln_nm", "strg_str_ln_nm");
				addColumnPathMap("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg");
				addColumnPathMap("re_exp_flg", "re_exp_flg");
			}
		}

		/**
		 * 連携処理RE1_so01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE1_so01_1(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR r_src) {
		}

		/**
		 * 連携処理RE1_so01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE1_so01_1(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> src) {
			MCRowMapper _rm = createMap_down_RE1_so01_1();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE1_so01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------RE2専用down関連メソッド--------------------------

		/**
		 * オペレーショングループRE2の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_RE2(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> dest_ReExp_Sprt02_RsltWk, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> src0_0){
			down_RE2_so02_0(dest_ReExp_Sprt02_RsltWk, src0_0);
		}

		/**
		 * 連携処理RE2_so02の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE2_so02_0() {
			MCRowMapper map = new Map_down_RE2_so02_0();
			return map;
		}

		/**
		 * 連携処理RE2_so02の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE2_so02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("wk_cost_nm", "wk_cost_nm");
				addColumnPathMap("wk_cost", "wk_cost");
				addColumnPathMap("fxd_wk_cost", "fxd_wk_cost");
				addColumnPathMap("sum_wk_cost", "sum_wk_cost");
				addColumnPathMap("wk_cost_unit_nm", "wk_cost_unit_nm");
				addColumnPathMap("wk_cost_calc_flg", "wk_cost_calc_flg");
				addColumnPathMap("mst_wk_cost", "mst_wk_cost");
				addColumnPathMap("mst_fxd_wk_cost", "mst_fxd_wk_cost");
				addColumnPathMap("base_qty", "base_qty");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("rnd_typ", "rnd_typ");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_nm", "oper_nm");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("re_exp_flg", "re_exp_flg");
			}
		}

		/**
		 * 連携処理RE2_so02の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE2_so02_0(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR r_src) {
		}

		/**
		 * 連携処理RE2_so02の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE2_so02_0(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> src) {
			MCRowMapper _rm = createMap_down_RE2_so02_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE2_so02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------RE3専用down関連メソッド--------------------------

		/**
		 * オペレーショングループRE3の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_RE3(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> dest_ReExp_Sprt03_RsltYield, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> src0_0){
			down_RE3_so03_0(dest_ReExp_Sprt03_RsltYield, src0_0);
		}

		/**
		 * 連携処理RE3_so03の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE3_so03_0() {
			MCRowMapper map = new Map_down_RE3_so03_0();
			return map;
		}

		/**
		 * 連携処理RE3_so03の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE3_so03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_nm", "trd_unit_nm");
				addColumnPathMap("trd_dec_place", "trd_dec_place");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_dec_place", "base_dec_place");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("conv_base_qty", "conv_base_qty");
				addColumnPathMap("conv_qty", "conv_qty");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_loc_nm", "strg_loc_nm");
				addColumnPathMap("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("strg_str_ln_nm", "strg_str_ln_nm");
				addColumnPathMap("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg");
				addColumnPathMap("yield_schd_dt", "yield_schd_dt");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
			}
		}

		/**
		 * 連携処理RE3_so03の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE3_so03_0(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR r_src) {
		}

		/**
		 * 連携処理RE3_so03の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE3_so03_0(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> src) {
			MCRowMapper _rm = createMap_down_RE3_so03_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE3_so03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------RE4専用down関連メソッド--------------------------

		/**
		 * オペレーショングループRE4の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_RE4(){
		}
	}
	/**
	 * ReExp_Sprt06オペレーション.<p>
	 *
	 * 製造品、工程の情報を元に構成展開（Sprt01）、工数展開（Sprt02）、出来高予定作成（Sprt03）を実行する。<br>
	 */
	abstract public class ReExp_Sprt06 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Operation {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ReExp_Sprt06";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_HdrR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_DtlOperR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> up4;
		/** このオペレーションへの上り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> up5;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> down3;
		
		/**
		 * 連携情報 RE1<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt01 （{@link #so01}）<br>
		 */
		public final String RE1 = "RE1";

		/**
		 * 連携オペレーション so01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR&gt; （{@link #so01_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR&gt; （{@link #so01_up1}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR&gt; （{@link #so01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR&gt; （{@link #so01_down1}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt01 so01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> so01_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> so01_up1;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> so01_down0;
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> so01_down1;
		/**
		 * 連携情報 RE2<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt02 （{@link #so02}）<br>
		 */
		public final String RE2 = "RE2";

		/**
		 * 連携オペレーション so02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt02}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR&gt; （{@link #so02_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR&gt; （{@link #so02_down0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt02 so02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> so02_up0;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> so02_down0;
		/**
		 * 連携情報 RE3<p>
		 *
		 * 連携先 mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt03 （{@link #so03}）<br>
		 */
		public final String RE3 = "RE3";

		/**
		 * 連携オペレーション so03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt03}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR&gt; （{@link #so03_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR&gt; （{@link #so03_up1}）<br>
		 * 第3 上りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR&gt; （{@link #so03_up2}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR&gt; （{@link #so03_down0}）<br>
		 */
		public final mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.ReExp_Sprt03 so03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR> so03_up0;
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR> so03_up1;
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> so03_up2;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> so03_down0;
		
		// コンストラクタ
		protected ReExp_Sprt06() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_HdrR.class);
			up1 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_DtlOperR.class);
			up2 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR.class);
			up3 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR.class);
			up4 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR.class);
			up5 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR.class);
			down0 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR.class);
			down1 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR.class);
			down2 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR.class);
			down3 = MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR.class);

			// 連携オペレーションの初期化
			so01 = mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.crtReExp_Sprt01();
			so02 = mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.crtReExp_Sprt02();
			so03 = mcframe.serverMSBC.MSBCL6020.MSBCL_ReExpService.crtReExp_Sprt03();
			
			// 連携オペレーションのコンテナ取得
			so01_up0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR>)so01.up(1);
			so01_up1 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR>)so01.up(2);
			so01_down0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR>)so01.down(0);
			so01_down1 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR>)so01.down(1);
			so02_up0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR>)so02.up(1);
			so02_down0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR>)so02.down(0);
			so03_up0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR>)so03.up(0);
			so03_up1 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR>)so03.up(1);
			so03_up2 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR>)so03.up(2);
			so03_down0 = (MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR>)so03.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(RE1, so01);
			appendOpe(RE2, so02);
			appendOpe(RE3, so03);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * RE1<br>
		 * up3() => MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR&gt; （{@link #so01_up0}）<br>
		 * up4() => MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR&gt; （{@link #so01_up1}）<br>
		 * RE2<br>
		 * up5() => MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR&gt; （{@link #so02_up0}）<br>
		 * RE3<br>
		 * up0() => MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR&gt; （{@link #so03_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR&gt; （{@link #so03_up1}）<br>
		 * up2() => MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR&gt; （{@link #so03_up2}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(RE1)) {
				up_RE1(so01_up0, so01_up1, up3(), up4());
			}
			if (key.equals(RE2)) {
				up_RE2(so02_up0, up5());
			}
			if (key.equals(RE3)) {
				up_RE3(so03_up0, so03_up1, so03_up2, up0(), up1(), up2());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * RE1<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR&gt;（{@link #so01_down0}）=> down1()<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR&gt;（{@link #so01_down1}）=> down2()<br>
		 * RE2<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR&gt;（{@link #so02_down0}）=> down3()<br>
		 * RE3<br>
		 * MCList&lt;mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR&gt;（{@link #so03_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(RE1)) {
				down_RE1(down1(), down2(), so01_down0, so01_down1);
			}
			if (key.equals(RE2)) {
				down_RE2(down3(), so02_down0);
			}
			if (key.equals(RE3)) {
				down_RE3(down0(), so03_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			if (i == 4) return up4();
			if (i == 5) return up5();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_ReExpService)MSBCL_ReExpService_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
		}
		/**
		 * ReExp_Sprt06_HdrブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_HdrR createReExp_Sprt06_HdrR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_HdrR.create();
		}

		/**
		 * ReExp_Sprt06_HdrブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_HdrR> createReExp_Sprt06_HdrL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_HdrR.class);
		}

		/**
		 * ReExp_Sprt06_DtlOperブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_DtlOperR createReExp_Sprt06_DtlOperR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_DtlOperR.create();
		}

		/**
		 * ReExp_Sprt06_DtlOperブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_DtlOperR> createReExp_Sprt06_DtlOperL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_DtlOperR.class);
		}

		/**
		 * ReExp_Sprt03_DtlYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR createReExp_Sprt03_DtlYieldR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR.create();
		}

		/**
		 * ReExp_Sprt03_DtlYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> createReExp_Sprt03_DtlYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR.class);
		}

		/**
		 * ReExp_Sprt03_RsltYieldブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR createReExp_Sprt03_RsltYieldR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR.create();
		}

		/**
		 * ReExp_Sprt03_RsltYieldブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> createReExp_Sprt03_RsltYieldL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR.class);
		}

		/**
		 * ReExp_Sprt01_DtlInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR createReExp_Sprt01_DtlInptR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR.create();
		}

		/**
		 * ReExp_Sprt01_DtlInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> createReExp_Sprt01_DtlInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR.class);
		}

		/**
		 * ReExp_Sprt01_RsltInptブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR createReExp_Sprt01_RsltInptR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR.create();
		}

		/**
		 * ReExp_Sprt01_RsltInptブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> createReExp_Sprt01_RsltInptL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR.class);
		}

		/**
		 * ReExp_Sprt01_DtlByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR createReExp_Sprt01_DtlByProdR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR.create();
		}

		/**
		 * ReExp_Sprt01_DtlByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> createReExp_Sprt01_DtlByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR.class);
		}

		/**
		 * ReExp_Sprt01_RsltByProdブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR createReExp_Sprt01_RsltByProdR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR.create();
		}

		/**
		 * ReExp_Sprt01_RsltByProdブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> createReExp_Sprt01_RsltByProdL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR.class);
		}

		/**
		 * ReExp_Sprt02_DtlWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR createReExp_Sprt02_DtlWkR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR.create();
		}

		/**
		 * ReExp_Sprt02_DtlWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> createReExp_Sprt02_DtlWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR.class);
		}

		/**
		 * ReExp_Sprt02_RsltWkブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR createReExp_Sprt02_RsltWkR(){
			return mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR.create();
		}

		/**
		 * ReExp_Sprt02_RsltWkブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> createReExp_Sprt02_RsltWkL(){
			return MCList.create(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR.class);
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
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>mfg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>cur_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_ord_typ</td></tr>
		 * 	<tr><td><br></td><td>mfg_st_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>exp_yield_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_HdrR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>tgt_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_ord_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_ptn</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>st_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>end_schd_tm</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_oper_ratio</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_str_ln_cd_none_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_DtlOperR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> up2() {
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
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>total_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>sum_cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>itm_seq</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>first_gr_dt</td></tr>
		 * 	<tr><td><br></td><td>lot_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> up4() {
			return up4;
		}

		/**
		 * 上り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>mst_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>mst_fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> up5() {
			return up5;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_seq</td></tr>
		 * 	<tr><td><br></td><td>alt_qty</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
		 * 	<tr><td><br></td><td>inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>total_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>std_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fxd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>sum_cont_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno1_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno2_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno3_null_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>sno4_null_flg</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>bom_id</td></tr>
		 * 	<tr><td><br></td><td>itm_seq</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>bom_memo1</td></tr>
		 * 	<tr><td><br></td><td>bom_memo2</td></tr>
		 * 	<tr><td><br></td><td>bom_memo3</td></tr>
		 * 	<tr><td><br></td><td>alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst_typ</td></tr>
		 * 	<tr><td><br></td><td>in_offst</td></tr>
		 * 	<tr><td><br></td><td>lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_upri</td></tr>
		 * 	<tr><td><br></td><td>prov_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>yield_calc_flg</td></tr>
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
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>act_cont_fctr</td></tr>
		 * 	<tr><td><br></td><td>lot_no</td></tr>
		 * 	<tr><td><br></td><td>sublot_no</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>inpt_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>mfg_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>re_exp_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>th_image</td></tr>
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
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>conv_base_qty</td></tr>
		 * 	<tr><td><br></td><td>conv_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_conv_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_loc_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>yield_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>par_inst_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_qty</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_nm</td></tr>
		 * 	<tr><td><br></td><td>strg_str_ln_cd_none_flg</td></tr>
		 * 	<tr><td><br></td><td>re_exp_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>peg_no</td></tr>
		 * 	<tr><td><br></td><td>hdr_peg_no</td></tr>
		 * 	<tr><td><br></td><td>oper_peg_no</td></tr>
		 * 	<tr><td><br></td><td>wk_schd_no</td></tr>
		 * 	<tr><td><br></td><td>mfg_inst_no</td></tr>
		 * 	<tr><td><br></td><td>oper_inst_no</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_cd</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost</td></tr>
		 * 	<tr><td><br></td><td>fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>sum_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>wk_cost_calc_flg</td></tr>
		 * 	<tr><td><br></td><td>mst_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>mst_fxd_wk_cost</td></tr>
		 * 	<tr><td><br></td><td>base_qty</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>disp_seq</td></tr>
		 * 	<tr><td><br></td><td>oper_cd</td></tr>
		 * 	<tr><td><br></td><td>oper_nm</td></tr>
		 * 	<tr><td><br></td><td>oper_seq</td></tr>
		 * 	<tr><td><br></td><td>re_exp_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> down3() {
			return down3;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_ReExpService)MSBCL_ReExpService_MC_A.this).info;
		}

		//-----------------------RE1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループRE1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_RE1(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> src_ReExp_Sprt01_DtlInpt, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> src_ReExp_Sprt01_DtlByProd){
			up_RE1_so01_0(dest0_0, src_ReExp_Sprt01_DtlInpt);
			up_RE1_so01_1(dest0_1, src_ReExp_Sprt01_DtlByProd);
		}
		
		/**
		 * 連携処理RE1_so01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RE1_so01_0() {
			MCRowMapper map = new Map_up_RE1_so01_0();
			return map;
		}

		/**
		 * 連携処理RE1_so01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_RE1_so01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("inpt_schd_no", "inpt_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_grp_seq", "alt_grp_seq");
				addColumnPathMap("alt_qty", "alt_qty");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("inpt_qty", "inpt_qty");
				addColumnPathMap("rqmt_qty", "rqmt_qty");
				addColumnPathMap("fxd_rqmt_qty", "fxd_rqmt_qty");
				addColumnPathMap("total_rqmt_qty", "total_rqmt_qty");
				addColumnPathMap("cont_inpt_qty", "cont_inpt_qty");
				addColumnPathMap("cont_rqmt_qty", "cont_rqmt_qty");
				addColumnPathMap("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty");
				addColumnPathMap("sum_cont_rqmt_qty", "sum_cont_rqmt_qty");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("itm_seq", "itm_seq");
				addColumnPathMap("in_offst_typ", "in_offst_typ");
				addColumnPathMap("in_offst", "in_offst");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("alloc_flg", "alloc_flg");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("act_cont_fctr", "act_cont_fctr");
				addColumnPathMap("first_gr_dt", "first_gr_dt");
				addColumnPathMap("lot_seq", "lot_seq");
			}
		}

		/**
		 * 連携処理RE1_so01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RE1_so01_0(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR r_src) {
		}

		/**
		 * 連携処理RE1_so01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RE1_so01_0(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR> src) {
			MCRowMapper _rm = createMap_up_RE1_so01_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RE1_so01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理RE1_so01の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RE1_so01_1() {
			MCRowMapper map = new Map_up_RE1_so01_1();
			return map;
		}

		/**
		 * 連携処理RE1_so01の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_RE1_so01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
			}
		}

		/**
		 * 連携処理RE1_so01の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RE1_so01_1(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR r_src) {
		}

		/**
		 * 連携処理RE1_so01の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RE1_so01_1(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR> src) {
			MCRowMapper _rm = createMap_up_RE1_so01_1();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_DtlByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RE1_so01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------RE2専用up関連メソッド--------------------------
		/**
		 * オペレーショングループRE2の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_RE2(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> src_ReExp_Sprt02_DtlWk){
			up_RE2_so02_0(dest0_0, src_ReExp_Sprt02_DtlWk);
		}
		
		/**
		 * 連携処理RE2_so02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RE2_so02_0() {
			MCRowMapper map = new Map_up_RE2_so02_0();
			return map;
		}

		/**
		 * 連携処理RE2_so02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_RE2_so02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("mst_wk_cost", "mst_wk_cost");
				addColumnPathMap("mst_fxd_wk_cost", "mst_fxd_wk_cost");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
			}
		}

		/**
		 * 連携処理RE2_so02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RE2_so02_0(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR r_src) {
		}

		/**
		 * 連携処理RE2_so02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RE2_so02_0(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR> src) {
			MCRowMapper _rm = createMap_up_RE2_so02_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_DtlWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RE2_so02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------RE3専用up関連メソッド--------------------------
		/**
		 * オペレーショングループRE3の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_RE3(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR> dest0_0, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR> dest0_1, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> dest0_2, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_HdrR> src_ReExp_Sprt06_Hdr, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_DtlOperR> src_ReExp_Sprt06_DtlOper, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> src_ReExp_Sprt03_DtlYield){
			up_RE3_so03_0(dest0_0, src_ReExp_Sprt06_Hdr);
			up_RE3_so03_1(dest0_1, src_ReExp_Sprt06_DtlOper);
			up_RE3_so03_2(dest0_2, src_ReExp_Sprt03_DtlYield);
		}
		
		/**
		 * 連携処理RE3_so03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RE3_so03_0() {
			MCRowMapper map = new Map_up_RE3_so03_0();
			return map;
		}

		/**
		 * 連携処理RE3_so03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_RE3_so03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("mfg_inst_qty", "mfg_inst_qty");
				addColumnPathMap("yield_schd_qty", "yield_schd_qty");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("strg_str_ln_nm", "strg_str_ln_nm");
				addColumnPathMap("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg");
			}
		}

		/**
		 * 連携処理RE3_so03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RE3_so03_0(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_HdrR r_src) {
		}

		/**
		 * 連携処理RE3_so03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RE3_so03_0(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_HdrR> src) {
			MCRowMapper _rm = createMap_up_RE3_so03_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_HdrR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_HdrR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RE3_so03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理RE3_so03の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RE3_so03_1() {
			MCRowMapper map = new Map_up_RE3_so03_1();
			return map;
		}

		/**
		 * 連携処理RE3_so03の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_RE3_so03_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("oper_inst_qty", "oper_inst_qty");
				addColumnPathMap("end_schd_dt", "end_schd_tm");
				addColumnPathMap("yield_oper_flg", "yield_oper_flg");
				addColumnPathMap("yield_oper_ratio", "yield_oper_ratio");
			}
		}

		/**
		 * 連携処理RE3_so03の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RE3_so03_1(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_DtlOperR r_src) {
		}

		/**
		 * 連携処理RE3_so03の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RE3_so03_1(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_DtlOperR> src) {
			MCRowMapper _rm = createMap_up_RE3_so03_1();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt06_DtlOperR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlOperR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RE3_so03_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理RE3_so03の上りブロック2のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_RE3_so03_2() {
			MCRowMapper map = new Map_up_RE3_so03_2();
			return map;
		}

		/**
		 * 連携処理RE3_so03の上りブロック2のためのRowMapperクラス。<p>
		 */
		public class Map_up_RE3_so03_2 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("yield_schd_dt", "yield_schd_dt");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
			}
		}

		/**
		 * 連携処理RE3_so03の上りブロック2のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_RE3_so03_2(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR r_src) {
		}

		/**
		 * 連携処理RE3_so03の上りブロック2のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_RE3_so03_2(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR> src) {
			MCRowMapper _rm = createMap_up_RE3_so03_2();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_DtlYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_RE3_so03_2(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------RE1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループRE1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_RE1(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> dest_ReExp_Sprt01_RsltInpt, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> dest_ReExp_Sprt01_RsltByProd, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> src0_0, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> src0_1){
			down_RE1_so01_0(dest_ReExp_Sprt01_RsltInpt, src0_0);
			down_RE1_so01_1(dest_ReExp_Sprt01_RsltByProd, src0_1);
		}

		/**
		 * 連携処理RE1_so01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE1_so01_0() {
			MCRowMapper map = new Map_down_RE1_so01_0();
			return map;
		}

		/**
		 * 連携処理RE1_so01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE1_so01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("inpt_schd_no", "inpt_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_grp_nm", "alt_grp_nm");
				addColumnPathMap("alt_grp_seq", "alt_grp_seq");
				addColumnPathMap("alt_qty", "alt_qty");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("th_image", "th_image");
				addColumnPathMap("inpt_qty", "inpt_qty");
				addColumnPathMap("rqmt_qty", "rqmt_qty");
				addColumnPathMap("fxd_rqmt_qty", "fxd_rqmt_qty");
				addColumnPathMap("total_rqmt_qty", "total_rqmt_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_dec_place", "base_dec_place");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("std_cont_fctr", "std_cont_fctr");
				addColumnPathMap("cont_fctr_flg", "cont_fctr_flg");
				addColumnPathMap("cont_fctr_rnd_typ", "cont_fctr_rnd_typ");
				addColumnPathMap("cont_fctr_dec_place", "cont_fctr_dec_place");
				addColumnPathMap("cont_inpt_qty", "cont_inpt_qty");
				addColumnPathMap("cont_rqmt_qty", "cont_rqmt_qty");
				addColumnPathMap("cont_fxd_rqmt_qty", "cont_fxd_rqmt_qty");
				addColumnPathMap("sum_cont_rqmt_qty", "sum_cont_rqmt_qty");
				addColumnPathMap("cont_fctr_unit_cd", "cont_fctr_unit_cd");
				addColumnPathMap("cont_fctr_unit_nm", "cont_fctr_unit_nm");
				addColumnPathMap("inpt_schd_dt", "inpt_schd_dt");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno1_null_flg", "sno1_null_flg");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno2_null_flg", "sno2_null_flg");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno3_null_flg", "sno3_null_flg");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("sno4_null_flg", "sno4_null_flg");
				addColumnPathMap("inpt_loc_cd", "inpt_loc_cd");
				addColumnPathMap("inpt_loc_nm", "inpt_loc_nm");
				addColumnPathMap("inpt_str_ln_tgt_flg", "inpt_str_ln_tgt_flg");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("gd_nm", "gd_nm");
				addColumnPathMap("inst_lot_fix_flg", "inst_lot_fix_flg");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("bom_id", "bom_id");
				addColumnPathMap("itm_seq", "itm_seq");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("bkf_typ_nm", "bkf_typ_nm");
				addColumnPathMap("main_itm_flg", "main_itm_flg");
				addColumnPathMap("bom_memo1", "bom_memo1");
				addColumnPathMap("bom_memo2", "bom_memo2");
				addColumnPathMap("bom_memo3", "bom_memo3");
				addColumnPathMap("alloc_ctl_typ", "alloc_ctl_typ");
				addColumnPathMap("inpt_ctl_typ", "inpt_ctl_typ");
				addColumnPathMap("in_offst_typ", "in_offst_typ");
				addColumnPathMap("in_offst", "in_offst");
				addColumnPathMap("lot_mix_flg", "lot_mix_flg");
				addColumnPathMap("sublot_mix_flg", "sublot_mix_flg");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("prov_typ", "prov_typ");
				addColumnPathMap("prov_upri", "prov_upri");
				addColumnPathMap("prov_cur_cd", "prov_cur_cd");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("alt_itm_ratio", "alt_itm_ratio");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("yield_calc_flg", "yield_calc_flg");
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
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("act_cont_fctr", "act_cont_fctr");
				addColumnPathMap("lot_no", "lot_no");
				addColumnPathMap("sublot_no", "sublot_no");
				addColumnPathMap("inpt_str_ln_cd", "inpt_str_ln_cd");
				addColumnPathMap("inpt_str_ln_nm", "inpt_str_ln_nm");
				addColumnPathMap("inpt_str_ln_cd_none_flg", "inpt_str_ln_cd_none_flg");
				addColumnPathMap("mfg_sts_typ", "mfg_sts_typ");
				addColumnPathMap("re_exp_flg", "re_exp_flg");
			}
		}

		/**
		 * 連携処理RE1_so01の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE1_so01_0(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR r_src) {
		}

		/**
		 * 連携処理RE1_so01の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE1_so01_0(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR> src) {
			MCRowMapper _rm = createMap_down_RE1_so01_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltInptR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE1_so01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		/**
		 * 連携処理RE1_so01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE1_so01_1() {
			MCRowMapper map = new Map_down_RE1_so01_1();
			return map;
		}

		/**
		 * 連携処理RE1_so01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE1_so01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("th_image", "th_image");
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
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_nm", "trd_unit_nm");
				addColumnPathMap("trd_dec_place", "trd_dec_place");
				addColumnPathMap("trd_unit_conv_rnd_typ", "trd_unit_conv_rnd_typ");
				addColumnPathMap("conv_base_qty", "conv_base_qty");
				addColumnPathMap("conv_qty", "conv_qty");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_dec_place", "base_dec_place");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_loc_nm", "strg_loc_nm");
				addColumnPathMap("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg");
				addColumnPathMap("yield_schd_dt", "yield_schd_dt");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("bkf_typ", "bkf_typ");
				addColumnPathMap("par_inst_qty", "par_inst_qty");
				addColumnPathMap("chd_inpt_qty", "chd_inpt_qty");
				addColumnPathMap("chd_rqmt_qty", "chd_rqmt_qty");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("strg_str_ln_nm", "strg_str_ln_nm");
				addColumnPathMap("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg");
				addColumnPathMap("re_exp_flg", "re_exp_flg");
			}
		}

		/**
		 * 連携処理RE1_so01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE1_so01_1(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR r_src) {
		}

		/**
		 * 連携処理RE1_so01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE1_so01_1(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR> src) {
			MCRowMapper _rm = createMap_down_RE1_so01_1();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt01_RsltByProdR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE1_so01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------RE2専用down関連メソッド--------------------------

		/**
		 * オペレーショングループRE2の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_RE2(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> dest_ReExp_Sprt02_RsltWk, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> src0_0){
			down_RE2_so02_0(dest_ReExp_Sprt02_RsltWk, src0_0);
		}

		/**
		 * 連携処理RE2_so02の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE2_so02_0() {
			MCRowMapper map = new Map_down_RE2_so02_0();
			return map;
		}

		/**
		 * 連携処理RE2_so02の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE2_so02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("wk_schd_no", "wk_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
				addColumnPathMap("wk_cost_cd", "wk_cost_cd");
				addColumnPathMap("wk_cost_nm", "wk_cost_nm");
				addColumnPathMap("wk_cost", "wk_cost");
				addColumnPathMap("fxd_wk_cost", "fxd_wk_cost");
				addColumnPathMap("sum_wk_cost", "sum_wk_cost");
				addColumnPathMap("wk_cost_unit_nm", "wk_cost_unit_nm");
				addColumnPathMap("wk_cost_calc_flg", "wk_cost_calc_flg");
				addColumnPathMap("mst_wk_cost", "mst_wk_cost");
				addColumnPathMap("mst_fxd_wk_cost", "mst_fxd_wk_cost");
				addColumnPathMap("base_qty", "base_qty");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("rnd_typ", "rnd_typ");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("oper_cd", "oper_cd");
				addColumnPathMap("oper_nm", "oper_nm");
				addColumnPathMap("oper_seq", "oper_seq");
				addColumnPathMap("re_exp_flg", "re_exp_flg");
			}
		}

		/**
		 * 連携処理RE2_so02の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE2_so02_0(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR r_src) {
		}

		/**
		 * 連携処理RE2_so02の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE2_so02_0(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR> src) {
			MCRowMapper _rm = createMap_down_RE2_so02_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt02_RsltWkR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE2_so02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------RE3専用down関連メソッド--------------------------

		/**
		 * オペレーショングループRE3の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_RE3(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> dest_ReExp_Sprt03_RsltYield, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> src0_0){
			down_RE3_so03_0(dest_ReExp_Sprt03_RsltYield, src0_0);
		}

		/**
		 * 連携処理RE3_so03の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_RE3_so03_0() {
			MCRowMapper map = new Map_down_RE3_so03_0();
			return map;
		}

		/**
		 * 連携処理RE3_so03の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_RE3_so03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("peg_no", "peg_no");
				addColumnPathMap("hdr_peg_no", "hdr_peg_no");
				addColumnPathMap("oper_peg_no", "oper_peg_no");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_nm", "trd_unit_nm");
				addColumnPathMap("trd_dec_place", "trd_dec_place");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_dec_place", "base_dec_place");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("base_unit_conv_rnd_typ", "base_unit_conv_rnd_typ");
				addColumnPathMap("conv_base_qty", "conv_base_qty");
				addColumnPathMap("conv_qty", "conv_qty");
				addColumnPathMap("strg_loc_cd", "strg_loc_cd");
				addColumnPathMap("strg_loc_nm", "strg_loc_nm");
				addColumnPathMap("strg_str_ln_tgt_flg", "strg_str_ln_tgt_flg");
				addColumnPathMap("strg_str_ln_cd", "strg_str_ln_cd");
				addColumnPathMap("strg_str_ln_nm", "strg_str_ln_nm");
				addColumnPathMap("strg_str_ln_cd_none_flg", "strg_str_ln_cd_none_flg");
				addColumnPathMap("yield_schd_dt", "yield_schd_dt");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("disp_seq", "disp_seq");
				addColumnPathMap("yield_schd_no", "yield_schd_no");
				addColumnPathMap("mfg_inst_no", "mfg_inst_no");
				addColumnPathMap("oper_inst_no", "oper_inst_no");
			}
		}

		/**
		 * 連携処理RE3_so03の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_RE3_so03_0(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR r_dest, mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR r_src) {
		}

		/**
		 * 連携処理RE3_so03の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_RE3_so03_0(MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> dest, MCList<mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR> src) {
			MCRowMapper _rm = createMap_down_RE3_so03_0();
			for(mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR r_src : src){
				mcframe.serverMSBC.MSBCL6020.ReExp_Sprt03_RsltYieldR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_RE3_so03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}

	//FMCB LOGIC_CONTROLLER END
}