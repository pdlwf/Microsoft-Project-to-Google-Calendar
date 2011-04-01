// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import java.util.logging.*;
public class AwtGraphicsConfigData extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 160; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	AwtGraphicsConfigData(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	AwtGraphicsConfigData() {
		log.finest("Creating");
		pData = unsafe.allocateMemory(getSize());
		should_free_memory = true;
	}


	public void dispose() {
		log.finest("Disposing");
		if (should_free_memory) {
			log.finest("freeing memory");
			unsafe.freeMemory(pData); 
	}
		}
	public int get_awt_depth() { log.finest("");return (Native.getInt(pData+0)); }
	public void set_awt_depth(int v) { log.finest(""); Native.putInt(pData+0, v); }
	public long get_awt_cmap() { log.finest("");return (Native.getLong(pData+8)); }
	public void set_awt_cmap(long v) { log.finest(""); Native.putLong(pData+8, v); }
	public XVisualInfo get_awt_visInfo() { log.finest("");return new XVisualInfo(pData + 16); }
	public int get_awt_num_colors() { log.finest("");return (Native.getInt(pData+80)); }
	public void set_awt_num_colors(int v) { log.finest(""); Native.putInt(pData+80, v); }
	public awtImageData get_awtImage(int index) { log.finest(""); return (Native.getLong(pData+88) != 0)?(new awtImageData(Native.getLong(pData+88)+index*560)):(null); }
	public long get_awtImage() { log.finest("");return Native.getLong(pData+88); }
	public void set_awtImage(long v) { log.finest(""); Native.putLong(pData + 88, v); }
	public long get_AwtColorMatch(int index) { log.finest(""); return Native.getLong(pData+96)+index*Native.getLongSize(); }
	public long get_AwtColorMatch() { log.finest("");return Native.getLong(pData+96); }
	public void set_AwtColorMatch(long v) { log.finest(""); Native.putLong(pData + 96, v); }
	public long get_monoImage(int index) { log.finest(""); return Native.getLong(pData+104)+index*Native.getLongSize(); }
	public long get_monoImage() { log.finest("");return Native.getLong(pData+104); }
	public void set_monoImage(long v) { log.finest(""); Native.putLong(pData + 104, v); }
	public long get_monoPixmap() { log.finest("");return (Native.getLong(pData+112)); }
	public void set_monoPixmap(long v) { log.finest(""); Native.putLong(pData+112, v); }
	public int get_monoPixmapWidth() { log.finest("");return (Native.getInt(pData+120)); }
	public void set_monoPixmapWidth(int v) { log.finest(""); Native.putInt(pData+120, v); }
	public int get_monoPixmapHeight() { log.finest("");return (Native.getInt(pData+124)); }
	public void set_monoPixmapHeight(int v) { log.finest(""); Native.putInt(pData+124, v); }
	public long get_monoPixmapGC() { log.finest("");return (Native.getLong(pData+128)); }
	public void set_monoPixmapGC(long v) { log.finest(""); Native.putLong(pData+128, v); }
	public int get_pixelStride() { log.finest("");return (Native.getInt(pData+136)); }
	public void set_pixelStride(int v) { log.finest(""); Native.putInt(pData+136, v); }
	public ColorData get_color_data(int index) { log.finest(""); return (Native.getLong(pData+144) != 0)?(new ColorData(Native.getLong(pData+144)+index*88)):(null); }
	public long get_color_data() { log.finest("");return Native.getLong(pData+144); }
	public void set_color_data(long v) { log.finest(""); Native.putLong(pData + 144, v); }
	public long get_glxInfo(int index) { log.finest(""); return Native.getLong(pData+152)+index*Native.getLongSize(); }
	public long get_glxInfo() { log.finest("");return Native.getLong(pData+152); }
	public void set_glxInfo(long v) { log.finest(""); Native.putLong(pData + 152, v); }


	String getName() {
		return "AwtGraphicsConfigData"; 
	}


	String getFieldsAsString() {
		String ret="";

		ret += ""+"awt_depth = " + get_awt_depth() +", ";
		ret += ""+"awt_cmap = " + get_awt_cmap() +", ";
		ret += ""+"awt_visInfo = " + get_awt_visInfo() +", ";
		ret += ""+"awt_num_colors = " + get_awt_num_colors() +", ";
		ret += ""+"awtImage = " + get_awtImage() +", ";
		ret += ""+"AwtColorMatch = " + get_AwtColorMatch() +", ";
		ret += ""+"monoImage = " + get_monoImage() +", ";
		ret += ""+"monoPixmap = " + get_monoPixmap() +", ";
		ret += ""+"monoPixmapWidth = " + get_monoPixmapWidth() +", ";
		ret += ""+"monoPixmapHeight = " + get_monoPixmapHeight() +", ";
		ret += ""+"monoPixmapGC = " + get_monoPixmapGC() +", ";
		ret += ""+"pixelStride = " + get_pixelStride() +", ";
		ret += ""+"color_data = " + get_color_data() +", ";
		ret += ""+"glxInfo = " + get_glxInfo() +", ";
		return ret;
	}


}



